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
        return new DragonEggReplicator(metaTileEntityId)
    }

    @Override
    ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return Textures.STABLE_TITANIUM_CASING // TODO: Awakened casing
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle('CCC', 'CCC', 'CCC')
                .aisle('CCC', 'C C', 'CCC')
                .aisle('CCC', 'CSC', 'CCC')
                .where('S' as char, selfPredicate())
                .where('C' as char, states(blockstate('gregtech:metal_casing', 'variant=titanium_stable')).setMinGlobalLimited(15).or(autoAbilities())) // TODO: Awakened casing
                .where(' ' as char, air())
                .build()
    }
}
