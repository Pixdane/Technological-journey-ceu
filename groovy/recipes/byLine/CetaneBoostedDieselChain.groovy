package recipes.byLine

MIXER = recipemap('mixer')
CHEMICAL_REACTOR = recipemap('chemical_reactor')

// Cetane-Boosted Diesel * 1000
mods.gregtech.mixer.removeByInput(480, null, [fluid('diesel') * 1000, fluid('tetranitromethane') * 20])
// Cetane-Boosted Diesel * 750
mods.gregtech.mixer.removeByInput(480, null, [fluid('bio_diesel') * 1000, fluid('tetranitromethane') * 40])
// Cetane-Boosted Diesel * 10000
mods.gregtech.large_chemical_reactor.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 24])], [fluid('diesel') * 10000, fluid('tetranitromethane') * 200])
// Cetane-Boosted Diesel * 7500
mods.gregtech.large_chemical_reactor.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 24])], [fluid('bio_diesel') * 10000, fluid('tetranitromethane') * 400])

MIXER.recipeBuilder()
        .fluidInputs(fluid('diesel') * 2000)
        .fluidInputs(fluid('tetranitromethane') * 20)
        .fluidOutputs(fluid('nitro_fuel') * 2000)
        .EUt(480)
        .duration(20)
        .buildAndRegister()

// Nitro Benzeene
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
