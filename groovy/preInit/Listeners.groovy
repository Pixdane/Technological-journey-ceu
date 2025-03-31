import classes.blocks.TJMetaBlocks
import classes.items.TJMetaItems
import gregtech.api.GregTechAPI
import gregtech.api.unification.material.event.MaterialEvent
import gregtech.api.unification.material.event.MaterialRegistryEvent
import gregtech.api.unification.material.event.PostMaterialEvent
import materials.MaterialModifications
import materials.TJMaterials
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.eventhandler.EventPriority

// Create our own material registry
eventManager.listen(EventPriority.LOWEST) {
    MaterialRegistryEvent event ->
        {
            GregTechAPI.materialManager.createRegistry("tjceu") // TODO: make this cached somewhere...?
        }
}

// Register materials
eventManager.listen(EventPriority.LOWEST) {
    MaterialEvent event ->
        {
            TJMaterials.register()
        }
}

// Modify existing materials
eventManager.listen(EventPriority.LOWEST) {
    PostMaterialEvent event ->
        {
            MaterialModifications.init()
        }
}

// Register metaitems
eventManager.listen(EventPriority.LOWEST) {
    RegistryEvent.Register<Item> event ->
        {
            TJMetaItems.registerItems()
            TJMetaItems.registerBehaviors()
        }
}

// Register blocks
// eventManager.listen(EventPriority.LOWEST) {
//     RegistryEvent.Register<Block> event ->
//         {
TJMetaBlocks.init()
TJMetaBlocks.registerBlocks()
//         }
// }
