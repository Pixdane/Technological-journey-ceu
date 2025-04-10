MIXER = recipemap('mixer')
ASSEMBLER = recipemap('assembler')

// Recipe removals
[
        item('fluxnetworks:fluxcore'),
        item('fluxnetworks:fluxpoint'),
        item('fluxnetworks:fluxplug'),
].forEach {
    crafting.removeByOutput(it)
}

crafting.addShapeless(item('fluxnetworks:fluxplug'), [item('fluxnetworks:fluxpoint')])
crafting.addShapeless(item('fluxnetworks:fluxpoint'), [item('fluxnetworks:fluxplug')])

MIXER.recipeBuilder()
        .inputs(ore('dustRedstone') * 64)
        .fluidInputs(fluid('lava') * 1000)
        .outputs(item('fluxnetworks:flux') * 64)
        .duration(240)
        .EUt(524288)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs(item('fluxnetworks:flux') * 4)
        .inputs(item('enderio:block_reinforced_obsidian') * 4)
        .inputs(metaitem('quantumeye') * 2) TODO
        .outputs(item('fluxnetworks:fluxcore') * 2)
        .duration(240)
        .EUt(524288)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs(item('fluxnetworks:fluxcore') * 8)
        .inputs(ore('wireGtSingleUvSuperconductor') * 18)
        .outputs(item('fluxnetworks:fluxpoint') * 2)
        .duration(240)
        .EUt(524288)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(item('fluxnetworks:fluxcore') * 8)
        .inputs(ore('wireGtSingleUvSuperconductor') * 18)
        .outputs(item('fluxnetworks:fluxplug') * 2)
        .duration(240)
        .EUt(524288)
        .buildAndRegister()