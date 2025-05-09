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

class ChaosReplicator extends RecipeMapMultiblockController {

    ChaosReplicator(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, TJRecipeMaps.CHAOS_REPLICATION)
        this.recipeMapWorkable = new MultiblockRecipeLogic(this)
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        new ChaosReplicator(metaTileEntityId)
    }

    @Override
    ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        TJTextures.REFINED_CHAOS_CASING
    }

    @Override
    protected BlockPattern createStructurePattern() {
        FactoryBlockPattern.start().with {
            aisle 'CCCCCCC', 'CCCCCCC', 'CQQQQQC', 'CQQQQQC', 'CQQCQQC', 'CQQCQQC', 'CQQCQQC', 'CCCCCCC', 'CCCCCCC'
            aisle 'CCCCCCC', 'CZZZZZC', 'QN   NQ', 'QN   NQ', 'QN A NQ', 'QN   NQ', 'QN   NQ', 'CZZZZZC', 'CCCCCCC'
            aisle 'CCCCCCC', 'CZZZZZC', 'Q ZZZ Q', 'Q     Q', 'Q     Q', 'Q     Q', 'Q ZZZ Q', 'CZZZZZC', 'CCCCCCC'
            aisle 'CCCCCCC', 'CZZZZZC', 'Q ZZZ Q', 'Q  Z  Q', 'CA X AC', 'C  Z  C', 'C ZZZ C', 'CZZZZZC', 'CCCCCCC'
            aisle 'CCCCCCC', 'CZZZZZC', 'Q ZZZ Q', 'Q     Q', 'Q     Q', 'Q     Q', 'Q ZZZ Q', 'CZZZZZC', 'CCCCCCC'
            aisle 'CCCCCCC', 'CZZZZZC', 'QN   NQ', 'QN   NQ', 'QN A NQ', 'QN   NQ', 'QN   NQ', 'CZZZZZC', 'CCCCCCC'
            aisle 'CCCCCCC', 'CCCSCCC', 'CQQQQQC', 'CQQQQQC', 'CQQCQQC', 'CQQCQQC', 'CQQCQQC', 'CCCCCCC', 'CCCCCCC'
            where 'S', selfPredicate()
            where 'C', states(blockstate('tjceu:multiblock_casing', 'variant=refined_chaos'))
                    .setMinGlobalLimited(160)
                    | autoAbilities()
            where 'N', frames(material('gcyl:enriched_naquadah_alloy'))
            where 'X', frames(material('gcyl:chaos'))
            where 'Q', states(blockstate('enderio:block_fused_quartz', 'color=white', 'render=auto'))
            where 'A', states(blockstate('draconicevolution:draconium_block', 'charged=false'))
            where 'Z', states(blockstate('draconicevolution:infused_obsidian'))
            where ' ', air()
            build()
        }
    }

}
