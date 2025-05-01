package recipes.byMod.gregfication

crafting.removeByOutput(item('variegated:defiled_ground'))

crafting.addShaped(item('variegated:defiled_ground') * 4,
        [
                [ore('itemSkull'), item('minecraft:soul_sand'), ore('itemSkull')],
                [item('minecraft:soul_sand'), ore('ingotSoularium'), item('minecraft:soul_sand')],
                [ore('itemSkull'), item('minecraft:soul_sand'), ore('itemSkull')]
        ])