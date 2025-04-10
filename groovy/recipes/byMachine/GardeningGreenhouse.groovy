GARDEING_GREENHOUSE = recipemap('horticultural_cultivation')

def plants = [
        item('futuremc:wither_rose'),
        item('futuremc:lily_of_the_valley'),
        item('futuremc:cornflower'),
        item('minecraft:red_flower'),
        item('minecraft:red_flower', 1),
        item('minecraft:red_flower', 2),
        item('minecraft:red_flower', 3),
        item('minecraft:red_flower', 4),
        item('minecraft:red_flower', 5),
        item('minecraft:red_flower', 6),
        item('minecraft:red_flower', 7),
        item('minecraft:red_flower', 8),
        item('minecraft:yellow_flower'),
        item('minecraft:double_plant'),
        item('minecraft:double_plant', 1),
        item('minecraft:double_plant', 4),
        item('minecraft:double_plant', 5),
        item('minecraft:waterlily'),
        item('minecraft:dye', 3),
        item('randomthings:glowingmushroom'),

]

// TODO: more fertilizers?
plants.forEach {
    GARDEING_GREENHOUSE.recipeBuilder()
            .notConsumable(it)
            .circuitMeta(1)
            .inputs(item('minecraft:dye', 15))
            .fluidInputs(fluid('water') * 2000)
            .outputs(it)
            .duration(160)
            .EUt(14)
            .buildAndRegister()

    GARDEING_GREENHOUSE.recipeBuilder()
            .notConsumable(it)
            .circuitMeta(2)
            .inputs(ore('dustOrganicFertilizer'))
            .fluidInputs(fluid('water') * 2000)
            .outputs(it * 2)
            .duration(160)
            .EUt(14)
            .buildAndRegister()
}

GARDEING_GREENHOUSE.recipeBuilder()
        .circuitMeta(3)
        .inputs(item('minecraft:brown_mushroom'))
        .inputs(ore('dustGlowstone'))
        .fluidInputs(fluid('water') * 2000)
        .outputs(item('randomthings:glowingmushroom'))
        .duration(160)
        .EUt(14)
        .buildAndRegister();

GARDEING_GREENHOUSE.recipeBuilder()
        .circuitMeta(3)
        .inputs(item('minecraft:red_mushroom'))
        .inputs(ore('dustGlowstone'))
        .fluidInputs(fluid('water') * 2000)
        .outputs(item('randomthings:glowingmushroom'))
        .duration(160)
        .EUt(14)
        .buildAndRegister();
