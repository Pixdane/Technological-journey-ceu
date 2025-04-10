ASSEMBLER = recipemap('assembler')

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

//TODO: from OtherRecipes

// crafting.addShaped(ore('dyeGreen'), [[null, item('minecraft:tallgrass', 1), null], [item('minecraft:tallgrass', 1), null, item('minecraft:tallgrass', 1)], [null, item('minecraft:tallgrass', 1), null]])

// Blaze Rod * 1
mods.gregtech.compressor.removeByInput(2, [item('minecraft:blaze_powder') * 4 * 4], null)

// IMPLOSION_COMPRESSOR.recipeBuilder()
//         .inputs(ore('dustBlaze,itemBlazePowder') * 15)
//         .outputs(ore('itemBlazeRod,rodBlaze,stickBlaze') * 3)
//         .explosives(10)
//         .duration(20)
//         .EUt(30)
//         .buildAndRegister()