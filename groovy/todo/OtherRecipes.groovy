// gt coal dust 
// macerator.recipeBuilder()
// .inputs([ore('coal')])
// .outputs([ore('dustCoal')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();

// Iron Dust
// macerator.recipeBuilder()
// .inputs([ore('ingotIron')])
// .outputs([ore('dustIron')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();

// Ender Pearl Dust
// macerator.recipeBuilder()
// .inputs([ore('enderpearl')])
// .outputs([ore('dustEnderPearl')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();

// Nether Quartz Dust
// macerator.recipeBuilder()
// .inputs([ore('gemNetherQuartz,gemQuartz')])
// .outputs([item('gregtech:meta_item_1:2201')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();

// Remove macerator recipes
// macerator.findRecipe(240, [ore('coal,gemCoal,itemCoal')], null).remove();
// macerator.findRecipe(240, [ore('crystalCertusQuartz,gemCertusQuartz')], null).remove();
// macerator.findRecipe(240, [ore('ingotIron')], null).remove();
// macerator.findRecipe(240, [ore('ingotGold')], null).remove();
// macerator.findRecipe(240, [ore('enderpearl')], null).remove();
// //alloy.findRecipe(5120, [ore('dustRedstone'),metaitem('wafer.silicon')], null).remove();

// Certus Quartz Dust
// macerator.recipeBuilder()
// .inputs([ore('crystalCertusQuartz,gemCertusQuartz')])
// .outputs([item('gregtech:meta_item_1:2202')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();

// Obsidian Dust
// macerator.recipeBuilder()
// .inputs([item('minecraft:obsidian')])
// .outputs([ore('dustObsidian')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();

