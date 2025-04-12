import gregtech.api.GTValues
import gregtech.api.items.metaitem.MetaItem
import gregtech.api.items.metaitem.StandardMetaItem
import gregtech.common.covers.CoverConveyor
import gregtech.common.covers.CoverPump
import gregtech.common.covers.CoverSolarPanel
import gregtech.common.items.behaviors.TooltipBehavior
import net.minecraft.client.resources.I18n

import static classes.utils.TJUtility.tjId
import static gregtech.common.covers.CoverBehaviors.registerBehavior

class TJMetaItems {

    static def item

    static def STEAM_MOTOR_ULV
    static def STEAM_PISTON_ULV
    static def CONVEYOR_MODULE_ULV
    static def STEAM_PUMP_LV
    static def COVER_SOLAR_PANEL_MAX

    static def REFINED_CHAOS_SHARD
    static def REFINED_CHAOS_CRYSTAL
    static def INFINITY_CRYSTAL
    static def ETERNITY_CRYSTAL
    static def BAN_CERTIFICATE

    static void registerItems() {
        item = new StandardMetaItem() {

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
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.conveyor.module.tooltip"))
                    lines.add(I18n.format("gregtech.universal.tooltip.item_transfer_rate", 4))
                }))

        STEAM_PUMP_LV = item.addItem(3, 'steam.pump.ulv')
                .addComponents(new TooltipBehavior({ lines ->
                    lines.add(I18n.format("metaitem.electric.pump.tooltip"))
                    lines.add(I18n.format("gregtech.universal.tooltip.fluid_transfer_rate", 32))
                }))

        COVER_SOLAR_PANEL_MAX = item.addItem(4, 'solar_panel.max')
                .addComponents(new TooltipBehavior({ lines ->
                    lines.add(I18n.format("metaitem.cover.solar.panel.tooltip.1"))
                    lines.add(I18n.format("metaitem.cover.solar.panel.tooltip.2"))
                    lines.add(I18n.format("gregtech.universal.tooltip.voltage_out",
                            GTValues.V[GTValues.MAX], GTValues.VNF[GTValues.MAX]))
                }))

        // Ingredients 200 - 799
        REFINED_CHAOS_SHARD = item.addItem(200, 'shard.refined_chaos')
        REFINED_CHAOS_CRYSTAL = item.addItem(201, 'crystal.refined_chaos')
        INFINITY_CRYSTAL = item.addItem(202, 'crystal.infinity')
        ETERNITY_CRYSTAL = item.addItem(203, 'crystal.eternity')

        // Misc 800 - 999
        BAN_CERTIFICATE = item.addItem(800, 'ban.certificate')
    }

    static void registerBehaviors() {
        registerBehavior(tjId('conveyor.module.ulv'), CONVEYOR_MODULE_ULV, { defi, tile, side -> new CoverConveyor(defi, tile, side, GTValues.ULV, 4) })
        registerBehavior(tjId('steam.pump.ulv'), STEAM_PUMP_LV, { defi, tile, side -> new CoverPump(defi, tile, side, GTValues.ULV, 640) })

        registerBehavior(tjId('solar_panel.max'), COVER_SOLAR_PANEL_MAX, { defi, tile, side -> new CoverSolarPanel(defi, tile, side, GTValues.V[GTValues.MAX]) })
    }

}