// TODO: Modifie Machine Casings & Hull Recipes (ZPM, UIV, UXV, OpV, MAX)

ASSEMBLER = recipemap('assembler')
BREWERY = recipemap('brewery')
AUTOCLAVE = recipemap('autoclave')

// Recipe removals
[
        metaitem('compressed.coke_clay'),
].forEach {
    crafting.removeByOutput(it)
}

// Wrought Iron Nugget
furnace.removeByOutput(metaitem('nuggetWroughtIron'))

// Nether Star
furnace.removeByOutput(item('minecraft:nether_star'))

// ZPM Machine Casing * 1
mods.gregtech.assembler.removeByInput(16, [metaitem('circuit.integrated').withNbt(['Configuration': 8]), metaitem('plateDuranium') * 8], null)

crafting.addShaped(item('gregtech:machine_casing', 7), [
        [ore('plateStarmetalAlloy'), ore('plateStarmetalAlloy'), ore('plateStarmetalAlloy')],
        [ore('plateStarmetalAlloy'), ore('craftingToolWrench'), ore('plateStarmetalAlloy')],
        [ore('plateStarmetalAlloy'), ore('plateStarmetalAlloy'), ore('plateStarmetalAlloy')]
])

// crafting.removeByOutput(item('gregtech:mte', 992));
// crafting.addShaped(item('gregtech:mte', 992), [[null, null, null],[ore('platePolybenzimidazole'), item('gregtech:meta_item_1:12524'), ore('platePolybenzimidazole')], [ore('cableGtSingleNaquadah'), item('gregtech:machine_casing', 7), ore('cableGtSingleNaquadah')]]);
// 
// assembler.recipeBuilder()
// .inputs(item('gregtech:meta_item_1:12524') * 8)
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 8}))
// .outputs(item('gregtech:machine_casing', 7))
// .duration(40)
// .EUt(1024)
// .buildAndRegister();

// HV Quadruple Hatch
crafting.addShaped(metaitem('tjceu:fluid_hatch.import_4x.hv'), [[ore('craftingToolScrewdriver')], [metaitem('tjceu:fluid_hatch.export_4x.hv')]])
crafting.addShaped(metaitem('tjceu:fluid_hatch.export_4x.hv'), [[ore('craftingToolScrewdriver')], [metaitem('tjceu:fluid_hatch.import_4x.hv')]])

ASSEMBLER.recipeBuilder()
        .circuitMeta(4)
        .inputs(metaitem('fluid_hatch.import.hv'))
        .inputs(ore('pipeQuadrupleFluidSteel'))
        .fluidInputs(fluid('polytetrafluoroethylene') * 576)
        .outputs(metaitem('tjceu:fluid_hatch.import_4x.hv'))
        .duration(300)
        .EUt(480)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .circuitMeta(4)
        .inputs(metaitem('fluid_hatch.export.hv'))
        .inputs(ore('pipeQuadrupleFluidSteel'))
        .fluidInputs(fluid('polytetrafluoroethylene') * 576)
        .outputs(metaitem('tjceu:fluid_hatch.export_4x.hv'))
        .duration(300)
        .EUt(480)
        .buildAndRegister()

// HV Nonuple Hatch
crafting.addShaped(metaitem('tjceu:fluid_hatch.import_9x.hv'), [[ore('craftingToolScrewdriver')], [metaitem('tjceu:fluid_hatch.export_9x.hv')]])
crafting.addShaped(metaitem('tjceu:fluid_hatch.export_9x.hv'), [[ore('craftingToolScrewdriver')], [metaitem('tjceu:fluid_hatch.import_9x.hv')]])

ASSEMBLER.recipeBuilder()
        .circuitMeta(9)
        .inputs(metaitem('fluid_hatch.import.hv'))
        .inputs(ore('pipeNonupleFluidSteel'))
        .fluidInputs(fluid('polytetrafluoroethylene') * 1296)
        .outputs(metaitem('tjceu:fluid_hatch.import_9x.hv'))
        .duration(300)
        .EUt(480)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .circuitMeta(9)
        .inputs(metaitem('fluid_hatch.export.hv'))
        .inputs(ore('pipeNonupleFluidSteel'))
        .fluidInputs(fluid('polytetrafluoroethylene') * 1296)
        .outputs(metaitem('tjceu:fluid_hatch.export_9x.hv'))
        .duration(300)
        .EUt(480)
        .buildAndRegister()

crafting.addShaped(metaitem('electric_blast_furnace') * 3, [
        [ore('craftingFurnace'), ore('craftingFurnace'), ore('craftingFurnace')],
        [ore('circuitMv'), item('gregtech:metal_casing', 2), ore('circuitMv')],
        [ore('cableGtSingleTin'), ore('circuitMv'), ore('cableGtSingleTin')]
])

