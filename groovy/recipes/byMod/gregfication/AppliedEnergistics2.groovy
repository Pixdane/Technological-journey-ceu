import mods.appliedenergistics2.inscriber
import mods.jei.ingredient as h
import mods.threng.aggregator
import mods.threng.etcher

AUTOCLAVE = recipemap('autoclave')
ASSEMBLER = recipemap('assembler')
ASSLINE = recipemap('assembly_line')
WIREMILL = recipemap('wiremill')
MACERATOR = recipemap('macerator')
MIXER = recipemap('mixer')
LASER_ENGRAVER = recipemap('laser_engraver')
EBF = recipemap('electric_blast_furnace')


// Hide items from JEI
mods.jei.ingredient.yeet(
        item('appliedenergistics2:material', 49),
        item('appliedenergistics2:material', 51),
)

// Recipe removals
[
        item('appliedenergistics2:part'),
        item('appliedenergistics2:part', 140),
        item('appliedenergistics2:quartz_glass'),
].forEach {
    crafting.removeByOutput(it)
}

inscriber.removeByOutput(item('appliedenergistics2:material', 20))
inscriber.removeByOutput(item('appliedenergistics2:material', 24))
inscriber.removeByOutput(item('appliedenergistics2:material', 23))
inscriber.removeByOutput(item('appliedenergistics2:material', 22))
inscriber.removeByOutput(item('appliedenergistics2:material', 18))
inscriber.removeByOutput(item('appliedenergistics2:material', 17))
inscriber.removeByOutput(item('appliedenergistics2:material', 16))
inscriber.removeByOutput(item('threng:material', 2))
inscriber.removeByOutput(item('appliedenergistics2:material', 59))

// Engineering Processor
inscriber.recipeBuilder()
        .input(ore('circuitLv'))
        .output(item('appliedenergistics2:material', 24))
        .top(item('appliedenergistics2:material', 17))
        .bottom(item('appliedenergistics2:material', 20))
        .register()

inscriber.recipeBuilder()
        .input(ore('circuitMv'))
        .output(item('appliedenergistics2:material', 24))
        .top(item('appliedenergistics2:material', 17))
        .bottom(item('appliedenergistics2:material', 20))
        .register()

inscriber.recipeBuilder()
        .input(ore('circuitLv'))
        .output(item('appliedenergistics2:material', 24))
        .top(item('appliedenergistics2:material', 17))
        .bottom(item('appliedenergistics2:material', 20))
        .register()

// Calculation Processor
inscriber.recipeBuilder()
        .input(ore('circuitLv'))
        .output(item('appliedenergistics2:material', 23))
        .top(item('appliedenergistics2:material', 16))
        .bottom(item('appliedenergistics2:material', 20))
        .register()

inscriber.recipeBuilder()
        .input(ore('circuitMv'))
        .output(item('appliedenergistics2:material', 23))
        .top(item('appliedenergistics2:material', 16))
        .bottom(item('appliedenergistics2:material', 20))
        .register()

inscriber.recipeBuilder()
        .input(ore('circuitLv'))
        .output(item('appliedenergistics2:material', 23))
        .top(item('appliedenergistics2:material', 16))
        .bottom(item('appliedenergistics2:material', 20))
        .register()

// Logic Processor
inscriber.recipeBuilder()
        .input(ore('circuitLv'))
        .output(item('appliedenergistics2:material', 22))
        .top(item('appliedenergistics2:material', 18))
        .bottom(item('appliedenergistics2:material', 20))
        .register()

inscriber.recipeBuilder()
        .input(ore('circuitMv'))
        .output(item('appliedenergistics2:material', 22))
        .top(item('appliedenergistics2:material', 18))
        .bottom(item('appliedenergistics2:material', 20))
        .register()

inscriber.recipeBuilder()
        .input(ore('circuitLv'))
        .output(item('appliedenergistics2:material', 22))
        .top(item('appliedenergistics2:material', 18))
        .bottom(item('appliedenergistics2:material', 20))
        .register()


AUTOCLAVE.recipeBuilder()
        .inputs([item('gregtech:meta_gem', 214)])
        .fluidInputs(fluid('water') * 250)
        .outputs([item('appliedenergistics2:material')])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

