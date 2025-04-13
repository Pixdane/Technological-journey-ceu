import gregtech.api.metatileentity.multiblock.CleanroomType

BIO_REACTOR = recipemap('bio_reactor')
ASSEMBLER = recipemap('assembler')
EBF = recipemap('electric_blast_furnace')
STELLAR_FORGE = recipemap('stellar_forge')
PLASMA_CONDENSER = recipemap('plasma_condenser')
LCR = recipemap('large_chemical_reactor')
EXTRUDER = recipemap('extruder')
ADV_FUSION = recipemap('adv_fusion')

// TODO: Change Tiny Pile Recipes & Isotopes
// Tiny Pile of Lutetium Dust * 1
mods.gregtech.large_centrifuge.removeByInput(7680, [metaitem('dustNaquadria')], [fluid('nitrogen_dioxide') * 500 * 500, fluid('sulfuric_acid') * 500 * 500])

// Actinium Nitrate Dust * 26
mods.gregtech.large_centrifuge.removeByInput(32700, null, [fluid('actinium_radium_nitrate_solution') * 13000 * 13000, fluid('theonyl_trifluoroacetate') * 500 * 500])

// Stem Cells * 2
mods.gregtech.bio_reactor.removeByInput(480, [metaitem('stem_cells')], [fluid('sterilized_growth_medium') * 1000 * 1000])

BIO_REACTOR.recipeBuilder()
        .inputs(metaitem('stem_cells'))
        .fluidInputs(fluid('sterilized_growth_medium') * 1000)
        .outputs(metaitem('stem_cells') * 2)
        .circuitMeta(1)
        .cleanroom(CleanroomType.STERILE_CLEANROOM)
        .duration(250)
        .EUt(480)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs(ore('wireGtDoubleChaosalloy') * 8)
        .inputs(metaitem('gcyl:highly_insulating_foil') * 16)
        .fluidInputs(fluid('cosmic_neutronium') * 144)
        .outputs(item('gcyl:wire_coil', 6))
        .duration(250)
        .EUt(536870900)
        .buildAndRegister()

EBF.recipeBuilder()
        .inputs(metaitem('tjceu:crystal.refined_chaos'))
        .inputs(ore('boltChaosalloy') * 8)
        .inputs(metaitem('gcyl:recursively.folded.negative.space'))
        .fluidInputs(fluid('light_quarks') * 750)
        .outputs(metaitem('tjceu:crystal.infinity'))
        .blastFurnaceTemp(19302)
        .duration(100)
        .EUt(536870900)
        .buildAndRegister()

EBF.recipeBuilder()
        .inputs(metaitem('gcyl:cosmic.fabric') * 4)
        .inputs(metaitem('gcyl:time.dilation.containment.unit'))
        .inputs(metaitem('gcyl:qcd.protective.plating'))
        .fluidInputs(fluid('taranium') * 4032)
        .outputs(metaitem('tjceu:dustEternityPreparation'))
        .blastFurnaceTemp(23000)
        .duration(50)
        .EUt(536870900)
        .buildAndRegister()

STELLAR_FORGE.recipeBuilder()
        .inputs(item('gcyl:gcyl_explosive', 3))
        .inputs(metaitem('tjceu:dustEternityPreparation') * 4)
        .inputs(metaitem('tjceu:crystal.infinity') * 2)
        .fluidInputs(fluid('gluons') * 8000)
        .fluidOutputs(fluid('plasma.eternity') * 1152)
        .duration(20)
        .EUt(536870900)
        .buildAndRegister()

PLASMA_CONDENSER.recipeBuilder()
        .fluidInputs(fluid('plasma.eternity') * 144)
        .fluidInputs(fluid('microcrystallizinghydrogen') * 5000)
        .notConsumable(metaitem('gcyl:ingot.field.shape'))
        .fluidOutputs(fluid('hydrogen') * 5000)
        .outputs(metaitem('tjceu:ingotEternity'))
        .duration(40)
        .EUt(536870900)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs(metaitem('tjceu:blockEternity'))
        .inputs(ore('wireGtHexMaxSuperconductor') * 8)
        .inputs(metaitem('gcyl:highly_insulating_foil') * 32)
        .inputs(metaitem('field.generator.opv'))
        .fluidInputs(fluid('chaosalloy') * 288)
        .outputs(item('gcyl:wire_coil', 7))
        .duration(100)
        .EUt(536870900)
        .buildAndRegister()

