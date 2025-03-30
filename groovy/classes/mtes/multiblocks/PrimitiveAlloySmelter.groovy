import gregtech.api.capability.impl.SteamMultiWorkable
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapSteamMultiblockController
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.api.recipes.RecipeMaps
import gregtech.client.renderer.ICubeRenderer
import gregtech.client.renderer.texture.Textures
import gregtech.common.blocks.BlockMetalCasing
import gregtech.common.blocks.BlockSteamCasing
import gregtech.common.blocks.MetaBlocks
import groovy.transform.CompileStatic

@CompileStatic
class PrimitiveAlloySmelter extends RecipeMapSteamMultiblockController {

    PrimitiveAlloySmelter(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, RecipeMaps.ALLOY_SMELTER_RECIPES, CONVERSION_RATE)
        this.recipeMapWorkable = new SteamMultiWorkable(this, CONVERSION_RATE)
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new PrimitiveAlloySmelter(metaTileEntityId)
    }

    @Override
    ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return Textures.PRIMITIVE_BRICKS
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle('CCC', 'CCC', 'DDD')
                .aisle('CCC', 'C#C', 'D D')
                .aisle('CCC', 'CSC', 'DDD')
                .where('S' as char, selfPredicate())
                .where('D' as char, states(getBronzeCasingState()))
                .where('C' as char, states(getCasingState()).setMinGlobalLimited(10).or(autoAbilities()))
                .where('#' as char, air())
                .build()
    }

    protected static IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.PRIMITIVE_BRICKS)
    }

    protected static IBlockState getBronzeCasingState() {
        return MetaBlocks.STEAM_CASING.getState(BlockSteamCasing.SteamCasingType.BRONZE_HULL)
    }

    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.ALLOY_SMELTER_OVERLAY
    }

    @Override
    boolean hasMaintenanceMechanics() {
        return false
    }

}
