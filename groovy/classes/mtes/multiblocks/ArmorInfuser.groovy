package classes.mtes.multiblocks

import classes.recipes.TJRecipeMaps
import classes.textures.TJTextures
import gregtech.api.capability.impl.MultiblockRecipeLogic
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.client.renderer.ICubeRenderer
import net.minecraft.util.ResourceLocation

class ArmorInfuser extends RecipeMapMultiblockController {

    ArmorInfuser(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, TJRecipeMaps.ARMOR_INFUSION)
        this.recipeMapWorkable = new MultiblockRecipeLogic(this)
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        new ArmorInfuser(metaTileEntityId)
    }

    @Override
    ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        TJTextures.DRACONIC_CASING
    }

    @Override
    protected BlockPattern createStructurePattern() {
        def casing = states(blockstate('tjceu:multiblock_casing', 'variant=draconic')).setMinGlobalLimited(32)
        def fusionCoil = states(blockstate('gregtech:fusion_casing', 'active=false', 'variant=fusion_coil'))
        def fusionCasing = states(blockstate('gregtech:fusion_casing', 'active=false', 'variant=fusion_casing_mk2'))
        def advFusionCoil = states(blockstate('gcyl:gcyl_fusion_coil', 'active=false', 'variant=adv_fusion_coil_1'))
        FactoryBlockPattern.start()
                .aisle('CCCCC', '     ', '     ', 'AAAAA', '     ', '     ', 'AAAAA', '     ', '     ', 'CCCCC')
                .aisle('CCCCC', '  F  ', '  F  ', 'A F A', '  F  ', '  F  ', 'A F A', '  F  ', '  F  ', 'CCCCC')
                .aisle('CCCCC', ' FOF ', ' FOF ', 'AFOFA', ' FOF ', ' FOF ', 'AFOFA', ' FOF ', ' FOF ', 'CCCCC')
                .aisle('CCCCC', '  F  ', '  F  ', 'A F A', '  F  ', '  F  ', 'A F A', '  F  ', '  F  ', 'CCCCC')
                .aisle('CCSCC', '     ', '     ', 'AAAAA', '     ', '     ', 'AAAAA', '     ', '     ', 'CCCCC')
                .where('S', selfPredicate())
                .where('O', fusionCoil)
                .where('F', fusionCasing)
                .where('A', advFusionCoil)
                .where('C', casing.or(autoAbilities()))
                .where('#', this.any())
                .build()
    }

}
