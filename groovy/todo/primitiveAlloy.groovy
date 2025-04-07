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
// var loc = "primitive_alloy";
// var meta = 1002;
// 
// val primitive_alloy = Builder.start(loc, meta)
//     .withPattern(
//         FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.DOWN, RelativeDirection.FRONT)
//             .aisle(
//                 "DDD",
//                 "CSC",
//                 "CCC")
//             .aisle(
//                 "D D",
//                 "C C",
//                 "CCC")
//             .aisle(
//                 "DDD",
//                 "CCC",
//                 "CCC")
//             .whereOr("C",
//                 item('metastate:gregtech:metal_casing', 1),
//                 IBlockMatcher.abilityPartPredicate(
//                     MultiblockAbility.IMPORT_FLUIDS,
//                     MultiblockAbility.IMPORT_ITEMS,
//                     MultiblockAbility.EXPORT_ITEMS
//                 ))
//                 .whereOr("D",
//                 item('metastate:gregtech:machine_casing', 10),
//                 IBlockMatcher.abilityPartPredicate(
//                     MultiblockAbility.IMPORT_FLUIDS,
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
//                 "DDD")
//             .aisle(
//                 "ICC",
//                 "S C",
//                 "D D")
//             .aisle(
//                 "OCE",
//                 "CCC",
//                 "DDD")
//             .where("D", item('metastate:gregtech:machine_casing', 10))
//             .where("C", item('metastate:gregtech:metal_casing', 1))
//             .where("S", IBlockInfo.controller(loc))
//             .where("I", MetaTileEntities.ITEM_IMPORT_BUS[0], IFacing.west())
//             .where("O", MetaTileEntities.ITEM_EXPORT_BUS[0], IFacing.west())
//             .where("E", MetaTileEntities.FLUID_IMPORT_HATCH[0], IFacing.east())
//             .where(" ", IBlockInfo.EMPTY)
//             .build())
// .withRecipeMap(
//         FactoryRecipeMap.start(loc)
//                         .maxFluidInputs(1)
//                         .minInputs(1)
//                         .maxInputs(2)
//                         .maxOutputs(1)
//                         .build())
// //.withTexture(Textures.PRIMITIVE_BLAST_FURNACE_OVERLAY)
// .buildAndRegister() as Multiblock;
// 
// primitive_alloy.noEnergy = true;
// 
//     primitive_alloy.recipeMap.recipeBuilder()
//     .inputs(ore('ingotCopper') * 3, ore('ingotTin'))
//     .outputs(ore('ingotBronze') * 4)
//     .fluidInputs(fluid('steam') * 1000)
//     .duration(600)
//     .buildAndRegister();
//     primitive_alloy.recipeMap.recipeBuilder()
//     .inputs(ore('ingotAntimony'), ore('ingotTin') * 9)
//     .outputs(ore('ingotSolderingAlloy') * 10)
//     .fluidInputs(fluid('steam') * 1000)
//     .duration(600)
//     .buildAndRegister();
//     primitive_alloy.recipeMap.recipeBuilder()
//     .inputs(ore('ingotCopper'),ore('dustRedstone') * 4)
//     .outputs(ore('ingotRedAlloy'))
//     .fluidInputs(fluid('steam') * 1000)
//     .duration(600)
//     .buildAndRegister();
//     
//     primitive_alloy.recipeMap.recipeBuilder()
//     .inputs(item('gtadditions:ga_meta_item:32037') * 4)
//     .outputs(ore('ingotWroughtIron') * 4)
//     .fluidInputs(fluid('steam') * 1000)
//     .duration(150)
//     .buildAndRegister();
//     
//     primitive_alloy.recipeMap.recipeBuilder()
//     .inputs(ore('dustGlass') * 4)
//     .notConsumable(item('gregtech:meta_item_1', 17))
//     .outputs(item('gregtech:meta_item_1', 517) * 4)
//     .fluidInputs(fluid('steam') * 1000)
//     .duration(150)
//     .buildAndRegister();
//     primitive_alloy.recipeMap.recipeBuilder()
//     .inputs([ore('ingotIron'),ore('dustUranium')])
//     .outputs([ore('ingotPulsatingIron')])
//     .duration(160)
//     .fluidInputs(fluid('steam') * 1000)
//     .buildAndRegister();
// primitive_alloy.recipeMap.recipeBuilder()
//     .inputs([ore('gemNetherQuartz,gemQuartz') * 4])
//     .outputs([ore('blockGlassHardened,blockGlassHardenedWhite,fusedQuartz')])
//     .fluidInputs(fluid('steam') * 1000)
//     .duration(160)
//     .buildAndRegister();
// 
//     primitive_alloy.recipeMap.recipeBuilder()
//     .inputs([ore('ingotIron'),item('gregtech:meta_item_1:10822')])
//     .outputs([ore('ingotPulsatingIron')])
//     .duration(160)
//     .fluidInputs(fluid('steam') * 1000)
//     .buildAndRegister();
//         primitive_alloy.recipeMap.recipeBuilder()
//     .inputs([ore('dustIron'),ore('dustUranium')])
//     .outputs([ore('ingotPulsatingIron')])
//     .duration(160)
//     .fluidInputs(fluid('steam') * 1000)
//     .buildAndRegister();
//         primitive_alloy.recipeMap.recipeBuilder()
//     .inputs([ore('dustIron'),item('gregtech:meta_item_1:10822')])
//     .outputs([ore('ingotPulsatingIron')])
//     .duration(160)
//     .fluidInputs(fluid('steam') * 1000)
//     .buildAndRegister();
//     primitive_alloy.recipeMap.recipeBuilder()
//     .inputs([ore('ingotNickel'),ore('ingotIron') *2])
//     .outputs([ore('ingotInvar') *3])
//     .duration(160)
//     .fluidInputs(fluid('steam') * 1000)
//     .buildAndRegister();
// 
//     primitive_alloy.recipeMap.recipeBuilder()
//     .inputs([ore('ingotNickel'),ore('dustIron') *2])
//     .outputs([ore('ingotInvar') *3])
//     .duration(160)
//     .fluidInputs(fluid('steam') * 1000)
//     .buildAndRegister();
//         primitive_alloy.recipeMap.recipeBuilder()
//     .inputs([ore('ingotIron') *2,ore('dustNickel')])
//     .outputs([ore('ingotInvar') *3])
//     .duration(160)
//     .fluidInputs(fluid('steam') * 1000)
//     .buildAndRegister();
//         primitive_alloy.recipeMap.recipeBuilder()
//     .inputs([ore('dustIron') *2,ore('dustNickel')])
//     .outputs([ore('ingotInvar') *3])
//     .duration(160)
//     .fluidInputs(fluid('steam') * 1000)
//     .buildAndRegister();