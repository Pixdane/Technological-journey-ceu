package recipes.byLine

import static classes.utils.TJUtility.tjId

ALLOY_SMELTER = recipemap('alloy_smelter')

// Iron Ingot -> Hot Iron Ingot
furnace.recipeBuilder().with {
        input ore('ingotIron')
        output metaitem('ingotHotIron')
        exp 0.1
        register()

}

// Hot Iron Ingot -> Wrought Iron Ingot
crafting.shapelessBuilder()
        .input(ore('craftingToolHardHammer'), ore('ingotHotIron'))
        .name(tjId('wrought_iron_forging'))
        .output(metaitem('ingotWroughtIron'))
        .register()

// Hot Iron Ingot -> Wrought Iron Ingot
ALLOY_SMELTER.recipeBuilder().with {
        inputs ore('ingotHotIron')
        outputs metaitem('ingotWroughtIron')
        duration 150
        EUt 6
        buildAndRegister()
}