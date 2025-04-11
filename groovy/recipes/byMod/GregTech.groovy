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

// Steam Miner
// crafting.removeByOutput(item('gregtech:machine:4212'))
// crafting.addShaped(item('gregtech:machine:4212'), [[item('gregtech:fluid_pipe:2095'), item('gregtech:fluid_pipe:2095'), item('gregtech:fluid_pipe:2095')], [item('contenttweaker:steampiston'), item('gregtech:steam_casing'), item('contenttweaker:steampiston')], [ore('rotorBronze'), item('gregtech:fluid_pipe:2095'), ore('rotorBronze')]])


// Fluid Drilling Rig
// Utils.removeRecipeByOutput(assembler, [item('gregtech:machine:4239')], [], true)

// ASSEMBLER.recipeBuilder()
//         .inputs(item('gregtech:meta_item_1:32600') * 4, metaitem('electric.pump.lv') * 4, item('gregtech:mte', 986), item('gregtech:meta_block_frame_20', 4), item('gregtech:meta_item_2:26017') * 2, ore('circuitBasic'))
//         .circuitMeta(2)
//         .outputs(item('gregtech:machine:4239'))
//         .EUt(30)
//         .duration(400)
//         .buildAndRegister()

// TODO: some of these might come from gcyl idk
// Utils.removeRecipeByOutput(fusion, [], [fluid('rutherfordium')], false)
// Utils.removeRecipeByOutput(fusion, [], [fluid('duranium')], false)
// Utils.removeRecipeByOutput(fusion, [], [fluid('tritanium')], false)
// Utils.removeRecipeByOutput(fusion, [], [fluid('plasma.radon')], false)
// Utils.removeRecipeByOutput(fusion, [], [fluid('dubnium')], false)


// furnace.removeByOutput(ore('ingotDuranium'))
// furnace.removeByOutput(ore('ingotRutherfordium'))
// furnace.removeByOutput(ore('ingotTritanium'))

// TODO: blast property
// EBF.recipeBuilder()
//         .inputs(ore('dustRutherfordium'))
//         .outputs(ore('ingotRutherfordium'))
//         .blastFurnaceTemp(5400) //this is a minimal temperature at which the item will be smelted
//         .duration(16560)
//         .EUt(120)
//         .buildAndRegister()

// EBF.recipeBuilder()
//         .inputs(ore('dustTritanium'))
//         .outputs(ore('ingotTritanium'))
//         .blastFurnaceTemp(11000) //this is a minimal temperature at which the item will be smelted
//         .duration(16560)
//         .EUt(120)
//         .buildAndRegister()


// EBF.recipeBuilder()
//         .inputs(ore('dustDuranium'))
//         .outputs(ore('ingotDuranium'))
//         .blastFurnaceTemp(6000) //this is a minimal temperature at which the item will be smelted
//         .duration(16560)
//         .EUt(120)
//         .buildAndRegister()


// FUSION_REACTOR.recipeBuilder()
//         .fluidInputs(fluid('neon') * 144, fluid('plutonium') * 144)
//         .fluidOutputs(fluid('rutherfordium') * 144)
//         .EUToStart(150000000)
//         .duration(64)
//         .EUt(16384)
//         .buildAndRegister()

// FUSION_REACTOR.recipeBuilder()
//         .fluidInputs(fluid('radon') * 1125, fluid('gallium') * 144)
//         .fluidOutputs(fluid('duranium') * 144)
//         .EUToStart(180000000)
//         .duration(64)
//         .EUt(24576)
//         .buildAndRegister()

// FUSION_REACTOR.recipeBuilder()
//         .fluidInputs(fluid('duranium') * 288, fluid('titanium') * 432)
//         .fluidOutputs(fluid('tritanium') * 144)
//         .EUToStart(200000000)
//         .duration(64)
//         .EUt(32768)
//         .buildAndRegister()

// FUSION_REACTOR.recipeBuilder()
//         .fluidInputs(fluid('mercury') * 64, fluid('gold') * 64)
//         .fluidOutputs(fluid('plasma.radon') * 500)
//         .EUToStart(200000000)
//         .duration(64)
//         .EUt(32768)
//         .buildAndRegister()

// FUSION_REACTOR.recipeBuilder()
//         .fluidInputs(fluid('neon') * 288, fluid('americium') * 288)
//         .fluidOutputs(fluid('dubnium') * 288)
//         .EUToStart(200000000)
//         .duration(64)
//         .EUt(131072)
//         .buildAndRegister()

