// TODO
// Flux Network
// mixer.recipeBuilder()
// .inputs([ore('dustRedstone') * 64])
// .fluidInputs(fluid('lava') * 1000)
// .outputs([item('fluxnetworks:flux') * 64])
// .duration(240)
// .EUt(524288)
// .buildAndRegister();
// 
// crafting.removeByOutput(item('fluxnetworks:fluxcore'));
// crafting.removeByOutput(item('fluxnetworks:fluxpoint'));
// crafting.removeByOutput(item('fluxnetworks:fluxplug'));
// crafting.addShapeless(item('fluxnetworks:fluxplug'),[item('fluxnetworks:fluxpoint')]);
// crafting.addShapeless(item('fluxnetworks:fluxpoint'),[item('fluxnetworks:fluxplug')]);
// assembler.recipeBuilder()
// .inputs([item('fluxnetworks:flux') * 4,item('enderio:block_reinforced_obsidian') * 4,item('gregtech:meta_item_1:32724') * 2])
// .outputs([item('fluxnetworks:fluxcore') * 2])
// .duration(240)
// .EUt(524288)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('fluxnetworks:fluxcore')  * 8,ore('wireGtSingleUvSuperconductor') * 18])
// .outputs([item('fluxnetworks:fluxpoint') * 2])
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 1}))
// .duration(240)
// .EUt(524288)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('fluxnetworks:fluxcore')  * 8,ore('wireGtSingleUvSuperconductor') * 18])
// .outputs([item('fluxnetworks:fluxplug') * 2])
//     .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 2}))
// .duration(240)
// .EUt(524288)
// .buildAndRegister();