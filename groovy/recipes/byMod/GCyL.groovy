package recipes.byMod

import gregtech.api.metatileentity.multiblock.CleanroomType

BIO_REACTOR = recipemap('bio_reactor')
ASSEMBLER = recipemap('assembler')
EBF = recipemap('electric_blast_furnace')
STELLAR_FORGE = recipemap('stellar_forge')
PLASMA_CONDENSER = recipemap('plasma_condenser')
LCR = recipemap('large_chemical_reactor')
EXTRUDER = recipemap('extruder')
ADV_FUSION = recipemap('adv_fusion')
ASSLINE = recipemap('assembly_line')
ABS = recipemap('alloy_blast_smelter')

// Hide items from JEI
mods.jei.ingredient.yeet(
        metaitem('gcyl:board.raw.magnetic'),
        metaitem('gcyl:board.magnetic'),
        metaitem('gcyl:circuit.resonatic.ulv'),
        metaitem('gcyl:circuit.resonatic.lv'),
        metaitem('gcyl:circuit.resonatic.mv'),
        metaitem('gcyl:circuit.resonatic.hv'),
        metaitem('gcyl:circuit.resonatic.ev'),
        metaitem('gcyl:circuit.resonatic.iv'),
        metaitem('gcyl:circuit.resonatic.luv'),
        metaitem('gcyl:circuit.resonatic.zpm'),
        metaitem('gcyl:circuit.resonatic.uv'),
        metaitem('gcyl:circuit.resonatic.uhv'),
        metaitem('gcyl:circuit.resonatic.uev')
)

