package recipes.byMod

// TODO: Modifie Machine Casings & Hull Recipes (ZPM, UIV, UXV, OpV, MAX)

ASSEMBLER = recipemap('assembler')
BREWERY = recipemap('brewery')
AUTOCLAVE = recipemap('autoclave')
MACERATOR = recipemap('macerator')
FUSION_REACTOR = recipemap('fusion_reactor')

// Hide items from JEI
mods.jei.ingredient.yeet(
        metaitem('cover.solar.panel'),
        metaitem('cover.solar.panel.ulv'),

        metaitem('steam_alloy_smelter_bronze'),
        metaitem('steam_alloy_smelter_steel'),
        metaitem('steam_hammer_bronze'),
)

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

//Utils.removeRecipeByOutput(CIRCUIT_ASSEMBLER, [item('gregtech:meta_item_2:32488')], [], false)
//Utils.removeRecipeByOutput(assembler, [ore('componentCapacitor')], [], false)
//crafting.addShaped(ore('componentCapacitor'), [[ore('foilAluminium'), ore('foilAluminium'), ore('foilAluminium')],[ore('foilAluminium'), ore('foilAluminium'), ore('foilAluminium')], [ore('wireGtSingleTin'), null, ore('wireGtSingleTin')]])
crafting.addShaped(metaitem('component.transistor'), [[ore('foilSilicon'), ore('foilSilicon'), ore('foilSilicon')], [ore('foilSilicon'), ore('foilSilicon'), ore('foilSilicon')], [ore('wireGtSingleTin'), ore('wireGtSingleTin'), ore('wireGtSingleTin')]])

// Flour
mods.gregtech.macerator.removeByInput(2, [item('minecraft:wheat')], null)

MACERATOR.recipeBuilder()
        .inputs(ore('itemWheat'))
        .outputs(metaitem('dustWheat') * 2)
        .chancedOutput(metaitem('dustWheat'), 1000, 1000)
        .duration(120)
        .EUt(17)
        .buildAndRegister()

crafting.addShaped(metaitem('battery.re.lv.sodium'), [[ore('dustSodium'), ore('dustSodium'), ore('dustSodium')], [ore('dustSodium'), ore('dustSodium'), ore('dustSodium')], [null, item('gregtech:meta_item_1', 717), null]])


crafting.removeByOutput(item('gregtech:mte', 9))
crafting.removeByOutput(item('gregtech:mte', 10))
crafting.removeByOutput(item('gregtech:mte', 11))
crafting.removeByOutput(item('gregtech:mte', 7))
crafting.addShaped(item('gregtech:mte', 9), [[item('tjceu:tj_meta_item', 1), ore('pipeSmallFluidBronze'), item('tjceu:tj_meta_item', 1)], [ore('pipeSmallFluidBronze'), item('gregtech:steam_casing'), ore('pipeSmallFluidBronze')], [metaitem('tjceu:steam.motor.ulv'), ore('pipeSmallFluidBronze'), metaitem('tjceu:steam.motor.ulv')]])
crafting.addShaped(item('gregtech:mte', 10), [[item('tjceu:tj_meta_item', 1), ore('pipeSmallFluidSteel'), item('tjceu:tj_meta_item', 1)], [ore('pipeSmallFluidSteel'), item('gregtech:steam_casing', 2), ore('pipeSmallFluidSteel')], [metaitem('tjceu:steam.motor.ulv'), ore('pipeSmallFluidSteel'), metaitem('tjceu:steam.motor.ulv')]])
crafting.removeByOutput(item('gregtech:mte', 12))
crafting.addShaped(item('gregtech:mte', 12), [[ore('pipeSmallFluidSteel'), ore('pipeSmallFluidSteel'), ore('pipeSmallFluidSteel')], [metaitem('tjceu:steam.motor.ulv'), item('gregtech:steam_casing', 2), item('tjceu:tj_meta_item', 1)], [ore('pipeSmallFluidSteel'), ore('pipeSmallFluidSteel'), ore('pipeSmallFluidSteel')]])
crafting.addShaped(item('gregtech:mte', 11), [[ore('pipeSmallFluidBronze'), ore('pipeSmallFluidBronze'), ore('pipeSmallFluidBronze')], [metaitem('tjceu:steam.motor.ulv'), item('gregtech:steam_casing'), item('tjceu:tj_meta_item', 1)], [ore('pipeSmallFluidBronze'), ore('pipeSmallFluidBronze'), ore('pipeSmallFluidBronze')]])
crafting.addShaped(item('gregtech:mte', 7), [[ore('pipeSmallFluidBronze'), ore('pipeSmallFluidBronze'), ore('pipeSmallFluidBronze')], [item('tjceu:tj_meta_item', 1), item('gregtech:steam_casing'), item('minecraft:glass')], [ore('pipeSmallFluidBronze'), ore('pipeSmallFluidBronze'), ore('pipeSmallFluidBronze')]])
//crafting.removeByOutput(item('gregtech:machine:2235')) TODO: Steam Mixer
//crafting.addShaped(item('gregtech:machine:2235'), [[item('minecraft:glass'), ore('rotorBronze'), item('minecraft:glass')], [item('tjceu:tj_meta_item', 1), ore('pipeSmallFluidSteel'), item('tjceu:tj_meta_item', 1)], [ore('pipeSmallFluidSteel'), item('gregtech:steam_casing'), ore('pipeSmallFluidSteel')]])
crafting.removeByOutput(item('gregtech:mte', 985))
crafting.addShaped(item('gregtech:mte', 985), [[null, null, null], [ore('plateWroughtIron'), ore('plateWroughtIron'), ore('plateWroughtIron')], [ore('cableGtSingleLead'), item('gregtech:machine_casing'), ore('cableGtSingleLead')]])
//crafting.removeByOutput(ore('blockHopper'))