// FUSION_REACTOR.recipeBuilder()
//         .fluidInputs(fluid('neon') * 288, fluid('americium243') * 288)
//         .fluidOutputs(fluid('dubnium') * 288)
//         .EUToStart(200000000)
//         .duration(64)
//         .EUt(131072)
//         .buildAndRegister()


// COMPRESSOR.recipeBuilder()
//         .inputs(item('minecraft:apple') * 8)
//         .outputs(metaitem('plant_ball'))
//         .duration(300)
//         .EUt(2)
//         .buildAndRegister()


// Utils.removeRecipeByOutput(blast_furnace, [ore('ingotHotVanadium')], [], false)

// EBF.recipeBuilder()
//         .inputs(ore('dustVanadium'))
//         .circuitMeta(1)
//         .outputs(ore('ingotHotVanadium'))
//         .blastFurnaceTemp(2183) //this is a minimal temperature at which the item will be smelted
//         .duration(2226)
//         .EUt(120)
//         .buildAndRegister()


// //Fix blood ratio TODO: is this a gcyl or gt thing
// Utils.removeRecipeByOutput(centrifuge, [], [fluid('blood') * 250], true)
// Utils.removeRecipeByOutput(large_centrifuge, [], [fluid('blood') * 250], true)


// IMPLOSION_COMPRESSOR.recipeBuilder()
//         .inputs(item('gregtech:meta_item_2:32434'))
//         .explosives(item('gregtech:itnt') * 4)
//         .outputs(item('gregtech:meta_item_2:32435'))
//         .duration(20)
//         .EUt(30)
//         .buildAndRegister()

// IMPLOSION_COMPRESSOR.recipeBuilder()
//         .inputs(ore('dustDiamond') * 4)
//         .explosives(item('gregtech:itnt') * 24)
//         .outputs(ore('gemDiamond') * 3)
//         .duration(20)
//         .EUt(30)
//         .buildAndRegister()


// ELECTROLYZER.findRecipe(30, [item('minecraft:snowball') * 3], null).remove()

// ELECTROLYZER.recipeBuilder()
//         .inputs(item('minecraft:snowball') * 4)
//         .fluidOutputs([fluid('hydrogen') * 2000, fluid('oxygen') * 1000])
//         .duration(1244)
//         .EUt(30)
//         .buildAndRegister()


// MAX hatches
// crafting.removeByOutput(item('gregtech:machine', 793))
// crafting.removeByOutput(item('gregtech:machine', 792))
// crafting.removeByOutput(item('gregtech:machine', 791))
// crafting.removeByOutput(item('gregtech:machine', 790))

// crafting.addShaped(item('gregtech:machine', 793), [[null, null, null], [null, item('gregtech:mte', 994), null], [null, item('minecraft:glass'), null]])
// crafting.addShaped(item('gregtech:machine', 792), [[null, item('minecraft:glass'), null], [null, item('gregtech:mte', 994), null], [null, null, null]])
// crafting.addShaped(item('gregtech:machine', 791), [[null, null, null], [null, item('gregtech:mte', 994), null], [null, ore('chest,chestWood'), null]])
// crafting.addShaped(item('gregtech:machine', 790), [[null, ore('chest,chestWood'), null], [null, item('gregtech:mte', 994), null], [null, null, null]])


// Utils.removeRecipeByOutput(mixer, [ore('dustSterlingSilver')], [], false)


// MIXER.recipeBuilder()
//         .inputs(ore('dustCopper'))
//         .inputs(ore('dustSilver') * 4)
//         .circuitMeta(2)
//         .outputs(ore('dustSterlingSilver') * 5)
//         .duration(20)
//         .EUt(8)
//         .buildAndRegister()


// ELECTROLYZER.recipeBuilder()
//         .inputs(ore('dustDiamond'))
//         .outputs(ore('dustCarbon,dyeBlack') * 64)
//         .duration(608)
//         .EUt(30)
//         .buildAndRegister()

// //Diamond upcraft
// engraver.recipeBuilder()
//         .inputs(ore('gemDiamond') * 4)
//         .notConsumable(ore('craftingLensWhite'))
//         .outputs(ore('gemFlawlessDiamond'))
//         .duration(2400)
//         .EUt(2000)
//         .buildAndRegister()