AUTOCLAVE.recipeBuilder()
        .inputs([item('gregtech:meta_gem', 340)])
        .fluidInputs(fluid('water') * 2000)
        .outputs([item('appliedenergistics2:material')])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:part', 16), ore('foilRubber') * 4])
        .outputs([item('appliedenergistics2:part', 36) * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:part', 16), ore('foilPlastic') * 2])
        .outputs([item('appliedenergistics2:part', 36) * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:part', 16), ore('foilPolyphenyleneSulfide')])
        .outputs([item('appliedenergistics2:part', 36) * 4])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:part', 16), ore('foilPolybenzimidazole')])
        .outputs([item('appliedenergistics2:part', 36) * 6])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:part', 16), ore('foilPolyetheretherketone')])
        .outputs([item('appliedenergistics2:part', 36) * 8])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

WIREMILL.recipeBuilder()
        .inputs([ore('crystalPureNetherQuartz')])
        .outputs([item('appliedenergistics2:part', 140) * 6])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

WIREMILL.recipeBuilder()
        .inputs([ore('gemNetherQuartz,gemQuartz')])
        .outputs([item('appliedenergistics2:part', 140) * 1])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([item('appliedenergistics2:sky_stone_block')])
        .outputs([item('appliedenergistics2:material', 45)])
        .duration(160)
        .EUt(28)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([ore('crystalFluix')])
        .outputs([ore('dustFluix').getFirst()])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

etcher.removeByOutput(item('appliedenergistics2:material', 22))

etcher.recipeBuilder()
        .input(ore('dustRedstone'))
        .output(item('appliedenergistics2:material', 22))
        .top(ore('ingotGold'))
        .bottom(ore('ingotSilicon'))
        .register()

etcher.removeByOutput(item('appliedenergistics2:material', 24))

etcher.recipeBuilder()
        .input(ore('dustRedstone'))
        .output(item('appliedenergistics2:material', 24))
        .top(ore('gemDiamond'))
        .bottom(ore('ingotSilicon'))
        .register()

etcher.removeByOutput(item('appliedenergistics2:material', 23))

etcher.recipeBuilder()
        .input(ore('dustRedstone'))
        .output(item('appliedenergistics2:material', 23))
        .top(ore('crystalPureCertusQuartz'))
        .bottom(ore('ingotSilicon'))
        .register()

etcher.removeByOutput(item('threng:material', 6))

etcher.recipeBuilder()
        .input(ore('dustRedstone'))
        .output(item('threng:material', 6))
        .top(item('threng:material', 5))
        .bottom(ore('ingotSilicon'))
        .register()

etcher.removeByOutput(item('threng:material', 14))

etcher.recipeBuilder()
        .input(ore('dustRedstone'))
        .output(item('threng:material', 14))
        .top(item('threng:material', 13))
        .bottom(ore('ingotSilicon'))
        .register()

MIXER.recipeBuilder()
        .inputs([ore('crystalCertusQuartz'), ore('dustRedstone')])
        .outputs([item('appliedenergistics2:material', 1)])
        .duration(30)
        .EUt(30)
        .buildAndRegister()

// Crystals fix

// Fluix
AUTOCLAVE.recipeBuilder()
        .inputs(item('appliedenergistics2:crystal_seed:1200'))
        .fluidInputs(fluid('water') * 1000)
        .outputs(ore('crystalPureFluix').getFirst())
        .duration(120)
        .EUt(30)
        .buildAndRegister()

//nether
AUTOCLAVE.recipeBuilder()
        .inputs(item('appliedenergistics2:crystal_seed', 600))
        .fluidInputs(fluid('water') * 1000)
        .outputs(ore('crystalPureNetherQuartz').getFirst())
        .duration(120)
        .EUt(30)
        .buildAndRegister()

// Certus Quartz
AUTOCLAVE.recipeBuilder()
        .inputs(item('appliedenergistics2:crystal_seed'))
        .fluidInputs(fluid('water') * 1000)
        .outputs(ore('crystalPureCertusQuartz').getFirst())
        .duration(120)
        .EUt(30)
        .buildAndRegister()

crafting.removeByOutput(item('threng:material', 1))

crafting.addShaped(item('threng:material', 1),
        [[ore('dustFluix'), ore('dustFluix'), ore('dustCoal')],
         [ore('dustCoal'), ore('ingotSilicon'), null],
         [null, null, null]
        ])

aggregator.removeByOutput(item('threng:material', 1))
aggregator.recipeBuilder()
        .input(ore('dustCoal'), ore('dustFluix'), ore('dustSilicon'))
        .output(item('threng:material', 1))
        .register()

crafting.removeByOutput(item('threng:material', 9))

crafting.addShaped(item('threng:material', 9), [
        [null, null, null],
        [item('threng:material', 8), ore('dustCoal'), item('threng:material', 8)],
        [null, null, null]
])

ASSEMBLER.recipeBuilder()
        .inputs([ore('ingotGold')])
        .notConsumable(item('appliedenergistics2:material', 15))
        .outputs([item('appliedenergistics2:material', 18)])
        .duration(300)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([ore('gemDiamond')])
        .notConsumable(item('appliedenergistics2:material', 14))
        .outputs([item('appliedenergistics2:material', 17)])
        .duration(300)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([ore('crystalCertusQuartz')])
        .notConsumable(item('appliedenergistics2:material', 13))
        .outputs([item('appliedenergistics2:material', 16)])
        .duration(300)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([ore('ingotSilicon')])
        .notConsumable(item('appliedenergistics2:material', 19))
        .outputs([item('appliedenergistics2:material', 20)])
        .duration(300)
        .EUt(30)
        .buildAndRegister()

// Processors
ASSEMBLER.recipeBuilder()
        .inputs([ore('circuitBasic'), item('appliedenergistics2:material', 18), item('appliedenergistics2:material', 20)])
        .fluidInputs(fluid('plastic') * 144)
        .outputs([item('appliedenergistics2:material', 22)])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([ore('circuitBasic'), item('appliedenergistics2:material', 17), item('appliedenergistics2:material', 20)])
        .fluidInputs(fluid('plastic') * 144)
        .outputs([item('appliedenergistics2:material', 24)])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([ore('circuitBasic'), item('appliedenergistics2:material', 16), item('appliedenergistics2:material', 20)])
        .fluidInputs(fluid('plastic') * 144)
        .outputs([item('appliedenergistics2:material', 23)])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:material', 13), item('appliedenergistics2:material', 14), item('appliedenergistics2:material', 15), item('appliedenergistics2:material', 19), item('appliedenergistics2:quartz_glass') * 2, item('threng:material', 4), item('appliedenergistics2:material', 43), item('gregtech:mte', 990)])
        .outputs([item('threng:machine', 2)])
        .duration(160)
        .EUt(7680)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:quartz_glass') * 4, item('gregtech:meta_item_1', 142) * 4, item('gregtech:mte', 986)])
        .outputs([item('appliedenergistics2:fluid_interface') * 2])
        .duration(150)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:quartz_glass') * 4, item('gregtech:meta_item_1', 172) * 4, item('gregtech:mte', 986)])
        .outputs([item('appliedenergistics2:interface') * 2])
        .duration(150)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('threng:material', 13), ore('circuitBasic'), item('appliedenergistics2:material', 20)])
        .fluidInputs(fluid('plastic') * 144)
        .outputs([item('threng:material', 14)])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('threng:material', 5), ore('circuitBasic'), item('appliedenergistics2:material', 20)])
        .fluidInputs(fluid('plastic') * 144)
        .outputs([item('threng:material', 6)])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

