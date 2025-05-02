// side: client
package preInit

import classes.utils.ModelRegister
import net.minecraftforge.client.event.ModelRegistryEvent

// Register VariantItemBlock models
eventManager.listen(EventPriority.LOWEST) {
    ModelRegistryEvent event ->
        {
            ModelRegister.registerItemModels()
        }
}