// engraver.recipeBuilder()
//         .inputs(ore('gemFlawlessDiamond') * 4)
//         .notConsumable(ore('craftingLensWhite'))
//         .outputs(ore('gemExquisiteDiamond'))
//         .duration(2400)
//         .EUt(2000)
//         .buildAndRegister()

// large_engrav.recipeBuilder()
//         .inputs(ore('gemDiamond') * 4)
//         .notConsumable(ore('craftingLensWhite'))
//         .outputs(ore('gemFlawlessDiamond'))
//         .duration(2400)
//         .EUt(2000)
//         .buildAndRegister()

// large_engrav.recipeBuilder()
//         .inputs(ore('gemFlawlessDiamond') * 4)
//         .notConsumable(ore('craftingLensWhite'))
//         .outputs(ore('gemExquisiteDiamond'))
//         .duration(2400)
//         .EUt(2000)
//         .buildAndRegister()


// furnace.removeByOutput(ore('ingotNaquadria'))


// crafting.addShaped(item('gregtech:machine', 819), [[item('gregtech:meta_item_2:17850'), ore('gearHsss'), item('gregtech:meta_item_2:17850')], [ore('gearHsss'), item('gregtech:mte', 994), ore('gearHsss')], [item('gregtech:meta_item_2:17850'), ore('gearHsss'), item('gregtech:meta_item_2:17850')]])
// crafting.addShaped(item('gregtech:machine:3210'), [[item('gregtech:meta_item_2:17850'), ore('gearSeaborgium'), item('gregtech:meta_item_2:17850')], [ore('gearSeaborgium'), item('gregtech:mte', 994), ore('gearSeaborgium')], [item('gregtech:meta_item_2:17850'), ore('gearSeaborgium'), item('gregtech:meta_item_2:17850')]])
// crafting.addShaped(item('gregtech:machine', 818), [[ore('gearSmallTungstenSteel'), item('gregtech:meta_item_2:26016'), ore('gearSmallTungstenSteel')], [item('gregtech:meta_item_2:26016'), item('gregtech:mte', 991), item('gregtech:meta_item_2:26016')], [ore('gearSmallTungstenSteel'), item('gregtech:meta_item_2:26016'), ore('gearSmallTungstenSteel')]])
// crafting.addShaped(item('gregtech:machine:3209'), [[ore('gearSmallTungstenSteel'), ore('gearRhodiumPlatedPalladium'), ore('gearSmallTungstenSteel')], [ore('gearRhodiumPlatedPalladium'), item('gregtech:mte', 991), ore('gearRhodiumPlatedPalladium')], [ore('gearSmallTungstenSteel'), ore('gearRhodiumPlatedPalladium'), ore('gearSmallTungstenSteel')]])
// crafting.addShaped(item('gregtech:machine', 817), [[ore('gearSmallAluminium'), ore('gearStainlessSteel'), ore('gearSmallAluminium')], [ore('gearStainlessSteel'), metaitem('hull.hv'), ore('gearStainlessSteel')], [ore('gearSmallAluminium'), ore('gearStainlessSteel'), ore('gearSmallAluminium')]])
// crafting.addShaped(item('gregtech:machine:3208'), [[ore('gearSmallAluminium'), ore('gearBlackSteel'), ore('gearSmallAluminium')], [ore('gearBlackSteel'), metaitem('hull.hv'), ore('gearBlackSteel')], [ore('gearSmallAluminium'), ore('gearBlackSteel'), ore('gearSmallAluminium')]])


// Utils.removeRecipeByOutput(mixer, [ore('dustNichrome') * 5], [], true)

// MIXER.recipeBuilder()
//         .inputs(ore('dustNickel') * 4)
//         .inputs(ore('dustChrome'))
//         .outputs(ore('dustNichrome') * 5)
//         .circuitMeta(11)
//         .duration(280)
//         .EUt(30)
//         .buildAndRegister()


// MIXER.recipeBuilder()
//         .inputs(ore('sand') * 8)
//         .circuitMeta(0)
//         .outputs(ore('blockClay,oreClay') * 8)
//         .fluidInputs(fluid('water') * 1000)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister()

// LARGE_MIXER.recipeBuilder()
//         .inputs(ore('sand') * 8)
//         .circuitMeta(0)
//         .outputs(ore('blockClay,oreClay') * 8)
//         .fluidInputs(fluid('water') * 1000)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister()


// //OpV componets


