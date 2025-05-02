package recipes.byMod

import static classes.utils.TJUtility.tjceu

// TODO: Modifie Machine Casings & Hull Recipes (ZPM, UIV, UXV, OpV, MAX)
ASSEMBLER = recipemap('assembler')
BREWERY = recipemap('brewery')
AUTOCLAVE = recipemap('autoclave')
MACERATOR = recipemap('macerator')
FUSION_REACTOR = recipemap('fusion_reactor')
LASER_ENGRAVER = recipemap('laser_engraver')
IMPLOSION_COMPRESSOR = recipemap('implosion_compressor')
ASSLINE = recipemap('assembly_line')

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

ASSEMBLER.recipeBuilder()
        .circuitMeta(8)
        .inputs(ore('plateStarmetalAlloy') * 8)
        .outputs(item('gregtech:machine_casing', 7))
        .duration(500)
        .EUt(16)
        .buildAndRegister()

crafting.shapedBuilder()
        .name(tjceu('gregtech.machine.hull.zpm'))
        .row('PSP')
        .row('WCW')
        .key('P', ore('platePolybenzimidazole'))
        .key('S', ore('plateStarmetalAlloy'))
        .key('W', ore('cableGtSingleNaquadah'))
        .key('C', item('gregtech:machine_casing', 7))
        .output(metaitem('hull.zpm'))
        .register()

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
mods.gregtech.fusion_reactor.removeByInput(49152, null, [fluid('americium') * 16 * 16, fluid('neon') * 16 * 16])
mods.gregtech.fusion_reactor.removeByInput(49152, null, [fluid('americium_243') * 16 * 16, fluid('neon') * 16 * 16])

FUSION_REACTOR.recipeBuilder()
        .fluidInputs(fluid('neon') * 144)
        .fluidInputs(fluid('plutonium') * 144)
        .fluidOutputs(fluid('rutherfordium') * 144)
        .EUToStart(150000000)
        .duration(64)
        .EUt(16384)
        .buildAndRegister()

FUSION_REACTOR.recipeBuilder()
        .fluidInputs(fluid('radon') * 1125)
        .fluidInputs(fluid('gallium') * 144)
        .fluidOutputs(fluid('duranium') * 144)
        .EUToStart(180000000)
        .duration(64)
        .EUt(24576)
        .buildAndRegister()

FUSION_REACTOR.recipeBuilder()
        .fluidInputs(fluid('duranium') * 288)
        .fluidInputs(fluid('liquid.titanium') * 432)
        .fluidOutputs(fluid('tritanium') * 144)
        .EUToStart(200000000)
        .duration(64)
        .EUt(32768)
        .buildAndRegister()

FUSION_REACTOR.recipeBuilder()
        .fluidInputs(fluid('mercury') * 64)
        .fluidInputs(fluid('gold') * 64)
        .fluidOutputs(fluid('plasma.radon') * 500)
        .EUToStart(200000000)
        .duration(64)
        .EUt(32768)
        .buildAndRegister()

FUSION_REACTOR.recipeBuilder()
        .fluidInputs(fluid('neon') * 288)
        .fluidInputs(fluid('americium') * 288)
        .fluidOutputs(fluid('dubnium') * 288)
        .EUToStart(200000000)
        .duration(64)
        .EUt(131072)
        .buildAndRegister()

FUSION_REACTOR.recipeBuilder()
        .fluidInputs(fluid('neon') * 288)
        .fluidInputs(fluid('americium_243') * 288)
        .fluidOutputs(fluid('dubnium') * 288)
        .EUToStart(200000000)
        .duration(64)
        .EUt(131072)
        .buildAndRegister()

crafting.shapedBuilder()
        .name(tjceu('ingot.iridium_alloy'))
        .row('IWI')
        .row('WDW')
        .row('IWI')
        .key('I', ore('plateIridium'))
        .key('W', ore('plateTungsten'))
        .key('D', ore('dustDiamond'))
        .output(metaitem('tjceu:ingot.iridium_alloy'))
        .register()

