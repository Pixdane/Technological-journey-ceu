//grappling hooks
LATHE = recipemap('lathe')

crafting.removeByOutput(item('hooked:microcrafting', 2))

LATHE.recipeBuilder()
        .inputs(ore('stickIron'))
        .outputs(item('hooked:microcrafting', 2) * 2)
        .duration(64)
        .EUt(30)
        .buildAndRegister()

/* TODO Recipe Conflict
LATHE.recipeBuilder()
        .inputs(ore('stickSteel'))
        .outputs(item('hooked:microcrafting', 2) * 4)
        .duration(64)
        .EUt(30)
        .buildAndRegister()
*/

crafting.removeByOutput(item('hooked:hook', 3))
crafting.removeByOutput(item('hooked:hook', 2))
crafting.removeByOutput(item('hooked:hook', 1))
crafting.addShaped(item('hooked:hook', 3), [[ore('plateRedstone'), ore('plateRedstone'), item('actuallyadditions:block_crystal')], [null, item('hooked:hook', 2), ore('plateRedstone')], [ore('plateRedstone'), null, ore('plateRedstone')]])
crafting.addShaped(item('hooked:hook', 2), [[null, ore('plateDiamond'), ore('plateDiamond')], [null, item('hooked:hook', 1), ore('plateDiamond')], [ore('plateDiamond'), null, null]])
crafting.addShaped(item('hooked:hook', 1), [[ore('plateDoubleIron'), ore('plateDoubleIron'), ore('wireGtDoubleIron')], [null, item('hooked:microcrafting', 3), ore('plateDoubleIron')], [item('hooked:microcrafting', 3), null, ore('plateDoubleIron')]])