crafting.addShaped(metaitem('compressed.coke_clay') * 4, [
        [item('minecraft:clay_ball'), item('minecraft:clay_ball'), item('minecraft:clay_ball')],
        [ore('sand'), metaitem('wooden_form.brick'), ore('sand')],
        [ore('sand'), ore('sand'), ore('sand')]
])

BREWERY.recipeBuilder()
        .inputs(metaitem('plant_ball'))
        .fluidInputs(fluid('water') * 180)
        .fluidOutputs(fluid('biomass') * 270)
        .duration(1440)
        .EUt(3)
        .buildAndRegister()

AUTOCLAVE.recipeBuilder()
        .inputs(item('minecraft:experience_bottle'))
        .fluidInputs(fluid('methane') * 1000)
        .outputs(metaitem('bottle.purple.drink') * 10) // TODO: GTFO
        .duration(60)
        .EUt(30)
        .buildAndRegister()

//TODO: from OtherRecipes


// //Utils.removeRecipeByOutput(CIRCUIT_ASSEMBLER, [item('gregtech:meta_item_2:32488')], [], false)
// //Utils.removeRecipeByOutput(assembler, [ore('componentCapacitor')], [], false)
// //crafting.addShaped(ore('componentCapacitor'), [[ore('foilAluminium'), ore('foilAluminium'), ore('foilAluminium')],[ore('foilAluminium'), ore('foilAluminium'), ore('foilAluminium')], [ore('wireGtSingleTin'), null, ore('wireGtSingleTin')]])
// crafting.addShaped(ore('componentTransistor'), [[ore('foilSilicon'), ore('foilSilicon'), ore('foilSilicon')], [ore('foilSilicon'), ore('foilSilicon'), ore('foilSilicon')], [ore('wireGtSingleTin'), ore('wireGtSingleTin'), ore('wireGtSingleTin')]])

// Utils.removeRecipeByOutput(macerator, [item('gregtech:meta_item_1:2345')], [], false) //Flour

// MACERATOR.recipeBuilder()
//         .inputs(ore('cropWheat,itemWheat'))
//         .outputs(item('gregtech:meta_item_1:2345') * 2)
//         .chancedOutput(item('gregtech:meta_item_1:2345'), 1000, 1000)
//         .duration(120)
//         .EUt(17)
//         .buildAndRegister()

// crafting.addShaped(item('gregtech:meta_item_1:32519'), [[ore('dustSodium'), ore('dustSodium'), ore('dustSodium')], [ore('dustSodium'), ore('dustSodium'), ore('dustSodium')], [null, item('gregtech:meta_item_1', 717), null]])


// crafting.removeByOutput(item('gregtech:mte', 9))
// crafting.removeByOutput(item('gregtech:mte', 10))
// crafting.removeByOutput(item('gregtech:mte', 11))
// crafting.removeByOutput(item('gregtech:mte', 7))
// crafting.addShaped(item('gregtech:mte', 9), [[item('contenttweaker:steampiston'), item('gregtech:fluid_pipe:1095'), item('contenttweaker:steampiston')], [item('gregtech:fluid_pipe:1095'), item('gregtech:steam_casing'), item('gregtech:fluid_pipe:1095')], [metaitem('tjceu:steam.motor.ulv'), item('gregtech:fluid_pipe:1095'), metaitem('tjceu:steam.motor.ulv')]])
// crafting.addShaped(item('gregtech:mte', 10), [[item('contenttweaker:steampiston'), item('gregtech:fluid_pipe:1184'), item('contenttweaker:steampiston')], [item('gregtech:fluid_pipe:1184'), item('gregtech:steam_casing', 2), item('gregtech:fluid_pipe:1184')], [metaitem('tjceu:steam.motor.ulv'), item('gregtech:fluid_pipe:1184'), metaitem('tjceu:steam.motor.ulv')]])
// crafting.removeByOutput(item('gregtech:mte', 12))
// crafting.addShaped(item('gregtech:mte', 12), [[item('gregtech:fluid_pipe:1184'), item('gregtech:fluid_pipe:1184'), item('gregtech:fluid_pipe:1184')], [metaitem('tjceu:steam.motor.ulv'), item('gregtech:steam_casing', 2), item('contenttweaker:steampiston')], [item('gregtech:fluid_pipe:1184'), item('gregtech:fluid_pipe:1184'), item('gregtech:fluid_pipe:1184')]])
// crafting.addShaped(item('gregtech:mte', 11), [[item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095')], [metaitem('tjceu:steam.motor.ulv'), item('gregtech:steam_casing'), item('contenttweaker:steampiston')], [item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095')]])
// crafting.addShaped(item('gregtech:mte', 7), [[item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095')], [item('contenttweaker:steampiston'), item('gregtech:steam_casing'), item('minecraft:glass')], [item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095')]])
// crafting.removeByOutput(item('gregtech:machine:2235'))
// crafting.addShaped(item('gregtech:machine:2235'), [[item('minecraft:glass'), ore('rotorBronze'), item('minecraft:glass')], [item('contenttweaker:steampiston'), item('gregtech:fluid_pipe:1184'), item('contenttweaker:steampiston')], [item('gregtech:fluid_pipe:1184'), item('gregtech:steam_casing'), item('gregtech:fluid_pipe:1184')]])
// crafting.removeByOutput(item('gregtech:mte', 985))
// crafting.addShaped(item('gregtech:mte', 985), [[null, null, null], [ore('plateWroughtIron'), ore('plateWroughtIron'), ore('plateWroughtIron')], [ore('cableGtSingleLead'), item('gregtech:machine_casing'), ore('cableGtSingleLead')]])
// recipes.removeShaped(ore('blockHopper'), [[ore('ingotIron'), null, ore('ingotIron')], [ore('ingotIron'), ore('chest,chestWood'), ore('ingotIron')], [null, ore('ingotIron'), null]])

