VIAL_PROCESSOR = recipemap('vial_processing')

VIAL_PROCESSOR.recipeBuilder()
        .inputs(item('enderio:item_soul_vial:1').withTag({ entityId: "minecraft:enderman" }))
        .outputs(ore('itemSkull') * 10, ore('enderpearl,gemEnderPearl,materialEnderPearl') * 10, item('enderio:item_soul_vial:0'), item('actuallyadditions:item_solidified_experience:0') * 6)
        .EUt(16)
        .duration(3)
        .buildAndRegister()
// 
// VIAL_PROCESSOR.recipeBuilder()
// .inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:blaze"}))
// .outputs(ore('itemBlazeRod,rodBlaze,stickBlaze') * 10 ,item('enderio:item_soul_vial:0'), item('actuallyadditions:item_solidified_experience:0') * 4)
// .EUt(16)
// .duration(3)
// .buildAndRegister();
// 
// VIAL_PROCESSOR.recipeBuilder()
// .inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:zombie"}))
// .outputs(ore('itemSkull') * 9 , item('enderio:item_soul_vial:0'),item('minecraft:rotten_flesh:0') * 9, item('actuallyadditions:item_solidified_experience:0') * 2)
// .EUt(16)
// .duration(3)
// .buildAndRegister();
// 
// VIAL_PROCESSOR.recipeBuilder()
// .inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:skeleton"}))
// .outputs(ore('bone,stickBone') * 8, item('enderio:item_soul_vial:0'), item('actuallyadditions:item_solidified_experience:0') * 2)
// .EUt(16)
// .duration(3)
// .buildAndRegister();
// 
// VIAL_PROCESSOR.recipeBuilder()
// .inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:pig"}))
// .outputs(item('minecraft:porkchop:0') * 64, item('enderio:item_soul_vial:0'), item('actuallyadditions:item_solidified_experience:0') * 1)
// .EUt(16)
// .duration(3)
// .buildAndRegister();
// 
// VIAL_PROCESSOR.recipeBuilder()
// .inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:chicken"}))
// .outputs(ore('egg') * 64, ore('craftingFeather,feather') * 26, item('enderio:item_soul_vial:0'), item('actuallyadditions:item_solidified_experience:0') * 1)
// .EUt(16)
// .duration(3)
// .buildAndRegister();
// 
// 
// 
// recipes.addShaped(item('gregtech:machine:1400'), [[item('enderio:item_soul_vial:1'), item('minecraft:diamond_sword:0'), item('enderio:item_soul_vial:1')],[item('minecraft:diamond_sword:0'), item('gregtech:mte:986'), item('minecraft:diamond_sword:0')], [ore('plateDoubleSteel'), ore('plateDoubleSteel'), ore('plateDoubleSteel')]]);