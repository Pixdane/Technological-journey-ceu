ASSEMBLER = recipemap('assembler')

// End Crystal
mods.gregtech.assembler.removeByInput(16, [item('minecraft:ghast_tear'), item('minecraft:ender_eye')], [fluid('glass') * 1008 * 1008])

crafting.remove('minecraft:end_crystal')

ASSEMBLER.recipeBuilder()
        .fluidInputs(fluid('woods_glass') * 144)
        .inputs(metaitem('quantumstar') * 1, metaitem('gcyl:erbium_doped_zblan') * 4, metaitem('gcyl:degenerate.rhenium.plate') * 1)
        .notConsumable(metaitem('gcyl:microfocus.xray.tube'))
        .outputs(item('minecraft:end_crystal'))
        .duration(40)
        .EUt(122880)
        .buildAndRegister();