//furnace.addRecipe(item('minecraft:glass'), item('gregtech:meta_item_1:2960'), 0.0) //TODO: Sand Dust? Glass Dust?

// TODO: this chanbges it to use a EV circuit instead of a IV one
// Dunno if it's worth it to change
crafting.removeByOutput(metaitem('large_combustion_engine'))
crafting.addShaped(metaitem('large_combustion_engine'), [[metaitem('electric.piston.ev'), ore('circuitEv'), metaitem('electric.piston.ev')], [metaitem('electric.motor.ev'), metaitem('hull.ev'), metaitem('electric.motor.ev')], [ore('gearTitanium'), ore('wireGtSingleTungstenSteel'), ore('gearTitanium')]])


// Arc Furnaces
crafting.removeByOutput(item('gregtech:mte', 97))
crafting.removeByOutput(item('gregtech:mte', 96))
crafting.removeByOutput(item('gregtech:mte', 95))
crafting.addShaped(item('gregtech:mte', 97), [[ore('cableGtQuadrupleGold'), ore('ingotCarbon'), ore('cableGtQuadrupleGold')], [ore('circuitHv'), metaitem('hull.hv'), ore('circuitHv')], [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]])
crafting.addShaped(item('gregtech:mte', 96), [[ore('cableGtQuadrupleCopper'), ore('ingotCarbon'), ore('cableGtQuadrupleCopper')], [ore('circuitGood'), item('gregtech:mte', 987), ore('circuitGood')], [ore('plateAluminium'), ore('plateAluminium'), ore('plateAluminium')]])
crafting.addShaped(item('gregtech:mte', 95), [[ore('cableGtQuadrupleTin'), ore('ingotCarbon'), ore('cableGtQuadrupleTin')], [ore('circuitBasic'), item('gregtech:mte', 986), ore('circuitBasic')], [ore('plateSteel'), ore('plateSteel'), ore('plateSteel')]])
//crafting.addShaped(ore('blockStainlessSteel'), [[ore('ingotStainlessSteel'), ore('ingotStainlessSteel'), ore('ingotStainlessSteel')], [ore('ingotStainlessSteel'), ore('ingotStainlessSteel'), ore('ingotStainlessSteel')], [ore('ingotStainlessSteel'), ore('ingotStainlessSteel'), ore('ingotStainlessSteel')]])


mods.gregtech.mixer.removeByInput(1920, [metaitem('dustTungsten'), metaitem('dustCarbon'), metaitem('circuit.integrated').withNbt(['Configuration': 1])], null)
mods.gregtech.mixer.removeByInput(1920, [metaitem('dustTungsten'), metaitem('dustCarbon'), metaitem('circuit.integrated').withNbt(['Configuration': 2])], null)


