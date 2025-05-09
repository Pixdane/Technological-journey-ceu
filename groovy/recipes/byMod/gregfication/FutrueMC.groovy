package recipes.byMod.gregfication

EXTRACTOR = recipemap('extractor')
CANNER = recipemap('canner')

EXTRACTOR.recipeBuilder().with {
        inputs item('futuremc:honeycomb')
        fluidOutputs fluid('honey') * 500
        duration 100
        EUt 30
        buildAndRegister()

}
EXTRACTOR.recipeBuilder().with {
        inputs item('futuremc:honey_bottle')
        fluidOutputs fluid('honey') * 250
        duration 100
        EUt 30
        buildAndRegister()

}
CANNER.recipeBuilder().with {
        fluidInputs fluid('honey') * 250
        inputs item('minecraft:glass_bottle')
        outputs item('futuremc:honey_bottle')
        duration 100
        EUt 30
        buildAndRegister()
}