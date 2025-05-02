package recipes.byLine

mods.gregtech.distillation_tower.removeByInput(96, null, [fluid('oil') * 50])
// Sulfuric Heavy Fuel * 15
mods.gregtech.distillery.removeByInput(24, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oil') * 50])
// Sulfuric Light Fuel * 25
mods.gregtech.distillery.removeByInput(24, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('oil') * 25])
// Sulfuric Naphtha * 20
mods.gregtech.distillery.removeByInput(24, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('oil') * 50])
// Sulfuric Gas * 30
mods.gregtech.distillery.removeByInput(24, [metaitem('circuit.integrated').withNbt(['Configuration': 4])], [fluid('oil') * 25])

mods.gregtech.distillation_tower.removeByInput(96, null, [fluid('oil_light') * 150])
// Sulfuric Heavy Fuel * 10
mods.gregtech.distillery.removeByInput(24, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oil_light') * 150])
// Sulfuric Naphtha * 30
mods.gregtech.distillery.removeByInput(24, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('oil_light') * 150])
// Sulfuric Gas * 48
mods.gregtech.distillery.removeByInput(24, [metaitem('circuit.integrated').withNbt(['Configuration': 4])], [fluid('oil_light') * 30])
// Sulfuric Light Fuel * 20
mods.gregtech.distillery.removeByInput(24, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('oil_light') * 150])

mods.gregtech.distillation_tower.removeByInput(288, null, [fluid('oil_heavy') * 100])
// Sulfuric Heavy Fuel * 125
mods.gregtech.distillery.removeByInput(72, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oil_heavy') * 50])
// Sulfuric Light Fuel * 45
mods.gregtech.distillery.removeByInput(72, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('oil_heavy') * 100])
// Sulfuric Naphtha * 15
mods.gregtech.distillery.removeByInput(72, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('oil_heavy') * 100])
// Sulfuric Gas * 30
mods.gregtech.distillery.removeByInput(72, [metaitem('circuit.integrated').withNbt(['Configuration': 4])], [fluid('oil_heavy') * 50])

mods.gregtech.distillation_tower.removeByInput(96, null, [fluid('oil_medium') * 100])
// Sulfuric Heavy Fuel * 10
mods.gregtech.distillery.removeByInput(24, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('oil_medium') * 100])
// Sulfuric Light Fuel * 25
mods.gregtech.distillery.removeByInput(24, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('oil_medium') * 50])
// Sulfuric Naphtha * 75
mods.gregtech.distillery.removeByInput(24, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('oil_medium') * 50])
// Sulfuric Gas * 30
mods.gregtech.distillery.removeByInput(24, [metaitem('circuit.integrated').withNbt(['Configuration': 4])], [fluid('oil_medium') * 50])

DISTILLATION_TOWER = recipemap('distillation_tower')

DISTILLATION_TOWER.recipeBuilder()
        .fluidInputs(fluid('oil_heavy') * 4500)
        .fluidOutputs(fluid('sulfuric_heavy_fuel') * 7500)
        .fluidOutputs(fluid('sulfuric_light_fuel') * 1350)
        .fluidOutputs(fluid('sulfuric_naphtha') * 450)
        .fluidOutputs(fluid('sulfuric_gas') * 18000)
        .duration(400)
        .EUt(10)
        .buildAndRegister()

DISTILLATION_TOWER.recipeBuilder()
        .fluidInputs(fluid('oil_medium') * 3000)
        .fluidOutputs(fluid('sulfuric_heavy_fuel') * 450)
        .fluidOutputs(fluid('sulfuric_light_fuel') * 1500)
        .fluidOutputs(fluid('sulfuric_naphtha') * 600)
        .fluidOutputs(fluid('sulfuric_gas') * 1800)
        .duration(400)
        .EUt(10)

        .buildAndRegister()
DISTILLATION_TOWER.recipeBuilder()
        .fluidInputs(fluid('oil_light') * 450)
        .fluidOutputs(fluid('sulfuric_heavy_fuel') * 300)
        .fluidOutputs(fluid('sulfuric_light_fuel') * 600)
        .fluidOutputs(fluid('sulfuric_naphtha') * 900)
        .fluidOutputs(fluid('sulfuric_gas') * 7500)
        .duration(400)
        .EUt(10)
        .buildAndRegister()

DISTILLATION_TOWER.recipeBuilder()
        .fluidInputs(fluid('oil') * 1500)
        .fluidOutputs(fluid('sulfuric_heavy_fuel') * 450)
        .fluidOutputs(fluid('sulfuric_light_fuel') * 1500)
        .fluidOutputs(fluid('sulfuric_naphtha') * 600)
        .fluidOutputs(fluid('sulfuric_gas') * 1800)
        .duration(400)
        .EUt(10)
        .buildAndRegister()

mods.gregtech.centrifuge.removeByInput(80, [item('minecraft:soul_sand')], null)