mods.gregtech.fusion_reactor.removeByInput(49152, null, [fluid('xenon') * 125 * 125, fluid('zinc') * 16 * 16])
FUSION_REACTOR.recipeBuilder()
        .fluidInputs(fluid('helium') * 16, fluid('uranium') * 16)
        .fluidOutputs(fluid('plutonium') * 16)
        .EUToStart(120000000)
        .duration(128)
        .EUt(32000)
        .buildAndRegister()


// Freedom wrench
crafting.removeByOutput(metaitem('tool.multiblock_builder'))

crafting.addShaped(metaitem('tool.multiblock_builder'), [[ore('plateDoubleSteel'), ore('plateDoubleSteel'), metaitem('tjceu:steam.motor.ulv')], [item('tjceu:tj_meta_item', 1), ore('plateDoubleSteel'), ore('plateDoubleSteel')], [ore('plateDoubleSteel'), item('tjceu:tj_meta_item', 1), ore('plateDoubleSteel')]])
//crafting.removeByOutput(metaitem('gcym:large_circuit_assembler'))

// Steam Miner
crafting.removeByOutput(metaitem('steam_miner'))
crafting.addShaped(metaitem('steam_miner'), [[ore('pipeNormalFluidBronze'), ore('pipeNormalFluidBronze'), ore('pipeNormalFluidBronze')], [item('tjceu:tj_meta_item', 1), item('gregtech:steam_casing'), item('tjceu:tj_meta_item', 1)], [ore('rotorBronze'), ore('pipeNormalFluidBronze'), ore('rotorBronze')]])


// Basic Fluid Drilling Rig
mods.gregtech.assembler.removeByInput(120, [metaitem('hull.mv'), metaitem('frameSteel') * 4, metaitem('circuit.good_electronic') * 4, metaitem('electric.motor.mv') * 4, metaitem('electric.pump.mv') * 4, metaitem('gearVanadiumSteel') * 4, metaitem('circuit.integrated').withNbt(['Configuration': 2])], null)

ASSEMBLER.recipeBuilder()
        .inputs(metaitem('electric.motor.lv') * 4, metaitem('electric.pump.lv') * 4, item('gregtech:mte', 986), item('gregtech:meta_block_frame_20', 4), ore('gearCobalt') * 2, ore('circuitLv'))
        .circuitMeta(2)
        .outputs(metaitem('fluid_drilling_rig.mv'))
        .EUt(30)
        .duration(400)
        .buildAndRegister()

// TODO: some of these might come from gcyl idk
mods.gregtech.fusion_reactor.removeByInput(24576, null, [fluid('plutonium_244') * 16 * 16, fluid('neon') * 16 * 16])
mods.gregtech.fusion_reactor.removeByInput(16384, null, [fluid('gallium') * 16 * 16, fluid('radon') * 125 * 125])
mods.gregtech.fusion_reactor.removeByInput(30720, null, [fluid('liquid.titanium') * 48 * 48, fluid('duranium') * 32 * 32])
// Utils.removeRecipeByOutput(fusion, [], [fluid('plasma.radon')], false)
mods.gregtech.fusion_reactor.removeByInput(49152, null, [fluid('americium') * 16 * 16, fluid('neon') * 16 * 16])
mods.gregtech.fusion_reactor.removeByInput(49152, null, [fluid('americium_243') * 16 * 16, fluid('neon') * 16 * 16])


furnace.removeByOutput(metaitem('ingotDuranium'))
furnace.removeByOutput(metaitem('ingotRutherfordium'))
furnace.removeByOutput(metaitem('ingotTritanium'))

//TODO: from OtherRecipes
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
// crafting.removeByOutput(metaitem('electric.motor.ev'))

// crafting.addShaped(item('gregtech:meta_item_1:32604'), [[ore('cableGtSingleTungsten'), ore('wireGtQuadrupleBrightSteel'), ore('stickTungstenSteel')], [ore('wireGtQuadrupleBrightSteel'), ore('stickNeodymiumMagnetic'), ore('wireGtQuadrupleBrightSteel')], [ore('stickTungstenSteel'), ore('wireGtQuadrupleBrightSteel'), ore('cableGtSingleTungsten')]])
// crafting.addShaped(metaitem('electric.motor.ev'), [[ore('cableGtSingleAluminium'), ore('wireGtQuadrupleGold'), ore('stickTitanium')], [ore('wireGtQuadrupleGold'), ore('stickNeodymiumMagnetic'), ore('wireGtQuadrupleGold')], [ore('stickTitanium'), ore('wireGtQuadrupleGold'), ore('cableGtSingleAluminium')]])


