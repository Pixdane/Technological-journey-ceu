// side: client
package postInit

import com.cleanroommc.groovyscript.api.IIngredient
import gregtech.api.unification.OreDictUnifier
import gregtech.api.unification.stack.ItemAndMetadata
import net.minecraft.client.resources.I18n
import net.minecraft.util.text.TextFormatting
import net.minecraftforge.event.entity.player.ItemTooltipEvent
import net.minecraftforge.fml.common.eventhandler.EventPriority

def storage = [:]

def add = {IIngredient ing, String raw ->
    ing.matchingStacks.each { stack -> 
        storage[new ItemAndMetadata(stack)] = raw
    }
}

def addUnification = { IIngredient ing ->
    ing.matchingStacks.each { stack -> 
        def formula = OreDictUnifier.getUnificationEntry(stack)?.material?.chemicalFormula
        if (formula) storage[new ItemAndMetadata(stack)] = "${TextFormatting.YELLOW}${formula}".toString()
    }
}

eventManager.listen(EventPriority.HIGH) {
    ItemTooltipEvent event ->
        {
            def line = storage[new ItemAndMetadata(event.itemStack)]
            !line ?: event.toolTip << I18n.format(line)
        }
}

// Actually Additions
add item('actuallyadditions:item_misc', 5), 'tjceu.tooltip.black_quartz'
add item('actuallyadditions:item_dust', 7), 'tjceu.tooltip.black_quartz_dust'

// AstralSorcery
addUnification item('astraladditions:block_starmetal')
addUnification item('astralsorcery:blockcustomore', 1)
addUnification item('astralsorcery:blockcustomsandore')

// Advanced Rocketry
add item('advancedrocketry:charcoallog'), 'tjceu.tooltip.charcoal_log'
add metaitem('blockTungstenCarbide'), 'tjceu.tooltip.tungsten_carbide_block'
add metaitem('blockSalt'), 'tjceu.tooltip.salt_block'
add metaitem('blockPlatinum'), 'tjceu.tooltip.platinum_block'
add metaitem('blockCalifornium'), 'tjceu.tooltip.californium_block'
add metaitem('gcyl:blockAdamantium'), 'tjceu.tooltip.adamantium_block'

// Draconic Evolution
add item('draconicevolution:celestial_manipulator'), 'tjceu.tooltip.celestial_manipulator'
add item('draconicevolution:draconium_block', 1), 'tjceu.tooltip.charged_draconium_block'