crafting.addShaped(item('threng:machine'), [
        [ore('blockHopper'), ore('blockHopper'), ore('blockHopper')],
        [ore('dustRedstone'), metaitem('hull.hv'), ore('dustRedstone')],
        [item('appliedenergistics2:material', 22), item('ae2stuff:grower'), item('appliedenergistics2:material', 22)]
])

ASSEMBLER.recipeBuilder()
        .inputs([ore('blockHopper') * 3, metaitem('hull.hv'), item('appliedenergistics2:material', 22) * 2, item('ae2stuff:grower')])
        .outputs([item('threng:machine')])
        .duration(160)
        .EUt(480)
        .buildAndRegister()

crafting.addShaped(item('threng:machine', 3), [
        [ore('ingotFluixSteel'), item('appliedenergistics2:material', 24), ore('ingotFluixSteel')],
        [item('appliedenergistics2:crafting_accelerator'), metaitem('hull.ev'), item('appliedenergistics2:crafting_accelerator')],
        [ore('ingotFluixSteel'), item('appliedenergistics2:material', 24), ore('ingotFluixSteel')]
])

ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:crafting_accelerator') * 2, metaitem('hull.ev'), ore('ingotFluixSteel') * 4])
        .outputs([item('threng:machine', 3)])
        .duration(160)
        .EUt(1920)
        .buildAndRegister()

crafting.addShaped(item('threng:material', 2), [
        [ore('dustCoal'), ore('dustCoal'), ore('dustCoal')],
        [ore('dustCoal'), ore('ingotIron'), ore('dustFluix')],
        [ore('dustFluix'), ore('dustFluix'), ore('dustFluix')]
])

crafting.addShaped(item('threng:machine', 1), [
        [ore('ingotFluixSteel'), item('appliedenergistics2:material', 22), ore('ingotFluixSteel')],
        [item('threng:material', 4), metaitem('hull.hv'), item('threng:material', 4)],
        [ore('ingotFluixSteel'), item('appliedenergistics2:material', 22), ore('ingotFluixSteel')]
])

ASSEMBLER.recipeBuilder()
        .inputs([item('threng:material', 4), metaitem('hull.ev'), ore('ingotFluixSteel') * 5, item('appliedenergistics2:material', 22) * 2])
        .outputs([item('threng:machine', 1)])
        .duration(160)
        .EUt(1920)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('threng:material', 4), metaitem('hull.ev'), ore('ingotFluixSteel') * 4, item('appliedenergistics2:part', 280)])
        .outputs([item('threng:machine', 4)])
        .duration(160)
        .EUt(1920)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([metaitem('hull.hv'), ore('ingotFluixSteel') * 4, item('appliedenergistics2:dense_energy_cell'), item('appliedenergistics2:charger')])
        .outputs([item('threng:machine', 5)])
        .duration(160)
        .EUt(1920)
        .buildAndRegister()

crafting.addShaped(item('appliedenergistics2:energy_acceptor'), [
        [ore('plateSteel'), item('appliedenergistics2:quartz_glass'), ore('plateSteel')],
        [item('appliedenergistics2:quartz_glass'), item('gregtech:mte', 986), item('appliedenergistics2:quartz_glass')],
        [ore('plateSteel'), item('appliedenergistics2:quartz_glass'), ore('plateSteel')]
])

ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:quartz_glass') * 4, ore('plateSteel') * 2, ore('circuitLv')])
        .fluidInputs(fluid('plastic') * 144)
        .outputs([item('appliedenergistics2:material', 52) * 8])
        .duration(160)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:quartz_glass') * 8, ore('plateSteel') * 4, ore('circuitMv')])
        .fluidInputs(fluid('plastic') * 288)
        .outputs([item('appliedenergistics2:material', 52) * 16])
        .duration(160)
        .EUt(120)
        .buildAndRegister()

MIXER.recipeBuilder()
        .inputs([item('appliedenergistics2:material', 1), ore('dustRedstone'), ore('dustQuartz')])
        .outputs([ore('crystalFluix').getFirst() * 2])
        .duration(130)
        .EUt(30)
        .buildAndRegister()