// Yeet Magneto Circuits
// Imprinted Resonatic Circuit Board * 1
mods.gregtech.autoclave.removeByInput(1920, [metaitem('gcyl:board.raw.magnetic')], [fluid('soldering_alloy') * 432 * 432])
// ULV Magneto Resonatic Circuit * 4
mods.gregtech.circuit_assembler.removeByInput(30, [metaitem('circuit.vacuum_tube'), metaitem('gcyl:gemMagnetoResonatic'), metaitem('gcyl:board.magnetic'), metaitem('component.diode') * 4, metaitem('component.capacitor') * 4, metaitem('component.transistor') * 4], [fluid('soldering_alloy') * 36])
// LV Magneto Resonatic Circuit * 4
mods.gregtech.circuit_assembler.removeByInput(120, [metaitem('gcyl:board.magnetic'), metaitem('gcyl:gemMagnetoResonatic'), metaitem('gcyl:circuit.resonatic.ulv'), metaitem('gcyl:component.smd.diode.refined') * 4, metaitem('gcyl:component.smd.capacitor.refined') * 4, metaitem('gcyl:component.smd.transistor.refined') * 4], [fluid('soldering_alloy') * 72])
// MV Magneto Resonatic Circuit * 4
mods.gregtech.circuit_assembler.removeByInput(480, [metaitem('gcyl:board.magnetic'), metaitem('gcyl:gemMagnetoResonatic'), metaitem('gcyl:circuit.resonatic.lv'), metaitem('component.smd.diode') * 8, metaitem('component.smd.capacitor') * 8, metaitem('component.smd.transistor') * 8], [fluid('soldering_alloy') * 108])
// HV Magneto Resonatic Circuit * 4
mods.gregtech.circuit_assembler.removeByInput(1920, [metaitem('gcyl:board.magnetic'), metaitem('gcyl:gemMagnetoResonatic'), metaitem('gcyl:circuit.resonatic.mv'), metaitem('gcyl:component.smd.diode.nano') * 8, metaitem('gcyl:component.smd.capacitor.nano') * 8, metaitem('gcyl:component.smd.transistor.nano') * 8], [fluid('soldering_alloy') * 144])
// EV Magneto Resonatic Circuit * 4
mods.gregtech.circuit_assembler.removeByInput(7680, [metaitem('gcyl:board.magnetic'), metaitem('gcyl:gemMagnetoResonatic'), metaitem('gcyl:circuit.resonatic.hv'), metaitem('gcyl:component.smd.diode.quantum') * 16, metaitem('gcyl:component.smd.capacitor.quantum') * 16, metaitem('gcyl:component.smd.transistor.quantum') * 16], [fluid('soldering_alloy') * 180])
// IV Magneto Resonatic Circuit * 4
mods.gregtech.circuit_assembler.removeByInput(30720, [metaitem('gcyl:board.magnetic') * 6, metaitem('gcyl:gemMagnetoResonatic') * 6, metaitem('gcyl:circuit.resonatic.ev'), metaitem('gcyl:component.smd.diode.crystal') * 16, metaitem('gcyl:component.smd.capacitor.crystal') * 16, metaitem('gcyl:component.smd.transistor.crystal') * 16], [fluid('soldering_alloy') * 864])
// LuV Magneto Resonatic Circuit * 4
mods.gregtech.circuit_assembler.removeByInput(122880, [metaitem('gcyl:board.magnetic') * 6, metaitem('gcyl:gemMagnetoResonatic') * 6, metaitem('gcyl:circuit.resonatic.iv'), metaitem('gcyl:component.smd.diode.wetware') * 24, metaitem('gcyl:component.smd.capacitor.wetware') * 24, metaitem('gcyl:component.smd.transistor.wetware') * 24], [fluid('soldering_alloy') * 1008])
// ZPM Magneto Resonatic Circuit * 4
mods.gregtech.circuit_assembler.removeByInput(491520, [metaitem('gcyl:board.magnetic') * 6, metaitem('gcyl:gemExquisiteMagnetoResonatic'), metaitem('gcyl:circuit.resonatic.luv'), metaitem('gcyl:component.smd.diode.bioware') * 24, metaitem('gcyl:component.smd.capacitor.bioware') * 24, metaitem('gcyl:component.smd.transistor.bioware') * 24], [fluid('soldering_alloy') * 4608])
// UV Magneto Resonatic Circuit * 4
mods.gregtech.circuit_assembler.removeByInput(1966080, [metaitem('gcyl:board.magnetic') * 6, metaitem('gcyl:gemExquisiteMagnetoResonatic') * 6, metaitem('gcyl:circuit.resonatic.zpm'), metaitem('gcyl:smd_diode_optical') * 32, metaitem('gcyl:smd_capacitor_optical') * 32, metaitem('gcyl:smd_transistor_optical') * 32], [fluid('soldering_alloy') * 5184])
// UHV Magneto Resonatic Circuit * 4
mods.gregtech.circuit_assembler.removeByInput(7864320, [metaitem('gcyl:board.magnetic') * 12, metaitem('gcyl:gemExquisiteMagnetoResonatic') * 12, metaitem('gcyl:circuit.resonatic.uv'), metaitem('gcyl:component.smd.diode.exotic') * 32, metaitem('gcyl:component.smd.capacitor.exotic') * 32, metaitem('gcyl:component.smd.transistor.exotic') * 32], [fluid('soldering_alloy') * 5760])
// UEV Magneto Resonatic Circuit * 4
mods.gregtech.circuit_assembler.removeByInput(31457280, [metaitem('gcyl:board.magnetic') * 12, metaitem('gcyl:gemExquisiteMagnetoResonatic') * 12, metaitem('gcyl:circuit.resonatic.uhv'), metaitem('gcyl:smd_diode_cosmic') * 64, metaitem('gcyl:smd_capacitor_cosmic') * 64, metaitem('gcyl:smd_transistor_cosmic') * 64], [fluid('soldering_alloy') * 9216])


// TODO: Change Tiny Pile Recipes & Isotopes
// Tiny Pile of Lutetium Dust * 1
mods.gregtech.large_centrifuge.removeByInput(7680, [metaitem('dustNaquadria')], [fluid('nitrogen_dioxide') * 500 * 500, fluid('sulfuric_acid') * 500 * 500])

// Actinium Nitrate Dust * 26
mods.gregtech.large_centrifuge.removeByInput(32700, null, [fluid('actinium_radium_nitrate_solution') * 13000 * 13000, fluid('theonyl_trifluoroacetate') * 500 * 500])