EBF.recipeBuilder()
        .inputs(metaitem('gcyl:eigenfolded.kerr.manifold'))
        .inputs(metaitem('gcyl:cosmic.fabric') * 8)
        .inputs(metaitem('tjceu:crystal.infinity'))
        .fluidInputs(fluid('high_energy_qgp') * 288)
        .outputs(metaitem('tjceu:crystal.eternity'))
        .blastFurnaceTemp(51237)
        .duration(10000)
        .EUt(536870900)
        .buildAndRegister()

//TODO: from OtherRecipes

LCR.recipeBuilder()
        .inputs(ore('dustSodaAsh') * 6)
        .fluidInputs(fluid('water') * 1000)
        .circuitMeta(1)
        .outputs(metaitem('dustSodiumBicarbonate') * 6)
        .outputs(metaitem('dustSodiumHydroxide') * 3)
        .duration(140)
        .EUt(30)
        .buildAndRegister()

// Sodium Bicarbonate Dust * 6
// TODO: wrong stoichiometry, report to GCYL:CEu
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2]), metaitem('dustSodaAsh')], [fluid('water') * 1000])


LCR.recipeBuilder()
        .inputs(ore('dustSodaAsh') * 6)
        .fluidInputs(fluid('water') * 2000)
        .fluidInputs(fluid('epichlorohydrin') * 1000)
        .circuitMeta(2)
        .outputs(metaitem('dustSalt') * 2)
        .outputs(metaitem('dustSodiumBicarbonate') * 6)
        .fluidOutputs([fluid('glycerol') * 1000])
        .duration(100)
        .EUt(1024)
        .buildAndRegister()

// TODO: should TJCEu item recipes be moved to individual files?
crafting.addShaped(metaitem('tjceu:steam.motor.ulv'), [[ore('stickWood'), ore('plateBronze'), ore('stickIron')], [ore('plateBronze'), ore('stickIron'), ore('plateBronze')], [ore('ingotIron'), ore('plateBronze'), ore('stickWood')]])

crafting.addShaped(metaitem('tjceu:steam.piston.ulv'), [[ore('gearSmallIron'), ore('stickWood'), ore('stickWood')], [ore('gearSmallIron'), metaitem('tjceu:steam.motor.ulv'), ore('plateBronze')], [ore('plateIron'), ore('plateIron'), ore('plateIron')]])
// TODO: recipes for steam pump & steam conveyor belt

furnace.add(item('minecraft:gold_ingot'), item('gcyl:meta_block_compressed_9', 15))


EXTRUDER.recipeBuilder()
        .inputs(ore('blockTritanium') * 64)
        .inputs(ore('blockTritanium') * 64)
        .outputs(item('tjceu:tj_meta_item', 800))
        .duration(30000000)
        .EUt(3)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs(item('enderio:block_reservoir') * 4)
        .inputs(item('gregtech:mte', 987))
        .outputs(item('gcyl:gcyl_meta_item', 571))
        .duration(200)
        .EUt(110)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs(item('enderio:block_reservoir') * 4)
        .inputs(metaitem('hull.hv'))
        .outputs(item('gcyl:gcyl_meta_item', 572))
        .duration(200)
        .EUt(500)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs(item('enderio:block_reservoir') * 4)
        .inputs(metaitem('hull.ev'))
        .outputs(item('gcyl:gcyl_meta_item', 573))
        .duration(200)
        .EUt(2048)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs(item('enderio:block_reservoir') * 4)
        .inputs(item('gregtech:mte', 990))
        .outputs(item('gcyl:gcyl_meta_item', 574))
        .duration(200)
        .EUt(8192)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs(item('enderio:block_reservoir') * 4)
        .inputs(item('gregtech:mte', 991))
        .outputs(item('gcyl:gcyl_meta_item', 575))
        .duration(200)
        .EUt(32768)
        .buildAndRegister()


ASSEMBLER.recipeBuilder()
        .inputs(item('enderio:block_reservoir') * 4)
        .inputs(item('gregtech:mte', 992))
        .outputs(item('gcyl:gcyl_meta_item', 576))
        .duration(200)
        .EUt(131072)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs(item('enderio:block_reservoir') * 4)
        .inputs(item('gregtech:mte', 993))
        .outputs(item('gcyl:gcyl_meta_item', 577))
        .duration(200)
        .EUt(524288)
        .buildAndRegister()