MACERATOR.recipeBuilder()
        .inputs([ore('crystalCertusQuartz')])
        .outputs([ore('dustCertusQuartz').getFirst()])
        .duration(130)
        .EUt(30)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([ore('crystalPureCertusQuartz')])
        .notConsumable(item('appliedenergistics2:material', 13))
        .outputs([item('appliedenergistics2:material', 16)])
        .duration(300)
        .EUt(120)
        .buildAndRegister()

// ME Drive Parts

// 1k
ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('plateSteel') * 4, ore('circuitBasic'), ore('crystalCertusQuartz') * 4])
        .outputs([item('appliedenergistics2:material', 35)])
        .duration(300)
        .EUt(30)
        .buildAndRegister()

// 4k
ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('plateAluminium') * 4, ore('circuitGood'), ore('crystalCertusQuartz') * 4, item('appliedenergistics2:material', 35) * 3])
        .outputs([item('appliedenergistics2:material', 36)])
        .duration(300)
        .EUt(120)
        .buildAndRegister()

// 16k
ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('plateStainlessSteel') * 4, ore('circuitHv'), ore('crystalCertusQuartz') * 4, item('appliedenergistics2:material', 36) * 3])
        .outputs([item('appliedenergistics2:material', 37)])
        .duration(300)
        .EUt(480)
        .buildAndRegister()

// 64k
ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('plateTitanium') * 4, ore('circuitEv'), ore('crystalCertusQuartz') * 4, item('appliedenergistics2:material', 37) * 3])
        .outputs([item('appliedenergistics2:material', 38)])
        .duration(300)
        .EUt(1920)
        .buildAndRegister()

// 1k
ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('plateSteel') * 4, ore('circuitBasic'), ore('crystalPureCertusQuartz') * 4])
        .outputs([item('appliedenergistics2:material', 35)])
        .duration(300)
        .EUt(30)
        .buildAndRegister()

// 4k
ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('plateAluminium') * 4, ore('circuitGood'), ore('crystalPureCertusQuartz') * 4, item('appliedenergistics2:material', 35) * 3])
        .outputs([item('appliedenergistics2:material', 36)])
        .duration(300)
        .EUt(120)
        .buildAndRegister()

// 16k
ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('plateStainlessSteel') * 4, ore('circuitHv'), ore('crystalPureCertusQuartz') * 4, item('appliedenergistics2:material', 36) * 3])
        .outputs([item('appliedenergistics2:material', 37)])
        .duration(300)
        .EUt(480)
        .buildAndRegister()

// 64k
ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('plateTitanium') * 4, ore('circuitEv'), ore('crystalPureCertusQuartz') * 4, item('appliedenergistics2:material', 37) * 3])
        .outputs([item('appliedenergistics2:material', 38)])
        .duration(300)
        .EUt(1920)
        .buildAndRegister()

// Fluid Drive Parts
// 1k
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs([ore('plateSteel') * 4, ore('circuitBasic'), ore('dyeBlue') * 4])
        .outputs([item('appliedenergistics2:material', 54)])
        .duration(300)
        .EUt(30)
        .buildAndRegister()

// 4k
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs([ore('plateAluminium') * 4, ore('circuitGood'), ore('dyeBlue') * 4, item('appliedenergistics2:material', 54) * 3])
        .outputs([item('appliedenergistics2:material', 55)])
        .duration(300)
        .EUt(120)
        .buildAndRegister()

// 16k
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs([ore('plateStainlessSteel') * 4, ore('circuitHv'), ore('dyeBlue') * 4, item('appliedenergistics2:material', 55) * 3])
        .outputs([item('appliedenergistics2:material', 56)])
        .duration(300)
        .EUt(480)
        .buildAndRegister()

// 64k
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs([ore('plateTitanium') * 4, ore('circuitEv'), ore('dyeBlue') * 4, item('appliedenergistics2:material', 56) * 3])
        .outputs([item('appliedenergistics2:material', 57)])
        .duration(300)
        .EUt(1920)
        .buildAndRegister()

EBF.recipeBuilder()
        .inputs([ore('stone,stoneSmooth')])
        .outputs(item('appliedenergistics2:sky_stone_block'))
        .blastFurnaceTemp(900) //this is a minimal temperature at which the item will be smelted
        .duration(40)
        .EUt(30)
        .buildAndRegister()

// WTF???
// if (item('appliedenergistics2:controller') as bool) {
if (true) {
    crafting.removeByOutput(item('appliedenergistics2:quantum_ring'))
    crafting.removeByOutput(item('appliedenergistics2:controller'))

    ASSEMBLER.recipeBuilder()
            .circuitMeta(0)
            .inputs([item('gregtech:mte', 986), ore('crystalPureFluix') * 4, ore('circuitBasic')])
            .outputs([item('appliedenergistics2:controller')])
            .duration(300)
            .EUt(30)
            .buildAndRegister()

    ASSEMBLER.recipeBuilder()
            .inputs([ore('itemConduitBinder') * 5, item('enderio:item_me_conduit') * 4])
            .outputs([item('enderio:item_me_conduit', 1) * 4])
            .duration(150)
            .EUt(480)
            .buildAndRegister()
} else {
    h.yeet(item('enderio:item_me_conduit', 1))
}

