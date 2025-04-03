import classes.recipes.TJRecipeMaps
import classes.textures.TJTextures
import gregtech.api.capability.impl.MultiblockRecipeLogic
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.client.renderer.ICubeRenderer
import gregtech.client.utils.TooltipHelper
import net.minecraft.client.resources.I18n

class LargeVialProcessor extends RecipeMapMultiblockController {

    LargeVialProcessor(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, TJRecipeMaps.ADV_VIAL_PROCESSING)
        this.recipeMapWorkable = new MultiblockRecipeLogic(this, true)
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        new LargeVialProcessor(metaTileEntityId)
    }

    @Override
    ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        TJTextures.SOUL_INSULATION_CASING
    }

    @Override
    void addInformation(ItemStack stack, World world, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, world, tooltip, advanced);
        tooltip.add("${TooltipHelper.RAINBOW_SLOW}${I18n.format('gregtech.machine.perfect_oc', new Object[0])}".toString())
    }

    @Override
    protected BlockPattern createStructurePattern() {
        FactoryBlockPattern.start()
                .aisle('CCCCC', 'F   F', 'F   F', 'F   F', 'CCCCC')
                .aisle('CTTTC', ' XGX ', ' XGX ', ' XGX ', 'CTTTC')
                .aisle('CTETC', ' GEG ', ' GEG ', ' GEG ', 'CTETC')
                .aisle('CTTTC', ' XGX ', ' XGX ', ' XGX ', 'CTTTC')
                .aisle('CCSCC', 'F   F', 'F   F', 'F   F', 'CCCCC')
                .where('S', selfPredicate())
                .where('C', states(blockstate('tjceu:multiblock_casing', 'variant=soul_insulation')).setMinGlobalLimited(22).or(autoAbilities()))
                .where('T', states(blockstate('gregtech:boiler_casing', 'variant=tungstensteel_pipe')))
                .where('E', states(blockstate('enderio:block_alloy', 'variant=end_steel')))
                .where('G', states(blockstate('gregtech:multiblock_casing', 'active=false', 'variant=grate')))
                .where('X', states(blockstate('gregtech:turbine_casing', 'variant=tungstensteel_gearbox')))
//                .where('F', frames(material('protactinium')))    TODO: Protactinium frame
                .where('F', frames(material('tjceu:soularium')))
                .where(' ', this.any())
                .build()
    }

}
