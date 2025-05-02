package recipes.byMod

crafting.removeByOutput(metaitem('gcym:large_macerator'))
crafting.addShaped(metaitem('gcym:large_macerator'), [[ore('plateTungstenCarbide'), item('gregtech:mte', 68), ore('plateTungstenCarbide')], [metaitem('macerator.hv'), ore('circuitEv'), metaitem('macerator.hv')], [ore('plateTungstenCarbide'), item('gregtech:mte', 990), ore('plateTungstenCarbide')]])

crafting.removeByOutput(metaitem('gcym:large_circuit_assembler'))
crafting.addShaped(metaitem('gcym:large_circuit_assembler'), [[item('gcym:large_multiblock_casing', 2), metaitem('robot.arm.luv'), item('gcym:large_multiblock_casing', 2)], [ore('circuitLuv'), item('gregtech:mte', 991), ore('circuitLuv')], [item('gcym:large_multiblock_casing', 2), metaitem('robot.arm.luv'), item('gcym:large_multiblock_casing', 2)]])


// TODO: GCyM/GCyL Large Centrifuge rework
crafting.removeByOutput(metaitem('gcyl:large_centrifuge'))
crafting.addShaped(metaitem('gcyl:large_centrifuge'), [
        [ore('circuitEv'), ore('pipeLargeTungstenSteel'), ore('circuitEv')],
        [ore('gearTitanium'), item('gregtech:mte', 188), ore('gearTitanium')],
        [item('gregtech:meta_item_1:12981'), item('gregtech:meta_item_1:13981'), item('gregtech:meta_item_1:12981')]
])