// assembly_line.recipeBuilder()
//         .inputs(ore('stickLongNaquadriaticTaranium') * 2)
//         .inputs(ore('stickLongNaquadriaticTaranium') * 2)
//         .inputs(ore('wireFineMetastableOganesson') * 64)
//         .inputs(ore('wireFineMetastableOganesson') * 64)
//         .inputs(ore('wireFineMetastableOganesson') * 64)
//         .inputs(ore('wireFineMetastableOganesson') * 64)
//         .inputs(ore('roundNeutronium') * 16)
//         .inputs(ore('ringNeutronium') * 4)
//         .inputs(ore('stickLongNeutronium') * 2)
//         .inputs(ore('cableGtQuadrupleNeutronium') * 2)
//         .outputs(item('gregtech:meta_item_1', 138))
//         .fluidInputs(fluid('lubricant') * 3000, fluid('soldering_alloy') * 1728)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()

// assembly_line.recipeBuilder()
//         .inputs(item('gregtech:meta_item_1', 138))
//         .inputs(ore('ingotNeutronium') * 2)
//         .inputs(ore('stickNeutronium') * 4)
//         .inputs(ore('gearSmallNeutronium') * 8)
//         .inputs(ore('plateNeutronium') * 8)
//         .inputs(ore('cableGtSingleNeutronium') * 2)
//         .outputs(item('gregtech:meta_item_1', 183))
//         .fluidInputs(fluid('lubricant') * 2000, fluid('soldering_alloy') * 576)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()

// assembly_line.recipeBuilder()
//         .inputs(item('gregtech:meta_item_1', 138) * 2)
//         .inputs(ore('gearNeutronium') * 4)
//         .inputs(ore('stickNeutronium') * 4)
//         .inputs(ore('plateNeutronium') * 8)
//         .inputs(ore('ingotNeutronium') * 2)
//         .inputs(ore('cableGtSingleNeutronium') * 2)
//         .outputs(item('gregtech:meta_item_1', 168))
//         .fluidInputs(fluid('lubricant') * 5000, fluid('zylon') * 1440)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()


// assembly_line.recipeBuilder()
//         .inputs(item('gregtech:meta_item_1', 138))
//         .inputs(ore('rotorNeutronium') * 2)
//         .inputs(ore('screwNeutronium') * 8)
//         .inputs(ore('ringSiliconeRubber') * 16)
//         .inputs(ore('cableGtSingleNeutronium') * 2)
//         .inputs(item('gregtech:fluid_pipe:3993') * 16)
//         .outputs(item('gregtech:meta_item_1', 153))
//         .fluidInputs(fluid('lubricant') * 2000, fluid('soldering_alloy') * 576)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()

// assembly_line.recipeBuilder()
//         .inputs(item('gtadditions:ga_dust', 380) * 64)
//         .inputs(ore('circuitOpv') * 2)
//         .inputs(ore('frameGtNeutronium'))
//         .inputs(ore('gemExquisiteJasper') * 2)
//         .inputs(item('gcyl:gcyl_meta_item', 533))
//         .inputs(item('gcyl:gcyl_meta_item', 524) * 4)
//         .inputs(ore('cableGtSingleNeutronium') * 8)
//         .inputs(ore('foilBohrium') * 64)
//         .outputs(item('gregtech:meta_item_1', 228))
//         .fluidInputs(fluid('lubricant') * 2000, fluid('soldering_alloy') * 576)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()

// assembly_line.recipeBuilder()
//         .inputs(item('gcyl:gcyl_meta_item', 597))
//         .inputs(item('gtadditions:ga_meta_item2', 10))
//         .inputs(ore('wireGtSingleOpvSuperconductor') * 4)
//         .inputs(ore('circuitOpv') * 2)
//         .inputs(item('gcyl:gcyl_meta_item', 511))
//         .inputs(ore('frameGtVibranium'))
//         .inputs(ore('cableGtSingleNeutronium') * 4)
//         .inputs(ore('wireFineVibranium') * 64)
//         .inputs(ore('wireFineVibranium') * 64)
//         .outputs(metaitem('field.generator.opv'))
//         .fluidInputs(fluid('soldering_alloy') * 864)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()

