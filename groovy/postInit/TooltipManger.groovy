import com.cleanroommc.groovyscript.api.IIngredient
import gregtech.api.unification.stack.ItemAndMetadata
import net.minecraftforge.event.entity.player.ItemTooltipEvent

def storage = [:]

IIngredient.metaClass.addTooltip << { String line ->
    delegate.matchingStacks.each { stack ->
        storage[new ItemAndMetadata(stack)] = line
    }
}

eventManager.listen(EventPriority.LOW) {
    ItemTooltipEvent event ->
        {
            line = storage[new ItemAndMetadata(event.itemStack)]
            !line ?: event.toolTip << line
        }
}