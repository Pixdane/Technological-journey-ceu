package recipes.byMod.gregfication

ALLOY_SMELTER = recipemap('alloy_smelter')
AUTOCLAVE = recipemap('autoclave')
MACERATOR = recipemap('macerator')
EXTRUDER = recipemap('extruder')
CHEMICAL_REACTOR = recipemap('chemical_reactor')
LASER_ENGRAVER = recipemap('laser_engraver')
MIXER = recipemap('mixer')
CUTTER = recipemap('cutter')
CENTRIFUGE = recipemap('centrifuge')
ELECTROLYZER = recipemap('electrolyzer')
FORGE_HAMMER = recipemap('forge_hammer')

mods.advancedrocketry.chemical_reactor.removeAll()
mods.advancedrocketry.precision_assembler.removeAll()
mods.advancedrocketry.cutting_machine.removeAll()
mods.advancedrocketry.rolling_machine.removeAll()
mods.advancedrocketry.lathe.removeAll()
mods.advancedrocketry.electrolyser.removeAll()
mods.advancedrocketry.electric_arc_furnace.removeAll()
mods.advancedrocketry.crystallizer.removeAll()
mods.advancedrocketry.small_plate_presser.removeAll()

// Hide items from JEI
mods.jei.ingredient.yeet(
        item('libvulpes:ore0', 4),
        item('libvulpes:ore0', 5),
        item('libvulpes:ore0', 8),
        item('libvulpes:ore0', 8),
        item('libvulpes:ore0', 9),
        item('libvulpes:ore0', 10),

        item('libvulpes:productingot', 3),
        item('libvulpes:productingot', 4),
        item('libvulpes:productingot', 5),
        item('libvulpes:productingot', 6),
        item('libvulpes:productingot', 7),
        item('libvulpes:productingot', 9),
        item('libvulpes:productingot', 10),
        item('advancedrocketry:productingot'),
        item('advancedrocketry:productingot', 1),

        item('libvulpes:metal0', 4),
        item('libvulpes:metal0', 5),
        item('libvulpes:metal0', 6),
        item('libvulpes:metal0', 7),
        item('libvulpes:metal0', 9),
        item('libvulpes:metal0', 10),
        item('advancedrocketry:metal0'),
        item('advancedrocketry:metal0', 1),

        item('libvulpes:productplate', 1),
        item('libvulpes:productplate', 2),
        item('libvulpes:productplate', 3),
        item('libvulpes:productplate', 4),
        item('libvulpes:productplate', 5),
        item('libvulpes:productplate', 6),
        item('libvulpes:productplate', 7),
        item('libvulpes:productplate', 9),
        item('libvulpes:productplate', 10),
        item('advancedrocketry:productplate'),
        item('advancedrocketry:productplate', 1),

        item('libvulpes:productdust', 1),
        item('libvulpes:productdust', 2),
        item('libvulpes:productdust', 3),
        item('libvulpes:productdust', 4),
        item('libvulpes:productdust', 5),
        item('libvulpes:productdust', 6),
        item('libvulpes:productdust', 7),
        item('libvulpes:productdust', 9),
        item('libvulpes:productdust', 10),
        item('advancedrocketry:productdust'),
        item('advancedrocketry:productdust', 1),

        item('libvulpes:productnugget', 3),
        item('libvulpes:productnugget', 4),
        item('libvulpes:productnugget', 5),
        item('libvulpes:productnugget', 6),
        item('libvulpes:productnugget', 7),
        item('libvulpes:productnugget', 9),
        item('libvulpes:productnugget', 10),
        item('advancedrocketry:productnugget'),
        item('advancedrocketry:productnugget', 1),

        item('libvulpes:productgear', 6),
        item('libvulpes:productgear', 7),
        item('advancedrocketry:productgear'),
        item('advancedrocketry:productgear', 1),

        item('libvulpes:productrod', 1),
        item('libvulpes:productrod', 4),
        item('libvulpes:productrod', 6),
        item('libvulpes:productrod', 7),
        item('libvulpes:productrod', 10),
        item('advancedrocketry:productrod'),
        item('advancedrocketry:productrod', 1),

        item('libvulpes:productboule', 3),

        item('libvulpes:productsheet', 1),
        item('libvulpes:productsheet', 4),
        item('libvulpes:productsheet', 6),
        item('libvulpes:productsheet', 7),
        item('libvulpes:productsheet', 9),
        item('advancedrocketry:productsheet'),
        item('advancedrocketry:productsheet', 1),

        item('libvulpes:coil0', 2),
        item('libvulpes:coil0', 4),
        item('libvulpes:coil0', 7),
        item('libvulpes:coil0', 9),
        item('libvulpes:coil0', 10),

        item('libvulpes:hatch', 1),
        item('libvulpes:hatch', 2),
        item('libvulpes:hatch', 3),

        item('libvulpes:forgepowerinput'),
        item('libvulpes:forgepoweroutput'),

        item('libvulpes:coalgenerator'),

        item('libvulpes:motor'),
        item('libvulpes:advancedmotor'),
        item('libvulpes:enhancedmotor'),
        item('libvulpes:elitemotor'),

        item('libvulpes:gtplug'),

        item('libvulpes:battery'),
        item('libvulpes:battery', 1),

        item('advancedrocketry:deployablerocketbuilder'),
        item('advancedrocketry:liquidtank'),
        item('advancedrocketry:intake'),
        item('advancedrocketry:spaceelevatorcontroller'),
        item('advancedrocketry:beacon'),
        item('advancedrocketry:blockpump'),
        item('advancedrocketry:centrifuge'),
        item('advancedrocketry:railgun'),
        item('advancedrocketry:forcefieldprojector'),
        item('advancedrocketry:forcefield'),
        item('advancedrocketry:lathe'),
        item('advancedrocketry:rollingmachine'),
        item('advancedrocketry:platepress'),
        item('advancedrocketry:electrolyser'),
        item('advancedrocketry:chemicalreactor'),
        item('advancedrocketry:planetanalyser'),
        item('advancedrocketry:satellitecontrolcenter'),
        item('advancedrocketry:blackholegenerator'),
        item('advancedrocketry:observatory'),
        item('advancedrocketry:cuttingmachine'),
        item('advancedrocketry:crystallizer'),
        item('advancedrocketry:loader'),
        item('advancedrocketry:loader', 2),
        item('advancedrocketry:loader', 3),
        item('advancedrocketry:loader', 6),
        item('advancedrocketry:precisionlaseretcher'),
        item('advancedrocketry:concrete'),
        item('advancedrocketry:monitoringstation'),
        item('advancedrocketry:biomescanner'),
        item('advancedrocketry:planetholoselector'),
        item('advancedrocketry:ic', 3),
        item('advancedrocketry:ic', 4),
        item('advancedrocketry:ic', 5),
        item('advancedrocketry:planetselector'),
        item('advancedrocketry:pipesealer'),
        item('advancedrocketry:hovercraft'),
        item('advancedrocketry:jackhammer'),
        item('advancedrocketry:arcfurnace'),
        item('advancedrocketry:geode'),
        item('advancedrocketry:oxygendetection'),
        item('advancedrocketry:elevatorchip'),
        item('advancedrocketry:asteroidchip'),
        item('advancedrocketry:solargenerator'),
        item('advancedrocketry:dataunit'),
        item('advancedrocketry:sawbladeiron'),
        item('advancedrocketry:sawblade'),
        item('advancedrocketry:microwavereciever'),
        item('advancedrocketry:satellitepowersource'),
        item('advancedrocketry:satellitepowersource', 1),
        item('advancedrocketry:satelliteprimaryfunction'),
        item('advancedrocketry:satelliteprimaryfunction', 1),
        item('advancedrocketry:satelliteprimaryfunction', 2),
        item('advancedrocketry:satelliteprimaryfunction', 3),
        item('advancedrocketry:satelliteprimaryfunction', 4),
        item('advancedrocketry:satelliteprimaryfunction', 5),
        item('advancedrocketry:orescanner'),
        item('advancedrocketry:beaconfinder'),
        item('advancedrocketry:itemupgrade'),
        item('advancedrocketry:itemupgrade', 1),
        item('advancedrocketry:itemupgrade', 2),
        item('advancedrocketry:itemupgrade', 3),
        item('advancedrocketry:itemupgrade', 4),
        item('advancedrocketry:atmanalyser'),
        item('advancedrocketry:basiclasergun'),
        item('advancedrocketry:wirelesstransciever'),
        item('advancedrocketry:satellite'),
        item('advancedrocketry:blastbrick'),
        item('advancedrocketry:iquartzcrucible'),
        item('advancedrocketry:precisionassemblingmachine'),
        item('advancedrocketry:satellitebuilder'),
        item('libvulpes:advstructuremachine'),

        fluid('rocketfuel'),
        fluid('enrichedlava'),

        item('forge:bucketfilled').withNbt(['FluidName': 'rocketfuel', 'Amount': 1000]),
        item('forge:bucketfilled').withNbt(['FluidName': 'enrichedlava', 'Amount': 1000])
)

