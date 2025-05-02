package recipes.byMod.gregfication

// Hide items from JEI
mods.jei.ingredient.yeet(
        item('mob_grinding_utils:wither_muffler'),
        item('mob_grinding_utils:saw_upgrade', 1),
        item('mob_grinding_utils:saw_upgrade', 5),
        item('mob_grinding_utils:gm_chicken_feed'),
        item('mob_grinding_utils:mob_swab'),
        item('mob_grinding_utils:dark_oak_stone'),
)

// Recipe removals
[
        item('mob_grinding_utils:spikes'),
        item('mob_grinding_utils:fan'),
        item('mob_grinding_utils:fan_upgrade'),
        item('mob_grinding_utils:fan_upgrade', 1),
        item('mob_grinding_utils:fan_upgrade', 2),
        item('mob_grinding_utils:saw'),
        item('mob_grinding_utils:saw_upgrade'),
        item('mob_grinding_utils:saw_upgrade', 2),
        item('mob_grinding_utils:saw_upgrade', 3),
        item('mob_grinding_utils:saw_upgrade', 4),
].forEach {
        crafting.removeByOutput(it)
}

crafting.addShaped(item('mob_grinding_utils:fan'), [
        [ore('plateAluminium'), ore('dustRedstone'), ore('cableGtSingleTin')],
        [ore('dustRedstone'), metaitem('hull.lv'), ore('rotorSteel')],
        [ore('plateAluminium'), ore('dustRedstone'), ore('cableGtSingleTin')]
])

crafting.addShaped(item('mob_grinding_utils:spikes'), [
        [null, item('minecraft:iron_sword'), null],
        [item('minecraft:iron_sword'), metaitem('hull.lv'), item('minecraft:iron_sword')],
        [ore('wireGtDoubleIron'), ore('wireGtDoubleIron'), ore('wireGtDoubleIron')]
])

crafting.addShaped(item('mob_grinding_utils:saw'), [
        [ore('plateStainlessSteel'), ore('toolHeadBuzzSawDiamond'), ore('plateStainlessSteel')],
        [ore('toolHeadBuzzSawDiamond'), item('mob_grinding_utils:spikes'), ore('toolHeadBuzzSawDiamond')],
        [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('mob_grinding_utils:fan_upgrade'), [
        [ore('plateIron'), null, ore('plateIron')],
        [ore('feather'), ore('rotorSteel'), ore('feather')],
        [ore('plateIron'), null, ore('plateIron')]
])

crafting.addShaped(item('mob_grinding_utils:fan_upgrade', 1), [
        [ore('plateIron'), ore('feather'), ore('plateIron')],
        [null, ore('rotorSteel'), null],
        [ore('plateIron'), ore('feather'), ore('plateIron')]
])

crafting.addShaped(item('mob_grinding_utils:fan_upgrade', 2), [
        [ore('plateIron'), ore('feather'), ore('plateIron')],
        [ore('feather'), ore('rotorSteel'), ore('feather')],
        [ore('plateIron'), ore('feather'), ore('plateIron')]
])

crafting.addShaped(item('mob_grinding_utils:saw_upgrade'), [
        [ore('plateGold'), item('minecraft:iron_sword'), ore('plateGold')],
        [item('minecraft:iron_sword'), ore('plateRedstone'), item('minecraft:iron_sword')],
        [ore('plateGold'), item('minecraft:iron_sword'), ore('plateGold')]
])

crafting.addShaped(item('mob_grinding_utils:saw_upgrade', 2), [
        [ore('plateGold'), ore('dustBlaze'), ore('plateGold')],
        [ore('dustBlaze'), ore('plateRedstone'), ore('dustBlaze')],
        [ore('plateGold'), ore('dustBlaze'), ore('plateGold')]
])

crafting.addShaped(item('mob_grinding_utils:saw_upgrade', 3), [
        [ore('plateGold'), item('minecraft:rotten_flesh'), ore('plateGold')],
        [item('minecraft:rotten_flesh'), ore('plateRedstone'), item('minecraft:rotten_flesh')],
        [ore('plateGold'), item('minecraft:rotten_flesh'), ore('plateGold')]
])

crafting.addShaped(item('mob_grinding_utils:saw_upgrade', 4), [
        [ore('plateGold'), item('minecraft:spider_eye'), ore('plateGold')],
        [item('minecraft:spider_eye'), ore('plateRedstone'), item('minecraft:spider_eye')],
        [ore('plateGold'), item('minecraft:spider_eye'), ore('plateGold')]
])