// assembly_line.recipeBuilder()
//         .inputs(ore('cableGtDoubleNeutronium') * 16)
//         .inputs(ore('circuitUiv') * 8)
//         .inputs(ore('screwNeutronium') * 16)
//         .inputs(ore('stickNeutronium') * 16)
//         .inputs(ore('ingotNeutronium'))
//         .inputs(item('gregtech:meta_item_1', 183))
//         .inputs(item('gregtech:meta_item_1', 138) * 2)
//         .outputs(item('gregtech:meta_item_1', 198))
//         .fluidInputs(fluid('soldering_alloy') * 864, fluid('lubricant') * 864)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()

// assembly_line.recipeBuilder()
//         .inputs(ore('circuitOpv') * 2)
//         .inputs(ore('cableGtSingleNeutronium') * 8)
//         .inputs(ore('frameGtNeutronium'))
//         .inputs(ore('gemExquisiteJasper') * 2)
//         .inputs(item('gcyl:gcyl_meta_item', 459) * 16)
//         .inputs(ore('foilMetastableOganesson') * 64)
//         .inputs(ore('foilFullerenePolymerMatrix') * 64)
//         .outputs(item('gregtech:meta_item_1', 243))
//         .fluidInputs(fluid('quark_gluon_plasma') * 2000)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()


