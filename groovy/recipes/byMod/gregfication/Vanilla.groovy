ASSEMBLER = recipemap('assembler')
IMPLOSION_COMPRESSOR = recipemap('implosion_compressor')
MIXER = recipemap('mixer')

// Recipe removals
[
        item('minecraft:end_crystal'),
].forEach {
    crafting.removeByOutput(it)
}

crafting.remove('minecraft:ender_eye')

crafting.addShapeless(item('minecraft:clay_ball') * 4, [ore('blockClay')])

crafting.addShapeless(item('minecraft:blaze_rod'), [item('minecraft:brewing_stand')])

crafting.addShapeless(item('minecraft:wheat_seeds') * 3, [ore('cropWheat')])

// End Rod
crafting.addShaped(item('minecraft:end_rod'), [
        [null, ore('rodBlaze'), null],
        [null, ore('endstone'), null],
        [ore('endstone'), ore('ingotTitanium'), ore('endstone')]
])

// End Crystal
mods.gregtech.assembler.removeByInput(16, [item('minecraft:ghast_tear'), item('minecraft:ender_eye')], [fluid('glass') * 1008 * 1008])

ASSEMBLER.recipeBuilder()
        .fluidInputs(fluid('woods_glass') * 144)
        .inputs(metaitem('quantumstar') * 1, metaitem('gcyl:erbium_doped_zblan') * 4, metaitem('gcyl:degenerate.rhenium.plate') * 1)
        .notConsumable(metaitem('gcyl:microfocus.xray.tube'))
        .outputs(item('minecraft:end_crystal'))
        .duration(40)
        .EUt(122880)
        .buildAndRegister()

crafting.addShaped(item('minecraft:dye', 2),
[
        [null, item('minecraft:tallgrass', 1), null],
        [item('minecraft:tallgrass', 1), null, item('minecraft:tallgrass', 1)], 
        [null, item('minecraft:tallgrass', 1), null]
])

// Blaze Rod * 1
mods.gregtech.compressor.removeByInput(2, [item('minecraft:blaze_powder') * 4 * 4], null)

IMPLOSION_COMPRESSOR.recipeBuilder()
        .inputs(ore('dustBlaze') * 15)
        .outputs(item('minecraft:blaze_rod') * 3)
        .explosives(10)
        .duration(20)
        .EUt(30)
        .buildAndRegister()

//concrete recipes
for (int i=0;i<15;i++) {
    MIXER.recipeBuilder()
            .inputs(item("minecraft:concrete_powder", i) * 64)
            .fluidInputs(fluid('water') * 64000)
            .outputs(item("minecraft:concrete", i) * 64)
            .duration(100)
            .EUt(16)
            .buildAndRegister()
}

crafting.addShaped("clay1", item('minecraft:clay') * 8,
[
        [ore('sand'), ore('sand'), ore('sand')], 
        [ore('sand'), fluid('water') * 1000, ore('sand')], 
        [ore('sand'), ore('sand'), ore('sand')]
])

crafting.removeByOutput(item('minecraft:golden_apple', 1))

// crafting.addShaped(item('minecraft:name_tag'), [[null, ore('cropFlax,string'), ore('cropFlax,string')], [null, ore('slimeball'), ore('cropFlax,string')], [ore('cropFlax,string'), null, null]])

// crafting.addShaped(ore('toolHoe').withNbt({ Unbreakable:
// 1 as long ,
//     RepairCost: 1 ,
//     display:
//     { Name: "Unbreakable Emerald Tipped Diamond Hoe" } }), [[ore('gemEmerald'), ore('gemEmerald'), null], [ore('gemEmerald'), ore('toolHoe'), null], [null, null, null]])
// mods.jei.JEI.addItem(ore('toolHoe').withNbt({ display:
// { Name: "Unbreakable Emerald Tipped Diamond Hoe" } }))

// TODO: tooltips
// ore('bookEnchanted,craftingBook').withNbt({ StoredEnchantments:
// [{ lvl:
// 1 as short ,
//      id:
//      13 as short }] }).addTooltip("§4DO NOT STACK THESE IN THE ANVIL IT WILL VOID YOUR BOOKS")