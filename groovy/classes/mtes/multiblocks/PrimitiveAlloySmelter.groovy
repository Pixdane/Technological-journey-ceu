import gregtech.api.metatileentity.multiblock.ParallelLogicType
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

class PrimitiveAlloySmelter extends RecipeMapSteamMultiblockController {

    private static final int PARALLEL_LIMIT = 8;

    PrimitiveAlloySmelter(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, RecipeMaps.ALLOY_SMELTER_RECIPES, CONVERSION_RATE)
        this.recipeMapWorkable = new SteamMultiWorkable(this, CONVERSION_RATE) {

            @Override
            ParallelLogicType getParallelLogicType() {
                ParallelLogicType.MULTIPLY
            }
            
        }

        this.recipeMapWorkable.setParallelLimit(PARALLEL_LIMIT)
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        new PrimitiveAlloySmelter(metaTileEntityId)
    }

    @Override
    ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        Textures.PRIMITIVE_BRICKS
    }

    @Override
    boolean hasMaintenanceMechanics() {
        false
    }

    @Override
    public int getItemOutputLimit() {
        return 1;
    }


    @Override
    protected ICubeRenderer getFrontOverlay() {
        Textures.ALLOY_SMELTER_OVERLAY
    }

    @Override
    protected BlockPattern createStructurePattern() {
        def casing = states(blockstate('gregtech:metal_casing', 'variant=primitive_bricks')).setMinGlobalLimited(10)
        def bronzeHull = states(blockstate('gregtech:steam_casing', 'variant=bronze_hull'))
        FactoryBlockPattern.start()
                .aisle('CCC', 'CCC', 'DDD')
                .aisle('CCC', 'C#C', 'D D')
                .aisle('CCC', 'CSC', 'DDD')
                .where('S' as char, selfPredicate())
                .where('D' as char, bronzeHull)
                .where('C' as char, casing.or(autoAbilities()))
                .where('#' as char, air())
                .build()
    }
}