// Utils.removeRecipeByOutput(assembler, [metaitem('electric.motor.ev')], [], true)
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1:32604')], [], true)

// Utils.removeRecipeByOutput(assembly_line, [metaitem('electric.motor.ev') * 16], [], true)
// Utils.removeRecipeByOutput(assembly_line, [item('gregtech:meta_item_1:32604') * 16], [], true)

// ASSEMBLER.recipeBuilder()
//         .inputs(ore('stickNeodymiumMagnetic'), ore('stickTitanium') * 2, ore('cableGtSingleAluminium') * 2, ore('wireGtQuadrupleGold') * 4)
//         .outputs(metaitem('electric.motor.ev'))
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
//         .outputs(metaitem('electric.motor.ev') * 16)
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

// OpV energy hatch & dynamo
// crafting.addShaped(item('gregtech:machine:4034'), [[null, null, null], [null, item('gregtech:mte', 997), ore('cableGtSingleNeutronium')], [null, null, null]])
// crafting.addShaped(item('gregtech:machine:4029'), [[null, null, null], [ore('cableGtSingleNeutronium'), item('gregtech:mte', 997), null], [null, null, null]])

// //update vacuume tube
// crafting.removeByOutput(ore('circuitUlv'))
// crafting.addShaped(ore('circuitUlv'), [[null, item('gregtech:meta_item_1', 517), null], [null, item('gregtech:meta_item_1:16018'), null], [ore('stickWroughtIron'), null, ore('stickWroughtIron')]])

// crafting.removeByOutput(item('gregtech:meta_item_1', 502))
// CHEMICAL_REACTOR.recipeBuilder()
//         .inputs(ore('wool') * 5)
//         .fluidInputs(fluid('glue') * 144, fluid('plastic') * 144)
//         .outputs(item('gregtech:meta_item_1', 502) * 10)
//         .duration(160)
//         .EUt(14)
//         .buildAndRegister()


// CHEMICAL_REACTOR.recipeBuilder()
//         .inputs(ore('wool') * 5)
//         .fluidInputs(fluid('glue') * 144, fluid('polytetrafluoroethylene') * 144)
//         .outputs(item('gregtech:meta_item_1', 502) * 20)
//         .duration(160)
//         .EUt(116)
//         .buildAndRegister()


// CHEMICAL_REACTOR.recipeBuilder()
//         .inputs(ore('wool') * 5)
//         .fluidInputs(fluid('glue') * 144, fluid('polybenzimidazole') * 144)
//         .outputs(item('gregtech:meta_item_1', 502) * 40)
//         .duration(160)
//         .EUt(116)
//         .buildAndRegister()


// UV Machine Hull
// Utils.removeRecipeByOutput(assembler, [item('gregtech:mte', 993)], [], true)

// ASSEMBLER.recipeBuilder()
//         .inputs(ore('cableGtSingleNaquadahAlloy') * 2)
//         .inputs(item('gregtech:machine_casing', 8))
//         .outputs(item('gregtech:mte', 993))
//         .fluidInputs(fluid('polybenzimidazole') * 288)
//         .duration(50)
//         .EUt(16)
//         .buildAndRegister()


// //capacitor recipes
// crafting.addShaped(ore('componentCapacitor') * 4, [[ore('foilAluminium'), ore('foilAluminium'), ore('foilAluminium')], [ore('foilAluminium'), ore('foilAluminium'), ore('foilAluminium')], [ore('wireGtSingleTin'), null, ore('wireGtSingleTin')]])

// Utils.removeRecipeByOutput(assembler, [ore('componentCapacitor') * 2], [], false)

// ASSEMBLER.recipeBuilder()
//         .inputs(ore('foilAluminium') * 4)
//         .inputs(ore('platePlastic'))
//         .outputs(ore('componentCapacitor') * 12)
//         .duration(80)
//         .EUt(16)
//         .buildAndRegister()

// //new electronic circuit recipe
// /*
// Utils.removeRecipeByOutput(CIRCUIT_ASSEMBLER, [item('gregtech:meta_item_2:32488')], [], false)

