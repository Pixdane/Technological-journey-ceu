package materials.unification

import gregtech.api.unification.OreDictUnifier
import gregtech.api.unification.ore.OrePrefix

class TJUnifications {

    static void registerUnifications() {

        OreDictUnifier.registerOre(item('enderio:item_material', 74), OrePrefix.dust, material('tjceu:soularium'))
        OreDictUnifier.registerOre(item('enderio:item_alloy_nugget', 7), OrePrefix.nugget, material('tjceu:soularium'))
        OreDictUnifier.registerOre(item('enderio:item_alloy_ingot', 7), OrePrefix.ingot, material('tjceu:soularium'))
        OreDictUnifier.registerOre(item('enderio:block_alloy', 7), OrePrefix.block, material('tjceu:soularium'))

        OreDictUnifier.registerOre(item('astralsorcery:blockcustomore', 1), OrePrefix.ore, material('tjceu:starmetal'))
        OreDictUnifier.registerOre(item('astralsorcery:itemcraftingcomponent', 2), OrePrefix.dust, material('tjceu:starmetal'))
        OreDictUnifier.registerOre(item('astralsorcery:itemcraftingcomponent', 1), OrePrefix.ingot, material('tjceu:starmetal'))
        OreDictUnifier.registerOre(item('astraladditions:block_starmetal'), OrePrefix.block, material('tjceu:starmetal'))

        OreDictUnifier.registerOre(item('astralsorcery:itemcraftingcomponent'), OrePrefix.gem, material('tjceu:aquamarine'))
        OreDictUnifier.registerOre(item('astralsorcery:blockcustomsandore'), OrePrefix.oreSand, material('tjceu:aquamarine'))

        OreDictUnifier.registerOre(item('draconicevolution:draconium_dust'), OrePrefix.dust, material('gcyl:draconium'))
        OreDictUnifier.registerOre(item('draconicevolution:nugget'), OrePrefix.nugget, material('gcyl:draconium'))
        OreDictUnifier.registerOre(item('draconicevolution:draconium_ingot'), OrePrefix.ingot, material('gcyl:draconium'))
        OreDictUnifier.registerOre(item('draconicevolution:draconium_block'), OrePrefix.block, material('gcyl:draconium'))

        OreDictUnifier.registerOre(item('draconicevolution:nugget', 1), OrePrefix.nugget, material('gcyl:awaken_draconium'))
        OreDictUnifier.registerOre(item('draconicevolution:draconic_ingot'), OrePrefix.ingot, material('gcyl:awaken_draconium'))
        OreDictUnifier.registerOre(item('draconicevolution:draconic_block'), OrePrefix.block, material('gcyl:awaken_draconium'))

        OreDictUnifier.registerOre(item('thermalfoundation:material', 1024), OrePrefix.dust, material('gcyl:pyrotheum'))

        OreDictUnifier.registerOre(item('thermalfoundation:material', 1025), OrePrefix.dust, material('gcyl:cryotheum'))

        // TODO: remove it from worldgen?
        OreDictUnifier.registerOre(item('advancedrocketry:basalt'), OrePrefix.stone, material('basalt'))

        material('tjceu:starlight').addFluid(fluid('astralsorcery.liquidstarlight'))
    }

}