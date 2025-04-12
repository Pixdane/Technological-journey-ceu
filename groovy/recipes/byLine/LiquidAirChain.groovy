// Liquid Air * 4000
mods.gregtech.vacuum_freezer.removeByInput(480, null, [fluid('air') * 4000])

<<<<<<< Updated upstream
//TODO: from OtherRecipes
// VACUUM_FREEZER.recipeBuilder()
//         .fluidInputs(fluid('air') * 1000)
//         .fluidOutputs(fluid('liquid_air') * 1000)
//         .duration(30)
//         .EUt(8192)
//         .buildAndRegister()
=======
VACUUM_FREEZER = recipemap('vacuum_freezer')
DISTILLATION_TOWER = recipemap('distillation_tower')

VACUUM_FREEZER.recipeBuilder()
        .fluidInputs(fluid('air') * 1000)
        .fluidOutputs(fluid('liquid_air') * 1000)
        .duration(30)
        .EUt(8192)
        .buildAndRegister()
>>>>>>> Stashed changes


//TODO:?

<<<<<<< Updated upstream
// Utils.removeRecipeByOutput(tower, [], [fluid('argon')], false)


// DISTILLATION_TOWER.recipeBuilder()
//         .fluidInputs(fluid('liquid_air') * 100000)
//         .fluidOutputs(fluid('nitrogen') * 78000, fluid('oxygen') * 20000, fluid('argon') * 1000, fluid('carbon_dioxide') * 500, fluid('neon') * 100, fluid('helium') * 50, fluid('methane') * 20, fluid('krypton') * 10, fluid('hydrogen') * 5, fluid('xenon'))
//         .duration(600)
//         .EUt(510)
//         .buildAndRegister()
=======
mods.gregtech.distillation_tower.removeByInput(480, null, [fluid('liquid_air') * 50000 * 50000])

DISTILLATION_TOWER.recipeBuilder()
        .fluidInputs(fluid('liquid_air') * 100000)
        .fluidOutputs(fluid('nitrogen') * 78000, fluid('oxygen') * 20000, fluid('argon') * 1000, fluid('carbon_dioxide') * 500, fluid('neon') * 100, fluid('helium') * 50, fluid('methane') * 20, fluid('krypton') * 10, fluid('hydrogen') * 5, fluid('xenon'))
        .duration(600)
        .EUt(510)
        .buildAndRegister()
>>>>>>> Stashed changes