// CIRCUIT_ASSEMBLER.recipeBuilder()
// .inputs(ore('componentResistor') * 8)
// .inputs(ore('componentCapacitor') * 4)
// .inputs(ore('wireFineCopper') * 4)
// .inputs(item('gtadditions:ga_meta_item:32030'))
// .fluidInputs(fluid('soldering_alloy') * 50)
// .outputs(item('gregtech:meta_item_2:32488'))
// .duration(100)
// .EUt(16)
// .buildAndRegister()

// CIRCUIT_ASSEMBLER.recipeBuilder()
// .inputs(item('gcyl:gcyl_meta_item', 241) * 2)
// .inputs(item('gcyl:gcyl_meta_item', 242) * 2)
// .inputs(ore('wireFineCopper') * 4)
// .inputs(item('gtadditions:ga_meta_item:32030'))
// .fluidInputs(fluid('soldering_alloy') * 50)
// .outputs(item('gregtech:meta_item_2:32488'))
// .duration(100)
// .EUt(16)
// .buildAndRegister()
// */

// field generators
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1:32670')], [], false)
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1:32671')], [], false)
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1:32672')], [], false)
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1:32673')], [], false)
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1', 206)], [], false)

// crafting.removeByOutput(item('gregtech:meta_item_1:32670'))
// crafting.removeByOutput(item('gregtech:meta_item_1:32671'))
// crafting.removeByOutput(item('gregtech:meta_item_1:32672'))
// crafting.removeByOutput(item('gregtech:meta_item_1:32673'))
// crafting.removeByOutput(item('gregtech:meta_item_1', 206))

// //lv
// ASSEMBLER.recipeBuilder()
//         .inputs(ore('circuitBasic'))
//         .inputs(ore('dustEnderPearl'))
//         .outputs(item('gregtech:meta_item_1:32670'))
//         .fluidInputs(fluid('lv_superconductor_base') * 288)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister()
// //mv
// ASSEMBLER.recipeBuilder()
//         .inputs(ore('circuitGood') * 4)
//         .inputs(ore('dustEnderEye'))
//         .outputs(item('gregtech:meta_item_1:32671'))
//         .fluidInputs(fluid('mv_superconductor_base') * 576)
//         .duration(100)
//         .EUt(120)
//         .buildAndRegister()
// //hv
// ASSEMBLER.recipeBuilder()
//         .inputs(ore('circuitHv') * 4)
//         .inputs(item('gregtech:meta_item_1:32724'))
//         .outputs(item('gregtech:meta_item_1:32672'))
//         .fluidInputs(fluid('hv_superconductor_base') * 1152)
//         .duration(100)
//         .EUt(480)
//         .buildAndRegister()
// //EV
// ASSEMBLER.recipeBuilder()
//         .inputs(ore('circuitEv') * 4)
//         .inputs(ore('dustNetherStar'))
//         .outputs(item('gregtech:meta_item_1:32673'))
//         .fluidInputs(fluid('ev_superconductor_base') * 2304)
//         .duration(100)
//         .EUt(1920)
//         .buildAndRegister()
// //IV
// ASSEMBLER.recipeBuilder()
//         .inputs(ore('circuitIv') * 4)
//         .inputs(item('gregtech:meta_item_1:32725'))
//         .outputs(item('gregtech:meta_item_1', 206))
//         .fluidInputs(fluid('iv_superconductor_base') * 4608)
//         .duration(100)
//         .EUt(7680)
//         .buildAndRegister()


