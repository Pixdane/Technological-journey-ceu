// side: client

import com.cleanroommc.groovyscript.api.IIngredient
import gregtech.api.unification.stack.ItemAndMetadata
import gregtech.api.util.FluidTooltipUtil
import net.minecraft.client.resources.I18n
import net.minecraftforge.event.entity.player.ItemTooltipEvent
import net.minecraftforge.fluids.FluidStack

def storage = [:]

IIngredient.metaClass.addTooltip << { String line ->
    if (delegate in FluidStack) { // Non-reloadable
        f = delegate.getFluid()
        FluidTooltipUtil.getFluidTooltip(f) ?: FluidTooltipUtil.registerTooltip(f, { -> [I18n.format(line)] })
    } else {
        delegate.matchingStacks.each { stack ->
            storage[new ItemAndMetadata(stack)] = line
        }
    }
}

eventManager.listen(EventPriority.HIGH) {
    ItemTooltipEvent event ->
        {
            line = storage[new ItemAndMetadata(event.itemStack)]
            !line ?: event.toolTip << I18n.format(line)
        }
}

// Actually Additions
item('actuallyadditions:item_misc', 5).addTooltip('tjceu.tooltip.black_quartz')
item('actuallyadditions:item_dust', 7).addTooltip('tjceu.tooltip.black_quartz_dust')

// AstralSorcery
fluid('astralsorcery.liquidstarlight').addTooltip('§eSx')
(item('astraladditions:block_starmetal') |
        item('astralsorcery:itemcraftingcomponent', 1) |
        item('astralsorcery:itemcraftingcomponent', 2) |
        item('astralsorcery:blockcustomore', 1)).addTooltip('§eAxSx')
item('astralsorcery:blockcustomsandore').addTooltip('§eBe₃Al₃Si₆O₁₈')

// Advanced Rocketry
item('advancedrocketry:charcoallog').addTooltip('tjceu.tooltip.charcoal_log')
metaitem('blockTungstenCarbide').addTooltip('tjceu.tooltip.tungsten_carbide_block')
metaitem('blockSalt').addTooltip('tjceu.tooltip.salt_block')
metaitem('blockPlatinum').addTooltip('tjceu.tooltip.platinum_block')
metaitem('blockCalifornium').addTooltip('tjceu.tooltip.californium_block')
metaitem('gcyl:blockAdamantium').addTooltip('tjceu.tooltip.adamantium_block')

// Draconic Evolution
item('draconicevolution:celestial_manipulator').addTooltip('tjceu.tooltip.celestial_manipulator')
item('draconicevolution:draconium_block', 1).addTooltip('tjceu.tooltip.charged_draconium_block')
