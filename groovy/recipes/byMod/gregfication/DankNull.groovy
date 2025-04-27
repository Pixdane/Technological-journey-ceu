crafting.removeByOutput(item('danknull:dank_null_0'))
crafting.removeByOutput(item('danknull:dank_null_panel_0'))

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

// crafting.removeByOutput(item('danknull:dank_null_1'))
// crafting.removeByOutput(item('danknull:dank_null_panel_1'))
// crafting.addShaped(item('danknull:dank_null_1'), [[item('danknull:dank_null_panel_1'), item('danknull:dank_null_panel_1'), item('danknull:dank_null_panel_1')], [item('danknull:dank_null_panel_1'), item('danknull:dank_null_0'), item('danknull:dank_null_panel_1')], [item('danknull:dank_null_panel_1'), item('danknull:dank_null_panel_1'), item('danknull:dank_null_panel_1')]])
// crafting.addShaped(item('danknull:dank_null_panel_1'), [[ore('blockLapis'), ore('blockCoalCoke'), ore('blockLapis')], [ore('blockCoalCoke'), item('gtadditions:ga_transparent_casing', 1), ore('blockCoalCoke')], [ore('blockLapis'), ore('blockCoalCoke'), ore('blockLapis')]])