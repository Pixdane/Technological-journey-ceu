// side: client

import gregtech.common.blocks.MetaBlocks
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraftforge.client.model.ModelLoader

import static classes.blocks.TJMetaBlocks.*

class ModelRegister {

    static void registerItemModels() {
        registerItemModel(MULTIBLOCK_CASING)
    }

    private static void registerItemModel(Block block) {
        for (IBlockState state : block.getBlockState().getValidStates()) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                    block.getMetaFromState(state),
                    new ModelResourceLocation(block.getRegistryName(),
                            MetaBlocks.statePropertiesToString(state.getProperties())))
        }
    }

}
