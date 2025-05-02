package recipes.byMod.gregfication

crafting.removeByOutput(item('simplevoidworld:portal'))
crafting.addShaped(item('simplevoidworld:portal'),
        [
                [ore('obsidian'), ore('gemDiamond'), ore('obsidian')],
                [ore('gemDiamond'), ore('toolPickaxe'), ore('gemDiamond')],
                [ore('obsidian'), ore('gemDiamond'), ore('obsidian')]
        ])
