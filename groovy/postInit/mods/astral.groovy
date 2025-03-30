// import mods.astralsorcery.Altar as Altar;
// import mods.astralsorcery.Grindstone as grinder;
// import mods.astralsorcery.StarlightInfusion as StarInfusion;
// import mods.astralsorcery.LightTransmutation as LightTransmutation;
// import mods.astralsorcery.LiquidInteraction as Interaction;
// import mods.astralsorcery.Utils as util;
// import mods.astralsorcery.Lightwell as well;
// import mods.chisel.Carving;
// import crafttweaker.item.IItemStack;
// import crafttweaker.item.IIngredient;
// import scripts.commonNames;
// import mods.gtadditions.recipe.Utils as GAutil;
// 
// mods.chisel.Carving.removeVariation("marble", ore('blockMarble,stoneMarble'));
// 
// /*
// EX for ALTER
// removeAltarRecipe(String recipeRegistryName)
// addDiscoveryAltarRecipe(String recipeRegistryName, IItemStack output, int starlightRequired, int craftingTickTime, IIngredient[] inputs) # of items 9
// addAttunementAltarRecipe(String recipeRegistryName, IItemStack output, int starlightRequired, int craftingTickTime, IIngredient[] inputs) # 13
// addConstellationAltarRecipe(String recipeRegistryName, IItemStack output, int starlightRequired, int craftingTickTime, IIngredient[] inputs) # 21
// addTraitAltarRecipe(String recipeRegistryName, IItemStack output, int starlightRequired, int craftingTickTime, IIngredient[] inputs, @Nullable String iRequiredConstellationFocusName) #25
// 
// FOR GrindStone
// removeRecipe(IItemStack output)
// addRecipe(IOreDictEntry oreDict, IItemStack output, float doubleChance)
// 
// FOR Infusion
// removeInfusion(IItemStack output)
// addInfusion(IItemStack input, IItemStack output, boolean consumeMultiple, float consumptionChance, int craftingTickTime)
// 
// FOR lightTransmutations
// removeTransmutation(IItemStack stackToRemove, boolean matchMeta)
// addTransmutation(IItemStack stackIn, IItemStack stackOut, double cost, String requiredConstellation)
// addTransmutation(IItemStack stackIn, IItemStack stackOut, double cost)
// 
// FOR Starlight interactions
// removeInteraction(ILiquidStack liquid1, ILiquidStack liquid2, IItemStack output)
// addInteraction(ILiquidStack liquidIn1, float chanceConsumption1, ILiquidStack liquidIn2, float chanceConsumption2, int weight, IItemStack output)
// 
// FOR untils
// getCrystalORIngredient(boolean hasToBeCelestial, boolean hasToBeAttuned)
// 
// FOR LightWell
// removeLiquefaction(IItemStack input, ILiquidStack output)
// addLiquefaction(IItemStack input, ILiquidStack output, float productionMultiplier, float shatterMultiplier, int colorhex)
// */
// 
// //LightTransmutation.removeTransmutation()
// 
// //Infusion
// StarInfusion.removeInfusion(ore('ingotIron') * 3);
// StarInfusion.removeInfusion(ore('ingotGold') * 3);
// StarInfusion.removeInfusion(ore('gemEmerald') * 4);
// StarInfusion.removeInfusion(ore('gemDiamond')* 4);
// StarInfusion.removeInfusion(item('minecraft:lapis_block'));
// StarInfusion.removeInfusion(item('minecraft:redstone_block'));
// StarInfusion.removeInfusion(item('astralsorcery:itemcraftingcomponent:4'));
// StarInfusion.removeInfusion(item('astralsorcery:itemcraftingcomponent:3'));
// StarInfusion.addInfusion(ore('craftingLensWhite,lensNetherStar'), item('astralsorcery:itemcraftingcomponent:3'), false,  0.8f, 80);
// //Transmutation
// LightTransmutation.removeTransmutation(ore('endstone,oc:stoneEndstone,stoneEndstone'),false);
// LightTransmutation.removeTransmutation(item('minecraft:emerald_ore'),false);
// LightTransmutation.removeTransmutation(item('minecraft:glass_pane'),false);
// LightTransmutation.addTransmutation(ore('oreMagnetite'),  ore('oreAstralStarmetal'), 100);
// LightTransmutation.addTransmutation(ore('oreVanadiumMagnetite'),  ore('oreAstralStarmetal'), 100);
// LightTransmutation.addTransmutation(ore('oreIron'),  ore('oreAstralStarmetal'), 100);
// /*
// var GrindRemove = [ore('dustGold'),ore('dustIron'),ore('dustLapis'),ore('dustDiamond'),ore('dustRedstone'),ore('dustEmerald'),ore('dustNetherQuartz,dustQuartz'),ore('dustCoal'),ore('dustCopper'),ore('dustTin'),ore('dustSilver'),ore('dustLead'),ore('dustAluminum'),ore('dustNickel'),ore('dustPlatinum'),ore('dustMithril'),ore('dustQuartzBlack'),ore('dustIridium'),ore('dustCertusQuartz'),item('libvulpes:productdust:7'),ore('dustSaltpeter')] as IItemStack[];
// for i in GrindRemove{
// grinder.removeRecipe(i);
// }
// grinder.addRecipe( , , 85);
// grinder.addRecipe(ore('oreGold'), item('gregtech:meta_item_1:2026'), 0.50f);
// grinder.addRecipe(ore('oreLapis'),ore('dustLapis,dyeBlue') * 6, 0.50f);
// grinder.addRecipe(ore('oreDiamond'), ore('dustDiamond'), 0.50f);
// grinder.addRecipe(ore('oreRedstone') ,ore('dustRedstone') * 6, 0.50f);
// grinder.addRecipe(ore('oreEmerald'),ore('dustEmerald'), 0.50f);
// grinder.addRecipe(ore('oreSilver'), ore('dustSilver'), 0.50f);
// grinder.addRecipe(ore('oreLead'), ore('dustLead'), 0.50f);
// grinder.addRecipe(ore('oreNickel'), ore('dustNickel'), 0.50f);
// grinder.addRecipe(item('gregtech:ore_certus_quartz_0:1'), item('gregtech:meta_item_1:2202') * 2, 0.50f);
// grinder.addRecipe(ore('oreSaltpeter'), ore('dustSaltpeter') * 4, 0.50f);
// */
// grinder.addRecipe(ore('oreNetherQuartz'), item('gregtech:meta_item_1:2201') * 2, 0.50f);
// grinder.addRecipe(ore('oreCoal'), ore('dustCoal'), 0.50f);
// grinder.addRecipe(ore('oreCopper'),ore('dustCopper'), 0.50f);
// grinder.addRecipe(ore('oreTin'), ore('dustTin'), 0.50f);
// grinder.addRecipe(ore('oreIron'),ore('dustIron'), 0.50f);
// grinder.addRecipe(ore('ingotCopper'), ore('dustCopper'), 0.0f);
// grinder.addRecipe(ore('ingotTin'), ore('dustTin'), 0.0f);
// grinder.addRecipe(ore('ingotIron'),ore('dustIron'), 0.0f);
// grinder.addRecipe(ore('ingotNickel'), ore('dustNickel'), 0.0f);
// 
// //ALTER removals
// Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/grindstone");
// Altar.removeAltarRecipe("astralsorcery:shaped/block_starmetal");
// Altar.removeAltarRecipe("astralsorcery:shaped/ingot_starmetal");
// Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/marble_runed");
// Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/treebeacon");
// Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/upgrade_tier2");
// Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/lightwell");
// Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/glasslens");
// Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/chalice");
// Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/upgrade_tier3");
// Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/upgrade_tier4");
// Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/illuminator");
// Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/tool_linking");
// val rock_crystal = util.getCrystalORIngredient(false, false);
// 
// Altar.addDiscoveryAltarRecipe("technological_journey/internal/upgrade_tier2", item('astralsorcery:blockaltar:1'), 200, 300,[ore('stoneMarble'),rock_crystal,ore('stoneMarble'),ore('blockMarble,stoneMarble'),ore('plateDoubleTungstenSteel'),ore('blockMarble,stoneMarble'),ore('stoneMarble'),ore('plateDoubleTungstenSteel'),ore('stoneMarble')]);
// Altar.addDiscoveryAltarRecipe("technological_journey/internal/glasslens", item('astralsorcery:itemcraftingcomponent:3'), 5, 300,[null,ore('craftingLensWhite,lensNetherStar'),null,ore('craftingLensWhite,lensNetherStar'),ore('gemAquamarine'),ore('craftingLensWhite,lensNetherStar'),null,ore('craftingLensWhite,lensNetherStar'),null]);
// Altar.addDiscoveryAltarRecipe("technological_journey/internal/illuminator", item('astralsorcery:blockworldilluminator:0'), 200, 300,[item('astralsorcery:itemusabledust:0'),ore('gemAquamarine'),item('astralsorcery:itemusabledust:0'),ore('gemAquamarine'),null,ore('gemAquamarine'),item('astralsorcery:itemusabledust:0'),ore('gemAquamarine'),item('astralsorcery:itemusabledust:0')]);
// Altar.addDiscoveryAltarRecipe("technological_journey/internal/lightwell", item('astralsorcery:blockwell:0'), 700, 300, [ore('blockMarble,stoneMarble'), ore('gemAquamarine') ,ore('blockMarble,stoneMarble'),item('gregtech:meta_item_1:13883'),item('gtadditions:ga_transparent_casing:4'),item('gregtech:meta_item_1:13883'),ore('blockMarble,stoneMarble'),item('gregtech:meta_item_1:13047'),ore('blockMarble,stoneMarble')]);
// Altar.addDiscoveryAltarRecipe("technological_journey/internal/tool_linking", item('astralsorcery:itemlinkingtool:0'), 5,  300, [ore('stickWood'),ore('gemAquamarine'),rock_crystal,ore('stickWood'),ore('logWood'),ore('gemAquamarine'),ore('logWood'),ore('stickWood'),ore('stickWood')]); # of items 9
// 
// Altar.addAttunementAltarRecipe("technological_journey/internal/upgrade_tier3", item('astralsorcery:blockaltar:2'), 500, 300,[item('astralsorcery:itemcraftingcomponent:4'),null,item('astralsorcery:itemcraftingcomponent:4'),ore('blockMarble,stoneMarble'),util.getCrystalORIngredient(true, false),ore('blockMarble,stoneMarble'),ore('plateDoubleRhodiumPlatedPalladium'),ore('ingotAstralStarmetal'),ore('plateDoubleRhodiumPlatedPalladium'),ore('dustAstralStarmetal'),ore('dustAstralStarmetal'),ore('ingotAstralStarmetal'),ore('ingotAstralStarmetal')]);
// Altar.addConstellationAltarRecipe("technological_journey/internal/chalice", item('astralsorcery:blockchalice:0') , 450 ,300 , [item('gtadditions:ga_transparent_casing:4'),item('gregtech:mte:1616'),item('gtadditions:ga_transparent_casing:4'),item('gtadditions:ga_transparent_casing:4'),null,item('gtadditions:ga_transparent_casing:4'),ore('plateDoubleRhodiumPlatedPalladium'),ore('plateDoubleRhodiumPlatedPalladium'),ore('plateDoubleRhodiumPlatedPalladium'),ore('ingotAstralStarmetal'),ore('ingotAstralStarmetal'),ore('ingotAstralStarmetal'),ore('ingotAstralStarmetal'),item('astralsorcery:itemcraftingcomponent:4'),item('astralsorcery:itemcraftingcomponent:4'),ore('gemAquamarine'),ore('gemAquamarine'),ore('dustAstralStarmetal'),ore('dustAstralStarmetal'),ore('ingotAstralStarmetal'),ore('ingotAstralStarmetal')]); # 21
// Altar.addConstellationAltarRecipe("technological_journey/internal/upgrade_tier4", item('astralsorcery:blockaltar:3'),  800, 400, [ore('blockMarble,stoneMarble'),item('astralsorcery:itemcraftingcomponent:3'),ore('blockMarble,stoneMarble'),item('gregtech:meta_item_1:12524'),util.getCrystalORIngredient(true, false),item('gregtech:meta_item_1:12524'),ore('blockMarble,stoneMarble'),item('astralsorcery:itemcraftingcomponent:3'),ore('blockMarble,stoneMarble'),ore('blockMarble,stoneMarble'),ore('blockMarble,stoneMarble'),ore('blockMarble,stoneMarble'),ore('blockMarble,stoneMarble'),item('astralsorcery:blockblackmarble:0'),item('astralsorcery:blockblackmarble:0'),item('astralsorcery:itemcraftingcomponent:4'),item('astralsorcery:itemcraftingcomponent:4'),item('astralsorcery:itemcraftingcomponent:4'),item('astralsorcery:itemcraftingcomponent:4'),item('astralsorcery:blockblackmarble:0'),item('astralsorcery:blockblackmarble:0')]);
//  // Slot order for tier 3 altar immediately after 9X9 /* Top left*/,/* Top right*//*Bottom left*/,/* Bottom right*/,/* Top right middle*/,/* Top Left middle*/,/* Top Right middle*/,/*Left of slot one in 9x9*/,/* Right of slot 3 in 9x9*/,/* left of slot 7 in 9x9*/,/* right of slot 9 in 9x9*/, /* Bottom left middle*/,/* Bottom right middle*/
// recipes.remove(ore('blockMarble,stoneMarble'));
// recipes.addShaped(item('astralsorcery:blockmachine:1'), [[null, ore('dustIron'), null],[ore('plankWood'), ore('stone,stoneSmooth'), ore('stickWood')], [ore('plankWood'), ore('plankWood'), item('contenttweaker:steammotor')]]);
// 
// //runed marble
// ore('stoneMarble').remove(ore('blockMarble,stoneMarble'));
// recipes.addShaped(ore('blockMarble,stoneMarble') * 4, [[ore('foilTungsten'), ore('stoneMarble'), ore('foilTungsten')],[ore('stoneMarble'), ore('wireFinePlatinum'), ore('stoneMarble')], [ore('foilTungsten'), ore('stoneMarble'), ore('foilTungsten')]]);
// furnace.remove(ore('ingotAstralStarmetal'));
// furnace.addRecipe(ore('dustAstralStarmetal'), ore('oreAstralStarmetal'), 0.0);
// //StarMetal
// blast_furnace.recipeBuilder()
//     .inputs(ore('dustAstralStarmetal'))
//     .fluidInputs(fluid('astralsorcery.liquidstarlight') * 6000)
//     .outputs(ore('ingotAstralStarmetal'))
//     .property("temperature", 7000)
//     .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 0}))
//     //.fluidOutputs(fluid('steam') * 6000)
//     .duration(1000)
//     .EUt(6000)
//     .buildAndRegister();
// //resonating gem
// blast_furnace.recipeBuilder()
//     .inputs(ore('gemAquamarine'))
//     .fluidInputs(fluid('astralsorcery.liquidstarlight') * 6000)
//     .outputs(item('astralsorcery:itemcraftingcomponent:4'))
//     .property("temperature", 7000)
//     //.fluidOutputs(fluid('steam') * 6000)
//     .duration(1000)
//     .EUt(6000)
//     .buildAndRegister();
// 
// //Illumination power
// mixer.recipeBuilder()
// .inputs([ore('dustGlowstone') * 4, ore('gemAquamarine')])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('astralsorcery:itemusabledust:0') * 16])
// .duration(30)
// .EUt(800)
// .buildAndRegister();
// //Nocturnal powder
// mixer.recipeBuilder()
// .inputs([item('astralsorcery:itemusabledust:0'), ore('dye,dyeBlue,gemLapis'), ore('dustCarbon,dyeBlack') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('astralsorcery:itemusabledust:1')* 4])
// .duration(30)
// .EUt(1150)
// .buildAndRegister();
// 
// //Illumination power
// largeMix.recipeBuilder()
// .inputs([ore('dustGlowstone') * 4, ore('gemAquamarine')])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('astralsorcery:itemusabledust:0') * 16])
// .duration(30)
// .EUt(800)
// .buildAndRegister();
// //Nocturnal powder
// largeMix.recipeBuilder()
// .inputs([item('astralsorcery:itemusabledust:0'), ore('dye,dyeBlue,gemLapis'), ore('dustCarbon,dyeBlack') * 3])
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .outputs([item('astralsorcery:itemusabledust:1')* 4])
// .duration(30)
// .EUt(1150)
// .buildAndRegister();
// 
// //starMetal ore to dust
// macerator.recipeBuilder()
// .inputs([ore('oreAstralStarmetal')])
// .outputs([ore('dustAstralStarmetal') * 2])
// .duration(20)
// .EUt(12)
// .buildAndRegister();
// 
// //tooltips addTooltip(); format."color()"
// fluid('astralsorcery.liquidstarlight').addTooltip("Sx");
// ore('dustAstralStarmetal').addTooltip("Ax");
// ore('ingotAstralStarmetal').addTooltip("(AxSx)");
// ore('oreAstralStarmetal').addTooltip("Ax");
// item('astraladditions:block_starmetal:0').addTooltip("(AxSx)");
// ore('gemAquamarine').addTooltip("Be₃Al₃Si₆O₁₈");
// item('astralsorcery:itemcraftingcomponent:4').addTooltip("Be₃Al₃Si₆O₁₈Sx");
// util.getCrystalORIngredient(false, false).addTooltip("(SiO₂)﹖");
// 
// 
// 
// //treebeacon
// recipes.addShaped(item('astralsorcery:blocktreebeacon:0'), [[ore('circuitBasic'), ore('treeSapling'), ore('circuitBasic')],[ore('plateSteel'), ore('circuitBasic'), ore('plateSteel')], [ore('plateDoubleSteel'), ore('plateSteel'), ore('plateDoubleSteel')]]);
// //Lightwell
// well.removeLiquefaction(item('astralsorcery:itemcraftingcomponent:4'),fluid('water'));
// well.removeLiquefaction(item('minecraft:packed_ice:0'),fluid('water'));
// well.removeLiquefaction(item('minecraft:ice'),fluid('water'));
// well.removeLiquefaction(item('minecraft:snow:0'),fluid('water'));
// well.removeLiquefaction(item('minecraft:netherrack'),fluid('lava'));
// well.removeLiquefaction(item('minecraft:magma:0'),fluid('lava'));
// //well.removeLiquefaction(item('astralsorcery:itemcraftingcomponent:4'),fluid('astralsorcery.liquidstarlight'));
// //well.removeLiquefaction(ore('gemAquamarine'),fluid('astralsorcery.liquidstarlight'));
// well.addLiquefaction(item('randomthings:ingredient:2'),fluid('astralsorcery.liquidstarlight'), 20, 1000, 0xFFFFFF);
// 
// //fix mineralis ritual
// ore('oreCopper').remove(item('libvulpes:ore0:4'));
// ore('oreTin').remove(item('libvulpes:ore0:5'));
// ore('oreRutile').remove(item('libvulpes:ore0:8'));
// ore('oreTitanium').remove(item('libvulpes:ore0:8'));
// ore('oreAluminum').remove(item('libvulpes:ore0:9'));
// ore('oreIridium').remove(item('libvulpes:ore0:10'));
// //Aquamerine decomp
// 
// item('beneath:teleporterbeneath:0').displayName = "Deep Dark Portal";
// recipes.addShaped(item('beneath:teleporterbeneath:0'), [[ore('plateDoubleOsmium'), ore('plateDoubleOsmium'), ore('plateDoubleIridium')],[ore('plateDoubleOsmium'), item('astraladditions:block_starmetal:0'), ore('plateDoubleIridium')], [ore('plateDoubleOsmium'), ore('plateDoubleIridium'), ore('plateDoubleIridium')]]);
// blast_furnace.recipeBuilder()
//     .inputs(ore('ingotNaquadahAlloy'),ore('ingotAstralStarmetal'))
//     .outputs(item('gregtech:meta_item_1:11524') *2)
//     .property("temperature", 7600)
//     .duration(1000)
//     .EUt(30720)
// .buildAndRegister();
// 
// 
// 
// item('gregtech:meta_item_1:524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_item_1:1524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_item_1:2524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_item_1:9524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_item_1:10524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_item_1:11524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_item_1:12524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_block_compressed_32:12').addTooltip("(AxSx)Nq(Ir₃Os)");
// fluid('star_metal_alloy').addTooltip("(AxSx)Nq(Ir₃Os)");
// 
// mixer.recipeBuilder()
//     .inputs(ore('dustAstralStarmetal') *2)
//     .inputs(ore('dustNaquadah') * 3)
//     .inputs(item('gregtech:meta_item_1:2052'))
//     .fluidInputs(fluid('clear_naquadah_liquid') * 1000)
//     .outputs(item('gtadditions:ga_dust:527') *6)
//     .duration(600)
//     .EUt(8096)
// .buildAndRegister();
// 
// largeMix.recipeBuilder()
//     .inputs(ore('dustAstralStarmetal') *2)
//     .inputs(ore('dustNaquadah') * 3)
//     .inputs(item('gregtech:meta_item_1:2052'))
//     .fluidInputs(fluid('clear_naquadah_liquid') * 1000)
//     .outputs(item('gtadditions:ga_dust:527') *6)
//     .duration(600)
//     .EUt(8096)
// .buildAndRegister();
// 
// 
// //Explosive Hydrazine
// 
// largeMix.recipeBuilder()
//     .fluidInputs(fluid('dense_hydrazine_fuel_mixture') *8000, fluid('nitrotoluene') *4000, fluid('glyceryl') * 1000)
//     .fluidOutputs(fluid('explosivehydrazine') * 13000)
//     .duration(100)
//     .EUt(1024)
// .buildAndRegister();
// 
// //HMX
// 
// chemreactor.recipeBuilder()
//     .fluidInputs(fluid('fuming_nitric_acid')*2000)
//     .inputs(ore('dustHexamethylenetetramine')*4)
//     .notConsumable(fluid('acetic_anhydride'))
//     .outputs(item('gtadditions:ga_dust:530'))
//     .duration(20)
//     .EUt(1024)
// .buildAndRegister();
// 
// // Octaazacubane Solution
// 
// chemreactor.recipeBuilder()
//     .fluidInputs(fluid('oxygen') * 2000, fluid('distilled_water') * 3000)
//     .inputs(item('gtadditions:ga_dust:144') * 8)
//     .fluidOutputs(fluid('octaazacubanesolution') * 3000)
//     .outputs(item('gtadditions:ga_dust:356') * 4)
//     .duration(5)
//     .EUt(30000)
//     .buildAndRegister();
// 
// large_chem.recipeBuilder()
//     .fluidInputs(fluid('oxygen') * 2000, fluid('distilled_water') * 3000)
//     .inputs(item('gtadditions:ga_dust:144') * 8)
//     .fluidOutputs(fluid('octaazacubanesolution') * 3000)
//     .outputs(item('gtadditions:ga_dust:356') * 4)
//     .duration(5)
//     .EUt(30000)
//     .buildAndRegister();
// 
// // Octaazacubane
// 
// chemdehydrator.recipeBuilder()
//     .fluidInputs(fluid('octaazacubanesolution') * 1000)
//     .outputs(item('gtadditions:ga_dust:531'))
//     .duration(35)
//     .EUt(4500)
//     .buildAndRegister();
// 
// 
// // Starlight Complex
// 
// mixer.recipeBuilder()
//     .fluidInputs(fluid('astralsorcery.liquidstarlight') * 1000)
//     .inputs(item('gtadditions:ga_dust:531'))
//     .fluidOutputs(fluid('starlightcomplex') *2000)
//     .duration(35)
//     .EUt(2000)
// .buildAndRegister();
// 
// largeMix.recipeBuilder()
//     .fluidInputs(fluid('astralsorcery.liquidstarlight') * 1000)
//     .inputs(item('gtadditions:ga_dust:531'))
//     .fluidOutputs(fluid('starlightcomplex') *2000)
//     .duration(35)
//     .EUt(2000)
// .buildAndRegister();
// 
// // Starlight Rocket Fuel
// 
// large_chem.recipeBuilder()
//     .fluidInputs(fluid('explosivehydrazine') *32000, fluid('starlightcomplex') *6000,fluid('rocket_fuel_b') * 2000, fluid('kerosene') * 4000, fluid('dinitrogen_tetroxide')  * 6000)
//     .inputs(ore('dustHmxexplosive')*4)
//     .notConsumable(ore('dustStarfuelcatalyst'))
//     .fluidOutputs(fluid('starlight_rocketfuel') * 50000)
//     .duration(20)
//     .EUt(30000)
// .buildAndRegister();
// 
// //ZPM Direct Starmetal
// chemical_bath.recipeBuilder()
//     .inputs(ore('dustIron'))
//     .fluidInputs(fluid('astralsorcery.liquidstarlight') * 1000)
//     .notConsumable(ore('dustStarfuelcatalyst'))
//     .outputs(ore('dustAstralStarmetal'))
//     .duration(240)
//     .EUt(100000)
// .buildAndRegister();
// GAutil.removeRecipeByOutput(assembler, [item('gregtech:machine_casing:7')], [], false);
// recipes.remove(item('gregtech:machine_casing:7'));
// recipes.addShaped(item('gregtech:machine_casing:7'), [[item('gregtech:meta_item_1:12524'), item('gregtech:meta_item_1:12524'), item('gregtech:meta_item_1:12524')],[item('gregtech:meta_item_1:12524'), ore('GTWrench'), item('gregtech:meta_item_1:12524')], [item('gregtech:meta_item_1:12524'), item('gregtech:meta_item_1:12524'), item('gregtech:meta_item_1:12524')]]);
// recipes.remove(item('gregtech:mte:992'));
// recipes.addShaped(item('gregtech:mte:992'), [[null, null, null],[ore('platePolybenzimidazole'), item('gregtech:meta_item_1:12524'), ore('platePolybenzimidazole')], [ore('cableGtSingleNaquadah'), item('gregtech:machine_casing:7'), ore('cableGtSingleNaquadah')]]);
// 
// assembler.recipeBuilder()
// .inputs(item('gregtech:meta_item_1:12524') * 8)
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 8}))
// .outputs(item('gregtech:machine_casing:7'))
// .duration(40)
// .EUt(1024)
// .buildAndRegister();
// 
// /*
// electrolyzer.recipeBuilder()
// .fluidInputs(fluid('astralsorcery.liquidstarlight') *6000)
// .outputs(ore('dustSilicon') * 6)
// .duration(2160)
// .EUt(60)
// .buildAndRegister();
// */
// 
// large_chem.recipeBuilder()
//     .inputs(rock_crystal,ore('dustAstralStarmetal'))
//     .fluidInputs(fluid('astralsorcery.liquidstarlight') * 1000)
//     .outputs(ore('blockMossy'))
//     .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
//     //.property("temperature", 5000)
//     .duration(500)
//     .EUt(30000)
// .buildAndRegister();
// 
// 
// 
// 
// //LV Super
// assembler.recipeBuilder()
// .inputs(item('gregtech:cable:517') * 9,item('gregtech:fluid_pipe:184'),item('gregtech:meta_item_1:32610'))
// .fluidInputs(fluid('astralsorcery.liquidstarlight') * 3000)
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs(item('gregtech:cable:516') * 9)
// .duration(120)
// .EUt(32)
// .buildAndRegister();
// //MV Super
// assembler.recipeBuilder()
// .inputs(ore('wireGtSingleMvSuperconductorBase') * 9,item('gregtech:fluid_pipe:183'),item('gregtech:meta_item_1:32611'))
// .fluidInputs(fluid('astralsorcery.liquidstarlight') * 3000)
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs(ore('wireGtSingleMvSuperconductor')* 9)
// .duration(120)
// .EUt(128)
// .buildAndRegister();
// //HV super
// assembler.recipeBuilder()
// .inputs(ore('wireGtSingleHvSuperconductorBase') * 9,item('gregtech:fluid_pipe:72'),item('gregtech:meta_item_1:32612'))
// .fluidInputs(fluid('astralsorcery.liquidstarlight') * 3000)
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs(ore('wireGtSingleHvSuperconductor')* 9)
// .duration(120)
// .EUt(512)
// .buildAndRegister();
// //EV super
// assembler.recipeBuilder()
// .inputs(ore('wireGtSingleEvSuperconductorBase') * 18,item('gregtech:fluid_pipe:235') * 6,item('gregtech:meta_item_1:32613') * 2)
// .fluidInputs(fluid('astralsorcery.liquidstarlight') * 3000)
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs(ore('wireGtSingleEvSuperconductor') * 18)
// .duration(120)
// .EUt(2048)
// .buildAndRegister();
// //IV super
// assembler.recipeBuilder()
// .inputs(ore('wireGtSingleIvSuperconductorBase') * 12,item('gregtech:fluid_pipe:135')* 4,item('gregtech:meta_item_1:146'))
// .fluidInputs(fluid('astralsorcery.liquidstarlight') * 4000)
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs(ore('wireGtSingleIvSuperconductor') * 12)
// .duration(120)
// .EUt(8192)
// .buildAndRegister();
// //LUV super
// assembler.recipeBuilder()
// .inputs(ore('wireGtSingleLuvSuperconductorBase') * 16,item('gregtech:fluid_pipe:963') *5,item('gregtech:meta_item_1:32615'))
// .fluidInputs(fluid('astralsorcery.liquidstarlight') * 4000)
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs(ore('wireGtSingleLuvSuperconductor') * 16)
// .duration(120)
// .EUt(4194304)
// .buildAndRegister();
// //ZPM super
// assembler.recipeBuilder()
// .inputs(ore('wireGtSingleZpmSuperconductorBase') * 32,item('gregtech:fluid_pipe:307') *6,item('gregtech:meta_item_1:148'))
// .fluidInputs(fluid('astralsorcery.liquidstarlight') * 8000)
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs(ore('wireGtSingleZpmSuperconductor') * 32)
// .duration(120)
// .EUt(4194304)
// .buildAndRegister();
// //UV super
// assembler.recipeBuilder()
// .inputs(ore('wireGtSingleUvSuperconductorBase') * 64,item('gregtech:fluid_pipe:192') *7,item('gregtech:meta_item_1:148'))
// .fluidInputs(fluid('astralsorcery.liquidstarlight') * 10000)
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .outputs(ore('wireGtSingleUvSuperconductor') * 64)
// .duration(120)
// .EUt(4194304)
// .buildAndRegister();
// 
// macerator.recipeBuilder()
// .inputs([ore('ingotAstralStarmetal')])
// .outputs([ore('dustAstralStarmetal')])
// .duration(30)
// .EUt(128)
// .buildAndRegister();
// 
// // End Crystal
// 
// assembler.recipeBuilder()
//     .fluidInputs(fluid('woods_glass') * 144)
//     .inputs(item('gregtech:meta_item_1:32725') * 1, item('gtadditions:ga_meta_item:32437') * 4, item('gcyl:gcyl_meta_item:430') * 1)
//     .notConsumable(item('gcyl:gcyl_meta_item:591'))
//     .outputs(item('minecraft:end_crystal:0'))
//     .duration(40)
//     .EUt(122880)
//     .buildAndRegister();