// import crafttweaker.item.IItemStack;
// import crafttweaker.liquid.ILiquidStack;
// import scripts.commonNames;
// //EIO metals to gregtech 
// 
// 
// //end Alloy
// alloy.recipeBuilder()
//     .inputs([ore('gemEnderEye,pearlEnderEye'),ore('ingotElectricalSteel')])
//     .outputs([ore('ingotEndSteel')])
//     .duration(160)
//     .EUt(1024)
//     .buildAndRegister();
//     //Energetic Alloy
//     alloy.recipeBuilder()
//     .inputs([ore('dustGlowstone'),ore('ingotGold') * 2])
//     .outputs([ore('ingotEnergeticAlloy') * 2])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//     //electric steel
//     alloy.recipeBuilder()
//     .inputs([ore('ingotIron'),ore('dustSilicon')])
//     .outputs([ore('ingotElectricalSteel')])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//     //Vibrant alloy
//      alloy.recipeBuilder()
//     .inputs([ore('ingotEnergeticAlloy') * 2,ore('enderpearl')])
//     .outputs([ore('ingotVibrantAlloy') * 2 ])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//     // dark steel
//     alloy.recipeBuilder()
//     .inputs([ore('ingotSteel'),ore('stoneObsidian')])
//     .outputs([ore('ingotDarkSteel')])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//     //soularium
//      alloy.recipeBuilder()
//     .inputs([item('minecraft:soul_sand:0'),ore('ingotGold')])
//     .outputs([ore('ingotSoularium')])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//     //pulsating iron ingot
//      alloy.recipeBuilder()
//     .inputs([ore('ingotIron'),ore('dustUranium')])
//     .outputs([ore('ingotPulsatingIron')])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//     alloy.recipeBuilder()
//     .inputs([ore('ingotIron'),item('gregtech:meta_item_1:10822')])
//     .outputs([ore('ingotPulsatingIron')])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//     //conductive iron
//  alloy.recipeBuilder()
//     .inputs([ore('dustRedstone'),ore('ingotIron')])
//     .outputs([ore('ingotConductiveIron')])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//     //red alloy
//      alloy.recipeBuilder()
//     .inputs([ore('dustRedstone'),ore('itemSilicon')])
//     .outputs([ore('ingotRedstoneAlloy')])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//     //.notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
//    //organic black dye
//     alloy.recipeBuilder()
//     .inputs([ore('coal,gemCoal,itemCoal'), item('minecraft:tallgrass:1') * 2])
//     .outputs([ore('dyeBlack') *2])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//     //organic brown dye
//      alloy.recipeBuilder()
//     .inputs([ore('charcoal,gemCharcoal,itemCharcoal'), ore('treeSapling') * 4])
//     .outputs([ore('dyeBrown') *2])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
//     
// alloy.recipeBuilder()
//     .inputs([ore('gemNetherQuartz,gemQuartz') * 4])
//     .outputs([ore('blockGlassHardened,blockGlassHardenedWhite,fusedQuartz')])
//     .duration(160)
//     .EUt(30)
//     .buildAndRegister();
// 
// mixer.recipeBuilder()
// 	.inputs([ore('gravel') * 4, ore('sand') * 4])
//     .fluidInputs(fluid('water') * 1000)
//     .outputs([ore('itemBinderComposite').firstItem * 16])
//     .duration(80).EUt(500).buildAndRegister();
// 
// //soul powder
// macerator.recipeBuilder()
// .inputs([ore('ingotSoularium')])
// .outputs([ore('dustSoularium')])
// .duration(160)
// .EUt(30)
// .buildAndRegister();
// 
// blast_alloy.recipeBuilder()
//     .inputs([item('gregtech:meta_item_1:2524') * 5, ore('dustAmericium') * 4, ore('dustNetherStar')])
//     .fluidOutputs(fluid('stellaralloy')*1440)
//     .duration(420)
//     .property("temperature", 8100)
//     .EUt(2430)
//     .buildAndRegister();
// 
// solidifier.recipeBuilder()
//     .fluidInputs(fluid('stellaralloy')*144)
//     .notConsumable(item('gregtech:meta_item_1:16'))
//     .outputs(ore('ingotStellarAlloy'))
//     .duration(20)
//     .EUt(8)
//     .buildAndRegister();
// 
// item('enderio:item_power_conduit:0').displayName = "Stainless Steel Energy Conduit";
// item('enderio:item_power_conduit:1').displayName = "Titanium Energy Conduit";
// item('enderio:item_endergy_conduit:11').displayName = "Superconducting Energy Conduit";
// item('enderio:item_power_conduit:2').displayName = "Tungstensteel Energy Conduit";
// 
// recipes.remove(item('enderio:block_soul_binder:0'));
// recipes.addShaped(item('enderio:block_soul_binder:0'), [[ore('ingotSoularium'), ore('itemSkull'), ore('ingotSoularium')],[ore('itemSkull'), ore('itemSoulMachineChassi'), ore('itemSkull')], [ore('ingotSoularium'), ore('itemSkull'), ore('ingotSoularium')]]);
// recipes.addShapeless(item('enderio:block_decoration1:15'), [item('enderio:item_conduit_facade:2')]);
// recipes.addShaped(item('enderio:item_conduit_facade:2'), [[null, null, null],[null, item('enderio:item_conduit_facade:0'), item('appliedenergistics2:quartz_vibrant_glass:0')], [null, null, null]]);
// recipes.addShaped(item('enderio:item_conduit_facade:2'), [[ore('itemConduitBinder'), ore('itemConduitBinder'), ore('itemConduitBinder')],[ore('itemConduitBinder'), item('appliedenergistics2:quartz_vibrant_glass:0'), ore('itemConduitBinder')], [ore('itemConduitBinder'), ore('itemConduitBinder'), ore('itemConduitBinder')]]);
// recipes.remove(item('enderio:block_decoration1:15'));
// recipes.remove(item('enderio:item_conduit_facade:2'));
// 
// assembler.recipeBuilder()
//     .inputs([ore('plateDoubleSteel'),ore('ingotDarkSteel')])
//     .outputs([item('enderio:item_dark_steel_upgrade:0')])
//     .duration(100)
//     .EUt(30)
//     .buildAndRegister();
// 
// recipes.remove(item('enderio:item_yeta_wrench:0'));
// recipes.addShaped(item('enderio:item_yeta_wrench:0'), [[null, ore('ingotIron'), null],[null, ore('ingotTin'), null], [ore('ingotIron'), null, ore('ingotIron')]]);
//     
// recipes.remove(item('enderio:block_tele_pad:0'));
// 
// assembler.recipeBuilder()
//     .inputs([item('gregtech:meta_item_1:32681'),item('gregtech:meta_item_1:32691'),ore('holyEnlightenedFusedGlass'),item('gregtech:mte:987')* 3])
//     .outputs([item('enderio:block_tele_pad:0') * 9])
//     .duration(180)
//     .EUt(480)
//     .buildAndRegister();
// 
//     macerator.recipeBuilder()
//         .inputs([ore('itemPulsatingCrystal')])
//         .outputs([ore('itemPulsatingPowder')])
//         .duration(160)
//         .EUt(30)
//         .buildAndRegister();
// 
//     macerator.recipeBuilder()
//         .inputs([ore('itemEnderCrystal')])
//         .outputs([ore('itemEnderCrystalPowder')])
//         .duration(160)
//         .EUt(30)
//         .buildAndRegister();
// 
//     macerator.recipeBuilder()
//         .inputs([ore('itemPrecientCrystal')])
//         .outputs([ore('itemPrecientPowder')])
//         .duration(160)
//         .EUt(30)
//         .buildAndRegister();
// 
// 
//     arc.recipeBuilder()
//         .inputs([item('gregtech:meta_item_1:2357') * 64])
//         .fluidInputs(fluid('fire_water') * 100)
//         .outputs([ore('dustBedrock') * 64])
//         .duration(120)
//         .EUt(28)
//         .buildAndRegister();