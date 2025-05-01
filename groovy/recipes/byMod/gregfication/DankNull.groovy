package recipes.byMod.gregfication

// Hide items from JEI
mods.jei.ingredient.yeet(
        item('danknull:dank_null_2'),
        item('danknull:dank_null_3'),
        item('danknull:dank_null_4'),
        item('danknull:dank_null_5'),
        item('danknull:dank_null_6'),
        item('danknull:dank_null_panel_2'),
        item('danknull:dank_null_panel_3'),
        item('danknull:dank_null_panel_4'),
        item('danknull:dank_null_panel_5'),
        item('danknull:danknull_dock'),
)

// Recipe removals
[
        item('danknull:dank_null_0'),
        item('danknull:dank_null_1'),

        item('danknull:dank_null_panel_0'),
        item('danknull:dank_null_panel_1'),
].forEach {
    crafting.removeByOutput(it)
}

crafting.addShaped(item('danknull:dank_null_panel_0'), [
        [item('minecraft:redstone_block'), item('minecraft:coal_block'), item('minecraft:redstone_block')],
        [item('minecraft:coal_block'), item('minecraft:glass'), item('minecraft:coal_block')],
        [item('minecraft:redstone_block'), item('minecraft:coal_block'), item('minecraft:redstone_block')]
])
crafting.addShaped(item('danknull:dank_null_0'), [
        [item('danknull:dank_null_panel_0'), item('danknull:dank_null_panel_0'), item('danknull:dank_null_panel_0')],
        [item('danknull:dank_null_panel_0'), item('minecraft:coal_block'), item('danknull:dank_null_panel_0')],
        [item('danknull:dank_null_panel_0'), item('danknull:dank_null_panel_0'), item('danknull:dank_null_panel_0')]
])

crafting.addShaped(item('danknull:dank_null_1'), [
        [item('danknull:dank_null_panel_1'), item('danknull:dank_null_panel_1'), item('danknull:dank_null_panel_1')],
        [item('danknull:dank_null_panel_1'), item('danknull:dank_null_0'), item('danknull:dank_null_panel_1')],
        [item('danknull:dank_null_panel_1'), item('danknull:dank_null_panel_1'), item('danknull:dank_null_panel_1')]
])

crafting.addShaped(item('danknull:dank_null_panel_1'), [
        [ore('blockLapis'), ore('blockCoalCoke'), ore('blockLapis')],
        [ore('blockCoalCoke'), item('gregtech:transparent_casing'), ore('blockCoalCoke')],
        [ore('blockLapis'), ore('blockCoalCoke'), ore('blockLapis')]
])