// crafting.addShaped(item('gregtech:meta_item_1', 206), [[ore('wireGtHexIvSuperconductorBase'), ore('circuitIv'), ore('wireGtHexIvSuperconductorBase')], [ore('circuitIv'), item('gregtech:meta_item_1:32725'), ore('circuitIv')], [ore('wireGtHexIvSuperconductorBase'), ore('circuitIv'), ore('wireGtHexIvSuperconductorBase')]])
// crafting.addShaped(item('gregtech:meta_item_1:32673'), [[ore('wireGtOctalEvSuperconductorBase'), ore('circuitEv'), ore('wireGtOctalEvSuperconductorBase')], [ore('circuitEv'), ore('gemNetherStar,netherStar'), ore('circuitEv')], [ore('wireGtOctalEvSuperconductorBase'), ore('circuitEv'), ore('wireGtOctalEvSuperconductorBase')]])
// crafting.addShaped(item('gregtech:meta_item_1:32672'), [[ore('wireGtQuadrupleHvSuperconductorBase'), ore('circuitHv'), ore('wireGtQuadrupleHvSuperconductorBase')], [ore('circuitHv'), item('gregtech:meta_item_1:32724'), ore('circuitHv')], [ore('wireGtQuadrupleHvSuperconductorBase'), ore('circuitHv'), ore('wireGtQuadrupleHvSuperconductorBase')]])
// crafting.addShaped(item('gregtech:meta_item_1:32671'), [[ore('wireGtDoubleMvSuperconductorBase'), ore('circuitGood'), ore('wireGtDoubleMvSuperconductorBase')], [ore('circuitGood'), ore('pearlEnderEye'), ore('circuitGood')], [ore('wireGtDoubleMvSuperconductorBase'), ore('circuitGood'), ore('wireGtDoubleMvSuperconductorBase')]])
// crafting.addShaped(item('gregtech:meta_item_1:32670'), [[item('gregtech:cable', 516), ore('circuitBasic'), item('gregtech:cable', 516)], [ore('circuitBasic'), ore('enderpearl'), ore('circuitBasic')], [item('gregtech:cable', 516), ore('circuitBasic'), item('gregtech:cable', 516)]])

// Utils.removeRecipeByOutput(largeMix, [ore('dustNiobiumNitride') * 2], [], true)

// LARGE_MIXER.recipeBuilder()
//         .inputs(ore('dustNiobium'))
//         .outputs(ore('dustNiobiumNitride') * 2)
//         .fluidInputs(fluid('nitrogen') * 1000)
//         .circuitMeta(1)
//         .duration(108)
//         .EUt(30)
//         .buildAndRegister()

// Utils.removeRecipeByOutput(largeMix, [ore('dustNichrome') * 5], [], true)

// LARGE_MIXER.recipeBuilder()
//         .inputs(ore('dustChrome'))
//         .inputs(ore('dustNickel') * 4)
//         .outputs(ore('dustNichrome') * 5)
//         .circuitMeta(11)
//         .duration(280)
//         .EUt(30)
//         .buildAndRegister()

// //steel
// ASSEMBLER.recipeBuilder()
//         .inputs(ore('plateSteel') * 4)
//         .inputs(ore('frameGtSteel'))
//         .inputs(ore('gearSteel') * 2)
//         .outputs(item('gregtech:turbine_casing', 1))
//         .duration(200)
//         .EUt(30)
//         .buildAndRegister()
// //ti
// ASSEMBLER.recipeBuilder()
//         .inputs(ore('plateSteel') * 4)
//         .inputs(item('gregtech:frame_titanium'))
//         .inputs(ore('gearTitanium') * 2)
//         .outputs(item('gregtech:turbine_casing', 2) * 3)
//         .duration(200)
//         .EUt(30)
//         .buildAndRegister()

// Utils.removeRecipeByOutput(assembly_line, [ore('dustNiobiumNitride') * 2], [], true)
// Utils.removeRecipeByOutput(assembly_line, [item('gregtech:meta_item_1:32670') * 16], [], true)

// assembly_line.recipeBuilder()
//         .inputs(ore('ingotSolderingAlloy') * 2)
//         .inputs(ore('circuitBasic') * 8)
//         .inputs(ore('dustEnderPearl') * 4)
//         .outputs(item('gregtech:meta_item_1:32670') * 16)
//         .circuitMeta(1)
//         .circuitMeta(2)
//         .duration(6000)
//         .EUt(8000)
//         .buildAndRegister()


// Utils.removeRecipeByOutput(engraver, [item('gregtech:meta_item_1', 566)], [], true)
// Utils.removeRecipeByOutput(large_engrav, [item('gregtech:meta_item_1', 566)], [], true)


// engraver.recipeBuilder()
//         .inputs(metaitem('wafer.silicon'))
//         .outputs(item('gregtech:meta_item_1', 566))
//         .notConsumable(ore('craftingLensWhite'))
//         .duration(45 * 20)
//         .EUt(18)
//         .buildAndRegister()

// large_engrav.recipeBuilder()
//         .inputs(metaitem('wafer.silicon'))
//         .outputs(item('gregtech:meta_item_1', 566))
//         .notConsumable(ore('craftingLensWhite'))
//         .duration(45 * 20)
//         .EUt(18)
//         .buildAndRegister()


// Utils.removeRecipeByOutput(forming, [item('gregtech:meta_item_2:15518')], [], true)