crafting.removeByOutput(item('appliedenergistics2:chest'))
crafting.removeByOutput(item('appliedenergistics2:drive'))
crafting.removeByOutput(item('appliedenergistics2:material', 57))
crafting.removeByOutput(item('appliedenergistics2:material', 56))
crafting.removeByOutput(item('appliedenergistics2:material', 55))
crafting.removeByOutput(item('appliedenergistics2:material', 54))
crafting.removeByOutput(item('appliedenergistics2:material', 38))
crafting.removeByOutput(item('appliedenergistics2:material', 37))
crafting.removeByOutput(item('appliedenergistics2:material', 36))
crafting.removeByOutput(item('appliedenergistics2:material', 35))
crafting.removeByOutput(item('appliedenergistics2:molecular_assembler'))
crafting.removeByOutput(item('nae2:material'))
crafting.removeByOutput(item('nae2:material', 1))
crafting.removeByOutput(item('nae2:material', 2))
crafting.removeByOutput(item('nae2:material', 3))
crafting.removeByOutput(item('nae2:material', 4))
crafting.removeByOutput(item('nae2:material', 5))
crafting.removeByOutput(item('nae2:material', 6))
crafting.removeByOutput(item('nae2:material', 7))
crafting.removeByOutput(item('nae2:material', 8))
crafting.removeByOutput(item('nae2:coprocessor_4x'))
crafting.removeByOutput(item('nae2:coprocessor_16x'))
crafting.removeByOutput(item('nae2:coprocessor_64x'))
crafting.removeByOutput(item('nae2:part'))
crafting.removeByOutput(item('nae2:upgrade'))
crafting.removeByOutput(item('nae2:pattern_multiplier'))

crafting.addShaped(item('appliedenergistics2:chest'), [
        [item('actuallyadditions:block_giant_chest'), item('gregtech:mte:1151'), item('actuallyadditions:block_giant_chest')],
        [item('gregtech:mte:1151'), item('appliedenergistics2:material', 24), item('gregtech:mte:1166')],
        [item('actuallyadditions:block_giant_chest'), item('gregtech:mte:1166'), item('actuallyadditions:block_giant_chest')]
])

crafting.addShaped(item('appliedenergistics2:drive'), [
        [item('gregtech:mte', 986), item('appliedenergistics2:material', 24), item('gregtech:mte', 986)],
        [item('appliedenergistics2:part', 16), item('gregtech:meta_item_1:32680'), item('appliedenergistics2:part', 16)],
        [item('gregtech:mte', 986), item('appliedenergistics2:material', 24), item('gregtech:mte', 986)]
])

crafting.addShaped(item('appliedenergistics2:molecular_assembler'), [
        [ore('workbench'), ore('circuitBasic'), ore('workbench')],
        [item('appliedenergistics2:material', 43), item('gregtech:mte', 986), item('appliedenergistics2:material', 44)],
        [ore('workbench'), ore('circuitBasic'), ore('workbench')]
])

h.yeet(item('extracells:part.base', 10))
h.yeet(item('extracells:part.base', 11))
h.yeet(item('extracells:part.base', 9))
h.yeet(item('extracells:part.base'))
h.yeet(item('extracells:part.base', 1))
h.yeet(item('extracells:part.base', 8))
h.yeet(item('extracells:part.base', 3))
h.yeet(item('extracells:part.base', 4))
h.yeet(item('extracells:part.base', 6))
h.yeet(item('extracells:part.base', 7))
h.yeet(item('extracells:part.base', 5))
h.yeet(item('extracells:part.base', 2))
h.yeet(item('extracells:ecbaseblock'))
h.yeet(item('extracells:fluidfiller'))
h.yeet(item('extracells:hardmedrive'))
h.yeet(item('extracells:vibrantchamberfluid'))
h.yeet(item('extracells:terminal.universal.wireless'))
h.yeet(item('extracells:terminal.fluid.wireless'))
h.yeet(item('extracells:storage.component'))
h.yeet(item('extracells:storage.component', 1))
h.yeet(item('extracells:storage.component', 2))
h.yeet(item('extracells:storage.component', 3))
h.yeet(item('extracells:storage.component', 4))
h.yeet(item('extracells:storage.component', 5))
h.yeet(item('extracells:storage.component', 6))
h.yeet(item('extracells:storage.component', 7))
h.yeet(item('extracells:storage.component', 8))
h.yeet(item('extracells:storage.component', 9))
h.yeet(item('extracells:storage.component', 10))
h.yeet(item('extracells:storage.fluid'))
h.yeet(item('extracells:storage.fluid', 1))
h.yeet(item('extracells:storage.fluid', 2))
h.yeet(item('extracells:storage.fluid', 3))
h.yeet(item('extracells:storage.fluid', 4))
h.yeet(item('extracells:storage.fluid', 5))
h.yeet(item('extracells:storage.fluid', 6))
h.yeet(item('extracells:storage.physical'))
h.yeet(item('extracells:storage.physical', 1))
h.yeet(item('extracells:storage.physical', 2))
h.yeet(item('extracells:storage.physical', 3))
h.yeet(item('extracells:storage.casing'))
h.yeet(item('extracells:storage.casing', 1))
h.yeet(item('nae2:reconstruction_chamber'))

