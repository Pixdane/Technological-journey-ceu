CHEMICAL_REACTOR = recipemap('chemical_reactor')
LCR = recipemap('large_chemical_reactor')
MIXER = recipemap('mixer')

crafting.addShaped(item('snad:snad', 1), 
[
    [item('minecraft:sand', 1), item('minecraft:sand', 1), item('minecraft:sand', 1)], 
    [item('minecraft:sand', 1), item('minecraft:sand', 1), item('minecraft:sand', 1)], 
    [item('minecraft:sand', 1), item('minecraft:sand', 1), item('minecraft:sand', 1)]
])

crafting.addShaped(item('snad:snad'), 
[
    [item('minecraft:sand'), item('minecraft:sand'), item('minecraft:sand')], 
    [item('minecraft:sand'), item('minecraft:sand'), item('minecraft:sand')], 
    [item('minecraft:sand'), item('minecraft:sand'), item('minecraft:sand')]
])

CHEMICAL_REACTOR.recipeBuilder()
        .inputs(item('snad:snad') * 8)
        .inputs(ore('obsidian') * 2)
        .fluidInputs(fluid('lava') * 10000)
        .outputs(item('minecraft:end_stone'))
        .duration(600)
        .EUt(2040)
        .buildAndRegister()

CHEMICAL_REACTOR.recipeBuilder()
        .inputs(item('minecraft:sand') * 64)
        .inputs(ore('obsidian') * 2)
        .fluidInputs(fluid('lava') * 1000)
        .outputs(item('minecraft:end_stone') * 2)
        .duration(300)
        .EUt(30252)
        .buildAndRegister()

MIXER.recipeBuilder()
        .inputs(item('minecraft:sand') * 4)
        .fluidInputs(fluid('biomass') * 250)
        .outputs(item('minecraft:dirt') * 4)
        .duration(20)
        .EUt(30)
        .buildAndRegister()