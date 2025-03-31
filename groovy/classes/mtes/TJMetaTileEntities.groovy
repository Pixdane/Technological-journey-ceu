import classes.mtes.multiblocks.*

import static classes.utils.TJUtility.tjId
import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity

class TJMetaTileEntities {

    static PrimitiveAlloySmelter PRIMITIVE_ALLOY_SMELTER
    static ArmorInfuser ARMOR_INFUSER
    static ChaosReplicator CHAOS_REPLICATOR
    static DragonEggReplicator DRAGON_EGG_REPLICATOR

    static void register() {

        // Singleblocks 0 - 1999

        // Multiblocks 2000 - 2999
        PRIMITIVE_ALLOY_SMELTER = registerMetaTileEntity(2000, new PrimitiveAlloySmelter(tjId('primitive_alloy_smelter')))
        ARMOR_INFUSER = registerMetaTileEntity(2001, new ArmorInfuser(tjId('armor_infuser')))
        CHAOS_REPLICATOR = registerMetaTileEntity(2002, new ChaosReplicator(tjId('chaos_replicator')))
        DRAGON_EGG_REPLICATOR = registerMetaTileEntity(2003, new DragonEggReplicator(tjId('dragon_egg_replicator')))

        // Others 3000 - 3999
    }
}