// TODO
// Written by MadMan310
// val ae2 as IMod = loadedMods["appliedenergistics2"];
// val ae2Items as IItemStack[] = ae2.items;
// for item in ae2Items {
//     if(item.displayName has "Cable Facade") {
//         if(item.displayName has "MAX Power Cell") {
//             item.addTooltip(format.darkAqua("All facades are still craftable, they are just hidden from JEI to avoid clutter"));
//         }
//         else {
//             mods.jei.JEI.hide(item);
//         }
//     }
// }

// val ae3 as IMod = loadedMods["extracells"];
// val ae3Items as IItemStack[] = ae3.items;
// for item in ae3Items {
//     if(item.displayName has "ME Fluid Pattern") {
//             h.yeet(item);
//     }
// }


ASSEMBLER.recipeBuilder()
        .inputs([metaitem('hull.hv'), item('appliedenergistics2:quartz_glass') * 2, metaitem('electric.pump.hv') * 2])
        .outputs([item('appliedenergistics2:fluid_interface') * 4])
        .duration(150)
        .EUt(480)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([metaitem('hull.hv'), item('appliedenergistics2:quartz_glass') * 2, item('gregtech:meta_item_1', 174) * 2])
        .outputs([item('appliedenergistics2:interface') * 4])
        .duration(150)
        .EUt(480)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('gregtech:meta_item_1', 146), item('appliedenergistics2:quartz_glass'), item('gregtech:mte', 990)])
        .outputs([item('appliedenergistics2:fluid_interface') * 8])
        .duration(150)
        .EUt(7680)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('gregtech:meta_item_1', 176), item('appliedenergistics2:quartz_glass'), item('gregtech:mte', 990)])
        .outputs([item('appliedenergistics2:interface') * 8])
        .duration(150)
        .EUt(7680)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('gregtech:meta_item_1', 148), item('appliedenergistics2:quartz_glass') * 1, item('gregtech:mte', 992) * 1])
        .outputs([item('appliedenergistics2:fluid_interface') * 16])
        .duration(150)
        .EUt(122880)
        .buildAndRegister()

ASSEMBLER.recipeBuilder()
        .inputs([item('gregtech:meta_item_1', 178), item('appliedenergistics2:quartz_glass') * 1, item('gregtech:mte', 992) * 1])
        .outputs([item('appliedenergistics2:interface') * 16])
        .duration(150)
        .EUt(122880)
        .buildAndRegister()

crafting.addShapeless(item('appliedenergistics2:interface'), [item('appliedenergistics2:part', 440)])

crafting.addShapeless(item('appliedenergistics2:fluid_interface'), [item('appliedenergistics2:part', 441)])

crafting.removeByOutput(item('extracells:part.base', 12))

crafting.addShapeless(item('extracells:part.base', 12), [item('gregtech:meta_item_1', 292), item('appliedenergistics2:part', 260)])

// Fix certus

mods.gregtech.autoclave.removeByInput(24, [metaitem('dustCertusQuartz')], [fluid('distilled_water') * 50])


AUTOCLAVE.recipeBuilder()
        .inputs(ore('dustCertusQuartz'))
        .fluidInputs(fluid('water') * 250)
        .outputs(item('gregtech:meta_gem', 214))
        .EUt(30)
        .duration(80)
        .buildAndRegister()

furnace.removeByOutput(item('appliedenergistics2:material', 5))

// Fix security station
crafting.removeByOutput(item('appliedenergistics2:security_station'))

crafting.addShaped(item('appliedenergistics2:security_station'), [
        [ore('plateIron'), item('appliedenergistics2:chest'), ore('plateIron')],
        [item('appliedenergistics2:part', 16), item('appliedenergistics2:material', 35), item('appliedenergistics2:part', 16)],
        [ore('plateIron'), item('appliedenergistics2:material', 24), ore('plateIron')]
])

crafting.addShaped(item('appliedenergistics2:quantum_ring'), [
        [ore('ingotIron'), item('appliedenergistics2:material', 22), ore('ingotIron')],
        [item('appliedenergistics2:material', 24), item('appliedenergistics2:energy_cell'), item('appliedenergistics2:material', 35)],
        [ore('ingotIron'), item('appliedenergistics2:material', 22), ore('ingotIron')]
])

crafting.removeByOutput(item('appliedenergistics2:part', 222))

crafting.addShapeless(item('appliedenergistics2:part', 222), [item('gregtech:meta_item_1', 292), item('appliedenergistics2:part', 220)])


// Alt For Presses

LASER_ENGRAVER.recipeBuilder()
        .inputs([ore('plateAluminium')])
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('appliedenergistics2:material', 19))
        .duration(160)
        .EUt(30)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs([ore('plateAluminium')])
        .notConsumable(ore('lensRuby'))
        .outputs(item('appliedenergistics2:material', 15))
        .duration(160)
        .EUt(30)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs([ore('plateStainlessSteel')])
        .notConsumable(ore('craftingLensWhite'))
        .outputs(item('appliedenergistics2:material', 13))
        .duration(160)
        .EUt(30)
        .buildAndRegister()

LASER_ENGRAVER.recipeBuilder()
        .inputs([ore('plateStainlessSteel')])
        .notConsumable(ore('lensRuby'))
        .outputs(item('appliedenergistics2:material', 14))
        .duration(160)
        .EUt(30)
        .buildAndRegister()