// Stem Cells * 2
mods.gregtech.bio_reactor.removeByInput(480, [metaitem('stem_cells')], [fluid('sterilized_growth_medium') * 1000 * 1000])

BIO_REACTOR.recipeBuilder().with {
        inputs metaitem('stem_cells')
        fluidInputs fluid('sterilized_growth_medium') * 1000
        outputs metaitem('stem_cells') * 2
        circuitMeta 1
        cleanroom CleanroomType.STERILE_CLEANROOM
        duration 250
        EUt 480
        buildAndRegister()

}

ASSEMBLER.recipeBuilder().with {
        inputs ore('wireGtDoubleChaosalloy') * 8
        inputs metaitem('gcyl:highly_insulating_foil') * 16
        fluidInputs fluid('cosmic_neutronium') * 144
        outputs item('gcyl:wire_coil', 6)
        duration 250
        EUt 536870900
        buildAndRegister()

}

EBF.recipeBuilder().with {
        inputs metaitem('tjceu:crystal.refined_chaos')
        inputs ore('boltChaosalloy') * 8
        inputs metaitem('gcyl:recursively.folded.negative.space')
        fluidInputs fluid('light_quarks') * 750
        outputs metaitem('tjceu:crystal.infinity')
        blastFurnaceTemp 19302
        duration 100
        EUt 536870900
        buildAndRegister()

}

EBF.recipeBuilder().with {
        inputs metaitem('gcyl:cosmic.fabric') * 4
        inputs metaitem('gcyl:time.dilation.containment.unit')
        inputs metaitem('gcyl:qcd.protective.plating')
        fluidInputs fluid('taranium') * 4032
        outputs metaitem('tjceu:dustEternityPreparation')
        blastFurnaceTemp 23000
        duration 50
        EUt 536870900
        buildAndRegister()

}

STELLAR_FORGE.recipeBuilder().with {
        inputs item('gcyl:gcyl_explosive', 3)
        inputs metaitem('tjceu:dustEternityPreparation') * 4
        inputs metaitem('tjceu:crystal.infinity') * 2
        fluidInputs fluid('gluons') * 8000
        fluidOutputs fluid('plasma.eternity') * 1152
        duration 20
        EUt 536870900
        buildAndRegister()

}

PLASMA_CONDENSER.recipeBuilder().with {
        fluidInputs fluid('plasma.eternity') * 144
        fluidInputs fluid('microcrystallizinghydrogen') * 5000
        notConsumable metaitem('gcyl:ingot.field.shape')
        fluidOutputs fluid('hydrogen') * 5000
        outputs metaitem('tjceu:ingotEternity')
        duration 40
        EUt 536870900
        buildAndRegister()

}

ASSEMBLER.recipeBuilder().with {
        inputs metaitem('tjceu:blockEternity')
        inputs ore('wireGtHexMaxSuperconductor') * 8
        inputs metaitem('gcyl:highly_insulating_foil') * 32
        inputs metaitem('field.generator.opv')
        fluidInputs fluid('chaosalloy') * 288
        outputs item('gcyl:wire_coil', 7)
        duration 100
        EUt 536870900
        buildAndRegister()

}

EBF.recipeBuilder().with {
        inputs metaitem('gcyl:eigenfolded.kerr.manifold')
        inputs metaitem('gcyl:cosmic.fabric') * 8
        inputs metaitem('tjceu:crystal.infinity')
        fluidInputs fluid('high_energy_qgp') * 288
        outputs metaitem('tjceu:crystal.eternity')
        blastFurnaceTemp 51237
        duration 10000
        EUt 536870900
        buildAndRegister()

}

LCR.recipeBuilder().with {
        inputs ore('dustSodaAsh') * 6
        fluidInputs fluid('water') * 1000
        circuitMeta 1
        outputs metaitem('dustSodiumBicarbonate') * 6
        outputs metaitem('dustSodiumHydroxide') * 3
        duration 140
        EUt 30
        buildAndRegister()

}