// Gold Dust
// macerator.recipeBuilder()
// .inputs([ore('ingotGold')])
// .outputs([item('gregtech:meta_item_1:2026')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// brewer.recipeBuilder()
// .inputs([item('gregtech:meta_item_1', 439)])
// .fluidInputs(fluid('water') * 180)
// .fluidOutputs(fluid('biomass') * 270)
// .duration(1440)
// .EUt(3)
// .buildAndRegister();
//
// chemreactor.recipeBuilder()
// .inputs([ore('dustTinySodiumHydroxide')])
// .fluidInputs( fluid(' creosote') * 6000, fluid(' ethanol') * 1000)
// .fluidOutputs(fluid(' bio_diesel') * 6000, fluid(' glycerol') * 1000)
// .duration(600)
// .EUt(30)
// .buildAndRegister();
// 
// chemreactor.recipeBuilder()
// .inputs([ore('dustTinySodiumHydroxide')])
// .fluidInputs( fluid(' creosote') * 6000, fluid(' methanol') * 1000)
// .fluidOutputs(fluid(' bio_diesel') * 6000, fluid(' glycerol') * 1000)
// .duration(600)
// .EUt(30)
// .buildAndRegister();
// 
// macerator.recipeBuilder()
// .inputs([ore('stoneGraniteBlack')])
// .outputs([ore('dustGraniteBlack') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// macerator.recipeBuilder()
// .inputs([item('advancedrocketry:basalt')])
// .outputs([ore('dustBasalt') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// macerator.recipeBuilder()
// .inputs([ore('stoneGraniteRed')])
// .outputs([ore('dustGraniteRed') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// macerator.recipeBuilder()
// .inputs([item('gregtech:mineral', 2)])
// .outputs([ore('dustBasalt') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// macerator.recipeBuilder()
// .inputs([ore('stoneGraniteRed')])
// .outputs([ore('dustGraniteRed') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// autoclave.recipeBuilder()
// .inputs([item('minecraft:experience_bottle')])
// .fluidInputs([fluid('methane') * 1000])
// .outputs([item('gregtech:meta_item_1', 93) *10])
// .duration(60)
// .EUt(30)
// .buildAndRegister();
// blast_furnace.recipeBuilder()
//     .inputs(ore('dustSignalum') * 1)
//     .outputs(ore('ingotSignalum') * 1)
//     .blastFurnaceTemp(4500) //this is a minimal temperature at which the item will be smelted
//     .duration(1530)
//     .EUt(120)
//     .buildAndRegister();
// 
//     blast_furnace.recipeBuilder()
//     .inputs(ore('dustLumium') * 1)
//     .outputs(ore('ingotLumium') * 1)
//     .blastFurnaceTemp(4500) //this is a minimal temperature at which the item will be smelted
//     .duration(1530)
//     .EUt(120)
//     .buildAndRegister();
// 
// mixer.recipeBuilder()
// .inputs([ore('dustCopper') *3,ore('dustSilver') ])
// .fluidInputs(fluid('redstone') * 1000)
// .outputs([ore('dustSignalum') * 4])
// .duration(240)
// .EUt(500)
// .buildAndRegister();
// mixer.recipeBuilder()
// .inputs([ore('dustTin') *3,ore('dustSilver')])
// .fluidInputs(fluid('glowstone') * 1000)
// .outputs([ore('dustLumium') * 4])
// .duration(240)
// .EUt(500)
// .buildAndRegister();
// freezer.findRecipe(48000,null,[fluid('air')* 4000]).remove();
// centrifuge.findRecipe(48000,null,[fluid('liquid_air')* 53000]).remove();
// 
// 
//     //blast_furnace .findRecipe(2361600,[ore('ingotTungsten'),ore('dustCarbon,dyeBlack')] ,null).remove();
//     crafting.addShaped(item('thermalfoundation:material', 640), [[null, null, null],[null, item('actuallyadditions:item_misc', 16), null], [null, null, null]]);
//     crafting.addShaped(item('thermalfoundation:material', 656), [[null, ore('plateDenseStainlessSteel'), null],[ore('plateDenseStainlessSteel'), ore('stickLongStainlessSteel'), ore('plateDenseStainlessSteel')], [null, ore('plateDenseStainlessSteel'), null]]);
// //    recipes.removeShaped(ore('blockHopper'));
// /*
//     assembler.recipeBuilder()
//         .inputs([ore('plateDoubleSteel'),ore('ingotDarkSteel')])
//         .outputs([item('enderio:item_dark_steel_upgrade')])
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
//         */
// crafting.addShaped(item('trashcans:ultimate_trash_can'), [[null, item('trashcans:item_trash_can'), null],[item('trashcans:energy_trash_can'), null, item('trashcans:liquid_trash_can')], [null, null, null]]);
// crafting.addShaped(item('trashcans:liquid_trash_can'), [[null, ore('plateSteel'), null],[ore('plateSteel'), item('gregtech:mte:1612'), ore('plateSteel')], [null,null, null]]);
// crafting.addShaped(item('trashcans:energy_trash_can'), [[null, ore('plateSteel'), null],[ore('plateSteel'), ore('stickLongCopper'), ore('plateSteel')], [null,null, null]]);
// crafting.addShaped(item('trashcans:item_trash_can'), [[null, ore('plateSteel'), null],[ore('plateSteel'), item('gregtech:machine', 803), ore('plateSteel')], [null, null, null]]);
// fluid_extractor.recipeBuilder()
//         .inputs([item('futuremc:honeycomb')])
//         .fluidOutputs(fluid('honey') * 500)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
// fluid_extractor.recipeBuilder()
//         .inputs([item('futuremc:honey_bottle')])
//         .fluidOutputs(fluid('honey') * 250)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
// fluid_canner.recipeBuilder()
//         .fluidInputs([fluid('honey') * 250])
//         .inputs([item('minecraft:glass_bottle')])
//         .outputs(item('futuremc:honey_bottle'))
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
// crafting.addShaped(item('snad:snad', 1), [[ore('sand'), ore('sand'), ore('sand')],[ore('sand'), ore('sand'), ore('sand')], [ore('sand'), ore('sand'), ore('sand')]]);
// crafting.addShaped(item('snad:snad'), [[ore('sand'), ore('sand'), ore('sand')],[ore('sand'), ore('sand'), ore('sand')], [ore('sand'), ore('sand'), ore('sand')]]);
// 
// chemreactor.recipeBuilder()
// .inputs([item('snad:snad') * 8, item('minecraft:obsidian') * 2])
// .fluidInputs( fluid('lava') * 10000)
// .outputs(ore('endstone,oc:stoneEndstone,stoneEndstone'))
// .duration(600)
// .EUt(2040)
// .buildAndRegister();
// 
// chemreactor.recipeBuilder()
// .inputs([ore('sand') * 64, item('minecraft:obsidian') * 2])
// .fluidInputs( fluid('lava') * 1000)
// .outputs(ore('endstone,oc:stoneEndstone,stoneEndstone') * 2)
// .duration(300)
// .EUt(30252)
// .buildAndRegister();
// 
// large_chem.recipeBuilder()
// .inputs([ore('sand') * 64, item('minecraft:obsidian') * 2])
// .fluidInputs( fluid('lava') * 1000)
// .outputs(ore('endstone,oc:stoneEndstone,stoneEndstone') *2)
// .duration(300)
// .EUt(30252)
// .buildAndRegister();
// 
// large_chem.recipeBuilder()
// .inputs([item('snad:snad') * 8, item('minecraft:obsidian') * 2])
// .fluidInputs( fluid('lava') * 10000)
// .outputs(ore('endstone,oc:stoneEndstone,stoneEndstone'))
// .duration(600)
// .EUt(2040)
// .buildAndRegister();
// 
// mixer.recipeBuilder()
//     .inputs([ore('sand')*4])
//     .fluidInputs([fluid('biomass')*250])
//     .outputs([item('minecraft:dirt')*4])
//     .duration(20)
//     .EUt(30)
//     .buildAndRegister();
// // Fix glycerol/sodium bicarbonate conflict
// 
// large_chem.findRecipe(30, [ore('dustSodaAsh') * 6], [fluid('water') * 1000]).remove();
// large_chem.findRecipe(1024, [ore('dustSodaAsh') * 6], [fluid('water') * 2000, fluid('epichlorhydrin') * 1000]).remove();
// 
// large_chem.recipeBuilder()
//     .inputs([ore('dustSodaAsh') * 6])
//     .fluidInputs([fluid('water') * 1000])
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 1}))
//     .outputs([item('gtadditions:ga_dust', 194) * 6, ore('dustSodiumHydroxide') * 3])
//     .duration(140)
//     .EUt(30)
//     .buildAndRegister();
// 
// large_chem.recipeBuilder()
//     .inputs([ore('dustSodaAsh') * 6])
//     .fluidInputs([fluid('water') * 2000, fluid('epichlorhydrin') * 1000])
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 2}))
//     .outputs([ore('dustSalt') * 2, item('gtadditions:ga_dust', 194) * 6])
//     .fluidOutputs([fluid('glycerol') * 1000])
//     .duration(100)
//     .EUt(1024)
//     .buildAndRegister();
// 
// Utils.removeRecipeByOutput(chemplant, [], [fluid('fermentation_base') * 10000], false);
// Utils.removeRecipeByOutput(pyro, [], [fluid('fermented_biomass') * 10000], false);
// 
// pyro.recipeBuilder()
// .inputs([item('gregtech:meta_item_1', 439) * 5])
// .fluidInputs([fluid('water') * 1000])
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
// .chancedOutput(item('gregtech:meta_item_1', 439) * 1, 45, 100)
// .fluidOutputs([fluid('fermentation_base') * 1000])
// .duration(600)
// .EUt(110)
// .buildAndRegister();
// //.notConsumable(X)
// chemplant.recipeBuilder()
// .inputs([item('gregtech:meta_item_1', 439) * 5])
// .fluidInputs( fluid('fermentation_base') * 1000,fluid('biomass') * 1000 )
// .fluidOutputs(fluid('fermented_biomass') * 2000)
// .duration(1200)
// .EUt(110)
// .buildAndRegister();
// 
// //Utils.removeRecipeByOutput(circuit_assembler, [item('gregtech:meta_item_2:32488')], [], false);
// //Utils.removeRecipeByOutput(assembler, [ore('componentCapacitor')], [], false);
// //crafting.addShaped(ore('componentCapacitor'), [[ore('foilAluminium'), ore('foilAluminium'), ore('foilAluminium')],[ore('foilAluminium'), ore('foilAluminium'), ore('foilAluminium')], [ore('wireGtSingleTin'), null, ore('wireGtSingleTin')]]);
// crafting.addShaped(ore('componentTransistor'), [[ore('foilSilicon'), ore('foilSilicon'), ore('foilSilicon')],[ore('foilSilicon'), ore('foilSilicon'), ore('foilSilicon')], [ore('wireGtSingleTin'), ore('wireGtSingleTin'), ore('wireGtSingleTin')]]);
// Utils.removeRecipeByOutput(fermenter, [], [fluid('fermented_biomass')], false);
// 
// fermenter.recipeBuilder()
// .fluidInputs(fluid('biomass') * 144 )
// .fluidOutputs(fluid('fermented_biomass') * 50)
// .duration(4000)
// .EUt(2)
// .buildAndRegister();
// vat.removeRecipe(fluid('rocket_fuel') *1000);
// Utils.removeRecipeByOutput(macerator, [item('gregtech:meta_item_1:2345')], [], false);
// 
// macerator.recipeBuilder()
// .inputs([ore('cropWheat,itemWheat') * 1])
// .outputs(item('gregtech:meta_item_1:2345') * 2)
// .chancedOutput(item('gregtech:meta_item_1:2345'), 1000,1000)
// .duration(120)
// .EUt(17)
// .buildAndRegister();
// furnace.setFuel(item('advancedrocketry:charcoallog'), 640000);
// fluid_extractor.recipeBuilder()
//         .inputs([item('minecraft:melon')])
//         .fluidOutputs(fluid('juice') * 50)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
// fluid_extractor.recipeBuilder()
//         .inputs([item('minecraft:apple')])
//         .fluidOutputs(fluid('juice') * 144)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
// fluid_extractor.recipeBuilder()
//         .inputs([ore('cropSweetBerry,seedSweetBerry')])
//         .fluidOutputs(fluid('juice') * 50)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
// fluid_extractor.recipeBuilder()
//         .inputs([ore('sugarcane')])
//         .fluidOutputs(fluid('juice') * 144)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
// fluid_extractor.recipeBuilder()
//         .inputs([ore('blockCactus')])
//         .fluidOutputs(fluid('juice') * 512)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
// fluid_extractor.recipeBuilder()
//         .inputs([ore('cropPumpkin')])
//         .fluidOutputs(fluid('juice') * 512)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
// Utils.removeRecipeByOutput(wiremill, [item('gregtech:cable', 516)], [], false);
// Utils.removeRecipeByOutput(extruder, [item('gregtech:cable', 516)], [], false); 
// 
// mixer.recipeBuilder()
// .inputs([ore('dustGallium') * 2,ore('dustSolderingAlloy') *10])
// .outputs([item('gregtech:meta_item_1:2517') * 12])
// .duration(240)
// .EUt(30)
// .buildAndRegister();
// 
// blast_furnace.recipeBuilder()
//     .inputs(item('gregtech:meta_item_1:2517'))
//     .outputs(item('gregtech:meta_item_1:10517'))
//     .blastFurnaceTemp(1800) //this is a minimal temperature at which the item will be smelted
//     .duration(40)
//     .EUt(16)
//     .buildAndRegister();
// 
// blast_alloy.recipeBuilder()
//     .inputs([ore('dustEuropium')*1, ore('dustSteel')*4, ore('dustCaesium')*2, ore('dustBismuth')*2])
//     .fluidOutputs(fluid('bright_steel') * 1296)
//     .blastFurnaceTemp(2900)
//     .duration(1800)
//     .EUt(120)
//     .buildAndRegister();
// 
// assembler.recipeBuilder()
//     .inputs([item('gregtech:cable', 517) * 3,metaitem('electric.pump.lv') * 2,item('gregtech:fluid_pipe', 184)])
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 1}))
//     .fluidInputs(fluid('nitrogen') * 1000)
//     .outputs([item('gregtech:cable', 516) * 3])
//     .duration(350)
//     .EUt(30)
//     .buildAndRegister();
// 
// furnace.removeByOutput(ore('ingotLvSuperconductor'));
// furnace.removeByOutput(item('gregtech:meta_item_1:10517'));
// 
// blast_furnace.recipeBuilder()
//     .inputs(ore('dustLvSuperconductor'))
//     .outputs(ore('ingotLvSuperconductor'))
//     .blastFurnaceTemp(1800) //this is a minimal temperature at which the item will be smelted
//     .duration(350)
//     .EUt(500)
//     .buildAndRegister();
// crafting.addShaped(item('gregtech:meta_item_1:32519'), [[ore('dustSodium'), ore('dustSodium'), ore('dustSodium')],[ore('dustSodium'), ore('dustSodium'), ore('dustSodium')], [null, item('gregtech:meta_item_1', 717), null]]);
// 
// Utils.removeRecipeByOutput(circuit_assembler, [item('gtadditions:ga_meta_item:32202')], [], false); 
// 
// circuit_assembler.recipeBuilder()
// .inputs([item('gtadditions:ga_meta_item:32201') * 4,ore('componentCapacitor') * 4,ore('componentResistor') * 4,item('gregtech:meta_item_1', 593) * 2,ore('plateAluminium') * 2, item('gregtech:cable', 516) * 2])
// .fluidInputs(fluid('soldering_alloy') * 40)
// .outputs([item('gtadditions:ga_meta_item:32202')])
// .duration(150)
// .EUt(30)
// .buildAndRegister();
// 
// circuit_assembler.recipeBuilder()
// .inputs([item('gtadditions:ga_meta_item:32201') * 4,item('gcyl:gcyl_meta_item', 242) * 4,item('gcyl:gcyl_meta_item', 241)* 4,item('gregtech:meta_item_1', 593) * 2,ore('plateAluminium') * 2, item('gregtech:cable', 516) * 2])
// .fluidInputs(fluid('soldering_alloy') * 40)
// .outputs([item('gtadditions:ga_meta_item:32202')])
// .duration(150)
// .EUt(30)
// .buildAndRegister();
// furnace.removeByOutput(item('thermalfoundation:material', 833), item('gregtech:meta_item_1', 438));
// Utils.removeRecipeByOutput(hammer, [ore('ingotWroughtIron')], [], false); 
// //Utils.removeRecipeByOutput(largeHammer, [ore('ingotWroughtIron')], [], false); 
// crafting.removeByOutput(item('enderio:item_extract_speed_upgrade'));
// crafting.addShaped(item('enderio:item_extract_speed_upgrade'), [[ore('ingotIron'), ore('ingotIron'), ore('ingotIron')],[ore('ingotBronze'), ore('craftingPiston'), ore('ingotBronze')], [ore('ingotBronze'), ore('dustRedstone'), ore('ingotBronze')]]);
// crafting.removeByOutput(item('enderio:item_liquid_conduit', 2));
// crafting.removeByOutput(item('enderio:item_liquid_conduit'));
// crafting.addShaped(item('enderio:item_liquid_conduit') * 8, [[ore('itemConduitBinder'), ore('itemConduitBinder'), ore('itemConduitBinder')],[item('minecraft:glass'), item('minecraft:glass'), item('minecraft:glass')], [ore('itemConduitBinder'), ore('itemConduitBinder'), ore('itemConduitBinder')]]);
// crafting.addShaped(item('enderio:item_liquid_conduit', 2) * 8, [[ore('itemConduitBinder'), ore('itemConduitBinder'), ore('itemConduitBinder')],[ore('nuggetPulsatingIron'), item('enderio:item_liquid_conduit', 1), ore('nuggetPulsatingIron')], [ore('itemConduitBinder'), ore('itemConduitBinder'), ore('itemConduitBinder')]]);
// crafting.addShaped(item('enderio:item_liquid_conduit', 2) * 8, [[ore('itemConduitBinder'), ore('itemConduitBinder'), ore('itemConduitBinder')],[ore('nuggetPulsatingIron'), ore('fusedQuartz'), ore('nuggetPulsatingIron')], [ore('itemConduitBinder'), ore('itemConduitBinder'), ore('itemConduitBinder')]]);
// for recipe in RecipeMaps.getCokeOvenRecipes(){
//     recipe.remove();
//     }
//     
// crafting.addShaped(metaitem('tjceu:steam.motor.ulv'), [[ore('stickWood'), ore('plateBronze'), ore('stickIron')],[ore('plateBronze'), ore('stickIron'), ore('plateBronze')], [ore('ingotIron'), ore('plateBronze'), ore('stickWood')]]);
// 
// crafting.removeByOutput(item('gregtech:meta_item_1:32600'));
// crafting.addShaped(item('gregtech:meta_item_1:32600'), [[ore('cableGtSingleTin'), ore('wireGtSingleCopper'), ore('stickIron')],[ore('wireGtSingleCopper'), ore('stickIronMagnetic'), ore('wireGtSingleCopper')], [ore('stickIron'), ore('wireGtSingleCopper'), ore('cableGtSingleTin')]]);
// //crafting.addShaped(item('supercritical:mte:14400'), [[item('gregtech:metal_casing', 1), item('contenttweaker:steampiston'), item('gregtech:metal_casing', 1)],[metaitem('tjceu:steam.motor.ulv'), null, item('contenttweaker:steampiston')], [item('gregtech:metal_casing', 1), metaitem('tjceu:steam.motor.ulv'), item('gregtech:metal_casing', 1)]]);
// crafting.removeByOutput(item('gregtech:mte', 9));
// crafting.removeByOutput(item('gregtech:mte', 10));
// crafting.removeByOutput(item('gregtech:mte', 11));
// crafting.removeByOutput(item('gregtech:mte', 7));
// crafting.addShaped(item('gregtech:mte', 9), [[item('contenttweaker:steampiston'), item('gregtech:fluid_pipe:1095'), item('contenttweaker:steampiston')],[item('gregtech:fluid_pipe:1095'), item('gregtech:steam_casing'), item('gregtech:fluid_pipe:1095')], [metaitem('tjceu:steam.motor.ulv'), item('gregtech:fluid_pipe:1095'), metaitem('tjceu:steam.motor.ulv')]]);
// crafting.addShaped(item('gregtech:mte', 10), [[item('contenttweaker:steampiston'), item('gregtech:fluid_pipe:1184'), item('contenttweaker:steampiston')],[item('gregtech:fluid_pipe:1184'), item('gregtech:steam_casing', 2), item('gregtech:fluid_pipe:1184')], [metaitem('tjceu:steam.motor.ulv'), item('gregtech:fluid_pipe:1184'), metaitem('tjceu:steam.motor.ulv')]]);
// crafting.removeByOutput(item('gregtech:mte', 12));
// crafting.addShaped(item('gregtech:mte', 12), [[item('gregtech:fluid_pipe:1184'), item('gregtech:fluid_pipe:1184'), item('gregtech:fluid_pipe:1184')],[metaitem('tjceu:steam.motor.ulv'), item('gregtech:steam_casing', 2), item('contenttweaker:steampiston')], [item('gregtech:fluid_pipe:1184'), item('gregtech:fluid_pipe:1184'), item('gregtech:fluid_pipe:1184')]]);
// crafting.addShaped(item('gregtech:mte', 11), [[item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095')],[metaitem('tjceu:steam.motor.ulv'), item('gregtech:steam_casing'), item('contenttweaker:steampiston')], [item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095')]]);
// crafting.addShaped(item('gregtech:mte', 7), [[item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095')],[item('contenttweaker:steampiston'), item('gregtech:steam_casing'), item('minecraft:glass')], [item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095'), item('gregtech:fluid_pipe:1095')]]);
// crafting.removeByOutput(item('gregtech:machine:2235'));
// crafting.addShaped(item('gregtech:machine:2235'), [[item('minecraft:glass'), ore('rotorBronze'), item('minecraft:glass')],[item('contenttweaker:steampiston'), item('gregtech:fluid_pipe:1184'), item('contenttweaker:steampiston')], [item('gregtech:fluid_pipe:1184'), item('gregtech:steam_casing'), item('gregtech:fluid_pipe:1184')]]);
// crafting.removeByOutput(item('gregtech:mte', 985));
// crafting.addShaped(item('gregtech:mte', 985), [[null, null, null],[ore('plateWroughtIron'), ore('plateWroughtIron'), ore('plateWroughtIron')], [ore('cableGtSingleLead'), item('gregtech:machine_casing'), ore('cableGtSingleLead')]]);
// recipes.removeShaped(ore('blockHopper'), [[ore('ingotIron'), null, ore('ingotIron')],[ore('ingotIron'), ore('chest,chestWood'), ore('ingotIron')], [null, ore('ingotIron'), null]]);
//   //ADV_FUSION_RECIPES.recipeBuilder().fluidInputs(Adamantium.getFluid(125), Neutronium.getFluid(125)).fluidOutputs(Vibranium.getFluid(125)).duration(100).EUt(8000000).coilTier(2).euStart(2500000000L).buildAndRegister(); 
// /*
// ADVFusion.recipeBuilder()
//     .fluidInputs(fluid('degenerate_rhenium_plasma') * 15,fluid('neutron_plasma') * 15)
//     .fluidOutputs(fluid('plasma.cosmic_neutronium')* 15)
//     .duration(100)
//     .AdvCoilTier(2)
//     .EUt(8000000)
//     .EUToStart(30000000) 
//     .euReturn(2)
//     .buildAndRegister();
//     */
// crafting.addShaped(item('gregtech:machine:1305'), [[ore('circuitSuperconductor'), item('gregtech:meta_item_1:32677'), ore('circuitSuperconductor')],[ore('plateTritanium'), item('gregtech:mte', 993), ore('plateTritanium')], [ore('circuitSuperconductor'), ore('plateTritanium'), ore('circuitSuperconductor')]]);
// crafting.addShaped(item('gregtech:machine:1303'), [[ore('circuitZpm'), item('gregtech:meta_item_1:32676'), ore('circuitZpm')],[ore('plateOsmiridium'), item('gregtech:mte', 992), ore('plateOsmiridium')], [ore('circuitZpm'), ore('plateOsmiridium'), ore('circuitZpm')]]);
// crafting.addShaped(item('gregtech:machine:1301'), [[ore('circuitMaster'), item('gregtech:meta_item_1:32675'), ore('circuitMaster')],[ore('plateRhodiumPlatedPalladium'), item('gregtech:mte', 991), ore('plateRhodiumPlatedPalladium')], [ore('circuitMaster'), ore('plateRhodiumPlatedPalladium'), ore('circuitMaster')]]);
// crafting.addShaped(item('gregtech:machine:1304'), [[ore('circuitSuperconductor'), ore('plateTritanium'), ore('circuitSuperconductor')],[ore('plateTritanium'), item('gregtech:mte', 993), ore('plateTritanium')], [ore('circuitSuperconductor'), item('gregtech:meta_item_1:32677'), ore('circuitSuperconductor')]]);
// crafting.addShaped(item('gregtech:machine:1302'), [[ore('circuitZpm'), ore('plateOsmiridium'), ore('circuitZpm')],[ore('plateOsmiridium'), item('gregtech:mte', 992), ore('plateOsmiridium')], [ore('circuitZpm'), item('gregtech:meta_item_1:32676'), ore('circuitZpm')]]);
// crafting.addShaped(item('gregtech:machine:1300'), [[ore('circuitMaster'), ore('plateRhodiumPlatedPalladium'), ore('circuitMaster')],[ore('plateRhodiumPlatedPalladium'), item('gregtech:mte', 991), ore('plateRhodiumPlatedPalladium')], [ore('circuitMaster'), item('gregtech:meta_item_1:32675'), ore('circuitMaster')]]);
// //Needs to be updated when max circuits come out
// crafting.addShaped(item('gregtech:machine:1307'), [[ore('circuitUxv'), item('gcyl:gcyl_meta_item', 383), ore('circuitUxv')],[ore('plateNeutronium'), item('gregtech:machine', 509), ore('plateNeutronium')], [ore('circuitUxv'), ore('plateNeutronium'), ore('circuitUxv')]]);
// crafting.addShaped(item('gregtech:machine:1306'), [[ore('circuitUxv'), ore('plateNeutronium'), ore('circuitUxv')],[ore('plateNeutronium'), item('gregtech:machine', 509), ore('plateNeutronium')], [ore('circuitUxv'), item('gcyl:gcyl_meta_item', 383), ore('circuitUxv')]]);
// crafting.addShaped(ore('blockAluminium'), [[ore('ingotAluminium'), ore('ingotAluminium'), ore('ingotAluminium')],[ore('ingotAluminium'), ore('ingotAluminium'), ore('ingotAluminium')], [ore('ingotAluminium'), ore('ingotAluminium'), ore('ingotAluminium')]]);
// furnace.addRecipe(item('minecraft:glass'), item('gregtech:meta_item_1:2960'), 0.0);
// furnace.addRecipe(ore('ingotGold'), ore('blockPreciousMetal'), 0.0);
// 
// //copper 
// Utils.removeRecipeByOutput(arc,[ore('ingotAnnealedCopper')],[],false);
// Utils.removeRecipeByOutput(arc,[ore('nuggetAnnealedCopper')],[],false);
// 
// arc.recipeBuilder()
// .inputs([ore('ingotCopper')])
// .fluidInputs(fluid('oxygen') * 1000)
// .outputs([ore('ingotAnnealedCopper')])
// .duration(600)
// .EUt(110)
// .buildAndRegister();
// crafting.addShaped(item('gregtech:meta_block_compressed_11', 8), [[ore('ingotSteel'), ore('ingotSteel'), ore('ingotSteel')],[ore('ingotSteel'), ore('ingotSteel'), ore('ingotSteel')], [ore('ingotSteel'), ore('ingotSteel'), ore('ingotSteel')]]);
// crafting.addShaped(item('bonsaitrees:bonsaipot', 1), [[ore('plateDoubleRhodiumPlatedPalladium'), item('bonsaitrees:bonsaipot'), ore('plateDoubleRhodiumPlatedPalladium')],[ore('plateDoubleRhodiumPlatedPalladium'), null, ore('plateDoubleRhodiumPlatedPalladium')], [ore('plateDoubleRhodiumPlatedPalladium'), null, ore('plateDoubleRhodiumPlatedPalladium')]]);
// crafting.addShaped(item('bonsaitrees:bonsaipot'), [[null, null, null],[ore('plateDoubleTungstenSteel'), null, ore('plateDoubleTungstenSteel')], [ore('plateDoubleTungstenSteel'), ore('plateDoubleTungstenSteel'), ore('plateDoubleTungstenSteel')]]);
// crafting.removeByOutput(item('bonsaitrees:bonsaipot', 1));
// crafting.removeByOutput(item('bonsaitrees:bonsaipot'));
// crafting.removeByOutput(item('gregtech:machine:2540'));
// crafting.addShaped(item('gregtech:machine:2540'), [[item('gregtech:meta_item_1:32643'), ore('circuitEv'), item('gregtech:meta_item_1:32643')],[item('gregtech:meta_item_1:32603'), metaitem('hull.ev'), item('gregtech:meta_item_1:32603')], [ore('gearTitanium'), ore('wireGtSingleTungstenSteel'), ore('gearTitanium')]]);
// /*
// electrolyzer.findRecipe(240, [ore('dustMagnesiumChloride') * 3], null).remove();
// reactor.recipeBuilder()
// .inputs(ore('dustMagnesiumChloride') * 6, ore('dustSodium') * 3)
// .outputs(ore('dustSmallMagnesium')* 6)
// .fluidOutputs(fluid('chlorine') * 1500)
// .duration(300)
// .EUt(240)
// .buildAndRegister();
// large_chem.recipeBuilder()
// .inputs(ore('dustMagnesiumChloride') * 6)
// .notConsumable(ore('dustSodium'))
// .outputs(ore('dustSmallMagnesium') * 8)
// .fluidOutputs(fluid('chlorine') * 2000)
// .duration(300)
// .EUt(240)
// .buildAndRegister();
// */
// Utils.removeRecipeByOutput(tower,[],[fluid('sulfuric_heavy_fuel')],false); //triple all values-
// tower.recipeBuilder()
// .fluidInputs(fluid('oil_heavy') * 4500)
// .fluidOutputs(fluid('sulfuric_heavy_fuel') * 7500,fluid('sulfuric_light_fuel') * 1350,fluid('sulfuric_naphtha') * 450,fluid('sulfuric_gas') *18000)
// .duration(400)
// .EUt(10)
// .buildAndRegister();
// tower.recipeBuilder() 
// .fluidInputs(fluid('oil_medium') * 3000)
// .fluidOutputs(fluid('sulfuric_heavy_fuel') * 450,fluid('sulfuric_light_fuel') * 1500,fluid('sulfuric_naphtha') * 600,fluid('sulfuric_gas') *1800)
// .duration(400)
// .EUt(10)
// .buildAndRegister();
// tower.recipeBuilder()
// .fluidInputs(fluid('oil_light') * 450)
// .fluidOutputs(fluid('sulfuric_heavy_fuel') * 300,fluid('sulfuric_light_fuel') * 600,fluid('sulfuric_naphtha') * 900,fluid('sulfuric_gas') *7500)
// .duration(400)
// .EUt(10)
// .buildAndRegister();
// tower.recipeBuilder()
// .fluidInputs(fluid('oil') * 1500)
// .fluidOutputs(fluid('sulfuric_heavy_fuel') * 450,fluid('sulfuric_light_fuel') * 1500,fluid('sulfuric_naphtha') * 600,fluid('sulfuric_gas') *1800)
// .duration(400)
// .EUt(10)
// .buildAndRegister();
// crafting.removeByOutput(item('gregtech:mte', 97));
// crafting.removeByOutput(item('gregtech:mte', 96));
// crafting.removeByOutput(item('gregtech:mte', 95));
// crafting.addShaped(item('gregtech:mte', 97), [[ore('cableGtQuadrupleGold'), item('gregtech:meta_item_1:10012'), ore('cableGtQuadrupleGold')],[ore('circuitHv'), metaitem('hull.hv'), ore('circuitHv')], [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]]);
// crafting.addShaped(item('gregtech:mte', 96), [[ore('cableGtQuadrupleCopper'), item('gregtech:meta_item_1:10012'), ore('cableGtQuadrupleCopper')],[ore('circuitGood'), item('gregtech:mte', 987), ore('circuitGood')], [ore('plateAluminium'), ore('plateAluminium'), ore('plateAluminium')]]);
// crafting.addShaped(item('gregtech:mte', 95), [[ore('cableGtQuadrupleTin'), item('gregtech:meta_item_1:10012'), ore('cableGtQuadrupleTin')],[ore('circuitBasic'), item('gregtech:mte', 986), ore('circuitBasic')], [ore('plateSteel'), ore('plateSteel'), ore('plateSteel')]]);
// crafting.addShaped(ore('blockStainlessSteel'), [[ore('ingotStainlessSteel'), ore('ingotStainlessSteel'), ore('ingotStainlessSteel')],[ore('ingotStainlessSteel'), ore('ingotStainlessSteel'), ore('ingotStainlessSteel')], [ore('ingotStainlessSteel'), ore('ingotStainlessSteel'), ore('ingotStainlessSteel')]]);
// 
// crafting.removeByOutput(item('actuallyadditions:block_fermenting_barrel'));
// 
// fluid_extractor.recipeBuilder()
// .inputs(ore('seedCanola') * 10)
// .fluidOutputs(fluid('canolaoil') * 1000)
// .duration(150)
// .EUt(16)
// .buildAndRegister();
// 
// fluid_extractor.recipeBuilder()
// .inputs(ore('cropCanola') * 5)
// .fluidOutputs(fluid('canolaoil') * 1000)
// .duration(150)
// .EUt(16)
// .buildAndRegister();
// 
// fermenter.recipeBuilder()
// .fluidInputs(fluid('canolaoil') * 10000)
// .fluidOutputs(fluid('refinedcanolaoil') * 10000)
// .duration(300)
// .EUt(16)
// .buildAndRegister();
// 
// chemreactor.recipeBuilder()
// .inputs(item('actuallyadditions:item_misc', 23) * 8)
// .fluidInputs(fluid('refinedcanolaoil') * 10000)
// .fluidOutputs( fluid('crystaloil') * 10000)
// .duration(300)
// .EUt(16)
// .buildAndRegister();
// 
// chemreactor.recipeBuilder()
// .fluidInputs(fluid('crystaloil') * 5000, fluid(' creosote') * 5000)
// .fluidOutputs( fluid('empoweredoil') * 10000)
// .duration(300)
// .EUt(16)
// .buildAndRegister();
// 
// chemreactor.recipeBuilder()
// .inputs([ore('dustTinySodiumHydroxide')])
// .fluidInputs( fluid('empoweredoil') * 10000, fluid(' ethanol') * 1000)
// .fluidOutputs(fluid(' bio_diesel') * 10000, fluid(' glycerol') * 1000)
// .duration(120)
// .EUt(30)
// .buildAndRegister();
// 
// chemreactor.recipeBuilder()
// .inputs([ore('dustTinySodiumHydroxide')])
// .fluidInputs( fluid('empoweredoil')* 10000, fluid(' methanol') * 1000)
// .fluidOutputs(fluid(' bio_diesel') * 10000, fluid(' glycerol') * 1000)
// .duration(120)
// .EUt(30)
// .buildAndRegister();
// 
// crafting.removeByOutput(item('enderio:block_farm_station'));
// 
// assembler.recipeBuilder()
// .inputs([item('gregtech:mte', 986),ore('circuitBasic') *2,ore('skullZombieController'),ore('toolHoe')])
// .outputs([item('enderio:block_farm_station')])
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// item('contenttweaker:certificate_of_being_a_noob').addTooltip(format.darkBlue("Image by Emperdog"));
// 
// extruder.recipeBuilder()
// .inputs([ore('blockTritanium') * 64, ore('blockTritanium') * 64])
// .outputs([item('contenttweaker:certificate_of_being_a_noob')])
// .duration(30000000)
// .EUt(3)
// .buildAndRegister();
// 
// Utils.removeRecipeByOutput(mixer, [ore('dustTungstenCarbide')], [], false); 
// Utils.removeRecipeByOutput(largeMix, [ore('dustTungstenCarbide')], [], false); 
// crafting.addShaped(ore('dyeGreen'), [[null, item('minecraft:tallgrass', 1), null],[item('minecraft:tallgrass', 1), null, item('minecraft:tallgrass', 1)], [null, item('minecraft:tallgrass', 1), null]]);
// 
// centrifuge.recipeBuilder()
// .inputs([ore('turfMoon')])
// .outputs([ore('dustSmallSilicon')])
// .chancedOutput(ore('dustSmallSilicon'),3000,400)
// .fluidOutputs(fluid('helium3') * 40)
// .duration(120)
// .EUt(30)
// .buildAndRegister();
// 
// centrifuge.recipeBuilder()
// .inputs([ore('turfMoon')])
// .outputs([ore('dustSmallSilicon')])
// .chancedOutput(ore('dustSmallSilicon'),3000,400)
// .fluidOutputs(fluid('helium3') * 40)
// .duration(120)
// .EUt(30)
// .buildAndRegister();
// 
// furnace.removeByOutput(item('libvulpes:productingot', 7));
// furnace.removeByOutput(item('libvulpes:productingot', 6));
// furnace.removeByOutput(item('libvulpes:productingot', 3));
// furnace.removeByOutput(item('libvulpes:productingot', 4));
// furnace.removeByOutput(item('libvulpes:productingot', 5));
// furnace.removeByOutput(item('libvulpes:productingot', 9));
// furnace.removeByOutput(item('libvulpes:productingot', 10));
// furnace.removeByOutput(ore('ingotTitaniumIridium'));
// furnace.removeByOutput(ore('ingotTitaniumAluminide'));
// 
// freezer.recipeBuilder()
// .fluidInputs(fluid('air')* 1000)
// .fluidOutputs(fluid('liquid_air') * 1000)
// .duration(30)
// .EUt(8192)
// .buildAndRegister();
// crafting.addShapeless(ore('fuelCoke'), [item('thermalfoundation:material', 802)]);
// crafting.addShapeless(item('gregtech:meta_block_compressed_22', 5), [item('thermalfoundation:storage_resource', 1)]);
// recipes.removeShaped(item('thermalfoundation:material', 802) * 9, [[null, null, null],[null, ore('blockFuelCoke'), null], [null, null, null]]);
// recipes.removeShaped(item('gregtech:meta_block_compressed_22', 5), [[ore('fuelCoke'), ore('fuelCoke'), ore('fuelCoke')],[ore('fuelCoke'), ore('fuelCoke'), ore('fuelCoke')], [ore('fuelCoke'), ore('fuelCoke'), ore('fuelCoke')]]);
// recipes.removeShaped(item('thermalfoundation:storage_resource', 1), [[ore('fuelCoke'), ore('fuelCoke'), ore('fuelCoke')],[ore('fuelCoke'), ore('fuelCoke'), ore('fuelCoke')], [ore('fuelCoke'), ore('fuelCoke'), ore('fuelCoke')]]);
// recipes.removeShapeless(item('thermalfoundation:material', 802) * 9, [ item('gregtech:meta_block_compressed_22', 5)]);
// recipes.removeShapeless(item('thermalfoundation:material', 802) * 9, [ item('thermalfoundation:storage_resource', 1)]);
// recipes.removeShaped(item('thermalfoundation:material', 802), [[null, null, null],[null, item('gregtech:meta_block_compressed_22', 5), null], [null, null, null]]);
// recipes.removeShaped(item('thermalfoundation:material', 802) * 9, [[null, null, null],[null, ore('blockCoke'), null], [null, null, null]]);
// recipes.removeShaped(item('thermalfoundation:material', 802) * 9, [[null, null, null],[null, ore('blockFuelCoke'), null], [null, null, null]]);
// crafting.addShaped(item('danknull:dank_null_panel_0'), [[item('minecraft:redstone_block'), item('minecraft:coal_block'), item('minecraft:redstone_block')],[item('minecraft:coal_block'), item('minecraft:glass'), item('minecraft:coal_block')], [item('minecraft:redstone_block'), item('minecraft:coal_block'), item('minecraft:redstone_block')]]);
// crafting.addShaped(item('danknull:dank_null_0'), [[item('danknull:dank_null_panel_0'), item('danknull:dank_null_panel_0'), item('danknull:dank_null_panel_0')],[item('danknull:dank_null_panel_0'), item('minecraft:coal_block'), item('danknull:dank_null_panel_0')], [item('danknull:dank_null_panel_0'), item('danknull:dank_null_panel_0'), item('danknull:dank_null_panel_0')]]);
// crafting.removeByOutput(item('danknull:dank_null_0'));
// crafting.removeByOutput(item('danknull:dank_null_panel_0'));
// 
// implosion.recipeBuilder()
// .inputs(ore('dustBlaze,itemBlazePowder') *15)
// .outputs(ore('itemBlazeRod,rodBlaze,stickBlaze') *3)
// .explosives(10)
// .duration(20)
// .EUt(30)
// .buildAndRegister();
// 
// /*
// mixer.recipeBuilder()
// .inputs(ore('dustRedstone'),item('gregtech:meta_item_1:2026'))
// .outputs(ore('dustGlowstone') * 2)
// .duration(120)
// .EUt(30)
// .buildAndRegister();
// */
// 
// centrifuge.recipeBuilder()
// .inputs([item('advancedrocketry:electricmushroom')])
// .fluidOutputs(fluid('methane') * 500)
// .duration(100)
// .EUt(30)
// .buildAndRegister();
// 
// crafting.removeByOutput(item('gregtech:machine:2514'));
// crafting.addShaped(item('gregtech:machine:2514'), [[ore('plateTungstenCarbide'), item('gregtech:mte', 68), ore('plateTungstenCarbide')],[item('gregtech:machine', 62), ore('circuitEv'), item('gregtech:machine', 62)], [ore('plateTungstenCarbide'), item('gregtech:mte', 990), ore('plateTungstenCarbide')]]);
// furnace.removeByOutput(ore('dustOsmium'));
// 
// Utils.removeRecipeByOutput(large_chem, [], [fluid('ortho_xylene') * 10000], false);
// 
// large_chem.recipeBuilder()
// .fluidInputs(fluid('methanol') *1000, fluid('toluene') * 1000)
// .fluidOutputs(fluid('ortho_xylene') * 1000,fluid('water') * 1000 )
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 2}))
// .duration(800)
// .EUt(120)
// .buildAndRegister();
// 
// 
// Utils.removeRecipeByOutput(circuit_assembler, [ore('circuitHv')], [], false);
// 
// circuit_assembler.recipeBuilder()
// .inputs(item('gregtech:meta_item_1', 594) * 4,ore('wireFineAluminium') * 2, item('gregtech:meta_item_1', 405), item('gcyl:gcyl_meta_item', 246)* 4, item('gcyl:gcyl_meta_item', 244)* 4,item('gcyl:gcyl_meta_item', 245) *4)
// .outputs(ore('circuitHv') * 4)
// .fluidInputs(fluid('soldering_alloy') *200)
// .duration(150)
// .EUt(2000)
// .buildAndRegister();
// 
// crafting.addShapeless(item('thermalfoundation:material', 657), [item('architecturecraft:sawblade')]);
// crafting.addShapeless(item('appliedenergistics2:part', 221), [item('appliedenergistics2:part', 220),ore('gemLapis')]);
// crafting.addShapeless(item('appliedenergistics2:part', 220), [item('appliedenergistics2:part', 221)]);
// furnace.removeByOutput(ore('ingotOsmium'));
// 
// macerator.recipeBuilder()
// .inputs([item('libvulpes:ore0')])
// .outputs(item('libvulpes:productdust') * 2)
// .duration(120)
// .EUt(17)
// .buildAndRegister();
// 
// electrolyzer.recipeBuilder()
// .inputs([item('libvulpes:productdust')])
// .outputs(ore('dustLithium') * 2)
// .duration(120)
// .EUt(17)
// .buildAndRegister();
// 
// chemreactor.findRecipe(1920, [item('gregtech:meta_item_1', 569),item('gregtech:cable:5354') * 8], null).remove();
// large_chem.findRecipe(1920, [item('gregtech:meta_item_1', 569),item('gregtech:cable:5354') * 8], null).remove();
// 
// 
// 
// assembler.recipeBuilder()
// .inputs([item('enderio:block_reservoir') * 4, item('gregtech:mte', 987)])
// .outputs([item('gcyl:gcyl_meta_item', 571)])
// .duration(200)
// .EUt(110)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('enderio:block_reservoir') * 4, metaitem('hull.hv')])
// .outputs([item('gcyl:gcyl_meta_item', 572)])
// .duration(200)
// .EUt(500)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('enderio:block_reservoir') * 4, metaitem('hull.ev')])
// .outputs([item('gcyl:gcyl_meta_item', 573)])
// .duration(200)
// .EUt(2048)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('enderio:block_reservoir') * 4, item('gregtech:mte', 990)])
// .outputs([item('gcyl:gcyl_meta_item', 574)])
// .duration(200)
// .EUt(8192)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('enderio:block_reservoir') * 4, item('gregtech:mte', 991)])
// .outputs([item('gcyl:gcyl_meta_item', 575)])
// .duration(200)
// .EUt(32768)
// .buildAndRegister();
// 
// 
// assembler.recipeBuilder()
// .inputs([item('enderio:block_reservoir') * 4,item('gregtech:mte', 992)])
// .outputs([item('gcyl:gcyl_meta_item', 576)])
// .duration(200)
// .EUt(131072)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('enderio:block_reservoir') * 4, item('gregtech:mte', 993)])
// .outputs([item('gcyl:gcyl_meta_item', 577)])
// .duration(200)
// .EUt(524288)
// .buildAndRegister();
// 
// //Upgrade recipes
// 
// assembler.recipeBuilder()
// .inputs([item('enderio:block_reservoir') * 4, item('gregtech:mte', 987)])
// .outputs([item('gcyl:gcyl_meta_item', 571)])
// .duration(200)
// .EUt(110)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('enderio:block_reservoir') * 4, item('gcyl:gcyl_meta_item', 572)])
// .outputs([item('gcyl:gcyl_meta_item', 573)])
// .duration(200)
// .EUt(2048)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('enderio:block_reservoir') * 4, item('gcyl:gcyl_meta_item', 573)])
// .outputs([item('gcyl:gcyl_meta_item', 574)])
// .duration(200)
// .EUt(8192)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('enderio:block_reservoir') * 4, item('gcyl:gcyl_meta_item', 574)])
// .outputs([item('gcyl:gcyl_meta_item', 575)])
// .duration(200)
// .EUt(32768)
// .buildAndRegister();
// 
// 
// assembler.recipeBuilder()
// .inputs([item('enderio:block_reservoir') * 4, item('gcyl:gcyl_meta_item', 575)])
// .outputs([item('gcyl:gcyl_meta_item', 576)])
// .duration(200)
// .EUt(131072)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('enderio:block_reservoir') * 4, item('gcyl:gcyl_meta_item', 576)])
// .outputs([item('gcyl:gcyl_meta_item', 577)])
// .duration(200)
// .EUt(524288)
// .buildAndRegister();
// 
// 
// Utils.removeRecipeByOutput(fusion, [], [fluid('plutonium') * 16], false);
// fusion.recipeBuilder()
// .fluidInputs(fluid('helium') * 16, fluid('uranium') * 16)
// .fluidOutputs(fluid('plutonium') * 16)
// .EUToStart(120000000) 
// .duration(128)
// .EUt(32000)
// .buildAndRegister();
// 
// crafting.addShaped(item('gregtech:machine:2543'), [[ore('circuitMaster'), ore('gearTungstenSteel'), ore('circuitMaster')],[ore('gearTungstenSteel'), item('gregtech:mte', 991), ore('gearTungstenSteel')], [item('gregtech:fluid_pipe:3235'), ore('gearTungstenSteel'), item('gregtech:fluid_pipe:3235')]]);
// crafting.removeByOutput(item('gregtech:machine:2543'));
// 
// blast_furnace.findRecipe(480, [item('minecraft:emerald_block'),item('gregtech:meta_item_1', 701) ],[fluid('helium') * 1000]).remove();
// blast_furnace.findRecipe(480, [item('gregtech:meta_item_1', 701),ore('blockOlivine')],[fluid('helium') * 1000]).remove();
// 
// circuit_assembler.recipeBuilder()
// .inputs([item('gregtech:meta_item_1', 405), ore('wireFineAluminium') * 8,item('gregtech:meta_item_1', 597)])
// .fluidInputs(fluid('soldering_alloy') * 200)
// .outputs([ore('circuitHv') * 4])
// .duration(50)
// .EUt(9600)
// .buildAndRegister();
// 
// Utils.removeRecipeByOutput(assembler, [item('gtadditions:ga_meta_item:32309').withNbt({"GT.Detrav": {}})], [], false);
// 
// crafting.addShaped(item('gtadditions:ga_meta_item:32309').withNbt({"GT.Detrav": {}}), [[ore('plateDoubleSteel'), ore('plateDoubleSteel'), metaitem('tjceu:steam.motor.ulv')],[item('contenttweaker:steampiston'), ore('plateDoubleSteel'), ore('plateDoubleSteel')], [ore('plateDoubleSteel'), item('contenttweaker:steampiston'), ore('plateDoubleSteel')]]);
// crafting.removeByOutput(item('gregtech:machine:2004'));
// crafting.addShaped(item('gregtech:machine:2004'), [[item('gregtech:multiblock_casing', 2), item('gregtech:meta_item_1:32655'), item('gregtech:multiblock_casing', 2)],[ore('circuitMaster'), item('gregtech:mte', 991), ore('circuitMaster')], [item('gregtech:multiblock_casing', 2), item('gregtech:meta_item_1:32655'), item('gregtech:multiblock_casing', 2)]]);
// 
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 250) * 24], [], true);
// 
// assembler.recipeBuilder()
// .inputs([ore('plateGraphene'),ore('plateRuthenium'), ore('wireFineNaquadahAlloy') *8])
// .fluidInputs(fluid('soldering_alloy') * 144 )
// .outputs([item('gcyl:gcyl_meta_item', 250) * 24])
// .duration(80)
// .EUt(7904)
// .buildAndRegister();
// /*
// crafting.removeByOutput(item('gregtech:machine:2530'));
// crafting.addShaped(item('gregtech:machine:2530'), [[item('gtadditions:ga_multiblock_casing', 1), ore('circuitEv'), item('gtadditions:ga_multiblock_casing', 1)],[item('gregtech:meta_item_1:32603'), item('gregtech:mte', 218), item('gregtech:meta_item_1:32603')], [item('gtadditions:ga_multiblock_casing', 1), ore('circuitEv'), item('gtadditions:ga_multiblock_casing', 1)]]);
// */
// Utils.removeRecipeByOutput(assembler, [item('gtadditions:ga_meta_item:32131')], [], true);
// assembler.recipeBuilder()
// .inputs([ore('plateDoubleSteel'), ore('circuitBasic') * 2])
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 4}))
// .outputs([item('gtadditions:ga_meta_item:32131')])
// .duration(80)
// .EUt(30)
// .buildAndRegister();
// 
// crafting.removeByOutput(item('gregtech:machine:4212'));
// crafting.addShaped(item('gregtech:machine:4212'), [[item('gregtech:fluid_pipe:2095'), item('gregtech:fluid_pipe:2095'), item('gregtech:fluid_pipe:2095')],[item('contenttweaker:steampiston'), item('gregtech:steam_casing'), item('contenttweaker:steampiston')], [ore('rotorBronze'), item('gregtech:fluid_pipe:2095'), ore('rotorBronze')]]);
// 
// crafting.addShaped(ore('componentResistor') * 2, [[item('gregtech:meta_item_1', 438), ore('wireGtSingleCopper'), item('gregtech:meta_item_1', 438)],[ore('wireGtSingleCopper'), ore('dustCharcoal'), ore('wireGtSingleCopper')], [null, ore('wireGtSingleCopper'), null]]);
// crafting.addShaped(ore('componentResistor') * 2, [[item('gregtech:meta_item_1', 438), ore('wireGtSingleCopper'), item('gregtech:meta_item_1', 438)],[ore('wireGtSingleCopper'), ore('dustCoal'), ore('wireGtSingleCopper')], [null, ore('wireGtSingleCopper'), null]]);
// crafting.removeByOutput(item('apotheosis:hellshelf'));
// crafting.addShaped(item('apotheosis:hellshelf'), [[item('minecraft:nether_brick'), ore('logWood'), item('minecraft:nether_brick')],[ore('bookEmpty,craftingBook'), ore('bookEmpty,craftingBook'), ore('bookEmpty,craftingBook')], [item('minecraft:nether_brick'), ore('logWood'), item('minecraft:nether_brick')]]);
// crafting.addShaped(item('apotheosis:hellshelf'), [[item('minecraft:nether_brick'), item('minecraft:nether_brick'), item('minecraft:nether_brick')],[null, item('minecraft:bookshelf'), null], [item('minecraft:nether_brick'), item('minecraft:nether_brick'), item('minecraft:nether_brick')]]);
// crafting.addShapeless(item('gregtech:mte', 560), [item('actuallyadditions:block_atomic_reconstructor')]);
// crafting.addShaped(ore('bookEnchanted,craftingBook').withNbt({StoredEnchantments: [{lvl: 1 as short, id: 45 as short}]}), [[item('minecraft:red_nether_brick'), item('minecraft:netherrack'), item('minecraft:red_nether_brick')],[item('minecraft:netherrack'), ore('bookEmpty,craftingBook'), item('minecraft:netherrack')], [item('minecraft:nether_brick'), item('minecraft:netherrack'), item('minecraft:nether_brick')]]);
// 
// // coke oven and primitve alloy
// crafting.addShaped(item('gregtech:machine:1002'), [[item('gregtech:metal_casing', 1), metaitem('tjceu:steam.motor.ulv'), item('gregtech:metal_casing', 1)],[metaitem('tjceu:steam.motor.ulv'), null, item('contenttweaker:steampiston')], [item('gregtech:metal_casing', 1), item('contenttweaker:steampiston'), item('gregtech:metal_casing', 1)]]);
// crafting.addShaped(item('gregtech:mte:1017'), [[item('gregtech:metal_casing', 8), ore('plateDoubleBronze'), item('gregtech:metal_casing', 8)],[ore('plateDoubleBronze'), null, ore('plateDoubleBronze')], [item('gregtech:metal_casing', 8), ore('plateDoubleBronze'), item('gregtech:metal_casing', 8)]]);
// 
// /*
// Utils.removeRecipeByOutput(mixer, [], [fluid('nitro_fuel') * 750], true);
// 
// mixer.recipeBuilder()
// .fluidInputs([fluid('bio_diesel') * 1000 ,fluid('tetranitromethane') * 20])
// .fluidOutputs([fluid('nitro_fuel') * 1000])
// .EUt(480)
// .duration(20)
// .buildAndRegister();
// 
// Utils.removeRecipeByOutput(largeMix, [], [fluid('nitro_fuel') * 750], true);
// largeMix.recipeBuilder()
// .fluidInputs([fluid('bio_diesel') * 1000, fluid('tetranitromethane') * 20])
// .fluidOutputs([fluid('nitro_fuel') * 1000])
// .circuit(2)
// .EUt(480)
// .duration(20)
// .buildAndRegister();
// 
// */
// 
// Utils.removeRecipeByOutput(mixer, [], [fluid('nitro_fuel') * 1000], true);
// 
// mixer.recipeBuilder()
// .fluidInputs([fluid('fuel') * 2000 ,fluid('tetranitromethane') * 20 ])
// .fluidOutputs([fluid('nitro_fuel') * 2000])
// .EUt(480)
// .duration(20)
// .buildAndRegister();
// 
// Utils.removeRecipeByOutput(largeMix, [], [fluid('nitro_fuel') * 1000], true);
// 
// largeMix.recipeBuilder()
// .fluidInputs([fluid('fuel') * 2000, fluid('tetranitromethane') * 20])
// .fluidOutputs([fluid('nitro_fuel') * 2000])
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 2}))
// .EUt(480)
// .duration(20)
// .buildAndRegister();
// 
// 
// 
// //Nitro Benzeene
// 
// Utils.removeRecipeByOutput(chemreactor, [], [fluid('nitro_benzene') * 1000], true);
// 
// chemreactor.recipeBuilder()
// .fluidInputs(fluid('nitration_mixture') * 2000, fluid('benzene') * 5000, fluid('distilled_water') * 2000)
// .fluidOutputs(fluid('nitro_benzene') * 8000, fluid('diluted_sulfuric_acid') * 1000)
// .EUt(320)
// .duration(120)
// .buildAndRegister();
// 
// Utils.removeRecipeByOutput(large_chem, [], [fluid('nitro_benzene') * 1000], true);
// 
// large_chem.recipeBuilder()
// .fluidInputs(fluid('nitration_mixture') * 2000, fluid('benzene') * 5000,fluid('distilled_water') * 2000)
// .fluidOutputs(fluid('nitro_benzene') * 8000, fluid('diluted_sulfuric_acid') * 1000)
// .EUt(320)
// .duration(120)
// .buildAndRegister();
// 
// Utils.removeRecipeByOutput(assembler, [item('gregtech:machine:4239')], [], true);
// 
// assembler.recipeBuilder()
// .inputs(item('gregtech:meta_item_1:32600') * 4, metaitem('electric.pump.lv') * 4,item('gregtech:mte', 986), item('gregtech:meta_block_frame_20', 4), item('gregtech:meta_item_2:26017') * 2, ore('circuitBasic'))
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 2}))
// .outputs(item('gregtech:machine:4239'))
// .EUt(30)
// .duration(400)
// .buildAndRegister();
// 
// //start of weirdness
// distillery.findRecipe(100, [item('gregtech:meta_item_1:32766').withNbt({Configuration: 0})], [fluid('biomass')* 2000]).remove();
// 
// distillery.recipeBuilder()
// .fluidInputs(fluid('biomass') * 1000)
// .fluidOutputs(fluid('ethanol') * 600)
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
// .EUt(16)
// .duration(80)
// .buildAndRegister();
// 
// Utils.removeRecipeByOutput(centrifuge, [], [fluid('oil') * 100], true);
// Utils.removeRecipeByOutput(large_centrifuge, [], [fluid('oil') * 100], true);
// 
// crafting.addShaped(item('variegated:defiled_ground') * 4, [[ore('itemSkull'), item('minecraft:soul_sand'), ore('itemSkull')],[item('minecraft:soul_sand'), ore('ingotSoularium'), item('minecraft:soul_sand')], [ore('itemSkull'), item('minecraft:soul_sand'), ore('itemSkull')]]);
// crafting.removeByOutput(item('variegated:defiled_ground'));
// 
// //concrete recipes
// 
// mixer.recipeBuilder()
// .inputs([item('minecraft:concrete_powder') * 64])
// .fluidInputs(fluid('water') * 100)
// .outputs([item('minecraft:concrete') * 64])
// .duration(100)
// .EUt(16)
// .buildAndRegister();
// 
// val i = 0;
// for i in 1 to 16{
// mixer.recipeBuilder()
// 
// .inputs([itemUtils.getItem("minecraft:concrete_powder", i)* 64])
// .fluidInputs(fluid('water') * 1000)
// .outputs(itemUtils.getItem("minecraft:concrete",i) * 64)
// .duration(100)
// .EUt(16)
// .buildAndRegister();
// }
// //Large concrete recipes
// 
// largeMix.recipeBuilder()
// .inputs([item('minecraft:concrete_powder') * 64])
// .fluidInputs(fluid('water') * 100)
// .outputs([item('minecraft:concrete') * 64])
// .duration(100)
// .EUt(16)
// .buildAndRegister();
// 
// val f = 0;
// for f in 1 to 16{
// largeMix.recipeBuilder()
// .inputs([itemUtils.getItem("minecraft:concrete_powder", f)* 64])
// .fluidInputs(fluid('water') * 1000)
// .outputs(itemUtils.getItem("minecraft:concrete",f) * 64)
// .duration(100)
// .EUt(16)
// .buildAndRegister();
// }
// 
// crafting.removeByOutput(item('gregtech:machine:4024'));
// crafting.addShaped(item('gregtech:machine:4024'), [[item('minecraft:glass'), item('minecraft:glass'), item('minecraft:glass')],[ore('plateSteel'), item('gregtech:mte', 986), ore('plateSteel')], [ore('cableGtSingleTin'), ore('toolHeadDrillSteel'), ore('cableGtSingleTin')]]);
// crafting.removeByOutput(item('draconicevolution:diss_enchanter'));
// crafting.addShaped(item('draconicevolution:diss_enchanter'), [[ore('gemEmerald'), ore('plateDoubleAluminium'), ore('gemEmerald')],[ore('plateDoubleAluminium'), item('minecraft:enchanting_table'), ore('plateDoubleAluminium')], [item('minecraft:bookshelf'), item('minecraft:bookshelf'), item('minecraft:bookshelf')]]);
// //MOB stuff
// crafting.removeByOutput(item('mob_grinding_utils:fan'));
// crafting.addShaped(item('mob_grinding_utils:fan'), [[ore('plateAluminium'), ore('dustRedstone'), ore('cableGtSingleTin')],[ore('dustRedstone'), item('gregtech:mte', 986), ore('rotorSteel')], [ore('plateAluminium'), ore('dustRedstone'), ore('cableGtSingleTin')]]);
// crafting.removeByOutput(item('mob_grinding_utils:spikes'));
// crafting.addShaped(item('mob_grinding_utils:spikes'), [[null, item('gregtech:meta_item_2', 33), null],[item('gregtech:meta_item_2', 33), item('gregtech:mte', 986), item('gregtech:meta_item_2', 33)], [item('gtadditions:ga_meta_item:1033'), item('gtadditions:ga_meta_item:1033'), item('gtadditions:ga_meta_item:1033')]]);
// crafting.removeByOutput(item('mob_grinding_utils:saw'));
// crafting.addShaped(item('mob_grinding_utils:saw'), [[ore('plateStainlessSteel'), item('gregtech:meta_item_2', 183), ore('plateStainlessSteel')],[ore('gemExquisiteDiamond'), item('mob_grinding_utils:spikes'), ore('gemExquisiteDiamond')], [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]]);
// crafting.removeByOutput(item('mob_grinding_utils:fan_upgrade', 1));
// crafting.removeByOutput(item('mob_grinding_utils:fan_upgrade'));
// crafting.addShaped(item('mob_grinding_utils:fan_upgrade', 1), [[ore('plateIron'), ore('craftingFeather,feather'), ore('plateIron')],[null, ore('rotorSteel'), null], [ore('plateIron'), ore('craftingFeather,feather'), ore('plateIron')]]);
// crafting.addShaped(item('mob_grinding_utils:fan_upgrade'), [[ore('plateIron'), null, ore('plateIron')],[ore('craftingFeather,feather'), ore('rotorSteel'), ore('craftingFeather,feather')], [ore('plateIron'), null, ore('plateIron')]]);
// crafting.addShaped(item('mob_grinding_utils:fan_upgrade', 2), [[ore('plateIron'), ore('craftingFeather,feather'), ore('plateIron')],[ore('craftingFeather,feather'), ore('rotorSteel'), ore('craftingFeather,feather')], [ore('plateIron'), ore('craftingFeather,feather'), ore('plateIron')]]);
// crafting.removeByOutput(item('mob_grinding_utils:saw_upgrade', 4));
// crafting.removeByOutput(item('mob_grinding_utils:saw_upgrade', 3));
// crafting.removeByOutput(item('mob_grinding_utils:saw_upgrade'));
// crafting.removeByOutput(item('mob_grinding_utils:fan_upgrade', 2));
// crafting.removeByOutput(item('mob_grinding_utils:saw_upgrade', 2));
// crafting.addShaped(item('mob_grinding_utils:saw_upgrade', 4), [[ore('plateGold'), item('minecraft:spider_eye'), ore('plateGold')],[item('minecraft:spider_eye'), ore('plateRedstone'), item('minecraft:spider_eye')], [ore('plateGold'), item('minecraft:spider_eye'), ore('plateGold')]]);
// crafting.addShaped(item('mob_grinding_utils:saw_upgrade', 3), [[ore('plateGold'), item('minecraft:rotten_flesh'), ore('plateGold')],[item('minecraft:rotten_flesh'), ore('plateRedstone'), item('minecraft:rotten_flesh')], [ore('plateGold'), item('minecraft:rotten_flesh'), ore('plateGold')]]);
// crafting.addShaped(item('mob_grinding_utils:saw_upgrade', 2), [[ore('plateGold'), ore('dustBlaze,itemBlazePowder'), ore('plateGold')],[ore('dustBlaze,itemBlazePowder'), ore('plateRedstone'), ore('dustBlaze,itemBlazePowder')], [ore('plateGold'), ore('dustBlaze,itemBlazePowder'), ore('plateGold')]]);
// crafting.addShaped(item('mob_grinding_utils:saw_upgrade'), [[ore('plateGold'), item('gregtech:meta_item_2', 33), ore('plateGold')],[item('gregtech:meta_item_2', 33), ore('plateRedstone'), item('gregtech:meta_item_2', 33)], [ore('plateGold'), item('gregtech:meta_item_2', 33), ore('plateGold')]]);
// //break two
// 
// lathe.recipeBuilder()
// .inputs([ore('screwIron')])
// .outputs([item('appliedenergistics2:part', 120) * 10])
// .duration(100)
// .EUt(16)
// .buildAndRegister();
// 
// furnace.removeByOutput(ore('ingotSignalum'));
// furnace.removeByOutput(ore('ingotLumium'));
// crafting.addShaped(ore('dustAerotheum'), [[null, ore('dustSulfur'), null],[ore('dustSulfur'), ore('dustBlaze,itemBlazePowder'), ore('dustSulfur')], [null, ore('dustSulfur'), null]]);
// 
// /*
// crafting.addShapeless(item('gregtech:metal_casing_grisium'),[item('gtadditions:ga_metal_casing_1', 8)]);
// Utils.removeRecipeByOutput(assembler, [item('gregtech:machine:15000')], [], false);
// 
// assembler.recipeBuilder()
// .inputs(ore('circuitEv') *2,item('appliedenergistics2:material', 42),item('ae2wtlib:infinity_booster_card'),metaitem('hull.ev'),item('gtadditions:ga_metal_casing_1', 8))
// .outputs(item('gregtech:machine:15000'))
// .EUt(30)
// .duration(2048)
// .buildAndRegister();
// */
// 
// Utils.removeRecipeByOutput(fusion, [], [fluid('rutherfordium')], false);
// Utils.removeRecipeByOutput(fusion, [], [fluid('duranium')], false);
// Utils.removeRecipeByOutput(fusion, [], [fluid('tritanium')], false);
// Utils.removeRecipeByOutput(fusion, [], [fluid('plasma.radon')], false);
// Utils.removeRecipeByOutput(fusion, [], [fluid('dubnium')], false);
// 
// fusion.recipeBuilder()
// .fluidInputs(fluid('neon')* 144, fluid('plutonium') * 144)
// .fluidOutputs(fluid('rutherfordium') * 144)
// .EUToStart(150000000) 
// .duration(64)
// .EUt(16384)
// .buildAndRegister();
// 
// fusion.recipeBuilder()
// .fluidInputs(fluid('radon')* 1125, fluid('gallium') * 144)
// .fluidOutputs(fluid('duranium') * 144)
// .EUToStart(180000000) 
// .duration(64)
// .EUt(24576)
// .buildAndRegister();
// 
// fusion.recipeBuilder()
// .fluidInputs(fluid('duranium')* 288, fluid('titanium') * 432)
// .fluidOutputs(fluid('tritanium') * 144)
// .EUToStart(200000000) 
// .duration(64)
// .EUt(32768)
// .buildAndRegister();
// 
// fusion.recipeBuilder()
// .fluidInputs(fluid('mercury')* 64, fluid('gold') * 64)
// .fluidOutputs(fluid('plasma.radon') * 500)
// .EUToStart(200000000) 
// .duration(64)
// .EUt(32768)
// .buildAndRegister();
// 
// fusion.recipeBuilder()
// .fluidInputs(fluid('neon') * 288, fluid('americium') * 288)
// .fluidOutputs(fluid('dubnium') * 288)
// .EUToStart(200000000) 
// .duration(64)
// .EUt(131072)
// .buildAndRegister();
// 
// fusion.recipeBuilder()
// .fluidInputs(fluid('neon') * 288, fluid('americium243') * 288)
// .fluidOutputs(fluid('dubnium') * 288)
// .EUToStart(200000000) 
// .duration(64)
// .EUt(131072)
// .buildAndRegister();
// 
// 
// //grappling hooks
// 
// crafting.removeByOutput(item('hooked:microcrafting', 2));
// 
// lathe.recipeBuilder()
// .inputs(ore('stickIron'))
// .outputs(item('hooked:microcrafting', 2) * 2)
// .duration(64)
// .EUt(30)
// .buildAndRegister();
// 
// lathe.recipeBuilder()
// .inputs(ore('stickSteel'))
// .outputs( item('hooked:microcrafting', 2)* 4)
// .duration(64)
// .EUt(30)
// .buildAndRegister();
// 
// crafting.removeByOutput(item('hooked:hook', 3));
// crafting.removeByOutput(item('hooked:hook', 2));
// crafting.removeByOutput(item('hooked:hook', 1));
// crafting.addShaped(item('hooked:hook', 3), [[ore('plateRedstone'), ore('plateRedstone'), item('actuallyadditions:block_crystal')],[null, item('hooked:hook', 2), ore('plateRedstone')], [ore('plateRedstone'), null, ore('plateRedstone')]]);
// crafting.addShaped(item('hooked:hook', 2), [[null, ore('plateDiamond'), ore('plateDiamond')],[null, item('hooked:hook', 1), ore('plateDiamond')], [ore('plateDiamond'), null, null]]);
// crafting.addShaped(item('hooked:hook', 1), [[item('gtadditions:ga_meta_item:1033'), item('gtadditions:ga_meta_item:1033'), item('gregtech:meta_item_2:1033')],[null, item('hooked:microcrafting', 3), item('gtadditions:ga_meta_item:1033')], [item('hooked:microcrafting', 3), null, item('gtadditions:ga_meta_item:1033')]]);
// 
// crafting.addShaped(item('fluxnetworks:fluxpoint'), [[null, null, null],[null, item('fluxnetworks:fluxplug'), null], [null, null, null]]);
// crafting.addShaped(item('fluxnetworks:fluxplug'), [[null, null, null],[null, item('fluxnetworks:fluxpoint'), null], [null, null, null]]);
// 
// crafting.removeByOutput(item('enderio:item_advanced_item_filter'));
// crafting.addShaped(item('enderio:item_advanced_item_filter'), [[ore('plateRedstone'), ore('plateDiamond'), ore('plateRedstone')],[ore('plateDiamond'), item('enderio:item_basic_item_filter'), ore('plateDiamond')], [ore('plateRedstone'), ore('plateDiamond'), ore('plateRedstone')]]);
// 
//         fluid_extractor.recipeBuilder()
//         .inputs([item('actuallyadditions:item_solidified_experience') * 64])
//         .fluidOutputs(fluid('xpjuice') * 10240)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
// 
//         compressor.recipeBuilder()
//         .inputs([item('minecraft:apple') * 8])
//         .outputs([item('gregtech:meta_item_1', 439)])
//         .duration(300)
//         .EUt(2)
//         .buildAndRegister();
// 
//         hammer.recipeBuilder()
//         .inputs([item('advancedrocketry:charcoallog')])
//         .outputs([ore('charcoal,gemCharcoal,itemCharcoal') * 4])
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
//         crafting.removeByOutput(item('enderio:item_capacitor_stellar'));
//         crafting.addShaped(item('enderio:item_capacitor_stellar'), [[ore('plateSterlingSilver'), ore('dustSilverChloride'), ore('plateSterlingSilver')],[item('enderio:item_basic_capacitor', 2), item('minecraft:lapis_block'), item('enderio:item_basic_capacitor', 2)], [ore('plateSterlingSilver'), ore('dustSilverChloride'), ore('plateSterlingSilver')]]);
// 
//         Utils.removeRecipeByOutput(forming, [item('gcyl:gcyl_meta_item', 230)], [], false);
//         crafting.removeByOutput(item('minecraft:end_crystal'));
//         recipes.removeShaped(item('minecraft:end_crystal'), [[ore('paneGlassColorless'), ore('paneGlassColorless'), ore('paneGlassColorless')],[ore('paneGlassColorless'), item('gregtech:meta_item_1:32725'), ore('paneGlassColorless')], [ore('paneGlassColorless'), item('gregtech:meta_item_1:32672'), ore('paneGlassColorless')]]);
// 
//         Utils.removeRecipeByOutput(tower, [], [fluid('argon')], false);
// 
//         tower.recipeBuilder()
//         .fluidInputs(fluid('liquid_air') * 100000)
//         .fluidOutputs(fluid('nitrogen') * 78000,fluid('oxygen') * 20000,fluid('argon') * 1000,fluid('carbon_dioxide') * 500, fluid('neon') * 100, fluid('helium') * 50,fluid('methane') * 20,fluid('krypton') * 10, fluid('hydrogen') * 5, fluid('xenon'))
//         .duration(600)
//         .EUt(510)
//         .buildAndRegister();
// 
//     Utils.removeRecipeByOutput(blast_furnace, [ore('ingotHotVanadium')], [], false);
// 
//     blast_furnace.recipeBuilder()
//     .inputs(ore('dustVanadium'))
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 1}))
//     .outputs(ore('ingotHotVanadium'))
//     .blastFurnaceTemp(2183) //this is a minimal temperature at which the item will be smelted
//     .duration(2226)
//     .EUt(120)
//     .buildAndRegister();
// 
// 
// forming.recipeBuilder()
// .inputs(ore('ingotSoularium') * 2,ore('itemSkull'),ore('dustSilicon') * 2,ore('ingotVibrantAlloy'))
// .outputs(ore('skullEnderResonator'))
// .EUt(16)
// .duration(150)
// .buildAndRegister();
// //remove upcraft recipes
// /*
// Utils.removeRecipeByOutput(assembler, [ore('componentDiode') * 16], [], true);
// Utils.removeRecipeByOutput(assembler, [ore('componentCapacitor') * 8], [], true);
// Utils.removeRecipeByOutput(assembler, [ore('componentResistor') * 12], [], true);
// Utils.removeRecipeByOutput(assembler, [ore('componentTransistor') * 16], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 240) * 16], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 241) * 12], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 242) * 8], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 243) * 16], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 244) * 16], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 245) * 12], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 246) * 8], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 247) * 16], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 248) * 16], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 249) * 8], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 250) * 12], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 251) * 16], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 252) * 16], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 253) * 8], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 254) * 12], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 255) * 16], [], true);
// */
// 
// //Fix blood ratio
// Utils.removeRecipeByOutput(centrifuge, [], [fluid('blood') * 250], true);
// Utils.removeRecipeByOutput(large_centrifuge, [], [fluid('blood') * 250], true);
// 
// implosion.recipeBuilder()
//     .inputs(item('gregtech:meta_item_2:32434'))
//     .explosives(item('gregtech:itnt') * 4)
//     .outputs(item('gregtech:meta_item_2:32435'))
//     .duration(20)
//     .EUt(30)
//     .buildAndRegister();
// 
//     implosion.recipeBuilder()
//     .inputs(ore('dustDiamond') * 4)
//     .explosives(item('gregtech:itnt') * 24)
//     .outputs(ore('gemDiamond') * 3)
//     .duration(20)
//     .EUt(30)
//     .buildAndRegister();
// 
// 
// 
// 
// electrolyzer.findRecipe(30,[item('minecraft:snowball') * 3] ,null).remove();
// 
// electrolyzer.recipeBuilder()
// .inputs([item('minecraft:snowball') * 4])
// .fluidOutputs([fluid('hydrogen') * 2000,fluid('oxygen') * 1000])
// .duration(1244)
// .EUt(30)
// .buildAndRegister();
// 
// crafting.removeByOutput(item('randomthings:spectreenergyinjector'));
// crafting.addShaped(item('randomthings:spectreenergyinjector'), [[item('minecraft:obsidian'), item('randomthings:spectrelens'), item('minecraft:obsidian')],[item('randomthings:ingredient', 12), item('randomthings:spectrecharger'), item('randomthings:ingredient', 12)], [item('minecraft:obsidian'), item('randomthings:ingredient', 12), item('minecraft:obsidian')]]);
// 
// //naq
// 
// nuclear_reactor.recipeBuilder()
// .inputs([ore('stickNaquadah') * 2])
// .blastFurnaceTemp(1000)
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
// .outputs([ore('stickPlatinum') * 2, item('gtadditions:ga_meta_item:32312') * 16])
// .duration(500)
// .EUt(30)
// .buildAndRegister();
// 
// nuclear_breeder.recipeBuilder()
// .inputs([ore('stickNaquadah') * 2, item('gtadditions:ga_meta_item:17075') * 10])
// .blastFurnaceTemp(1000)
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
// .outputs([ore('stickPlatinum') * 2, item('gtadditions:ga_meta_item:32312') * 8 , item('gtadditions:ga_meta_item:9815') * 10 , item('gtadditions:ga_meta_item:9819') * 10])
// .duration(500)
// .EUt(30)
// .buildAndRegister();
// 
// //enriched naq
// 
// nuclear_reactor.recipeBuilder()
// .inputs([ore('stickNaquadahEnriched') * 2])
// .blastFurnaceTemp(1000)
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
// .outputs([ore('stickNaquadah') * 2, item('gtadditions:ga_meta_item:32312') * 16])
// .duration(500)
// .EUt(30)
// .buildAndRegister();
// 
// nuclear_breeder.recipeBuilder()
// .inputs([ore('stickNaquadahEnriched') * 2, item('gtadditions:ga_meta_item:16053')* 10])
// .blastFurnaceTemp(1000)
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
// .outputs([ore('stickNaquadah') * 2, item('gtadditions:ga_meta_item:32312') * 8, item('gtadditions:ga_meta_item:11809') * 10 , item('gtadditions:ga_meta_item:11053') * 10])
// .duration(500)
// .EUt(30)
// .buildAndRegister();
// 
// //naqudria
// 
// nuclear_reactor.recipeBuilder()
// .inputs([ore('stickNaquadria') * 2])
// .blastFurnaceTemp(1000)
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
// .outputs([ore('stickNaquadahEnriched') * 2, item('gtadditions:ga_meta_item:32312') * 16])
// .duration(500)
// .EUt(30)
// .buildAndRegister();
// 
// nuclear_breeder.recipeBuilder()
// .inputs([ore('stickNaquadria') * 2, item('gtadditions:ga_meta_item:16809') * 10])
// .blastFurnaceTemp(1000)
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
// .outputs([ore('stickNaquadahEnriched') * 2, item('gtadditions:ga_meta_item:32312') * 8, item('gtadditions:ga_meta_item:11799') * 10, item('gtadditions:ga_meta_item:9804') * 10])
// .duration(500)
// .EUt(30)
// .buildAndRegister();
// 
// //awaken draconium
// 
// nuclear_reactor.recipeBuilder()
// .inputs([ore('stickAwakenDraconium') * 2])
// .blastFurnaceTemp(1000)
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
// .outputs([ore('stickDraconium') * 2, item('gtadditions:ga_meta_item:32312') * 30])
// .duration(500)
// .EUt(30)
// .buildAndRegister();
// 
// nuclear_breeder.recipeBuilder()
// .inputs([ore('stickAwakenDraconium') * 2, item('gtadditions:ga_meta_item:17795') * 10])
// .blastFurnaceTemp(1000)
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
// .outputs([ore('stickDraconium') * 2, item('gtadditions:ga_meta_item:32312') * 16, item('gtadditions:ga_meta_item:11789') * 10, item('gtadditions:ga_meta_item:9793') * 10])
// .duration(500)
// .EUt(30)
// .buildAndRegister();
// 
// //refined chaos
// 
// nuclear_reactor.recipeBuilder()
// .inputs([item('gregtech:meta_item_1:14520') * 2])
// .blastFurnaceTemp(1000)
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
// .outputs([ore('stickAwakenDraconium') * 2, item('gtadditions:ga_meta_item:32312') * 32])
// .duration(500)
// .EUt(30)
// .buildAndRegister();
// 
// nuclear_breeder.recipeBuilder()
// .inputs([item('gregtech:meta_item_1:14520') * 2, item('gtadditions:ga_meta_item:17784') * 10])
// .blastFurnaceTemp(1000)
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
// .outputs([ore('stickAwakenDraconium') * 2, item('gtadditions:ga_meta_item:32312') * 16, item('gtadditions:ga_meta_item:11778') * 10, item('gtadditions:ga_meta_item:11783') * 10])
// .duration(500)
// .EUt(30)
// .buildAndRegister();
// 
// 
// 
// crafting.removeByOutput(item('gregtech:machine', 793));
// crafting.removeByOutput(item('gregtech:machine', 792));
// crafting.removeByOutput(item('gregtech:machine', 791));
// crafting.removeByOutput(item('gregtech:machine', 790));
// //crafting.removeByOutput(item('gregtech:machine', 819));
// 
// crafting.addShaped(item('gregtech:machine', 793), [[null, null, null],[null, item('gregtech:mte', 994), null], [null, item('minecraft:glass'), null]]);
// crafting.addShaped(item('gregtech:machine', 792), [[null, item('minecraft:glass'), null],[null, item('gregtech:mte', 994), null], [null, null, null]]);
// crafting.addShaped(item('gregtech:machine', 791), [[null, null, null],[null, item('gregtech:mte', 994), null], [null, ore('chest,chestWood'), null]]);
// crafting.addShaped(item('gregtech:machine', 790), [[null, ore('chest,chestWood'), null],[null, item('gregtech:mte', 994), null], [null, null, null]]);
// //crafting.addShaped(item('gregtech:machine', 819), [[ore('wireGtHexDuranium'), item('gregtech:mte', 994), ore('wireGtHexDuranium')],[ore('wireGtHexDuranium'), ore('gearHsss'), ore('wireGtHexDuranium')], [ore('wireGtHexDuranium'), ore('wireGtHexDuranium'), ore('wireGtHexDuranium')]]);
// 
// 
//     ADVFusion.recipeBuilder()
//     .fluidInputs(fluid('sodium') * 144, fluid('curium250') * 144)
//     .fluidOutputs(fluid('bohrium') * 288)
//     .EUToStart(1000000000)
//     .AdvCoilTier(1)
//     .EUReturn(40)
//     .duration(50)
//     .EUt(1000000)
//     .buildAndRegister();
// 
// crafting.addShaped(ore('darkFusedQuartz') * 8, [[ore('blockGlassHardened'), ore('blockGlassHardened'), ore('blockGlassHardened')],[ore('blockGlassHardened'), ore('dyeBlack'), ore('blockGlassHardened')], [ore('blockGlassHardened'), ore('blockGlassHardened'), ore('blockGlassHardened')]]);
// crafting.addShaped(ore('notHolyEnlightenedFusedQuartz') * 8, [[ore('blockGlassHardened'), ore('blockGlassHardened'), ore('blockGlassHardened')],[ore('blockGlassHardened'), item('astralsorcery:itemusabledust'), ore('blockGlassHardened')], [ore('blockGlassHardened'), ore('blockGlassHardened'), ore('blockGlassHardened')]]);
// crafting.addShaped(ore('darkFusedQuartz') * 8, [[ore('blockGlassHardened'), ore('blockGlassHardened'), ore('blockGlassHardened')],[ore('blockGlassHardened'), item('astralsorcery:itemusabledust', 1), ore('blockGlassHardened')], [ore('blockGlassHardened'), ore('blockGlassHardened'), ore('blockGlassHardened')]]);
// crafting.addShaped(ore('notHolyEnlightenedFusedQuartz') * 8, [[ore('blockGlassHardened'), ore('blockGlassHardened'), ore('blockGlassHardened')],[ore('blockGlassHardened'), ore('dustGlowstone'), ore('blockGlassHardened')], [ore('blockGlassHardened'), ore('blockGlassHardened'), ore('blockGlassHardened')]]);
// crafting.addShaped(ore('dustWheat').withNbt({entityId: "minecraft:pig"}), [[ore('dustSoularium'), ore('dyeSoulMachine'), ore('dustSoularium')],[ore('dyeSoulMachine'), ore('itemSoulMachineChassi'), ore('dyeSoulMachine')], [ore('dustSoularium'), ore('dyeSoulMachine'), ore('dustSoularium')]]);
// 
// Utils.removeRecipeByOutput(mixer, [ore('dustSterlingSilver')], [], false);
// 
// mixer.recipeBuilder()
// .inputs([ore('dustCopper'),ore('dustSilver') * 4])
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 2}))
// .outputs([ore('dustSterlingSilver') * 5])
// .duration(20)
// .EUt(8)
// .buildAndRegister();
// 
// extruder.recipeBuilder()
// .inputs([ore('ingotSignalum') *  4])
// .notConsumable(item('gregtech:meta_item_1', 52))
// .outputs([ore('gearSignalum')])
// .duration(380)
// .EUt(30)
// .buildAndRegister();
// 
// furnace.removeByOutput(item('gregtech:meta_item_1:2518'));
// 
// Utils.removeRecipeByOutput(fluid_extractor, [], [fluid('pyrotheum') * 250], true);
// 
// fluid_extractor.recipeBuilder()
// .inputs([ore('dustPyrotheum')])
// .fluidOutputs(fluid('pyrotheum') * 1000)
// .EUt(24)
// .duration(35)
// .buildAndRegister();
// 
// Utils.removeRecipeByOutput(fluid_extractor, [], [fluid('cryotheum') * 250], true);
// 
// fluid_extractor.recipeBuilder()
// .inputs([ore('dustCryotheum')])
// .fluidOutputs(fluid('cryotheum') * 1000)
// .EUt(24)
// .duration(35)
// .buildAndRegister();
// 
// electrolyzer.recipeBuilder()
// .inputs([ore('dustDiamond')])
// .outputs(ore('dustCarbon,dyeBlack') * 64)
// .duration(608)
// .EUt(30)
// .buildAndRegister();
// 
// //Diamond upcraft
// engraver.recipeBuilder()
// .inputs([ore('gemDiamond') * 4])
// .notConsumable(ore('craftingLensWhite'))
// .outputs(ore('gemFlawlessDiamond'))
// .duration(2400)
// .EUt(2000)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs([ore('gemFlawlessDiamond') * 4])
// .notConsumable(ore('craftingLensWhite'))
// .outputs(ore('gemExquisiteDiamond'))
// .duration(2400)
// .EUt(2000)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs([ore('gemDiamond') * 4])
// .notConsumable(ore('craftingLensWhite'))
// .outputs(ore('gemFlawlessDiamond'))
// .duration(2400)
// .EUt(2000)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs([ore('gemFlawlessDiamond') * 4])
// .notConsumable(ore('craftingLensWhite'))
// .outputs(ore('gemExquisiteDiamond'))
// .duration(2400)
// .EUt(2000)
// .buildAndRegister();
// 
// 
// furnace.removeByOutput(ore('ingotDuranium'));
// furnace.removeByOutput(ore('ingotRutherfordium'));
// furnace.removeByOutput(ore('ingotTritanium'));
// 
// 
//     blast_furnace.recipeBuilder()
//     .inputs(ore('dustRutherfordium'))
//     .outputs(ore('ingotRutherfordium'))
//     .blastFurnaceTemp(5400) //this is a minimal temperature at which the item will be smelted
//     .duration(16560)
//     .EUt(120)
//     .buildAndRegister();
// 
//     blast_furnace.recipeBuilder()
//     .inputs(ore('dustTritanium'))
//     .outputs(ore('ingotTritanium'))
//     .blastFurnaceTemp(11000) //this is a minimal temperature at which the item will be smelted
//     .duration(16560)
//     .EUt(120)
//     .buildAndRegister();
// 
// 
//     blast_furnace.recipeBuilder()
//     .inputs(ore('dustDuranium'))
//     .outputs(ore('ingotDuranium'))
//     .blastFurnaceTemp(6000) //this is a minimal temperature at which the item will be smelted
//     .duration(16560)
//     .EUt(120)
//     .buildAndRegister();
// 
//     furnace.removeByOutput(item('gregtech:meta_item_1:10518'));
//     furnace.removeByOutput(ore('ingotNaquadria'));
// 
// crafting.removeByOutput(item('gregtech:machine:3208'));
// crafting.removeByOutput(item('gregtech:machine:3209'));
// crafting.removeByOutput(item('gregtech:machine:3210'));
// crafting.removeByOutput(item('gregtech:machine', 817));
// crafting.removeByOutput(item('gregtech:machine', 818));
// crafting.removeByOutput(item('gregtech:machine', 819));
// 
// crafting.addShaped(item('gregtech:machine', 819), [[item('gregtech:meta_item_2:17850'), ore('gearHsss'), item('gregtech:meta_item_2:17850')],[ore('gearHsss'), item('gregtech:mte', 994), ore('gearHsss')], [item('gregtech:meta_item_2:17850'), ore('gearHsss'), item('gregtech:meta_item_2:17850')]]);
// crafting.addShaped(item('gregtech:machine:3210'), [[item('gregtech:meta_item_2:17850'), ore('gearSeaborgium'), item('gregtech:meta_item_2:17850')],[ore('gearSeaborgium'), item('gregtech:mte', 994), ore('gearSeaborgium')], [item('gregtech:meta_item_2:17850'), ore('gearSeaborgium'), item('gregtech:meta_item_2:17850')]]);
// crafting.addShaped(item('gregtech:machine', 818), [[ore('gearSmallTungstenSteel'), item('gregtech:meta_item_2:26016'), ore('gearSmallTungstenSteel')],[item('gregtech:meta_item_2:26016'), item('gregtech:mte', 991), item('gregtech:meta_item_2:26016')], [ore('gearSmallTungstenSteel'), item('gregtech:meta_item_2:26016'), ore('gearSmallTungstenSteel')]]);
// crafting.addShaped(item('gregtech:machine:3209'), [[ore('gearSmallTungstenSteel'), ore('gearRhodiumPlatedPalladium'), ore('gearSmallTungstenSteel')],[ore('gearRhodiumPlatedPalladium'), item('gregtech:mte', 991), ore('gearRhodiumPlatedPalladium')], [ore('gearSmallTungstenSteel'), ore('gearRhodiumPlatedPalladium'), ore('gearSmallTungstenSteel')]]);
// crafting.addShaped(item('gregtech:machine', 817), [[ore('gearSmallAluminium'), ore('gearStainlessSteel'), ore('gearSmallAluminium')],[ore('gearStainlessSteel'), metaitem('hull.hv'), ore('gearStainlessSteel')], [ore('gearSmallAluminium'), ore('gearStainlessSteel'), ore('gearSmallAluminium')]]);
// crafting.addShaped(item('gregtech:machine:3208'), [[ore('gearSmallAluminium'), ore('gearBlackSteel'), ore('gearSmallAluminium')],[ore('gearBlackSteel'), metaitem('hull.hv'), ore('gearBlackSteel')], [ore('gearSmallAluminium'), ore('gearBlackSteel'), ore('gearSmallAluminium')]]);
// 
// crafting.removeByOutput(item('enderio:item_big_item_filter'));
// crafting.addShaped(item('enderio:item_big_item_filter'), [[ore('plateAluminium'), ore('plateRedstone'), ore('plateAluminium')],[ore('plateRedstone'), item('enderio:item_basic_item_filter'), ore('plateRedstone')], [ore('plateAluminium'), ore('plateRedstone'), ore('plateAluminium')]]);
// 
// crafting.addShaped(item('draconicevolution:grinder'), [[ore('plateNaquadahAlloy'), item('gregtech:meta_item_2', 47), ore('plateNaquadahAlloy')],[item('gregtech:meta_item_2', 47), item('gregtech:mte', 990), item('gregtech:meta_item_1', 206)], [ore('plateNaquadahAlloy'), item('gregtech:meta_item_2', 47), ore('plateNaquadahAlloy')]]);
// 
// Utils.removeRecipeByOutput(mixer, [ore('dustNichrome') * 5], [], true);
// 
// mixer.recipeBuilder()
//         .inputs([ore('dustNickel') * 4, ore('dustChrome')])
//         .outputs(ore('dustNichrome') * 5)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 11}))
//         .duration(280)
//         .EUt(30)
//         .buildAndRegister();
// 
//         
// Utils.removeRecipeByOutput(arc, [ore('ingotQcdConfinedMatter')], [], false);
// Utils.removeRecipeByOutput(parc, [ore('ingotQcdConfinedMatter')], [], false);
// Utils.removeRecipeByOutput(fluid_extractor, [], [fluid('qcd_confined_matter')], false);
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 566)], [], true);
// 
// assembler.recipeBuilder()
//         .inputs([ore('plateCosmicNeutronium') * 3, ore('plateFullerenePolymerMatrix') * 3, item('gregtech:meta_item_1:12520') * 3])
//         .outputs(item('gcyl:gcyl_meta_item', 566))
//         .fluidInputs(fluid('neutronium_doped_nanotubes') * 2000)
//         .duration(280)
//         .EUt(536870000)
//         .buildAndRegister();
// 
// 
// crafting.addShaped("clay1", ore('blockClay').firstItem *8,[[ore('sand'),ore('sand'),ore('sand')],[ore('sand'),fluid('water') * 1000,ore('sand')],[ore('sand'),ore('sand'),ore('sand')]]);
// 
// 
// mixer.recipeBuilder()
//         .inputs([ore('sand') * 8])
//         .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
//         .outputs(ore('blockClay,oreClay') * 8)
//         .fluidInputs(fluid('water') * 1000)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
// 
// largeMix.recipeBuilder()
//         .inputs([ore('sand') * 8])
//         .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 0}))
//         .outputs(ore('blockClay,oreClay') * 8)
//         .fluidInputs(fluid('water') * 1000)
//         .duration(100)
//         .EUt(30)
//         .buildAndRegister();
// 
//         Utils.removeRecipeByOutput(assembly_line, [item('gcyl:gcyl_meta_item', 500) * 6], [], true);
// 
// 
// assembly_line.recipeBuilder()
//         .inputs([ore('plateProtoAdamantium') * 4,item('gcyl:gcyl_meta_item', 495) * 2, item('gcyl:gcyl_meta_item', 496) * 2, item('gcyl:gcyl_meta_item', 497) * 2, item('gcyl:gcyl_meta_item', 494) * 2, ore('foilPolyetheretherketone') * 2, item('gcyl:gcyl_meta_item', 491) * 2, item('gcyl:gcyl_meta_item', 438) * 2, item('gcyl:gcyl_meta_item', 488),item('gcyl:gcyl_meta_item', 487), item('gcyl:gcyl_meta_item', 486), item('gcyl:gcyl_meta_item', 499), item('gcyl:gcyl_meta_item', 459) ])
//         .outputs(item('gcyl:gcyl_meta_item', 500) * 6)
//         .fluidInputs(fluid('polytetrafluoroethylene') * 864,fluid('enriched_naquadah_alloy') * 432,fluid('soldering_alloy') * 1296,  fluid('fullerene_doped_nanotubes') * 144)
//         .duration(100)
//         .EUt(1474560)
//         .buildAndRegister();
// 
// crafting.addShaped(item('contenttweaker:steampiston'), [[ore('gearSmallIron'), ore('stickWood'), ore('stickWood')],[ore('gearSmallIron'), metaitem('tjceu:steam.motor.ulv'), ore('plateBronze')], [ore('plateIron'), ore('plateIron'), ore('plateIron')]]);
// 
// var MAXcompblocks = [item('gtadditions:ga_conveyor_casing', 13),item('gtadditions:ga_field_gen_casing', 13),item('gtadditions:ga_motor_casing', 13),item('gtadditions:ga_piston_casing', 13),item('gtadditions:ga_pump_casing', 13),item('gtadditions:ga_robot_arm_casing', 13),item('gtadditions:ga_sensor_casing', 13),item('gtadditions:ga_emitter_casing', 13)]  as IItemStack[];
// var Maxcomp = [item('gcyl:gcyl_meta_item', 353),item('gcyl:gcyl_meta_item', 383),item('gcyl:gcyl_meta_item', 359),item('gcyl:gcyl_meta_item', 365),item('gcyl:gcyl_meta_item', 371),item('gcyl:gcyl_meta_item', 389),item('gcyl:gcyl_meta_item', 395),item('gcyl:gcyl_meta_item', 377)] as IItemStack[];
// 
// for i in 0 to 8{
// 
// Utils.removeRecipeByOutput(assembler, [MAXcompblocks[i]], [], true);
// 
// assembler.recipeBuilder()
//         .inputs([ore('cableGtSingleCosmicNeutronium') * 8, item('gregtech:machine', 509), Maxcomp[i] * 2])
//         .outputs(MAXcompblocks[i])
//         .fluidInputs(fluid('soldering_alloy') * 288 )
//         .duration(100)
//         .EUt(536870900)
//         .buildAndRegister();
// }
// 
// 
// assembly_line.recipeBuilder()
//         .inputs([item('gregtech:cable:2354') * 64,item('gtadditions:ga_dust', 55) * 64,item('gtadditions:ga_cell_casing', 11),ore('boltCosmicNeutronium') * 16,ore('plateDenseChaosalloy') * 8, ore('circuitMax'),item('gcyl:gcyl_meta_item', 377), item('gcyl:gcyl_meta_item', 395)])
//         .outputs(item('gregtech:meta_item_2:32715'))
//         .fluidInputs(fluid('cosmic_mesh_plasma') * 1000,fluid('quantum') * 1296 )
//         .duration(100)
//         .property("qubit", 16)
//         .EUt(983040000)
//         .buildAndRegister();
// 
// 
//  assembler.recipeBuilder()
//         .inputs([item('gtadditions:ga_cell_casing', 10),item('gtadditions:ga_meta_item:1521') * 4, ])
//         .outputs(item('gtadditions:ga_cell_casing', 11))
//         .fluidInputs(fluid('qcd_confined_matter') * 4000)
//         .duration(1200)
//         .EUt(536870900)
//         .buildAndRegister();
// 
// assembler.recipeBuilder()
//         .inputs([item('gtadditions:ga_cell_casing', 9), ore('plateDenseHeavyQuarkDegenerateMatter') * 4])
//         .outputs(item('gtadditions:ga_cell_casing', 10))
//         .fluidInputs(fluid('degenerate_rhenium_plasma') * 4000)
//         .duration(1200)
//         .EUt(536870900)
//         .buildAndRegister();
// 
// //max componets
// //motor
// assembly_line.recipeBuilder()
//         .inputs([ore('stickLongNaquadriaticTaranium') * 64, ore('stickLongNaquadriaticTaranium') * 64,ore('wireFineHeavyQuarkDegenerateMatter') * 64, ore('wireFineHeavyQuarkDegenerateMatter') * 64, ore('wireFineHeavyQuarkDegenerateMatter') * 64, ore('wireFineHeavyQuarkDegenerateMatter') * 64, ore('stickLongCosmicNeutronium') * 2, ore('ringCosmicNeutronium') * 4,ore('roundCosmicNeutronium') * 16, ore('cableGtHexCosmicNeutronium') * 2, metaitem('gcyl:cosmic.fabric') * 8])
//         .notConsumable(item('gcyl:gcyl_meta_item', 518))
//         .outputs(item('gcyl:gcyl_meta_item', 359))
//         .fluidInputs(fluid('lubricant') * 3000,fluid('soldering_alloy') * 1728)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// //pistin
// assembly_line.recipeBuilder()
//         .inputs([ore('plateQcdConfinedMatter') * 8, ore('gearSmallCosmicNeutronium') * 8, ore('stickQcdConfinedMatter') * 4, ore('ingotCosmicNeutronium') * 2, item('gcyl:gcyl_meta_item', 359), ore('cableGtQuadrupleCosmicNeutronium') * 2])
//         .notConsumable(item('gcyl:gcyl_meta_item', 518))
//         .outputs(item('gcyl:gcyl_meta_item', 365))
//         .fluidInputs(fluid('lubricant') * 2000,fluid('soldering_alloy') * 576)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// //convar
// assembly_line.recipeBuilder()
//         .inputs([ore('cableGtQuadrupleCosmicNeutronium') * 2, item('gcyl:gcyl_meta_item', 359) * 2, ore('gearCosmicNeutronium') * 4, ore('stickQcdConfinedMatter') * 4, ore('plateQcdConfinedMatter') * 8, ore('ingotQcdConfinedMatter')])
//         .notConsumable(item('gcyl:gcyl_meta_item', 518))
//         .outputs(item('gcyl:gcyl_meta_item', 353))
//         .fluidInputs(fluid('lubricant') * 5000, fluid('zylon') * 1440)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// //pump
// assembly_line.recipeBuilder()
//         .inputs([item('gcyl:gcyl_meta_item', 359), ore('cableGtQuadrupleCosmicNeutronium') * 2, ore('ringSiliconeRubber') * 16, ore('screwCosmicNeutronium') *  8, ore('rotorCosmicNeutronium') * 2])
//         .notConsumable(item('gcyl:gcyl_meta_item', 518))
//         .outputs(item('gcyl:gcyl_meta_item', 371))
//         .fluidInputs(fluid('lubricant') * 2000, fluid('soldering_alloy') * 576)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// //emitter
// assembly_line.recipeBuilder()
//         .inputs([ore('circuitMax') * 2, item('gtadditions:ga_dust', 384) * 64, item('gcyl:gcyl_meta_item', 555), item('gcyl:gcyl_meta_item', 516), ore('stickLongMendelevium') * 64, item('gcyl:gcyl_meta_item', 561) * 2, ore('cableGtSingleCosmicNeutronium') * 8, item('gregtech:meta_item_1:19520') * 64,ore('frameGtCosmicNeutronium') ])
//         .outputs(item('gcyl:gcyl_meta_item', 377))
//         .fluidInputs(fluid('soldering_alloy') * 864)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// 
// //field generator
// assembly_line.recipeBuilder()
//         .inputs([item('gregtech:meta_item_2:16520') * 64,item('gregtech:meta_item_2:16520') * 64, ore('cableGtSingleCosmicNeutronium') * 4, ore('frameGtChaos'), item('gcyl:gcyl_meta_item', 519), ore('boltChaosalloy') * 16, metaitem('gcyl:cosmic.mesh') * 4, metaitem('gcyl:qcd.protective.plating') * 4, item('gregtech:cable', 354) * 4, ore('circuitMax') ])
//         .outputs(item('gcyl:gcyl_meta_item', 383))
//         .fluidInputs(fluid('soldering_alloy') * 864)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// //arm
// assembly_line.recipeBuilder()
//         .inputs([ore('cableGtDoubleCosmicNeutronium') * 16, ore('circuitUxv') * 8, item('gcyl:gcyl_meta_item', 359) * 2, item('gcyl:gcyl_meta_item', 365), ore('ingotCosmicNeutronium'), ore('stickQcdConfinedMatter') * 8, ore('screwCosmicNeutronium') * 16])
//         .outputs(item('gcyl:gcyl_meta_item', 389))
//         .fluidInputs(fluid('soldering_alloy') * 864, fluid('lubricant') * 864)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// //sensor
// assembly_line.recipeBuilder()
//         .inputs([metaitem('gcyl:cosmic.fabric') * 4, ore('circuitMax') * 2, ore('cableGtSingleCosmicNeutronium')* 4,item('gregtech:meta_item_1:19520') * 64, ore('foilFullerenePolymerMatrix') * 64, item('gcyl:gcyl_meta_item', 459) * 32, item('gcyl:gcyl_meta_item', 516),ore('frameGtCosmicNeutronium') ])
//         .outputs(item('gcyl:gcyl_meta_item', 395))
//         .fluidInputs(fluid('high_energy_qgp') * 2000)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// //OpV componets
// 
// 
// assembly_line.recipeBuilder()
//         .inputs([ore('stickLongNaquadriaticTaranium') * 2, ore('stickLongNaquadriaticTaranium') * 2, ore('wireFineMetastableOganesson') * 64, ore('wireFineMetastableOganesson') * 64, ore('wireFineMetastableOganesson') * 64, ore('wireFineMetastableOganesson') * 64,ore('roundNeutronium') * 16, ore('ringNeutronium') * 4, ore('stickLongNeutronium') * 2, ore('cableGtQuadrupleNeutronium') * 2 ])
//         .outputs(item('gregtech:meta_item_1', 138))
//         .fluidInputs(fluid('lubricant') * 3000,fluid('soldering_alloy') * 1728)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// 
// assembly_line.recipeBuilder()
//         .inputs([item('gregtech:meta_item_1', 138), ore('ingotNeutronium') * 2, ore('stickNeutronium') * 4, ore('gearSmallNeutronium') * 8, ore('plateNeutronium') * 8, ore('cableGtSingleNeutronium') * 2])
//         .outputs(item('gregtech:meta_item_1', 183))
//         .fluidInputs(fluid('lubricant') * 2000,fluid('soldering_alloy') * 576)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// 
// assembly_line.recipeBuilder()
//         .inputs([item('gregtech:meta_item_1', 138) * 2, ore('gearNeutronium') * 4, ore('stickNeutronium') * 4, ore('plateNeutronium') * 8, ore('ingotNeutronium') * 2, ore('cableGtSingleNeutronium') * 2])
//         .outputs(item('gregtech:meta_item_1', 168))
//         .fluidInputs(fluid('lubricant') * 5000, fluid('zylon') * 1440)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// 
// 
// assembly_line.recipeBuilder()
//          .inputs([item('gregtech:meta_item_1', 138), ore('rotorNeutronium') * 2, ore('screwNeutronium') * 8, ore('ringSiliconeRubber') * 16, ore('cableGtSingleNeutronium') * 2, item('gregtech:fluid_pipe:3993') * 16]) 
//         .outputs(item('gregtech:meta_item_1', 153))
//         .fluidInputs(fluid('lubricant') * 2000, fluid('soldering_alloy') * 576)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// 
// assembly_line.recipeBuilder()
//         .inputs([item('gtadditions:ga_dust', 380) * 64, ore('circuitOpv') * 2, ore('frameGtNeutronium'), ore('gemExquisiteJasper') * 2, item('gcyl:gcyl_meta_item', 533), item('gcyl:gcyl_meta_item', 524) * 4, ore('cableGtSingleNeutronium') * 8, ore('foilBohrium') * 64])
//         .outputs(item('gregtech:meta_item_1', 228))
//         .fluidInputs(fluid('lubricant') * 2000, fluid('soldering_alloy') * 576)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// 
// assembly_line.recipeBuilder()
//         .inputs([item('gcyl:gcyl_meta_item', 597),item('gtadditions:ga_meta_item2', 10), ore('wireGtSingleOpvSuperconductor') * 4, ore('circuitOpv') * 2, item('gcyl:gcyl_meta_item', 511), ore('frameGtVibranium'), ore('cableGtSingleNeutronium') * 4, ore('wireFineVibranium') * 64, ore('wireFineVibranium') * 64 ])
//         .outputs(metaitem('field.generator.opv'))
//         .fluidInputs(fluid('soldering_alloy') * 864)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// 
// assembly_line.recipeBuilder()
//         .inputs([ore('cableGtDoubleNeutronium') * 16, ore('circuitUiv') * 8, ore('screwNeutronium') * 16, ore('stickNeutronium') * 16, ore('ingotNeutronium'), item('gregtech:meta_item_1', 183), item('gregtech:meta_item_1', 138) * 2])
//         .outputs(item('gregtech:meta_item_1', 198))
//         .fluidInputs(fluid('soldering_alloy') * 864,fluid('lubricant') * 864)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// 
// assembly_line.recipeBuilder()
//         .inputs([ore('circuitOpv') * 2, ore('cableGtSingleNeutronium') * 8,ore('frameGtNeutronium'), ore('gemExquisiteJasper') * 2, item('gcyl:gcyl_meta_item', 459) * 16, ore('foilMetastableOganesson') * 64, ore('foilFullerenePolymerMatrix') * 64 ])
//         .outputs(item('gregtech:meta_item_1', 243))
//         .fluidInputs(fluid('quark_gluon_plasma') * 2000)
//         .duration(600)
//         .EUt(536870900)
//         .buildAndRegister();
// 
// furnace.removeByOutput(ore('ingotBrightSteel'));
// 
// 
// 
//     blast_furnace.recipeBuilder()
//     .inputs(ore('dustBrightSteel'))
//     .outputs(ore('ingotBrightSteel'))
//     .blastFurnaceTemp(2900) //this is a minimal temperature at which the item will be smelted
//     .duration(1200)
//     .EUt(120)
//     .buildAndRegister();
// 
// //solar panels
// crafting.removeByOutput(item('gregtech:meta_item_1:32752'));
// crafting.addShaped(item('gregtech:meta_item_2:32714'), [[item('gregtech:meta_item_1', 242), ore('gemExquisiteLeadZirconateTitanate'), item('gregtech:meta_item_1', 242)],[ore('circuitUiv'), item('gregtech:mte', 996), ore('circuitUiv')], [ore('cableGtSingleBlackTitanium'), item('gtadditions:ga_meta_item2', 7), ore('cableGtSingleBlackTitanium')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32713'), [[item('gregtech:meta_item_1', 241), ore('gemExquisiteCubicZirconia'), item('gregtech:meta_item_1', 241)],[ore('circuitUev'), item('gregtech:mte', 995), ore('circuitUev')], [ore('cableGtSingleTitanSteel'), item('gtadditions:ga_meta_item2', 4), ore('cableGtSingleTitanSteel')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32712'), [[item('gregtech:meta_item_1', 240), ore('gemExquisiteRhodiumSalt'), item('gregtech:meta_item_1', 240)],[ore('circuitInfinite'), item('gregtech:mte', 994), ore('circuitInfinite')], [ore('cableGtSingleAbyssalAlloy'), item('gregtech:meta_item_1:32598'), ore('cableGtSingleAbyssalAlloy')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32712'), [[item('gregtech:meta_item_1', 240), ore('gemExquisiteRhodiumSalt'), item('gregtech:meta_item_1', 240)],[ore('circuitInfinite'), item('gregtech:mte', 994), ore('circuitInfinite')], [ore('cableGtSingleAbyssalAlloy'), item('gtadditions:ga_meta_item2', 6), ore('cableGtSingleAbyssalAlloy')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32711'), [[item('gregtech:meta_item_1:32697'), ore('gemExquisiteBlueTopaz'), item('gregtech:meta_item_1:32697')],[ore('circuitUv'), item('gregtech:mte', 993), ore('circuitUv')], [ore('cableGtSingleDuranium'), item('gregtech:meta_item_1:32597'), ore('cableGtSingleDuranium')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32711'), [[item('gregtech:meta_item_1:32697'), ore('gemExquisiteBlueTopaz'), item('gregtech:meta_item_1:32697')],[ore('circuitUv'), item('gregtech:mte', 993), ore('circuitUv')], [ore('cableGtSingleDuranium'), item('gtadditions:ga_meta_item2', 3), ore('cableGtSingleDuranium')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32710'), [[item('gregtech:meta_item_1:32696'), ore('gemExquisiteEmerald'), item('gregtech:meta_item_1:32696')],[ore('circuitZpm'), item('gregtech:mte', 992), ore('circuitZpm')], [ore('cableGtSingleNaquadah'), item('gtadditions:ga_meta_item2', 1), ore('cableGtSingleNaquadah')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32710'), [[item('gregtech:meta_item_1:32696'), ore('gemExquisiteEmerald'), item('gregtech:meta_item_1:32696')],[ore('circuitZpm'), item('gregtech:mte', 992), ore('circuitZpm')], [ore('cableGtSingleNaquadah'), ore('lampGtWhite'), ore('cableGtSingleNaquadah')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32709'), [[item('gregtech:meta_item_1:32695'), ore('gemExquisiteRuby'), item('gregtech:meta_item_1:32695')],[ore('circuitMaster'), item('gregtech:mte', 991), ore('circuitMaster')], [ore('cableGtSingleYttriumBariumCuprate'), item('gregtech:meta_item_2:32212'), ore('cableGtSingleYttriumBariumCuprate')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32709'), [[item('gregtech:meta_item_1:32695'), ore('gemExquisiteRuby'), item('gregtech:meta_item_1:32695')],[ore('circuitMaster'), item('gregtech:mte', 991), ore('circuitMaster')], [ore('cableGtSingleYttriumBariumCuprate'), item('gregtech:meta_item_1:32537'), ore('cableGtSingleYttriumBariumCuprate')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32709'), [[item('gregtech:meta_item_1:32695'), ore('gemExquisiteRuby'), item('gregtech:meta_item_1:32695')],[ore('circuitMaster'), item('gregtech:mte', 991), ore('circuitMaster')], [ore('cableGtSingleYttriumBariumCuprate'), item('gregtech:meta_item_1:32539'), ore('cableGtSingleYttriumBariumCuprate')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32709'), [[item('gregtech:meta_item_1:32695'), ore('gemExquisiteRuby'), item('gregtech:meta_item_1:32695')],[ore('circuitMaster'), item('gregtech:mte', 991), ore('circuitMaster')], [ore('cableGtSingleYttriumBariumCuprate'), item('gregtech:meta_item_1:32538'), ore('cableGtSingleYttriumBariumCuprate')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32708'), [[item('gregtech:meta_item_1', 236), ore('gemExquisiteRuby'), item('gregtech:meta_item_1', 236)],[ore('circuitIv'), item('gregtech:mte', 990), ore('circuitIv')], [ore('cableGtSingleTungsten'), item('gregtech:meta_item_1:32528'), ore('cableGtSingleTungsten')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32708'), [[item('gregtech:meta_item_1', 236), ore('gemExquisiteRuby'), item('gregtech:meta_item_1', 236)],[ore('circuitIv'), item('gregtech:mte', 990), ore('circuitIv')], [ore('cableGtSingleTungsten'), item('gregtech:meta_item_1:32527'), ore('cableGtSingleTungsten')]]);
// crafting.addShaped(item('gregtech:meta_item_2:32708'), [[item('gregtech:meta_item_1', 236), ore('gemExquisiteRuby'), item('gregtech:meta_item_1', 236)],[ore('circuitIv'), item('gregtech:mte', 990), ore('circuitIv')], [ore('cableGtSingleTungsten'), item('gregtech:meta_item_1:32529'), ore('cableGtSingleTungsten')]]);
// crafting.addShaped(item('gregtech:meta_item_1:32752'), [[item('gregtech:meta_item_1:32693'), ore('gemExquisiteDiamond'), item('gregtech:meta_item_1:32693')],[ore('circuitEv'), metaitem('hull.ev'), ore('circuitEv')], [ore('cableGtSingleAluminium'), item('gregtech:meta_item_1:32517'), ore('cableGtSingleAluminium')]]);
// crafting.addShaped(item('gregtech:meta_item_1:32752'), [[item('gregtech:meta_item_1:32693'), ore('gemExquisiteDiamond'), item('gregtech:meta_item_1:32693')],[ore('circuitEv'), metaitem('hull.ev'), ore('circuitEv')], [ore('cableGtSingleAluminium'), item('gregtech:meta_item_1:32518'), ore('cableGtSingleAluminium')]]);
// crafting.addShaped(item('gregtech:meta_item_1:32752'), [[item('gregtech:meta_item_1:32693'), ore('gemExquisiteDiamond'), item('gregtech:meta_item_1:32693')],[ore('circuitEv'), metaitem('hull.ev'), ore('circuitEv')], [ore('cableGtSingleAluminium'), item('gregtech:meta_item_1:32519'), ore('cableGtSingleAluminium')]]);
// 
// //EV/IV motors
// crafting.removeByOutput(item('gregtech:meta_item_1:32604'));
// crafting.removeByOutput(item('gregtech:meta_item_1:32603'));
// 
// crafting.addShaped(item('gregtech:meta_item_1:32604'), [[ore('cableGtSingleTungsten'), ore('wireGtQuadrupleBrightSteel'), ore('stickTungstenSteel')],[ore('wireGtQuadrupleBrightSteel'), ore('stickNeodymiumMagnetic'), ore('wireGtQuadrupleBrightSteel')], [ore('stickTungstenSteel'), ore('wireGtQuadrupleBrightSteel'), ore('cableGtSingleTungsten')]]);
// crafting.addShaped(item('gregtech:meta_item_1:32603'), [[ore('cableGtSingleAluminium'), ore('wireGtQuadrupleGold'), ore('stickTitanium')],[ore('wireGtQuadrupleGold'), ore('stickNeodymiumMagnetic'), ore('wireGtQuadrupleGold')], [ore('stickTitanium'), ore('wireGtQuadrupleGold'), ore('cableGtSingleAluminium')]]);
// 
// 
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1:32603')], [], true);
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1:32604')], [], true);
// 
// Utils.removeRecipeByOutput(assembly_line, [item('gregtech:meta_item_1:32603') * 16], [], true);
// Utils.removeRecipeByOutput(assembly_line, [item('gregtech:meta_item_1:32604') * 16], [], true);
// 
// assembler.recipeBuilder()
//     .inputs(ore('stickNeodymiumMagnetic'),ore('stickTitanium') * 2, ore('cableGtSingleAluminium') * 2, ore('wireGtQuadrupleGold') * 4) 
//     .outputs(item('gregtech:meta_item_1:32603'))
//     .duration(100)
//     .EUt(1920)
//     .buildAndRegister();
// 
// assembler.recipeBuilder()
//     .inputs(ore('stickNeodymiumMagnetic'),ore('stickTungstenSteel')* 2,ore('cableGtSingleTungsten') * 2,ore('wireGtQuadrupleBrightSteel') * 4)
//     .outputs(item('gregtech:meta_item_1:32604'))
//     .duration(100)
//     .EUt(7680)
//     .buildAndRegister();
// 
// assembly_line.recipeBuilder()
//     .inputs(item('gtadditions:ga_meta_item:2072') * 16, item('gtadditions:ga_meta_item:2072') * 16,item('gtadditions:ga_meta_item:2072') * 16,item('gtadditions:ga_meta_item:2072') * 16,ore('cableGtSingleAluminium') * 4, ore('cableGtSingleAluminium') * 4, ore('cableGtSingleAluminium') * 4, ore('cableGtSingleAluminium') * 4, ore('stickLongTitanium') * 4,ore('stickLongNeodymiumMagnetic') * 4)
//     .outputs(item('gregtech:meta_item_1:32603') * 16)
//     .fluidInputs(fluid('gold') * 1152)
//     .duration(6000)
//     .EUt(64000)
//     .buildAndRegister();
// 
// assembly_line.recipeBuilder()
//     .inputs(item('gtadditions:ga_meta_item:2235') * 16, item('gtadditions:ga_meta_item:2235') * 16, item('gtadditions:ga_meta_item:2235') * 16, item('gtadditions:ga_meta_item:2235') * 16, ore('cableGtSingleTungsten') * 4, ore('cableGtSingleTungsten') * 4, ore('cableGtSingleTungsten') * 4, ore('cableGtSingleTungsten') * 4, ore('stickLongTungstenSteel') * 4, ore('stickLongNeodymiumMagnetic') * 4)
//     .outputs(item('gregtech:meta_item_1:32604') * 16)
//     .fluidInputs(fluid('bright_steel') * 1152)
//     .duration(6000)
//     .EUt(128000)
//     .buildAndRegister();
// 
// Utils.removeRecipeByOutput(gas_centrifuge, [], [fluid('titanium50_tetrafluoride') * 518 ,fluid('fluorine') * 9482], true);
// 
// 
// gas_centrifuge.recipeBuilder()
//     .fluidInputs(fluid('titanium_tetrafluoride') * 10000)
//     .fluidOutputs(fluid('titanium50_tetrafluoride') * 518 , fluid('titanium_tetrafluoride')* 9482)
//     .duration(210)
//     .EUt(30720)
//     .buildAndRegister();
// 
// crafting.removeByOutput(item('minecraft:golden_apple', 1));
// 
// mixer.recipeBuilder()
//     .inputs(ore('dustEuropium'), ore('dustCaesium') * 2, ore('dustSteel') * 4,ore('dustBismuth') * 2)
//     .outputs(ore('dustBrightSteel') * 9)
//     .duration(400)
//     .EUt(16)
//     .buildAndRegister();
// 
// largeMix.recipeBuilder()
//     .inputs(ore('dustEuropium'), ore('dustCaesium') * 2, ore('dustSteel') * 4,ore('dustBismuth') * 2)
//     .outputs(ore('dustBrightSteel') * 9)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 4}))
//     .duration(400)
//     .EUt(16)
//     .buildAndRegister();
// 
// var removals = [item('gtadditions:ga_machine_casing', 3),item('gregtech:machine_casing', 11)] as IItemStack[];
// for i in removals{
// Utils.removeRecipeByOutput(assembler, [i], [], true);
// crafting.removeByOutput(i);
// }
// 
// var removals2 = [item('gregtech:mte', 997),item('gregtech:machine:3242'),item('gregtech:mte', 996)] as IItemStack[];
// for i in removals2{
// crafting.removeByOutput(i);
// }
// 
// Utils.removeRecipeByOutput(assembler, [item('gregtech:machine', 509)], [], true);
// 
// 
// crafting.addShaped(item('gregtech:machine_casing', 14), [[ore('plateNeutronium'), ore('plateNeutronium'), ore('plateNeutronium')],[ore('plateNeutronium'), ore('GTWrench'), ore('plateNeutronium')], [ore('plateNeutronium'), ore('plateNeutronium'), ore('plateNeutronium')]]);
// crafting.addShaped(item('gregtech:machine_casing', 12), [[ore('plateHeavyQuarkDegenerateMatter'), ore('plateHeavyQuarkDegenerateMatter'), ore('plateHeavyQuarkDegenerateMatter')],[ore('plateHeavyQuarkDegenerateMatter'), ore('GTWrench'), ore('plateHeavyQuarkDegenerateMatter')], [ore('plateHeavyQuarkDegenerateMatter'), ore('plateHeavyQuarkDegenerateMatter'), ore('plateHeavyQuarkDegenerateMatter')]]);
// crafting.addShaped(item('gtadditions:ga_machine_casing', 3), [[ore('plateVibranium'), ore('plateVibranium'), ore('plateVibranium')],[ore('plateVibranium'), ore('GTWrench'), ore('plateVibranium')], [ore('plateVibranium'), ore('plateVibranium'), ore('plateVibranium')]]);
// crafting.addShaped(item('gregtech:machine_casing', 11), [[ore('plateAdamantium'), ore('plateAdamantium'), ore('plateAdamantium')],[ore('plateAdamantium'), ore('GTWrench'), ore('plateAdamantium')], [ore('plateAdamantium'), ore('plateAdamantium'), ore('plateAdamantium')]]);
// 
// 
// assembler.recipeBuilder()
//     .inputs(ore('plateAdamantium') * 8)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 8}))
//     .outputs(item('gregtech:machine_casing', 11))
//     .duration(400)
//     .EUt(16)
//     .buildAndRegister();
// 
// assembler.recipeBuilder()
//     .inputs(ore('plateVibranium') * 8)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 8}))
//     .outputs(item('gtadditions:ga_machine_casing', 3))
//     .duration(400)
//     .EUt(16)
//     .buildAndRegister();
// 
// assembler.recipeBuilder()
//     .inputs(ore('plateHeavyQuarkDegenerateMatter') * 8)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 8}))
//     .outputs(item('gregtech:machine_casing', 12))
//     .duration(400)
//     .EUt(16)
//     .buildAndRegister();
// 
// assembler.recipeBuilder()
//     .inputs(ore('plateNeutronium') * 8)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 8}))
//     .outputs(item('gregtech:machine_casing', 14))
//     .duration(400)
//     .EUt(16)
//     .buildAndRegister();
// 
// //OpV
// assembler.recipeBuilder()
//     .inputs(item('gregtech:machine_casing', 12), ore('cableGtSingleNeutronium')* 2)
//     .outputs(item('gregtech:mte', 997))
//     .fluidInputs(fluid('fullerene_polymer_matrix') * 288)
//     .duration(400)
//     .EUt(16)
//     .buildAndRegister();
// //MAX
// assembler.recipeBuilder()
//     .inputs(item('gregtech:machine_casing', 14), ore('cableGtSingleCosmicNeutronium') * 2)
//     .outputs(item('gregtech:machine', 509))
//     .fluidInputs(fluid('fullerene_polymer_matrix') * 288)
//     .duration(400)
//     .EUt(16)
//     .buildAndRegister();
// //fix cosmic mesh and fabric
// 
// 
// Utils.removeRecipeByOutput(condenser, [metaitem('gcyl:cosmic.fabric')], [], true);
// Utils.removeRecipeByOutput(condenser, [metaitem('gcyl:cosmic.mesh')], [], true);
// 
// //facric
// condenser.recipeBuilder()
//     .inputs(item('gcyl:gcyl_meta_item', 567))
//     .notConsumable(item('gcyl:gcyl_meta_item', 562))
//     .outputs(metaitem('gcyl:cosmic.fabric'),metaitem('gcyl:time.dilation.containment.unit'))
//     .fluidInputs(fluid('xenon') * 500,fluid('superfluid_helium') * 24000)
//     .fluidOutputs(fluid('helium') * 24000)
//     .duration(500)
//     .EUt(10000000)
//     .buildAndRegister();
// 
// 
// //mesh
// condenser.recipeBuilder()
//     .inputs(item('gcyl:gcyl_meta_item', 567))
//     .notConsumable(item('gcyl:gcyl_meta_item', 431))
//     .outputs(metaitem('gcyl:cosmic.mesh'),metaitem('gcyl:time.dilation.containment.unit'))
//     .fluidInputs(fluid('superfluid_helium') * 24000)
//     .fluidOutputs(fluid('helium') * 24000)
//     .duration(500)
//     .EUt(10000000)
//     .buildAndRegister();
// 
// Utils.removeRecipeByOutput(assembler, [item('gcyl:gcyl_meta_item', 552)], [], true);
// Utils.removeRecipeByOutput(assembly_line, [metaitem('gcyl:time.dilation.containment.unit')], [], false);
// 
// 
// assembler.recipeBuilder()
//     .inputs(item('gregtech:meta_item_1', 241),metaitem('gcyl:qcd.protective.plating') * 2,item('gcyl:gcyl_meta_item', 511),item('gcyl:gcyl_meta_item', 516))
//     .outputs(item('gcyl:gcyl_meta_item', 552))
//     .fluidInputs(fluid('neutronium') * 144)
//     .duration(600)
//     .EUt(33550000)
//     .buildAndRegister();
// 
// assembly_line.recipeBuilder()
//     .inputs(ore('plateNeutronium') * 4,item('gcyl:gcyl_meta_item', 430) * 4, ore('plateFullerenePolymerMatrix') * 4, ore('plateQuantum') * 4, ore('stickEnrichedNaquadahAlloy')* 3, ore('wireGtSingleUhvSuperconductor') * 2, ore('circuitSuperconductor'))
//     .outputs(metaitem('gcyl:time.dilation.containment.unit') * 4)
//     .fluidInputs(fluid('tritanium') * 144)
//     .duration(100)
//     .EUt(800000)
//     .buildAndRegister();
// 
// item('gregtech:fusion_casing').addTooltip(format.darkRed("blacklisted from working in non-fusion multiblock machines"));
// item('gregtech:fusion_casing', 1).addTooltip(format.darkRed("blacklisted from working in non-fusion multiblock machines"));
// 
// crafting.removeByOutput(item('simplevoidworld:portal'));
// crafting.addShaped(item('simplevoidworld:portal'), [[ore('obsidian'), ore('gemDiamond'), ore('obsidian')],[ore('gemDiamond'), ore('toolPickaxe'), ore('gemDiamond')], [ore('obsidian'), ore('gemDiamond'), ore('obsidian')]]);
// 
// assembler.recipeBuilder()
//     .inputs(ore('circuitOpv') * 2, ore('gearQcdConfinedMatter') * 4, ore('plateQcdConfinedMatter') * 4,ore('cableGtQuadrupleNeutronium'))
//     .outputs(item('gtadditions:ga_multiblock_casing2', 4))
//     .fluidInputs(fluid('enriched_naquadah_alloy')* 288)
//     .duration(100)
//     .EUt(536870900)
//     .buildAndRegister();
// 
// assembler.recipeBuilder()
//     .inputs(ore('circuitMax') * 4, ore('gearNeutronium') * 4, ore('plateNeutronium') * 4, item('gregtech:cable:7521'))
//     .outputs(item('gtadditions:ga_multiblock_casing', 12))
//     .fluidInputs(fluid('chaos') * 288)
//     .duration(100)
//     .EUt(2147483647)
//     .buildAndRegister();
// 
// crafting.removeByOutput(item('ae2stuff:grower'));
// crafting.addShaped(item('ae2stuff:grower'), [[item('minecraft:glass'), ore('rotorTin'), item('minecraft:glass')],[ore('crystalFluix'), item('gregtech:meta_item_1:32600'), ore('crystalFluix')], [ore('cableGtSingleTin'), item('gregtech:mte', 986), ore('cableGtSingleTin')]]);
// 
// crafting.removeByOutput(item('gcyl:mte', 17));
// crafting.addShaped(item('gcyl:mte', 17), [[ore('circuitEv'), item('gregtech:fluid_pipe:3235'), ore('circuitEv')],[ore('gearTitanium'), item('gregtech:mte', 188), ore('gearTitanium')], [item('gregtech:meta_item_1:12981'), item('gregtech:meta_item_1:13981'), item('gregtech:meta_item_1:12981')]]);
// 
// 
// chemical_bath.recipeBuilder()
//     .inputs(ore('dustRegularBrightSteel') * 2)
//     .outputs(ore('dustAstralStarmetal') * 2)
//     .fluidInputs(fluid('astralsorcery.liquidstarlight') * 1000)
//     .duration(100)
//     .EUt(131072)
//     .buildAndRegister();
// 
// distillery.findRecipe(24, [item('gregtech:meta_item_1:32766').withNbt({Configuration: 2})], [fluid('oil_light') * 150]).remove();
// 
// Utils.removeRecipeByOutput(assembler, [item('gregtech:multiblock_casing') ], [], false);
// 
// assembler.recipeBuilder()
//     .inputs(item('gregtech:metal_casing', 6), ore('rotorTitanium') * 4, item('gregtech:fluid_pipe:2072') * 2)
//     .outputs(item('gregtech:multiblock_casing') * 2)
//     .duration(50)
//     .EUt(16)
//     .buildAndRegister();
// 
// blast_furnace.findRecipe(120, [ore('dustIridium'),ore('dustSalt'), ore('dustSalt')], [fluid('oxygen') * 2000]).remove();
// 
// 
// chemreactor.recipeBuilder()
//     .inputs(ore('dustIridium') * 2)
//     .notConsumable(ore('dustSalt'))
//     .outputs(ore('dustBismuthIridiate') * 11)
//     .fluidInputs(fluid('oxygen') * 4000, fluid('hydrogen') * 1000, fluid('bismuth_nitrate_solution') * 2000)
//     .fluidOutputs(fluid('nitrogen_dioxide') * 1000,fluid('nitric_acid') * 5000)
//     .duration(300)
//     .EUt(1920)
//     .buildAndRegister();
// large_chem.recipeBuilder()
//     .inputs(ore('dustIridium') * 2)
//     .notConsumable(ore('dustSalt'))
//     .outputs(ore('dustBismuthIridiate') * 11)
//     .fluidInputs(fluid('oxygen') * 4000, fluid('hydrogen') * 1000, fluid('bismuth_nitrate_solution') * 2000)
//     .fluidOutputs(fluid('nitrogen_dioxide') * 1000,fluid('nitric_acid') * 5000)
//     .duration(300)
//     .EUt(1920)
//     .buildAndRegister();
// 
// crafting.removeByOutput(item('randomthings:ingredient', 1));
// crafting.addShaped(item('randomthings:ingredient', 1), [[item('randomthings:stableenderpearl'), ore('foilStainlessSteel'), item('randomthings:stableenderpearl')],[ore('foilStainlessSteel'), ore('itemSkull'), ore('foilStainlessSteel')], [item('randomthings:stableenderpearl'), ore('foilStainlessSteel'), item('randomthings:stableenderpearl')]]);
// 
// centrifuge.findRecipe(640, [ore('dustNaquadahEnriched')], []).remove();
// large_centrifuge.findRecipe(640, [ore('dustNaquadahEnriched')], []).remove();
// 
// centrifuge.findRecipe(320, [ore('dustNaquadah')], []).remove();
// large_centrifuge.findRecipe(320, [ore('dustNaquadah')], []).remove();
// 
// Utils.removeRecipeByOutput(blast_furnace, [ore('ingotSilicon')], [], true);
// crafting.addShaped(item('minecraft:name_tag'), [[null, ore('cropFlax,string'), ore('cropFlax,string')],[null, ore('slimeball'), ore('cropFlax,string')], [ore('cropFlax,string'), null, null]]);
// 
// assembler.recipeBuilder()
//     .inputs(ore('chest,chestWood') * 4)
//     .outputs(item('gregtech:machine', 808) * 4)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 2}))
//     .duration(60)
//     .EUt(16)
//     .buildAndRegister();
// crafting.addShaped(item('gregtech:machine:4034'), [[null, null, null],[null, item('gregtech:mte', 997), ore('cableGtSingleNeutronium')], [null, null, null]]);
// crafting.addShaped(item('gregtech:machine:4029'), [[null, null, null],[ore('cableGtSingleNeutronium'), item('gregtech:mte', 997), null], [null, null, null]]);
// 
// crafting.removeByOutput(item('danknull:dank_null_1'));
// crafting.removeByOutput(item('danknull:dank_null_panel_1'));
// crafting.addShaped(item('danknull:dank_null_1'), [[item('danknull:dank_null_panel_1'), item('danknull:dank_null_panel_1'), item('danknull:dank_null_panel_1')],[item('danknull:dank_null_panel_1'), item('danknull:dank_null_0'), item('danknull:dank_null_panel_1')], [item('danknull:dank_null_panel_1'), item('danknull:dank_null_panel_1'), item('danknull:dank_null_panel_1')]]);
// crafting.addShaped(item('danknull:dank_null_panel_1'), [[ore('blockLapis'), ore('blockCoalCoke'), ore('blockLapis')],[ore('blockCoalCoke'), item('gtadditions:ga_transparent_casing', 1), ore('blockCoalCoke')], [ore('blockLapis'), ore('blockCoalCoke'), ore('blockLapis')]]);
// 
// large_chem.recipeBuilder()
//     .inputs(item('gtadditions:ga_dust', 922) * 4)
//     .fluidInputs(fluid('fuming_nitric_acid') * 2000)
//     .notConsumable(fluid('acetic_anhydride'))
//     .outputs(item('gtadditions:ga_dust', 530) * 1)
//     .EUt(1024)
//     .duration(20)
//     .buildAndRegister();
// 
// 
// 
// large_chem.recipeBuilder()
//     .inputs([ore('dustTinySodiumHydroxide')])
//     .fluidInputs( fluid('creosote') * 10000, fluid(' ethanol') * 1000)
//         .fluidOutputs(fluid(' bio_diesel') * 10000, fluid(' glycerol') * 1000)
//     .duration(120)
//     .EUt(30)
//     .buildAndRegister();
// 
// large_chem.recipeBuilder()
//     .inputs([ore('dustTinySodiumHydroxide')])
//     .fluidInputs( fluid('creosote')* 10000, fluid(' methanol') * 1000)
//     .fluidOutputs(fluid(' bio_diesel') * 10000, fluid(' glycerol') * 1000)
//     .duration(120)
//     .EUt(30)
//     .buildAndRegister();
// //update vacuume tube
// crafting.removeByOutput(ore('circuitUlv'));
// crafting.addShaped(ore('circuitUlv'), [[null, item('gregtech:meta_item_1', 517), null],[null, item('gregtech:meta_item_1:16018'), null], [ore('stickWroughtIron'), null, ore('stickWroughtIron')]]);
// crafting.removeByOutput(item('gregtech:meta_item_1', 502));
// 
// 
// chemreactor.recipeBuilder()
//     .inputs([ore('wool') * 5])
//     .fluidInputs(fluid('glue') * 144,fluid('plastic') * 144)
//     .outputs([item('gregtech:meta_item_1', 502) * 10])
//     .duration(160)
//     .EUt(14)
//     .buildAndRegister();
// 
// 
// large_chem.recipeBuilder()
//     .inputs([ore('wool') * 5])
//     .fluidInputs(fluid('glue') * 144,fluid('plastic') * 144)
//     .outputs([item('gregtech:meta_item_1', 502) * 10])
//     .duration(160)
//     .EUt(14)
//     .buildAndRegister();
// 
// green_house.recipeBuilder()
//     .notConsumable(item('randomthings:glowingmushroom'))
//     .inputs(ore('dustBone,dye,dyeWhite'))
//     .fluidInputs(fluid('water') * 2000)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 1}))
//     .outputs([item('randomthings:glowingmushroom')])
//     .duration(160)
//     .EUt(14)
//     .buildAndRegister();
// 
// green_house.recipeBuilder()
//     .notConsumable(item('randomthings:glowingmushroom'))
//     .inputs(ore('dustOrganicFertilizer'))
//     .fluidInputs(fluid('water') * 2000)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 2}))
//     .outputs([item('randomthings:glowingmushroom') * 2])
//     .duration(160)
//     .EUt(14)
//     .buildAndRegister();
// 
// 
// green_house.recipeBuilder()
//     .inputs(item('minecraft:brown_mushroom'), ore('dustGlowstone'))
//     .fluidInputs(fluid('water') * 2000)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 3}))
//     .outputs([item('randomthings:glowingmushroom')])
//     .duration(160)
//     .EUt(14)
//     .buildAndRegister();
// 
// green_house.recipeBuilder()
//     .inputs(item('minecraft:red_mushroom'), ore('dustGlowstone'))
//     .fluidInputs(fluid('water') * 2000)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 3}))
//     .outputs([item('randomthings:glowingmushroom')])
//     .duration(160)
//     .EUt(14)
//     .buildAndRegister();
// 
// Utils.removeRecipeByOutput(chemreactor, [], [fluid('indium_concentrate')], false);
// Utils.removeRecipeByOutput(large_chem, [], [fluid('indium_concentrate')], false);
// 
// largeMix.recipeBuilder()
//     .inputs([ore('sand') * 4,ore('gravel') * 4])
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 3}))
//     .fluidInputs(fluid('water') * 1000)
//     .outputs([ore('itemBinderComposite') * 16])
//     .EUt(500)
//     .duration(80)
//     .buildAndRegister();
// 
// Utils.removeRecipeByOutput(assembler, [item('gregtech:mte', 993)], [], true);
// 
// assembler.recipeBuilder()
//     .inputs([ore('cableGtSingleNaquadahAlloy') * 2, item('gregtech:machine_casing', 8)])
//     .outputs(item('gregtech:mte', 993))
//     .fluidInputs(fluid('polybenzimidazole')* 288)
//     .duration(50)
//     .EUt(16)
//     .buildAndRegister();
// 
// 
// large_chem.recipeBuilder()
// .inputs(item('actuallyadditions:item_misc', 23) * 8)
// .fluidInputs(fluid('refinedcanolaoil') * 10000)
// .fluidOutputs( fluid('crystaloil') * 10000)
// .duration(300)
// .EUt(16)
// .buildAndRegister();
// 
// large_chem.recipeBuilder()
// .fluidInputs(fluid('crystaloil') * 5000, fluid(' creosote') * 5000)
// .fluidOutputs( fluid('empoweredoil') * 10000)
// .duration(300)
// .EUt(16)
// .buildAndRegister();
// 
// large_chem.recipeBuilder()
// .inputs([ore('dustTinySodiumHydroxide')])
// .fluidInputs( fluid('empoweredoil') * 10000, fluid(' ethanol') * 1000)
// .fluidOutputs(fluid(' bio_diesel') * 10000, fluid(' glycerol') * 1000)
// .duration(120)
// .EUt(30)
// .buildAndRegister();
// 
// large_chem.recipeBuilder()
// .inputs([ore('dustTinySodiumHydroxide')])
// .fluidInputs( fluid('empoweredoil')* 10000, fluid(' methanol') * 1000)
// .fluidOutputs(fluid(' bio_diesel') * 10000, fluid(' glycerol') * 1000)
// .duration(120)
// .EUt(30)
// .buildAndRegister();
// 
// chemreactor.recipeBuilder()
//     .inputs([ore('wool') * 5])
//     .fluidInputs(fluid('glue') * 144,fluid('polytetrafluoroethylene') * 144)
//     .outputs([item('gregtech:meta_item_1', 502) * 20])
//     .duration(160)
//     .EUt(116)
//     .buildAndRegister();
// 
// 
// large_chem.recipeBuilder()
//     .inputs([ore('wool') * 5])
//     .fluidInputs(fluid('glue') * 144,fluid('polytetrafluoroethylene') * 144)
//     .outputs([item('gregtech:meta_item_1', 502) * 20])
//     .duration(160)
//     .EUt(116)
//     .buildAndRegister();
// 
// 
// chemreactor.recipeBuilder()
//     .inputs([ore('wool') * 5])
//     .fluidInputs(fluid('glue') * 144,fluid('polybenzimidazole') * 144)
//     .outputs([item('gregtech:meta_item_1', 502) * 40])
//     .duration(160)
//     .EUt(116)
//     .buildAndRegister();
// 
// 
// large_chem.recipeBuilder()
//     .inputs([ore('wool') * 5])
//     .fluidInputs(fluid('glue') * 144,fluid('polybenzimidazole') * 144)
//     .outputs([item('gregtech:meta_item_1', 502) * 40])
//     .duration(160)
//     .EUt(116)
//     .buildAndRegister();
// 
// crafting.addShaped(metaitem('tjceu:blockEternity'), [[metaitem('tjceu:ingotEternity'), metaitem('tjceu:ingotEternity'), metaitem('tjceu:ingotEternity')],[metaitem('tjceu:ingotEternity'), metaitem('tjceu:ingotEternity'), metaitem('tjceu:ingotEternity')], [metaitem('tjceu:ingotEternity'), metaitem('tjceu:ingotEternity'), metaitem('tjceu:ingotEternity')]]);
// crafting.addShapeless(metaitem('tjceu:ingotEternity') * 9, [metaitem('tjceu:blockEternity')]);
// 
// crafting.addShaped(ore('toolHoe').withNbt({Unbreakable: 1 as long, RepairCost: 1, display: {Name: "Unbreakable Emerald Tipped Diamond Hoe"}}), [[ore('gemEmerald'), ore('gemEmerald'), null],[ore('gemEmerald'), ore('toolHoe'), null], [null, null, null]]);
// mods.jei.JEI.addItem(ore('toolHoe').withNbt({display:{Name: "Unbreakable Emerald Tipped Diamond Hoe"}}));
// 
// blast_alloy.recipeBuilder()
//     .inputs([ore('dustSeaborgium') * 4])
//     .inputs([ore('dustBohrium') * 4])
//     .blastFurnaceTemp(11200)
//     .fluidOutputs(fluid('fusion1') * 1152)
//     .duration(160)
//     .EUt(1000000)
//     .buildAndRegister();
// 
// blast_alloy.recipeBuilder()
//     .inputs([ore('dustRutherfordium') * 4])
//     .blastFurnaceTemp(11200)
//     .inputs([ore('dustDubnium') * 4])
//     .fluidOutputs(fluid('fusion2') * 1152)
//     .duration(160)
//     .EUt(1000000)
//     .buildAndRegister();
// 
// Utils.removeRecipeByOutput(blast_alloy, [], [fluid('superheavy_mix') * 4000], false);
// //blast_alloy.findRecipe(25000000, [ore('dustRutherfordium'), ore('dustDubnium'), ore('dustSeaborgium'), ore('dustBohrium'), ])
// 
// ADVFusion.recipeBuilder()
//     .fluidInputs(fluid('fusion1') * 288, fluid('fusion2') * 288)//,fluid('lead_bismuth_eutatic') * 7440)
//     .fluidOutputs(fluid('superheavy_mix') * 1000)//, fluid('supercritical_lead_bismuth_eutectic') * 7440)
//     .EUToStart(10000000000)
//     .AdvCoilTier(4)
//     .EUReturn(75)
//     .duration(50)
//     .EUt(4000000)
//     .buildAndRegister();
// 
// Utils.removeRecipeByOutput(assembly_line, [ore('circuitUiv')], [], false);
// 
// 
// assembly_line.recipeBuilder()
//     .inputs([item('gcyl:gcyl_meta_item', 426) * 64, item('gcyl:gcyl_meta_item', 603) * 32, item('gcyl:gcyl_meta_item', 602) * 32, item('gcyl:gcyl_meta_item', 604) * 32, item('gcyl:gcyl_meta_item', 601) * 32, ore('foilZylon') * 32, item('gregtech:meta_item_1', 606) * 32, ore('wireGtSingleUevSuperconductor') * 16, item('gcyl:gcyl_meta_item', 595) * 8, ore('circuitUev') * 4, ore('plateAwakenDraconium') * 4])
//     .fluidInputs(fluid('polyetheretherketone') * 2592, fluid('vibranium') * 288, fluid('enriched_naquadah_alloy') * 1296, fluid('trinium_titanium') * 576)
//     .outputs(ore('circuitUiv'))
//     .property("qubit", 2)
//     .duration(300)
//     .EUt(4000000)
//     .buildAndRegister();
// 
// 
// //capacitor recipes
// crafting.addShaped(ore('componentCapacitor') * 4, [[ore('foilAluminium'), ore('foilAluminium'), ore('foilAluminium')],[ore('foilAluminium'), ore('foilAluminium'), ore('foilAluminium')], [ore('wireGtSingleTin'), null, ore('wireGtSingleTin')]]);
// 
// Utils.removeRecipeByOutput(assembler, [ore('componentCapacitor') * 2], [], false);
// 
// assembler.recipeBuilder()
// .inputs([ore('foilAluminium') * 4,ore('platePlastic') * 1])
// .outputs([ore('componentCapacitor') * 12])
// .duration(80)
// .EUt(16)
// .buildAndRegister();
// 
// //new electronic circuit recipe
// /*
// Utils.removeRecipeByOutput(circuit_assembler, [item('gregtech:meta_item_2:32488')], [], false);
// 
// circuit_assembler.recipeBuilder()
// .inputs([ore('componentResistor') * 8,ore('componentCapacitor') * 4, ore('wireFineCopper') * 4, item('gtadditions:ga_meta_item:32030')])
// .fluidInputs(fluid('soldering_alloy') * 50)
// .outputs([item('gregtech:meta_item_2:32488') * 1])
// .duration(100)
// .EUt(16)
// .buildAndRegister();
// 
// circuit_assembler.recipeBuilder()
// .inputs([item('gcyl:gcyl_meta_item', 241) * 2,item('gcyl:gcyl_meta_item', 242) * 2, ore('wireFineCopper') * 4, item('gtadditions:ga_meta_item:32030')])
// .fluidInputs(fluid('soldering_alloy') * 50)
// .outputs([item('gregtech:meta_item_2:32488') * 1])
// .duration(100)
// .EUt(16)
// .buildAndRegister();
// */
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotSilver') * 9])
// .outputs([item('gregtech:meta_block_compressed_3', 14) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotPlatinum') * 9])
// .outputs([item('gregtech:meta_block_compressed_3', 3) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotEnderium') * 9])
// .outputs([ore('blockEnderium') * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotLead') * 9])
// .outputs([item('gregtech:meta_block_compressed_2', 3) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotBronze') * 9])
// .outputs([ore('lampGtGray') * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotSilicon') * 9])
// .outputs([ore('blockSilicon') * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotCopper') * 9])
// .outputs([item('gregtech:meta_block_compressed_1', 2) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotTin') * 9])
// .outputs([item('gregtech:meta_block_compressed_4', 7) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotNickel') * 9])
// .outputs([item('gregtech:meta_block_compressed_2', 12) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotInvar') * 9])
// .outputs([item('gregtech:meta_block_compressed_7', 14) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotElectrum') * 9])
// .outputs([item('gregtech:meta_block_compressed_7') * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// //block fixes
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotSilver') * 9])
// .outputs([item('gregtech:meta_block_compressed_3', 14) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotPlatinum') * 9])
// .outputs([item('gregtech:meta_block_compressed_3', 3) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotEnderium') * 9])
// .outputs([ore('blockEnderium') * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotLead') * 9])
// .outputs([item('gregtech:meta_block_compressed_2', 3) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotBronze') * 9])
// .outputs([ore('lampGtGray') * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotSilicon') * 9])
// .outputs([ore('blockSilicon') * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotCopper') * 9])
// .outputs([item('gregtech:meta_block_compressed_1', 2) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotTin') * 9])
// .outputs([item('gregtech:meta_block_compressed_4', 7) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotNickel') * 9])
// .outputs([item('gregtech:meta_block_compressed_2', 12) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotInvar') * 9])
// .outputs([item('gregtech:meta_block_compressed_7', 14) * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// compressor.recipeBuilder()
// .inputs([ore('ingotElectrum') * 9])
// .outputs([item('gregtech:meta_block_compressed_7') * 1])
// .duration(400)
// .EUt(2)
// .buildAndRegister();
// 
// Utils.removeRecipeByOutput(ADVFusion, [], [fluid('neutronium') * 1296], false);
// 
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1:32670')], [], false);
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1:32671')], [], false);
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1:32672')], [], false);
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1:32673')], [], false);
// Utils.removeRecipeByOutput(assembler, [item('gregtech:meta_item_1', 206)], [], false);
// 
// crafting.removeByOutput(item('gregtech:meta_item_1:32670'));
// crafting.removeByOutput(item('gregtech:meta_item_1:32671'));
// crafting.removeByOutput(item('gregtech:meta_item_1:32672'));
// crafting.removeByOutput(item('gregtech:meta_item_1:32673'));
// crafting.removeByOutput(item('gregtech:meta_item_1', 206));
// 
// 
// //lv
// assembler.recipeBuilder()
//     .inputs([ore('circuitBasic'),ore('dustEnderPearl')])
//     .outputs(item('gregtech:meta_item_1:32670'))
//     .fluidInputs(fluid('lv_superconductor_base') * 288)
//     .duration(100)
//     .EUt(30)
//     .buildAndRegister();
// //mv
// assembler.recipeBuilder()
//     .inputs([ore('circuitGood') * 4, ore('dustEnderEye')])
//     .outputs(item('gregtech:meta_item_1:32671'))
//     .fluidInputs(fluid('mv_superconductor_base') * 576)
//     .duration(100)
//     .EUt(120)
//     .buildAndRegister();
// //hv
// assembler.recipeBuilder()
//     .inputs([ore('circuitHv') * 4, item('gregtech:meta_item_1:32724')])
//     .outputs(item('gregtech:meta_item_1:32672'))
//     .fluidInputs(fluid('hv_superconductor_base') * 1152)
//     .duration(100)
//     .EUt(480)
//     .buildAndRegister();
// //EV
// assembler.recipeBuilder()
//     .inputs([ore('circuitEv') * 4, ore('dustNetherStar')])
//     .outputs(item('gregtech:meta_item_1:32673'))
//     .fluidInputs(fluid('ev_superconductor_base') * 2304)
//     .duration(100)
//     .EUt(1920)
//     .buildAndRegister();
// //IV
// assembler.recipeBuilder()
//     .inputs([ore('circuitIv') * 4, item('gregtech:meta_item_1:32725')])
//     .outputs(item('gregtech:meta_item_1', 206))
//     .fluidInputs(fluid('iv_superconductor_base') * 4608)
//     .duration(100)
//     .EUt(7680)
//     .buildAndRegister();
// 
// crafting.addShaped(item('gregtech:meta_item_1', 206), [[ore('wireGtHexIvSuperconductorBase'), ore('circuitIv'), ore('wireGtHexIvSuperconductorBase')],[ore('circuitIv'), item('gregtech:meta_item_1:32725'), ore('circuitIv')], [ore('wireGtHexIvSuperconductorBase'), ore('circuitIv'), ore('wireGtHexIvSuperconductorBase')]]);
// crafting.addShaped(item('gregtech:meta_item_1:32673'), [[ore('wireGtOctalEvSuperconductorBase'), ore('circuitEv'), ore('wireGtOctalEvSuperconductorBase')],[ore('circuitEv'), ore('gemNetherStar,netherStar'), ore('circuitEv')], [ore('wireGtOctalEvSuperconductorBase'), ore('circuitEv'), ore('wireGtOctalEvSuperconductorBase')]]);
// crafting.addShaped(item('gregtech:meta_item_1:32672'), [[ore('wireGtQuadrupleHvSuperconductorBase'), ore('circuitHv'), ore('wireGtQuadrupleHvSuperconductorBase')],[ore('circuitHv'), item('gregtech:meta_item_1:32724'), ore('circuitHv')], [ore('wireGtQuadrupleHvSuperconductorBase'), ore('circuitHv'), ore('wireGtQuadrupleHvSuperconductorBase')]]);
// crafting.addShaped(item('gregtech:meta_item_1:32671'), [[ore('wireGtDoubleMvSuperconductorBase'), ore('circuitGood'), ore('wireGtDoubleMvSuperconductorBase')],[ore('circuitGood'), ore('pearlEnderEye'), ore('circuitGood')], [ore('wireGtDoubleMvSuperconductorBase'), ore('circuitGood'), ore('wireGtDoubleMvSuperconductorBase')]]);
// crafting.addShaped(item('gregtech:meta_item_1:32670'), [[item('gregtech:cable', 516), ore('circuitBasic'), item('gregtech:cable', 516)],[ore('circuitBasic'), ore('enderpearl'), ore('circuitBasic')], [item('gregtech:cable', 516), ore('circuitBasic'), item('gregtech:cable', 516)]]);
// 
// Utils.removeRecipeByOutput(largeMix, [ore('dustNiobiumNitride') * 2], [], true);
// 
// largeMix.recipeBuilder()
//     .inputs([ore('dustNiobium')])
//     .outputs(ore('dustNiobiumNitride') * 2)
//     .fluidInputs(fluid('nitrogen') * 1000)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 1}))
//     .duration(108)
//     .EUt(30)
//     .buildAndRegister();
// 
// Utils.removeRecipeByOutput(largeMix, [ore('dustNichrome') * 5], [], true);
// 
// largeMix.recipeBuilder()
//     .inputs([ore('dustChrome'), ore('dustNickel') * 4])
//     .outputs(ore('dustNichrome') * 5)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 11}))
//     .duration(280)
//     .EUt(30)
//     .buildAndRegister();
// 
// condenser.recipeBuilder()
//     .fluidInputs(fluid('plasma.helium3') * 1000,fluid('superfluid_helium') * 100)
//     .fluidOutputs(fluid('helium') * 100,fluid('helium3') * 1000)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 1}))
//     .duration(40)
//     .EUt(960)
//     .buildAndRegister();
// 
// largeMix.recipeBuilder()
//     .inputs([ore('dustCopper') *3,ore('dustSilver') ])
//     .fluidInputs(fluid('redstone') * 1000)
//     .outputs([ore('dustSignalum') * 4])
//     .duration(240)
//     .EUt(500)
//     .buildAndRegister();
// 
// //steel
// assembler.recipeBuilder()
//     .inputs([ore('plateSteel') * 4,ore('frameGtSteel'),ore('gearSteel') * 2])
//     .outputs(item('gregtech:turbine_casing', 1))
//     .duration(200)
//     .EUt(30)
//     .buildAndRegister();
// //ti
// assembler.recipeBuilder()
//     .inputs([ore('plateSteel') * 4,item('gregtech:frame_titanium'),ore('gearTitanium') * 2])
//     .outputs(item('gregtech:turbine_casing', 2) * 3)
//     .duration(200)
//     .EUt(30)
//     .buildAndRegister();
// 
// Utils.removeRecipeByOutput(assembly_line, [ore('dustNiobiumNitride') * 2], [], true);
// Utils.removeRecipeByOutput(assembly_line, [item('gregtech:meta_item_1:32670') * 16], [], true);
// 
// assembly_line.recipeBuilder()
//     .inputs([ore('ingotSolderingAlloy') * 2, ore('circuitBasic') * 8 , ore('dustEnderPearl') * 4])
//     .outputs(item('gregtech:meta_item_1:32670') * 16)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 1}))
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 2}))
//     .duration(6000)
//     .EUt(8000)
//     .buildAndRegister();
// ore('gemQuartzBlack').addTooltip("Smelt Quartzite dust twice");
// ore('dustQuartzBlack').addTooltip("Smelt Quartzite dust");
// 
// ore('bookEnchanted,craftingBook').withNbt({StoredEnchantments: [{lvl: 1 as short, id: 13 as short}]}).addTooltip("§4DO NOT STACK THESE IN THE ANVIL IT WILL VOID YOUR BOOKS");
// 
// 
// Utils.removeRecipeByOutput(engraver, [item('gregtech:meta_item_1', 566)], [], true);
// Utils.removeRecipeByOutput(large_engrav, [item('gregtech:meta_item_1', 566)], [], true);
// 
// engraver.recipeBuilder()
//     .inputs([metaitem('wafer.silicon')])
//     .outputs(item('gregtech:meta_item_1', 566))
//     .notConsumable(ore('craftingLensWhite'))
//     .duration(45*20)
//     .EUt(18)
//     .buildAndRegister();
// 
// large_engrav.recipeBuilder()
//     .inputs([metaitem('wafer.silicon')])
//     .outputs(item('gregtech:meta_item_1', 566))
//     .notConsumable(ore('craftingLensWhite'))
//     .duration(45*20)
//     .EUt(18)
//     .buildAndRegister();
// 
// Utils.removeRecipeByOutput(forming, [item('gregtech:meta_item_2:15518')], [], true);
// 
// assembler.recipeBuilder()
//     .inputs([item('minecraft:iron_bars') *3, ore('plateIron') * 6])
//     .outputs(item('advancedrocketry:carbonscrubbercartridge'))
//     .duration(90)
//     .EUt(30)
//     .buildAndRegister();
//     
// crafting.removeByOutput(item('gregtech:machine:2552'));