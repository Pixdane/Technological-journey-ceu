<<<<<<< Updated upstream
//TODO: from OtherRecipes

// Utils.removeRecipeByOutput(tower, [], [fluid('sulfuric_heavy_fuel')], false) //triple all values-
// DISTILLATION_TOWER.recipeBuilder()
//         .fluidInputs(fluid('oil_heavy') * 4500)
//         .fluidOutputs(fluid('sulfuric_heavy_fuel') * 7500, fluid('sulfuric_light_fuel') * 1350, fluid('sulfuric_naphtha') * 450, fluid('sulfuric_gas') * 18000)
//         .duration(400)
//         .EUt(10)
//         .buildAndRegister()
// DISTILLATION_TOWER.recipeBuilder()
//         .fluidInputs(fluid('oil_medium') * 3000)
//         .fluidOutputs(fluid('sulfuric_heavy_fuel') * 450, fluid('sulfuric_light_fuel') * 1500, fluid('sulfuric_naphtha') * 600, fluid('sulfuric_gas') * 1800)
//         .duration(400)
//         .EUt(10)
//         .buildAndRegister()
// DISTILLATION_TOWER.recipeBuilder()
//         .fluidInputs(fluid('oil_light') * 450)
//         .fluidOutputs(fluid('sulfuric_heavy_fuel') * 300, fluid('sulfuric_light_fuel') * 600, fluid('sulfuric_naphtha') * 900, fluid('sulfuric_gas') * 7500)
//         .duration(400)
//         .EUt(10)
//         .buildAndRegister()
// DISTILLATION_TOWER.recipeBuilder()
//         .fluidInputs(fluid('oil') * 1500)
//         .fluidOutputs(fluid('sulfuric_heavy_fuel') * 450, fluid('sulfuric_light_fuel') * 1500, fluid('sulfuric_naphtha') * 600, fluid('sulfuric_gas') * 1800)
//         .duration(400)
//         .EUt(10)
//         .buildAndRegister()


// Utils.removeRecipeByOutput(centrifuge, [], [fluid('oil') * 100], true)
// Utils.removeRecipeByOutput(large_centrifuge, [], [fluid('oil') * 100], true)

// distillery.findRecipe(24, [item('gregtech:meta_item_1:32766').withNbt({ Configuration: 2 })], [fluid('oil_light') * 150]).remove()
=======
mods.gregtech.distillation_tower.removeByInput(96, null, [fluid('oil') * 50 * 50])
mods.gregtech.distillation_tower.removeByInput(96, null, [fluid('oil_light') * 150 * 150])
mods.gregtech.distillation_tower.removeByInput(288, null, [fluid('oil_heavy') * 100 * 100])
mods.gregtech.distillation_tower.removeByInput(96, null, [fluid('oil_medium') * 100 * 100])

DISTILLATION_TOWER = recipemap('distillation_tower')

DISTILLATION_TOWER.recipeBuilder()
        .fluidInputs(fluid('oil_heavy') * 4500)
        .fluidOutputs(fluid('sulfuric_heavy_fuel') * 7500, fluid('sulfuric_light_fuel') * 1350, fluid('sulfuric_naphtha') * 450, fluid('sulfuric_gas') * 18000)
        .duration(400)
        .EUt(10)
        .buildAndRegister()
DISTILLATION_TOWER.recipeBuilder()
        .fluidInputs(fluid('oil_medium') * 3000)
        .fluidOutputs(fluid('sulfuric_heavy_fuel') * 450, fluid('sulfuric_light_fuel') * 1500, fluid('sulfuric_naphtha') * 600, fluid('sulfuric_gas') * 1800)
        .duration(400)
        .EUt(10)
        .buildAndRegister()
DISTILLATION_TOWER.recipeBuilder()
        .fluidInputs(fluid('oil_light') * 450)
        .fluidOutputs(fluid('sulfuric_heavy_fuel') * 300, fluid('sulfuric_light_fuel') * 600, fluid('sulfuric_naphtha') * 900, fluid('sulfuric_gas') * 7500)
        .duration(400)
        .EUt(10)
        .buildAndRegister()
DISTILLATION_TOWER.recipeBuilder()
        .fluidInputs(fluid('oil') * 1500)
        .fluidOutputs(fluid('sulfuric_heavy_fuel') * 450, fluid('sulfuric_light_fuel') * 1500, fluid('sulfuric_naphtha') * 600, fluid('sulfuric_gas') * 1800)
        .duration(400)
        .EUt(10)
        .buildAndRegister()


mods.gregtech.centrifuge.removeByInput(80, [item('minecraft:soul_sand')], null)

mods.gregtech.distillery.removeByInput(24, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('oil_light') * 150 * 150])
>>>>>>> Stashed changes
