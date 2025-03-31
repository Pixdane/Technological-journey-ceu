ELECTROLYZER = recipemap('electrolyzer')

// Pahoehoe Lava Processing
ELECTROLYZER.recipeBuilder()
        .fluidInputs(liquid('pahoehoe_lava') * 10000)
        .outputs([item('minecraft:obsidian') * 1, metaitem('dustSulfur') * 1, metaitem('dustCarbon') * 1])
        .duration(20)
        .EUt(7000)
        .buildAndRegister();