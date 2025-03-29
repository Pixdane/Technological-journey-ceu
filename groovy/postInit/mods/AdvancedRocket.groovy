// import crafttweaker.item.IItemDefinition;
// import crafttweaker.item.IItemStack;
// import crafttweaker.item.IIngredient;
// import crafttweaker.oredict.IOreDict;
// import crafttweaker.oredict.IOreDictEntry;
// import mods.gregtech.recipe.RecipeMap;
// import mods.gregtech.material.MaterialRegistry;
// import mods.gregtech.material.Material;
// import scripts.commonNames;
// 
// 
// 
// mods.advancedrocketry.ChemicalReactor.clear(); 
// mods.advancedrocketry.PrecisionAssembler.clear(); 
// 
// mods.advancedrocketry.CuttingMachine.clear();
// mods.advancedrocketry.RollingMachine.clear();
// mods.advancedrocketry.Lathe.clear();
// mods.advancedrocketry.Electrolyser.clear();
// mods.advancedrocketry.ArcFurnace.clear();
// mods.advancedrocketry.Crystallizer.clear(); 
// mods.advancedrocketry.PlatePresser.clear();
// recipes.remove(item('advancedrocketry:launchpad:0'));
// 
// mixer.recipeBuilder()
// .inputs([ore('blockConcrete') * 3,ore('dyeYellow'),ore('dyeBlack')])
// .outputs([item('advancedrocketry:launchpad:0') * 3])
// .duration(240)
// .EUt(16)
// .buildAndRegister();
// 
// recipes.remove(item('advancedrocketry:loader:1'));
// recipes.remove(item('advancedrocketry:ic:3'));
// recipes.remove(item('advancedrocketry:spaceboots'));
// recipes.remove(item('advancedrocketry:spacechestplate:0'));
// recipes.remove(item('libvulpes:structuremachine:0'));
// recipes.remove(item('libvulpes:holoprojector:0'));
// recipes.remove(item('advancedrocketry:spaceleggings'));
// recipes.remove(item('advancedrocketry:spacehelmet'));
// recipes.addShaped(ore('bookEnchanted,craftingBook').withTag({StoredEnchantments: [{lvl: 1 as short, id: 13 as short}]}), [[null, ore('stickLongStainlessSteel'), null],[null, item('advancedrocketry:spacehelmet'), null], [null, ore('bookEmpty'), null]]);
// recipes.addShaped(ore('bookEnchanted,craftingBook').withTag({StoredEnchantments: [{lvl: 1 as short, id: 13 as short}]}), [[null, ore('stickLongStainlessSteel'), null],[null, item('advancedrocketry:spacechestplate:0'), null], [null, ore('bookEmpty'), null]]);
// recipes.addShaped(ore('bookEnchanted,craftingBook').withTag({StoredEnchantments: [{lvl: 1 as short, id: 13 as short}]}), [[null, ore('stickLongStainlessSteel'), null],[null, item('advancedrocketry:spaceleggings'), null], [null, ore('bookEmpty'), null]]);
// recipes.addShaped(ore('bookEnchanted,craftingBook').withTag({StoredEnchantments: [{lvl: 1 as short, id: 13 as short}]}), [[null, ore('stickLongStainlessSteel'), null],[null, item('advancedrocketry:spaceboots'), null], [null, ore('bookEmpty'), null]]);
// recipes.addShaped(item('advancedrocketry:spacehelmet'), [[ore('wool'), ore('plateStainlessSteel'), ore('wool')],[ore('wool'), item('gregtech:meta_item_1:15209'), ore('wool')], [ore('plateStainlessSteel'), item('minecraft:leather_helmet:0'), ore('plateStainlessSteel')]]);
// recipes.addShaped(item('advancedrocketry:spaceleggings'), [[ore('plateStainlessSteel'), ore('wool'), ore('plateStainlessSteel')],[ore('wool'), item('minecraft:leather_leggings:0'), ore('wool')], [ore('wool'), null, ore('wool')]]);
// recipes.addShaped(item('advancedrocketry:spacechestplate:0'), [[null, ore('plateStainlessSteel'), null],[ore('wool'), item('minecraft:leather_chestplate:0'), ore('wool')], [ore('plateStainlessSteel'), ore('wool'), ore('plateStainlessSteel')]]);
// recipes.addShaped(item('advancedrocketry:spaceboots'), [[ore('plateStainlessSteel'), ore('wool'), ore('plateStainlessSteel')],[ore('wool'), item('minecraft:leather_boots:0'), ore('wool')], [ore('plateStainlessSteel'), ore('wool'), ore('plateStainlessSteel')]]);
// recipes.addShaped(item('advancedrocketry:rocketmotor'), [[null, ore('stickSteel'), null],[ore('stickSteel'), null, ore('stickSteel')], [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]]);
// recipes.addShaped(item('advancedrocketry:fueltank') * 2, [[ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')],[ore('plateStainlessSteel'), null, ore('plateStainlessSteel')], [ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')]]);
// 
// 
// recipes.remove(item('advancedrocketry:rocketmotor'));
// recipes.remove(item('gcyl:mte:114'));
// recipes.remove(item('advancedrocketry:fuelingstation:0'));
// recipes.remove(item('advancedrocketry:fueltank'));
// recipes.remove(item('advancedrocketry:guidancecomputer:0'));
// recipes.remove(ore('dustThermite'));
// recipes.remove(item('advancedrocketry:ic:5'));
// recipes.remove(item('advancedrocketry:ic:4'));
// recipes.remove(item('advancedrocketry:gravitymachine:0'));
// recipes.remove(item('advancedrocketry:altitudecontroller:0'));
// recipes.remove(item('advancedrocketry:stationmarker:0'));
// recipes.remove(item('advancedrocketry:circlelight:0'));
// recipes.remove(item('advancedrocketry:stationbuilder:0'));
// recipes.remove(item('advancedrocketry:oxygenscrubber:0'));
// recipes.remove(item('advancedrocketry:oxygenvent:0'));
// recipes.remove(item('advancedrocketry:oxygencharger:0'));
// recipes.remove(item('advancedrocketry:landingpad:0'));
// recipes.remove(item('advancedrocketry:warpcore:0'));
// recipes.remove(item('advancedrocketry:warpmonitor:0'));
// recipes.remove(item('advancedrocketry:orientationcontroller:0'));
// recipes.remove(item('advancedrocketry:gravitycontroller:0'));
// recipes.remove(item('advancedrocketry:rocketbuilder:0'));
// recipes.addShaped(item('advancedrocketry:warpmonitor:0'), [[ore('plateStainlessSteel'), item('gregtech:meta_item_1:32692'), ore('plateStainlessSteel')],[item('gregtech:meta_item_1:32692'), item('gregtech:mte:988'), item('gregtech:meta_item_1:32692')], [ore('plateStainlessSteel'), item('gregtech:meta_item_1:32692'), ore('plateStainlessSteel')]]);
// recipes.addShaped(item('advancedrocketry:orientationcontroller:0'), [[ore('plateStainlessSteel'), item('gregtech:mte:988'), ore('plateStainlessSteel')],[item('gregtech:mte:988'), item('advancedrocketry:misc:0'), item('gregtech:mte:988')], [ore('plateStainlessSteel'), item('gregtech:mte:988'), ore('plateStainlessSteel')]]);
// recipes.addShaped(item('advancedrocketry:loader:1'), [[ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')],[ore('plateStainlessSteel'), ore('chest,chestWood'), ore('plateStainlessSteel')], [ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')]]);
// recipes.addShaped(item('advancedrocketry:oxygencharger:0'), [[null, null, null],[ore('plateStainlessSteel'), item('gregtech:meta_item_1:32612'), ore('plateStainlessSteel')], [null, item('gregtech:mte:1611'), null]]);
// recipes.addShaped(item('advancedrocketry:oxygenvent:0'), [[null, item('gregtech:meta_item_1:32612'), null],[null, item('gregtech:mte:988'), null], [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]]);
// recipes.addShaped(item('advancedrocketry:oxygenscrubber:0'), [[ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')],[null,item('gregtech:mte:988'), null], [null, item('gregtech:meta_item_1:32612'), null]]);
// recipes.addShaped(item('advancedrocketry:gravitycontroller:0'), [[ore('plateStainlessSteel'), item('gregtech:meta_item_1:32682'), ore('plateStainlessSteel')],[ore('plateStainlessSteel'), item('gregtech:mte:988'), ore('plateStainlessSteel')], [ore('plateStainlessSteel'), item('gregtech:meta_item_1:32692'), ore('plateStainlessSteel')]]);
// recipes.addShaped(item('advancedrocketry:rocketbuilder:0'), [[ore('plateTitanium'), item('advancedrocketry:misc:0'), ore('plateTitanium')],[item('gregtech:meta_item_1:32652'), item('gregtech:mte:988'), item('gregtech:meta_item_1:32652')], [ore('plateTitanium'), null, ore('plateTitanium')]]);
// recipes.addShaped(item('libvulpes:structuremachine:0') * 4, [[ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')],[ore('plateStainlessSteel'), ore('stickStainlessSteel'), ore('plateStainlessSteel')], [ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')]]);
// recipes.addShaped(item('advancedrocketry:warpcore:0'), [[ore('plateTitanium'), ore('circuitExtreme'), ore('plateTitanium')],[ore('plateTitanium'), item('gregtech:mte:989'), ore('plateTitanium')], [ore('plateTitanium'), ore('circuitExtreme'), ore('plateTitanium')]]);
// recipes.addShaped(item('advancedrocketry:circlelight:0'), [[null, ore('plateIron'), null],[ore('plateIron'), item('minecraft:glowstone'), ore('plateIron')], [null, ore('plateIron'), null]]);
// recipes.addShaped(item('advancedrocketry:altitudecontroller:0'), [[ore('plateStainlessSteel'), item('advancedrocketry:misc:0'), ore('plateStainlessSteel')],[item('gregtech:meta_item_1:32692'), item('gregtech:mte:988'), item('gregtech:meta_item_1:32692')], [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]]);
// recipes.addShaped(item('advancedrocketry:stationmarker:0'), [[ore('plateStainlessSteel'), item('advancedrocketry:misc:0'), ore('plateStainlessSteel')],[ore('plateStainlessSteel'), item('gregtech:mte:988'), ore('plateStainlessSteel')], [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]]);
// recipes.addShaped(item('advancedrocketry:gravitymachine:0'), [[item('gregtech:meta_item_1:32682'), item('advancedrocketry:misc:0'), item('gregtech:meta_item_1:32682')],[ore('plateStainlessSteel'), item('gregtech:mte:988'), ore('plateStainlessSteel')], [ore('plateStainlessSteel'), item('gregtech:meta_item_1:32682'), ore('plateStainlessSteel')]]);
// recipes.addShaped(item('advancedrocketry:stationbuilder:0'), [[item('gregtech:meta_item_1:32692'), ore('plateStainlessSteel'), item('gregtech:meta_item_1:32692')],[item('gregtech:meta_item_1:32652'), item('gregtech:mte:988'), item('gregtech:meta_item_1:32652')], [ore('plateStainlessSteel'), item('gregtech:meta_item_1:32682'), ore('plateStainlessSteel')]]);
// 
// alloy.recipeBuilder()
//     .inputs([item('gregtech:meta_item_1:371'),item('minecraft:glass_pane')])
//     .outputs([ore('waferSilicon')])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
// engraver.recipeBuilder()
//     .inputs([ore('waferSilicon')])
//     .notConsumable(ore('craftingLensWhite'))
//     .outputs([item('advancedrocketry:itemcircuitplate:0')])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
// engraver.recipeBuilder()
//     .inputs([ore('waferSilicon')])
//     .notConsumable(ore('craftingLensLime'))
//     .outputs([item('advancedrocketry:itemcircuitplate:1')])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//     saw.recipeBuilder()
//     .inputs([item('advancedrocketry:itemcircuitplate:1')])
//     .fluidInputs(fluid('lubricant') * 144)
//     .outputs([item('advancedrocketry:ic:2') * 16])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//      saw.recipeBuilder()
//     .inputs([item('advancedrocketry:itemcircuitplate:0')])
//     .fluidInputs(fluid('lubricant') * 144)
//     .outputs([item('advancedrocketry:ic:0') * 16])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//     
//     recipes.addShaped(item('advancedrocketry:ic:1'), [[null, null, null],[null, item('advancedrocketry:ic:0'), null], [item('advancedrocketry:ic:2'), item('advancedrocketry:ic:2'), item('advancedrocketry:ic:2')]]);
//     recipes.addShaped(item('advancedrocketry:satelliteidchip:0'), [[null, null, null],[null, item('advancedrocketry:ic:2'), null], [item('advancedrocketry:ic:0'), item('advancedrocketry:ic:0'), item('advancedrocketry:ic:0')]]);
//     recipes.addShaped(item('advancedrocketry:fuelingstation:0'), [[ore('plateStainlessSteel'), item('gregtech:meta_item_1:32612'), ore('plateStainlessSteel')],[item('gregtech:meta_item_1:32612'), item('gregtech:mte:988'), item('gregtech:meta_item_1:32612')], [ore('plateStainlessSteel'), item('gregtech:meta_item_1:32612'), ore('plateStainlessSteel')]]);
//     recipes.addShaped(item('advancedrocketry:guidancecomputer:0'), [[ore('plateIron'), item('advancedrocketry:misc:0'), ore('plateIron')],[item('gregtech:meta_item_1:32682'), item('gregtech:mte:988'), item('gregtech:meta_item_1:32682')], [ore('plateIron'), item('gregtech:meta_item_1:32692'), ore('plateIron')]]);
//     recipes.addShapeless(item('advancedrocketry:landingpad:0'), [item('advancedrocketry:launchpad:0'),item('advancedrocketry:ic:0')]);
//     recipes.addShaped(item('libvulpes:holoprojector:0'), [[item('minecraft:glass_pane'), item('gregtech:meta_item_1:32682'), item('minecraft:glass_pane')],[null, item('gregtech:mte:988'), null], [null, null, null]]);
//     recipes.addShaped(item('gcyl:mte:114'), [[null, ore('stickStainlessSteel'), null],[ore('stickStainlessSteel'), null, ore('stickStainlessSteel')], [ore('plateTitanium'), ore('plateTitanium'), ore('plateTitanium')]]);
// 
// chemreactor.recipeBuilder()
// .inputs([item('gregtech:meta_item_1:2033') * 2,ore('dustAluminium')*1])
// .fluidInputs( fluid('oxygen') * 2000)
// .outputs([ore('dustThermite') * 3])
// .duration(600)
// .EUt(30)
// .buildAndRegister();
// 
// macerator.recipeBuilder()
// .inputs([item('advancedrocketry:crystal:0')])
// .outputs([item('actuallyadditions:item_crystal_shard:1') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// macerator.recipeBuilder()
// .inputs([item('advancedrocketry:crystal:1')])
// .outputs([item('actuallyadditions:item_crystal_shard:2') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// macerator.recipeBuilder()
// .inputs([item('advancedrocketry:crystal:2')])
// .outputs([item('actuallyadditions:item_crystal_shard:4') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// macerator.recipeBuilder()
// .inputs([item('advancedrocketry:crystal:3')])
// .outputs([item('actuallyadditions:item_crystal_shard:0') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// macerator.recipeBuilder()
// .inputs([item('advancedrocketry:crystal:5')])
// .outputs([item('actuallyadditions:item_crystal_shard:3') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// macerator.recipeBuilder()
// .inputs([item('advancedrocketry:crystal:4')])
// .outputs([item('actuallyadditions:item_crystal_shard:5') * 4])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// alloy.recipeBuilder()
//     .inputs([item('advancedrocketry:hotturf:0') * 10,item('minecraft:glass')])
//     .outputs([item('gtadditions:ga_transparent_casing')])
//     .duration(300)
//     .EUt(2040)
//     .buildAndRegister();
// 
// 
// autoclave.recipeBuilder()
// .inputs([item('libvulpes:productdust')])
// .fluidInputs([fluid('water') * 1000])
// .outputs([item('libvulpes:productgem')])
// .duration(120)
// .EUt(500)
// .buildAndRegister();
// item('advancedrocketry:charcoallog:0').addTooltip("ID 400 artifact");
// ore('blockTungstenCarbide').addTooltip("ID 401 artifact");
// ore('blockSalt').addTooltip("ID 402 artifact");
// item('gregtech:meta_block_compressed_3:3').addTooltip("ID 403 artifact");
// ore('blockCalifornium').addTooltip("ID 405 artifact");
// ore('blockAdamantium').addTooltip("ID 406 artifact");
// //low tank
// extruder.recipeBuilder()
// .inputs([ore('ingotIron') *16])
// .notConsumable(item('gregtech:meta_item_1:20'))
// .outputs([item('advancedrocketry:pressuretank:0')])
// .duration(600)
// .EUt(30)
// .buildAndRegister();
// //med tank
// extruder.recipeBuilder()
// .inputs([ore('ingotSteel') *16])
// .notConsumable(item('gregtech:meta_item_1:20'))
// .outputs([item('advancedrocketry:pressuretank:1')])
// .duration(600)
// .EUt(120)
// .buildAndRegister();
// // large tank
// extruder.recipeBuilder()
// .inputs([ore('ingotStainlessSteel') *16])
// .notConsumable(item('gregtech:meta_item_1:20'))
// .outputs([item('advancedrocketry:pressuretank:2')])
// .duration(600)
// .EUt(500)
// .buildAndRegister();
// //max tank
// extruder.recipeBuilder()
// .inputs([ore('ingotTitanium') *16])
// .notConsumable(item('gregtech:meta_item_1:20'))
// .outputs([item('advancedrocketry:pressuretank:3')])
// .duration(600)
// .EUt(1048)
// .buildAndRegister();