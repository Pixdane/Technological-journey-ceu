import static classes.utils.TJUtility.tjId

ALLOY_SMELTER = recipemap('alloy_smelter')


// Removes auto-generated recipes related to hot iron ingots
// Hot Iron Ingot * 1
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustIron'), metaitem('circuit.integrated').withNbt(['Configuration': 1])], null)

// Hot Iron Ingot * 1
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustIron'), metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('nitrogen') * 1000 * 1000])

// Hot Iron Ingot * 1
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustIronMagnetic'), metaitem('circuit.integrated').withNbt(['Configuration': 1])], null)

// Hot Iron Ingot * 1
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustIronMagnetic'), metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('nitrogen') * 1000 * 1000])

// Iron Ingot * 1
mods.gregtech.vacuum_freezer.removeByInput(120, [metaitem('ingotHotIron')], null)

// Iron Ingot -> Hot Iron Ingot
furnace.recipeBuilder()
        .input(ore('ingotIron'))
        .output(metaitem('ingotHotIron'))
        .exp(0.1)
        .register()

// Hot Iron Ingot -> Wrought Iron Ingot
crafting.shapelessBuilder()
        .input(ore('craftingToolHardHammer'), ore('ingotHotIron'))
        .name(tjId('wrought_iron_forging'))
        .output(metaitem('ingotWroughtIron'))
        .register()

// Hot Iron Ingot -> Wrought Iron Ingot
ALLOY_SMELTER.recipeBuilder()
        .inputs(ore('ingotHotIron'))
        .outputs(metaitem('ingotWroughtIron'))
        .duration(150)
        .EUt(6)
        .buildAndRegister()