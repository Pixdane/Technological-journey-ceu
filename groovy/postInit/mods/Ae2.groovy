// #ignoreBracketErrors
// 
// import crafttweaker.item.IItemDefinition;
// import crafttweaker.item.IItemStack;
// import crafttweaker.item.IIngredient;
// import crafttweaker.oredict.IOreDict;
// import crafttweaker.oredict.IOreDictEntry;
// import mods.gregtech.material.MaterialRegistry;
// import mods.gregtech.material.Material;
// import scripts.commonNames;
// import mods.gregtech.recipe.RecipeMap;
// import mods.appliedenergistics2.Inscriber;
// import mods.threng.Etcher as Etcher;
// import mods.threng.Aggregator;
// import crafttweaker.mods.IMod;
// import mods.jei.JEI.removeAndHide as h;
// import mods.gtadditions.recipe.Utils;
// 
// Inscriber.removeRecipe(item('appliedenergistics2:material:20')); 
// Inscriber.removeRecipe(item('appliedenergistics2:material:24')); 
// Inscriber.removeRecipe(item('appliedenergistics2:material:23')); 
// Inscriber.removeRecipe(item('appliedenergistics2:material:22'));
// Inscriber.removeRecipe(item('appliedenergistics2:material:18'));
// Inscriber.removeRecipe(item('appliedenergistics2:material:17'));
// Inscriber.removeRecipe(item('appliedenergistics2:material:16'));
// Inscriber.removeRecipe(item('threng:material:2'));
// Inscriber.removeRecipe(item('appliedenergistics2:material:59'));
// 
// /*
// //Engineering Processor			
// Inscriber.addRecipe(item('appliedenergistics2:material:24'), item('gregtech:meta_item_2:32487'), false, item('appliedenergistics2:material:17'),item('appliedenergistics2:material:20'));	
// Inscriber.addRecipe(item('appliedenergistics2:material:24'), item('gregtech:meta_item_2:32488'), false, item('appliedenergistics2:material:17'),item('appliedenergistics2:material:20'));	
// Inscriber.addRecipe(item('appliedenergistics2:material:24'), ore('circuitLv'), false, item('appliedenergistics2:material:17'),item('appliedenergistics2:material:20'));			
// //Calculation Processor
// Inscriber.addRecipe(item('appliedenergistics2:material:23'), item('gregtech:meta_item_2:32487'), false, item('appliedenergistics2:material:16'),item('appliedenergistics2:material:20'));	
// Inscriber.addRecipe(item('appliedenergistics2:material:23'), item('gregtech:meta_item_2:32488'), false, item('appliedenergistics2:material:16'),item('appliedenergistics2:material:20'));	
// Inscriber.addRecipe(item('appliedenergistics2:material:23'), ore('circuitLv'), false, item('appliedenergistics2:material:16'),item('appliedenergistics2:material:20'));	
// //Logic Processor
// Inscriber.addRecipe(item('appliedenergistics2:material:22'), item('gregtech:meta_item_2:32487'), false, item('appliedenergistics2:material:18'),item('appliedenergistics2:material:20'));	
// Inscriber.addRecipe(item('appliedenergistics2:material:22'), item('gregtech:meta_item_2:32488'), false, item('appliedenergistics2:material:18'),item('appliedenergistics2:material:20'));	
// Inscriber.addRecipe(item('appliedenergistics2:material:22'), ore('circuitLv'), false, item('appliedenergistics2:material:18'),item('appliedenergistics2:material:20'));	
// */
// 
// autoclave.recipeBuilder()
//     .inputs([ore('crystalCertusQuartz,gemCertusQuartz')])
//     .fluidInputs(fluid('water') *250)
//     .outputs([ore('crystalCertusQuartz')])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
// autoclave.recipeBuilder()
//     .inputs([ore('gemQuartzite')])
//     .fluidInputs(fluid('water') *2000)
//     .outputs([ore('crystalCertusQuartz')])
//     .duration(160)
//     .EUt(120)
//     .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:part:16'),item('gregtech:meta_item_1:19152') * 4 ])
// .outputs([item('appliedenergistics2:part:36') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:part:16'), item('gregtech:meta_item_1:19141') * 2])
// .outputs([item('appliedenergistics2:part:36') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:part:16'), item('gregtech:meta_item_1:19411')])
// .outputs([item('appliedenergistics2:part:36') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:part:16'), ore('foilPolybenzimidazole')])
// .outputs([item('appliedenergistics2:part:36') * 6])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:part:16'), ore('foilPolyetheretherketone')])
// .outputs([item('appliedenergistics2:part:36') * 8])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// wiremill.recipeBuilder()
// .inputs([ore('crystalPureNetherQuartz')])
// .outputs([item('appliedenergistics2:part:140') * 6])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// wiremill.recipeBuilder()
// .inputs([ore('gemNetherQuartz,gemQuartz')])
// .outputs([item('appliedenergistics2:part:140') * 1])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// macerator.recipeBuilder()
// .inputs([item('appliedenergistics2:sky_stone_block:0')])
// .outputs([item('appliedenergistics2:material:45')])
// .duration(160)
// .EUt(28)
// .buildAndRegister();
// 
// macerator.recipeBuilder()
// .inputs([ore('crystalFluix')])
// .outputs([ore('dustFluix')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// Etcher.removeRecipe(item('appliedenergistics2:material:22'));
// Etcher.addRecipe(item('appliedenergistics2:material:22'), ore('dustRedstone'),ore('ingotGold'),ore('ingotSilicon'));
// Etcher.removeRecipe(item('appliedenergistics2:material:24'));
// Etcher.addRecipe(item('appliedenergistics2:material:24'), ore('dustRedstone'),ore('gemDiamond'),ore('ingotSilicon'));
// Etcher.removeRecipe(item('appliedenergistics2:material:23'));
// Etcher.addRecipe(item('appliedenergistics2:material:23'), ore('dustRedstone'),ore('crystalPureCertusQuartz'),ore('ingotSilicon'));
// Etcher.removeRecipe(item('threng:material:6'));
// Etcher.addRecipe(item('threng:material:6'), ore('dustRedstone'),item('threng:material:5'),ore('ingotSilicon'));
// Etcher.removeRecipe(item('threng:material:14'));
// Etcher.addRecipe(item('threng:material:14'), ore('dustRedstone'),item('threng:material:13'),ore('ingotSilicon'));
// 
// mixer.recipeBuilder()
// .inputs([ore('crystalCertusQuartz'),ore('dustRedstone')])
// .outputs([item('appliedenergistics2:material:1')])
// .duration(30)
// .EUt(30)
// .buildAndRegister();
// 
// largeMix.recipeBuilder()
// .inputs([ore('crystalCertusQuartz'),ore('dustRedstone')])
// .outputs([item('appliedenergistics2:material:1')])
// .duration(30)
// .EUt(30)
// .buildAndRegister();
// // crystals fix
// 
// //fluix
// autoclave.recipeBuilder()
// .inputs(item('appliedenergistics2:crystal_seed:1200'))
// .fluidInputs([fluid('water') * 1000])
// .outputs(ore('crystalPureFluix'))
// .duration(120)
// .EUt(30)
// .buildAndRegister();
// //nether
// autoclave.recipeBuilder()
// .inputs(item('appliedenergistics2:crystal_seed:600'))
// .fluidInputs([fluid('water') * 1000])
// .outputs(ore('crystalPureNetherQuartz'))
// .duration(120)
// .EUt(30)
// .buildAndRegister();
// //certus quartz
// autoclave.recipeBuilder()
// .inputs(item('appliedenergistics2:crystal_seed:0'))
// .fluidInputs([fluid('water') * 1000])
// .outputs(ore('crystalPureCertusQuartz'))
// .duration(120)
// .EUt(30)
// .buildAndRegister();
// 
//     recipes.remove(item('threng:material:1'));
//     recipes.addShaped(item('threng:material:1'),[[ore('dustFluix'),ore('dustFluix'),ore('dustCoal')],[ore('dustCoal'),ore('ingotSilicon'),null],[null,null,null]]);
//     Aggregator.removeRecipe(item('threng:material:1'));
//     Aggregator.addRecipe(item('threng:material:1'), ore('dustCoal'),ore('dustFluix'),ore('dustSilicon'));
//     recipes.remove(item('threng:material:9'));
//     recipes.addShaped(item('threng:material:9'),[[null,null,null],[item('threng:material:8'),ore('dustCoal'),item('threng:material:8')],[null,null,null]]);
// 
// assembler.recipeBuilder()
// .inputs([ore('ingotGold')])
// .notConsumable(item('appliedenergistics2:material:15'))
// .outputs([item('appliedenergistics2:material:18')])
// .duration(300)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([ore('gemDiamond')])
// .notConsumable(item('appliedenergistics2:material:14'))
// .outputs([item('appliedenergistics2:material:17')])
// .duration(300)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([ore('crystalCertusQuartz')])
// .notConsumable(item('appliedenergistics2:material:13'))
// .outputs([item('appliedenergistics2:material:16')])
// .duration(300)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([ore('ingotSilicon')])
// .notConsumable(item('appliedenergistics2:material:19'))
// .outputs([item('appliedenergistics2:material:20')])
// .duration(300)
// .EUt(30)
// .buildAndRegister();
// // processors
// assembler.recipeBuilder()
// .inputs([ore('circuitBasic'),item('appliedenergistics2:material:18'),item('appliedenergistics2:material:20')])
// .fluidInputs(fluid('plastic') * 144)
// .outputs([item('appliedenergistics2:material:22')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([ore('circuitBasic'),item('appliedenergistics2:material:17'),item('appliedenergistics2:material:20')])
// .fluidInputs(fluid('plastic') * 144)
// .outputs([item('appliedenergistics2:material:24')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([ore('circuitBasic'),item('appliedenergistics2:material:16'),item('appliedenergistics2:material:20')])
// .fluidInputs(fluid('plastic') * 144)
// .outputs([item('appliedenergistics2:material:23')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// 
// 
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:material:13'),item('appliedenergistics2:material:14'),item('appliedenergistics2:material:15'),item('appliedenergistics2:material:19'),item('appliedenergistics2:quartz_glass:0')* 2,item('threng:material:4'),item('appliedenergistics2:material:43'),item('gregtech:mte:990')])
// .outputs([item('threng:machine:2')])
// .duration(160)
// .EUt(7680)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:quartz_glass:0') * 4,item('gregtech:meta_item_1:32610') * 4,item('gregtech:mte:986')])
// .outputs([item('appliedenergistics2:fluid_interface:0') * 2])
// .duration(150)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:quartz_glass:0') * 4,item('gregtech:meta_item_1:32640') * 4,item('gregtech:mte:986')])
// .outputs([item('appliedenergistics2:interface:0') *2])
// .duration(150)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('threng:material:13'),ore('circuitBasic'),item('appliedenergistics2:material:20')])
// .fluidInputs(fluid('plastic') * 144)
// .outputs([item('threng:material:14')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('threng:material:5'),ore('circuitBasic'),item('appliedenergistics2:material:20')])
// .fluidInputs(fluid('plastic') * 144)
// .outputs([item('threng:material:6')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// //recipes.addShaped(item('threng:machine:0'), [[ore('blockHopper'), ore('blockHopper'), ore('blockHopper')],[ore('dustRedstone'), item('gregtech:mte:988'), ore('dustRedstone')], [item('appliedenergistics2:material:22'), item('ae2stuff:grower:0'), item('appliedenergistics2:material:22')]]);
// assembler.recipeBuilder()
// .inputs([ore('blockHopper') * 3,item('gregtech:mte:988'), item('appliedenergistics2:material:22') * 2, item('ae2stuff:grower:0')])
// .outputs([item('threng:machine:0')])
// .duration(160)
// .EUt(480)
// .buildAndRegister();
// //recipes.addShaped(item('threng:machine:3'), [[ore('ingotFluixSteel'), item('appliedenergistics2:material:24'), ore('ingotFluixSteel')],[item('appliedenergistics2:crafting_accelerator:0'), item('gregtech:mte:989'), item('appliedenergistics2:crafting_accelerator:0')], [ore('ingotFluixSteel'), item('appliedenergistics2:material:24'), ore('ingotFluixSteel')]]);
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:crafting_accelerator:0') *2, item('gregtech:mte:989'),ore('ingotFluixSteel') * 4])
// .outputs([item('threng:machine:3')])
// .duration(160)
// .EUt(1920)
// .buildAndRegister();
// recipes.addShaped(item('threng:material:2'), [[ore('dustCoal'), ore('dustCoal'), ore('dustCoal')],[ore('dustCoal'), ore('ingotIron'), ore('dustFluix')], [ore('dustFluix'), ore('dustFluix'), ore('dustFluix')]]);
// //recipes.addShaped(item('threng:machine:1'), [[ore('ingotFluixSteel'), item('appliedenergistics2:material:22'), ore('ingotFluixSteel')],[item('threng:material:4'),item('gregtech:mte:988'), item('threng:material:4')], [ore('ingotFluixSteel'), item('appliedenergistics2:material:22'), ore('ingotFluixSteel')]]);
// assembler.recipeBuilder()
// .inputs([item('threng:material:4'),item('gregtech:mte:989'),ore('ingotFluixSteel') * 5, item('appliedenergistics2:material:22') * 2])
// .outputs([item('threng:machine:1')])
// .duration(160)
// .EUt(1920)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('threng:material:4'),item('gregtech:mte:989'),ore('ingotFluixSteel') * 4, item('appliedenergistics2:part:280')])
// .outputs([item('threng:machine:4')])
// .duration(160)
// .EUt(1920)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('gregtech:mte:988'),ore('ingotFluixSteel') * 4,item('appliedenergistics2:dense_energy_cell:0'),item('appliedenergistics2:charger:0')])
// .outputs([item('threng:machine:5')])
// .duration(160)
// .EUt(1920)
// .buildAndRegister();
// recipes.addShaped(item('appliedenergistics2:energy_acceptor:0'), [[ore('plateSteel'), item('appliedenergistics2:quartz_glass:0'), ore('plateSteel')],[item('appliedenergistics2:quartz_glass:0'), item('gregtech:mte:986'), item('appliedenergistics2:quartz_glass:0')], [ore('plateSteel'), item('appliedenergistics2:quartz_glass:0'), ore('plateSteel')]]);
// 
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:quartz_glass:0') *4,ore('plateSteel') * 2,ore('circuitBasic')])
// .fluidInputs(fluid('plastic') * 144)
// .outputs([item('appliedenergistics2:material:52') * 8])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:quartz_glass:0') *8,ore('plateSteel') * 4,ore('circuitMv')])
// .fluidInputs(fluid('plastic') * 288)
// .outputs([item('appliedenergistics2:material:52') * 16])
// .duration(160)
// .EUt(120)
// .buildAndRegister();
// 
// mixer.recipeBuilder()
// .inputs([item('appliedenergistics2:material:1'),ore('dustRedstone'),item('gregtech:meta_item_1:2201')])
// .outputs([ore('crystalFluix') * 2])
// .duration(130)
// .EUt(30)
// .buildAndRegister();
// 
// largeMix.recipeBuilder()
// .inputs([item('appliedenergistics2:material:1'),ore('dustRedstone'),item('gregtech:meta_item_1:2201')])
// .outputs([ore('crystalFluix') * 2])
// .duration(130)
// .EUt(30)
// .buildAndRegister();
// 
// macerator.recipeBuilder()
// .inputs([ore('crystalCertusQuartz')])
// .outputs([item('gregtech:meta_item_1:2202')])
// .duration(130)
// .EUt(30)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([ore('crystalPureCertusQuartz')])
// .notConsumable(item('appliedenergistics2:material:13'))
// .outputs([item('appliedenergistics2:material:16')])
// .duration(300)
// .EUt(120)
// .buildAndRegister();
// //me drive parts]
// 
// //1k
// assembler.recipeBuilder()
// .inputs([ore('plateSteel') * 4,ore('circuitBasic'), ore('crystalCertusQuartz') * 4])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('appliedenergistics2:material:35')])
// .duration(300)
// .EUt(30)
// .buildAndRegister();
// //4k
// assembler.recipeBuilder()
// .inputs([ore('plateAluminium') * 4,ore('circuitGood'), ore('crystalCertusQuartz') * 4,item('appliedenergistics2:material:35') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('appliedenergistics2:material:36')])
// .duration(300)
// .EUt(120)
// .buildAndRegister();
// //16k
// assembler.recipeBuilder()
// .inputs([ore('plateStainlessSteel') * 4,ore('circuitAdvanced'), ore('crystalCertusQuartz') * 4,item('appliedenergistics2:material:36') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('appliedenergistics2:material:37')])
// .duration(300)
// .EUt(480)
// .buildAndRegister();
// //64k
// assembler.recipeBuilder()
// .inputs([ore('plateTitanium') * 4,ore('circuitExtreme'), ore('crystalCertusQuartz') * 4,item('appliedenergistics2:material:37') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('appliedenergistics2:material:38')])
// .duration(300)
// .EUt(1920)
// .buildAndRegister();
// 
// //1k
// assembler.recipeBuilder()
// .inputs([ore('plateSteel') * 4,ore('circuitBasic'), ore('crystalPureCertusQuartz') * 4])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('appliedenergistics2:material:35')])
// .duration(300)
// .EUt(30)
// .buildAndRegister();
// //4k
// assembler.recipeBuilder()
// .inputs([ore('plateAluminium') * 4,ore('circuitGood'), ore('crystalPureCertusQuartz') * 4,item('appliedenergistics2:material:35') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('appliedenergistics2:material:36')])
// .duration(300)
// .EUt(120)
// .buildAndRegister();
// //16k
// assembler.recipeBuilder()
// .inputs([ore('plateStainlessSteel') * 4,ore('circuitAdvanced'), ore('crystalPureCertusQuartz') * 4,item('appliedenergistics2:material:36') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('appliedenergistics2:material:37')])
// .duration(300)
// .EUt(480)
// .buildAndRegister();
// //64k
// assembler.recipeBuilder()
// .inputs([ore('plateTitanium') * 4,ore('circuitExtreme'), ore('crystalPureCertusQuartz') * 4,item('appliedenergistics2:material:37') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('appliedenergistics2:material:38')])
// .duration(300)
// .EUt(1920)
// .buildAndRegister();
// 
// //fluid drive parts
// //1k
// assembler.recipeBuilder()
// .inputs([ore('plateSteel') * 4,ore('circuitBasic'), ore('dyeBlue') * 4])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs([item('appliedenergistics2:material:54')])
// .duration(300)
// .EUt(30)
// .buildAndRegister();
// //4k
// assembler.recipeBuilder()
// .inputs([ore('plateAluminium') * 4,ore('circuitGood'), ore('dyeBlue') * 4,item('appliedenergistics2:material:54') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs([item('appliedenergistics2:material:55')])
// .duration(300)
// .EUt(120)
// .buildAndRegister();
// //16k
// assembler.recipeBuilder()
// .inputs([ore('plateStainlessSteel') * 4,ore('circuitAdvanced'),ore('dyeBlue') * 4,item('appliedenergistics2:material:55') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs([item('appliedenergistics2:material:56')])
// .duration(300)
// .EUt(480)
// .buildAndRegister();
// //64k
// assembler.recipeBuilder()
// .inputs([ore('plateTitanium') * 4,ore('circuitExtreme'), ore('dyeBlue') * 4,item('appliedenergistics2:material:56') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs([item('appliedenergistics2:material:57')])
// .duration(300)
// .EUt(1920)
// .buildAndRegister();
// 
// blast_furnace.recipeBuilder()
//     .inputs([ore('stone,stoneSmooth')])
//     .outputs(item('appliedenergistics2:sky_stone_block:0'))
//     .property("temperature", 900) //this is a minimal temperature at which the item will be smelted
//     .duration(40)
//     .EUt(30)
//     .buildAndRegister();
// 
// if (item('appliedenergistics2:controller:0') as bool) {
// recipes.remove(item('appliedenergistics2:quantum_ring:0'));
// recipes.remove(item('appliedenergistics2:controller:0'));
// assembler.recipeBuilder()
// .inputs([item('gregtech:mte:986'),ore('crystalPureFluix') * 4,ore('circuitBasic')])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 0}))
// .outputs([item('appliedenergistics2:controller:0')])
// .duration(300)
// .EUt(30)
// .buildAndRegister();
// assembler.recipeBuilder()
// .inputs([ore('itemConduitBinder') * 5,item('enderio:item_me_conduit:0') * 4])
// .outputs([item('enderio:item_me_conduit:1') * 4])
// .duration(150)
// .EUt(480)
// .buildAndRegister();
// }
// else{
// h(item('enderio:item_me_conduit:1'));
// }
// 
// 
// 
// 
// recipes.remove(item('appliedenergistics2:chest:0'));
// recipes.remove(item('appliedenergistics2:drive:0'));
// recipes.remove(item('appliedenergistics2:material:57'));
// recipes.remove(item('appliedenergistics2:material:56'));
// recipes.remove(item('appliedenergistics2:material:55'));
// recipes.remove(item('appliedenergistics2:material:54'));
// recipes.remove(item('appliedenergistics2:material:38'));
// recipes.remove(item('appliedenergistics2:material:37'));
// recipes.remove(item('appliedenergistics2:material:36'));
// recipes.remove(item('appliedenergistics2:material:35'));
// recipes.remove(item('appliedenergistics2:molecular_assembler:0'));
// recipes.remove(item('nae2:material:0'));
// recipes.remove(item('nae2:material:1'));
// recipes.remove(item('nae2:material:2'));
// recipes.remove(item('nae2:material:3'));
// recipes.remove(item('nae2:material:4'));
// recipes.remove(item('nae2:material:5'));
// recipes.remove(item('nae2:material:6'));
// recipes.remove(item('nae2:material:7'));
// recipes.remove(item('nae2:material:8'));
// recipes.remove(item('nae2:coprocessor_4x'));
// recipes.remove(item('nae2:coprocessor_16x'));
// recipes.remove(item('nae2:coprocessor_64x'));
// recipes.remove(item('nae2:part:0'));
// recipes.remove(item('nae2:upgrade:0'));
// recipes.remove(item('nae2:pattern_multiplier:0'));
// 
// recipes.addShaped(item('appliedenergistics2:chest:0'), [[item('actuallyadditions:block_giant_chest:0'), item('gregtech:machine:710'), item('actuallyadditions:block_giant_chest:0')],[item('gregtech:machine:710'), item('appliedenergistics2:material:24'), item('gregtech:machine:711')], [item('actuallyadditions:block_giant_chest:0'), item('gregtech:machine:711'), item('actuallyadditions:block_giant_chest:0')]]);
// recipes.addShaped(item('appliedenergistics2:drive:0'), [[item('gregtech:mte:986'), item('appliedenergistics2:material:24'), item('gregtech:mte:986')],[item('appliedenergistics2:part:16'),item('gregtech:meta_item_1:32680'), item('appliedenergistics2:part:16')], [item('gregtech:mte:986'), item('appliedenergistics2:material:24'), item('gregtech:mte:986')]]);
// recipes.addShaped(item('appliedenergistics2:molecular_assembler:0'), [[ore('workbench'), ore('circuitBasic'), ore('workbench')],[item('appliedenergistics2:material:43'), item('gregtech:mte:986'), item('appliedenergistics2:material:44')], [ore('workbench'), ore('circuitBasic'), ore('workbench')]]);
// 
// h(item('extracells:part.base:10'));
// h(item('extracells:part.base:11'));
// h(item('extracells:part.base:9'));
// h(item('extracells:part.base'));
// h(item('extracells:part.base:1'));
// h(item('extracells:part.base:8'));
// h(item('extracells:part.base:3'));
// h(item('extracells:part.base:4'));
// h(item('extracells:part.base:6'));
// h(item('extracells:part.base:7'));
// h(item('extracells:part.base:5'));
// h(item('extracells:part.base:2'));
// h(item('extracells:ecbaseblock'));
// h(item('extracells:fluidfiller:0'));
// h(item('extracells:hardmedrive:0'));
// h(item('extracells:vibrantchamberfluid:0'));
// h(item('extracells:terminal.universal.wireless:0'));
// h(item('extracells:terminal.fluid.wireless'));
// h(item('extracells:storage.component:0'));
// h(item('extracells:storage.component:1'));
// h(item('extracells:storage.component:2'));
// h(item('extracells:storage.component:3'));
// h(item('extracells:storage.component:4'));
// h(item('extracells:storage.component:5'));
// h(item('extracells:storage.component:6'));
// h(item('extracells:storage.component:7'));
// h(item('extracells:storage.component:8'));
// h(item('extracells:storage.component:9'));
// h(item('extracells:storage.component:10'));
// h(item('extracells:storage.fluid:0'));
// h(item('extracells:storage.fluid:1'));
// h(item('extracells:storage.fluid:2'));
// h(item('extracells:storage.fluid:3'));
// h(item('extracells:storage.fluid:4'));
// h(item('extracells:storage.fluid:5'));
// h(item('extracells:storage.fluid:6'));
// h(item('extracells:storage.physical:0'));
// h(item('extracells:storage.physical:1'));
// h(item('extracells:storage.physical:2'));
// h(item('extracells:storage.physical:3'));
// h(item('extracells:storage.casing:0'));
// h(item('extracells:storage.casing:1'));
// h(item('extracpus:crafting_storage_256k'));
// h(item('extracpus:crafting_storage_1024k'));
// h(item('extracpus:crafting_storage_4096k'));
// h(item('extracpus:crafting_storage_16384k'));
// h(item('nae2:reconstruction_chamber:0'));
// 
// // Written by MadMan310
// val ae2 as IMod = loadedMods["appliedenergistics2"];
// val ae2Items as IItemStack[] = ae2.items;
// for item in ae2Items {
//     if(item.displayName has "Cable Facade") {
//         if(item.displayName has "MAX Power Cell") {
//             item.addTooltip(format.darkAqua("All facades are still craftable, they are just hidden from JEI to avoid clutter"));
//         }
//         else {
//             mods.jei.JEI.hide(item);
//         }
//     }
// }
// 
// val ae3 as IMod = loadedMods["extracells"];
// val ae3Items as IItemStack[] = ae3.items;
// for item in ae3Items {
//     if(item.displayName has "ME Fluid Pattern") {
//             h(item);
//     }
// }
// 
// assembler.recipeBuilder()
// .inputs([item('gregtech:mte:988'),item('appliedenergistics2:quartz_glass:0') * 2,item('gregtech:meta_item_1:32612') *2 ])
// .outputs([item('appliedenergistics2:fluid_interface:0') * 4])
// .duration(150)
// .EUt(480)
// .buildAndRegister();
// assembler.recipeBuilder()
// .inputs([item('gregtech:mte:988'),item('appliedenergistics2:quartz_glass:0') * 2,item('gregtech:meta_item_1:32642') *2])
// .outputs([item('appliedenergistics2:interface:0') * 4])
// .duration(150)
// .EUt(480)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('gregtech:meta_item_1:32614'),item('appliedenergistics2:quartz_glass:0'),item('gregtech:mte:990')])
// .outputs([item('appliedenergistics2:fluid_interface:0') * 8])
// .duration(150)
// .EUt(7680)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('gregtech:meta_item_1:32644'),item('appliedenergistics2:quartz_glass:0') ,item('gregtech:mte:990')])
// .outputs([item('appliedenergistics2:interface:0') * 8])
// .duration(150)
// .EUt(7680)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('gregtech:meta_item_1:32616'),item('appliedenergistics2:quartz_glass:0') * 1,item('gregtech:mte:992') * 1])
// .outputs([item('appliedenergistics2:fluid_interface:0') * 16])
// .duration(150)
// .EUt(122880)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('gregtech:meta_item_1:32646'),item('appliedenergistics2:quartz_glass:0') * 1,item('gregtech:mte:992') * 1])
// .outputs([item('appliedenergistics2:interface:0') * 16])
// .duration(150)
// .EUt(122880)
// .buildAndRegister();
// recipes.addShapeless(item('appliedenergistics2:interface:0'), [item('appliedenergistics2:part:440')]);
// recipes.addShapeless(item('appliedenergistics2:fluid_interface:0'), [item('appliedenergistics2:part:441')]);
// 
// recipes.remove(item('extracells:part.base:12'));
// recipes.addShapeless(item('extracells:part.base:12'), [item('gregtech:meta_item_1:292'),item('appliedenergistics2:part:260')]);
// 
// //Fix certus
// 
// autoclave.findRecipe(24,[item('metaitem:dustCertusQuartz')],[item('fluid:water') * 200]).remove();
// autoclave.findRecipe(24,[item('metaitem:dustCertusQuartz')],[item('fluid:distilled_water') * 200]).remove();
// 
// autoclave.recipeBuilder()
// .inputs(ore('dustCertusQuartz'))
// .fluidInputs(fluid('water') * 250)
// .outputs(ore('crystalCertusQuartz,gemCertusQuartz'))
// .EUt(30)
// .duration(80)
// .buildAndRegister();
// 
// furnace.remove(ore('itemSilicon'));
// 
// //Fix security station
// recipes.remove(item('appliedenergistics2:security_station:0'));
// recipes.addShaped(item('appliedenergistics2:security_station:0'), [[ore('plateIron'), item('appliedenergistics2:chest:0'), ore('plateIron')],[item('appliedenergistics2:part:16'), item('appliedenergistics2:material:35'), item('appliedenergistics2:part:16')], [ore('plateIron'), item('appliedenergistics2:material:24'), ore('plateIron')]]);
// recipes.addShaped(item('appliedenergistics2:quantum_ring:0'), [[ore('ingotIron'), item('appliedenergistics2:material:22'), ore('ingotIron')],[item('appliedenergistics2:material:24'), item('appliedenergistics2:energy_cell:0'), item('appliedenergistics2:material:35')], [ore('ingotIron'), item('appliedenergistics2:material:22'), ore('ingotIron')]]);
// recipes.remove(item('appliedenergistics2:part:222'));
// recipes.addShapeless(item('appliedenergistics2:part:222'), [item('gregtech:meta_item_1:292'),item('appliedenergistics2:part:220')]);
// 
// 
// //alt for presses
// 
// engraver.recipeBuilder()
// .inputs([ore('plateAluminium')])
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('appliedenergistics2:material:19'))
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs([ore('plateAluminium')])
// .notConsumable(ore('lensRuby'))
// .outputs(item('appliedenergistics2:material:15'))
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs([ore('plateStainlessSteel')])
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('appliedenergistics2:material:13'))
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs([ore('plateStainlessSteel')])
// .notConsumable(ore('lensRuby'))
// .outputs(item('appliedenergistics2:material:14'))
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// recipes.addShaped(item('appliedenergistics2:material:59'), [[item('gregtech:meta_item_1:13524'), item('appliedenergistics2:material:41'), item('gregtech:meta_item_1:13524')],[item('gregtech:meta_item_1:32694'), item('gregtech:meta_item_1:32674'), item('gregtech:meta_item_1:32684')], [item('gregtech:meta_item_1:13524'), item('gregtech:meta_item_1:12807'), item('gregtech:meta_item_1:13524')]]);
// 
// 
// //NAE2
// 
// //Void Cell
// 
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:material:36') * 1, item('appliedenergistics2:material:44') * 4, ore('plateSteel') * 4, item('trashcans:item_trash_can:0')])
// .outputs([item('nae2:material:0')])
// .duration(600)
// .EUt(120)
// .buildAndRegister();
// 
// //Item Storage Cells
// //256k
// 
// //skip
// assembler.recipeBuilder()
// .inputs([ore('plateTungstenSteel') * 4, ore('gemExquisiteDiamond') * 4, item('gregtech:meta_item_1:709') * 4,ore('circuitElite')])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('nae2:material:1')])
// .duration(300)
// .EUt(7680)
// .buildAndRegister();
// 
// //from 64k
// assembler.recipeBuilder()
// .inputs([ore('plateTungstenSteel') * 4, ore('crystalPureCertusQuartz') * 4,ore('circuitElite'), item('appliedenergistics2:material:38') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('nae2:material:1')])
// .duration(300)
// .EUt(7680)
// .buildAndRegister();
// 
// //1024k
// assembler.recipeBuilder()
// .inputs([ore('plateRhodiumPlatedPalladium') * 4,ore('circuitMaster'),ore('gemExquisiteDiamond') * 4, item('gregtech:meta_item_1:709') * 4,item('nae2:material:1') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('nae2:material:2')])
// .duration(300)
// .EUt(30720)
// 
// //4096k
// .buildAndRegister();
// assembler.recipeBuilder()
// .inputs([ore('plateOsmiridium') * 4,ore('circuitUltimate'), ore('gemExquisiteDiamond') * 4, item('gregtech:meta_item_1:709') * 4,item('nae2:material:2') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('nae2:material:3')])
// .duration(300)
// .EUt(122800)
// .buildAndRegister();
// 
// //16384k
// assembler.recipeBuilder()
// .inputs([ore('plateTritanium') * 4,ore('circuitSuperconductor'), ore('gemExquisiteDiamond') * 4, item('gregtech:meta_item_1:708') * 4,item('nae2:material:3') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('nae2:material:4')])
// .duration(300)
// .EUt(491520)
// .buildAndRegister();
// 
// //Fluid Storage Cells
// //256k
// //skip
// assembler.recipeBuilder()
// .inputs([ore('plateTungstenSteel') * 4, ore('gemExquisiteDiamond') * 4, item('gregtech:meta_item_1:709') * 4, ore('dyeBlue') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs([item('nae2:material:5')])
// .duration(300)
// .EUt(7680)
// .buildAndRegister();
// 
// //from 64k
// assembler.recipeBuilder()
// .inputs([ore('plateTungstenSteel') * 4,ore('circuitElite'), ore('dyeBlue') * 4,item('appliedenergistics2:material:57') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs([item('nae2:material:5')])
// .duration(300)
// .EUt(76800)
// .buildAndRegister();
// 
// //1024k
// assembler.recipeBuilder()
// .inputs([ore('plateRhodiumPlatedPalladium') * 4,ore('circuitMaster'), ore('dyeBlue') * 4, item('gregtech:meta_item_1:709') * 4, item('nae2:material:5') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs([item('nae2:material:6')])
// .duration(300)
// .EUt(30720)
// .buildAndRegister();
// 
// //4096k
// assembler.recipeBuilder()
// .inputs([ore('plateOsmiridium') * 4,ore('circuitUltimate'), ore('dyeBlue') * 4, item('gregtech:meta_item_1:709') * 4, item('nae2:material:6') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs([item('nae2:material:7')])
// .duration(300)
// .EUt(122800)
// .buildAndRegister();
// 
// //16384k
// assembler.recipeBuilder()
// .inputs([ore('plateTritanium') * 4,ore('circuitSuperconductor'), ore('dyeBlue') * 4, item('gregtech:meta_item_1:708') * 4, item('nae2:material:7') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs([item('nae2:material:8')])
// .duration(300)
// .EUt(491520)
// .buildAndRegister();
// 
// //Co-Processors
// //4x
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:crafting_accelerator:0') * 2, ore('circuitExtreme') * 4, item('appliedenergistics2:material:23') * 2, ore('plateTitanium') * 8])
// .outputs([item('nae2:coprocessor_4x')])
// .duration(600)
// .EUt(1920)
// .buildAndRegister();
// 
// //16x
// assembler.recipeBuilder()
// .inputs([item('nae2:coprocessor_4x') * 2, ore('circuitMaster') * 4, item('appliedenergistics2:material:23') * 2, ore('plateRhodiumPlatedPalladium') * 8])
// .outputs([item('nae2:coprocessor_16x')])
// .duration(600)
// .EUt(30720)
// .buildAndRegister();
// 
// //64x
// assembler.recipeBuilder()
// .inputs([item('nae2:coprocessor_16x') * 2, ore('circuitSuperconductor') * 4, item('appliedenergistics2:material:23') * 2, ore('plateTritanium') * 8])
// .outputs([item('nae2:coprocessor_64x')])
// .duration(600)
// .EUt(491520)
// .buildAndRegister();
// 
// //Pattern Multi-Tool
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:material:52') * 8, item('appliedenergistics2:material:24') * 2, ore('itemIlluminatedPanel') * 1, item('appliedenergistics2:material:23') * 2, ore('plateStainlessSteel') * 16])
// .outputs([item('nae2:pattern_multiplier:0') * 1])
// .duration(1200)
// .EUt(480)
// .buildAndRegister();
// 
// //ME Beam Former
// assembler.recipeBuilder()
// .inputs([ore('plateGlowstone') * 8, item('appliedenergistics2:material:41') * 2, item('appliedenergistics2:quartz_glass:0') * 2, item('appliedenergistics2:material:23') * 2, ore('plateStainlessSteel') * 2])
// .outputs([item('nae2:part:0') * 2])
// .duration(300)
// .EUt(480)
// .buildAndRegister();
// 
// //Hyper-Acceleration Card
// assembler.recipeBuilder()
// .inputs([item('appliedenergistics2:material:30') * 4, item('appliedenergistics2:material:23') * 2, item('appliedenergistics2:quartz_glass:0') * 3, item('appliedenergistics2:material:47') * 2])
// .outputs([item('nae2:upgrade:0')])
// .duration(450)
// .EUt(1920)
// .buildAndRegister();
// 
// //Extracells To NAE2 Cells conversion
// recipes.addShapeless(item('nae2:material:5'), [item('extracells:storage.component:8')]);
// recipes.addShapeless(item('nae2:material:1'), [item('extracells:storage.component:0')]);
// recipes.addShapeless(item('nae2:material:2'), [item('extracells:storage.component:1')]);
// recipes.addShapeless(item('nae2:material:3'), [item('extracells:storage.component:2')]);
// recipes.addShapeless(item('nae2:material:4'), [item('extracells:storage.component:3')]);
// 
// //cpu to cpu
// recipes.addShapeless(item('nae2:storage_crafting_256k'), [item('extracpus:crafting_storage_256k')]);
// recipes.addShapeless(item('nae2:storage_crafting_1024k'), [item('extracpus:crafting_storage_1024k')]);
// recipes.addShapeless(item('nae2:storage_crafting_4096k'), [item('extracpus:crafting_storage_4096k')]);
// recipes.addShapeless(item('nae2:storage_crafting_16384k'), [item('extracpus:crafting_storage_16384k')]);
// 
// //ME fluid asembler
// recipes.addShapeless(item('ae2fc:fluid_assembler:0'), [item('extracells:fluidcrafter')]);
// recipes.remove(item('extracells:fluidcrafter'));
// 
// //Mark all items a depreciated
// val ae4 as IMod = loadedMods["extracells"];
// val ae4Items as IItemStack[] = ae4.items;
// for item in ae4Items {
//     item.addTooltip("§4DEPRECIATED WILL BE REMOVED NEXT UPDATE");
//     
//         if(item.displayName has "Storage Cell") {
//             item.addTooltip("§buse a ME I/O port to dump contents into new cells. Then you can shift right with the empty cell in your hand to get back the part for conversion");
//     }
// 
// }