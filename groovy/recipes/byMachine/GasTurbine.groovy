package recipes.byMachine

GAS_TURBINE = recipemap('gas_turbine')

GAS_TURBINE.recipeBuilder().with {
        fluidInputs fluid('hydrogen') * 20
        duration 2
        EUt 32
        buildAndRegister()

}

GAS_TURBINE.recipeBuilder().with {
        fluidInputs fluid('carbon_monoxide') * 20
        duration 16
        EUt 32
        buildAndRegister()

}

GAS_TURBINE.recipeBuilder().with {
        fluidInputs fluid('naquadah_gas') * 1
        duration 8000
        EUt 32
        buildAndRegister()
}