IMPLOSION_COMPRESSOR.recipeBuilder()
        .inputs(metaitem('tjceu:ingot.iridium_alloy'))
        .explosives(4)
        .outputs(metaitem('tjceu:plate.iridium_alloy'))
        .duration(20)
        .EUt(30)
        .buildAndRegister()

IMPLOSION_COMPRESSOR.recipeBuilder()
        .inputs(metaitem('tjceu:ingot.iridium_alloy'))
        .explosives(item('gregtech:powderbarrel') * 8)
        .outputs(metaitem('tjceu:plate.iridium_alloy'))
        .duration(20)
        .EUt(30)
        .buildAndRegister()

IMPLOSION_COMPRESSOR.recipeBuilder()
        .inputs(metaitem('tjceu:ingot.iridium_alloy'))
        .explosives(item('gregtech:itnt'))
        .outputs(metaitem('tjceu:plate.iridium_alloy'))
        .duration(20)
        .EUt(30)
        .buildAndRegister()

// Iridium Neutron Reflector * 1
mods.gregtech.assembler.removeByInput(120, [metaitem('plateRuridit'), metaitem('plateDoubleBeryllium') * 4, metaitem('plateDoubleTungstenCarbide') * 2], [fluid('tin_alloy') * 4608 * 4608])

ASSEMBLER.recipeBuilder()
        .inputs(metaitem('tjceu:plate.iridium_alloy'))
        .inputs(ore('plateDoubleTungstenCarbide') * 2)
        .inputs(ore('plateDoubleBeryllium') * 4)
        .fluidInputs(fluid('tin_alloy') * 4608)
        .outputs(metaitem('neutron_reflector'))
        .duration(4000)
        .EUt(120)
        .buildAndRegister()

crafting.shapedBuilder()
        .name(tjceu('rotor_holder.uhv'))
        .row('SLS')
        .row('LHL')
        .row('SLS')
        .key('S', ore('gearSmallZeron100'))
        .key('L', ore('gearSeaborgium'))
        .key('H', metaitem('hull.uhv'))
        .output(metaitem('tjceu:rotor_holder.uhv'))
        .register()

MIXER.recipeBuilder()
        .inputs(ore('sand') * 8)
        .circuitMeta(1)
        .outputs(item('minecraft:clay') * 8)
        .fluidInputs(fluid('water') * 1000)
        .duration(100)
        .EUt(30)
        .buildAndRegister()

// EV/IV motors
crafting.removeByOutput(metaitem('electric.motor.ev'))
crafting.removeByOutput(metaitem('electric.motor.iv'))

crafting.addShaped(metaitem('electric.motor.ev'), [
        [ore('cableGtSingleAluminium'), ore('wireGtQuadrupleGold'), ore('stickTitanium')],
        [ore('wireGtQuadrupleGold'), ore('stickNeodymiumMagnetic'), ore('wireGtQuadrupleGold')],
        [ore('stickTitanium'), ore('wireGtQuadrupleGold'), ore('cableGtSingleAluminium')]
])

crafting.addShaped(metaitem('electric.motor.iv'), [
        [ore('cableGtSingleTungsten'), ore('wireGtQuadrupleBrightSteel'), ore('stickTungstenSteel')],
        [ore('wireGtQuadrupleBrightSteel'), ore('stickNeodymiumMagnetic'), ore('wireGtQuadrupleBrightSteel')],
        [ore('stickTungstenSteel'), ore('wireGtQuadrupleBrightSteel'), ore('cableGtSingleTungsten')]
])


// UIV Machine Casing * 1
mods.gregtech.assembler.removeByInput(16, [metaitem('circuit.integrated').withNbt(['Configuration': 8]), metaitem('gcyl:plateQuantum') * 8], null)
// UXV Machine Casing * 1
mods.gregtech.assembler.removeByInput(16, [metaitem('circuit.integrated').withNbt(['Configuration': 8]), metaitem('gcyl:plateBlackTitanium') * 8], null)


