// import mods.gtadditions.recipe.Utils;
// //red
// assembler.recipeBuilder()
// .inputs([item('actuallyadditions:block_crystal:0'),ore('ingotBrick') * 2,item('minecraft:netherbrick') *2,item('minecraft:redstone_block') * 2])
// .fluidInputs(fluid('plastic') * 288)
// .outputs([item('actuallyadditions:block_crystal_empowered:0')])
// .duration(160)
// .EUt(120)
// .buildAndRegister();
// assembler.recipeBuilder()
// .inputs([item('actuallyadditions:item_crystal:0'),item('minecraft:brick_block') * 2,item('minecraft:nether_brick') *2,item('minecraft:redstone_block') * 2])
// .fluidInputs(fluid('plastic') * 288)
// .outputs([item('actuallyadditions:item_crystal_empowered:0')])
// .duration(160)
// .EUt(120)
// .buildAndRegister();
// //blue
// assembler.recipeBuilder()
// .inputs([item('actuallyadditions:block_crystal:1'),item('minecraft:prismarine') *2, item('minecraft:lapis_block') *2])
// .fluidInputs(fluid('plastic') * 288)
// .outputs([item('actuallyadditions:block_crystal_empowered:1')])
// .duration(160)
// .EUt(120)
// .buildAndRegister();
// assembler.recipeBuilder()
// .inputs([item('actuallyadditions:item_crystal:1'),item('minecraft:prismarine') *2, item('minecraft:lapis_block') *2])
// .fluidInputs(fluid('plastic') * 288)
// .outputs([item('actuallyadditions:item_crystal_empowered:1')])
// .duration(160)
// .EUt(120)
// .buildAndRegister();
// //white
// assembler.recipeBuilder()
// .inputs([item('actuallyadditions:block_crystal:5'),item('minecraft:snow:0') *2,ore('stone,stoneSmooth')* 2 ])
// .fluidInputs(fluid('plastic') * 288)
// .outputs([item('actuallyadditions:block_crystal_empowered:5')])
// .duration(160)
// .EUt(120)
// .buildAndRegister();
// assembler.recipeBuilder()
// .inputs([item('actuallyadditions:item_crystal:5'),item('minecraft:snow:0') *2,ore('stone,stoneSmooth')* 2 ])
// .fluidInputs(fluid('plastic') * 288)
// .outputs([item('actuallyadditions:item_crystal_empowered:5')])
// .duration(160)
// .EUt(120)
// .buildAndRegister();
// //black
// assembler.recipeBuilder()
// .inputs([item('actuallyadditions:block_crystal:3'),ore('blockCharcoal') *2,item('gregtech:meta_block_compressed_22:5') * 2 ])
// .fluidInputs(fluid('plastic') * 288)
// .outputs([item('actuallyadditions:block_crystal_empowered:3')])
// .duration(160)
// .EUt(120)
// .buildAndRegister();
// assembler.recipeBuilder()
// .inputs([item('actuallyadditions:item_crystal:3'),ore('blockCharcoal') *2,item('gregtech:meta_block_compressed_22:5') * 2 ])
// .fluidInputs(fluid('plastic') * 288)
// .outputs([item('actuallyadditions:item_crystal_empowered:3')])
// .duration(160)
// .EUt(120)
// .buildAndRegister();
// //light blue
// assembler.recipeBuilder()
// .inputs([item('actuallyadditions:block_crystal:2'),ore('blockClay,oreClay') *4])
// .fluidInputs(fluid('plastic') * 288)
// .outputs([item('actuallyadditions:block_crystal_empowered:2')])
// .duration(160)
// .EUt(120)
// .buildAndRegister();
// assembler.recipeBuilder()
// .inputs([item('actuallyadditions:item_crystal:2'),ore('blockClay,oreClay') *4])
// .fluidInputs(fluid('plastic') * 288)
// .outputs([item('actuallyadditions:item_crystal_empowered:2')])
// .duration(160)
// .EUt(120)
// .buildAndRegister();
// //green
// assembler.recipeBuilder()
// .inputs([item('actuallyadditions:block_crystal:4'),ore('blockSlime')*2,item('gregtech:meta_item_1:439') * 2])
// .fluidInputs(fluid('plastic') * 288)
// .outputs([item('actuallyadditions:block_crystal_empowered:4')])
// .duration(160)
// .EUt(120)
// .buildAndRegister();
// assembler.recipeBuilder()
// .inputs([item('actuallyadditions:item_crystal:4'),ore('blockSlime')*2,item('gregtech:meta_item_1:439') * 2])
// .fluidInputs(fluid('plastic') * 288)
// .outputs([item('actuallyadditions:item_crystal_empowered:4')])
// .duration(160)
// .EUt(120)
// .buildAndRegister();
// item('actuallyadditions:block_misc:9').displayName = "Stainless Steel Casing";
// recipes.addShaped(item('actuallyadditions:block_misc:9'), [[null, ore('plateStainlessSteel'), null],[ore('plateStainlessSteel'), ore('gemQuartzBlack'), ore('plateStainlessSteel')], [null, ore('plateStainlessSteel'), null]]);
// 
// //attomic recipes
// engraver.recipeBuilder()
// .inputs(item('minecraft:quartz_block:1'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_testifi_bucks_green_wall:0'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs(item('minecraft:quartz_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_testifi_bucks_white_wall:0'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs(ore('gemNetherQuartz,gemQuartz'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(ore('gemPrismarine'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs(item('minecraft:red_mushroom'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(ore('cropNetherWart'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs(item('minecraft:rotten_flesh:0'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(ore('itemLeather,leather'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs(ore('sand'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('minecraft:soul_sand:0'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs(item('minecraft:iron_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_crystal:5'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs(item('minecraft:coal_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_crystal:3'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs(item('minecraft:emerald_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_crystal:4'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs(item('minecraft:diamond_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_crystal:2'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs(item('minecraft:lapis_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_crystal:1'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs(item('minecraft:redstone_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_crystal:0'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs(ore('seedCanola') * 30)
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:item_misc:23') * 30)
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// recipes.addShaped(item('actuallyadditions:block_laser_relay_item:0') * 4, [[item('minecraft:obsidian'), item('minecraft:emerald_block'), item('minecraft:obsidian')],[item('actuallyadditions:item_crystal:4'), item('actuallyadditions:item_misc:8'), item('actuallyadditions:item_crystal:4')], [item('minecraft:obsidian'), item('minecraft:emerald_block'), item('minecraft:obsidian')]]);
// recipes.addShaped(item('actuallyadditions:block_laser_relay_fluids:0') * 4, [[item('minecraft:obsidian'), item('minecraft:lapis_block'), item('minecraft:obsidian')],[item('actuallyadditions:item_crystal:1'), item('actuallyadditions:item_misc:8'), item('actuallyadditions:item_crystal:1')], [item('minecraft:obsidian'), item('minecraft:lapis_block'), item('minecraft:obsidian')]]);
// 
// 
// //attomic recipes
// large_engrav.recipeBuilder()
// .inputs(item('minecraft:quartz_block:1'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_testifi_bucks_green_wall:0'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs(item('minecraft:quartz_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_testifi_bucks_white_wall:0'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs(ore('gemNetherQuartz,gemQuartz'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(ore('gemPrismarine'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs(item('minecraft:red_mushroom'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(ore('cropNetherWart'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs(item('minecraft:rotten_flesh:0'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(ore('itemLeather,leather'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs(ore('sand'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('minecraft:soul_sand:0'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs(item('minecraft:iron_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_crystal:5'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs(item('minecraft:coal_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_crystal:3'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs(item('minecraft:emerald_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_crystal:4'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs(item('minecraft:diamond_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_crystal:2'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs(item('minecraft:lapis_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_crystal:1'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs(item('minecraft:redstone_block'))
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:block_crystal:0'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs(ore('seedCanola') * 30)
// .notConsumable(ore('craftingLensWhite'))
// .outputs(item('actuallyadditions:item_misc:23') * 30)
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// engraver.recipeBuilder()
// .inputs(ore('gemNetherQuartz,gemQuartz'))
// .notConsumable(ore('craftingLensBlue'))
// .outputs(ore('dustPrismarine'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();
// 
// large_engrav.recipeBuilder()
// .inputs(ore('gemNetherQuartz,gemQuartz'))
// .notConsumable(ore('craftingLensBlue'))
// .outputs(ore('dustPrismarine'))
// .EUt(8)
// .duration(20)
// .buildAndRegister();