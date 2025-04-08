// #priority 99
// import mods.gregtech.recipe.RecipeMap;
// import crafttweaker.item.IItemStack;
// import crafttweaker.item.IIngredient;
// import crafttweaker.oredict.IOreDictEntry;
// import crafttweaker.item.IItemDefinition;
// import crafttweaker.oredict.IOreDict;
// import mods.jei.JEI.removeAndHide as h;
// import mods.gtadditions.recipe.Utils;
// 
// // Oredict for wrenches
// ore('GTWrench').addItems([item('gregtech:meta_tool', 8).withEmptyTag(), item('gregtech:meta_tool', 29).withEmptyTag(), item('gregtech:meta_tool', 30).withEmptyTag(), item('gregtech:meta_tool', 31).withEmptyTag()]);
// 
// ore('itemSilicon').add(ore('dustSilicon'));
// ore('dustQuartz').add(item('gregtech:meta_item_1:2201'));
// ore('blockCoalCoke').add(item('gregtech:meta_block_compressed_22', 5));
// ore('blockWarpCoreRim').add(ore('blockTitanium'));
// ore('blockWarpCoreRim').remove(ore('blockTitanium,blockWarpCoreRim'));
// 
// 	ore('gearNickel').remove(ore('gearNickel'));
// 	ore('itemSilicon').remove(item('enderio:item_material', 5));
// 	ore('itemSilicon').remove(ore('itemSilicon'));
// 	ore('blockCopper').remove(item('thermalfoundation:storage'));
// 	ore('blockBronze').remove(item('thermalfoundation:storage_alloy', 3));
// 	ore('blockInvar').remove(item('thermalfoundation:storage_alloy', 2));
// 	ore('blockIridium').remove(item('thermalfoundation:storage', 7));
// 	ore('blockLead').remove(item('thermalfoundation:storage', 3));
// 	ore('blockNickel').remove(item('thermalfoundation:storage', 5));
// 	ore('blockPlatinum').remove(item('thermalfoundation:storage', 6));
// 	ore('blockSilver').remove(item('thermalfoundation:storage', 2));
// 	ore('blockTin').remove(item('thermalfoundation:storage', 1));
// 	ore('blockTin').remove(item('thermalfoundation:storage', 1));
// 	ore('ingotAluminium').remove(ore('ingotAluminum'));
// 	ore('ingotLead').remove(item('thermalfoundation:material', 131));
// 	ore('ingotAluminum').remove(ore('ingotAluminum'));
// 	ore('ingotBronze').remove(item('thermalfoundation:material', 163));
// 	ore('ingotCopper').remove(item('thermalfoundation:material', 128));
// 	ore('ingotIridium').remove(item('thermalfoundation:material', 135));
// 	ore('ingotInvar').remove(item('thermalfoundation:material', 162));
// 	ore('ingotNickel').remove(item('thermalfoundation:material', 133));
// 	ore('ingotPlatinum').remove(item('thermalfoundation:material', 134));
// 	ore('ingotTin').remove(item('thermalfoundation:material', 129));
// 	ore('ingotSilver').remove(item('thermalfoundation:material', 130));
// 	ore('dustSulfur').remove(ore('dustSulfur'));
// 	ore('nuggetAluminium').remove(ore('nuggetAluminum'));
// 	ore('nuggetAluminum').remove(ore('nuggetAluminum'));
// 	ore('nuggetBronze').remove(item('thermalfoundation:material', 227));
// 	ore('nuggetCopper').remove(item('thermalfoundation:material', 192));
// 	ore('nuggetElectrum').remove(item('thermalfoundation:material', 225));
// 	ore('nuggetInvar').remove(item('thermalfoundation:material', 226));
// 	ore('nuggetIridium').remove(item('thermalfoundation:material', 199));
// 	ore('nuggetNickel').remove(item('thermalfoundation:material', 197));
// 	ore('nuggetPlatinum').remove(item('thermalfoundation:material', 198));
// 	ore('nuggetSteel').remove(item('thermalfoundation:material', 224));
// 	ore('plateAluminum').remove(ore('plateAluminum'));
// 	ore('plateBronze').remove(item('thermalfoundation:material', 355));
// 	ore('plateCopper').remove(item('thermalfoundation:material', 320));
// 	ore('plateElectrum').remove(item('thermalfoundation:material', 353));
// 	ore('plateGold').remove(item('thermalfoundation:material', 33));
// 	ore('plateInvar').remove(item('thermalfoundation:material', 354));
// 	ore('plateIridium').remove(item('thermalfoundation:material', 327));
// 	ore('plateIron').remove(item('thermalfoundation:material', 32));
// 	ore('plateLead').remove(item('thermalfoundation:material', 323));
// 	ore('plateNickel') .remove(item('thermalfoundation:material', 325));
// 	ore('platePlatinum').remove(item('thermalfoundation:material', 326));
// 	ore('plateSilver').remove(item('thermalfoundation:material', 322));
// 	ore('plateSteel').remove(item('thermalfoundation:material', 352));
// 	ore('plateTin').remove(item('thermalfoundation:material', 321));
// 	ore('ingotSteel').remove(item('thermalfoundation:material', 160));
// 	ore('circuitBasic').remove(item('gregtech:meta_item_2:32507'));
// 	ore('circuitGood').remove(item('gregtech:meta_item_2:32489'));
// 	ore('circuitGood').remove(item('gregtech:meta_item_2:32490'));
// 	ore('blockTitanium').remove(ore('blockTitanium,blockWarpCoreRim'));
// 	ore('ingotTitanium').remove(item('libvulpes:productingot', 7));
// 	ore('naquadah').add(ore('dustNaquadah'));
// 	ore('blockCopper').remove(ore('blockCopper'));
// 	ore('blockTin').remove(ore('blockTin'));
// 	ore('blockSteel').remove(ore('blockSteel'));
// 	ore('blockAluminum').remove(ore('blockAluminum'));
// 	ore('blockIridium').remove(ore('blockIridium'));
// 	ore('plateIron').remove(item('libvulpes:productplate', 1));
// 	ore('plateGold').remove(item('libvulpes:productplate', 2));
// 	ore('plateSilicon').remove(item('libvulpes:productplate', 3));
// 	ore('plateCopper').remove(item('libvulpes:productplate', 4));
// 	ore('plateTin').remove(item('libvulpes:productplate', 5));
// 	ore('plateSteel').remove(item('libvulpes:productplate', 6));
// 	ore('plateTitanium').remove(item('libvulpes:productplate', 7));
// 	ore('plateAluminum').remove(item('libvulpes:productplate', 9));
// 	ore('plateIridium').remove(item('libvulpes:productplate', 10));
// 	ore('nuggetSilicon').remove(item('libvulpes:productnugget', 3));
// 	ore('nuggetCopper').remove(item('libvulpes:productnugget', 4));
// 	ore('nuggetTin').remove(item('libvulpes:productnugget', 5));
// 	ore('nuggetSteel').remove(item('libvulpes:productnugget', 6));
// 	ore('nuggetTitanium').remove(item('libvulpes:productnugget', 7));
// 	ore('nuggetAluminum').remove(item('libvulpes:productnugget', 9));
// 	ore('nuggetIridium').remove(item('libvulpes:productnugget', 10));
// 	ore('gearSteel').remove(item('libvulpes:productgear', 6));
// 	ore('gearTitanium').remove(item('libvulpes:productgear', 7));
// 	ore('ingotIridium').remove(item('libvulpes:productingot', 10));
// 	ore('ingotAluminum').remove(item('libvulpes:productingot', 9));
// 	ore('ingotSteel').remove(item('libvulpes:productingot', 6));
// 	ore('ingotTin').remove(item('libvulpes:productingot', 5));
// 	ore('ingotCopper').remove(item('libvulpes:productingot', 4));
// 	ore('ingotSilicon').remove(item('libvulpes:productingot', 3));
// 	ore('itemSilicon').remove(item('libvulpes:productingot', 3));
// 	ore('stickIron').remove(item('libvulpes:productrod', 1));
// 	ore('stickCopper').remove(item('libvulpes:productrod', 4));
// 	ore('stickSteel').remove(item('libvulpes:productrod', 6));
// 	ore('stickTitanium').remove(item('libvulpes:productrod', 7));
// 	ore('stickIridium').remove(item('libvulpes:productrod', 10));
// 
// 	ore('blockDraconium').remove(ore('blockDraconium'));
// 	//h(ore('blockDraconium'));
// 	ore('ingotDraconium').remove(ore('ingotDraconium'));
// 	h(ore('ingotDraconium'));
// 	ore('nuggetDraconium').remove(ore('nuggetDraconium'));
// 	h(ore('nuggetDraconium'));
// 	ore('blockDraconiumAwakened').remove(ore('blockDraconiumAwakened'));
// 	//h(ore('blockDraconiumAwakened'));
// 	ore('ingotDraconiumAwakened').remove(ore('ingotDraconiumAwakened'));
// 	h(ore('ingotDraconiumAwakened'));
// 	ore('nuggetDraconiumAwakened').remove(ore('nuggetDraconiumAwakened'));
// 	h(ore('nuggetDraconiumAwakened'));
// 	ore('dustCopper').remove(ore('dustCopper'));
// 	ore('dustTin').remove(ore('dustTin'));
// 	ore('dustNickel').remove(ore('dustNickel'));
// 	ore('dustGold').remove(ore('dustGold'));
// 	ore('dustIron').remove(ore('dustIron'));
// 	ore('dustStardust').add(ore('dustAstralStarmetal'));
// 	var sift = [ore('crushedPurifiedDiamond'),ore('crushedPurifiedZircon'),ore('crushedPurifiedBlueTopaz'),ore('crushedPurifiedLignite'),ore('crushedPurifiedNetherStar'),ore('crushedPurifiedTanzanite'),ore('crushedPurifiedMonazite'),ore('crushedPurifiedSodalite'),ore('crushedPurifiedJasper'),ore('crushedPurifiedRuby'),ore('crushedPurifiedLapis'),ore('crushedPurifiedAmethyst'),ore('crushedPurifiedTopaz'),ore('crushedPurifiedApatite'),ore('crushedPurifiedQuartzite'),ore('crushedPurifiedNetherQuartz'),ore('crushedPurifiedLazurite'),ore('crushedPurifiedGreenSapphire'),ore('crushedPurifiedGarnetRed'),ore('crushedPurifiedEmerald'),ore('crushedPurifiedPrasiolite'),ore('crushedPurifiedCinnabar'),ore('crushedPurifiedVinteum'),ore('crushedPurifiedCertusQuartz'),ore('crushedPurifiedSapphire'),ore('crushedPurifiedOpal'),ore('crushedPurifiedRutile'),ore('crushedPurifiedGarnetYellow'),ore('crushedPurifiedAlmandine'),ore('crushedPurifiedOlivine'),ore('crushedPurifiedCoal'),item('gregtech:meta_item_1:6867'),ore('dustPlatinumSalt'),ore('dustPalladiumSalt'),ore('dustRhodiumNitrate'),item('gregtech:meta_item_1:6525'),item('gregtech:meta_item_1:6357')] as IItemStack[];
// for i in sift{
// 	ore('siftable').add(i);
// }
// 
// var gem = [ore('gemDiamond'),ore('gemEmerald'),ore('gemNetherStar,netherStar'),ore('crystalCinnabar,itemCinnabar'),ore('gemGreenSapphire'),ore('gemRutile'),ore('dyeBlue,gemLazurite'),ore('gemRuby'),ore('gemSapphire'),ore('dyeBlue,gemSodalite'),ore('gemTanzanite'),ore('gemTopaz'),ore('crystalCertusQuartz,gemCertusQuartz'),ore('gemQuartzite'),ore('gemJasper'),ore('gemGlass'),ore('gemOlivine'),ore('gemOpal'),ore('gemAmethyst'),ore('gemApatite'),ore('gemGarnetRed'),ore('gemGarnetYellow'),ore('gemVinteum'),ore('gemMonazite'),item('gregtech:meta_item_1:8525'),ore('gemZircon'),ore('gemRhodiumSalt'),ore('gemPrasiolite'),ore('coal,gemCoal,itemCoal'),ore('gemLignite'),ore('fuelCoke'),ore('dye,dyeBlue,gemLapis'),ore('gemBlueTopaz'),ore('gemNetherQuartz,gemQuartz'),ore('gemAlmandine')] as IItemStack[];
// 
// 
// for f in gem{
// 	ore('gemStandard').add(f);
// }
// 
// var fuel = [item('gtadditions:ga_meta_item:17786'),item('gtadditions:ga_meta_item:17798'),item('gtadditions:ga_meta_item:17797'),item('gtadditions:ga_meta_item:17815'),item('gtadditions:ga_meta_item:17822'),item('gtadditions:ga_meta_item:17824'),item('gtadditions:ga_meta_item:17778'),item('gtadditions:ga_meta_item:17779'),item('gtadditions:ga_meta_item:17002'),item('gtadditions:ga_meta_item:17810'),item('gtadditions:ga_meta_item:17800'),item('gtadditions:ga_meta_item:17807'),item('gtadditions:ga_meta_item:17806'),item('gtadditions:ga_meta_item:17821'),item('gtadditions:ga_meta_item:17801'),item('gtadditions:ga_meta_item:17777'),item('gtadditions:ga_meta_item:17818'),item('gtadditions:ga_meta_item:17808'),item('gtadditions:ga_meta_item:17808'),item('gtadditions:ga_meta_item:17794'),item('gtadditions:ga_meta_item:17781'),item('gtadditions:ga_meta_item:17811'),item('gtadditions:ga_meta_item:17787'),item('gtadditions:ga_meta_item:17792'),item('gtadditions:ga_meta_item:17814'),item('gtadditions:ga_meta_item:17825'),item('gtadditions:ga_meta_item:17823'),item('gtadditions:ga_meta_item:17799'),item('gtadditions:ga_meta_item:17816'),item('gtadditions:ga_meta_item:17053'),item('gtadditions:ga_meta_item:17785'),item('gtadditions:ga_meta_item:17813'),item('gtadditions:ga_meta_item:17796'),item('gtadditions:ga_meta_item:17791'),item('gtadditions:ga_meta_item:17817'),item('gtadditions:ga_meta_item:17783'),item('gtadditions:ga_meta_item:17809'),item('gtadditions:ga_meta_item:17802'),item('gtadditions:ga_meta_item:17790'),item('gtadditions:ga_meta_item:17804'),item('gtadditions:ga_meta_item:17076'),item('gtadditions:ga_meta_item:17789'),item('gtadditions:ga_meta_item:17780'),item('gtadditions:ga_meta_item:17819')]  as IItemStack[];
// 
// for E in fuel{
// 	Utils.removeRecipeByOutput(extruder, [E], [], true);
// h(E);
// }
// 
// //nuclear clean up
// for e in ore('depletedFuelTRISO*'){
// 	h(e.firstItem);
// 
// }
// 
// for e in ore('fuelTRISO*'){
// 	h(e.firstItem);
// }
// 
// for e in ore('fuelCarbide*'){
// 	h(e.firstItem);
// 
// }
// for e in ore('carbide*'){
// 	h(e.firstItem);
// 
// 
// }
// 
// for e in ore('depletedFuelZirconiumAlloy*'){
// 	h(e.firstItem);
// 
// }
// 
// for e in ore('fuelZirconiumAlloy*'){
// 	h(e.firstItem);
// }
// 
// 
// for e in ore('fuelNitride*'){
// 	h(e.firstItem);
// }
// var plant = [item('futuremc:wither_rose'),item('minecraft:red_flower'),item('minecraft:red_flower', 1),item('minecraft:red_flower', 2),item('minecraft:red_flower', 3),item('minecraft:red_flower', 4),item('minecraft:red_flower', 5),item('minecraft:red_flower', 6),item('minecraft:red_flower', 7),item('minecraft:yellow_flower'),item('minecraft:double_plant', 1),item('futuremc:lily_of_the_valley'),item('futuremc:cornflower'),item('minecraft:double_plant'),item('minecraft:double_plant', 4),item('minecraft:double_plant', 5),item('minecraft:red_flower', 8),item('minecraft:waterlily'),ore('dye,dyeBrown')]as IItemStack[];
// 
// for i in plant{
// 
// green_house.recipeBuilder()
//     .notConsumable(i)
//     .inputs(ore('dustBone,dye,dyeWhite'))
//     .fluidInputs(fluid('water') * 2000)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 1}))
//     .outputs([i])
//     .duration(160)
//     .EUt(14)
//     .buildAndRegister();
// 
// green_house.recipeBuilder()
//     .notConsumable(i)
//     .inputs(ore('dustOrganicFertilizer'))
//     .fluidInputs(fluid('water') * 2000)
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 2}))
//     .outputs([i * 2])
//     .duration(160)
//     .EUt(14)
// 	.buildAndRegister();
// 
// }
// //hide Vulps dust
// h(item('libvulpes:productdust', 1));
// h(item('libvulpes:productdust', 2));
// h(item('libvulpes:productdust', 3));
// h(item('libvulpes:productdust', 4));
// h(item('libvulpes:productdust', 6));
// h(item('libvulpes:productdust', 7));
// h(ore('dustAluminum'));
// h(item('libvulpes:productdust', 10));
// //hide Vulps ingots
// h(item('libvulpes:productingot', 3));
// h(item('libvulpes:productingot', 4));
// h(item('libvulpes:productingot', 5));
// h(item('libvulpes:productingot', 6));
// h(item('libvulpes:productingot', 7));
// h(item('libvulpes:productingot', 9));
// h(item('libvulpes:productingot', 10));
// //hide Vulps nuggets
// h(item('libvulpes:productnugget', 3));
// h(item('libvulpes:productnugget', 4));
// h(item('libvulpes:productnugget', 5));
// h(item('libvulpes:productnugget', 6));
// h(item('libvulpes:productnugget', 7));
// h(item('libvulpes:productnugget', 9));
// h(item('libvulpes:productnugget', 10));
// //hide Vulps ingot blocks
// h(ore('blockCopper'));
// h(ore('blockTin'));
// h(ore('blockSteel'));
// h(ore('blockAluminum'));
// h(ore('blockIridium'));
// //hide Vulps plates
// h(item('libvulpes:productplate', 1));
// h(item('libvulpes:productplate', 2));
// h(item('libvulpes:productplate', 3));
// h(item('libvulpes:productplate', 4));
// h(item('libvulpes:productplate', 5));
// h(item('libvulpes:productplate', 6));
// h(item('libvulpes:productplate', 7));
// h(item('libvulpes:productplate', 9));
// h(item('libvulpes:productplate', 10));
// //hide Vulps rods
// h(item('libvulpes:productrod', 1));
// h(item('libvulpes:productrod', 4));
// h(item('libvulpes:productrod', 6));
// h(item('libvulpes:productrod', 7));
// h(item('libvulpes:productrod', 10));
// //hide Vulps sheets
// h(ore('sheetIron'));
// h(ore('sheetCopper'));
// h(ore('sheetSteel'));
// h(ore('sheetTitanium'));
// h(ore('sheetAluminum'));
// //hide Vulps gear
// h(item('libvulpes:productgear', 6));
// h(item('libvulpes:productgear', 7));
// //hide EIO Dust
// h(item('enderio:item_material', 21));
// h(ore('dustIron'));
// h(ore('dustGold'));
// h(ore('dustCopper'));
// h(ore('dustTin'));
// h(ore('nuggetEnderpearl'));
// h(ore('dustObsidian'));
// h(ore('dustLapis'));
// h(ore('dustNetherQuartz'));
// h(ore('itemPowderPhotovoltaic'));
// h(item('enderio:item_capacitor_silver'));
// h(item('enderio:item_capacitor_energetic_silver'));
// //hide TE Dust
// h(ore('dustCoal'));
// h(ore('dustCharcoal'));
// h(ore('dustObsidian'));
// h(ore('dustWood,itemSawdust'));
// h(item('thermalfoundation:material', 801));
// h(ore('crystalSlag,itemSlag'));
// h(ore('crystalSlagRich,itemSlagRich'));
// h(item('thermalfoundation:material', 866));
// h(ore('clathrateOil,crystalCrudeOil'));
// h(ore('clathrateRedstone,crystalRedstone'));
// h(ore('clathrateGlowstone,crystalGlowstone'));
// h(ore('clathrateEnder,crystalEnder'));
// h(ore('dustMana'));
// h(ore('dustIron'));
// h(ore('dustGold'));
// h(ore('dustCopper'));
// h(ore('dustTin'));
// h(ore('dustSilver'));
// h(ore('dustLead'));
// h(ore('dustAluminum'));
// h(ore('dustNickel'));
// h(ore('dustPlatinum'));
// h(ore('dustBronze'));
// h(ore('dustIridium'));
// h(ore('dustMithril'));
// h(ore('dustSteel'));
// h(ore('dustElectrum'));
// h(ore('dustInvar'));
// h(ore('dustConstantan'));
// h(ore('dustEnderium'));
// //hid TE blocks
// h(ore('gearNickel'));
// h(item('thermalfoundation:storage', 1));
// h(item('thermalfoundation:storage_alloy'));
// h(item('thermalfoundation:storage_alloy', 1));
// h(item('thermalfoundation:storage_alloy', 2));
// h(item('thermalfoundation:storage', 2));
// h(item('thermalfoundation:storage', 3));
// h(item('thermalfoundation:storage_alloy', 3));
// h(ore('blockConstantan'));
// h(item('thermalfoundation:storage'));
// h(item('thermalfoundation:storage', 4));
// h(item('thermalfoundation:storage', 5));
// h(item('thermalfoundation:storage', 6));
// h(item('thermalfoundation:storage', 7));
// h(ore('blockMithril'));
// h(item('thermalfoundation:storage_alloy', 7));
// h(item('thermalfoundation:material', 192));
// h(item('thermalfoundation:material', 193));
// h(item('thermalfoundation:material', 194));
// h(item('thermalfoundation:material', 195));
// h(ore('nuggetAluminum'));
// h(item('thermalfoundation:material', 197));
// h(item('thermalfoundation:material', 199));
// h(item('thermalfoundation:material', 198));
// h(ore('nuggetMithril'));
// h(item('thermalfoundation:material', 224));
// h(item('thermalfoundation:material', 225));
// h(item('thermalfoundation:material', 226));
// h(item('thermalfoundation:material', 227));
// h(ore('nuggetConstantan'));
// h(item('thermalfoundation:material', 231));
// 
// 
// 
// // remove TE ingots
// h(item('thermalfoundation:material', 162));
// h(item('thermalfoundation:material', 163));
// h(ore('ingotConstantan'));
// h(item('thermalfoundation:material', 161));
// h(item('thermalfoundation:material', 160));
// h(ore('ingotAluminum'));
// h(item('thermalfoundation:material', 135));
// h(item('thermalfoundation:material', 134));
// h(item('thermalfoundation:material', 133));
// h(item('thermalfoundation:material', 128));
// h(item('thermalfoundation:material', 129));
// h(item('thermalfoundation:material', 130));
// h(item('thermalfoundation:material', 131));
// //Hide AR stuff
// h(ore('ingotTitaniumIridium'));
// h(ore('ingotTitaniumAluminide'));
// h(ore('dustTitaniumIridium'));
// h(ore('dustTitaniumAluminide'));
// h(ore('nuggetTitaniumAluminide'));
// h(ore('nuggetTitaniumIridium'));
// h(ore('plateTitaniumAluminide'));
// h(ore('plateTitaniumIridium'));
// h(ore('stickTitaniumAluminide'));
// h(ore('stickTitaniumIridium'));
// h(ore('sheetTitaniumAluminide'));
// h(ore('gearTitaniumIridium'));
// h(item('advancedrocketry:deployablerocketbuilder'));
// h(item('advancedrocketry:liquidtank'));
// h(item('advancedrocketry:intake'));
// h(item('advancedrocketry:terraformer'));
// h(ore('gearTitaniumAluminide'));
// h(item('advancedrocketry:spaceelevatorcontroller'));
// h(item('advancedrocketry:beacon'));
// h(item('advancedrocketry:blockpump'));
// h(item('advancedrocketry:centrifuge'));
// h(item('advancedrocketry:railgun'));
// h(item('advancedrocketry:forcefieldprojector'));
// h(item('advancedrocketry:forcefield'));
// h(item('advancedrocketry:lathe'));
// h(item('advancedrocketry:rollingmachine'));
// h(item('advancedrocketry:platepress'));
// h(item('advancedrocketry:electrolyser'));
// h(item('advancedrocketry:chemicalreactor'));
// h(item('advancedrocketry:planetanalyser'));
// h(item('advancedrocketry:satellitecontrolcenter'));
// h(item('advancedrocketry:blackholegenerator'));
// h(item('advancedrocketry:observatory'));
// h(item('advancedrocketry:cuttingmachine'));
// h(item('advancedrocketry:crystallizer'));
// h(item('advancedrocketry:loader'));
// h(item('enderio:item_data_conduit'));
// h(item('advancedrocketry:dataunit'));
// h(item('advancedrocketry:sawbladeiron'));
// h(item('advancedrocketry:satellitepowersource'));
// h(item('advancedrocketry:satellitepowersource', 1));
// h(item('advancedrocketry:satelliteprimaryfunction', 1));
// h(item('advancedrocketry:satelliteprimaryfunction', 2));
// h(item('advancedrocketry:satelliteprimaryfunction', 3));
// h(item('advancedrocketry:satelliteprimaryfunction', 4));
// h(item('advancedrocketry:satelliteprimaryfunction', 5));
// h(item('advancedrocketry:orescanner'));
// h(item('advancedrocketry:beaconfinder'));
// h(item('advancedrocketry:itemupgrade', 4));
// h(item('advancedrocketry:itemupgrade'));
// h(item('advancedrocketry:itemupgrade', 1));
// h(item('advancedrocketry:itemupgrade', 2));
// h(item('advancedrocketry:itemupgrade', 3));
// h(item('advancedrocketry:atmanalyser'));
// h(item('advancedrocketry:basiclasergun'));
// h(ore('sheetTitaniumIridium'));
// h(ore('blockTitaniumAluminide'));
// h(item('advancedrocketry:wirelesstransciever'));
// h(item('advancedrocketry:loader', 2));
// h(item('advancedrocketry:satellite'));
// h(ore('blockTitaniumIridium'));
// h(item('advancedrocketry:loader', 3));
// h(item('advancedrocketry:loader', 6));
// h(item('advancedrocketry:blastbrick'));
// h(item('advancedrocketry:iquartzcrucible'));
// h(item('advancedrocketry:precisionassemblingmachine'));
// h(item('advancedrocketry:satelliteprimaryfunction'));
// h(item('advancedrocketry:satellitebuilder'));
// h(item('libvulpes:hatch', 1));
// h(item('libvulpes:hatch', 2));
// h(item('libvulpes:hatch', 3));
// h(item('libvulpes:forgepoweroutput'));
// h(item('libvulpes:forgepowerinput'));
// h(ore('blockTitanium,blockWarpCoreRim'));
// h(ore('blockCoil,coilIridium'));
// h(item('libvulpes:productdust', 5));
// h(ore('blockMotor'));
// h(ore('blockMotor'));
// h(ore('casingCentrifuge'));
// h(item('libvulpes:gtplug'));
// h(ore('blockCoil,coilGold'));
// h(ore('blockCoil,coilCopper'));
// h(ore('blockCoil,coilTitanium'));
// h(ore('blockCoil,coilAluminum'));
// h(item('libvulpes:battery'));
// h(item('libvulpes:battery', 1));
// h(ore('blockMotor'));
// h(ore('blockMotor'));
// h(item('libvulpes:coalgenerator'));
// h(ore('blockElectrum'));
// h(item('advancedrocketry:sawblade'));
// h(item('advancedrocketry:microwavereciever'));
// h(ore('bookshelf,bookshelfOak'));
// h(item('advancedrocketry:solargenerator'));
// h(ore('blockBronze'));
// h(item('advancedrocketry:pipesealer'));
// h(item('advancedrocketry:hovercraft'));
// h(item('advancedrocketry:jackhammer'));
// h(item('advancedrocketry:arcfurnace'));
// h(item('advancedrocketry:geode'));
// h(item('advancedrocketry:oxygendetection'));
// h(item('advancedrocketry:elevatorchip'));
// h(item('advancedrocketry:satelliteidchip'));
// h(item('advancedrocketry:asteroidchip'));
// h(ore('concrete'));
// h(item('advancedrocketry:monitoringstation'));
// h(item('advancedrocketry:biomescanner'));
// 
// h(item('advancedrocketry:planetholoselector'));
// h(item('advancedrocketry:ic', 3));
// h(item('advancedrocketry:ic', 4));
// h(item('advancedrocketry:ic', 5));
// h(item('advancedrocketry:planetselector'));
// 
// h(item('advancedrocketry:planetselector'));
// h(item('variegated:silvered_apple'));
// h(item('variegated:silvered_apple', 1));
// h(item('appliedenergistics2:part', 260));
// h(item('extracells:part.base', 12));

