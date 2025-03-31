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

class ChaosReplicator extends RecipeMapMultiblockController {
    ChaosReplicator(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, TJRecipeMaps.CHAOS_REPLICATION)
        this.recipeMapWorkable = new MultiblockRecipeLogic(this)
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new ChaosReplicator(metaTileEntityId)
    }

    @Override
    ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return Textures.STABLE_TITANIUM_CASING // TODO: Chaotic casing
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("CCCCCCC", "CCCCCCC", "CQQQQQC", "CQQQQQC", "CQQCQQC", "CQQCQQC", "CQQCQQC", "CCCCCCC", "CCCCCCC")
                .aisle("CCCCCCC", "CZZZZZC", "QN   NQ", "QN   NQ", "QN A NQ", "QN   NQ", "QN   NQ", "CZZZZZC", "CCCCCCC")
                .aisle("CCCCCCC", "CZZZZZC", "Q ZZZ Q", "Q     Q", "Q     Q", "Q     Q", "Q ZZZ Q", "CZZZZZC", "CCCCCCC")
                .aisle("CCCCCCC", "CZZZZZC", "Q ZZZ Q", "Q  Z  Q", "CA X AC", "C  Z  C", "C ZZZ C", "CZZZZZC", "CCCCCCC")
                .aisle("CCCCCCC", "CZZZZZC", "Q ZZZ Q", "Q     Q", "Q     Q", "Q     Q", "Q ZZZ Q", "CZZZZZC", "CCCCCCC")
                .aisle("CCCCCCC", "CZZZZZC", "QN   NQ", "QN   NQ", "QN A NQ", "QN   NQ", "QN   NQ", "CZZZZZC", "CCCCCCC")
                .aisle("CCCCCCC", "CCCSCCC", "CQQQQQC", "CQQQQQC", "CQQCQQC", "CQQCQQC", "CQQCQQC", "CCCCCCC", "CCCCCCC")
                .where('S' as char, selfPredicate())
                .where('C' as char, states(blockstate('gregtech:metal_casing', 'variant=titanium_stable')).setMinGlobalLimited(160).or(autoAbilities())) // TODO: Chaotic casing
                .where('N' as char, frames(material('gcyl:enriched_naquadah_alloy')))
                .where('X' as char, frames(material('gcyl:chaos')))
                .where('Q' as char, states(blockstate('enderio:block_fused_quartz', 'color=white', 'render=auto')))
                .where('A' as char, states(blockstate('draconicevolution:draconium_block', 'charged=false')))
                .where('Z' as char, states(blockstate('draconicevolution:infused_obsidian')))
                .where(' ' as char, air())
                .build()
    }
}
