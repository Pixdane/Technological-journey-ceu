package classes.items

import gregtech.api.GTValues
import gregtech.api.items.metaitem.MetaItem
import gregtech.api.items.metaitem.StandardMetaItem
import gregtech.common.covers.CoverConveyor
import gregtech.common.covers.CoverPump
import gregtech.common.covers.CoverSolarPanel
import gregtech.common.items.behaviors.TooltipBehavior
import net.minecraft.client.resources.I18n
import net.minecraft.util.ResourceLocation

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
    static def IRIDIUM_ALLOY_INGOT
    static def IRIDIUM_ALLOY_PLATE

    static def BAN_CERTIFICATE

    static def OVERWORLD_DISPLAY_ITEM
    static def NETHER_DISPLAY_ITEM
    static def END_DISPLAY_ITEM
    static def END_MAIN_ISLAND_DISPLAY_ITEM
    static def END_OUTER_ISLANDS_DISPLAY_ITEM
    static def MOON_DISPLAY_ITEM
    static def MERCURY_DISPLAY_ITEM
    static def MARS_DISPLAY_ITEM
    static def DEEP_DARK_DISPLAY_ITEM
    static def DEIMOS_DISPLAY_ITEM
    static def PHOBOS_DISPLAY_ITEM
    static def PLUTO_DISPLAY_ITEM
    static def TITAN_DISPLAY_ITEM

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
                .addComponents(new TooltipBehavior({ lines ->
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

        IRIDIUM_ALLOY_INGOT = item.addItem(204, 'ingot.iridium_alloy')
        IRIDIUM_ALLOY_PLATE = item.addItem(205, 'plate.iridium_alloy')

        // Misc 800 - 999
        BAN_CERTIFICATE = item.addItem(800, 'ban.certificate')

        /// Dimension Display items 1000 - 1199
        OVERWORLD_DISPLAY_ITEM = item.addItem(1000, 'display.overworld')
        NETHER_DISPLAY_ITEM = item.addItem(1001, 'display.nether')
        END_DISPLAY_ITEM = item.addItem(1002, 'display.end')
        END_MAIN_ISLAND_DISPLAY_ITEM = item.addItem(1003, 'display.end_main_island')
        END_OUTER_ISLANDS_DISPLAY_ITEM = item.addItem(1004, 'display.end_outer_islands')
        MOON_DISPLAY_ITEM = item.addItem(1005, 'display.moon')
        MERCURY_DISPLAY_ITEM = item.addItem(1006, 'display.mercury')
        MARS_DISPLAY_ITEM = item.addItem(1007, 'display.mars')
        DEIMOS_DISPLAY_ITEM = item.addItem(1008, 'display.deimos')
        PHOBOS_DISPLAY_ITEM = item.addItem(1009, 'display.phobos')
        PLUTO_DISPLAY_ITEM = item.addItem(1010, 'display.pluto')
        TITAN_DISPLAY_ITEM = item.addItem(1011, 'display.titan')
        DEEP_DARK_DISPLAY_ITEM = item.addItem(1012, 'display.deep_dark')
    }

    static void registerBehaviors() {
        registerBehavior(tjId('conveyor.module.ulv'), CONVEYOR_MODULE_ULV, { defi, tile, side -> new CoverConveyor(defi, tile, side, GTValues.ULV, 4) })
        registerBehavior(tjId('steam.pump.ulv'), STEAM_PUMP_LV, { defi, tile, side -> new CoverPump(defi, tile, side, GTValues.ULV, 640) })

        registerBehavior(tjId('solar_panel.max'), COVER_SOLAR_PANEL_MAX, { defi, tile, side -> new CoverSolarPanel(defi, tile, side, GTValues.V[GTValues.MAX]) })
    }

}