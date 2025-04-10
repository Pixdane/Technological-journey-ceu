// #sideonly client
// 
// 
// //Code courtesy of wsetzer
// //Taken from issue Nomifactory #868 PR and modified by Lizayu#3386, blame her if it's shit
// 
// import crafttweaker.item.IItemDefinition;
// import crafttweaker.formatting.IFormattedText;
// 
// val fusedQuartz		= [
//     ore('blockGlassHardened,blockGlassHardenedWhite,fusedQuartz')			.definition,
//     ore('enlightenedFusedQuartz')		.definition,
//     ore('darkFusedQuartz')			.definition,
//     ore('notPastureFusedQuartz')			.definition,
//     ore('notPastureEnlightenedFusedQuartz')	.definition,
//     ore('notPastureDarkFusedQuartz')		.definition,
//     item('enderio:item_dark_steel_upgrade', 1)			.definition,
//     item('enderio:item_dark_steel_upgrade', 1)	.definition,
//     item('enderio:block_unholy_dark_fused_quartz')		.definition,
//     item('enderio:item_broken_spawner')		.definition,
//     item('enderio:block_pasture_enlightened_fused_quartz')	.definition,
//     item('enderio:block_pasture_dark_fused_quartz')		.definition,
//     item('enderio:block_not_holy_fused_quartz')		.definition,
//     ore('notUnholyFusedGlass')	.definition,
//     ore('notUnholyEnlightenedFusedGlass')		.definition,
//     ore('unholyDarkFusedQuartz')		.definition,
//     item('enderio:block_not_unholy_enlightened_fused_quartz')	.definition,
//     item('enderio:block_not_unholy_dark_fused_quartz')	.definition,
//     ore('pastureFusedGlass')		.definition,
//     ore('pastureEnlightenedFusedGlass').definition,
//     ore('pastureDarkFusedGlass')	.definition
// ] as IItemDefinition[];
// 
// val fusedGlass		= [
//     ore('blockGlass,blockGlassColorless,blockGlassWhite,fusedGlass')				.definition,
//     ore('enlightenedFusedGlass')		.definition,
//     ore('darkFusedGlass')			.definition,
//     ore('notPastureFusedGlass')			.definition,
//     ore('notPastureEnlightenedFusedGlass')	.definition,
//     ore('notPastureDarkFusedGlass')		.definition,
//     item('enderio:item_dark_steel_upgrade', 1)			.definition,
//     item('enderio:block_unholy_enlightened_fused_glass')	.definition,
//     item('enderio:item_broken_spawner')		.definition,
//     item('enderio:block_pasture_fused_glass')			.definition,
//     item('enderio:block_pasture_enlightened_fused_glass')	.definition,
//     ore('unholyFusedQuartz')		.definition,
//     ore('notUnholyFusedQuartz')		.definition,
//     ore('notUnholyEnlightenedFusedQuartz')	.definition,
//     ore('notUnholyDarkFusedQuartz')		.definition,
//     ore('unholyDarkFusedGlass')		.definition,
//     item('enderio:block_not_unholy_enlightened_fused_glass')	.definition,
//     ore('pastureFusedQuartz')		.definition,
//     ore('pastureEnlightenedFusedQuartz')		.definition,
//     ore('pastureDarkFusedQuartz')	.definition,
//     item('enderio:block_not_pasture_dark_fused_glass')	.definition
// ] as IItemDefinition[];
// 
// 
// 
// val allArrays		= [
//     fusedQuartz,
//     fusedGlass,
// ] as IItemDefinition[][];
// 
// var colorDesc = "Most colours for this item are hidden to reduce clutter." as IFormattedText;
// 
// 
// for array in allArrays {
//     for item in array {
//         item.defaultInstance.addTooltip(format.darkAqua(colorDesc));
// 
//         for color in 1 .. 16 {
//             mods.jei.JEI.hide(item.makeStack(color));
//             
//         }
//     }
// }