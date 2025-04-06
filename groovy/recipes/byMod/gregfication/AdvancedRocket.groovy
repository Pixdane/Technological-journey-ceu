ALLOY_SMELTER = recipemap('alloy_smelter')
AUTOCLAVE = recipemap('autoclave')
MACERATOR = recipemap('macerator')
EXTRUDER = recipemap('extruder')
CHEMICAL_REACTOR = recipemap('chemical_reactor')
LASER_ENGRAVER = recipemap('laser_engraver')
MIXER = recipemap('mixer')
CUTTER = recipemap('cutter')

ore_dict.remove('oreCopper', item('libvulpes:ore0:4'))
ore_dict.remove('oreTin', item('libvulpes:ore0:5'))
ore_dict.remove('oreRutile', item('libvulpes:ore0:8'))
ore_dict.remove('oreTitanium', item('libvulpes:ore0:8'))
ore_dict.remove('oreAluminum', item('libvulpes:ore0:9'))
ore_dict.remove('oreIridium', item('libvulpes:ore0:10'))

mods.advancedrocketry.chemical_reactor.removeAll()
mods.advancedrocketry.precision_assembler.removeAll()
mods.advancedrocketry.cutting_machine.removeAll()
mods.advancedrocketry.rolling_machine.removeAll()
mods.advancedrocketry.lathe.removeAll()
mods.advancedrocketry.electrolyser.removeAll()
mods.advancedrocketry.electric_arc_furnace.removeAll()
mods.advancedrocketry.crystallizer.removeAll()
mods.advancedrocketry.small_plate_presser.removeAll()

crafting.removeByOutput(item('advancedrocketry:launchpad:0'))

MIXER.recipeBuilder()
        .inputs([ore('blockConcrete') * 3, ore('dyeYellow'), ore('dyeBlack')])
        .outputs([item('advancedrocketry:launchpad:0') * 3])
        .duration(240)
        .EUt(16)
        .buildAndRegister()

crafting.removeByOutput(item('advancedrocketry:loader:1'))
crafting.removeByOutput(item('advancedrocketry:ic:3'))
crafting.removeByOutput(item('advancedrocketry:spaceboots'))
crafting.removeByOutput(item('advancedrocketry:spacechestplate:0'))
crafting.removeByOutput(item('libvulpes:structuremachine:0'))
crafting.removeByOutput(item('libvulpes:holoprojector:0'))
crafting.removeByOutput(item('advancedrocketry:spaceleggings'))
crafting.removeByOutput(item('advancedrocketry:spacehelmet'))

crafting.addShaped(item('minecraft:enchanted_book').withNbt(StoredEnchantments: [lvl: 1 as short, id: 13 as short]), [
        [null, ore('stickLongStainlessSteel'), null],
        [null, item('advancedrocketry:spacehelmet'), null],
        [null, ore('bookEmpty'), null]
])