//Upgrade recipes

ASSEMBLER.recipeBuilder()
        .inputs(item('enderio:block_reservoir') * 4)
        .inputs(item('gcyl:gcyl_meta_item', 572))
        .outputs(item('gcyl:gcyl_meta_item', 573))
        .duration(200)
        .EUt(2048)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs(item('enderio:block_reservoir') * 4)
        .inputs(item('gcyl:gcyl_meta_item', 573))
        .outputs(item('gcyl:gcyl_meta_item', 574))
        .duration(200)
        .EUt(8192)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs(item('enderio:block_reservoir') * 4)
        .inputs(item('gcyl:gcyl_meta_item', 574))
        .outputs(item('gcyl:gcyl_meta_item', 575))
        .duration(200)
        .EUt(32768)
        .buildAndRegister()


ASSEMBLER.recipeBuilder()
        .inputs(item('enderio:block_reservoir') * 4)
        .inputs(item('gcyl:gcyl_meta_item', 575))
        .outputs(item('gcyl:gcyl_meta_item', 576))
        .duration(200)
        .EUt(131072)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs(item('enderio:block_reservoir') * 4)
        .inputs(item('gcyl:gcyl_meta_item', 576))
        .outputs(item('gcyl:gcyl_meta_item', 577))
        .duration(200)
        .EUt(524288)
        .buildAndRegister()


// TODO: remove Crystal SMD Resistor and resolve bug
//mods.gregtech.assembler.removeByInput(7904, [metaitem('wireFineNaquadahAlloy') * 8, metaitem('plateGraphene'), metaitem('dustSiliconCarbide')], [fluid('plastic') * 144 * 144])

ASSEMBLER.recipeBuilder()
        .inputs(ore('plateGraphene'))
        .inputs(ore('plateRuthenium'))
        .inputs(ore('wireFineNaquadahAlloy') * 8)
        .fluidInputs(fluid('soldering_alloy') * 144)
        .outputs(item('gcyl:gcyl_meta_item', 250) * 24)
        .duration(80)
        .EUt(7904)
        .buildAndRegister()


// Raw Imprinted Resonatic Circuit Board
mods.gregtech.forming_press.removeByInput(480, [metaitem('gcyl:dustCircuitCompoundMkc') * 4, metaitem('gcyl:dustMagnetoResonatic')], null)

ADV_FUSION.recipeBuilder()
        .fluidInputs(fluid('sodium') * 144, fluid('curium_250') * 144)
        .fluidOutputs(fluid('bohrium') * 288)
        .EUToStart(1000000000)
        .AdvCoilTier(1)
        .EUReturn(40)
        .duration(50)
        .EUt(1000000)
        .buildAndRegister()


// TODO: Hot Coolant Rotor Holder
//crafting.removeByOutput(item('gregtech:machine:3208'))
//crafting.removeByOutput(item('gregtech:machine:3209'))
//crafting.removeByOutput(item('gregtech:machine:3210'))
//crafting.removeByOutput(item('gregtech:machine', 817))
//crafting.removeByOutput(item('gregtech:machine', 818))
//crafting.removeByOutput(item('gregtech:machine', 819))


// Utils.removeRecipeByOutput(arc, [ore('ingotQcdConfinedMatter')], [], false)
// Utils.removeRecipeByOutput(parc, [ore('ingotQcdConfinedMatter')], [], false)
// TODO: remove QCD Confined fluid recipes from extractor by parts
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 566)], [], true)  


ASSEMBLER.recipeBuilder()
        .inputs(ore('plateCosmicNeutronium') * 3)
        .inputs(ore('plateFullerenePolymerMatrix') * 3)
        .inputs(item('gregtech:meta_item_1:12520') * 3)
        .outputs(item('gcyl:gcyl_meta_item', 566))
        .fluidInputs(fluid('neutronium_doped_nanotubes') * 2000)
        .duration(280)
        .EUt(536870000)
        .buildAndRegister()


// Utils.removeRecipeByOutput(assembly_line, [item('gcyl:gcyl_meta_item', 500) * 6], [], true)


