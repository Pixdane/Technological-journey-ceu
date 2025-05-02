package recipes.byMod.gregfication

// Hide items from JEI
mods.jei.ingredient.yeet(
        item('variegated:silvered_apple'),
        item('variegated:silvered_apple', 1),
)

crafting.removeByOutput(item('variegated:defiled_ground'))

crafting.addShaped(item('variegated:defiled_ground') * 4,
        [
                [ore('itemSkull'), item('minecraft:soul_sand'), ore('itemSkull')],
                [item('minecraft:soul_sand'), ore('ingotSoularium'), item('minecraft:soul_sand')],
                [ore('itemSkull'), item('minecraft:soul_sand'), ore('itemSkull')]
        ])