import classes.recipes.TJRecipeMaps
import com.fulltrix.gcyl.blocks.GCYLMetaBlocks
import com.fulltrix.gcyl.blocks.fusion.GCYLFusionCoils
import gregtech.api.capability.impl.MultiblockRecipeLogic
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.client.renderer.ICubeRenderer
import gregtech.client.renderer.texture.Textures
import gregtech.common.blocks.BlockFusionCasing
import gregtech.common.blocks.BlockMetalCasing
import gregtech.common.blocks.MetaBlocks
import groovy.transform.CompileStatic

@CompileStatic
class ArmorInfuser extends RecipeMapMultiblockController {

    ArmorInfuser(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, TJRecipeMaps.ARMOR_INFUSION)
        this.recipeMapWorkable = new MultiblockRecipeLogic(this)
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new ArmorInfuser(metaTileEntityId)
    }

    @Override
    ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return Textures.STABLE_TITANIUM_CASING // TODO: Draconic casing
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle('CCCCC', '     ', '     ', 'AAAAA', '     ', '     ', 'AAAAA', '     ', '     ', 'CCCCC')
                .aisle('CCCCC', '  F  ', '  F  ', 'A F A', '  F  ', '  F  ', 'A F A', '  F  ', '  F  ', 'CCCCC')
                .aisle('CCCCC', ' FOF ', ' FOF ', 'AFOFA', ' FOF ', ' FOF ', 'AFOFA', ' FOF ', ' FOF ', 'CCCCC')
                .aisle('CCCCC', '  F  ', '  F  ', 'A F A', '  F  ', '  F  ', 'A F A', '  F  ', '  F  ', 'CCCCC')
                .aisle('CCSCC', '     ', '     ', 'AAAAA', '     ', '     ', 'AAAAA', '     ', '     ', 'CCCCC')
                .where('S' as char, selfPredicate())
                .where('O' as char, states(getFusionCoilState()))
                .where('F' as char, states(getFusionCasingState()))
                .where('A' as char, states(getAdvFusionCoilState()))
                .where('C' as char, states(getCasingState()).setMinGlobalLimited(32).or(autoAbilities()))
                .where('#' as char, air())
                .build()
    }

    protected static IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.TITANIUM_STABLE)
        // TODO: Draconic casing
    }

    protected static IBlockState getFusionCasingState() {
        return MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_CASING_MK2)
    }

    protected static IBlockState getAdvFusionCoilState() {
        return GCYLMetaBlocks.FUSION_COILS.getState(GCYLFusionCoils.CasingType.ADV_FUSION_COIL_1)
    }

    protected static IBlockState getFusionCoilState() {
        return MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_COIL)
    }

}
