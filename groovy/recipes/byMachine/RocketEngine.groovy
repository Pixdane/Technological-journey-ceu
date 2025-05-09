package recipes.byMachine

ROCKET_FUEL = recipemap('rocket_fuel')

mods.gregtech.rocket_fuel.removeByInput(2048, null, [fluid('rocket_fuel_a') * 3 * 3])
mods.gregtech.rocket_fuel.removeByInput(2048, null, [fluid('rocket_fuel_b') * 6 * 6])
mods.gregtech.rocket_fuel.removeByInput(2048, null, [fluid('dense_hydrazine_fuel_mixture') * 9 * 9])
mods.gregtech.rocket_fuel.removeByInput(2048, null, [fluid('rocket_fuel_c') * 12 * 12])
mods.gregtech.rocket_fuel.removeByInput(2048, null, [fluid('rocket_fuel') * 15 * 15])

ROCKET_FUEL.recipeBuilder().with {
        fluidInputs fluid('rocket_fuel_a') * 7
        duration 80
        EUt 8192
        buildAndRegister()

}

ROCKET_FUEL.recipeBuilder().with {
        fluidInputs fluid('rocket_fuel_b') * 6
        duration 120
        EUt 8192
        buildAndRegister()

}

ROCKET_FUEL.recipeBuilder().with {
        fluidInputs fluid('dense_hydrazine_fuel_mixture') * 9
        duration 80
        EUt 8192
        buildAndRegister()

}

ROCKET_FUEL.recipeBuilder().with {
        fluidInputs fluid('rocket_fuel_c') * 12
        duration 60
        EUt 8192
        buildAndRegister()

}

ROCKET_FUEL.recipeBuilder().with {
        fluidInputs fluid('rocket_fuel') * 15
        duration 20
        EUt 8192
        buildAndRegister()

}

ROCKET_FUEL.recipeBuilder().with {
        fluidInputs fluid('starlight_rocket_fuel') * 6
        duration 420
        EUt 8192
        buildAndRegister()
}
