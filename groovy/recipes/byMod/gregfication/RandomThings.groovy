package recipes.byMod.gregfication

crafting.removeByOutput(item('randomthings:spectreenergyinjector'))
crafting.removeByOutput(item('randomthings:ingredient', 1))

crafting.addShaped(item('randomthings:spectreenergyinjector'), [
        [item('minecraft:obsidian'), item('randomthings:spectrelens'), item('minecraft:obsidian')],
        [item('randomthings:ingredient', 12), item('randomthings:spectrecharger'), item('randomthings:ingredient', 12)],
        [item('minecraft:obsidian'), item('randomthings:ingredient', 12), item('minecraft:obsidian')]
])

crafting.addShaped(item('randomthings:ingredient', 1), [
        [item('randomthings:stableenderpearl'), ore('foilStainlessSteel'), item('randomthings:stableenderpearl')],
        [ore('foilStainlessSteel'), ore('itemSkull'), ore('foilStainlessSteel')],
        [item('randomthings:stableenderpearl'), ore('foilStainlessSteel'), item('randomthings:stableenderpearl')]
])
