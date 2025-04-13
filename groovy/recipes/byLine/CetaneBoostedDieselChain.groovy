MIXER = recipemap('mixer')
CHEMICAL_REACTOR = recipemap('chemical_reactor')

//Nitro Fuel
mods.gregtech.mixer.removeByInput(480, null, [fluid('diesel') * 1000 * 1000, fluid('tetranitromethane') * 20])

MIXER.recipeBuilder()
        .fluidInputs([fluid('diesel') * 2000, fluid('tetranitromethane') * 20])
        .fluidOutputs([fluid('nitro_fuel') * 2000])
        .EUt(480)
        .duration(20)
        .buildAndRegister()

//Nitro Benzeene
mods.gregtech.chemical_reactor.removeByInput(480, null, [fluid('benzene') * 5000, fluid('nitration_mixture') * 2000, fluid('distilled_water') * 2000])

CHEMICAL_REACTOR.recipeBuilder()
        .fluidInputs(fluid('nitration_mixture') * 2000)
        .fluidInputs(fluid('benzene') * 5000)
        .fluidInputs(fluid('distilled_water') * 2000)
        .fluidOutputs(fluid('nitrobenzene') * 8000)
        .fluidOutputs(fluid('diluted_sulfuric_acid') * 1000)
        .EUt(320)
        .duration(120)
        .buildAndRegister()
