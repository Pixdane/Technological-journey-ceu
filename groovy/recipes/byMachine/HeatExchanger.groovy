package recipes.byMachine

HEAT_EXCHANGER = recipemap('heat_exchanger')
ELECTROLYZER = recipemap('electrolyzer')

HEAT_EXCHANGER.recipeBuilder().with {
        fluidInputs fluid('water') * 2880, fluid('lava') * 1000

}
        .fluidOutputs(fluid('steam') * 172800, fluid('pahoehoe_lava') * 1000) // TODO: Add Hot Steam
        .duration(20)
        .buildAndRegister()

// Pahoehoe Lava Processing
ELECTROLYZER.recipeBuilder().with {
        fluidInputs liquid('pahoehoe_lava') * 10000
        outputs [item('minecraft:obsidian') * 1, metaitem('dustSulfur') * 1, metaitem('dustCarbon') * 1]
        duration 20
        EUt 7000
        buildAndRegister()
}
