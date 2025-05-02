package recipes.byLine

ASSEMBLER = recipemap('assembler')
ASSLINE = recipemap('assembly_line')
CO_ASSLINE = recipemap('component_al_recipes')

// TODO: component assembly
//// EV Electric Motor * 1
//mods.gregtech.assembler.removeByInput(30, [metaitem('cableGtDoubleAluminium') * 2, metaitem('stickTitanium') * 2, metaitem('stickNeodymiumMagnetic'), metaitem('wireGtDoubleKanthal') * 4], null)
//// IV Electric Motor * 1
//mods.gregtech.assembler.removeByInput(30, [metaitem('cableGtDoubleTungsten') * 2, metaitem('stickTungstenSteel') * 2, metaitem('stickNeodymiumMagnetic'), metaitem('wireGtQuadrupleBrightSteel') * 4], null)
//
//ASSEMBLER.recipeBuilder()
//        .inputs(ore('stickNeodymiumMagnetic'))
//        .inputs(ore('stickTitanium') * 2)
//        .inputs(ore('cableGtSingleAluminium') * 2)
//        .inputs(ore('wireGtQuadrupleGold') * 4)
//        .outputs(metaitem('electric.motor.ev'))
//        .duration(100)
//        .EUt(1920)
//        .buildAndRegister()
//
//ASSEMBLER.recipeBuilder()
//        .inputs(ore('stickNeodymiumMagnetic'))
//        .inputs(ore('stickTungstenSteel') * 2)
//        .inputs(ore('cableGtSingleTungsten') * 2)
//        .inputs(ore('wireGtQuadrupleBrightSteel') * 4)
//        .outputs(item('gregtech:meta_item_1:32604'))
//        .duration(100)
//        .EUt(7680)
//        .buildAndRegister()

// ASSLINE.recipeBuilder()
//         .inputs(item('gtadditions:ga_meta_item:2072') * 16, item('gtadditions:ga_meta_item:2072') * 16, item('gtadditions:ga_meta_item:2072') * 16, item('gtadditions:ga_meta_item:2072') * 16, ore('cableGtSingleAluminium') * 4, ore('cableGtSingleAluminium') * 4, ore('cableGtSingleAluminium') * 4, ore('cableGtSingleAluminium') * 4, ore('stickLongTitanium') * 4, ore('stickLongNeodymiumMagnetic') * 4)
//         .outputs(metaitem('electric.motor.ev') * 16)
//         .fluidInputs(fluid('gold') * 1152)
//         .duration(6000)
//         .EUt(64000)
//         .buildAndRegister()
//
// ASSLINE.recipeBuilder()
//         .inputs(item('gtadditions:ga_meta_item:2235') * 16, item('gtadditions:ga_meta_item:2235') * 16, item('gtadditions:ga_meta_item:2235') * 16, item('gtadditions:ga_meta_item:2235') * 16, ore('cableGtSingleTungsten') * 4, ore('cableGtSingleTungsten') * 4, ore('cableGtSingleTungsten') * 4, ore('cableGtSingleTungsten') * 4, ore('stickLongTungstenSteel') * 4, ore('stickLongNeodymiumMagnetic') * 4)
//         .outputs(item('gregtech:meta_item_1:32604') * 16)
//         .fluidInputs(fluid('bright_steel') * 1152)
//         .duration(6000)
//         .EUt(128000)
//         .buildAndRegister()

//// EV Electric Motor * 64
//mods.gregtech.component_al_recipes.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 1]), metaitem('stickLongTitanium') * 48, metaitem('cableGtHexAluminium') * 12, metaitem('wireGtHexKanthal') * 24, metaitem('stickLongNeodymiumMagnetic') * 24], null)
//// IV Electric Motor * 64
//mods.gregtech.component_al_recipes.removeByInput(1920, [metaitem('circuit.integrated').withNbt(['Configuration': 1]), metaitem('stickLongTungstenSteel') * 48, metaitem('cableGtHexTungsten') * 12, metaitem('wireGtHexBrightSteel') * 48, metaitem('stickLongNeodymiumMagnetic') * 24], null)

// Utils.removeRecipeByOutput(assembly_line, [item('gregtech:meta_item_1:32670') * 16], [], true)

// TODO: field generators