// TODO: high-tier solar panels
// //solar panels
// crafting.removeByOutput(item('gregtech:meta_item_1:32752'))
// crafting.addShaped(item('gregtech:meta_item_2:32714'), [[item('gregtech:meta_item_1', 242), ore('gemExquisiteLeadZirconateTitanate'), item('gregtech:meta_item_1', 242)], [ore('circuitUiv'), item('gregtech:mte', 996), ore('circuitUiv')], [ore('cableGtSingleBlackTitanium'), item('gtadditions:ga_meta_item2', 7), ore('cableGtSingleBlackTitanium')]])
// crafting.addShaped(item('gregtech:meta_item_2:32713'), [[item('gregtech:meta_item_1', 241), ore('gemExquisiteCubicZirconia'), item('gregtech:meta_item_1', 241)], [ore('circuitUev'), item('gregtech:mte', 995), ore('circuitUev')], [ore('cableGtSingleTitanSteel'), item('gtadditions:ga_meta_item2', 4), ore('cableGtSingleTitanSteel')]])
// crafting.addShaped(item('gregtech:meta_item_2:32712'), [[item('gregtech:meta_item_1', 240), ore('gemExquisiteRhodiumSalt'), item('gregtech:meta_item_1', 240)], [ore('circuitInfinite'), item('gregtech:mte', 994), ore('circuitInfinite')], [ore('cableGtSingleAbyssalAlloy'), item('gregtech:meta_item_1:32598'), ore('cableGtSingleAbyssalAlloy')]])
// crafting.addShaped(item('gregtech:meta_item_2:32712'), [[item('gregtech:meta_item_1', 240), ore('gemExquisiteRhodiumSalt'), item('gregtech:meta_item_1', 240)], [ore('circuitInfinite'), item('gregtech:mte', 994), ore('circuitInfinite')], [ore('cableGtSingleAbyssalAlloy'), item('gtadditions:ga_meta_item2', 6), ore('cableGtSingleAbyssalAlloy')]])
// crafting.addShaped(item('gregtech:meta_item_2:32711'), [[item('gregtech:meta_item_1:32697'), ore('gemExquisiteBlueTopaz'), item('gregtech:meta_item_1:32697')], [ore('circuitUv'), item('gregtech:mte', 993), ore('circuitUv')], [ore('cableGtSingleDuranium'), item('gregtech:meta_item_1:32597'), ore('cableGtSingleDuranium')]])
// crafting.addShaped(item('gregtech:meta_item_2:32711'), [[item('gregtech:meta_item_1:32697'), ore('gemExquisiteBlueTopaz'), item('gregtech:meta_item_1:32697')], [ore('circuitUv'), item('gregtech:mte', 993), ore('circuitUv')], [ore('cableGtSingleDuranium'), item('gtadditions:ga_meta_item2', 3), ore('cableGtSingleDuranium')]])
// crafting.addShaped(item('gregtech:meta_item_2:32710'), [[item('gregtech:meta_item_1:32696'), ore('gemExquisiteEmerald'), item('gregtech:meta_item_1:32696')], [ore('circuitZpm'), item('gregtech:mte', 992), ore('circuitZpm')], [ore('cableGtSingleNaquadah'), item('gtadditions:ga_meta_item2', 1), ore('cableGtSingleNaquadah')]])
// crafting.addShaped(item('gregtech:meta_item_2:32710'), [[item('gregtech:meta_item_1:32696'), ore('gemExquisiteEmerald'), item('gregtech:meta_item_1:32696')], [ore('circuitZpm'), item('gregtech:mte', 992), ore('circuitZpm')], [ore('cableGtSingleNaquadah'), ore('lampGtWhite'), ore('cableGtSingleNaquadah')]])
// crafting.addShaped(item('gregtech:meta_item_2:32709'), [[item('gregtech:meta_item_1:32695'), ore('gemExquisiteRuby'), item('gregtech:meta_item_1:32695')], [ore('circuitMaster'), item('gregtech:mte', 991), ore('circuitMaster')], [ore('cableGtSingleYttriumBariumCuprate'), item('gregtech:meta_item_2:32212'), ore('cableGtSingleYttriumBariumCuprate')]])
// crafting.addShaped(item('gregtech:meta_item_2:32709'), [[item('gregtech:meta_item_1:32695'), ore('gemExquisiteRuby'), item('gregtech:meta_item_1:32695')], [ore('circuitMaster'), item('gregtech:mte', 991), ore('circuitMaster')], [ore('cableGtSingleYttriumBariumCuprate'), item('gregtech:meta_item_1:32537'), ore('cableGtSingleYttriumBariumCuprate')]])
// crafting.addShaped(item('gregtech:meta_item_2:32709'), [[item('gregtech:meta_item_1:32695'), ore('gemExquisiteRuby'), item('gregtech:meta_item_1:32695')], [ore('circuitMaster'), item('gregtech:mte', 991), ore('circuitMaster')], [ore('cableGtSingleYttriumBariumCuprate'), item('gregtech:meta_item_1:32539'), ore('cableGtSingleYttriumBariumCuprate')]])
// crafting.addShaped(item('gregtech:meta_item_2:32709'), [[item('gregtech:meta_item_1:32695'), ore('gemExquisiteRuby'), item('gregtech:meta_item_1:32695')], [ore('circuitMaster'), item('gregtech:mte', 991), ore('circuitMaster')], [ore('cableGtSingleYttriumBariumCuprate'), item('gregtech:meta_item_1:32538'), ore('cableGtSingleYttriumBariumCuprate')]])
// crafting.addShaped(item('gregtech:meta_item_2:32708'), [[item('gregtech:meta_item_1', 236), ore('gemExquisiteRuby'), item('gregtech:meta_item_1', 236)], [ore('circuitIv'), item('gregtech:mte', 990), ore('circuitIv')], [ore('cableGtSingleTungsten'), item('gregtech:meta_item_1:32528'), ore('cableGtSingleTungsten')]])
// crafting.addShaped(item('gregtech:meta_item_2:32708'), [[item('gregtech:meta_item_1', 236), ore('gemExquisiteRuby'), item('gregtech:meta_item_1', 236)], [ore('circuitIv'), item('gregtech:mte', 990), ore('circuitIv')], [ore('cableGtSingleTungsten'), item('gregtech:meta_item_1:32527'), ore('cableGtSingleTungsten')]])
// crafting.addShaped(item('gregtech:meta_item_2:32708'), [[item('gregtech:meta_item_1', 236), ore('gemExquisiteRuby'), item('gregtech:meta_item_1', 236)], [ore('circuitIv'), item('gregtech:mte', 990), ore('circuitIv')], [ore('cableGtSingleTungsten'), item('gregtech:meta_item_1:32529'), ore('cableGtSingleTungsten')]])
// crafting.addShaped(item('gregtech:meta_item_1:32752'), [[item('gregtech:meta_item_1:32693'), ore('gemExquisiteDiamond'), item('gregtech:meta_item_1:32693')], [ore('circuitEv'), metaitem('hull.ev'), ore('circuitEv')], [ore('cableGtSingleAluminium'), item('gregtech:meta_item_1:32517'), ore('cableGtSingleAluminium')]])
// crafting.addShaped(item('gregtech:meta_item_1:32752'), [[item('gregtech:meta_item_1:32693'), ore('gemExquisiteDiamond'), item('gregtech:meta_item_1:32693')], [ore('circuitEv'), metaitem('hull.ev'), ore('circuitEv')], [ore('cableGtSingleAluminium'), item('gregtech:meta_item_1:32518'), ore('cableGtSingleAluminium')]])
// crafting.addShaped(item('gregtech:meta_item_1:32752'), [[item('gregtech:meta_item_1:32693'), ore('gemExquisiteDiamond'), item('gregtech:meta_item_1:32693')], [ore('circuitEv'), metaitem('hull.ev'), ore('circuitEv')], [ore('cableGtSingleAluminium'), item('gregtech:meta_item_1:32519'), ore('cableGtSingleAluminium')]])


