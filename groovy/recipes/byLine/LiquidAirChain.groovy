// Liquid Air * 4000
mods.gregtech.vacuum_freezer.removeByInput(480, null, [fluid('air') * 4000])

VACUUM_FREEZER = recipemap('vacuum_freezer')
DISTILLATION_TOWER = recipemap('distillation_tower')

VACUUM_FREEZER.recipeBuilder()
        .fluidInputs(fluid('air') * 1000)
        .fluidOutputs(fluid('liquid_air') * 1000)
        .duration(30)
        .EUt(8192)
        .buildAndRegister()

//TODO:?
mods.gregtech.distillation_tower.removeByInput(480, null, [fluid('liquid_air') * 50000])

// Nitrogen Gas * 1560
mods.gregtech.distillery.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('liquid_air') * 2000])
// Oxygen Gas * 400
mods.gregtech.distillery.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('liquid_air') * 2000])
// Argon Gas * 40
mods.gregtech.distillery.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('liquid_air') * 4000])
// Carbon Dioxide * 50
mods.gregtech.distillery.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 4])], [fluid('liquid_air') * 10000])
// Neon Gas * 50
mods.gregtech.distillery.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 5])], [fluid('liquid_air') * 50000])
// Helium Gas * 25
mods.gregtech.distillery.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 6])], [fluid('liquid_air') * 50000])
// Methane Gas * 20
mods.gregtech.distillery.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 7])], [fluid('liquid_air') * 100000])
// Krypton Gas * 10
mods.gregtech.distillery.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 8])], [fluid('liquid_air') * 100000])
// Hydrogen Gas * 5
mods.gregtech.distillery.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 9])], [fluid('liquid_air') * 100000])
// Xenon Gas * 1
mods.gregtech.distillery.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 10])], [fluid('liquid_air') * 100000])

DISTILLATION_TOWER.recipeBuilder()
        .fluidInputs(fluid('liquid_air') * 100000)
        .fluidOutputs(fluid('nitrogen') * 78000)
        .fluidOutputs(fluid('oxygen') * 20000)
        .fluidOutputs(fluid('argon') * 1000)
        .fluidOutputs(fluid('carbon_dioxide') * 500)
        .fluidOutputs(fluid('neon') * 100)
        .fluidOutputs(fluid('helium') * 50)
        .fluidOutputs(fluid('methane') * 20)
        .fluidOutputs(fluid('krypton') * 10)
        .fluidOutputs(fluid('hydrogen') * 5)
        .fluidOutputs(fluid('xenon'))
        .duration(600)
        .EUt(510)
        .buildAndRegister()