import gregtech.api.GTValues
import gregtech.api.items.metaitem.MetaItem
import gregtech.api.items.metaitem.StandardMetaItem
import gregtech.common.covers.CoverConveyor
import gregtech.common.covers.CoverPump

import static classes.utils.TJUtility.tjId
import static gregtech.common.covers.CoverBehaviors.registerBehavior

class TJMetaItems {

    static MetaItem.MetaValueItem STEAM_MOTOR_ULV
    static MetaItem.MetaValueItem STEAM_PISTON_ULV
    static MetaItem.MetaValueItem CONVEYOR_MODULE_ULV
    static MetaItem.MetaValueItem STEAM_PUMP_LV
    static MetaItem.MetaValueItem REFINED_CHAOS_SHARD
    static MetaItem.MetaValueItem REFINED_CHAOS_CRYSTAL
    static MetaItem.MetaValueItem INFINITY_CRYSTAL
    static MetaItem.MetaValueItem ETERNITY_CRYSTAL
    static MetaItem.MetaValueItem BAN_CERTIFICATE

    static void registerItems() {
        def item = new StandardMetaItem() {
            @Override
            ResourceLocation createItemModelPath(MetaItem.MetaValueItem metaValueItem, String postfix) {
                return tjId(formatModelPath(metaValueItem) + postfix)
            }
        }
        item.setRegistryName('tj_meta_item')

        // Components 0 - 199
        STEAM_MOTOR_ULV = item.addItem(0, 'steam.motor.ulv')
        STEAM_PISTON_ULV = item.addItem(1, 'steam.piston.ulv')
        CONVEYOR_MODULE_ULV = item.addItem(2, 'conveyor.module.ulv')
        STEAM_PUMP_LV = item.addItem(3, 'steam.pump.ulv')

        // Ingredients 200 - 399
        REFINED_CHAOS_SHARD = item.addItem(2000, 'shard.refined_chaos')
        REFINED_CHAOS_CRYSTAL = item.addItem(2001, 'crystal.refined_chaos')
        INFINITY_CRYSTAL = item.addItem(2002, 'crystal.infinity')
        ETERNITY_CRYSTAL = item.addItem(2003, 'crystal.eternity')

        // Misc 800 - 999
        BAN_CERTIFICATE = item.addItem(800, 'ban.certificate')
    }

    static void registerBehaviors() {
        registerBehavior(tjId('conveyor.module.ulv'), CONVEYOR_MODULE_ULV, { defi, tile, side -> new CoverConveyor(defi, tile, side, GTValues.ULV, 640) })
        registerBehavior(tjId('steam.pump.ulv'), STEAM_PUMP_LV, { defi, tile, side -> new CoverPump(defi, tile, side, GTValues.ULV, 640) })
    }

}