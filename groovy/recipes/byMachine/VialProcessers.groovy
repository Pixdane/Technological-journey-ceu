VIAL_PROCESSOR = recipemap('vial_processing')
LVP = recipemap('advanced_vial_processing')
LPS = recipemap('soul_capture')

def vial = { it.isEmpty() ? item('enderio:item_soul_vial') : item('enderio:item_soul_vial', 1).withNbt(['entityId': it]) }

def mobs = [
        'minecraft:enderman',
        'minecraft:zombie',
        'minecraft:skeleton',
        'minecraft:blaze',
        'minecraft:ghast',
        'minecraft:spider',
        'minecraft:slime',
        'minecraft:creeper',
        'minecraft:magma_cube',
        'minecraft:witch',
        'minecraft:wither_skeleton',
        'minecraft:snowman',
        'minecraft:sheep',
        'minecraft:pig',
        'minecraft:chicken',
        'minecraft:cow'
]

VIAL_PROCESSOR.recipeBuilder()
        .inputs(vial('minecraft:enderman'))
        .outputs(item('enderio:block_enderman_skull') * 10, item('minecraft:ender_pearl') * 10, vial(''), item('actuallyadditions:item_solidified_experience') * 6)
        .EUt(16)
        .duration(3)
        .buildAndRegister()

VIAL_PROCESSOR.recipeBuilder()
        .inputs(vial('minecraft:blaze'))
        .outputs(item('minecraft:blaze_rod') * 10, vial(''), item('actuallyadditions:item_solidified_experience') * 4)
        .EUt(16)
        .duration(3)
        .buildAndRegister()

VIAL_PROCESSOR.recipeBuilder()
        .inputs(vial('minecraft:zombie'))
        .outputs(item('minecraft:skull', 2) * 9, vial(''), item('minecraft:rotten_flesh') * 9, item('actuallyadditions:item_solidified_experience') * 2)
        .EUt(16)
        .duration(3)
        .buildAndRegister()

VIAL_PROCESSOR.recipeBuilder()
        .inputs(vial('minecraft:skeleton'))
        .outputs(item('minecraft:bone') * 8, vial(''), item('actuallyadditions:item_solidified_experience') * 2)
        .EUt(16)
        .duration(3)
        .buildAndRegister()

VIAL_PROCESSOR.recipeBuilder()
        .inputs(vial('minecraft:pig'))
        .outputs(item('minecraft:porkchop') * 64, vial(''), item('actuallyadditions:item_solidified_experience') * 1)
        .EUt(16)
        .duration(3)
        .buildAndRegister()

VIAL_PROCESSOR.recipeBuilder()
        .inputs(vial('minecraft:chicken'))
        .outputs(item('minecraft:egg') * 64, item('minecraft:feather') * 26, vial(''), item('actuallyadditions:item_solidified_experience') * 1)
        .EUt(16)
        .duration(3)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:enderman'))
        .outputs(
                vial('') * 16,
                item('enderio:block_enderman_skull') * 192,
                item('minecraft:ender_pearl') * 192,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:zombie'))
        .outputs(
                vial('') * 16,
                item('minecraft:skull', 2) * 184,
                item('minecraft:rotten_flesh') * 160,
                item('minecraft:potato') * 4,
                item('minecraft:carrot') * 4,
                item('minecraft:melon') * 4,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:skeleton'))
        .outputs(
                vial('') * 16,
                item('minecraft:skull') * 24,
                item('minecraft:bone') * 128,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:blaze'))
        .outputs(
                vial('') * 16,
                item('minecraft:blaze_rod') * 160,
                item('minecraft:blaze_powder') * 64,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:ghast'))
        .outputs(
                vial('') * 16,
                item('minecraft:ghast_tear') * 112,
                metaitem('dustSalt') * 48,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:spider'))
        .outputs(
                vial('') * 16,
                item('minecraft:string') * 160,
                item('minecraft:web') * 12,
                item('minecraft:spider_eye') * 16,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:slime'))
        .outputs(
                vial('') * 16,
                item('minecraft:slime_ball') * 128,
                item('minecraft:slime') * 4,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:creeper'))
        .outputs(
                vial('') * 16,
                item('minecraft:skull', 4) * 24,
                item('minecraft:gunpowder') * 96,
                metaitem('dustSulfur') * 32,
                metaitem('dustSaltpeter') * 16,
                metaitem('dustCoal') * 16,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:megma_cube'))
        .outputs(
                vial('') * 16,
                item('minecraft:magma_cream') * 80,
                item('minecraft:blaze_powder') * 32,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:witch'))
        .outputs(
                vial('') * 16,
                item('minecraft:sugar') * 96,
                item('minecraft:redstone') * 80,
                item('minecraft:glowstone_dust') * 48,
                item('minecraft:gunpowder') * 32,
                item('minecraft:stick') * 32,
                item('minecraft:glass_bottle') * 12,
                item('minecraft:potion').withNbt(['Potion': 'minecraft:water']) * 4,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:wither_skeleton'))
        .outputs(
                vial('') * 16,
                item('minecraft:skull', 1) * 12,
                item('minecraft:bone') * 48,
                metaitem('dustCoal') * 32,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:snowman'))
        .outputs(
                vial('') * 16,
                item('minecraft:snowball') * 80,
                item('minecraft:snow') * 4,
                item('minecraft:ice') * 8,
                item('minecraft:pumpkin') * 4,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:sheep'))
        .outputs(
                vial('') * 16,
                item('minecraft:wool') * 128,
                item('minecraft:mutton') * 128,
                item('minecraft:string') * 32,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:pig'))
        .outputs(
                vial('') * 16,
                item('minecraft:porkchop') * 1024,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

LVP.recipeBuilder()
        .inputs(vial('minecraft:chicken'))
        .outputs(
                vial('') * 16,
                item('minecraft:egg') * 960,
                item('minecraft:feather') * 400,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .duration(20)
        .EUt(30720)
        .buildAndRegister()
LVP.recipeBuilder()
        .inputs(vial('minecraft:cow'))
        .outputs(
                vial('') * 16,
                item('minecraft:beef') * 512,
                item('minecraft:leather') * 128,
                item('actuallyadditions:item_solidified_experience') * 128
        )
        .fluidOutputs(fluid('milk') * 16000)
        .duration(20)
        .EUt(30720)
        .buildAndRegister()

mobs.eachWithIndex { mob, i ->
    LPS.recipeBuilder()
            .inputs(vial('') * 16)
            .fluidInputs(fluid('xpjuice') * 16000)
            .circuitMeta(i)
            .outputs(vial(mob) * 16)
            .duration(20)
            .EUt(30720)
            .buildAndRegister()
}