//TODO: Not sure which Curium plate to use
crafting.addShaped(item('appliedenergistics2:material', 59), [
        [ore('plateDenseStarmetalAlloy'), item('appliedenergistics2:material', 41), ore('plateDenseStarmetalAlloy')],
        [item('gregtech:meta_item_1', 236), item('gregtech:meta_item_1', 206), item('gregtech:meta_item_1', 221)],
        [ore('plateDenseStarmetalAlloy'), item('gcyl:meta_plate', 8), ore('plateDenseStarmetalAlloy')]
])


// NAE2
// Void Cell
ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:material', 36) * 1, item('appliedenergistics2:material', 44) * 4, ore('plateSteel') * 4, item('trashcans:item_trash_can')])
        .outputs([item('nae2:material')])
        .duration(600)
        .EUt(120)
        .buildAndRegister()

// Item Storage Cells
// 256k
// Skip
ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('plateTungstenSteel') * 4, ore('gemExquisiteDiamond') * 4, metaitem('stem_cells') * 4, ore('circuitIv')])
        .outputs([item('nae2:material', 1)])
        .duration(300)
        .EUt(7680)
        .buildAndRegister()

// From 64k
ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('plateTungstenSteel') * 4, ore('crystalPureCertusQuartz') * 4, ore('circuitIv'), item('appliedenergistics2:material', 38) * 3])
        .outputs([item('nae2:material', 1)])
        .duration(300)
        .EUt(7680)
        .buildAndRegister()

// 1024k
ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('plateRhodiumPlatedPalladium') * 4, ore('circuitMaster'), ore('gemExquisiteDiamond') * 4, metaitem('stem_cells') * 4, item('nae2:material', 1) * 3])
        .outputs([item('nae2:material', 2)])
        .duration(300)
        .EUt(30720)
        .buildAndRegister()

// 4096k
ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('plateOsmiridium') * 4, ore('circuitZpm'), ore('gemExquisiteDiamond') * 4, metaitem('stem_cells') * 4, item('nae2:material', 2) * 3])
        .outputs([item('nae2:material', 3)])
        .duration(300)
        .EUt(122800)
        .buildAndRegister()

// 16384k
ASSEMBLER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('plateTritanium') * 4, ore('circuitSuperconductor'), ore('gemExquisiteDiamond') * 4, item('gregtech:meta_item_1', 708) * 4, item('nae2:material', 3) * 3])
        .outputs([item('nae2:material', 4)])
        .duration(300)
        .EUt(491520)
        .buildAndRegister()

// Fluid Storage Cells
// 256k
// Skip
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs([ore('plateTungstenSteel') * 4, ore('gemExquisiteDiamond') * 4, metaitem('stem_cells') * 4, ore('dyeBlue') * 3])
        .outputs([item('nae2:material', 5)])
        .duration(300)
        .EUt(7680)
        .buildAndRegister()

// From 64k
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs([ore('plateTungstenSteel') * 4, ore('circuitIv'), ore('dyeBlue') * 4, item('appliedenergistics2:material', 57) * 3])
        .outputs([item('nae2:material', 5)])
        .duration(300)
        .EUt(76800)
        .buildAndRegister()

// 1024k
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs([ore('plateRhodiumPlatedPalladium') * 4, ore('circuitMaster'), ore('dyeBlue') * 4, metaitem('stem_cells') * 4, item('nae2:material', 5) * 3])
        .outputs([item('nae2:material', 6)])
        .duration(300)
        .EUt(30720)
        .buildAndRegister()

// 4096k
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs([ore('plateOsmiridium') * 4, ore('circuitZpm'), ore('dyeBlue') * 4, metaitem('stem_cells') * 4, item('nae2:material', 6) * 3])
        .outputs([item('nae2:material', 7)])
        .duration(300)
        .EUt(122800)
        .buildAndRegister()

// 16384k
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs([ore('plateTritanium') * 4, ore('circuitSuperconductor'), ore('dyeBlue') * 4, item('gregtech:meta_item_1', 708) * 4, item('nae2:material', 7) * 3])
        .outputs([item('nae2:material', 8)])
        .duration(300)
        .EUt(491520)
        .buildAndRegister()

// Co-Processors
// 4x
ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:crafting_accelerator') * 2, ore('circuitEv') * 4, item('appliedenergistics2:material', 23) * 2, ore('plateTitanium') * 8])
        .outputs([item('nae2:coprocessor_4x')])
        .duration(600)
        .EUt(1920)
        .buildAndRegister()

// 16x
ASSEMBLER.recipeBuilder()
        .inputs([item('nae2:coprocessor_4x') * 2, ore('circuitMaster') * 4, item('appliedenergistics2:material', 23) * 2, ore('plateRhodiumPlatedPalladium') * 8])
        .outputs([item('nae2:coprocessor_16x')])
        .duration(600)
        .EUt(30720)
        .buildAndRegister()

// 64x
ASSEMBLER.recipeBuilder()
        .inputs([item('nae2:coprocessor_16x') * 2, ore('circuitSuperconductor') * 4, item('appliedenergistics2:material', 23) * 2, ore('plateTritanium') * 8])
        .outputs([item('nae2:coprocessor_64x')])
        .duration(600)
        .EUt(491520)
        .buildAndRegister()

