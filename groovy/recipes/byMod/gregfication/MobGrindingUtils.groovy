package recipes.byMod.gregfication
//MOB stuff
crafting.removeByOutput(item('mob_grinding_utils:fan'))
crafting.addShaped(item('mob_grinding_utils:fan'),
        [
                [ore('plateAluminium'), ore('dustRedstone'), ore('cableGtSingleTin')],
                [ore('dustRedstone'), item('gregtech:mte', 986), ore('rotorSteel')],
                [ore('plateAluminium'), ore('dustRedstone'), ore('cableGtSingleTin')]
        ])

// TODO OtherRecipes
/*
def ironSwordBlade = item('gregtech:sword:*').when((ItemStack stack) -> {
    return stack.getOrCreateNbt().getCompoundTag('GT.Tool').getString('Material').equals('gregtech:iron')
})

crafting.removeByOutput(item('mob_grinding_utils:spikes'))
crafting.addShaped(item('mob_grinding_utils:spikes'), 
[
    [null, ironSwordBlade, null], 
    [ironSwordBlade, item('gregtech:mte', 986), ironSwordBlade], 
    [ore('wireGtDoubleIron'), ore('wireGtDoubleIron'), ore('wireGtDoubleIron')]
])

def stainlessSteelSwordBlade = item('gregtech:sword:*').when((ItemStack stack) -> {
    return stack.getOrCreateNbt().getCompoundTag('GT.Tool').getString('Material').equals('gregtech:stainless_steel')
})

crafting.removeByOutput(item('mob_grinding_utils:saw'))
crafting.addShaped(item('mob_grinding_utils:saw'), 
[
    [ore('plateStainlessSteel'), stainlessSteelSwordBlade, ore('plateStainlessSteel')], 
    [ore('gemExquisiteDiamond'), item('mob_grinding_utils:spikes'), ore('gemExquisiteDiamond')], 
    [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]
])
*/

crafting.removeByOutput(item('mob_grinding_utils:fan_upgrade', 1))
crafting.removeByOutput(item('mob_grinding_utils:fan_upgrade'))

crafting.addShaped(item('mob_grinding_utils:fan_upgrade', 1),
        [
                [ore('plateIron'), ore('feather'), ore('plateIron')],
                [null, ore('rotorSteel'), null],
                [ore('plateIron'), ore('feather'), ore('plateIron')]
        ])
crafting.addShaped(item('mob_grinding_utils:fan_upgrade'),
        [
                [ore('plateIron'), null, ore('plateIron')],
                [ore('feather'), ore('rotorSteel'), ore('feather')],
                [ore('plateIron'), null, ore('plateIron')]
        ])
crafting.addShaped(item('mob_grinding_utils:fan_upgrade', 2),
        [
                [ore('plateIron'), ore('feather'), ore('plateIron')],
                [ore('feather'), ore('rotorSteel'), ore('feather')],
                [ore('plateIron'), ore('feather'), ore('plateIron')]
        ])

crafting.removeByOutput(item('mob_grinding_utils:saw_upgrade', 4))
crafting.removeByOutput(item('mob_grinding_utils:saw_upgrade', 3))
crafting.removeByOutput(item('mob_grinding_utils:saw_upgrade'))
crafting.removeByOutput(item('mob_grinding_utils:fan_upgrade', 2))
crafting.removeByOutput(item('mob_grinding_utils:saw_upgrade', 2))

crafting.addShaped(item('mob_grinding_utils:saw_upgrade', 4),
        [
                [ore('plateGold'), item('minecraft:spider_eye'), ore('plateGold')],
                [item('minecraft:spider_eye'), ore('plateRedstone'), item('minecraft:spider_eye')],
                [ore('plateGold'), item('minecraft:spider_eye'), ore('plateGold')]
        ])
crafting.addShaped(item('mob_grinding_utils:saw_upgrade', 3),
        [
                [ore('plateGold'), item('minecraft:rotten_flesh'), ore('plateGold')],
                [item('minecraft:rotten_flesh'), ore('plateRedstone'), item('minecraft:rotten_flesh')],
                [ore('plateGold'), item('minecraft:rotten_flesh'), ore('plateGold')]
        ])
crafting.addShaped(item('mob_grinding_utils:saw_upgrade', 2),
        [
                [ore('plateGold'), ore('dustBlaze'), ore('plateGold')],
                [ore('dustBlaze'), ore('plateRedstone'), ore('dustBlaze')],
                [ore('plateGold'), ore('dustBlaze'), ore('plateGold')]
        ])

// TODO OtherRecipes
/*
crafting.addShaped(item('mob_grinding_utils:saw_upgrade'), 
[
    [ore('plateGold'), ironSwordBlade, ore('plateGold')], 
    [ironSwordBlade, ore('plateRedstone'), ironSwordBlade], 
    [ore('plateGold'), ironSwordBlade, ore('plateGold')]
])
*/