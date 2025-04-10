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

//TODO: from OtherRecipes

// Utils.removeRecipeByOutput(wiremill, [item('gregtech:cable', 516)], [], false)
// Utils.removeRecipeByOutput(extruder, [item('gregtech:cable', 516)], [], false)


// MIXER.recipeBuilder()
//         .inputs(ore('dustGallium') * 2)
//         .inputs(ore('dustSolderingAlloy') * 10)
//         .outputs(item('gregtech:meta_item_1:2517') * 12)
//         .duration(240)
//         .EUt(30)
//         .buildAndRegister()

// EBF.recipeBuilder()
//         .inputs(item('gregtech:meta_item_1:2517'))
//         .outputs(item('gregtech:meta_item_1:10517'))
//         .blastFurnaceTemp(1800) //this is a minimal temperature at which the item will be smelted
//         .duration(40)
//         .EUt(16)
//         .buildAndRegister()

// ASSEMBLER.recipeBuilder()
//         .inputs(item('gregtech:cable', 517) * 3)
//         .inputs(metaitem('electric.pump.lv') * 2)
//         .inputs(item('gregtech:fluid_pipe', 184))
//         .circuitMeta(1)
//         .fluidInputs(fluid('nitrogen') * 1000)
//         .outputs(item('gregtech:cable', 516) * 3)
//         .duration(350)
//         .EUt(30)
//         .buildAndRegister()


// furnace.removeByOutput(ore('ingotLvSuperconductor'))
// furnace.removeByOutput(item('gregtech:meta_item_1:10517'))

// EBF.recipeBuilder()
//         .inputs(ore('dustLvSuperconductor'))
//         .outputs(ore('ingotLvSuperconductor'))
//         .blastFurnaceTemp(1800) //this is a minimal temperature at which the item will be smelted
//         .duration(350)
//         .EUt(500)
//         .buildAndRegister()


// chemreactor.findRecipe(1920, [item('gregtech:meta_item_1', 569), item('gregtech:cable:5354') * 8], null).remove()
// large_chem.findRecipe(1920, [item('gregtech:meta_item_1', 569), item('gregtech:cable:5354') * 8], null).remove()