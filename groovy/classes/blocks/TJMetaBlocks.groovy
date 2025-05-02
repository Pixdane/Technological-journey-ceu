package classes.blocks

import gregtech.api.block.VariantItemBlock

class TJMetaBlocks {

    static MultiblockCasing MULTIBLOCK_CASING

    static void init() {
        MULTIBLOCK_CASING = new MultiblockCasing()
    }

    /// Remember to fix item model registration in [classes.utils.ModelRegister#registerItemModels()] as well
    static void registerBlocks() {
        content.registerBlock('multiblock_casing', MULTIBLOCK_CASING, new VariantItemBlock(MULTIBLOCK_CASING))
    }

}
