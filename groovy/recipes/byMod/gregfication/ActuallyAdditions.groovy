import static classes.utils.TJUtility.*

ASSEMBLER = recipemap('assembler')
LASER_ENGRAVER = recipemap('laser_engraver')
EXTRACTOR = recipemap('extractor')

// Hide items from JEI
mods.jei.ingredient.yeet(
        item('actuallyadditions:block_misc', 7),
        item('actuallyadditions:block_atomic_reconstructor'),
        item('actuallyadditions:block_empowerer'),
        item('actuallyadditions:block_lava_factory_controller'),
        item('actuallyadditions:block_tiny_torch'),
        item('actuallyadditions:item_color_lens'),
        item('actuallyadditions:item_mining_lens'),
        item('actuallyadditions:block_coal_generator'),
        item('actuallyadditions:block_firework_box'),
        item('actuallyadditions:block_canola_press'),
        item('actuallyadditions:block_heat_collector'),
        item('actuallyadditions:block_coffee_machine'),
        item('actuallyadditions:block_inputter'),
        item('actuallyadditions:block_inputter_advanced'),
        item('actuallyadditions:block_item_repairer'),
        item('actuallyadditions:block_miner'),
        item('actuallyadditions:block_leaf_generator'),
        item('actuallyadditions:block_bio_reactor'),
        item('actuallyadditions:block_oil_generator'),
        item('actuallyadditions:block_enervator'),
        item('actuallyadditions:block_energizer'),
        item('actuallyadditions:block_grinder'),
        item('actuallyadditions:block_grinder_double'),
        item('actuallyadditions:block_furnace_double'),
        item('actuallyadditions:block_fermenting_barrel'),
)

// Recipe removals
[
].forEach {
    crafting.removeByOutput(it)
}

// Hide JEI categories
[
        'actuallyadditions.coffee',
        'actuallyadditions.crushing',
        'actuallyadditions.reconstructor',
        'actuallyadditions.empowerer',
        'actuallyadditions.booklet',
].each {
    mods.jei.category.hideCategory(it)
}

// Red
ASSEMBLER.recipeBuilder()
        .inputs([item('actuallyadditions:block_crystal'), item('minecraft:brick') * 2, item('minecraft:netherbrick') * 2, item('minecraft:redstone_block') * 2])
        .fluidInputs(fluid('plastic') * 288)
        .outputs([item('actuallyadditions:block_crystal_empowered')])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('actuallyadditions:item_crystal'), item('minecraft:brick_block') * 2, item('minecraft:nether_brick') * 2, item('minecraft:redstone_block') * 2])
        .fluidInputs(fluid('plastic') * 288)
        .outputs([item('actuallyadditions:item_crystal_empowered')])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

// Blue
ASSEMBLER.recipeBuilder()
        .inputs([item('actuallyadditions:block_crystal', 1), item('minecraft:prismarine') * 2, item('minecraft:lapis_block') * 2])
        .fluidInputs(fluid('plastic') * 288)
        .outputs([item('actuallyadditions:block_crystal_empowered', 1)])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('actuallyadditions:item_crystal', 1), item('minecraft:prismarine') * 2, item('minecraft:lapis_block') * 2])
        .fluidInputs(fluid('plastic') * 288)
        .outputs([item('actuallyadditions:item_crystal_empowered', 1)])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

// White
ASSEMBLER.recipeBuilder()
        .inputs([item('actuallyadditions:block_crystal', 5), item('minecraft:snow') * 2, item('minecraft:stone') * 2])
        .fluidInputs(fluid('plastic') * 288)
        .outputs([item('actuallyadditions:block_crystal_empowered', 5)])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('actuallyadditions:item_crystal', 5), item('minecraft:snow') * 2, item('minecraft:stone') * 2])
        .fluidInputs(fluid('plastic') * 288)
        .outputs([item('actuallyadditions:item_crystal_empowered', 5)])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

// Black
ASSEMBLER.recipeBuilder()
        .inputs([item('actuallyadditions:block_crystal', 3), ore('blockCharcoal') * 2, ore('blockCoalCoke') * 2])
        .fluidInputs(fluid('plastic') * 288)
        .outputs([item('actuallyadditions:block_crystal_empowered', 3)])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('actuallyadditions:item_crystal', 3), ore('blockCharcoal') * 2, ore('blockCoalCoke') * 2])
        .fluidInputs(fluid('plastic') * 288)
        .outputs([item('actuallyadditions:item_crystal_empowered', 3)])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

// Light blue
ASSEMBLER.recipeBuilder()
        .inputs([item('actuallyadditions:block_crystal', 2), item('minecraft:clay') * 4])
        .fluidInputs(fluid('plastic') * 288)
        .outputs([item('actuallyadditions:block_crystal_empowered', 2)])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('actuallyadditions:item_crystal', 2), item('minecraft:clay') * 4])
        .fluidInputs(fluid('plastic') * 288)
        .outputs([item('actuallyadditions:item_crystal_empowered', 2)])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