// furnace.addRecipe(item('minecraft:glass'), item('gregtech:meta_item_1:2960'), 0.0) //Quartz Sand

// TODO: this chanbges it to use a EV circuit instead of a IV one
// Dunno if it's worth it to change
// crafting.removeByOutput(item('gregtech:machine:2540')) 
// crafting.addShaped(item('gregtech:machine:2540'), [[item('gregtech:meta_item_1:32643'), ore('circuitEv'), item('gregtech:meta_item_1:32643')], [item('gregtech:meta_item_1:32603'), metaitem('hull.ev'), item('gregtech:meta_item_1:32603')], [ore('gearTitanium'), ore('wireGtSingleTungstenSteel'), ore('gearTitanium')]])


// Arc Furnaces
// crafting.removeByOutput(item('gregtech:mte', 97))
// crafting.removeByOutput(item('gregtech:mte', 96))
// crafting.removeByOutput(item('gregtech:mte', 95))
// crafting.addShaped(item('gregtech:mte', 97), [[ore('cableGtQuadrupleGold'), item('gregtech:meta_item_1:10012'), ore('cableGtQuadrupleGold')], [ore('circuitHv'), metaitem('hull.hv'), ore('circuitHv')], [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]])
// crafting.addShaped(item('gregtech:mte', 96), [[ore('cableGtQuadrupleCopper'), item('gregtech:meta_item_1:10012'), ore('cableGtQuadrupleCopper')], [ore('circuitGood'), item('gregtech:mte', 987), ore('circuitGood')], [ore('plateAluminium'), ore('plateAluminium'), ore('plateAluminium')]])
// crafting.addShaped(item('gregtech:mte', 95), [[ore('cableGtQuadrupleTin'), item('gregtech:meta_item_1:10012'), ore('cableGtQuadrupleTin')], [ore('circuitBasic'), item('gregtech:mte', 986), ore('circuitBasic')], [ore('plateSteel'), ore('plateSteel'), ore('plateSteel')]])
// crafting.addShaped(ore('blockStainlessSteel'), [[ore('ingotStainlessSteel'), ore('ingotStainlessSteel'), ore('ingotStainlessSteel')], [ore('ingotStainlessSteel'), ore('ingotStainlessSteel'), ore('ingotStainlessSteel')], [ore('ingotStainlessSteel'), ore('ingotStainlessSteel'), ore('ingotStainlessSteel')]])


// Utils.removeRecipeByOutput(mixer, [ore('dustTungstenCarbide')], [], false)
// Utils.removeRecipeByOutput(largeMix, [ore('dustTungstenCarbide')], [], false)


// Utils.removeRecipeByOutput(fusion, [], [fluid('plutonium') * 16], false)
// FUSION_REACTOR.recipeBuilder()
//         .fluidInputs(fluid('helium') * 16, fluid('uranium') * 16)
//         .fluidOutputs(fluid('plutonium') * 16)
//         .EUToStart(120000000)
//         .duration(128)
//         .EUt(32000)
//         .buildAndRegister()


// Freedom wrench
// Utils.removeRecipeByOutput(assembler, [item('gtadditions:ga_meta_item:32309').withNbt({ "GT.Detrav" : {} })], [], false)

// crafting.addShaped(item('gtadditions:ga_meta_item:32309').withNbt({ "GT.Detrav" :
//     {} }), [[ore('plateDoubleSteel'), ore('plateDoubleSteel'), metaitem('tjceu:steam.motor.ulv')], [item('contenttweaker:steampiston'), ore('plateDoubleSteel'), ore('plateDoubleSteel')], [ore('plateDoubleSteel'), item('contenttweaker:steampiston'), ore('plateDoubleSteel')]])
// crafting.removeByOutput(item('gregtech:machine:2004'))