// side: client


import com.cleanroommc.groovyscript.api.IIngredient
import gregtech.api.unification.OreDictUnifier
import gregtech.api.unification.stack.ItemAndMetadata
import net.minecraft.client.resources.I18n
import net.minecraft.util.text.TextFormatting
import net.minecraftforge.event.entity.player.ItemTooltipEvent

def storage = [:]

IIngredient.metaClass.addTooltip << { String line ->
    delegate.matchingStacks.each { stack ->
        storage[new ItemAndMetadata(stack)] = line
    }
}

IIngredient.metaClass.addUnificationTooltip << { ->
    delegate.matchingStacks.each { stack ->
        formula = OreDictUnifier.getUnificationEntry(stack)?.material?.chemicalFormula
        if (formula) storage[new ItemAndMetadata(stack)] = "${TextFormatting.YELLOW}${formula}".toString()
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
item('astraladditions:block_starmetal').addUnificationTooltip()
item('astralsorcery:blockcustomore', 1).addUnificationTooltip()
item('astralsorcery:blockcustomsandore').addUnificationTooltip()

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