// assembly_line.recipeBuilder()
//         .inputs(ore('plateProtoAdamantium') * 4)
//         .inputs(item('gcyl:gcyl_meta_item', 495) * 2)
//         .inputs(item('gcyl:gcyl_meta_item', 496) * 2)
//         .inputs(item('gcyl:gcyl_meta_item', 497) * 2)
//         .inputs(item('gcyl:gcyl_meta_item', 494) * 2)
//         .inputs(ore('foilPolyetheretherketone') * 2)
//         .inputs(item('gcyl:gcyl_meta_item', 491) * 2)
//         .inputs(item('gcyl:gcyl_meta_item', 438) * 2)
//         .inputs(item('gcyl:gcyl_meta_item', 488))
//         .inputs(item('gcyl:gcyl_meta_item', 487))
//         .inputs(item('gcyl:gcyl_meta_item', 486))
//         .inputs(item('gcyl:gcyl_meta_item', 499))
//         .inputs(item('gcyl:gcyl_meta_item', 459))
//         .outputs(item('gcyl:gcyl_meta_item', 500) * 6)
//         .fluidInputs(fluid('polytetrafluoroethylene') * 864, fluid('enriched_naquadah_alloy') * 432, fluid('soldering_alloy') * 1296, fluid('fullerene_doped_nanotubes') * 144)
//         .duration(100)
//         .EUt(1474560)
//         .buildAndRegister()


// var MAXcompblocks = [item('gtadditions:ga_conveyor_casing', 13), item('gtadditions:ga_field_gen_casing', 13), item('gtadditions:ga_motor_casing', 13), item('gtadditions:ga_piston_casing', 13), item('gtadditions:ga_pump_casing', 13), item('gtadditions:ga_robot_arm_casing', 13), item('gtadditions:ga_sensor_casing', 13), item('gtadditions:ga_emitter_casing', 13)] as IItemStack[]
// var Maxcomp = [item('gcyl:gcyl_meta_item', 353), item('gcyl:gcyl_meta_item', 383), item('gcyl:gcyl_meta_item', 359), item('gcyl:gcyl_meta_item', 365), item('gcyl:gcyl_meta_item', 371), item('gcyl:gcyl_meta_item', 389), item('gcyl:gcyl_meta_item', 395), item('gcyl:gcyl_meta_item', 377)] as IItemStack[]

// for
// i in 0 to 8 {

//     Utils.removeRecipeByOutput(assembler, [MAXcompblocks[i]], [], true)

//     ASSEMBLER.recipeBuilder()
//             .inputs([ore('cableGtSingleCosmicNeutronium') * 8, item('gregtech:machine', 509), Maxcomp[i] * 2])
//             .outputs(MAXcompblocks[i])
//             .fluidInputs(fluid('soldering_alloy') * 288)
//             .duration(100)
//             .EUt(536870900)
//             .buildAndRegister()
// }


// assembly_line.recipeBuilder()
//         .inputs(item('gregtech:cable:2354') * 64)
//         .inputs(item('gtadditions:ga_dust', 55) * 64)
//         .inputs(item('gtadditions:ga_cell_casing', 11))
//         .inputs(ore('boltCosmicNeutronium') * 16)
//         .inputs(ore('plateDenseChaosalloy') * 8)
//         .inputs(ore('circuitMax'))
//         .inputs(item('gcyl:gcyl_meta_item', 377))
//         .inputs(item('gcyl:gcyl_meta_item', 395))
//         .outputs(item('gregtech:meta_item_2:32715'))
//         .fluidInputs(fluid('cosmic_mesh_plasma') * 1000, fluid('quantum') * 1296)
//         .duration(100)
//         .property("qubit", 16)
//         .EUt(983040000)
//         .buildAndRegister()


// ASSEMBLER.recipeBuilder()
//         .inputs(item('gtadditions:ga_cell_casing', 10))
//         .inputs(item('gtadditions:ga_meta_item:1521') * 4)
//         .outputs(item('gtadditions:ga_cell_casing', 11))
//         .fluidInputs(fluid('qcd_confined_matter') * 4000)
//         .duration(1200)
//         .EUt(536870900)
//         .buildAndRegister()

