ALLOY_SMELTER = recipemap('alloy_smelter')
AUTOCLAVE = recipemap('autoclave')
MACERATOR = recipemap('macerator')
EXTRUDER = recipemap('extruder')
CHEMICAL_REACTOR = recipemap('chemical_reactor')
LASER_ENGRAVER = recipemap('laser_engraver')
MIXER = recipemap('mixer')
CUTTER = recipemap('cutter')

ore_dict.remove('oreCopper', item('libvulpes:ore0', 4))
ore_dict.remove('oreTin', item('libvulpes:ore0', 5))
ore_dict.remove('oreRutile', item('libvulpes:ore0', 8))
ore_dict.remove('oreTitanium', item('libvulpes:ore0', 8))
ore_dict.remove('oreAluminum', item('libvulpes:ore0', 9))
ore_dict.remove('oreIridium', item('libvulpes:ore0', 10))

mods.advancedrocketry.chemical_reactor.removeAll()
mods.advancedrocketry.precision_assembler.removeAll()
mods.advancedrocketry.cutting_machine.removeAll()
mods.advancedrocketry.rolling_machine.removeAll()
mods.advancedrocketry.lathe.removeAll()
mods.advancedrocketry.electrolyser.removeAll()
mods.advancedrocketry.electric_arc_furnace.removeAll()
mods.advancedrocketry.crystallizer.removeAll()
mods.advancedrocketry.small_plate_presser.removeAll()

crafting.removeByOutput(item('advancedrocketry:launchpad'))

MIXER.recipeBuilder()
        .inputs([ore('blockConcrete') * 3, ore('dyeYellow'), ore('dyeBlack')])
        .outputs([item('advancedrocketry:launchpad') * 3])
        .duration(240)
        .EUt(16)
        .buildAndRegister()

crafting.removeByOutput(item('advancedrocketry:loader', 1))
crafting.removeByOutput(item('advancedrocketry:ic', 3))
crafting.removeByOutput(item('advancedrocketry:spaceboots'))
crafting.removeByOutput(item('advancedrocketry:spacechestplate'))
crafting.removeByOutput(item('libvulpes:structuremachine'))
crafting.removeByOutput(item('libvulpes:holoprojector'))
crafting.removeByOutput(item('advancedrocketry:spaceleggings'))
crafting.removeByOutput(item('advancedrocketry:spacehelmet'))

crafting.addShaped(item('minecraft:enchanted_book').withNbt(StoredEnchantments: [lvl: 1 as short, id: 13 as short]), [
        [null, ore('stickLongStainlessSteel'), null],
        [null, item('advancedrocketry:spacehelmet'), null],
        [null, ore('bookEmpty'), null]
])

crafting.addShaped(item('minecraft:enchanted_book').withNbt(StoredEnchantments: [lvl: 1 as short, id: 13 as short]), [
        [null, ore('stickLongStainlessSteel'), null],
        [null, item('advancedrocketry:spacechestplate'), null],
        [null, ore('bookEmpty'), null]
])

crafting.addShaped(item('minecraft:enchanted_book').withNbt(StoredEnchantments: [lvl: 1 as short, id: 13 as short]), [
        [null, ore('stickLongStainlessSteel'), null],
        [null, item('advancedrocketry:spaceleggings'), null],
        [null, ore('bookEmpty'), null]
])

crafting.addShaped(item('minecraft:enchanted_book').withNbt(StoredEnchantments: [lvl: 1 as short, id: 13 as short]), [
        [null, ore('stickLongStainlessSteel'), null],
        [null, item('advancedrocketry:spaceboots'), null],
        [null, ore('bookEmpty'), null]
])

