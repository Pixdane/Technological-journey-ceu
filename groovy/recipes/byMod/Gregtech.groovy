// TODO: Modifie Machine Casings & Hull Recipes (ZPM, UIV, UXV, OpV, MAX)

ASSEMBLER = recipemap('assembler')

// ZPM Machine Casing * 1
mods.gregtech.assembler.removeByInput(16, [metaitem('circuit.integrated').withNbt(['Configuration': 8]), metaitem('plateDuranium') * 8], null)

crafting.addShaped(item('gregtech:machine_casing', 7), [
        [ore('plateStarmetalAlloy'), ore('plateStarmetalAlloy'), ore('plateStarmetalAlloy')],
        [ore('plateStarmetalAlloy'), ore('craftingToolWrench'), ore('plateStarmetalAlloy')],
        [ore('plateStarmetalAlloy'), ore('plateStarmetalAlloy'), ore('plateStarmetalAlloy')]
])

// crafting.removeByOutput(item('gregtech:mte:992'));
// crafting.addShaped(item('gregtech:mte:992'), [[null, null, null],[ore('platePolybenzimidazole'), item('gregtech:meta_item_1:12524'), ore('platePolybenzimidazole')], [ore('cableGtSingleNaquadah'), item('gregtech:machine_casing:7'), ore('cableGtSingleNaquadah')]]);
// 
// assembler.recipeBuilder()
// .inputs(item('gregtech:meta_item_1:12524') * 8)
// .notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration: 8}))
// .outputs(item('gregtech:machine_casing:7'))
// .duration(40)
// .EUt(1024)
// .buildAndRegister();

// HV Quadruple Hatch
crafting.addShaped(metaitem('tjceu:fluid_hatch.import_4x.hv'), [[ore('craftingToolScrewdriver')], [metaitem('tjceu:fluid_hatch.export_4x.hv')]])
crafting.addShaped(metaitem('tjceu:fluid_hatch.export_4x.hv'), [[ore('craftingToolScrewdriver')], [metaitem('tjceu:fluid_hatch.import_4x.hv')]])

ASSEMBLER.recipeBuilder()
        .circuitMeta(0)
        .inputs([metaitem('pipeLargeFluidTitanium') * 4, metaitem('hull.mv')])
        .outputs([metaitem('tjceu:fluid_hatch.import_4x.hv')])
        .duration(100)
        .EUt(120)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([metaitem('pipeLargeFluidTitanium') * 4, metaitem('hull.mv')])
        .outputs([metaitem('tjceu:fluid_hatch.export_4x.hv')])
        .duration(100)
        .EUt(120)
        .buildAndRegister()