// ASSEMBLER.recipeBuilder()
//         .inputs(item('gtadditions:ga_cell_casing', 9))
//         .inputs(ore('plateDenseHeavyQuarkDegenerateMatter') * 4)
//         .outputs(item('gtadditions:ga_cell_casing', 10))
//         .fluidInputs(fluid('degenerate_rhenium_plasma') * 4000)
//         .duration(1200)
//         .EUt(536870900)
//         .buildAndRegister()

// //max componets
// //motor
// assembly_line.recipeBuilder()
//         .inputs(ore('stickLongNaquadriaticTaranium') * 64)
//         .inputs(ore('stickLongNaquadriaticTaranium') * 64)
//         .inputs(ore('wireFineHeavyQuarkDegenerateMatter') * 64)
//         .inputs(ore('wireFineHeavyQuarkDegenerateMatter') * 64)
//         .inputs(ore('wireFineHeavyQuarkDegenerateMatter') * 64)
//         .inputs(ore('wireFineHeavyQuarkDegenerateMatter') * 64)
//         .inputs(ore('stickLongCosmicNeutronium') * 2)
//         .inputs(ore('ringCosmicNeutronium') * 4)
//         .inputs(ore('roundCosmicNeutronium') * 16)
//         .inputs(ore('cableGtHexCosmicNeutronium') * 2)
//         .inputs(metaitem('gcyl:cosmic.fabric') * 8)
//         .notConsumable(item('gcyl:gcyl_meta_item', 518))
//         .outputs(item('gcyl:gcyl_meta_item', 359))
//         .fluidInputs(fluid('lubricant') * 3000, fluid('soldering_alloy') * 1728)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()
// //pistin
// assembly_line.recipeBuilder()
//         .inputs(ore('plateQcdConfinedMatter') * 8)
//         .inputs(ore('gearSmallCosmicNeutronium') * 8)
//         .inputs(ore('stickQcdConfinedMatter') * 4)
//         .inputs(ore('ingotCosmicNeutronium') * 2)
//         .inputs(item('gcyl:gcyl_meta_item', 359))
//         .inputs(ore('cableGtQuadrupleCosmicNeutronium') * 2)
//         .notConsumable(item('gcyl:gcyl_meta_item', 518))
//         .outputs(item('gcyl:gcyl_meta_item', 365))
//         .fluidInputs(fluid('lubricant') * 2000, fluid('soldering_alloy') * 576)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()
// //convar
// assembly_line.recipeBuilder()
//         .inputs(ore('cableGtQuadrupleCosmicNeutronium') * 2)
//         .inputs(item('gcyl:gcyl_meta_item', 359) * 2)
//         .inputs(ore('gearCosmicNeutronium') * 4)
//         .inputs(ore('stickQcdConfinedMatter') * 4)
//         .inputs(ore('plateQcdConfinedMatter') * 8)
//         .inputs(ore('ingotQcdConfinedMatter'))
//         .notConsumable(item('gcyl:gcyl_meta_item', 518))
//         .outputs(item('gcyl:gcyl_meta_item', 353))
//         .fluidInputs(fluid('lubricant') * 5000, fluid('zylon') * 1440)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()
// //pump
// assembly_line.recipeBuilder()
//         .inputs(item('gcyl:gcyl_meta_item', 359))
//         .inputs(ore('cableGtQuadrupleCosmicNeutronium') * 2)
//         .inputs(ore('ringSiliconeRubber') * 16)
//         .inputs(ore('screwCosmicNeutronium') * 8)
//         .inputs(ore('rotorCosmicNeutronium') * 2)
//         .notConsumable(item('gcyl:gcyl_meta_item', 518))
//         .outputs(item('gcyl:gcyl_meta_item', 371))
//         .fluidInputs(fluid('lubricant') * 2000, fluid('soldering_alloy') * 576)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()
// //emitter
// assembly_line.recipeBuilder()
//         .inputs(ore('circuitMax') * 2)
//         .inputs(item('gtadditions:ga_dust', 384) * 64)
//         .inputs(item('gcyl:gcyl_meta_item', 555))
//         .inputs(item('gcyl:gcyl_meta_item', 516))
//         .inputs(ore('stickLongMendelevium') * 64)
//         .inputs(item('gcyl:gcyl_meta_item', 561) * 2)
//         .inputs(ore('cableGtSingleCosmicNeutronium') * 8)
//         .inputs(item('gregtech:meta_item_1:19520') * 64)
//         .inputs(ore('frameGtCosmicNeutronium'))
//         .outputs(item('gcyl:gcyl_meta_item', 377))
//         .fluidInputs(fluid('soldering_alloy') * 864)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()

