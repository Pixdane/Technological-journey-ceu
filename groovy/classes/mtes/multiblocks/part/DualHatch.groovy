import codechicken.lib.raytracer.CuboidRayTraceResult
import codechicken.lib.render.CCRenderState
import codechicken.lib.render.pipeline.IVertexOperation
import codechicken.lib.vec.Matrix4
import com.cleanroommc.modularui.api.drawable.IKey
import com.cleanroommc.modularui.api.widget.IWidget
import com.cleanroommc.modularui.factory.PosGuiData
import com.cleanroommc.modularui.network.NetworkUtils
import com.cleanroommc.modularui.screen.ModularPanel
import com.cleanroommc.modularui.value.BoolValue
import com.cleanroommc.modularui.value.sync.BooleanSyncValue
import com.cleanroommc.modularui.value.sync.PanelSyncManager
import com.cleanroommc.modularui.value.sync.SyncHandlers
import com.cleanroommc.modularui.widget.Widget
import com.cleanroommc.modularui.widgets.ItemSlot
import com.cleanroommc.modularui.widgets.SlotGroupWidget
import com.cleanroommc.modularui.widgets.ToggleButton
import com.cleanroommc.modularui.widgets.layout.Flow
import com.cleanroommc.modularui.widgets.layout.Grid
import gregtech.api.GTValues
import gregtech.api.capability.*
import gregtech.api.capability.GregtechDataCodes
import gregtech.api.capability.GregtechTileCapabilities
import gregtech.api.capability.IControllable
import gregtech.api.capability.impl.*
import gregtech.api.items.itemhandlers.GTItemStackHandler
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.AbilityInstances
import gregtech.api.metatileentity.multiblock.IMultiblockAbilityPart
import gregtech.api.metatileentity.multiblock.MultiblockAbility
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase
import gregtech.api.mui.GTGuiTextures
import gregtech.api.mui.GTGuis
import gregtech.api.mui.widget.GhostCircuitSlotWidget
import gregtech.api.util.GTHashMaps
import gregtech.client.renderer.texture.Textures
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer
import gregtech.common.metatileentities.multi.multiblockpart.MetaTileEntityMultiblockNotifiablePart
import it.unimi.dsi.fastutil.objects.Object2IntMap
import net.minecraft.client.resources.I18n
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NBTTagCompound
import net.minecraft.network.PacketBuffer
import net.minecraft.util.EnumFacing
import net.minecraft.util.EnumHand
import net.minecraft.util.ResourceLocation
import net.minecraft.util.text.TextComponentTranslation
import net.minecraft.world.World
import net.minecraftforge.common.capabilities.Capability
import net.minecraftforge.fluids.FluidTank
import net.minecraftforge.items.IItemHandler
import net.minecraftforge.items.IItemHandlerModifiable
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable

