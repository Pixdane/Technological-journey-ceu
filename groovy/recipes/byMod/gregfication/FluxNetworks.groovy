// TODO
// Flux Network
// mixer.recipeBuilder()
// .inputs([ore('dustRedstone') * 64])
// .fluidInputs(fluid('lava') * 1000)
// .outputs([item('fluxnetworks:flux:0') * 64])
// .duration(240)
// .EUt(524288)
// .buildAndRegister();
// 
// recipes.remove(item('fluxnetworks:fluxcore:0'));
// recipes.remove(item('fluxnetworks:fluxpoint:0'));
// recipes.remove(item('fluxnetworks:fluxplug:0'));
// recipes.addShapeless(item('fluxnetworks:fluxplug:0'),[item('fluxnetworks:fluxpoint:0')]);
// recipes.addShapeless(item('fluxnetworks:fluxpoint:0'),[item('fluxnetworks:fluxplug:0')]);
// assembler.recipeBuilder()
// .inputs([item('fluxnetworks:flux:0') * 4,item('enderio:block_reinforced_obsidian:0') * 4,item('gregtech:meta_item_1:32724') * 2])
// .outputs([item('fluxnetworks:fluxcore:0') * 2])
// .duration(240)
// .EUt(524288)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('fluxnetworks:fluxcore:0')  * 8,ore('wireGtSingleUvSuperconductor') * 18])
// .outputs([item('fluxnetworks:fluxpoint:0') * 2])
//     .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
// .duration(240)
// .EUt(524288)
// .buildAndRegister();
// 
// assembler.recipeBuilder()
// .inputs([item('fluxnetworks:fluxcore:0')  * 8,ore('wireGtSingleUvSuperconductor') * 18])
// .outputs([item('fluxnetworks:fluxplug:0') * 2])
//     .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 2}))
// .duration(240)
// .EUt(524288)
// .buildAndRegister();