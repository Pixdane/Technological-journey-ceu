// import crafttweaker.item.IItemDefinition;
// import crafttweaker.item.IItemStack;
// import crafttweaker.item.IIngredient;
// import crafttweaker.oredict.IOreDict;
// import crafttweaker.oredict.IOreDictEntry;
// import mods.gregtech.recipe.RecipeMap;
// import mods.gregtech.material.MaterialRegistry;
// import mods.gregtech.material.Material;
// import scripts.commonNames;
// import mods.gtadditions.recipe.Utils;
// 
// furnace.removeByOutput(ore('ingotDraconium'));
// crafting.removeByOutput(ore('blockDraconium'));
// crafting.removeByOutput(ore('ingotDraconium'));
// crafting.removeByOutput(ore('nuggetDraconium'));
// crafting.removeByOutput(ore('blockDraconiumAwakened'));
// crafting.removeByOutput(ore('ingotDraconiumAwakened'));
// crafting.removeByOutput(ore('nuggetDraconiumAwakened'));
// crafting.removeByOutput(item('draconicevolution:info_tablet'));
// crafting.addShaped(item('draconicevolution:info_tablet'), [[ore('stoneSmooth'), ore('stoneSmooth'), ore('stoneSmooth')],[ore('stoneSmooth'), ore('dustRegularDraconium'), ore('stoneSmooth')], [ore('stoneSmooth'), ore('stoneSmooth'), ore('stoneSmooth')]]);
// crafting.addShapeless(item('gregtech:meta_item_1:9519'), [ore('nuggetDraconiumAwakened')]);
// crafting.addShapeless(item('gregtech:meta_item_1:10519'), [ore('ingotDraconiumAwakened')]);
// crafting.addShapeless(item('gregtech:meta_item_1:9518'), [ore('nuggetDraconium')]);
// crafting.addShapeless(item('gregtech:meta_item_1:10518'), [ore('ingotDraconium')]);
// crafting.addShapeless(ore('blockDraconium'), [ore('blockDraconium')]);
// crafting.addShapeless(ore('blockDraconiumAwakened'), [ore('blockAwakenDraconium')]);
// crafting.addShapeless(ore('blockDraconium'), [ore('blockDraconium')]);
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('gregtech:frame_tritanium') * 10,ore('plateDraconium') * 10,item('gregtech:meta_item_1:12524') * 10,ore('plateMendelevium') * 10,item('gregtech:meta_item_2:32436') * 2,item('gregtech:meta_item_1:32676'), item('gregtech:meta_item_1:32686'), item('gregtech:meta_item_1:32696'), ore('circuitInfinite'))
//     .outputs(item('draconicevolution:draconic_core') * 2)
//     .duration(1200)
//     .EUt(524288)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('gregtech:frame_hdcs')* 10,ore('plateTantalumHafniumSeaborgiumCarbide') * 10,ore('plateDraconium') * 10,ore('plateProtoAdamantium') * 10,ore('plateTitanSteel') * 10,item('gregtech:meta_item_1:32677'),item('gregtech:meta_item_1:32687'),item('gregtech:meta_item_1:32697'),ore('circuitUev'),item('draconicevolution:draconic_core'))
//     .outputs(item('draconicevolution:wyvern_core') * 2)
//     .duration(1200)
//     .EUt(2097152)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('gregtech:frame_trinium_titanium') * 10,item('gtadditions:ga_dust', 385) * 10,ore('plateAwakenDraconium') * 10,ore('plateSuperheavyLAlloy') * 10,ore('plateSuperheavyHAlloy') * 10,item('gregtech:meta_item_1', 212),item('gregtech:meta_item_1', 227), item('gregtech:meta_item_1', 242), ore('circuitUiv'),item('draconicevolution:wyvern_core'))
//     .outputs(item('draconicevolution:awakened_core')* 2)
//     .duration(600)
//     .EUt(8388608)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('gregtech:frame_quantum') * 10,ore('plateCinobite') * 10,ore('plateAwakenDraconium') * 10,item('gregtech:meta_item_1:12520') * 10,item('gtadditions:ga_meta_item:32381'), item('gtadditions:ga_meta_item:32393'), item('gtadditions:ga_meta_item:32375'), ore('circuitUxv'), metaitem('tjceu:crystal.refined_chaos'),item('draconicevolution:awakened_core'))
//     .outputs(item('draconicevolution:chaotic_core') * 2)
//     .duration(600)
//     .EUt(33554432)
//     .buildAndRegister();
// 
// 
//     chemical_bath.recipeBuilder()
//     .inputs(item('draconicevolution:chaos_shard'))
//     .fluidInputs(fluid('rutherfordium') * 1000)
//     .outputs(metaitem('tjceu:crystal.refined_chaos')* 2)
//     .duration(600)
//     .EUt(8388608)
//     .buildAndRegister();
// 
//     chemical_bath.recipeBuilder()
//     .inputs(metaitem('tjceu:shard.refined_chaos') * 9)
//     .fluidInputs(fluid('rutherfordium') * 500)
//     .outputs(metaitem('tjceu:crystal.refined_chaos'))
//     .duration(600)
//     .EUt(131072)
//     .buildAndRegister();
// 
//     Stellar.recipeBuilder()
//     .inputs(item('draconicevolution:awakened_core') * 3,metaitem('tjceu:crystal.refined_chaos'),ore('blockAwakenDraconium') * 2)
//     .fluidOutputs(fluid('raw_chaos') * 2592)
//     .duration(600)
//     .EUt(8388608)
//     .buildAndRegister();
// 
//     Stellar.recipeBuilder()
//     .inputs(item('draconicevolution:awakened_core'),item('draconicadditions:chaos_heart'),ore('blockAwakenDraconium') * 4)
//     .fluidOutputs(fluid('raw_chaos') * 5184)
//     .outputs(item('draconicevolution:dragon_heart'))
//     .duration(600)
//     .EUt(8388608)
//     .buildAndRegister();
// 
// 
//     ADVFusion.recipeBuilder()
//     .fluidInputs(fluid('raw_chaos') * 288, fluid('bohrium') * 288)//,fluid('lead_bismuth_eutatic') * 7440)
//     .fluidOutputs(fluid('plasma.chaos') * 576)//, fluid('supercritical_lead_bismuth_eutectic') * 7440)
//     .property("eu_to_start", 2000000000)
//     .property("coilTier", 5)
//     .property("euReturn", 75)
//     .duration(50)
//     .EUt(16000000)
//     .buildAndRegister();
// 
//     //crafting.addShaped(metaitem('tjceu:crystal.refined_chaos'), [[metaitem('tjceu:shard.refined_chaos'), metaitem('tjceu:shard.refined_chaos'), metaitem('tjceu:shard.refined_chaos')],[metaitem('tjceu:shard.refined_chaos'), metaitem('tjceu:shard.refined_chaos'), metaitem('tjceu:shard.refined_chaos')], [metaitem('tjceu:shard.refined_chaos'), metaitem('tjceu:shard.refined_chaos'), metaitem('tjceu:shard.refined_chaos')]]);
//     crafting.addShapeless(metaitem('tjceu:shard.refined_chaos') * 9, [metaitem('tjceu:crystal.refined_chaos')]);
// 
//     bioreactor.recipeBuilder()
//     .inputs(item('gregtech:meta_item_1', 709) * 10,item('draconicevolution:dragon_heart') * 2)
//     .fluidInputs(fluid('sterilized_growth_medium') * 2000)
//     .fluidOutputs(fluid('draconic_stem_cell_fluid') * 2000)
//     .duration(600)
//     .EUt(2097152)
//     .buildAndRegister();
// 
//     Stellar.recipeBuilder()
//     .inputs(item('draconicevolution:wyvern_core') * 2,ore('blockDraconium') * 3)
//     .fluidInputs(fluid('draconic_stem_cell_fluid') * 2000)
//     .fluidOutputs(fluid('depleted_growth_medium') * 2000, fluid('plasma.awaken_draconium') * 3888)
//     .duration(100)
//     .EUt(8388608)
//     .buildAndRegister();
// //armor
//     assembly_line.recipeBuilder()
//     .inputs(item('gregtech:machine:2505'),item('gregtech:meta_item_1:32655') * 2,ore('plateRutherfordium') * 10,ore('cableGtSingleNaquadahAlloy') * 10,ore('screwStaballoy') * 18,ore('plateDraconium') * 5)
//     .fluidInputs(fluid('dubnium') * 1296,fluid('californium')* 2592)
//     .outputs(item('gregtech:machine:1004'))
//     .duration(600)
//     .EUt(7864320)
//     .buildAndRegister();
// //eggBoi
//    assembly_line.recipeBuilder()
//     .inputs(item('gregtech:mte', 994),ore('plateTantalumHafniumSeaborgiumCarbide') * 10,ore('plateDraconium') * 10, ore('plateAwakenDraconium') * 10,item('gregtech:ga_cable:5855') * 10,ore('circuitInfinite'),item('gcyl:gcyl_meta_item', 465),item('gregtech:meta_item_1', 240))
//     .fluidInputs(fluid('incoloy813') * 1296,fluid('einsteinium') * 2592)
//     .outputs(item('gregtech:machine:1006'))
//     .duration(600)
//     .EUt(7864320)
//     .buildAndRegister();
//     //chaos
//     assembly_line.recipeBuilder()
//     .inputs(item('gregtech:mte', 995),ore('plateLafium') * 10,ore('plateHastelloyk243') * 10,ore('plateHastelloyx78') * 10,ore('plateHdcs') * 5,ore('plateAwakenDraconium') * 10,item('gregtech:meta_item_1', 196),ore('cableGtSinglePikyonium') * 10,ore('circuitUev'),item('draconicevolution:awakened_core') * 2)
//     .fluidInputs(fluid('titan_steel') * 1296,fluid('mendelevium') * 2592,fluid('cinobite') * 1296)
//     .outputs(item('gregtech:machine:1005'))
//     .duration(600)
//     .EUt(2097152)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('draconicevolution:wyvern_energy_core') * 4,item('draconicevolution:wyvern_core'),ore('gemDiamond'),item('draconicevolution:energy_crystal', 1) *4)
//     .fluidInputs(fluid('mendelevium') * 144)
//     .outputs(item('draconicevolution:energy_crystal', 2) * 4)
//     .duration(300)
//     .EUt(2097152)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(ore('enderpearl') * 3,ore('pearlEnderEye') * 7,item('draconicevolution:dislocator'),item('gregtech:meta_item_1:32724'))
//     .fluidInputs(fluid('draconium') * 576)
//     .outputs(item('draconicevolution:dislocator_advanced'))
//     .duration(200)
//     .EUt(32768)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(ore('pearlEnderEye') * 7,item('draconicevolution:wyvern_core'),item('draconicevolution:draconic_core') * 2,item('draconicevolution:dislocator'),item('draconicadditions:chaotic_energy_core'),ore('itemSkull'))
//     .fluidInputs(fluid('blaze') * 2304)
//     .outputs(item('draconicevolution:ender_energy_manipulator'))
//     .duration(200)
//     .EUt(2097152)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('draconicevolution:magnet'),item('draconicevolution:dislocator_advanced'),ore('plateAwakenDraconium') * 4,ore('dustNeodymiumMagnetic') *2)
//     .outputs(item('draconicevolution:magnet', 1))
//     .duration(200)
//     .EUt(2097152)
//     .buildAndRegister();
// 
//     crafting.removeByOutput(item('draconicevolution:celestial_manipulator'));
//     crafting.addShaped(item('draconicevolution:celestial_manipulator'), [[item('minecraft:redstone_block'), item('minecraft:clock'), item('minecraft:redstone_block')],[item('gregtech:meta_item_1:12524'), item('gregtech:meta_item_1:32675'), item('gregtech:meta_item_1:12524')], [item('gregtech:meta_item_1:12524'), item('gregtech:meta_item_2:26299'), item('gregtech:meta_item_1:12524')]]);
//     item('draconicevolution:celestial_manipulator').addTooltip(format.darkRed("Will not work on AR planets"));
// 
// 
// crafting.addShaped(item('contenttweaker:chaoticcasing') * 3, [[ore('plateEnrichedNaquadahAlloy'), item('gregtech:meta_tool', 6), ore('plateEnrichedNaquadahAlloy')],[ore('plateEnrichedNaquadahAlloy'), ore('frameGtChaos'), ore('plateEnrichedNaquadahAlloy')], [ore('plateEnrichedNaquadahAlloy'), ore('GTWrench'), ore('plateEnrichedNaquadahAlloy')]]);
// crafting.addShaped(item('contenttweaker:awakenedcasing') * 3, [[item('gregtech:meta_item_1:12855'), item('gregtech:meta_tool', 6), item('gregtech:meta_item_1:12855')],[item('gregtech:meta_item_1:12855'), ore('frameGtAwakenDraconium'), item('gregtech:meta_item_1:12855')], [item('gregtech:meta_item_1:12855'), ore('GTWrench'), item('gregtech:meta_item_1:12855')]]);
// crafting.addShaped(item('contenttweaker:draconiccasing') * 3, [[ore('plateDraconium'), item('gregtech:meta_tool', 6), ore('plateDraconium')],[ore('plateDraconium'), ore('frameGtDraconium'), ore('plateDraconium')], [ore('plateDraconium'), ore('GTWrench'), ore('plateDraconium')]]);
// 
//     assembler.recipeBuilder()
//     .inputs(item('gregtech:frame_draconium'),ore('plateDraconium') * 6)
//     .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 0}))
//     .outputs(item('contenttweaker:draconiccasing') * 3)
//     .EUt(16)
//     .duration(50)
//     .buildAndRegister();
// 
//     assembler.recipeBuilder()
//     .inputs(ore('blockAwakenDraconium'))
//     .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 0}))
//     .outputs(ore('blockDraconiumAwakened'))
//     .EUt(1)
//     .duration(1)
//     .buildAndRegister();
// 
//     assembler.recipeBuilder()
//     .inputs(item('gregtech:frame_awaken_draconium'),item('gregtech:meta_item_1:12855') * 6)
//     .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 0}))
//     .outputs(item('contenttweaker:awakenedcasing') * 3)
//     .EUt(16)
//     .duration(50)
//     .buildAndRegister();
// 
//     assembler.recipeBuilder()
//     .inputs(item('gregtech:frame_chaos'),ore('plateEnrichedNaquadahAlloy') * 6)
//     .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 0}))
//     .outputs(item('contenttweaker:chaoticcasing') * 3)
//     .EUt(16)
//     .duration(50)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('gtadditions:ga_meta_item:1518') *10,item('gregtech:meta_item_1:12524') * 10,item('gregtech:meta_item_2:32436'),item('gregtech:meta_item_1:32687'))
//     .outputs(item('draconicevolution:crafting_injector', 3))
//     .duration(200)
//     .EUt(524288)
//     .buildAndRegister();
// 
// crafting.removeByOutput(item('draconicevolution:wyvern_energy_core'));
// 
// //energy cores
//     assembly_line.recipeBuilder()
//     .inputs(item('draconicevolution:wyvern_core') * 4,ore('plateDraconium') * 10,item('gregtech:cable:5518') * 10,item('gregtech:meta_item_1:32725'))
//     .fluidInputs(fluid('redstone') * 1440)
//     .outputs(item('draconicevolution:wyvern_energy_core'))
//     .duration(400)
//     .EUt(31457280)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('draconicevolution:awakened_core') * 4,ore('plateAwakenDraconium') * 10,item('gregtech:cable:5519') * 10,item('gregtech:meta_item_1', 283))
//     .fluidInputs(fluid('redstone') * 1440)
//     .outputs(item('draconicevolution:draconic_energy_core'))
//     .duration(400)
//     .EUt(31457280)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('draconicevolution:chaotic_core')* 4,item('gregtech:meta_item_1:12520') * 10,item('gregtech:cable:5520') * 10,item('gcyl:gcyl_meta_item', 343))
//     .fluidInputs(fluid('redstone') * 1440)
//     .outputs(item('draconicadditions:chaotic_energy_core'))
//     .duration(100)
//     .EUt(2013265920)
//     .buildAndRegister();
// 
// 
//     Stellar.recipeBuilder()
//     .inputs(ore('ingotCosmicNeutronium'), item('gcyl:gcyl_meta_item', 568) ,item('gcyl:gcyl_explosive', 3))
//     .fluidInputs(fluid('chaos') * 1008)
//     .fluidOutputs(fluid('plasma.chaosalloy')* 2592)
//     .duration(20)
//     .EUt(31457280)
//     .buildAndRegister();
// 
// 
// 
//     assembly_line.recipeBuilder()
//     .inputs(ore('plateDenseDraconium') * 8, ore('plateEnrichedNaquadahAlloy') * 8, item('appliedenergistics2:dense_energy_cell') * 64,ore('wireGtSingleUvSuperconductor') * 32, ore('circuitSuperconductor') * 2)
//     .fluidInputs(fluid('tritanium') * 720,fluid('soldering_alloy') * 1296)
//     .outputs(item('appliedenergistics2:creative_energy_cell'))
//     .duration(1000)
//     .EUt(524288)
//     .buildAndRegister();
// 
// 
//     crafting.removeByOutput(item('thermalfoundation:upgrade'));
//     crafting.removeByOutput(item('thermalfoundation:upgrade', 1));
//     crafting.removeByOutput(item('thermalfoundation:upgrade', 2));
//     crafting.removeByOutput(item('thermalfoundation:upgrade', 3));
//     crafting.removeByOutput(item('thermalfoundation:upgrade', 33));
//     crafting.removeByOutput(item('thermalfoundation:upgrade', 34));
//     crafting.removeByOutput(item('thermalfoundation:upgrade', 35));
//     crafting.removeByOutput(item('thermalfoundation:upgrade', 256));
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('draconicevolution:chaotic_core') * 4,item('draconicadditions:chaotic_energy_core') * 4,ore('plateQuantum') * 64,ore('plateZylon') * 64,item('thermalfoundation:upgrade') ,item('thermalfoundation:upgrade', 1) ,item('draconicevolution:draconium_capacitor', 1), item('gtadditions:ga_cell_casing', 11),  item('gcyl:gcyl_meta_item', 377) * 2)
//     .fluidInputs(fluid('soldering_alloy') *1440,fluid('chaosalloy') * 1440)
//     .outputs(item('draconicevolution:draconium_capacitor', 2))
//     .duration(100)
//     .EUt(2013265920)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('nae2:material', 4) * 2,ore('plateSuperheavyLAlloy')* 64,ore('plateSuperheavyHAlloy') * 64,item('thermalfoundation:upgrade', 2),item('thermalfoundation:upgrade', 3)  ,item('draconicevolution:chaotic_core') * 2, item('gcyl:gcyl_meta_item', 395) * 2)
//     .fluidInputs(fluid('soldering_alloy') *1440,fluid('chaosalloy') * 1440,fluid('heavy_quark_degenerate_matter') * 1440)
//     .outputs(item('storagedrawers:upgrade_creative'))
//     .duration(100)
//     .EUt(2013265920)
//     .buildAndRegister();
// //hardened upgrade
//     assembly_line.recipeBuilder()
//     .inputs(item('draconicevolution:draconic_core') * 10,item('gregtech:meta_item_1:12524') * 64,ore('wireGtSingleUvSuperconductor') * 64,ore('plateTitanSteel') * 64)
//     .fluidInputs(fluid('soldering_alloy') *1440,fluid('draconium') * 1440)
//     .outputs(item('thermalfoundation:upgrade'))
//     .duration(100)
//     .EUt(2013265920)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('draconicevolution:wyvern_core') * 10,ore('plateProtoAdamantium') * 64,ore('wireGtSingleUhvSuperconductor') * 64,ore('platePikyonium') * 64)
//     .fluidInputs(fluid('soldering_alloy') *1440,fluid('draconium') * 1440,fluid('naquadah_alloy') * 1440)
//     .outputs(item('thermalfoundation:upgrade', 1))
//     .duration(100)
//     .EUt(2013265920)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('draconicevolution:awakened_core') * 10,ore('plateSeaborgium') * 64,ore('wireGtSingleUevSuperconductor')* 64,ore('plateBlackTitanium') * 64)
//     .fluidInputs(fluid('soldering_alloy') *1440,fluid('awaken_draconium') * 1440,fluid('enriched_naquadah_alloy') * 1440)
//     .outputs(item('thermalfoundation:upgrade', 2))
//     .duration(100)
//     .EUt(2013265920)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('draconicevolution:chaotic_core') * 10,ore('plateBohrium') * 64,ore('wireGtSingleUivSuperconductor')* 64,ore('plateHdcs') * 64)
//     .fluidInputs(fluid('soldering_alloy') *1440,fluid('chaos') * 1440,fluid('naquadriatic_taranium') * 1440)
//     .outputs(item('thermalfoundation:upgrade', 3))
//     .duration(100)
//     .EUt(2013265920)
//     .buildAndRegister();
//     //creative conversion kit
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('thermalfoundation:upgrade') * 1,item('thermalfoundation:upgrade', 1)* 1,item('thermalfoundation:upgrade', 2)* 1,item('thermalfoundation:upgrade', 3)* 1)
//     .fluidInputs(fluid('naquadriatic_taranium') * 1440, fluid('cosmic_neutronium') * 1440,fluid('enriched_naquadah_alloy') * 1440,fluid('naquadah_alloy') * 1440)
//     .outputs(item('thermalfoundation:upgrade', 256))
//     .duration(100)
//     .EUt(2013265920)
//     .buildAndRegister();
// 
//     assembly_line.recipeBuilder()
//     .inputs(item('thermalfoundation:upgrade', 256) * 1,item('storagedrawers:upgrade_creative') * 1, item('draconicevolution:draconium_capacitor', 2), metaitem('tjceu:crystal.refined_chaos') * 64, metaitem('tjceu:crystal.refined_chaos') * 64,item('contenttweaker:certificate_of_being_a_noob'), ore('circuitMax'),item('gcyl:gcyl_meta_item', 383) * 4,metaitem('tjceu:crystal.eternity') * 4)
//     .inputs(item('draconicadditions:chaos_stabilizer_core'), item('gregtech:meta_item_2:32715'), item('gtadditions:ga_cell_casing', 11) * 64,item('gtadditions:ga_cell_casing', 11) * 64,item('gtadditions:ga_cell_casing', 11) * 14, item('gtadditions:ga_multiblock_casing', 12), item('nae2:material', 4) * 64)
//     .fluidInputs(fluid('chaosalloy') * 11520)
//     .outputs(item('appliedenergistics2:creative_storage_cell'))
//     .duration(2147483647)
//     .EUt(1)
//     .buildAndRegister();
// 
//     crafting.addShaped(item('draconicadditions:chaos_stabilizer_core'), [[item('draconicadditions:chaotic_helm'), item('draconicadditions:chaotic_staff_of_power'), item('draconicadditions:chaotic_chest')],[item('draconicevolution:draconic_energy_core'), item('draconicadditions:chaotic_energy_core'), item('draconicevolution:draconic_energy_core')], [item('draconicadditions:chaotic_legs'), item('draconicadditions:chaotic_bow'), item('draconicadditions:chaotic_boots')]]);
// 
// Utils.removeRecipeByOutput(bioreactor, [item('gregtech:meta_item_1', 709) * 2], [], true);
// 
// bioreactor.recipeBuilder()
//     .inputs(item('gregtech:meta_item_1', 709))
//     .fluidInputs(fluid('sterilized_growth_medium') * 1000)
//     .outputs(item('gregtech:meta_item_1', 709) * 2)
//     .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
//     .duration(250)
//     .EUt(480)
//     .buildAndRegister();
// 
// assembler.recipeBuilder()
//     .inputs(ore('wireGtDoubleChaosalloy') * 8, item('gcyl:gcyl_meta_item', 506) * 16)
//     .fluidInputs(fluid('cosmic_neutronium') * 144)
//     .outputs(item('gcyl:wire_coil', 5))
//     .duration(250)
//     .EUt(536870900)
//     .buildAndRegister();
// 
// blast_furnace.recipeBuilder()
//     .inputs(metaitem('tjceu:crystal.refined_chaos') * 1, ore('boltChaosalloy') * 8, item('gcyl:gcyl_meta_item', 561) * 1)
//     .fluidInputs(fluid('light_quarks') * 750)
//     .outputs(item('contenttweaker:infintycrystal'))
//     .property("temperature", 19302)
//     .duration(100)
//     .EUt(536870900)
//     .buildAndRegister();
// 
// blast_furnace.recipeBuilder()
//     .inputs(item('gcyl:gcyl_meta_item', 569) * 4, item('gcyl:gcyl_meta_item', 515), item('gcyl:gcyl_meta_item', 556))
//     .fluidInputs(fluid('taranium') * 4032)
//     .outputs(item('gtadditions:ga_dust', 529))
//     .property("temperature", 23000)
//     .duration(50)
//     .EUt(536870900)
//     .buildAndRegister();
// 
// Stellar.recipeBuilder()
//     .inputs(item('gcyl:gcyl_explosive', 3), item('gtadditions:ga_dust', 529) * 4, item('contenttweaker:infintycrystal') * 2)
//     .fluidInputs(fluid('gluons') * 8000)
//     .fluidOutputs(fluid('eternity') * 1152)
//     .duration(20)
//     .EUt(536870900)
//     .buildAndRegister();
// 
// condenser.recipeBuilder()
//     .fluidInputs(fluid('eternity') * 144, fluid('microcrystallizinghydrogen') * 5000)
//     .notConsumable(item('gcyl:gcyl_meta_item', 450))
//     .fluidOutputs(fluid('hydrogen') * 5000)
//     .outputs(item('contenttweaker:eternityingot'))
//     .duration(40)
//     .EUt(536870900)
//     .buildAndRegister();
// 
// assembler.recipeBuilder()
//     .fluidInputs(fluid('chaosalloy') * 288)
//     .inputs(item('contenttweaker:eternityblock'), item('gregtech:cable:4354') * 8, item('gcyl:gcyl_meta_item', 506) * 32, item('gregtech:meta_item_1', 213))
//     .outputs(item('gcyl:wire_coil', 6))
//     .duration(100)
//     .EUt(536870900)
//     .buildAndRegister();
// 
// blast_furnace.recipeBuilder()
//     .inputs(item('gcyl:gcyl_meta_item', 559), item('gcyl:gcyl_meta_item', 569) * 8, item('contenttweaker:infintycrystal'))
//     .fluidInputs(fluid('high_energy_qgp') * 288)
//     .outputs(metaitem('tjceu:crystal.eternity'))
//     .property("temperature", 51237)
//     .duration(10000)
//     .EUt(536870900)
//     .buildAndRegister();