// Recipe removals
[
        item('advancedrocketry:launchpad'),
        item('advancedrocketry:loader', 1),
        item('advancedrocketry:spaceboots'),
        item('advancedrocketry:spacechestplate'),
        item('libvulpes:structuremachine'),
        item('libvulpes:holoprojector'),
        item('advancedrocketry:spaceleggings'),
        item('advancedrocketry:spacehelmet'),
        item('advancedrocketry:rocketmotor'),
        item('advancedrocketry:bipropellantrocketmotor'),
        item('advancedrocketry:advrocketmotor'),
        item('advancedrocketry:advbipropellantrocketmotor'),
        item('advancedrocketry:nuclearrocketmotor'),
        item('advancedrocketry:fuelingstation'),
        item('advancedrocketry:fueltank'),
        item('advancedrocketry:bipropellantfueltank'),
        item('advancedrocketry:oxidizerfueltank'),
        item('advancedrocketry:nuclearfueltank'),
        item('advancedrocketry:guidancecomputer'),
        item('advancedrocketry:thermite'),
        item('advancedrocketry:gravitymachine'),
        item('advancedrocketry:altitudecontroller'),
        item('advancedrocketry:stationmarker'),
        item('advancedrocketry:circlelight'),
        item('advancedrocketry:stationbuilder'),
        item('advancedrocketry:oxygenscrubber'),
        item('advancedrocketry:oxygenvent'),
        item('advancedrocketry:oxygencharger'),
        item('advancedrocketry:landingpad'),
        item('advancedrocketry:warpcore'),
        item('advancedrocketry:warpmonitor'),
        item('advancedrocketry:orientationcontroller'),
        item('advancedrocketry:gravitycontroller'),
        item('advancedrocketry:rocketbuilder'),
        item('advancedrocketry:satelliteidchip'),
        item('advancedrocketry:terraformingterminal'),
].forEach {
    crafting.removeByOutput(it)
}

