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
//     item('enderio:item_dark_steel_upgrade:1')			.definition,
//     item('enderio:item_dark_steel_upgrade:1')	.definition,
//     item('enderio:block_unholy_dark_fused_quartz')		.definition,
//     item('enderio:item_broken_spawner:0')		.definition,
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
//     item('enderio:item_dark_steel_upgrade:1')			.definition,
//     item('enderio:block_unholy_enlightened_fused_glass')	.definition,
//     item('enderio:item_broken_spawner:0')		.definition,
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
// val gtFrame		= [
//     item('gregtech:frame_hssg')				.definition,
//     item('gregtech:frame_bronze')				.definition,
//     item('gregtech:frame_darmstadtium')			.definition,
//     item('gregtech:frame_aluminium')				.definition,
//     item('gregtech:frame_tungsten_steel')			.definition,
//     item('gregtech:frame_invar')				.definition,
//     item('gregtech:frame_wood')				.definition,
//     item('gregtech:frame_stainless_steel')			.definition,
//     item('gregtech:frame_steel')				.definition,
//     item('gregtech:frame_blue_steel')				.definition,
//     item('gregtech:frame_hsse')				.definition,
//     item('gregtech:frame_neutronium')				.definition,
//     item('gregtech:frame_iron')				.definition,
//     item('gregtech:frame_titanium')				.definition,
//     item('gregtech:frame_tritanium')				.definition
// ] as IItemDefinition[];
// 
// val gcyFrame = [
//     item('gregtech:frame_seaborgium').definition,
//     item('gregtech:frame_metastable_hassium').definition,
//     item('gregtech:frame_draconium').definition,
//     item('gregtech:frame_proto_adamantium').definition,
//     item('gregtech:frame_cinobite').definition,
//     item('gregtech:frame_staballoy').definition,
//     item('gregtech:frame_chaos').definition,
//     item('gregtech:frame_qcd_confined_matter').definition,
//     item('gregtech:frame_bohrium').definition,
//     item('gregtech:frame_incoloy_ma').definition,
//     item('gregtech:frame_potin').definition,
//     item('gregtech:frame_americium').definition,
//     item('gregtech:frame_lafium').definition,
//     item('gregtech:frame_grisium').definition,
//     item('gregtech:frame_heavy_quark_degenerate_matter').definition,
//     item('gregtech:frame_protactinium').definition,
//     item('gregtech:frame_black_titanium').definition,
//     item('gregtech:frame_hastelloy_n').definition,
//     item('gregtech:frame_lead').definition,
//     item('gregtech:frame_nitinol_a').definition,
//     item('gregtech:frame_cosmic_neutronium').definition,
//     item('gregtech:frame_trinium_titanium').definition,
//     item('gregtech:frame_berkelium').definition,
//     item('gregtech:frame_awaken_draconium').definition,
//     item('gregtech:frame_zeron').definition,
//     item('gregtech:frame_trinium').definition,
//     item('gregtech:frame_metastable_flerovium').definition,
//     item('gregtech:frame_eglin_steel').definition,
//     item('gregtech:frame_hastelloy_k243').definition,
//     item('gregtech:frame_titan_steel').definition,
//     item('gregtech:frame_stellite').definition,
//     item('gregtech:frame_taranium').definition,
//     item('gregtech:frame_fermium').definition,
//     item('gregtech:frame_uranium_radioactive').definition,
//     item('gregtech:frame_mendelevium').definition,
//     item('gregtech:frame_hdcs').definition,
//     item('gregtech:frame_ruridit').definition,
//     item('gregtech:frame_hg_alloy').definition,
//     item('gregtech:frame_adamantium').definition,
//     item('gregtech:frame_einsteinium').definition,
//     item('gregtech:frame_neptunium').definition,
//     item('gregtech:frame_talonite').definition,
//     item('gregtech:frame_inconel_b').definition,
//     item('gregtech:frame_incoloy813').definition,
//     item('gregtech:frame_californium').definition,
//     item('gregtech:frame_quantum').definition,
//     item('gregtech:frame_tumbaga').definition,
//     item('gregtech:frame_inconel_a').definition,
//     item('gregtech:frame_vibranium').definition,
//     item('gregtech:frame_plutonium_radioactive').definition,
//     item('gregtech:frame_hastelloy_x78').definition,
//     item('gregtech:frame_pikyonium').definition,
//     item('gregtech:frame_tungsten_titanium_carbide').definition,
//     item('gregtech:frame_maraging_steel_a').definition,
//     item('gregtech:frame_babbitt_alloy').definition,
//     item('gregtech:frame_duranium').definition,
//     item('gregtech:frame_lithium_titanate').definition,
//     item('gregtech:frame_hsss').definition,
//     item('gregtech:frame_black_steel').definition,
//     item('gregtech:frame_red_steel').definition,
//     item('gregtech:frame_enriched_naquadah_alloy').definition,
//     item('gregtech:frame_naquadria').definition,
//     item('gregtech:frame_curium').definition,
//     item('gregtech:frame_thorium').definition,
//     item('gregtech:frame_polytetrafluoroethylene').definition,
//     item('gregtech:frame_zirconium_carbide').definition,
//     item('gregtech:frame_metastable_oganesson').definition,
//     
// 
// ] as IItemDefinition[];
// 
// 
// val allArrays		= [
//     fusedQuartz,
//     fusedGlass,
//     gtFrame,
//     gcyFrame
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