ASSEMBLER.recipeBuilder()
        .circuitMeta(8)
        .inputs(ore('plateAdamantium') * 8)
        .outputs(item('gregtech:machine_casing', 11))
        .duration(500)
        .EUt(16)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .circuitMeta(8)
        .inputs(ore('plateVibranium') * 8)
        .outputs(item('gregtech:machine_casing', 12))
        .duration(500)
        .EUt(16)
        .buildAndRegister()


// Update vacuum tube
crafting.removeByOutput(metaitem('circuit.vacuum_tube'))
crafting.addShaped(metaitem('circuit.vacuum_tube'), [
        [null, metaitem('component.glass.tube'), null],
        [null, ore('boltCopper'), null],
        [ore('stickWroughtIron'), null, ore('stickWroughtIron')]
])

// BrainTech Aerospace Advanced Reinforced Duct Tape FAL-84 * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('foilPlastic') * 4, metaitem('carbon.mesh')], [fluid('plastic') * 288 * 288])
// BrainTech Aerospace Advanced Reinforced Duct Tape FAL-84 * 2
mods.gregtech.assembler.removeByInput(30, [metaitem('foilSiliconeRubber') * 2, metaitem('carbon.mesh')], [fluid('plastic') * 288 * 288])
// BrainTech Aerospace Advanced Reinforced Duct Tape FAL-84 * 4
mods.gregtech.assembler.removeByInput(30, [metaitem('foilPolycaprolactam') * 2, metaitem('carbon.mesh')], [fluid('plastic') * 144 * 144])
// BrainTech Aerospace Advanced Reinforced Duct Tape FAL-84 * 8
mods.gregtech.assembler.removeByInput(30, [metaitem('foilPolybenzimidazole'), metaitem('carbon.mesh')], [fluid('plastic') * 72 * 72])

CHEMICAL_REACTOR.recipeBuilder()
        .inputs(ore('wool') * 5)
        .fluidInputs(fluid('glue') * 144)
        .fluidInputs(fluid('plastic') * 144)
        .outputs(metaitem('duct_tape') * 10)
        .duration(160)
        .EUt(14)
        .buildAndRegister()

CHEMICAL_REACTOR.recipeBuilder()
        .inputs(ore('wool') * 5)
        .fluidInputs(fluid('glue') * 144)
        .fluidInputs(fluid('polytetrafluoroethylene') * 144)
        .outputs(metaitem('duct_tape') * 20)
        .duration(160)
        .EUt(14)
        .buildAndRegister()

CHEMICAL_REACTOR.recipeBuilder()
        .inputs(ore('wool') * 5)
        .fluidInputs(fluid('glue') * 144)
        .fluidInputs(fluid('polybenzimidazole') * 144)
        .outputs(metaitem('duct_tape') * 40)
        .duration(160)
        .EUt(14)
        .buildAndRegister()

// Capacitor recipes
crafting.addShaped(metaitem('component.capacitor') * 4, [
        [ore('foilAluminium'), ore('foilAluminium'), ore('foilAluminium')],
        [ore('foilAluminium'), ore('foilAluminium'), ore('foilAluminium')],
        [ore('wireGtSingleTin'), null, ore('wireGtSingleTin')]
])

// Capacitor * 8
mods.gregtech.assembler.removeByInput(120, [metaitem('foilPlastic'), metaitem('foilAluminium') * 2], [fluid('plastic') * 144 * 144])

ASSEMBLER.recipeBuilder()
        .inputs(ore('foilAluminium') * 4)
        .inputs(ore('platePlastic'))
        .outputs(metaitem('component.capacitor') * 12)
        .duration(80)
        .EUt(16)
        .buildAndRegister()
