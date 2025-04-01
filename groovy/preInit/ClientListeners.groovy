// side: client

import classes.textures.TJTextures
import classes.utils.ModelRegister
import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.client.event.TextureStitchEvent

// Register ICubeRenderers
// eventManager.listen(EventPriority.LOWEST) {
//     TextureStitchEvent.Pre event ->
//         {
//              TJTextures.init()
//         }
// }

// Register VariantItemBlock models
eventManager.listen(EventPriority.LOWEST) {
    ModelRegistryEvent event ->
        {
            ModelRegister.registerItemModels()
        }
}
