import static classes.utils.TJUtility.tjceu

ALLOY_SMELTER = recipemap('alloy_smelter')
MIXER = recipemap('mixer')
MACERATOR = recipemap('macerator')
SOLIDIFIER = recipemap('fluid_solidifier')
ASSEMBLER = recipemap('assembler')
ARC_FURNACE = recipemap('arc_furnace')
ALLOY_BLAST_SMELTER = recipemap('alloy_blast_smelter')

//EIO metals to gregtech 

//end Alloy
ALLOY_SMELTER.recipeBuilder()
        .inputs([item('minecraft:ender_eye'), item('enderio:item_alloy_ingot')])
        .outputs([item('enderio:item_alloy_ingot:8')])
        .duration(160)
        .EUt(1024)
        .buildAndRegister()
//Energetic Alloy
ALLOY_SMELTER.recipeBuilder()
        .inputs([ore('dustGlowstone'), ore('ingotGold') * 2])
        .outputs([item('enderio:item_alloy_ingot:1') * 2])
        .duration(160)
        .EUt(30)
        .buildAndRegister()
//electric steel
ALLOY_SMELTER.recipeBuilder()
        .inputs([ore('ingotIron'), ore('dustSilicon')])
        .outputs([item('enderio:item_alloy_ingot')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()
//Vibrant alloy
ALLOY_SMELTER.recipeBuilder()
        .inputs([item('enderio:item_alloy_ingot:1') * 2, ore('enderpearl')])
        .outputs([item('enderio:item_alloy_ingot:2') * 2])
        .duration(160)
        .EUt(30)
        .buildAndRegister()
// dark steel
ALLOY_SMELTER.recipeBuilder()
        .inputs([ore('ingotSteel'), ore('stoneObsidian')])
        .outputs([item('enderio:item_alloy_ingot:6')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()
//soularium
ALLOY_SMELTER.recipeBuilder()
        .inputs([item('minecraft:soul_sand'), ore('ingotGold')])
        .outputs([item('enderio:item_alloy_ingot:7')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()
//pulsating iron ingot
ALLOY_SMELTER.recipeBuilder()
        .inputs([ore('ingotIron'), ore('dustUranium')])
        .outputs([item('enderio:item_alloy_ingot:5')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()
ALLOY_SMELTER.recipeBuilder()
        .inputs([ore('ingotIron'), ore('ingotUranium')])
        .outputs([item('enderio:item_alloy_ingot:5')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()
//conductive iron
ALLOY_SMELTER.recipeBuilder()
        .inputs([ore('dustRedstone'), ore('ingotIron')])
        .outputs([item('enderio:item_alloy_ingot:4')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()
//red alloy
ALLOY_SMELTER.recipeBuilder()
        .inputs([ore('dustRedstone'), ore('itemSilicon')])
        .outputs([item('enderio:item_alloy_ingot:3')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()
//.notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 1}))
//organic black dye
ALLOY_SMELTER.recipeBuilder()
        .inputs([item('minecraft:coal'), item('minecraft:tallgrass:1') * 2])
        .outputs([item('enderio:item_material:50') * 2])
        .duration(160)
        .EUt(30)
        .buildAndRegister()
//organic brown dye
ALLOY_SMELTER.recipeBuilder()
        .inputs([item('minecraft:coal:1'), ore('treeSapling') * 4])
        .outputs([item('enderio:item_material:49') * 2])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

ALLOY_SMELTER.recipeBuilder()
        .inputs([item('minecraft:quartz') * 4])
        .outputs([item('enderio:block_fused_quartz')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

MIXER.recipeBuilder()
        .inputs([ore('gravel') * 4, ore('sand') * 4])
        .fluidInputs(fluid('water') * 1000)
        .outputs([ore('itemBinderComposite').getFirst() * 16])
        .duration(80).EUt(500).buildAndRegister()

//soul powder

MACERATOR.recipeBuilder()
        .inputs([item('enderio:item_alloy_ingot:7')])
        .outputs([item('enderio:item_material:74')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

ALLOY_BLAST_SMELTER.recipeBuilder()
        .inputs([ore('dustStarmetalAlloy') * 5, ore('dustAmericium') * 4, ore('dustNetherStar')])
        .fluidOutputs(fluid('molten.stellar_alloy') * 1440)
        .duration(420)
        .blastFurnaceTemp(8100)
        .EUt(2430)
        .buildAndRegister()

SOLIDIFIER.recipeBuilder()
        .fluidInputs(fluid('molten.stellar_alloy') * 144)
        .notConsumable(metaitem('shape.mold.ingot'))
        .outputs(item('enderio:item_alloy_endergy_ingot:3'))
        .duration(20)
        .EUt(8)
        .buildAndRegister()

crafting.removeByOutput(item('enderio:block_soul_binder'))
crafting.addShaped(tjceu('block_soul_binder'), item('enderio:block_soul_binder'), [
        [item('enderio:item_alloy_ingot:7'), item('minecraft:skull:2'), item('enderio:item_alloy_ingot:7')],
        [item('minecraft:skull:2'), item('enderio:item_material:53'), item('minecraft:skull:2')],
        [item('enderio:item_alloy_ingot:7'), item('minecraft:skull:2'), item('enderio:item_alloy_ingot:7')]
])
crafting.addShapeless(tjceu('invisible_block_convert'), item('enderio:block_decoration1:15'), [item('enderio:item_conduit_facade:2')])
crafting.addShaped(tjceu('item_conduit_facade'), item('enderio:item_conduit_facade:2'), [
        [null, null, null],
        [null, item('enderio:item_conduit_facade'), item('appliedenergistics2:quartz_vibrant_glass')],
        [null, null, null]
])
crafting.addShaped(tjceu('item_conduit_facade_2'), item('enderio:item_conduit_facade:2'), [
        [item('enderio:item_material:4'), item('enderio:item_material:4'), item('enderio:item_material:4')],
        [item('enderio:item_material:4'), item('appliedenergistics2:quartz_vibrant_glass'), item('enderio:item_material:4')],
        [item('enderio:item_material:4'), item('enderio:item_material:4'), item('enderio:item_material:4')]
])
crafting.removeByOutput(item('enderio:block_decoration1:15'))
crafting.removeByOutput(item('enderio:item_conduit_facade:2'))

ASSEMBLER.recipeBuilder()
        .inputs([ore('plateDoubleSteel'), item('enderio:item_alloy_ingot:6')])
        .outputs([item('enderio:item_dark_steel_upgrade')])
        .duration(100)
        .EUt(30)
        .buildAndRegister()


crafting.removeByOutput(item('enderio:item_yeta_wrench'))
crafting.addShaped(tjceu('item_yeta_wrench'), item('enderio:item_yeta_wrench'), [
        [null, item('minecraft:iron_ingot'), null],
        [null, ore('ingotTin'), null],
        [item('minecraft:iron_ingot'), null, item('minecraft:iron_ingot')]
])

crafting.removeByOutput(item('enderio:block_tele_pad'))

ASSEMBLER.recipeBuilder()
        .inputs([metaitem('emitter.mv'), metaitem('sensor.mv'), item('enderio:block_cap_bank:3'), metaitem('hull.mv') * 3])
        .outputs([item('enderio:block_tele_pad') * 9])
        .duration(180)
        .EUt(480)
        .buildAndRegister()


MACERATOR.recipeBuilder()
        .inputs([item('enderio:item_material:14')])
        .outputs([item('enderio:item_material:36')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()


MACERATOR.recipeBuilder()
        .inputs([item('enderio:item_material:16')])
        .outputs([item('enderio:item_material:37')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()


MACERATOR.recipeBuilder()
        .inputs([item('enderio:item_material:19')])
        .outputs([item('enderio:item_material:34')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()


ARC_FURNACE.recipeBuilder()
        .inputs([ore('dustCoke') * 64])
        .fluidInputs(fluid('fire_water') * 100)
        .outputs([item('enderio:item_material:20') * 64])
        .duration(120)
        .EUt(28)
        .buildAndRegister()


