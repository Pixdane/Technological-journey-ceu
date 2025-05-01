package recipes.byMachine

COKE_OVEN = recipemap('coke_oven')

// Charcoal * 1
mods.gregtech.coke_oven.removeByInput(1, [item('minecraft:log:*')], null)
// Block of Coke * 1
mods.gregtech.coke_oven.removeByInput(1, [item('minecraft:coal_block')], null)
// Coke * 1
mods.gregtech.coke_oven.removeByInput(1, [item('minecraft:coal')], null)

COKE_OVEN.recipeBuilder()
        .inputs(ore('logWood') * 1)
        .outputs(ore('charcoal').getFirst())
        .fluidOutputs(fluid('creosote') * 1000)
        .duration(180)
        .buildAndRegister()

COKE_OVEN.recipeBuilder()
        .inputs(ore('charcoal'))
        .outputs(ore('fuelCoke').getFirst())
        .fluidOutputs(fluid('creosote') * 1000)
        .duration(360)
        .buildAndRegister()

COKE_OVEN.recipeBuilder()
        .inputs(ore('coal'))
        .outputs(ore('fuelCoke').getFirst())
        .fluidOutputs(fluid('creosote') * 1800)
        .duration(180)
        .buildAndRegister()

COKE_OVEN.recipeBuilder()
        .inputs(ore('gemLignite') * 2)
        .outputs(ore('fuelCoke').getFirst())
        .fluidOutputs(fluid('creosote') * 1800)
        .duration(180)
        .buildAndRegister()

COKE_OVEN.recipeBuilder()
        .inputs(ore('dustCoal'))
        .outputs(metaitem('dustCoke'))
        .fluidOutputs(fluid('creosote') * 1800)
        .duration(180)
        .buildAndRegister()

COKE_OVEN.recipeBuilder()
        .inputs(ore('dustLignite') * 2)
        .outputs(metaitem('dustCoke'))
        .fluidOutputs(fluid('creosote') * 1800)
        .duration(180)
        .buildAndRegister()

COKE_OVEN.recipeBuilder()
        .inputs(item('gregtech:meta_item_1', 438) * 2)
        .outputs(item('thermalfoundation:material', 833))
        .fluidOutputs(fluid('creosote') * 750)
        .duration(180)
        .buildAndRegister()