class DualHatch extends MetaTileEntityMultiblockNotifiablePart
                                           implements IMultiblockAbilityPart<Object>, IControllable, IGhostSlotConfigurable {

    private static final int BASE_TANK_SIZE = 8000

    private final int numSlots
    private final int tankSize

    @Nullable
    protected GhostCircuitItemStackHandler circuitInventory
    private IItemHandlerModifiable actualImportItems


    // only holding this for convenience
    private final FluidTankList fluidTankList
    private boolean workingEnabled
    private boolean autoCollapse


    DualHatch(ResourceLocation metaTileEntityId, int tier, int numSlots,
              boolean isExportHatch) {
        super(metaTileEntityId, tier, isExportHatch)
        this.workingEnabled = true
        this.numSlots = numSlots
        this.tankSize = BASE_TANK_SIZE * (1 << tier) / (numSlots == 4 ? 4 : 8)
        FluidTank[] fluidsHandlers = new FluidTank[numSlots]
        for (int i = 0; i < fluidsHandlers.length; i++) {
            fluidsHandlers[i] = new NotifiableFluidTank(tankSize, this, isExportHatch)
        }
        this.fluidTankList = new FluidTankList(false, fluidsHandlers)
        initializeInventory()
    }


    @Override
    protected void initializeInventory() {
        this.importItems = createImportItemHandler()
        this.exportItems = createExportItemHandler()
        this.itemInventory = new ItemHandlerProxy(importItems, exportItems)
        if (this.hasGhostCircuitInventory()) {
            this.circuitInventory = new GhostCircuitItemStackHandler(this)
            this.circuitInventory.addNotifiableMetaTileEntity(this)
            this.actualImportItems = new ItemHandlerList(Arrays.asList(super.getImportItems(), this.circuitInventory))
        } else {
            this.actualImportItems = null
        }
        if (this.fluidTankList != null) {
            this.importFluids = createImportFluidHandler()
            this.exportFluids = createExportFluidHandler()
            this.fluidInventory = new FluidHandlerProxy(importFluids, exportFluids)
        }
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity metaTileEntityHolder) {
        return new DualHatch(metaTileEntityId, this.getTier(), numSlots, this.isExportHatch)
    }

    @Override
    IItemHandlerModifiable getImportItems() {
        return this.actualImportItems == null ? super.getImportItems() : this.actualImportItems
    }

    @Override
    void addToMultiBlock(MultiblockControllerBase controllerBase) {
        super.addToMultiBlock(controllerBase)
        if (hasGhostCircuitInventory() && this.actualImportItems instanceof ItemHandlerList) {
            for (IItemHandler handler in ((ItemHandlerList) this.actualImportItems).getBackingHandlers()) {
                if (handler instanceof INotifiableHandler) {
                    INotifiableHandler notifiable = (INotifiableHandler) handler
                    notifiable.addNotifiableMetaTileEntity(controllerBase)
                    notifiable.addToNotifiedList(this, handler, isExportHatch)
                }
            }
        }
    }

    @Override
    void removeFromMultiBlock(MultiblockControllerBase controllerBase) {
        super.removeFromMultiBlock(controllerBase)
        if (hasGhostCircuitInventory() && this.actualImportItems instanceof ItemHandlerList) {
            for (IItemHandler handler in ((ItemHandlerList) this.actualImportItems).getBackingHandlers()) {
                if (handler instanceof INotifiableHandler) {
                    INotifiableHandler notifiable = (INotifiableHandler) handler
                    notifiable.removeNotifiableMetaTileEntity(controllerBase)
                }
            }
        }
    }

    @Override
    void update() {
        super.update()
        if (!getWorld().isRemote) {
            if (getOffsetTimer() % 5 == 0) {
                if (workingEnabled) {
                    if (isExportHatch) {
                        pushItemsIntoNearbyHandlers(getFrontFacing())
                    } else {
                        pullItemsFromNearbyHandlers(getFrontFacing())
                    }
                }
            }
            if (workingEnabled) {
                if (isExportHatch) {
                    pushFluidsIntoNearbyHandlers(getFrontFacing())
                } else {
                    pullFluidsFromNearbyHandlers(getFrontFacing())
                }
            }
            // Only attempt to auto collapse the inventory contents once the bus has been notified
            if (isAutoCollapse()) {
                // Exclude the ghost circuit inventory from the auto collapse, so it does not extract any ghost circuits
                // from the slot
                IItemHandlerModifiable inventory = (isExportHatch ? this.getExportItems() : super.getImportItems())
                if (!isAttachedToMultiBlock() || (isExportHatch ? this.getNotifiedItemOutputList().contains(inventory) :
                        this.getNotifiedItemInputList().contains(inventory))) {
                    collapseInventorySlotContents(inventory)
                }
            }
        }
    }

    @Override
    void setWorkingEnabled(boolean workingEnabled) {
        this.workingEnabled = workingEnabled
        World world = getWorld()
        if (world != null && !world.isRemote) {
            writeCustomData(GregtechDataCodes.WORKING_ENABLED, { buf -> buf.writeBoolean(workingEnabled) })
        }
    }

    @Override
    boolean isWorkingEnabled() {
        return workingEnabled
    }

    @Override
    <T> T getCapability(Capability<T> capability, EnumFacing side) {
        if (capability == GregtechTileCapabilities.CAPABILITY_CONTROLLABLE) {
            return GregtechTileCapabilities.CAPABILITY_CONTROLLABLE.cast(this)
        }
        return super.getCapability(capability, side)
    }

    @Override
    void writeInitialSyncData(PacketBuffer buf) {
        super.writeInitialSyncData(buf)
        buf.writeBoolean(workingEnabled)
        for (var tank in fluidTankList.getFluidTanks()) {
            NetworkUtils.writeFluidStack(buf, tank.getFluid())
        }
        buf.writeBoolean(autoCollapse)
    }

    @Override
    void receiveInitialSyncData(PacketBuffer buf) {
        super.receiveInitialSyncData(buf)
        this.workingEnabled = buf.readBoolean()
        for (var tank in fluidTankList.getFluidTanks()) {
            var fluid = NetworkUtils.readFluidStack(buf)
            tank.fill(fluid, true)
        }
        this.autoCollapse = buf.readBoolean()
    }

    @Override
    void receiveCustomData(int dataId, PacketBuffer buf) {
        super.receiveCustomData(dataId, buf)
        if (dataId == GregtechDataCodes.TOGGLE_COLLAPSE_ITEMS) {
            this.autoCollapse = buf.readBoolean()
        } else if (dataId == GregtechDataCodes.WORKING_ENABLED) {
            this.workingEnabled = buf.readBoolean()
        }
    }

    @Override
    NBTTagCompound writeToNBT(NBTTagCompound data) {
        super.writeToNBT(data)
        data.setBoolean("workingEnabled", workingEnabled)
        data.setBoolean("autoCollapse", autoCollapse)
        if (this.circuitInventory != null && !this.isExportHatch) {
            this.circuitInventory.write(data)
        }
        return data
    }

    @Override
    void readFromNBT(NBTTagCompound data) {
        super.readFromNBT(data)
        if (data.hasKey("workingEnabled")) {
            this.workingEnabled = data.getBoolean("workingEnabled")
        }
        if (data.hasKey("autoCollapse")) {
            this.autoCollapse = data.getBoolean("autoCollapse")
        }
        if (this.circuitInventory != null && !this.isExportHatch) {
            this.circuitInventory.read(data)
        }
    }

    @Override
    void renderMetaTileEntity(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        super.renderMetaTileEntity(renderState, translation, pipeline)
        if (shouldRenderOverlay()) {
            SimpleOverlayRenderer renderer = numSlots == 4 ? Textures.PIPE_4X_OVERLAY : Textures.PIPE_9X_OVERLAY
            renderer.renderSided(getFrontFacing(), renderState, translation, pipeline)
        }
    }

    @Override
    void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
        tooltip.add(I18n.format(isExportHatch ? "gregtech.machine.fluid_hatch.export.tooltip" :
                "gregtech.machine.fluid_hatch.import.tooltip"))
        tooltip.add(I18n.format("gregtech.universal.tooltip.fluid_storage_capacity_mult", numSlots, tankSize))
        tooltip.add(I18n.format("gregtech.universal.enabled"))
    }

    @Override
    void addToolUsages(ItemStack stack, @Nullable World world, List<String> tooltip, boolean advanced) {
        tooltip.add(I18n.format("gregtech.tool_action.screwdriver.access_covers"))
        tooltip.add(I18n.format("gregtech.tool_action.wrench.set_facing"))
        super.addToolUsages(stack, world, tooltip, advanced)
    }

    @Override
    protected FluidTankList createImportFluidHandler() {
        return isExportHatch ? new FluidTankList(false) : fluidTankList
    }

    @Override
    protected FluidTankList createExportFluidHandler() {
        return isExportHatch ? fluidTankList : new FluidTankList(false)
    }

    private int getInventorySize() {
        int sizeRoot = 1 + Math.min(GTValues.UHV, getTier())
        return sizeRoot * sizeRoot
    }

    @Override
    protected IItemHandlerModifiable createExportItemHandler() {
        return isExportHatch ? new NotifiableItemStackHandler(this, getInventorySize(), getController(), true) :
                new GTItemStackHandler(this, 0)
    }

    @Override
    protected IItemHandlerModifiable createImportItemHandler() {
        return isExportHatch ? new GTItemStackHandler(this, 0) :
                new NotifiableItemStackHandler(this, getInventorySize(), getController(), false)
    }

    @Override
    List<MultiblockAbility> getAbilities() {
        return [
            (isExportHatch ? MultiblockAbility.EXPORT_ITEMS : MultiblockAbility.IMPORT_ITEMS),
            (isExportHatch ? MultiblockAbility.EXPORT_FLUIDS : MultiblockAbility.IMPORT_FLUIDS)
        ]
    }

    @Override
    void registerAbilities(@NotNull AbilityInstances abilityInstances) {
        if (this.hasGhostCircuitInventory() && this.actualImportItems != null) {
            abilityInstances.add(isExportHatch ? this.exportItems : this.actualImportItems)
        } else {
            abilityInstances.add(isExportHatch ? this.exportItems : this.importItems)
        }
        abilityInstances.addAll(fluidTankList.getFluidTanks())
    }

    @Override
    boolean usesMui2() {
        return true
    }

    @Override
    boolean hasGhostCircuitInventory() {
        return !this.isExportHatch
    }

    private static void collapseInventorySlotContents(IItemHandlerModifiable inventory) {
        // Gather a snapshot of the provided inventory
        Object2IntMap<ItemStack> inventoryContents = GTHashMaps.fromItemHandler(inventory, true)

        List<ItemStack> inventoryItemContents = new ArrayList<>()

        // Populate the list of item stacks in the inventory with apportioned item stacks, for easy replacement
        for (Object2IntMap.Entry<ItemStack> e in inventoryContents.object2IntEntrySet()) {
            ItemStack stack = e.getKey()
            int count = e.getIntValue()
            int maxStackSize = stack.getMaxStackSize()
            while (count >= maxStackSize) {
                ItemStack copy = stack.copy()
                copy.setCount(maxStackSize)
                inventoryItemContents.add(copy)
                count -= maxStackSize
            }
            if (count > 0) {
                ItemStack copy = stack.copy()
                copy.setCount(count)
                inventoryItemContents.add(copy)
            }
        }

        for (int i = 0; i < inventory.getSlots(); i++) {
            ItemStack stackToMove
            // Ensure that we are not exceeding the List size when attempting to populate items
            if (i >= inventoryItemContents.size()) {
                stackToMove = ItemStack.EMPTY
            } else {
                stackToMove = inventoryItemContents.get(i)
            }

            // Populate the slots
            inventory.setStackInSlot(i, stackToMove)
        }
    }

    @Override
    boolean onScrewdriverClick(EntityPlayer playerIn, EnumHand hand, EnumFacing facing,
                               CuboidRayTraceResult hitResult) {
        setAutoCollapse(!this.autoCollapse)

        if (!getWorld().isRemote) {
            if (this.autoCollapse) {
                playerIn.sendStatusMessage(new TextComponentTranslation("gregtech.bus.collapse_true"), true)
            } else {
                playerIn.sendStatusMessage(new TextComponentTranslation("gregtech.bus.collapse_false"), true)
            }
        }
        return true
    }

    boolean isAutoCollapse() {
        return autoCollapse
    }

    void setAutoCollapse(boolean inverted) {
        autoCollapse = inverted
        if (!getWorld().isRemote) {
            if (autoCollapse) {
                if (isExportHatch) {
                    addNotifiedOutput(this.getExportItems())
                } else {
                    addNotifiedInput(super.getImportItems())
                }
            }
            writeCustomData(GregtechDataCodes.TOGGLE_COLLAPSE_ITEMS,
                    { packetBuffer -> packetBuffer.writeBoolean(autoCollapse) })
            notifyBlockUpdate()
            markDirty()
        }
    }

    @Override
    void setGhostCircuitConfig(int config) {
        if (this.circuitInventory == null || this.circuitInventory.getCircuitValue() == config) {
            return
        }
        this.circuitInventory.setCircuitValue(config)
        if (!getWorld().isRemote) {
            markDirty()
        }
    }

    // @Override
    // public ModularPanel buildUI(PosGuiData guiData, PanelSyncManager guiSyncManager) {
    //     int rowSize = (int) Math.sqrt(numSlots);

    //     List<GTFluidSlot> fluidSlots = new ArrayList<>();
    //     for (int i = 0; i < numSlots; i++) {
    //         fluidSlots.add(new GTFluidSlot());
    //     }

    //     return GTGuis.createPanel(this, 176, 18 + 18 * rowSize + 94)
    //             .child(IKey.lang(getMetaFullName()).asWidget().pos(5, 5))
    //             .child(new Grid()
    //                     .margin(0)
    //                     .leftRel(0.5f)
    //                     .top(17)
    //                     .mapTo(rowSize, fluidSlots, {
    //                             i, slot -> slot.syncHandler(GTFluidSlot.sync(fluidTankList.getTankAt(i))
    //                                 .accessibility(true, !isExportHatch))
    //                     })
    //                     .coverChildren())
    //             .bindPlayerInventory();
    // }

    @Override
    ModularPanel buildUI(PosGuiData guiData, PanelSyncManager guiSyncManager) {
        int rowSize = (int) Math.sqrt(getInventorySize())
        guiSyncManager.registerSlotGroup("item_inv", rowSize)

        int backgroundWidth = Math.max(
                9 * 18 + 18 + 14 + 5,   // Player Inv width
                rowSize * 18 + 14) // Bus Inv width
        int backgroundHeight = 18 + 18 * rowSize + 94

        List<List<IWidget>> widgets = new ArrayList<>()
        for (int i = 0; i < rowSize; i++) {
            widgets.add(new ArrayList<>())
            for (int j = 0; j < rowSize; j++) {
                int index = i * rowSize + j
                IItemHandlerModifiable handler = isExportHatch ? exportItems : importItems
                widgets.get(i)
                        .add(new ItemSlot()
                                .slot(SyncHandlers.itemSlot(handler, index)
                                        .slotGroup("item_inv")
                                        .changeListener({newItem, onlyAmountChanged, client, init -> {
                                            if (onlyAmountChanged &&
                                                    handler instanceof GTItemStackHandler) {
                                                GTItemStackHandler gtHandler = (GTItemStackHandler) handler
                                                gtHandler.onContentsChanged(index)
                                            }
                                        }})
                                        .accessibility(!isExportHatch, true)))
            }
        }

        BooleanSyncValue workingStateValue = new BooleanSyncValue(() -> workingEnabled, val -> workingEnabled = val)
        guiSyncManager.syncValue("working_state", workingStateValue)
        BooleanSyncValue collapseStateValue = new BooleanSyncValue(() -> autoCollapse, val -> autoCollapse = val)
        guiSyncManager.syncValue("collapse_state", collapseStateValue)

        boolean hasGhostCircuit = hasGhostCircuitInventory() && this.circuitInventory != null

        return GTGuis.createPanel(this, backgroundWidth, backgroundHeight)
                .child(IKey.lang(getMetaFullName()).asWidget().pos(5, 5))
                .child(SlotGroupWidget.playerInventory().left(7).bottom(7))
                .child(new Grid()
                        .top(18).height(rowSize * 18)
                        .minElementMargin(0, 0)
                        .minColWidth(18).minRowHeight(18)
                        .alignX(0.5f)
                        .matrix(widgets))
                .child(Flow.column()
                        .pos(backgroundWidth - 7 - 18, backgroundHeight - 18 * 4 - 7 - 5)
                        .width(18).height(18 * 4 + 5)
                        .child(GTGuiTextures.getLogo(getUITheme()).asWidget().size(17).top(18 * 3 + 5))
                        .child(new ToggleButton()
                                .top(18 * 2)
                                .value(new BoolValue.Dynamic(workingStateValue::getBoolValue,
                                        workingStateValue::setBoolValue))
                                .overlay(GTGuiTextures.BUTTON_ITEM_OUTPUT)
                                .tooltipBuilder({t -> t.setAutoUpdate(true)
                                        .addLine(isExportHatch ?
                                                (workingStateValue.getBoolValue() ?
                                                        IKey.lang("gregtech.gui.item_auto_output.tooltip.enabled") :
                                                        IKey.lang("gregtech.gui.item_auto_output.tooltip.disabled")) :
                                                (workingStateValue.getBoolValue() ?
                                                        IKey.lang("gregtech.gui.item_auto_input.tooltip.enabled") :
                                                        IKey.lang("gregtech.gui.item_auto_input.tooltip.disabled")))}))
                        .child(new ToggleButton()
                                .top(18)
                                .value(new BoolValue.Dynamic(collapseStateValue::getBoolValue,
                                        collapseStateValue::setBoolValue))
                                .overlay(GTGuiTextures.BUTTON_AUTO_COLLAPSE)
                                .tooltipBuilder({t -> t.setAutoUpdate(true)
                                        .addLine(collapseStateValue.getBoolValue() ?
                                                IKey.lang("gregtech.gui.item_auto_collapse.tooltip.enabled") :
                                                IKey.lang("gregtech.gui.item_auto_collapse.tooltip.disabled"))}))
                        .childIf(hasGhostCircuit, new GhostCircuitSlotWidget()
                                .slot(SyncHandlers.itemSlot(circuitInventory, 0))
                                .background(GTGuiTextures.SLOT, GTGuiTextures.INT_CIRCUIT_OVERLAY))
                        .childIf(!hasGhostCircuit, new Widget<>()
                                .background(GTGuiTextures.SLOT, GTGuiTextures.BUTTON_X)
                                .tooltip({t -> t.addLine(
                                        IKey.lang("gregtech.gui.configurator_slot.unavailable.tooltip"))
                                })))
    }
}
