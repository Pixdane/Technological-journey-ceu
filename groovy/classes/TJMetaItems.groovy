import static classes.utils.TJUtility.tjId
import static gregtech.common.covers.CoverBehaviors.registerBehavior

import gregtech.common.covers.CoverPump
import gregtech.common.covers.CoverConveyor
import gregtech.api.GTValues
import gregtech.api.items.metaitem.MetaItem
import gregtech.api.items.metaitem.StandardMetaItem

class TJMetaItems {

    static MetaItem.MetaValueItem STEAM_MOTOR_ULV
    static MetaItem.MetaValueItem STEAM_PISTON_ULV
    static MetaItem.MetaValueItem CONVEYOR_MODULE_ULV
    static MetaItem.MetaValueItem STEAM_PUMP_LV

    static void registerItems() {
        def item = new StandardMetaItem() {
            @Override
            ResourceLocation createItemModelPath(MetaItem.MetaValueItem metaValueItem, String postfix) {
                return tjId(formatModelPath(metaValueItem) + postfix);
            }
        }
        item.setRegistryName('tj_meta_item')

        // Components 0 - 199
        STEAM_MOTOR_ULV = item.addItem(0, 'steam.motor.ulv')
        STEAM_PISTON_ULV = item.addItem(1, 'steam.piston.ulv')
        CONVEYOR_MODULE_ULV = item.addItem(2, 'conveyor.module.ulv')
        STEAM_PUMP_LV = item.addItem(3, 'steam.pump.ulv')
    }

    static void registerBehaviors() {
        registerBehavior(tjId('conveyor.module.ulv'), CONVEYOR_MODULE_ULV, { defi, tile, side -> new CoverConveyor(defi, tile, side, GTValues.ULV, 640) })
        registerBehavior(tjId('steam.pump.ulv'), STEAM_PUMP_LV, { defi, tile, side -> new CoverPump(defi, tile, side, GTValues.ULV, 640) })
    }

}