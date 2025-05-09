package recipes.byLine

CHEMICAL_REACTOR = recipemap('chemical_reactor')
EXTRACTOR = recipemap('extractor')
FERMENTER = recipemap('fermenter')

CHEMICAL_REACTOR.recipeBuilder().with {
        inputs ore('dustTinySodiumHydroxide')
        fluidInputs fluid('creosote') * 6000
        fluidInputs fluid('ethanol') * 1000
        fluidOutputs fluid('bio_diesel') * 6000
        fluidOutputs fluid('glycerol') * 1000
        duration 600
        EUt 30
        buildAndRegister()
}

CHEMICAL_REACTOR.recipeBuilder().with {
        inputs ore('dustTinySodiumHydroxide')
        fluidInputs fluid('creosote') * 6000
        fluidInputs fluid('methanol') * 1000
        fluidOutputs fluid('bio_diesel') * 6000
        fluidOutputs fluid('glycerol') * 1000
        duration 600
        EUt 30
        buildAndRegister()
}

EXTRACTOR.recipeBuilder().with {
        inputs ore('seedCanola') * 10
        fluidOutputs fluid('canolaoil') * 1000
        duration 150
        EUt 16
        buildAndRegister()
}

EXTRACTOR.recipeBuilder().with {
        inputs ore('cropCanola') * 5
        fluidOutputs fluid('canolaoil') * 1000
        duration 150
        EUt 16
        buildAndRegister()
}

FERMENTER.recipeBuilder().with {
        fluidInputs fluid('canolaoil') * 10000
        fluidOutputs fluid('refinedcanolaoil') * 10000
        duration 300
        EUt 16
        buildAndRegister()
}

CHEMICAL_REACTOR.recipeBuilder().with {
        inputs item('actuallyadditions:item_misc', 23) * 8
        fluidInputs fluid('refinedcanolaoil') * 10000
        fluidOutputs fluid('crystaloil') * 10000
        duration 300
        EUt 16
        buildAndRegister()
}

CHEMICAL_REACTOR.recipeBuilder().with {
        fluidInputs fluid('crystaloil') * 5000, fluid('creosote') * 5000
        fluidOutputs fluid('empoweredoil') * 10000
        duration 300
        EUt 16
        buildAndRegister()
}

CHEMICAL_REACTOR.recipeBuilder().with {
        inputs ore('dustTinySodiumHydroxide')
        fluidInputs fluid('empoweredoil') * 10000
        fluidInputs fluid('ethanol') * 1000
        fluidOutputs fluid('bio_diesel') * 10000
        fluidOutputs fluid('glycerol') * 1000
        duration 120
        EUt 30
        buildAndRegister()
}

CHEMICAL_REACTOR.recipeBuilder().with {
        inputs ore('dustTinySodiumHydroxide')
        fluidInputs fluid('empoweredoil') * 10000
        fluidInputs fluid('methanol') * 1000
        fluidOutputs fluid('bio_diesel') * 10000
        fluidOutputs fluid('glycerol') * 1000
        duration 120
        EUt 30
        buildAndRegister()
}