// TODO: should TJCEu item recipes be moved to individual files?
crafting.addShaped(metaitem('tjceu:steam.motor.ulv'), [[ore('stickWood'), ore('plateBronze'), ore('stickIron')], [ore('plateBronze'), ore('stickIron'), ore('plateBronze')], [ore('ingotIron'), ore('plateBronze'), ore('stickWood')]])

crafting.addShaped(metaitem('tjceu:steam.piston.ulv'), [[ore('gearSmallIron'), ore('stickWood'), ore('stickWood')], [ore('gearSmallIron'), metaitem('tjceu:steam.motor.ulv'), ore('plateBronze')], [ore('plateIron'), ore('plateIron'), ore('plateIron')]])

// TODO: recipes for steam pump & steam conveyor belt

furnace.add(ore('blockPreciousMetal'), item('minecraft:gold_ingot'), 1.0F) // 1.0 since 9 = 10


// Infinity water covers
// MV Infinite Water * 1
mods.gregtech.assembler.removeByInput(120, [metaitem('electric.pump.mv'), metaitem('circuit.good_electronic'), item('minecraft:cauldron')], null)
// HV Infinite Water * 1
mods.gregtech.assembler.removeByInput(480, [metaitem('electric.pump.hv'), metaitem('circuit.advanced_integrated'), metaitem('gcyl:infinite.water.mv')], null)
// EV Infinite Water * 1
mods.gregtech.assembler.removeByInput(1920, [metaitem('electric.pump.ev'), metaitem('circuit.workstation'), metaitem('gcyl:infinite.water.hv')], null)
// IV Infinite Water * 1
mods.gregtech.assembler.removeByInput(7680, [metaitem('electric.pump.iv'), metaitem('circuit.mainframe'), metaitem('gcyl:infinite.water.ev')], null)
// LuV Infinite Water * 1
mods.gregtech.assembler.removeByInput(30720, [metaitem('electric.pump.luv'), metaitem('circuit.nano_mainframe'), metaitem('gcyl:infinite.water.iv')], null)
// ZPM Infinite Water * 1
mods.gregtech.assembler.removeByInput(122880, [metaitem('electric.pump.zpm'), metaitem('circuit.quantum_mainframe'), metaitem('gcyl:infinite.water.luv')], null)
// UV Infinite Water * 1
mods.gregtech.assembler.removeByInput(491520, [metaitem('electric.pump.uv'), metaitem('circuit.crystal_mainframe'), metaitem('gcyl:infinite.water.zpm')], null)

EXTRUDER.recipeBuilder().with {
        inputs ore('blockTritanium') * 64
        inputs ore('blockTritanium') * 64
        outputs item('tjceu:tj_meta_item', 800)
        duration 30000000
        EUt 3
        buildAndRegister()

}

ASSEMBLER.recipeBuilder().with {
        inputs item('enderio:block_reservoir') * 4
        inputs metaitem('hull.mv')
        outputs metaitem('gcyl:infinite.water.mv')
        duration 200
        EUt 110
        buildAndRegister()

}

ASSEMBLER.recipeBuilder().with {
        inputs item('enderio:block_reservoir') * 4
        inputs metaitem('hull.hv')
        outputs metaitem('gcyl:infinite.water.hv')
        duration 200
        EUt 500
        buildAndRegister()

}

ASSEMBLER.recipeBuilder().with {
        inputs item('enderio:block_reservoir') * 4
        inputs metaitem('hull.ev')
        outputs metaitem('gcyl:infinite.water.ev')
        duration 200
        EUt 2048
        buildAndRegister()

}

ASSEMBLER.recipeBuilder().with {
        inputs item('enderio:block_reservoir') * 4
        inputs metaitem('hull.iv')
        outputs metaitem('gcyl:infinite.water.iv')
        duration 200
        EUt 8192
        buildAndRegister()

}

ASSEMBLER.recipeBuilder().with {
        inputs item('enderio:block_reservoir') * 4
        inputs metaitem('hull.luv')
        outputs metaitem('gcyl:infinite.water.luv')
        duration 200
        EUt 32768
        buildAndRegister()

}


