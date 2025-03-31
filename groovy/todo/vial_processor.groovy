// import mods.devtech.machines.RegisterMachine;
// import mods.devtech.OverlayFace;
// import mods.devtech.OverlayRenderer;
// import scripts.commonNames;
// import mods.gregtech.recipe.RecipeMaps;
// import mods.gregtech.recipe.RecipeMap;
// import mods.gtadditions.recipe.GARecipeMaps;
// import mods.devtech.IRecipeMap;
// import mods.devtech.machines.Overlays;
// import mods.devtech.GUITextures;
// import mods.devtech.OverlaySlot;
// import mods.devtech.MoveType;
// 
// var vial_processor = IRecipeMap.recipeMapBuilder("vial_processor",0,1,0,4,0,0,0,0)
//     .setOverlaySlots(OverlaySlot.newOverlaySlot(false, false,false,GUITextures.get("hammer_overlay")))
//     .setProgressBar(GUITextures.get("progress_bar_bending"), MoveType.VERTICAL)
//     .build();
// 
// RegisterMachine.CreateSimpleMachine(1400, "vial_processor",vial_processor, Overlays.get("extractor"), 1);
// 
// vial_processor.recipeBuilder()
// .inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:enderman"}))
// .outputs(ore('itemSkull') * 10,ore('enderpearl,gemEnderPearl,materialEnderPearl') * 10,item('enderio:item_soul_vial:0'), item('actuallyadditions:item_solidified_experience:0') * 6)
// .EUt(16)
// .duration(3)
// .buildAndRegister();
// 
// vial_processor.recipeBuilder()
// .inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:blaze"}))
// .outputs(ore('itemBlazeRod,rodBlaze,stickBlaze') * 10 ,item('enderio:item_soul_vial:0'), item('actuallyadditions:item_solidified_experience:0') * 4)
// .EUt(16)
// .duration(3)
// .buildAndRegister();
// 
// vial_processor.recipeBuilder()
// .inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:zombie"}))
// .outputs(ore('itemSkull') * 9 , item('enderio:item_soul_vial:0'),item('minecraft:rotten_flesh:0') * 9, item('actuallyadditions:item_solidified_experience:0') * 2)
// .EUt(16)
// .duration(3)
// .buildAndRegister();
// 
// vial_processor.recipeBuilder()
// .inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:skeleton"}))
// .outputs(ore('bone,stickBone') * 8, item('enderio:item_soul_vial:0'), item('actuallyadditions:item_solidified_experience:0') * 2)
// .EUt(16)
// .duration(3)
// .buildAndRegister();
// 
// vial_processor.recipeBuilder()
// .inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:pig"}))
// .outputs(item('minecraft:porkchop:0') * 64, item('enderio:item_soul_vial:0'), item('actuallyadditions:item_solidified_experience:0') * 1)
// .EUt(16)
// .duration(3)
// .buildAndRegister();
// 
// vial_processor.recipeBuilder()
// .inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:chicken"}))
// .outputs(ore('egg') * 64, ore('craftingFeather,feather') * 26, item('enderio:item_soul_vial:0'), item('actuallyadditions:item_solidified_experience:0') * 1)
// .EUt(16)
// .duration(3)
// .buildAndRegister();
// 
// 
// 
// recipes.addShaped(item('gregtech:machine:1400'), [[item('enderio:item_soul_vial:1'), item('minecraft:diamond_sword:0'), item('enderio:item_soul_vial:1')],[item('minecraft:diamond_sword:0'), item('gregtech:mte:986'), item('minecraft:diamond_sword:0')], [ore('plateDoubleSteel'), ore('plateDoubleSteel'), ore('plateDoubleSteel')]]);