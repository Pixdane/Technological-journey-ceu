import classes.textures.TJTextures
import classes.recipes.TJRecipeMaps
import gregtech.api.capability.impl.MultiblockRecipeLogic
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.client.renderer.ICubeRenderer
import gregtech.client.renderer.texture.Textures

class DragonEggReplicator extends RecipeMapMultiblockController {
    DragonEggReplicator(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, TJRecipeMaps.DRAGON_EGG_REPLICATION)
        this.recipeMapWorkable = new MultiblockRecipeLogic(this)
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        new DragonEggReplicator(metaTileEntityId)
    }

    @Override
    ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        TJTextures.AWAKENED_DRACONIUM_CASING
    }

    @Override
    protected BlockPattern createStructurePattern() {
        FactoryBlockPattern.start()
                .aisle('CCC', 'CCC', 'CCC')
                .aisle('CCC', 'C C', 'CCC')
                .aisle('CCC', 'CSC', 'CCC')
                .where('S', selfPredicate())
                .where('C', states(blockstate('tjceu:multiblock_casing', 'variant=awakened_draconium')).setMinGlobalLimited(15).or(autoAbilities())) // TODO: Awakened casing
                .where(' ', air())
                .build()
    }
}