// 
// 
// /*
// h(item('gregtech:meta_item_2:32507'));
// h(item('gregtech:meta_item_2:32490'));
// h(item('gregtech:meta_item_2:32489'));
// h(item('gregtech:meta_item_1:10712'));
// h(item('gregtech:meta_item_1:9712'));
// */
// 
// //ae2 stuff
// crafting.removeByOutput(item('threng:machine', 2));
// crafting.removeByOutput(item('appliedenergistics2:interface'));
// crafting.removeByOutput(item('appliedenergistics2:fluid_interface'));
// crafting.removeByOutput(item('threng:machine', 1));
// crafting.removeByOutput(item('threng:machine'));
// crafting.removeByOutput(item('threng:machine', 3));
// crafting.removeByOutput(item('threng:machine', 4));
// crafting.removeByOutput(item('threng:machine', 5));
// crafting.removeByOutput(item('appliedenergistics2:energy_acceptor'));
// crafting.removeByOutput(item('appliedenergistics2:material', 52));
// crafting.removeByOutput(item('actuallyadditions:block_display_stand'));
// crafting.removeByOutput(item('actuallyadditions:block_empowerer'));
// h(item('actuallyadditions:block_display_stand'));
// h(item('actuallyadditions:block_empowerer'));
// crafting.removeByOutput(item('actuallyadditions:block_misc', 9));
// 
// furnace.removeByOutput(item('gregtech:meta_item_1:10712'));
// item('draconicevolution:draconium_block', 1).addTooltip(format.darkRed("Do not place this block in world"));
// crafting.removeByOutput(item('snad:snad', 1));
// crafting.removeByOutput(item('snad:snad'));
// h(item('advancedrocketry:oxygenfluid'));
// h(item('advancedrocketry:hydrogenfluid'));
// h(item('advancedrocketry:rocketfuel'));
// h(item('advancedrocketry:nitrogenfluid'));
// h(item('advancedrocketry:enrichedlavafluid'));
// h(item('gregtech:machine', 526));
// h(item('gregtech:machine', 527));
// h(item('gregtech:mte', 17));
// h(item('gregtech:mte', 18));
// h(item('gregtech:mte', 13));
// h(item('appliedenergistics2:vibration_chamber'));
// h(item('thermalfoundation:storage_resource', 1));
// h(item('thermalfoundation:material', 802));
// //h(item('danknull:dank_null_1'));
// h(item('danknull:dank_null_2'));
// h(item('danknull:dank_null_3'));
// h(item('danknull:dank_null_4'));
// h(item('danknull:dank_null_5'));
// h(item('danknull:dank_null_6'));
// //h(item('danknull:dank_null_panel_1'));
// h(item('danknull:dank_null_panel_2'));
// h(item('danknull:dank_null_panel_3'));
// h(item('danknull:dank_null_panel_4'));
// h(item('danknull:dank_null_panel_5'));
// h(item('danknull:danknull_dock'));
// h(item('gregtech:machine:2005'));
// h(item('extracells:storage.fluid', 5).withNbt({fuzzyMode: "IGNORE_ALL"}));
// h(item('extracells:storage.fluid', 6).withNbt({fuzzyMode: "IGNORE_ALL"}));
// h(item('extracells:storage.component', 9));
// h(item('extracells:storage.component', 10));
// h(item('actuallyadditions:block_atomic_reconstructor'));
// h(item('mob_grinding_utils:wither_muffler'));
// h(item('mob_grinding_utils:saw_upgrade', 5));
// h(item('mob_grinding_utils:gm_chicken_feed'));
// h(item('mob_grinding_utils:mob_swab'));
// h(item('mob_grinding_utils:dark_oak_stone'));
// h(item('mob_grinding_utils:saw_upgrade', 1));
// 
// //DE
// h(item('draconicevolution:draconium_chest'));
// h(item('draconicevolution:flow_gate'));
// h(item('draconicevolution:flow_gate', 8));
// h(item('draconicevolution:reactor_part', 4));
// h(item('draconicevolution:reactor_component'));
// h(item('draconicevolution:reactor_component', 1));
// h(item('draconicevolution:reactor_part', 1));
// h(item('draconicevolution:reactor_part'));
// h(item('draconicevolution:reactor_part', 2));
// h(item('draconicevolution:reactor_part', 3));
// h(item('draconicevolution:reactor_core'));
// h(item('draconicevolution:crafting_injector', 2));
// h(item('draconicevolution:crafting_injector', 1));
// h(item('draconicevolution:crafting_injector'));
// //h(item('draconicadditions:chaos_stabilizer_core'));
// h(item('gregtech:machine', 811));
// h(item('draconicadditions:basic_shield_necklace'));
// h(item('draconicadditions:wyvern_shield_necklace'));
// h(item('draconicadditions:draconic_shield_necklace'));
// h(item('draconicadditions:overload_belt'));
// h(item('draconicadditions:inertia_cancel_ring'));
// 
// h(item('gcyl:gcyl_meta_item', 230));
// h(item('gcyl:gcyl_meta_item', 231));
// var megnet = [ore('circuitUlv'),ore('circuitLv'),ore('circuitMv'),ore('circuitHv'),ore('circuitEv'),ore('circuitIv'),ore('circuitLuv'),ore('circuitZpm'),ore('circuitUv'),ore('circuitUhv'),ore('circuitUev')] as IItemStack[];
// var circuitdict = [ore('circuitPrimitive'),ore('circuitBasic'),ore('circuitGood'),ore('circuitHv'),ore('circuitEv'),ore('circuitIv'),ore('circuitMaster'),ore('circuitZpm'),ore('circuitSuperconductor'),ore('circuitInfinite'),ore('circuitUev')] as IOreDictEntry[];
// 
// for i in 0 to 11{
// 	circuitdict[i].remove(megnet[i]);
// 	h(megnet[i]);
// 	Utils.removeRecipeByOutput(circuit_assembler, [megnet[i]], [], false);
// }
// h(item('enderio:block_solar_panel', 3));
// h(item('enderio:block_solar_panel'));
// h(item('enderio:block_solar_panel', 1));
// h(item('enderio:block_solar_panel', 2));
// h(item('gregtech:machine:4212'));
// h(item('gregtech:meta_item_1:32750'));
// h(item('gregtech:meta_item_1:32751'));
// h(ore('itemPlatePhotovoltaic'));
// h(item('enderio:block_solar_panel'));
// h(item('enderio:block_solar_panel', 1));
// h(item('enderio:block_solar_panel', 2));
// h(item('enderio:block_solar_panel', 3));
// h(item('enderio:block_solar_panel', 4));
// h(item('enderio:block_solar_panel', 5));
// h(item('enderio:block_solar_panel', 5));
// h(item('enderio:block_solar_panel', 6));
// h(item('enderio:item_dark_steel_upgrade', 1).withNbt({"enderio:dsu": "enderiomachines:solar"}));
// h(item('enderio:item_dark_steel_upgrade', 1).withNbt({"enderio:dsu": "enderiomachines:solar", "enderio:enabled": 1 as byte}));
// h(item('enderio:item_dark_steel_upgrade', 1).withNbt({"enderio:dsu": "enderiomachines:solar1"}));
// h(item('enderio:item_dark_steel_upgrade', 1).withNbt({"enderio:dsu": "enderiomachines:solar1", "enderio:enabled": 1 as byte}));
// h(item('enderio:item_dark_steel_upgrade', 1).withNbt({"enderio:dsu": "enderiomachines:solar2"}));
// h(item('enderio:item_dark_steel_upgrade', 1).withNbt({"enderio:dsu": "enderiomachines:solar2", "enderio:enabled": 1 as byte}));
// h(item('enderio:item_dark_steel_upgrade', 1).withNbt({"enderio:dsu": "enderiomachines:solar3"}));
// h(item('enderio:item_dark_steel_upgrade', 1).withNbt({"enderio:dsu": "enderiomachines:solar3", "enderio:enabled": 1 as byte}));
// //h(item('gcyl:mte', 18));
// //h(ore('itemPrecientPowder'));
// h(ore('itemVibrantPowder'));
// //h(ore('itemPulsatingPowder'));
// //h(ore('itemEnderCrystalPowder'));
// h(item('compactmachines3:machine', 5));
// h(item('compactmachines3:machine', 1));
// h(item('compactmachines3:machine', 2));
// h(item('compactmachines3:machine', 4));
// h(item('compactmachines3:machine', 3));
// h(item('compactmachines3:machine'));