ASSEMBLER.recipeBuilder().with {
        inputs item('enderio:block_reservoir') * 4
        inputs metaitem('hull.zpm')
        outputs metaitem('gcyl:infinite.water.zpm')
        duration 200
        EUt 131072
        buildAndRegister()

}

ASSEMBLER.recipeBuilder().with {
        inputs item('enderio:block_reservoir') * 4
        inputs metaitem('hull.uv')
        outputs metaitem('gcyl:infinite.water.uv')
        duration 200
        EUt 524288
        buildAndRegister()

}

// Upgrade recipes
ASSEMBLER.recipeBuilder().with {
        inputs item('enderio:block_reservoir') * 4
        inputs metaitem('gcyl:infinite.water.hv')
        outputs metaitem('gcyl:infinite.water.ev')
        duration 200
        EUt 2048
        buildAndRegister()

}

ASSEMBLER.recipeBuilder().with {
        inputs item('enderio:block_reservoir') * 4
        inputs metaitem('gcyl:infinite.water.ev')
        outputs metaitem('gcyl:infinite.water.iv')
        duration 200
        EUt 8192
        buildAndRegister()

}

ASSEMBLER.recipeBuilder().with {
        inputs item('enderio:block_reservoir') * 4
        inputs metaitem('gcyl:infinite.water.iv')
        outputs metaitem('gcyl:infinite.water.luv')
        duration 200
        EUt 32768
        buildAndRegister()

}


ASSEMBLER.recipeBuilder().with {
        inputs item('enderio:block_reservoir') * 4
        inputs metaitem('gcyl:infinite.water.luv')
        outputs metaitem('gcyl:infinite.water.zpm')
        duration 200
        EUt 131072
        buildAndRegister()

}

ASSEMBLER.recipeBuilder().with {
        inputs item('enderio:block_reservoir') * 4
        inputs metaitem('gcyl:infinite.water.zpm')
        outputs metaitem('gcyl:infinite.water.uv')
        duration 200
        EUt 524288
        buildAndRegister()

}

// Crystal SMD Resistor * 24
mods.gregtech.assembler.removeByInput(7904, [metaitem('wireFineNaquadahAlloy') * 8, metaitem('plateGraphene'), metaitem('gcyl:dustSiliconCarbide')], [fluid('plastic') * 144])

ASSEMBLER.recipeBuilder().with {
        inputs ore('plateGraphene')
        inputs ore('plateRuthenium')
        inputs ore('wireFineNaquadahAlloy') * 8
        fluidInputs fluid('soldering_alloy') * 144
        outputs item('gcyl:gcyl_meta_item', 250) * 24
        duration 80
        EUt 7904
        buildAndRegister()

}

// Raw Imprinted Resonatic Circuit Board
mods.gregtech.forming_press.removeByInput(480, [metaitem('gcyl:dustCircuitCompoundMkc') * 4, metaitem('gcyl:dustMagnetoResonatic')], null)

ADV_FUSION.recipeBuilder().with {
        fluidInputs fluid('sodium') * 144, fluid('curium_250') * 144
        fluidOutputs fluid('bohrium') * 288
        EUToStart 1000000000
        AdvCoilTier 1
        EUReturn 40
        duration 50
        EUt 1000000
        buildAndRegister()

}

// TODO: remove QCD Confined fluid recipes from extractor by parts
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 566)], [], true)

ASSEMBLER.recipeBuilder().with {
        inputs ore('plateCosmicNeutronium') * 3
        inputs ore('plateFullerenePolymerMatrix') * 3
        inputs item('gregtech:meta_item_1:12520') * 3
        outputs item('gcyl:gcyl_meta_item', 566)
        fluidInputs fluid('neutronium_doped_nanotubes') * 2000
        duration 280
        EUt 536870000
        buildAndRegister()

}