// //EV/IV motors
// crafting.removeByOutput(item('gregtech:meta_item_1:32604'))
// crafting.removeByOutput(item('gregtech:meta_item_1:32603'))

// crafting.addShaped(item('gregtech:meta_item_1:32604'), [[ore('cableGtSingleTungsten'), ore('wireGtQuadrupleBrightSteel'), ore('stickTungstenSteel')], [ore('wireGtQuadrupleBrightSteel'), ore('stickNeodymiumMagnetic'), ore('wireGtQuadrupleBrightSteel')], [ore('stickTungstenSteel'), ore('wireGtQuadrupleBrightSteel'), ore('cableGtSingleTungsten')]])
// crafting.addShaped(item('gregtech:meta_item_1:32603'), [[ore('cableGtSingleAluminium'), ore('wireGtQuadrupleGold'), ore('stickTitanium')], [ore('wireGtQuadrupleGold'), ore('stickNeodymiumMagnetic'), ore('wireGtQuadrupleGold')], [ore('stickTitanium'), ore('wireGtQuadrupleGold'), ore('cableGtSingleAluminium')]])


// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1:32603')], [], true)
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1:32604')], [], true)

// Utils.removeRecipeByOutput(assembly_line, [item('gregtech:meta_item_1:32603') * 16], [], true)
// Utils.removeRecipeByOutput(assembly_line, [item('gregtech:meta_item_1:32604') * 16], [], true)

// ASSEMBLER.recipeBuilder()
//         .inputs(ore('stickNeodymiumMagnetic'), ore('stickTitanium') * 2, ore('cableGtSingleAluminium') * 2, ore('wireGtQuadrupleGold') * 4)
//         .outputs(item('gregtech:meta_item_1:32603'))
//         .duration(100)
//         .EUt(1920)
//         .buildAndRegister()

// ASSEMBLER.recipeBuilder()
//         .inputs(ore('stickNeodymiumMagnetic'), ore('stickTungstenSteel') * 2, ore('cableGtSingleTungsten') * 2, ore('wireGtQuadrupleBrightSteel') * 4)
//         .outputs(item('gregtech:meta_item_1:32604'))
//         .duration(100)
//         .EUt(7680)
//         .buildAndRegister()


// assembly_line.recipeBuilder()
//         .inputs(item('gtadditions:ga_meta_item:2072') * 16, item('gtadditions:ga_meta_item:2072') * 16, item('gtadditions:ga_meta_item:2072') * 16, item('gtadditions:ga_meta_item:2072') * 16, ore('cableGtSingleAluminium') * 4, ore('cableGtSingleAluminium') * 4, ore('cableGtSingleAluminium') * 4, ore('cableGtSingleAluminium') * 4, ore('stickLongTitanium') * 4, ore('stickLongNeodymiumMagnetic') * 4)
//         .outputs(item('gregtech:meta_item_1:32603') * 16)
//         .fluidInputs(fluid('gold') * 1152)
//         .duration(6000)
//         .EUt(64000)
//         .buildAndRegister()

// assembly_line.recipeBuilder()
//         .inputs(item('gtadditions:ga_meta_item:2235') * 16, item('gtadditions:ga_meta_item:2235') * 16, item('gtadditions:ga_meta_item:2235') * 16, item('gtadditions:ga_meta_item:2235') * 16, ore('cableGtSingleTungsten') * 4, ore('cableGtSingleTungsten') * 4, ore('cableGtSingleTungsten') * 4, ore('cableGtSingleTungsten') * 4, ore('stickLongTungstenSteel') * 4, ore('stickLongNeodymiumMagnetic') * 4)
//         .outputs(item('gregtech:meta_item_1:32604') * 16)
//         .fluidInputs(fluid('bright_steel') * 1152)
//         .duration(6000)
//         .EUt(128000)
//         .buildAndRegister()


// var removals = [item('gtadditions:ga_machine_casing', 3), item('gregtech:machine_casing', 11)] as IItemStack[]
// for
// i in removals {
//     Utils.removeRecipeByOutput(assembler, [i], [], true)
//     crafting.removeByOutput(i)
// }