// Green
ASSEMBLER.recipeBuilder()
        .inputs([item('actuallyadditions:block_crystal', 4), ore('blockSlime') * 2, metaitem('plant_ball') * 2])
        .fluidInputs(fluid('plastic') * 288)
        .outputs([item('actuallyadditions:block_crystal_empowered', 4)])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('actuallyadditions:item_crystal', 4), ore('blockSlime') * 2, metaitem('plant_ball') * 2])
        .fluidInputs(fluid('plastic') * 288)
        .outputs([item('actuallyadditions:item_crystal_empowered', 4)])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

crafting.addShaped(tjceu('stainless_steel_casing'), item('actuallyadditions:block_misc', 9), [[null, ore('plateStainlessSteel'), null], [ore('plateStainlessSteel'), item('actuallyadditions:item_misc', 5), ore('plateStainlessSteel')], [null, ore('plateStainlessSteel'), null]])

// TODO: custom lens for AA recipes?

// Attomic recipes
LASER_ENGRAVER.recipeBuilder()
        .inputs(item('minecraft:quartz_block', 1))
        .notConsumable(ore('craftingLensGreen'))
        .outputs(item('actuallyadditions:block_testifi_bucks_green_wall'))
        .EUt(8)
        .duration(20)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs(item('minecraft:quartz_block'))
        .notConsumable(ore('craftingLensLightGray'))
        .outputs(item('actuallyadditions:block_testifi_bucks_white_wall'))
        .EUt(8)
        .duration(20)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs(item('minecraft:quartz'))
        .notConsumable(ore('craftingLensCyan'))
        .outputs(item('minecraft:prismarine_shard'))
        .EUt(8)
        .duration(20)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs(item('minecraft:quartz'))
        .notConsumable(ore('craftingLensBlue'))
        .outputs(item('minecraft:prismarine_crystals'))
        .EUt(8)
        .duration(20)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs(item('minecraft:red_mushroom'))
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('minecraft:nether_wart'))
        .EUt(8)
        .duration(20)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs(item('minecraft:rotten_flesh'))
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('minecraft:leather'))
        .EUt(8)
        .duration(20)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs(item('minecraft:sand'))
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('minecraft:soul_sand'))
        .EUt(8)
        .duration(20)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs(item('minecraft:iron_block'))
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('actuallyadditions:block_crystal', 5))
        .EUt(8)
        .duration(20)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs(item('minecraft:coal_block'))
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('actuallyadditions:block_crystal', 3))
        .EUt(8)
        .duration(20)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs(item('minecraft:emerald_block'))
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('actuallyadditions:block_crystal', 4))
        .EUt(8)
        .duration(20)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs(item('minecraft:diamond_block'))
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('actuallyadditions:block_crystal', 2))
        .EUt(8)
        .duration(20)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs(item('minecraft:lapis_block'))
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('actuallyadditions:block_crystal', 1))
        .EUt(8)
        .duration(20)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs(item('minecraft:redstone_block'))
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('actuallyadditions:block_crystal'))
        .EUt(8)
        .duration(20)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs(item('actuallyadditions:item_canola_seed') * 30)
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('actuallyadditions:item_misc', 23) * 30)
        .EUt(8)
        .duration(20)
        .buildAndRegister()

crafting.addShaped(tjceu('block_laser_relay_item'), item('actuallyadditions:block_laser_relay_item') * 4, [
        [item('minecraft:obsidian'), item('minecraft:emerald_block'), item('minecraft:obsidian')],
        [item('actuallyadditions:item_crystal', 4), item('actuallyadditions:item_misc', 8), item('actuallyadditions:item_crystal', 4)],
        [item('minecraft:obsidian'), item('minecraft:emerald_block'), item('minecraft:obsidian')]
])

crafting.addShaped(tjceu('block_laser_relay_fluids'), item('actuallyadditions:block_laser_relay_fluids') * 4, [
        [item('minecraft:obsidian'), item('minecraft:lapis_block'), item('minecraft:obsidian')],
        [item('actuallyadditions:item_crystal', 1), item('actuallyadditions:item_misc', 8), item('actuallyadditions:item_crystal', 1)],
        [item('minecraft:obsidian'), item('minecraft:lapis_block'), item('minecraft:obsidian')]
])

// Basic Precision Laser Engraver
crafting.addShapeless(item('gregtech:mte', 560), [item('actuallyadditions:block_atomic_reconstructor')])


EXTRACTOR.recipeBuilder()
        .inputs(item('actuallyadditions:item_solidified_experience') * 64)
        .fluidOutputs(fluid('xpjuice') * 10240)
        .duration(100)
        .EUt(30)
        .buildAndRegister()