crafting.addShaped(item('advancedrocketry:spacehelmet'), [
        [ore('wool'), ore('plateStainlessSteel'), ore('wool')],
        [ore('wool'), metaitem('lensGlass'), ore('wool')],
        [ore('plateStainlessSteel'), item('minecraft:leather_helmet'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:spaceleggings'), [
        [ore('plateStainlessSteel'), ore('wool'), ore('plateStainlessSteel')],
        [ore('wool'), item('minecraft:leather_leggings'), ore('wool')],
        [ore('wool'), null, ore('wool')]
])

crafting.addShaped(item('advancedrocketry:spacechestplate'), [
        [null, ore('plateStainlessSteel'), null],
        [ore('wool'), item('minecraft:leather_chestplate'), ore('wool')],
        [ore('plateStainlessSteel'), ore('wool'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:spaceboots'), [
        [ore('plateStainlessSteel'), ore('wool'), ore('plateStainlessSteel')],
        [ore('wool'), item('minecraft:leather_boots'), ore('wool')],
        [ore('plateStainlessSteel'), ore('wool'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:rocketmotor'), [
        [null, ore('stickSteel'), null],
        [ore('stickSteel'), null, ore('stickSteel')],
        [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:fueltank') * 2, [
        [ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')],
        [ore('plateStainlessSteel'), null, ore('plateStainlessSteel')],
        [ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')]
])

crafting.removeByOutput(item('advancedrocketry:rocketmotor'))
crafting.removeByOutput(item('advancedrocketry:bipropellantrocketmotor'))
crafting.removeByOutput(item('advancedrocketry:advrocketmotor'))
crafting.removeByOutput(item('advancedrocketry:advbipropellantrocketmotor'))
crafting.removeByOutput(item('advancedrocketry:nuclearrocketmotor'))
crafting.removeByOutput(item('advancedrocketry:fuelingstation'))
crafting.removeByOutput(item('advancedrocketry:fueltank'))
crafting.removeByOutput(item('advancedrocketry:bipropellantfueltank'))
crafting.removeByOutput(item('advancedrocketry:oxidizerfueltank'))
crafting.removeByOutput(item('advancedrocketry:nuclearfueltank'))
crafting.removeByOutput(item('advancedrocketry:guidancecomputer'))
crafting.removeByOutput(ore('dustThermite'))
crafting.removeByOutput(item('advancedrocketry:ic', 5))
crafting.removeByOutput(item('advancedrocketry:ic', 4))
crafting.removeByOutput(item('advancedrocketry:gravitymachine'))
crafting.removeByOutput(item('advancedrocketry:altitudecontroller'))
crafting.removeByOutput(item('advancedrocketry:stationmarker'))
crafting.removeByOutput(item('advancedrocketry:circlelight'))
crafting.removeByOutput(item('advancedrocketry:stationbuilder'))
crafting.removeByOutput(item('advancedrocketry:oxygenscrubber'))
crafting.removeByOutput(item('advancedrocketry:oxygenvent'))
crafting.removeByOutput(item('advancedrocketry:oxygencharger'))
crafting.removeByOutput(item('advancedrocketry:landingpad'))
crafting.removeByOutput(item('advancedrocketry:warpcore'))
crafting.removeByOutput(item('advancedrocketry:warpmonitor'))
crafting.removeByOutput(item('advancedrocketry:orientationcontroller'))
crafting.removeByOutput(item('advancedrocketry:gravitycontroller'))
crafting.removeByOutput(item('advancedrocketry:rocketbuilder'))
 
crafting.addShaped(item('advancedrocketry:warpmonitor'), [
        [ore('plateStainlessSteel'), metaitem('sensor.hv'), ore('plateStainlessSteel')],
        [metaitem('sensor.hv'), metaitem('hull.hv'), metaitem('sensor.hv')],
        [ore('plateStainlessSteel'), metaitem('sensor.hv'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:orientationcontroller'), [
        [ore('plateStainlessSteel'), metaitem('hull.hv'), ore('plateStainlessSteel')],
        [metaitem('hull.hv'), item('advancedrocketry:misc'), metaitem('hull.hv')],
        [ore('plateStainlessSteel'), metaitem('hull.hv'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:loader', 1), [
        [ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')],
        [ore('plateStainlessSteel'), ore('chest,chestWood'), ore('plateStainlessSteel')],
        [ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:oxygencharger'), [
        [null, null, null],
        [ore('plateStainlessSteel'), metaitem('electric.pump.hv'), ore('plateStainlessSteel')],
        [null, metaitem('drum.bronze'), null]
])

crafting.addShaped(item('advancedrocketry:oxygenvent'), [
        [null, metaitem('electric.pump.hv'), null],
        [null, metaitem('hull.hv'), null],
        [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:oxygenscrubber'), [
        [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')],
        [null, metaitem('hull.hv'), null],
        [null, metaitem('electric.pump.hv'), null]
])

crafting.addShaped(item('advancedrocketry:gravitycontroller'), [
        [ore('plateStainlessSteel'), metaitem('emitter.hv'), ore('plateStainlessSteel')],
        [ore('plateStainlessSteel'), metaitem('hull.hv'), ore('plateStainlessSteel')],
        [ore('plateStainlessSteel'), metaitem('sensor.hv'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:rocketbuilder'), [
        [ore('plateTitanium'), item('advancedrocketry:misc'), ore('plateTitanium')],
        [metaitem('robot.arm.hv'), metaitem('hull.hv'), metaitem('robot.arm.hv')],
        [ore('plateTitanium'), null, ore('plateTitanium')]
])

crafting.addShaped(item('libvulpes:structuremachine') * 4, [
        [ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')],
        [ore('plateStainlessSteel'), ore('stickStainlessSteel'), ore('plateStainlessSteel')],
        [ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:warpcore'), [
        [ore('plateTitanium'), ore('circuitExtreme'), ore('plateTitanium')],
        [ore('plateTitanium'), metaitem('hull.ev'), ore('plateTitanium')],
        [ore('plateTitanium'), ore('circuitExtreme'), ore('plateTitanium')]
])

crafting.addShaped(item('advancedrocketry:circlelight'), [
        [null, ore('plateIron'), null],
        [ore('plateIron'), item('minecraft:glowstone'), ore('plateIron')],
        [null, ore('plateIron'), null]
])

crafting.addShaped(item('advancedrocketry:altitudecontroller'), [
        [ore('plateStainlessSteel'), item('advancedrocketry:misc'), ore('plateStainlessSteel')],
        [metaitem('sensor.hv'), metaitem('hull.hv'), metaitem('sensor.hv')],
        [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:stationmarker'), [
        [ore('plateStainlessSteel'), item('advancedrocketry:misc'), ore('plateStainlessSteel')],
        [ore('plateStainlessSteel'), metaitem('hull.hv'), ore('plateStainlessSteel')],
        [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:gravitymachine'), [
        [metaitem('emitter.hv'), item('advancedrocketry:misc'), metaitem('emitter.hv')],
        [ore('plateStainlessSteel'), metaitem('hull.hv'), ore('plateStainlessSteel')],
        [ore('plateStainlessSteel'), metaitem('emitter.hv'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:stationbuilder'), [
        [metaitem('sensor.hv'), ore('plateStainlessSteel'), metaitem('sensor.hv')],
        [metaitem('robot.arm.hv'), metaitem('hull.hv'), metaitem('robot.arm.hv')],
        [ore('plateStainlessSteel'), metaitem('emitter.hv'), ore('plateStainlessSteel')]
])

ALLOY_SMELTER.recipeBuilder()
        .inputs([metaitem('wafer.silicon'), item('minecraft:glass_pane')])
        .outputs([ore('waferSilicon').getFirst()])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs([ore('waferSilicon')])
        .notConsumable(ore('craftingLensWhite'))
        .outputs([item('advancedrocketry:itemcircuitplate')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs([ore('waferSilicon')])
        .notConsumable(ore('craftingLensLime'))
        .outputs([item('advancedrocketry:itemcircuitplate', 1)])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

CUTTER.recipeBuilder()
        .inputs([item('advancedrocketry:itemcircuitplate', 1)])
        .fluidInputs(fluid('lubricant') * 144)
        .outputs([item('advancedrocketry:ic', 2) * 16])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

CUTTER.recipeBuilder()
        .inputs([item('advancedrocketry:itemcircuitplate')])
        .fluidInputs(fluid('lubricant') * 144)
        .outputs([item('advancedrocketry:ic') * 16])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

crafting.addShaped(item('advancedrocketry:ic', 1), [
        [null, null, null],
        [null, item('advancedrocketry:ic'), null],
        [item('advancedrocketry:ic', 2), item('advancedrocketry:ic', 2), item('advancedrocketry:ic', 2)]
])

crafting.addShaped(item('advancedrocketry:satelliteidchip'), [
        [null, null, null],
        [null, item('advancedrocketry:ic', 2), null],
        [item('advancedrocketry:ic'), item('advancedrocketry:ic'), item('advancedrocketry:ic')]
])

crafting.addShaped(item('advancedrocketry:fuelingstation'), [
        [ore('plateStainlessSteel'), metaitem('electric.pump.hv'), ore('plateStainlessSteel')],
        [metaitem('electric.pump.hv'), metaitem('hull.hv'), metaitem('electric.pump.hv')],
        [ore('plateStainlessSteel'), metaitem('electric.pump.hv'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:guidancecomputer'), [
        [ore('plateIron'), item('advancedrocketry:misc'), ore('plateIron')],
        [metaitem('emitter.hv'), metaitem('hull.hv'), metaitem('emitter.hv')],
        [ore('plateIron'), metaitem('sensor.hv'), ore('plateIron')]
])

crafting.addShapeless(item('advancedrocketry:landingpad'), [item('advancedrocketry:launchpad'), item('advancedrocketry:ic')])

crafting.addShaped(item('libvulpes:holoprojector'), [
        [item('minecraft:glass_pane'), metaitem('emitter.hv'), item('minecraft:glass_pane')],
        [null, metaitem('hull.hv'), null],
        [null, null, null]]
)

// TODO: recipes for other engines & fuel tanks
crafting.addShaped(item('advancedrocketry:rocketmotor'), [
        [null, ore('stickStainlessSteel'), null],
        [ore('stickStainlessSteel'), null, ore('stickStainlessSteel')],
        [ore('plateTitanium'), ore('plateTitanium'), ore('plateTitanium')]
])

CHEMICAL_REACTOR.recipeBuilder()
        .inputs([ore('dustIron') * 2, ore('dustAluminium') * 1])
        .fluidInputs(fluid('oxygen') * 2000)
        .outputs([ore('dustThermite').getFirst() * 3])
        .duration(600)
        .EUt(30)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([item('advancedrocketry:crystal')])
        .outputs([item('actuallyadditions:item_crystal_shard', 1) * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([item('advancedrocketry:crystal', 1)])
        .outputs([item('actuallyadditions:item_crystal_shard', 2) * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([item('advancedrocketry:crystal', 2)])
        .outputs([item('actuallyadditions:item_crystal_shard', 4) * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([item('advancedrocketry:crystal', 3)])
        .outputs([item('actuallyadditions:item_crystal_shard') * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([item('advancedrocketry:crystal', 5)])
        .outputs([item('actuallyadditions:item_crystal_shard', 3) * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([item('advancedrocketry:crystal', 4)])
        .outputs([item('actuallyadditions:item_crystal_shard', 5) * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

AUTOCLAVE.recipeBuilder()
        .inputs([item('libvulpes:productdust')])
        .fluidInputs(fluid('water') * 1000)
        .outputs([item('libvulpes:productgem')])
        .duration(120)
        .EUt(500)
        .buildAndRegister()

// TODO: Adding tooltips
// item('advancedrocketry:charcoallog').addTooltip("ID 400 artifact");
// ore('blockTungstenCarbide').addTooltip("ID 401 artifact");
// ore('blockSalt').addTooltip("ID 402 artifact");
// item('gregtech:meta_block_compressed_3', 3).addTooltip("ID 403 artifact");
// ore('blockCalifornium').addTooltip("ID 405 artifact");
// ore('blockAdamantium').addTooltip("ID 406 artifact");

// Low tank
EXTRUDER.recipeBuilder()
        .inputs([ore('ingotIron') * 16])
        .notConsumable(metaitem('shape.mold.cylinder'))
        .outputs([item('advancedrocketry:pressuretank')])
        .duration(600)
        .EUt(30)
        .buildAndRegister()

// Medium tank
EXTRUDER.recipeBuilder()
        .inputs([ore('ingotSteel') * 16])
        .notConsumable(metaitem('shape.mold.cylinder'))
        .outputs([item('advancedrocketry:pressuretank', 1)])
        .duration(600)
        .EUt(120)
        .buildAndRegister()

// Large tank
EXTRUDER.recipeBuilder()
        .inputs([ore('ingotStainlessSteel') * 16])
        .notConsumable(metaitem('shape.mold.cylinder'))
        .outputs([item('advancedrocketry:pressuretank', 2)])
        .duration(600)
        .EUt(500)
        .buildAndRegister()

// Max tank
EXTRUDER.recipeBuilder()
        .inputs([ore('ingotTitanium') * 16])
        .notConsumable(metaitem('shape.mold.cylinder'))
        .outputs([item('advancedrocketry:pressuretank', 3)])
        .duration(600)
        .EUt(1048)
        .buildAndRegister()