// var removals2 = [item('gregtech:mte', 997), item('gregtech:machine:3242'), item('gregtech:mte', 996)] as IItemStack[]
// for
// i in removals2 {
//     crafting.removeByOutput(i)
// }

// Utils.removeRecipeByOutput(assembler, [item('gregtech:machine', 509)], [], true)


// crafting.addShaped(item('gregtech:machine_casing', 14), [[ore('plateNeutronium'), ore('plateNeutronium'), ore('plateNeutronium')], [ore('plateNeutronium'), ore('craftingToolWrench'), ore('plateNeutronium')], [ore('plateNeutronium'), ore('plateNeutronium'), ore('plateNeutronium')]])
// crafting.addShaped(item('gregtech:machine_casing', 12), [[ore('plateHeavyQuarkDegenerateMatter'), ore('plateHeavyQuarkDegenerateMatter'), ore('plateHeavyQuarkDegenerateMatter')], [ore('plateHeavyQuarkDegenerateMatter'), ore('craftingToolWrench'), ore('plateHeavyQuarkDegenerateMatter')], [ore('plateHeavyQuarkDegenerateMatter'), ore('plateHeavyQuarkDegenerateMatter'), ore('plateHeavyQuarkDegenerateMatter')]])
// crafting.addShaped(item('gtadditions:ga_machine_casing', 3), [[ore('plateVibranium'), ore('plateVibranium'), ore('plateVibranium')], [ore('plateVibranium'), ore('craftingToolWrench'), ore('plateVibranium')], [ore('plateVibranium'), ore('plateVibranium'), ore('plateVibranium')]])
// crafting.addShaped(item('gregtech:machine_casing', 11), [[ore('plateAdamantium'), ore('plateAdamantium'), ore('plateAdamantium')], [ore('plateAdamantium'), ore('craftingToolWrench'), ore('plateAdamantium')], [ore('plateAdamantium'), ore('plateAdamantium'), ore('plateAdamantium')]])


// ASSEMBLER.recipeBuilder()
//         .inputs(ore('plateAdamantium') * 8)
//         .circuitMeta(8)
//         .outputs(item('gregtech:machine_casing', 11))
//         .duration(400)
//         .EUt(16)
//         .buildAndRegister()

// ASSEMBLER.recipeBuilder()
//         .inputs(ore('plateVibranium') * 8)
//         .circuitMeta(8)
//         .outputs(item('gtadditions:ga_machine_casing', 3))
//         .duration(400)
//         .EUt(16)
//         .buildAndRegister()

// ASSEMBLER.recipeBuilder()
//         .inputs(ore('plateHeavyQuarkDegenerateMatter') * 8)
//         .circuitMeta(8)
//         .outputs(item('gregtech:machine_casing', 12))
//         .duration(400)
//         .EUt(16)
//         .buildAndRegister()

// ASSEMBLER.recipeBuilder()
//         .inputs(ore('plateNeutronium') * 8)
//         .circuitMeta(8)
//         .outputs(item('gregtech:machine_casing', 14))
//         .duration(400)
//         .EUt(16)
//         .buildAndRegister()

// //OpV
// ASSEMBLER.recipeBuilder()
//         .inputs(item('gregtech:machine_casing', 12), ore('cableGtSingleNeutronium') * 2)
//         .outputs(item('gregtech:mte', 997))
//         .fluidInputs(fluid('fullerene_polymer_matrix') * 288)
//         .duration(400)
//         .EUt(16)
//         .buildAndRegister()
// //MAX
// ASSEMBLER.recipeBuilder()


//         .inputs(item('gregtech:machine_casing', 14), ore('cableGtSingleCosmicNeutronium') * 2)
//         .outputs(item('gregtech:machine', 509))
//         .fluidInputs(fluid('fullerene_polymer_matrix') * 288)
//         .duration(400)
//         .EUt(16)
//         .buildAndRegister()


// Utils.removeRecipeByOutput(assembler, [item('gregtech:multiblock_casing')], [], false)

// ASSEMBLER.recipeBuilder()
//         .inputs(item('gregtech:metal_casing', 6), ore('rotorTitanium') * 4, item('gregtech:fluid_pipe:2072') * 2)
//         .outputs(item('gregtech:multiblock_casing') * 2)
//         .duration(50)
//         .EUt(16)
//         .buildAndRegister()
