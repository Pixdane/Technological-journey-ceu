package recipes.byMod.gregfication

ASSLINE = recipemap('assembly_line')

ASSLINE.recipeBuilder().with {
        inputs item('nae2:material', 4) * 2
        inputs ore('plateSuperheavyLAlloy') * 64
        inputs ore('plateSuperheavyHAlloy') * 64
        inputs item('thermalfoundation:upgrade', 2)
        inputs item('thermalfoundation:upgrade', 3)
        inputs item('draconicevolution:chaotic_core') * 2
        inputs metaitem('gcyl:sensor.max') * 2
        fluidInputs fluid('soldering_alloy') * 1440
        fluidInputs fluid('chaosalloy') * 1440
        fluidInputs fluid('heavy_quark_degenerate_matter') * 1440
        outputs item('storagedrawers:upgrade_creative')
        duration 100
        EUt 2013265920
        buildAndRegister()
}
