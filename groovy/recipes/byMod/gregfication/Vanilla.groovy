package gregfication

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

// //concrete recipes

// MIXER.recipeBuilder()
//         .inputs(item('minecraft:concrete_powder') * 64)
//         .fluidInputs(fluid('water') * 100)
//         .outputs(item('minecraft:concrete') * 64)
//         .duration(100)
//         .EUt(16)
//         .buildAndRegister()

// val i = 0
// for
// i in 1 to 16 {
//     MIXER.recipeBuilder()

//             .inputs(itemUtils.getItem("minecraft:concrete_powder", i) * 64)
//             .fluidInputs(fluid('water') * 1000)
//             .outputs(itemUtils.getItem("minecraft:concrete", i) * 64)
//             .duration(100)
//             .EUt(16)
//             .buildAndRegister()
// }
// //Large concrete recipes

// LARGE_MIXER.recipeBuilder()
//         .inputs(item('minecraft:concrete_powder') * 64)
//         .fluidInputs(fluid('water') * 100)
//         .outputs(item('minecraft:concrete') * 64)
//         .duration(100)
//         .EUt(16)
//         .buildAndRegister()

// val f = 0
// for
// f in 1 to 16 {
//     LARGE_MIXER.recipeBuilder()
//             .inputs(itemUtils.getItem("minecraft:concrete_powder", f) * 64)
//             .fluidInputs(fluid('water') * 1000)
//             .outputs(itemUtils.getItem("minecraft:concrete", f) * 64)
//             .duration(100)
//             .EUt(16)
//             .buildAndRegister()
// }


// crafting.removeByOutput(item('minecraft:end_crystal'))
// recipes.removeShaped(item('minecraft:end_crystal'), [[ore('paneGlassColorless'), ore('paneGlassColorless'), ore('paneGlassColorless')], [ore('paneGlassColorless'), item('gregtech:meta_item_1:32725'), ore('paneGlassColorless')], [ore('paneGlassColorless'), item('gregtech:meta_item_1:32672'), ore('paneGlassColorless')]])


// crafting.addShaped("clay1", ore('blockClay').firstItem * 8, [[ore('sand'), ore('sand'), ore('sand')], [ore('sand'), fluid('water') * 1000, ore('sand')], [ore('sand'), ore('sand'), ore('sand')]])

// crafting.removeByOutput(item('minecraft:golden_apple', 1))