// //field generator
// assembly_line.recipeBuilder()
//         .inputs(item('gregtech:meta_item_2:16520') * 64)
//         .inputs(item('gregtech:meta_item_2:16520') * 64)
//         .inputs(ore('cableGtSingleCosmicNeutronium') * 4)
//         .inputs(ore('frameGtChaos'))
//         .inputs(item('gcyl:gcyl_meta_item', 519))
//         .inputs(ore('boltChaosalloy') * 16)
//         .inputs(metaitem('gcyl:cosmic.mesh') * 4)
//         .inputs(metaitem('gcyl:qcd.protective.plating') * 4)
//         .inputs(item('gregtech:cable', 354) * 4)
//         .inputs(ore('circuitMax'))
//         .outputs(item('gcyl:gcyl_meta_item', 383))
//         .fluidInputs(fluid('soldering_alloy') * 864)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()
// //arm
// assembly_line.recipeBuilder()
//         .inputs(ore('cableGtDoubleCosmicNeutronium') * 16)
//         .inputs(ore('circuitUxv') * 8)
//         .inputs(item('gcyl:gcyl_meta_item', 359) * 2)
//         .inputs(item('gcyl:gcyl_meta_item', 365))
//         .inputs(ore('ingotCosmicNeutronium'))
//         .inputs(ore('stickQcdConfinedMatter') * 8)
//         .inputs(ore('screwCosmicNeutronium') * 16)
//         .outputs(item('gcyl:gcyl_meta_item', 389))
//         .fluidInputs(fluid('soldering_alloy') * 864, fluid('lubricant') * 864)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()
// //sensor
// assembly_line.recipeBuilder()
//         .inputs(metaitem('gcyl:cosmic.fabric') * 4)
//         .inputs(ore('circuitMax') * 2)
//         .inputs(ore('cableGtSingleCosmicNeutronium') * 4)
//         .inputs(item('gregtech:meta_item_1:19520') * 64)
//         .inputs(ore('foilFullerenePolymerMatrix') * 64)
//         .inputs(item('gcyl:gcyl_meta_item', 459) * 32)
//         .inputs(item('gcyl:gcyl_meta_item', 516))
//         .inputs(ore('frameGtCosmicNeutronium'))
//         .outputs(item('gcyl:gcyl_meta_item', 395))
//         .fluidInputs(fluid('high_energy_qgp') * 2000)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister()


// furnace.removeByOutput(ore('ingotBrightSteel'))


// EBF.recipeBuilder()
//         .inputs(ore('dustBrightSteel'))
//         .outputs(ore('ingotBrightSteel'))
//         .blastFurnaceTemp(2900) //this is a minimal temperature at which the item will be smelted
//         .duration(1200)
//         .EUt(120)
//         .buildAndRegister()


// Utils.removeRecipeByOutput(gas_centrifuge, [], [fluid('titanium50_tetrafluoride') * 518, fluid('fluorine') * 9482], true)


// gas_CENTRIFUGE.recipeBuilder()
//         .fluidInputs(fluid('titanium_tetrafluoride') * 10000)
//         .fluidOutputs(fluid('titanium50_tetrafluoride') * 518, fluid('titanium_tetrafluoride') * 9482)
//         .duration(210)
//         .EUt(30720)
//         .buildAndRegister()


// MIXER.recipeBuilder()
//         .inputs(ore('dustEuropium'), ore('dustCaesium') * 2, ore('dustSteel') * 4, ore('dustBismuth') * 2)
//         .outputs(ore('dustBrightSteel') * 9)
//         .duration(400)
//         .EUt(16)
//         .buildAndRegister()

// LARGE_MIXER.recipeBuilder()
//         .inputs(ore('dustEuropium'), ore('dustCaesium') * 2, ore('dustSteel') * 4, ore('dustBismuth') * 2)
//         .outputs(ore('dustBrightSteel') * 9)
//         .circuitMeta(4)
//         .duration(400)
//         .EUt(16)
//         .buildAndRegister()


