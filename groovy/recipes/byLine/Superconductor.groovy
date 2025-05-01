package recipes.byLine

ASSEMBLER = recipemap('assembler')
MIXER = recipemap('mixer')
EBF = recipemap('electric_blast_furnace')

// LV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(ore('wireGtSingleLvSuperconductorBase') * 9)
        .inputs(ore('pipeTinyFluidSteel'))
        .inputs(metaitem('electric.pump.lv'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 3000)
        .outputs(metaitem('gcyl:wireGtSingleLvSuperconductor') * 9)
        .duration(120)
        .EUt(32)
        .buildAndRegister()

// MV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(ore('wireGtSingleMvSuperconductorBase') * 9)
        .inputs(ore('pipeTinyFluidStainlessSteel'))
        .inputs(metaitem('electric.pump.mv'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 3000)
        .outputs(metaitem('gcyl:wireGtSingleMvSuperconductor') * 9)
        .duration(120)
        .EUt(128)
        .buildAndRegister()

// HV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(ore('wireGtSingleHvSuperconductorBase') * 9)
        .inputs(ore('pipeTinyFluidTitanium'))
        .inputs(metaitem('electric.pump.hv'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 3000)
        .outputs(metaitem('gcyl:wireGtSingleHvSuperconductor') * 9)
        .duration(120)
        .EUt(512)
        .buildAndRegister()

// EV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(ore('wireGtSingleEvSuperconductorBase') * 18)
        .inputs(ore('pipeTinyFluidTungstenSteel') * 6)
        .inputs(metaitem('electric.pump.ev') * 2)
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 3000)
        .outputs(metaitem('gcyl:wireGtSingleEvSuperconductor') * 18)
        .duration(120)
        .EUt(2048)
        .buildAndRegister()

// IV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(ore('wireGtSingleIvSuperconductorBase') * 12)
        .inputs(ore('pipeTinyFluidNiobiumTitanium') * 4)
        .inputs(metaitem('electric.pump.iv'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 4000)
        .outputs(metaitem('gcyl:wireGtSingleIvSuperconductor') * 12)
        .duration(120)
        .EUt(8192)
        .buildAndRegister()

// LuV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(ore('wireGtSingleLuvSuperconductorBase') * 16)
        .inputs(ore('pipeTinyFluidEnderium') * 5)
        .inputs(metaitem('electric.pump.luv'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 4000)
        .outputs(metaitem('gcyl:wireGtSingleLuvSuperconductor') * 16)
        .duration(120)
        .EUt(32768)
        .buildAndRegister()

// ZPM
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(ore('wireGtSingleZpmSuperconductorBase') * 32)
        .inputs(ore('pipeTinyFluidNaquadah') * 6)
        .inputs(metaitem('electric.pump.zpm'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 8000)
        .outputs(metaitem('gcyl:wireGtSingleZpmSuperconductor') * 32)
        .duration(120)
        .EUt(131072)
        .buildAndRegister()

// UV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(ore('wireGtSingleUvSuperconductorBase') * 64)
        .inputs(ore('pipeTinyFluidUltimet') * 7)
        .inputs(metaitem('electric.pump.uv'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 10000)
        .outputs(metaitem('gcyl:wireGtSingleUvSuperconductor') * 64)
        .duration(120)
        .EUt(524288)
        .buildAndRegister()

mods.gregtech.wiremill.removeByInput(7, [item('gcyl:meta_ingot', 1158), metaitem('circuit.integrated').withNbt(['Configuration': 1])], null)
mods.gregtech.extruder.removeByInput(42, [item('gcyl:meta_ingot', 1158), metaitem('shape.extruder.wire')], null)

MIXER.recipeBuilder()
        .inputs(ore('dustGallium') * 2)
        .inputs(ore('dustSolderingAlloy') * 10)
        .outputs(metaitem('gcyl:dustLvSuperconductorBase') * 12)
        .duration(240)
        .EUt(30)
        .buildAndRegister()

// LV Superconductor Base Ingot * 1
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('gcyl:dustLvSuperconductorBase')], null)

EBF.recipeBuilder()
        .inputs(ore('dustLvSuperconductorBase'))
        .outputs(metaitem('gcyl:ingotLvSuperconductorBase'))
        .blastFurnaceTemp(1800) //this is a minimal temperature at which the item will be smelted
        .duration(40)
        .EUt(16)
        .buildAndRegister()

furnace.removeByOutput(item('gcyl:meta_ingot', 1158))
mods.futuremc.blast_furnace.removeByOutput(metaitem('gcyl:ingotLvSuperconductor'))
//furnace.removeByOutput(metaitem('gcyl:dustLvSuperconductorBase'))

EBF.recipeBuilder()
        .inputs(ore('dustLvSuperconductor'))
        .outputs(metaitem('gcyl:ingotLvSuperconductor'))
        .blastFurnaceTemp(1800) //this is a minimal temperature at which the item will be smelted
        .duration(350)
        .EUt(500)
        .buildAndRegister()