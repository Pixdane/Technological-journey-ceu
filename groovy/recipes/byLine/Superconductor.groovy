ASSEMBLER = recipemap('assembler')

// LV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(metaitem('gcyl:wireGtSingleLvSuperconductorBase') * 9, ore('pipeTinyFluidSteel'), metaitem('electric.pump.lv'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 3000)
        .outputs(metaitem('gcyl:wireGtSingleLvSuperconductor') * 9)
        .duration(120)
        .EUt(32)
        .buildAndRegister()

// MV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(metaitem('gcyl:wireGtSingleMvSuperconductorBase') * 9, ore('pipeTinyFluidStainlessSteel'), metaitem('electric.pump.mv'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 3000)
        .outputs(metaitem('gcyl:wireGtSingleMvSuperconductor') * 9)
        .duration(120)
        .EUt(128)
        .buildAndRegister()

// HV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(metaitem('gcyl:wireGtSingleHvSuperconductorBase') * 9, ore('pipeTinyFluidTitanium'), metaitem('electric.pump.hv'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 3000)
        .outputs(metaitem('gcyl:wireGtSingleHvSuperconductor') * 9)
        .duration(120)
        .EUt(512)
        .buildAndRegister()

// EV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(metaitem('gcyl:wireGtSingleEvSuperconductorBase') * 18, ore('pipeTinyFluidTungstenSteel') * 6, metaitem('electric.pump.ev') * 2)
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 3000)
        .outputs(metaitem('gcyl:wireGtSingleEvSuperconductor') * 18)
        .duration(120)
        .EUt(2048)
        .buildAndRegister()

// IV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(metaitem('gcyl:wireGtSingleIvSuperconductorBase') * 12, ore('pipeTinyFluidNiobiumTitanium') * 4, metaitem('electric.pump.iv'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 4000)
        .outputs(metaitem('gcyl:wireGtSingleIvSuperconductor') * 12)
        .duration(120)
        .EUt(8192)
        .buildAndRegister()

// LuV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(metaitem('gcyl:wireGtSingleLuvSuperconductorBase') * 16, ore('pipeTinyFluidEnderium') * 5, metaitem('electric.pump.luv'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 4000)
        .outputs(metaitem('gcyl:wireGtSingleLuvSuperconductor') * 16)
        .duration(120)
        .EUt(32768)
        .buildAndRegister()

// ZPM
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(metaitem('gcyl:wireGtSingleZpmSuperconductorBase') * 32, ore('pipeTinyFluidNaquadah') * 6, metaitem('electric.pump.zpm'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 8000)
        .outputs(metaitem('gcyl:wireGtSingleZpmSuperconductor') * 32)
        .duration(120)
        .EUt(131072)
        .buildAndRegister()

// UV
ASSEMBLER.recipeBuilder()
        .circuitMeta(2)
        .inputs(metaitem('gcyl:wireGtSingleUvSuperconductorBase') * 64, ore('pipeTinyFluidUltimet') * 7, metaitem('electric.pump.uv'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 10000)
        .outputs(metaitem('gcyl:wireGtSingleUvSuperconductor') * 64)
        .duration(120)
        .EUt(524288)
        .buildAndRegister()
