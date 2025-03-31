// // No special #loader, just use the default crafttweaker one.
// 
// import mods.gregtech.multiblock.Builder;
// import mods.gregtech.multiblock.FactoryBlockPattern;
// import mods.gregtech.multiblock.RelativeDirection;
// import mods.gregtech.multiblock.IBlockMatcher;
// import mods.gregtech.multiblock.MultiblockAbility;
// import mods.gregtech.multiblock.FactoryMultiblockShapeInfo;
// import mods.gregtech.multiblock.IBlockInfo;
// import mods.gregtech.multiblock.Multiblock;
// import mods.gregtech.recipe.FactoryRecipeMap;
// import mods.gregtech.MetaTileEntities;
// 
// import mods.gregtech.recipe.RecipeMap;
// 
// import crafttweaker.world.IFacing;
// 
// var loc = "coke_oven_2";
// var meta = 1000; 
// 
// val coke_oven_2 = Builder.start(loc, meta)
//     .withPattern(
//         FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.DOWN, RelativeDirection.FRONT)
//             .aisle(
//                 "CCC",
//                 "CSC",
//                 "CCC")
//             .aisle(
//                 "CCC",
//                 "C C",
//                 "CCC")
//             .aisle(
//                 "CCC",
//                 "CCC",
//                 "CCC")
//             .whereOr("C",
//                 item('metastate:gregtech:metal_casing:8'),
//                 IBlockMatcher.abilityPartPredicate(
//                     MultiblockAbility.EXPORT_FLUIDS,
//                     MultiblockAbility.IMPORT_ITEMS,
//                     MultiblockAbility.EXPORT_ITEMS
//                 ))
//             .where("S", IBlockMatcher.controller(loc))
//             .where(" ", IBlockMatcher.ANY)
//             .build())
//     .addDesign(
//         FactoryMultiblockShapeInfo.start()
//             .aisle(
//                 "ICC",
//                 "CCC",
//                 "CCC")
//             .aisle(
//                 "OCC",
//                 "S C",
//                 "CCC")
//             .aisle(
//                 "ECC",
//                 "CCC",
//                 "CCC")
//             .where("C", item('metastate:gregtech:metal_casing:8'))
//             .where("S", IBlockInfo.controller(loc))
//             .where("I", MetaTileEntities.ITEM_IMPORT_BUS[0], IFacing.west())
//             .where("O", MetaTileEntities.ITEM_EXPORT_BUS[0], IFacing.west())
//             .where("E", MetaTileEntities.FLUID_EXPORT_HATCH[0], IFacing.west())
//             .where(" ", IBlockInfo.EMPTY)
//             .build())
// .withRecipeMap(
//         FactoryRecipeMap.start(loc)
//                         .maxFluidOutputs(1)
//                         .minInputs(1)
//                         .maxInputs(1)
//                         .minOutputs(1)
//                         .maxOutputs(1)
//                         .build())
// .buildAndRegister() as Multiblock;
// 
// coke_oven_2.noEnergy = true;
// 
//     coke_oven_2.recipeMap.recipeBuilder()
//     .inputs(ore('logWood') * 1)
//     .outputs(ore('charcoal,gemCharcoal,itemCharcoal'))
//     .fluidOutputs(fluid('creosote') * 1000)
//     .duration(180)
//     .buildAndRegister();
// 
//     coke_oven_2.recipeMap.recipeBuilder()
//     .inputs(ore('charcoal,gemCharcoal,itemCharcoal'))
//     .outputs(ore('fuelCoke'))
//     .fluidOutputs(fluid('creosote') * 1000)
//     .duration(360)
//     .buildAndRegister();
// 
//     coke_oven_2.recipeMap.recipeBuilder()
//     .inputs(ore('coal,gemCoal,itemCoal'))
//     .outputs(ore('fuelCoke'))
//     .fluidOutputs(fluid('creosote') * 1800)
//     .duration(180)
//     .buildAndRegister();
// 
//     coke_oven_2.recipeMap.recipeBuilder()
//     .inputs(ore('gemLignite') * 2)
//     .outputs(ore('fuelCoke'))
//     .fluidOutputs(fluid('creosote') * 1800)
//     .duration(180)
//     .buildAndRegister();
// 
//     coke_oven_2.recipeMap.recipeBuilder()
//     .inputs(ore('dustCoal'))
//     .outputs(item('gregtech:meta_item_1:2357'))
//     .fluidOutputs(fluid('creosote') * 1800)
//     .duration(180)
//     .buildAndRegister();
// 
//     coke_oven_2.recipeMap.recipeBuilder()
//     .inputs(ore('dustLignite')* 2)
//     .outputs(item('gregtech:meta_item_1:2357'))
//     .fluidOutputs(fluid('creosote') * 1800)
//     .duration(180)
//     .buildAndRegister();
// 
//     coke_oven_2.recipeMap .recipeBuilder()
//     .inputs(item('gregtech:meta_item_1:438') * 2)
//     .outputs(item('thermalfoundation:material:833'))
//     .fluidOutputs(fluid('creosote') * 750)
//     .duration(180)
//     .buildAndRegister();