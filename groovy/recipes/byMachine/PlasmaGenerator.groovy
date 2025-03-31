PLASMA_GENERATOR = recipemap('plasma_generator')

// Oxygen Gas * 1
mods.gregtech.plasma_generator.removeByInput(2048, null, [fluid('plasma.oxygen')])

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.oxygen') * 1)
        .fluidOutputs(fluid('oxygen') * 1)
        .duration(64)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.radon') * 1)
        .fluidOutputs(fluid('radon') * 1)
        .duration(96)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.carbon') * 1)
        .fluidOutputs(fluid('liquid.carbon') * 1)
        .duration(96)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.neon') * 1)
        .fluidOutputs(fluid('neon') * 1)
        .duration(48)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.magnesium') * 1)
        .fluidOutputs(fluid('liquid.magnesium') * 1)
        .duration(48)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.silicon') * 1)
        .fluidOutputs(fluid('liquid.silicon') * 1)
        .duration(48)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.sulfur') * 1)
        .fluidOutputs(fluid('liquid.sulfur') * 1)
        .duration(48)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.calcium') * 1)
        .fluidOutputs(fluid('liquid.calcium') * 1)
        .duration(40)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.titanium_44') * 1)
        .fluidOutputs(fluid('titanium_44') * 1)
        .duration(40)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.chromium_48') * 1)
        .fluidOutputs(fluid('chromium_48') * 1)
        .duration(40)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.titanium') * 1)
        .fluidOutputs(fluid('liquid.titanium') * 1)
        .duration(40)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.iron_52') * 1)
        .fluidOutputs(fluid('iron_52') * 1)
        .duration(40)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.nickel_56') * 1)
        .fluidOutputs(fluid('nickel_56') * 1)
        .duration(40)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.helium_rich_cno') * 1)
        .fluidOutputs(fluid('helium_rich_cno') * 1)
        .duration(60)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.chaos') * 144)
        .fluidOutputs(fluid('chaos') * 1)
        .duration(20)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.awaken_draconium') * 144)
        .fluidOutputs(fluid('awaken_draconium') * 144)
        .duration(40)
        .EUt(2048)
        .buildAndRegister();

PLASMA_GENERATOR.recipeBuilder()
        .fluidInputs(fluid('plasma.chaosalloy') * 144)
        .fluidOutputs(fluid('chaosalloy') * 144)
        .duration(80)
        .EUt(2048)
        .buildAndRegister();
