// TODO: Modifie Machine Casings & Hull Recipes (ZPM, UIV, UXV, OpV, MAX)

ASSEMBLER = recipemap('assembler')

// Recipe removals
[
        metaitem('compressed.coke_clay'),
].forEach {
    crafting.removeByOutput(it)
}

// Wrought Iron Nugget
furnace.removeByOutput(metaitem('nuggetWroughtIron'))

// Nether Star
furnace.removeByOutput(item('minecraft:nether_star'))

// ZPM Machine Casing * 1
mods.gregtech.assembler.removeByInput(16, [metaitem('circuit.integrated').withNbt(['Configuration': 8]), metaitem('plateDuranium') * 8], null)

crafting.addShaped(item('gregtech:machine_casing', 7), [
        [ore('plateStarmetalAlloy'), ore('plateStarmetalAlloy'), ore('plateStarmetalAlloy')],
        [ore('plateStarmetalAlloy'), ore('craftingToolWrench'), ore('plateStarmetalAlloy')],
        [ore('plateStarmetalAlloy'), ore('plateStarmetalAlloy'), ore('plateStarmetalAlloy')]
])

// crafting.removeByOutput(item('gregtech:mte', 992));
// crafting.addShaped(item('gregtech:mte', 992), [[null, null, null],[ore('platePolybenzimidazole'), item('gregtech:meta_item_1:12524'), ore('platePolybenzimidazole')], [ore('cableGtSingleNaquadah'), item('gregtech:machine_casing', 7), ore('cableGtSingleNaquadah')]]);
// 
// assembler.recipeBuilder()
// .inputs(item('gregtech:meta_item_1:12524') * 8)
// .notConsumable(item('gregtech:meta_item_1:32766').withNbt({Configuration: 8}))
// .outputs(item('gregtech:machine_casing', 7))
// .duration(40)
// .EUt(1024)
// .buildAndRegister();

// HV Quadruple Hatch
crafting.addShaped(metaitem('tjceu:fluid_hatch.import_4x.hv'), [[ore('craftingToolScrewdriver')], [metaitem('tjceu:fluid_hatch.export_4x.hv')]])
crafting.addShaped(metaitem('tjceu:fluid_hatch.export_4x.hv'), [[ore('craftingToolScrewdriver')], [metaitem('tjceu:fluid_hatch.import_4x.hv')]])

ASSEMBLER.recipeBuilder()
        .circuitMeta(4)
        .inputs(metaitem('fluid_hatch.import.hv'))
        .inputs(ore('pipeQuadrupleFluidSteel'))
        .fluidInputs(fluid('polytetrafluoroethylene') * 576)
        .outputs(metaitem('tjceu:fluid_hatch.import_4x.hv'))
        .duration(300)
        .EUt(480)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .circuitMeta(4)
        .inputs(metaitem('fluid_hatch.export.hv'))
        .inputs(ore('pipeQuadrupleFluidSteel'))
        .fluidInputs(fluid('polytetrafluoroethylene') * 576)
        .outputs(metaitem('tjceu:fluid_hatch.export_4x.hv'))
        .duration(300)
        .EUt(480)
        .buildAndRegister()

// HV Nonuple Hatch
crafting.addShaped(metaitem('tjceu:fluid_hatch.import_9x.hv'), [[ore('craftingToolScrewdriver')], [metaitem('tjceu:fluid_hatch.export_9x.hv')]])
crafting.addShaped(metaitem('tjceu:fluid_hatch.export_9x.hv'), [[ore('craftingToolScrewdriver')], [metaitem('tjceu:fluid_hatch.import_9x.hv')]])

ASSEMBLER.recipeBuilder()
        .circuitMeta(9)
        .inputs(metaitem('fluid_hatch.import.hv'))
        .inputs(ore('pipeNonupleFluidSteel'))
        .fluidInputs(fluid('polytetrafluoroethylene') * 1296)
        .outputs(metaitem('tjceu:fluid_hatch.import_9x.hv'))
        .duration(300)
        .EUt(480)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .circuitMeta(9)
        .inputs(metaitem('fluid_hatch.export.hv'))
        .inputs(ore('pipeNonupleFluidSteel'))
        .fluidInputs(fluid('polytetrafluoroethylene') * 1296)
        .outputs(metaitem('tjceu:fluid_hatch.export_9x.hv'))
        .duration(300)
        .EUt(480)
        .buildAndRegister()

crafting.addShaped(metaitem('electric_blast_furnace') * 3, [
        [ore('craftingFurnace'), ore('craftingFurnace'), ore('craftingFurnace')],
        [ore('circuitMv'), item('gregtech:metal_casing', 2), ore('circuitMv')],
        [ore('cableGtSingleTin'), ore('circuitMv'), ore('cableGtSingleTin')]
])

crafting.addShaped(metaitem('compressed.coke_clay') * 4, [
        [item('minecraft:clay_ball'), item('minecraft:clay_ball'), item('minecraft:clay_ball')],
        [ore('sand'), metaitem('wooden_form.brick'), ore('sand')],
        [ore('sand'), ore('sand'), ore('sand')]
])