crafting.addShaped(item('minecraft:enchanted_book').withNbt(StoredEnchantments: [lvl: 1 as short, id: 13 as short]), [
        [null, ore('stickLongStainlessSteel'), null],
        [null, item('advancedrocketry:spacechestplate:0'), null],
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
        [ore('wool'), item('gregtech:meta_lens:2000'), ore('wool')],
        [ore('plateStainlessSteel'), item('minecraft:leather_helmet:0'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:spaceleggings'), [
        [ore('plateStainlessSteel'), ore('wool'), ore('plateStainlessSteel')],
        [ore('wool'), item('minecraft:leather_leggings:0'), ore('wool')],
        [ore('wool'), null, ore('wool')]
])

crafting.addShaped(item('advancedrocketry:spacechestplate:0'), [
        [null, ore('plateStainlessSteel'), null],
        [ore('wool'), item('minecraft:leather_chestplate:0'), ore('wool')],
        [ore('plateStainlessSteel'), ore('wool'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:spaceboots'), [
        [ore('plateStainlessSteel'), ore('wool'), ore('plateStainlessSteel')],
        [ore('wool'), item('minecraft:leather_boots:0'), ore('wool')],
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
crafting.removeByOutput(item('gcyl:mte:114'))
crafting.removeByOutput(item('advancedrocketry:fuelingstation:0'))
crafting.removeByOutput(item('advancedrocketry:fueltank'))
crafting.removeByOutput(item('advancedrocketry:guidancecomputer:0'))
crafting.removeByOutput(ore('dustThermite'))
crafting.removeByOutput(item('advancedrocketry:ic:5'))
crafting.removeByOutput(item('advancedrocketry:ic:4'))
crafting.removeByOutput(item('advancedrocketry:gravitymachine:0'))
crafting.removeByOutput(item('advancedrocketry:altitudecontroller:0'))
crafting.removeByOutput(item('advancedrocketry:stationmarker:0'))
crafting.removeByOutput(item('advancedrocketry:circlelight:0'))
crafting.removeByOutput(item('advancedrocketry:stationbuilder:0'))
crafting.removeByOutput(item('advancedrocketry:oxygenscrubber:0'))
crafting.removeByOutput(item('advancedrocketry:oxygenvent:0'))
crafting.removeByOutput(item('advancedrocketry:oxygencharger:0'))
crafting.removeByOutput(item('advancedrocketry:landingpad:0'))
crafting.removeByOutput(item('advancedrocketry:warpcore:0'))
crafting.removeByOutput(item('advancedrocketry:warpmonitor:0'))
crafting.removeByOutput(item('advancedrocketry:orientationcontroller:0'))
crafting.removeByOutput(item('advancedrocketry:gravitycontroller:0'))
crafting.removeByOutput(item('advancedrocketry:rocketbuilder:0'))

crafting.addShaped(item('advancedrocketry:warpmonitor:0'), [
        [ore('plateStainlessSteel'), item('gregtech:meta_item_1:234'), ore('plateStainlessSteel')],
        [item('gregtech:meta_item_1:234'), item('gregtech:mte:988'), item('gregtech:meta_item_1:234')],
        [ore('plateStainlessSteel'), item('gregtech:meta_item_1:234'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:orientationcontroller:0'), [
        [ore('plateStainlessSteel'), item('gregtech:mte:988'), ore('plateStainlessSteel')],
        [item('gregtech:mte:988'), item('advancedrocketry:misc:0'), item('gregtech:mte:988')],
        [ore('plateStainlessSteel'), item('gregtech:mte:988'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:loader:1'), [
        [ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')],
        [ore('plateStainlessSteel'), ore('chest,chestWood'), ore('plateStainlessSteel')],
        [ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:oxygencharger:0'), [
        [null, null, null],
        [ore('plateStainlessSteel'), item('gregtech:meta_item_1:144'), ore('plateStainlessSteel')],
        [null, item('gregtech:mte:1611'), null]
])

crafting.addShaped(item('advancedrocketry:oxygenvent:0'), [
        [null, item('gregtech:meta_item_1:144'), null],
        [null, item('gregtech:mte:988'), null],
        [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:oxygenscrubber:0'), [
        [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')],
        [null, item('gregtech:mte:988'), null],
        [null, item('gregtech:meta_item_1:144'), null]
])

crafting.addShaped(item('advancedrocketry:gravitycontroller:0'), [
        [ore('plateStainlessSteel'), item('gregtech:meta_item_1:219'), ore('plateStainlessSteel')],
        [ore('plateStainlessSteel'), item('gregtech:mte:988'), ore('plateStainlessSteel')],
        [ore('plateStainlessSteel'), item('gregtech:meta_item_1:234'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:rocketbuilder:0'), [
        [ore('plateTitanium'), item('advancedrocketry:misc:0'), ore('plateTitanium')],
        [item('gregtech:meta_item_1:189'), item('gregtech:mte:988'), item('gregtech:meta_item_1:189')],
        [ore('plateTitanium'), null, ore('plateTitanium')]
])

crafting.addShaped(item('libvulpes:structuremachine:0') * 4, [
        [ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')],
        [ore('plateStainlessSteel'), ore('stickStainlessSteel'), ore('plateStainlessSteel')],
        [ore('stickStainlessSteel'), ore('plateStainlessSteel'), ore('stickStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:warpcore:0'), [
        [ore('plateTitanium'), ore('circuitExtreme'), ore('plateTitanium')],
        [ore('plateTitanium'), item('gregtech:mte:989'), ore('plateTitanium')],
        [ore('plateTitanium'), ore('circuitExtreme'), ore('plateTitanium')]
])

crafting.addShaped(item('advancedrocketry:circlelight:0'), [
        [null, ore('plateIron'), null],
        [ore('plateIron'), item('minecraft:glowstone'), ore('plateIron')],
        [null, ore('plateIron'), null]
])

crafting.addShaped(item('advancedrocketry:altitudecontroller:0'), [
        [ore('plateStainlessSteel'), item('advancedrocketry:misc:0'), ore('plateStainlessSteel')],
        [item('gregtech:meta_item_1:234'), item('gregtech:mte:988'), item('gregtech:meta_item_1:234')],
        [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:stationmarker:0'), [
        [ore('plateStainlessSteel'), item('advancedrocketry:misc:0'), ore('plateStainlessSteel')],
        [ore('plateStainlessSteel'), item('gregtech:mte:988'), ore('plateStainlessSteel')],
        [ore('plateStainlessSteel'), ore('plateStainlessSteel'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:gravitymachine:0'), [
        [item('gregtech:meta_item_1:219'), item('advancedrocketry:misc:0'), item('gregtech:meta_item_1:219')],
        [ore('plateStainlessSteel'), item('gregtech:mte:988'), ore('plateStainlessSteel')],
        [ore('plateStainlessSteel'), item('gregtech:meta_item_1:219'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:stationbuilder:0'), [
        [item('gregtech:meta_item_1:234'), ore('plateStainlessSteel'), item('gregtech:meta_item_1:234')],
        [item('gregtech:meta_item_1:189'), item('gregtech:mte:988'), item('gregtech:meta_item_1:189')],
        [ore('plateStainlessSteel'), item('gregtech:meta_item_1:219'), ore('plateStainlessSteel')]
])

ALLOY_SMELTER.recipeBuilder()
        .inputs([item('gregtech:meta_item_1:371'), item('minecraft:glass_pane')])
        .outputs([ore('waferSilicon').getFirst()])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs([ore('waferSilicon')])
        .notConsumable(ore('craftingLensWhite'))
        .outputs([item('advancedrocketry:itemcircuitplate:0')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs([ore('waferSilicon')])
        .notConsumable(ore('craftingLensLime'))
        .outputs([item('advancedrocketry:itemcircuitplate:1')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

CUTTER.recipeBuilder()
        .inputs([item('advancedrocketry:itemcircuitplate:1')])
        .fluidInputs(fluid('lubricant') * 144)
        .outputs([item('advancedrocketry:ic:2') * 16])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

CUTTER.recipeBuilder()
        .inputs([item('advancedrocketry:itemcircuitplate:0')])
        .fluidInputs(fluid('lubricant') * 144)
        .outputs([item('advancedrocketry:ic:0') * 16])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

crafting.addShaped(item('advancedrocketry:ic:1'), [
        [null, null, null],
        [null, item('advancedrocketry:ic:0'), null],
        [item('advancedrocketry:ic:2'), item('advancedrocketry:ic:2'), item('advancedrocketry:ic:2')]
])

crafting.addShaped(item('advancedrocketry:satelliteidchip:0'), [
        [null, null, null],
        [null, item('advancedrocketry:ic:2'), null],
        [item('advancedrocketry:ic:0'), item('advancedrocketry:ic:0'), item('advancedrocketry:ic:0')]
])

crafting.addShaped(item('advancedrocketry:fuelingstation:0'), [
        [ore('plateStainlessSteel'), item('gregtech:meta_item_1:144'), ore('plateStainlessSteel')],
        [item('gregtech:meta_item_1:144'), item('gregtech:mte:988'), item('gregtech:meta_item_1:144')],
        [ore('plateStainlessSteel'), item('gregtech:meta_item_1:144'), ore('plateStainlessSteel')]
])

crafting.addShaped(item('advancedrocketry:guidancecomputer:0'), [
        [ore('plateIron'), item('advancedrocketry:misc:0'), ore('plateIron')],
        [item('gregtech:meta_item_1:219'), item('gregtech:mte:988'), item('gregtech:meta_item_1:219')],
        [ore('plateIron'), item('gregtech:meta_item_1:234'), ore('plateIron')]
])

crafting.addShapeless(item('advancedrocketry:landingpad:0'), [item('advancedrocketry:launchpad:0'), item('advancedrocketry:ic:0')])

crafting.addShaped(item('libvulpes:holoprojector:0'), [
        [item('minecraft:glass_pane'), item('gregtech:meta_item_1:219'), item('minecraft:glass_pane')],
        [null, item('gregtech:mte:988'), null],
        [null, null, null]]
)

crafting.addShaped(item('gcyl:mte:114'), [
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
        .inputs([item('advancedrocketry:crystal:0')])
        .outputs([item('actuallyadditions:item_crystal_shard:1') * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([item('advancedrocketry:crystal:1')])
        .outputs([item('actuallyadditions:item_crystal_shard:2') * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([item('advancedrocketry:crystal:2')])
        .outputs([item('actuallyadditions:item_crystal_shard:4') * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([item('advancedrocketry:crystal:3')])
        .outputs([item('actuallyadditions:item_crystal_shard:0') * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([item('advancedrocketry:crystal:5')])
        .outputs([item('actuallyadditions:item_crystal_shard:3') * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([item('advancedrocketry:crystal:4')])
        .outputs([item('actuallyadditions:item_crystal_shard:5') * 4])
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
// item('advancedrocketry:charcoallog:0').addTooltip("ID 400 artifact");
// ore('blockTungstenCarbide').addTooltip("ID 401 artifact");
// ore('blockSalt').addTooltip("ID 402 artifact");
// item('gregtech:meta_block_compressed_3:3').addTooltip("ID 403 artifact");
// ore('blockCalifornium').addTooltip("ID 405 artifact");
// ore('blockAdamantium').addTooltip("ID 406 artifact");

// Low tank
EXTRUDER.recipeBuilder()
        .inputs([ore('ingotIron') * 16])
        .notConsumable(item('gregtech:meta_item_1:20'))
        .outputs([item('advancedrocketry:pressuretank:0')])
        .duration(600)
        .EUt(30)
        .buildAndRegister()

// Medium tank
EXTRUDER.recipeBuilder()
        .inputs([ore('ingotSteel') * 16])
        .notConsumable(item('gregtech:meta_item_1:20'))
        .outputs([item('advancedrocketry:pressuretank:1')])
        .duration(600)
        .EUt(120)
        .buildAndRegister()

// Large tank
EXTRUDER.recipeBuilder()
        .inputs([ore('ingotStainlessSteel') * 16])
        .notConsumable(item('gregtech:meta_item_1:20'))
        .outputs([item('advancedrocketry:pressuretank:2')])
        .duration(600)
        .EUt(500)
        .buildAndRegister()

// Max tank
EXTRUDER.recipeBuilder()
        .inputs([ore('ingotTitanium') * 16])
        .notConsumable(item('gregtech:meta_item_1:20'))
        .outputs([item('advancedrocketry:pressuretank:3')])
        .duration(600)
        .EUt(1048)
        .buildAndRegister()
