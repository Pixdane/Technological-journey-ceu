MIXER = recipemap('mixer')
LARGE_MIXER = recipemap('large_mixer')
CHEMICAL_REACTOR = recipemap('chemical_reactor')
CHEMICAL_DEHYDRATOR = recipemap('chemical_dehydrator')
LCR = recipemap('large_chemical_reactor')

MIXER.recipeBuilder()
        .inputs(ore('dustAstralStarmetal') * 2)
        .inputs(ore('dustNaquadah') * 3)
// .inputs(ore('dustPlutonium244')) // TODO: Plutonium 244 Dust & Other Isotopes
        .fluidInputs(fluid('clear_naquadah_liquid') * 1000)
        .outputs(metaitem('tjceu:dustNaquadricFuelCatalyst') * 6)
        .duration(600)
        .EUt(8096)
        .buildAndRegister()

// Explosive Hydrazine
LARGE_MIXER.recipeBuilder()
        .fluidInputs(fluid('dense_hydrazine_fuel_mixture') * 8000, fluid('nitrotoluene') * 4000, fluid('glyceryl_trinitrate') * 1000)
        .fluidOutputs(fluid('explosive_hydrazine_mixture') * 13000)
        .duration(100)
        .EUt(1024)
        .buildAndRegister()

// HMX
CHEMICAL_REACTOR.recipeBuilder()
        .fluidInputs(fluid('fuming_nitric_acid') * 2000)
        .inputs(ore('dustHexamethylenetetramine') * 4)
        .notConsumable(fluid('acetic_anhydride'))
        .outputs(metaitem('tjceu:dustOctogen'))
        .duration(20)
        .EUt(1024)
        .buildAndRegister()

// Octaazacubane Solution
CHEMICAL_REACTOR.recipeBuilder()
        .fluidInputs(fluid('oxygen') * 2000, fluid('distilled_water') * 3000)
        .inputs(ore('dustSodiumAzide') * 8)
        .fluidOutputs(fluid('octaazacubane_solution') * 3000)
        .outputs(metaitem('gcyl:dustSodiumOxide') * 4)
        .duration(5)
        .EUt(30000)
        .buildAndRegister()

// Octazacubane
CHEMICAL_DEHYDRATOR.recipeBuilder()
        .fluidInputs(fluid('octaazacubane_solution') * 1000)
        .outputs(metaitem('tjceu:dustOctaazacubane'))
        .duration(35)
        .EUt(4500)
        .buildAndRegister()


// Starlight Complex
MIXER.recipeBuilder()
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 1000)
        .inputs(metaitem('tjceu:dustOctaazacubane'))
        .fluidOutputs(fluid('starlight_complex') * 2000)
        .duration(35)
        .EUt(2000)
        .buildAndRegister()

// Starlight Rocket Fuel
LCR.recipeBuilder()
        .fluidInputs(fluid('explosive_hydrazine_mixture') * 32000, fluid('starlight_complex') * 6000, fluid('rocket_fuel_b') * 2000, fluid('kerosene') * 4000, fluid('dinitrogen_tetroxide') * 6000)
        .inputs(metaitem('tjceu:dustOctogen') * 4)
        .notConsumable(metaitem('tjceu:dustNaquadricFuelCatalyst'))
        .fluidOutputs(fluid('starlight_rocket_fuel') * 50000)
        .duration(20)
        .EUt(30000)
        .buildAndRegister()