// //fix cosmic mesh and fabric
// Utils.removeRecipeByOutput(condenser, [metaitem('gcyl:cosmic.fabric')], [], true)
// Utils.removeRecipeByOutput(condenser, [metaitem('gcyl:cosmic.mesh')], [], true)

// //facric
// condenser.recipeBuilder()
//         .inputs(item('gcyl:gcyl_meta_item', 567))
//         .notConsumable(item('gcyl:gcyl_meta_item', 562))
//         .outputs(metaitem('gcyl:cosmic.fabric'), metaitem('gcyl:time.dilation.containment.unit'))
//         .fluidInputs(fluid('xenon') * 500, fluid('superfluid_helium') * 24000)
//         .fluidOutputs(fluid('helium') * 24000)
//         .duration(500)
//         .EUt(10000000)
//         .buildAndRegister()


// //mesh
// condenser.recipeBuilder()
//         .inputs(item('gcyl:gcyl_meta_item', 567))
//         .notConsumable(item('gcyl:gcyl_meta_item', 431))
//         .outputs(metaitem('gcyl:cosmic.mesh'), metaitem('gcyl:time.dilation.containment.unit'))
//         .fluidInputs(fluid('superfluid_helium') * 24000)
//         .fluidOutputs(fluid('helium') * 24000)
//         .duration(500)
//         .EUt(10000000)
//         .buildAndRegister()


// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 552)], [], true)
// Utils.removeRecipeByOutput(assembly_line, [metaitem('gcyl:time.dilation.containment.unit')], [], false)


// ASSEMBLER.recipeBuilder()
//         .inputs(item('gregtech:meta_item_1', 241), metaitem('gcyl:qcd.protective.plating') * 2, item('gcyl:gcyl_meta_item', 511), item('gcyl:gcyl_meta_item', 516))
//         .outputs(item('gcyl:gcyl_meta_item', 552))
//         .fluidInputs(fluid('neutronium') * 144)
//         .duration(600)
//         .EUt(33550000)
//         .buildAndRegister()

// assembly_line.recipeBuilder()
//         .inputs(ore('plateNeutronium') * 4, item('gcyl:gcyl_meta_item', 430) * 4, ore('plateFullerenePolymerMatrix') * 4, ore('plateQuantum') * 4, ore('stickEnrichedNaquadahAlloy') * 3, ore('wireGtSingleUhvSuperconductor') * 2, ore('circuitSuperconductor'))
//         .outputs(metaitem('gcyl:time.dilation.containment.unit') * 4)
//         .fluidInputs(fluid('tritanium') * 144)
//         .duration(100)
//         .EUt(800000)
//         .buildAndRegister()


// ASSEMBLER.recipeBuilder()
//         .inputs(ore('circuitOpv') * 2, ore('gearQcdConfinedMatter') * 4, ore('plateQcdConfinedMatter') * 4, ore('cableGtQuadrupleNeutronium'))
//         .outputs(item('gtadditions:ga_multiblock_casing2', 4))
//         .fluidInputs(fluid('enriched_naquadah_alloy') * 288)
//         .duration(100)
//         .EUt(536870900)
//         .buildAndRegister()

// ASSEMBLER.recipeBuilder()
//         .inputs(ore('circuitMax') * 4, ore('gearNeutronium') * 4, ore('plateNeutronium') * 4, item('gregtech:cable:7521'))
//         .outputs(item('gtadditions:ga_multiblock_casing', 12))
//         .fluidInputs(fluid('chaos') * 288)
//         .duration(100)
//         .EUt(2147483647)
//         .buildAndRegister()


// crafting.removeByOutput(item('gcyl:mte', 17))
// crafting.addShaped(item('gcyl:mte', 17), [[ore('circuitEv'), item('gregtech:fluid_pipe:3235'), ore('circuitEv')], [ore('gearTitanium'), item('gregtech:mte', 188), ore('gearTitanium')], [item('gregtech:meta_item_1:12981'), item('gregtech:meta_item_1:13981'), item('gregtech:meta_item_1:12981')]])


// chemical_bath.recipeBuilder()
//         .inputs(ore('dustRegularBrightSteel') * 2)
//         .outputs(ore('dustAstralStarmetal') * 2)
//         .fluidInputs(fluid('astralsorcery.liquidstarlight') * 1000)
//         .duration(100)
//         .EUt(131072)
//         .buildAndRegister()