ASSLINE.recipeBuilder().with {
        inputs ore('wireGtQuadrupleMaxSuperconductor') * 64
        inputs ore('dustSiliconCarbide') * 64
        inputs ore('boltCosmicNeutronium') * 16
        inputs ore('plateDenseChaosalloy') * 8
        inputs item('gregtech:battery_block', 8)
        inputs metaitem('gcyl:circuit.mainframe.supracausal')
        inputs metaitem('gcyl:emitter.max')
        inputs metaitem('gcyl:sensor.max')
        fluidInputs fluid('plasma.cosmic_mesh_plasma') * 1000
        fluidInputs fluid('quantum') * 1296
        outputs metaitem('tjceu:solar_panel.max')
        duration 100
        EUt 983040000
        buildAndRegister()

}

// Optical Processing Core * 8
mods.gregtech.assembly_line.removeByInput(1474560, [metaitem('gcyl:optical_soc') * 6, metaitem('gcyl:smd_diode_optical') * 16, metaitem('gcyl:smd_resistor_optical') * 16, metaitem('gcyl:smd_transistor_optical') * 16, metaitem('gcyl:smd_capacitor_optical') * 16, metaitem('gcyl:foilPolyetheretherketone') * 2, metaitem('gcyl:low_frequency_laser'), metaitem('gcyl:medium_frequency_laser'), metaitem('gcyl:high_frequency_laser'), metaitem('gcyl:non_linear_optical_lens') * 2, metaitem('gcyl:cladded_optical_fiber_core') * 2, metaitem('gcyl:bose_einstein_cooling_container'), metaitem('plateGraphene') * 4], [fluid('polytetrafluoroethylene') * 864, fluid('enriched_naquadah_alloy') * 432, fluid('soldering_alloy') * 1296, fluid('fullerene_doped_nanotubes') * 144])


ASSLINE.recipeBuilder().with {
        inputs ore('plateProtoAdamantium') * 4
        inputs metaitem('gcyl:smd_diode_optical') * 2
        inputs metaitem('gcyl:smd_diode_optical') * 2
        inputs metaitem('gcyl:smd_transistor_optical') * 2
        inputs metaitem('gcyl:smd_transistor_optical') * 2
        inputs ore('foilPolyetheretherketone') * 2
        inputs metaitem('gcyl:non_linear_optical_lens') * 2
        inputs metaitem('gcyl:cladded_optical_fiber_core') * 2
        inputs metaitem('gcyl:high_frequency_laser')
        inputs metaitem('gcyl:medium_frequency_laser')
        inputs metaitem('gcyl:low_frequency_laser')
        inputs metaitem('gcyl:optical_soc')
        inputs metaitem('gcyl:bose_einstein_cooling_container')
        fluidInputs fluid('polytetrafluoroethylene') * 864
        fluidInputs fluid('enriched_naquadah_alloy') * 432
        fluidInputs fluid('soldering_alloy') * 1296
        fluidInputs fluid('fullerene_doped_nanotubes') * 144
        outputs metaitem('gcyl:optical_processing_core') * 6
        duration 100
        EUt 1474560
        buildAndRegister()

}

// Hot Bright Steel Ingot * 1
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('gcyl:dustBrightSteel')], null)
// Bright Steel Ingot * 1
mods.gregtech.vacuum_freezer.removeByInput(120, [metaitem('gcyl:ingotHotBrightSteel')], null)

EBF.recipeBuilder().with {
        inputs ore('dustBrightSteel')
        outputs metaitem('gcyl:ingotBrightSteel')
        blastFurnaceTemp 2900
        duration 1200
        EUt 120
        buildAndRegister()

}