// Pattern Multi-Tool
ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:material', 52) * 8, item('appliedenergistics2:material', 24) * 2, ore('itemIlluminatedPanel') * 1, item('appliedenergistics2:material', 23) * 2, ore('plateStainlessSteel') * 16])
        .outputs([item('nae2:pattern_multiplier') * 1])
        .duration(1200)
        .EUt(480)
        .buildAndRegister()

// ME Beam Former
ASSEMBLER.recipeBuilder()
        .inputs([ore('plateGlowstone') * 8, item('appliedenergistics2:material', 41) * 2, item('appliedenergistics2:quartz_glass') * 2, item('appliedenergistics2:material', 23) * 2, ore('plateStainlessSteel') * 2])
        .outputs([item('nae2:part') * 2])
        .duration(300)
        .EUt(480)
        .buildAndRegister()

// Hyper-Acceleration Card
ASSEMBLER.recipeBuilder()
        .inputs([item('appliedenergistics2:material', 30) * 4, item('appliedenergistics2:material', 23) * 2, item('appliedenergistics2:quartz_glass') * 3, item('appliedenergistics2:material', 47) * 2])
        .outputs([item('nae2:upgrade')])
        .duration(450)
        .EUt(1920)
        .buildAndRegister()

// Extracells To NAE2 Cells conversion
crafting.addShapeless(item('nae2:material', 5), [item('extracells:storage.component', 8)])
crafting.addShapeless(item('nae2:material', 1), [item('extracells:storage.component')])
crafting.addShapeless(item('nae2:material', 2), [item('extracells:storage.component', 1)])
crafting.addShapeless(item('nae2:material', 3), [item('extracells:storage.component', 2)])
crafting.addShapeless(item('nae2:material', 4), [item('extracells:storage.component', 3)])

// ME fluid asembler
crafting.addShapeless(item('ae2fc:fluid_assembler'), [item('extracells:fluidcrafter')])
crafting.removeByOutput(item('extracells:fluidcrafter'))

// TODO
// //Mark all items a depreciated
// val ae4 as IMod = loadedMods["extracells"];
// val ae4Items as IItemStack[] = ae4.items;
// for item in ae4Items {
//     item.addTooltip("§4DEPRECIATED WILL BE REMOVED NEXT UPDATE");
//
//         if(item.displayName has "Storage Cell") {
//             item.addTooltip("§buse a ME I/O port to dump contents into new cells. Then you can shift right with the empty cell in your hand to get back the part for conversion");
//     }
//
// }

ASSLINE.recipeBuilder()
       .inputs(ore('plateDenseDraconium') * 8)
       .inputs(ore('plateEnrichedNaquadahAlloy') * 8)
       .inputs(item('appliedenergistics2:dense_energy_cell') * 64)
       .inputs(ore('wireGtSingleUvSuperconductor') * 32)
       .inputs(ore('circuitUv') * 2)
       .fluidInputs(fluid('tritanium') * 720)
       .fluidInputs(fluid('soldering_alloy') * 1296)
       .outputs(item('appliedenergistics2:creative_energy_cell'))
       .duration(1000)
       .EUt(524288)
       .buildAndRegister()


ASSLINE.recipeBuilder()
       .inputs(item('thermalfoundation:upgrade', 256))
       .inputs(item('storagedrawers:upgrade_creative'))
       .inputs(item('draconicevolution:draconium_capacitor', 2))
       .inputs(metaitem('tjceu:crystal.refined_chaos') * 64)
       .inputs(metaitem('tjceu:crystal.refined_chaos') * 64)
       .inputs(metaitem('tjceu:ban.certificate'))
       .inputs(ore('circuitMax'))
       .inputs(metaitem('gcyl:field.generator.max') * 4)
       .inputs(metaitem('tjceu:crystal.eternity') * 4)
       .inputs(item('draconicadditions:chaos_stabilizer_core'))
//        .inputs(item('gregtech:meta_item_2:32715')) TODO: supra solar panel
//        .inputs(item('gtadditions:ga_cell_casing', 11) * 64) TODO: MAX capacitor
//        .inputs(item('gtadditions:ga_cell_casing', 11) * 64)
//        .inputs(item('gtadditions:ga_cell_casing', 11) * 14)
       .inputs(metaitem('gcym:tiered_hatch.max'))
       .inputs(item('nae2:material', 4) * 64)
       .fluidInputs(fluid('chaosalloy') * 11520)
       .outputs(item('appliedenergistics2:creative_storage_cell'))
       .duration(2147483647)
       .EUt(1)
       .buildAndRegister()

crafting.addShaped(item('appliedenergistics2:quartz_glass') * 4, [
        [ore('dustCertusQuartz'), ore('blockGlassColorless'), ore('dustCertusQuartz')],
        [ore('blockGlassColorless'), null, ore('blockGlassColorless')],
        [ore('dustCertusQuartz'), ore('blockGlassColorless'), ore('dustCertusQuartz')]
])

crafting.addShaped(item('appliedenergistics2:quartz_glass') * 4, [
        [ore('dustNetherQuartz'), ore('blockGlassColorless'), ore('dustNetherQuartz')],
        [ore('blockGlassColorless'), null, ore('blockGlassColorless')],
        [ore('dustNetherQuartz'), ore('blockGlassColorless'), ore('dustNetherQuartz')]
])
