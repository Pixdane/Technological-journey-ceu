VIAL_PROCESSOR = recipemap('vial_processing')

def vial = { it.isEmpty() ? item('enderio:item_soul_vial') : item('enderio:item_soul_vial', 1).withNbt(['entityId': it]) }

VIAL_PROCESSOR.recipeBuilder()
        .inputs(vial('minecraft:enderman'))
        .outputs(item('enderio:block_enderman_skull') * 10, item('minecraft:ender_pearl') * 10, vial(''), item('actuallyadditions:item_solidified_experience') * 6)
        .EUt(16)
        .duration(3)
        .buildAndRegister()

VIAL_PROCESSOR.recipeBuilder()
        .inputs(vial('minecraft:blaze'))
        .outputs(item('minecraft:blaze_rod') * 10, vial(''), item('actuallyadditions:item_solidified_experience:0') * 4)
        .EUt(16)
        .duration(3)
        .buildAndRegister()

VIAL_PROCESSOR.recipeBuilder()
        .inputs(vial('minecraft:zombie'))
        .outputs(item('minecraft:skull', 2) * 9, vial(''), item('minecraft:rotten_flesh:0') * 9, item('actuallyadditions:item_solidified_experience:0') * 2)
        .EUt(16)
        .duration(3)
        .buildAndRegister()

VIAL_PROCESSOR.recipeBuilder()
        .inputs(vial('minecraft:skeleton'))
        .outputs(item('minecraft:bone') * 8, vial(''), item('actuallyadditions:item_solidified_experience:0') * 2)
        .EUt(16)
        .duration(3)
        .buildAndRegister()

VIAL_PROCESSOR.recipeBuilder()
        .inputs(vial('minecraft:pig'))
        .outputs(item('minecraft:porkchop:0') * 64, vial(''), item('actuallyadditions:item_solidified_experience:0') * 1)
        .EUt(16)
        .duration(3)
        .buildAndRegister()

VIAL_PROCESSOR.recipeBuilder()
        .inputs(vial('minecraft:chicken'))
        .outputs(item('minecraft:egg') * 64, item('minecraft:feather') * 26, vial(''), item('actuallyadditions:item_solidified_experience:0') * 1)
        .EUt(16)
        .duration(3)
        .buildAndRegister()

// TODO: more recipes
// TODO: machine recipes
// crafting.addShaped(item('gregtech:machine:1400'), [[item('enderio:item_soul_vial:1'), item('minecraft:diamond_sword:0'), item('enderio:item_soul_vial:1')],[item('minecraft:diamond_sword:0'), item('gregtech:mte:986'), item('minecraft:diamond_sword:0')], [ore('plateDoubleSteel'), ore('plateDoubleSteel'), ore('plateDoubleSteel')]]);