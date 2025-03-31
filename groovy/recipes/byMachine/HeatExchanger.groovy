HEAT_EXCHANGER = recipemap('heat_exchanger')

HEAT_EXCHANGER.recipeBuilder()
        .fluidInputs(fluid('water') * 2880, fluid('lava') * 1000)
        .fluidOutputs(fluid('steam') * 172800, fluid('pahoehoe_lava') * 1000) // TODO: Add Hot Steam
        .duration(20)
        .buildAndRegister();
