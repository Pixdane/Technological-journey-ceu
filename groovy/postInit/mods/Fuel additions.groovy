// import mods.gregtech.recipe.RecipeMaps;
// import mods.gregtech.recipe.RecipeMap;
// import mods.gtadditions.recipe.GARecipeMaps as GaMap;
// import mods.gtadditions.recipe.HotCoolantRecipe as cool;
// 
// var CPlasma = cool.create(fluid('plasma.chaos') * 144 , 20, 2048, fluid('chaos') * 144);
// //RecipeMaps.PLASMA_GENERATOR_FUELS.addRecipe(CPlasma);
// 
// var AWlasma = cool.create(fluid('plasma.awaken_draconium') * 144 , 40, 2048, fluid('awaken_draconium') * 144);
// //RecipeMaps.PLASMA_GENERATOR_FUELS.addRecipe(AWlasma);
// var infilasma = cool.create(fluid('plasma.chaosalloy') * 144 , 80, 2048, fluid('chaosalloy') * 144);
// //RecipeMaps.PLASMA_GENERATOR_FUELS.addRecipe(infilasma);
// 
// var magic_gasoline = mods.gregtech.recipe.FuelRecipe.create(fluid('starlight_rocketfuel') * 6, 420, 8192);
// GaMap.ROCKET_FUEL_RECIPES.addRecipe(magic_gasoline);
// 
// var greenRocketOld = mods.gregtech.recipe.FuelRecipe.create(fluid('rocket_fuel_a') * 3, 160, 2048);
// var greenRocketNew = mods.gregtech.recipe.FuelRecipe.create(fluid('rocket_fuel_a') * 7, 80, 8192);
// GaMap.ROCKET_FUEL_RECIPES.removeRecipe(greenRocketOld);
// GaMap.ROCKET_FUEL_RECIPES.addRecipe(greenRocketNew);
// 
// var nitrobenzene = mods.gregtech.recipe.FuelRecipe.create(fluid('nitro_benzene'), 40, 32);
// RecipeMaps.GAS_TURBINE_FUELS.addRecipe(nitrobenzene);
// //var chaos = cool.create(fluid('plasma.chaos') * 144,20,524288,fluid('chaos') * 144);
// GaMap.HOT_COOLANT_TURBINE_FUELS.addRecipe(CPlasma);
// GaMap.HOT_COOLANT_TURBINE_FUELS.addRecipe(AWlasma);
// GaMap.HOT_COOLANT_TURBINE_FUELS.addRecipe(infilasma);