// Hide JEI categories
[
        'zmaster587.AR.centrifuge',
        'zmaster587.AR.precisionlaseretcher',
].each {
    mods.jei.category.hideCategory(it)
}

MIXER.recipeBuilder()
        .inputs([ore('blockConcrete') * 3, ore('dyeYellow'), ore('dyeBlack')])
        .outputs([item('advancedrocketry:launchpad') * 3])
        .duration(240)
        .EUt(16)
        .buildAndRegister()

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
        [ore('plateTitanium'), ore('circuitEv'), ore('plateTitanium')],
        [ore('plateTitanium'), metaitem('hull.ev'), ore('plateTitanium')],
        [ore('plateTitanium'), ore('circuitEv'), ore('plateTitanium')]
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
        [null, null, null]
])

// TODO: recipes for other engines & fuel tanks
crafting.addShaped(item('advancedrocketry:rocketmotor'), [
        [null, ore('stickStainlessSteel'), null],
        [ore('stickStainlessSteel'), null, ore('stickStainlessSteel')],
        [ore('plateTitanium'), ore('plateTitanium'), ore('plateTitanium')]
])

CHEMICAL_REACTOR.recipeBuilder()
        .inputs([ore('dustIron') * 2, ore('dustAluminium') * 1])
        .fluidInputs(fluid('oxygen') * 2000)
        .outputs(item('advancedrocketry:thermite') * 3)
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

// TODO Fuel burn time
//furnace.addFuel(item('advancedrocketry:charcoallog'), 640000)

furnace.removeByOutput(item('libvulpes:productingot', 7))
furnace.removeByOutput(item('libvulpes:productingot', 6))
furnace.removeByOutput(item('libvulpes:productingot', 3))
furnace.removeByOutput(item('libvulpes:productingot', 4))
furnace.removeByOutput(item('libvulpes:productingot', 5))
furnace.removeByOutput(item('libvulpes:productingot', 9))
furnace.removeByOutput(item('libvulpes:productingot', 10))
furnace.removeByOutput(item('advancedrocketry:productingot', 1))
furnace.removeByOutput(item('advancedrocketry:productingot'))

CENTRIFUGE.recipeBuilder()
        .inputs(ore('turfMoon'))
        .outputs(metaitem('dustSmallSilicon'))
        .chancedOutput(metaitem('dustSmallSilicon'), 3000, 400)
        .fluidOutputs(fluid('helium_3') * 40)
        .duration(120)
        .EUt(30)
        .buildAndRegister()

CENTRIFUGE.recipeBuilder()
        .inputs(item('advancedrocketry:electricmushroom'))
        .fluidOutputs(fluid('methane') * 500)
        .duration(100)
        .EUt(30)
        .buildAndRegister()

//TODO: register GT material for this?
MACERATOR.recipeBuilder()
        .inputs(item('libvulpes:ore0'))
        .outputs(item('libvulpes:productdust') * 2)
        .duration(120)
        .EUt(17)
        .buildAndRegister()

ELECTROLYZER.recipeBuilder()
        .inputs(item('libvulpes:productdust'))
        .outputs(metaitem('dustLithium') * 2)
        .duration(120)
        .EUt(17)
        .buildAndRegister()

FORGE_HAMMER.recipeBuilder()
        .inputs(item('advancedrocketry:charcoallog'))
        .outputs(item('minecraft:coal', 1) * 4)
        .duration(100)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs(item('minecraft:iron_bars') * 3)
        .inputs(ore('plateIron') * 6)
        .outputs(item('advancedrocketry:carbonscrubbercartridge'))
        .duration(90)
        .EUt(30)
        .buildAndRegister()