// Time Dilation Containment Unit * 1
mods.gregtech.assembly_line.removeByInput(100000, [metaitem('stickNaquadahAlloy') * 4, metaitem('gcyl:wireGtSingleUvSuperconductor') * 2, metaitem('gcyl:degenerate.rhenium.plate') * 4, metaitem('emitter.uv') * 2], [fluid('tritanium') * 144])
// Time Dilation Containment Unit * 4
mods.gregtech.assembly_line.removeByInput(800000, [metaitem('stickNaquadahAlloy') * 4, metaitem('gcyl:wireGtSingleUhvSuperconductor') * 2, metaitem('gcyl:degenerate.rhenium.plate') * 4, metaitem('emitter.uhv') * 2], [fluid('tritanium') * 144])
// Time Dilation Containment Unit * 16
mods.gregtech.assembly_line.removeByInput(12800000, [metaitem('stickNaquadahAlloy') * 4, metaitem('gcyl:wireGtSingleUevSuperconductor') * 2, metaitem('gcyl:qcd.protective.plating'), metaitem('field.generator.uhv') * 2, metaitem('gcyl:charged.lepton.trap.crystal') * 2], [fluid('tritanium') * 144])

ASSLINE.recipeBuilder().with {
        inputs ore('plateNeutronium') * 4
        inputs metaitem('gcyl:degenerate.rhenium.plate') * 4
        inputs ore('plateFullerenePolymerMatrix') * 4
        inputs ore('plateQuantum') * 4
        inputs ore('stickEnrichedNaquadahAlloy') * 3
        inputs ore('wireGtSingleUhvSuperconductor') * 2
        inputs ore('circuitSuperconductor')
        outputs metaitem('gcyl:time.dilation.containment.unit') * 4
        fluidInputs fluid('tritanium') * 144
        duration 100
        EUt 800000
        buildAndRegister()

}

// Iridium Dioxide Dust * 3
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustSalt'), metaitem('dustIridium')], [fluid('oxygen') * 2000])

CHEMICAL_REACTOR.recipeBuilder().with {
        notConsumable ore('dustSalt')
        inputs ore('dustIridium') * 2
        fluidInputs fluid('oxygen') * 4000
        fluidInputs fluid('hydrogen') * 1000
        fluidInputs fluid('bismuth_nitrate_solution') * 2000
        outputs metaitem('gcyl:dustBismuthIridiate') * 11
        fluidOutputs fluid('nitrogen_dioxide') * 1000
        fluidOutputs fluid('nitric_acid') * 5000
        duration 300
        EUt 1920
        buildAndRegister()

}

LCR.recipeBuilder().with {
        notConsumable fluid('acetic_anhydride')
        inputs ore('dustHexamethylenetetramine') * 4
        fluidInputs fluid('fuming_nitric_acid') * 2000
        outputs metaitem('tjceu:dustOctogen')
        EUt 1024
        duration 20
        buildAndRegister()

}

// TODO: Remove: wrong ratio fix. Reported to GCyL
// Seabohrgium * 1152
mods.gregtech.alloy_blast_smelter.removeByInput(1000000, [metaitem('dustSeaborgium'), metaitem('dustBohrium'), metaitem('circuit.integrated').withNbt(['Configuration': 8])], null)

ABS.recipeBuilder().with {
        inputs ore('dustSeaborgium') * 4
        inputs ore('dustBohrium') * 4
        fluidOutputs fluid('seabohrgium') * 1152
        blastFurnaceTemp 11200
        duration 160
        EUt 1000000
        buildAndRegister()

}

// TODO: Remove: wrong ratio fix. Reported to GCyL
// Fordnium * 1152
mods.gregtech.alloy_blast_smelter.removeByInput(1000000, [metaitem('dustRutherfordium'), metaitem('dustDubnium'), metaitem('circuit.integrated').withNbt(['Configuration': 8])], null)

ABS.recipeBuilder().with {
        inputs ore('dustRutherfordium') * 4
        inputs ore('dustDubnium') * 4
        fluidOutputs fluid('fordnium') * 1152
        blastFurnaceTemp 11200
        duration 160
        EUt 1000000
        buildAndRegister()

}

PLASMA_CONDENSER.recipeBuilder().with {
        circuitMeta 1
        fluidInputs fluid('plasma.helium_3') * 1000, fluid('superfluid_helium') * 100
        fluidOutputs fluid('helium') * 100, fluid('helium_3') * 1000
        duration 40
        EUt 960
        buildAndRegister()

}

