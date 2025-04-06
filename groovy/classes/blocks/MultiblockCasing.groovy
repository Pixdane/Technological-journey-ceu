import gregtech.api.block.IStateHarvestLevel
import gregtech.api.block.VariantBlock
import gregtech.api.items.toolitem.ToolClasses
import net.minecraft.block.SoundType
import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState
import net.minecraft.util.IStringSerializable

class MultiblockCasing extends VariantBlock<MultiblockCasing.CasingType> {

    MultiblockCasing() {
        super(Material.IRON)
        setTranslationKey('multiblock_casing')
        setHardness(10.0f)
        setResistance(10.0f)
        setSoundType(SoundType.METAL)
        setDefaultState(getState(CasingType.REFINED_CHAOS))
    }

    enum CasingType implements IStringSerializable, IStateHarvestLevel {

        DRACONIC('draconic', 3),
        AWAKENED_DRACONIUM('awakened_draconium', 3),
        REFINED_CHAOS('refined_chaos', 3),
        SOUL_INSULATION('soul_insulation', 2)

        private final String name
        private final int harvestLevel

        CasingType(String name, int harvestLevel) {
            this.name = name
            this.harvestLevel = harvestLevel
        }

        @Override
        String getName() {
            this.name
        }

        @Override
        int getHarvestLevel(IBlockState state) {
            this.harvestLevel
        }

        @Override
        String getHarvestTool(IBlockState state) {
            ToolClasses.WRENCH
        }
    }
}
