package recipes.byLine

import classes.utils.TJUtility.Tier

import static classes.utils.TJUtility.*

ASSEMBLER = recipemap('assembler')
ASSLINE = recipemap('assembly_line')

// Primitive Alloy Smelter
crafting.shapedBuilder()
        .row('BMB')
        .row('M P')
        .row('BPB')
        .key('B', item('gregtech:metal_casing', 1))
        .key('M', metaitem('tjceu:steam.motor.ulv'))
        .key('P', metaitem('tjceu:steam.piston.ulv'))
        .output(metaitem('tjceu:primitive_alloy_smelter'))
        .register()

// Armor Infuser
ASSLINE.recipeBuilder()
        .inputs(ore('screwStaballoy') * 18)
        .inputs(ore('plateRutherfordium') * 10)
        .inputs(ore('cableGtSingleNaquadahAlloy') * 10)
        .inputs(ore('plateDraconium') * 5)
        .inputs(metaitem('robot.arm.luv') * 2)
        .inputs(metaitem('fusion_reactor.zpm'))
        .fluidInputs(fluid('dubnium') * 1296)
        .fluidInputs(fluid('californium') * 2592)
        .outputs(metaitem('tjceu:armor_infuser'))
        .duration(600)
        .EUt(7864329)   // TODO: magic number
        .buildAndRegister()

// Chaos Replicator
ASSLINE.recipeBuilder()
        .inputs(ore('plateLafium') * 10)
        .inputs(ore('plateHastelloyk243') * 10)
        .inputs(ore('plateHastelloyx78') * 10)
        .inputs(ore('plateAwakenDraconium') * 10)
        .inputs(ore('cableGtSinglePikyonium') * 10)
        .inputs(ore('plateHdcs') * 5)
        .inputs(item('draconicevolution:awakened_core') * 2)
        .inputs(metaitem('hull.uev'))
        .inputs(metaitem('robot.arm.uev'))
        .inputs(ore('circuitUev'))
        .fluidInputs(fluid('titan_steel') * 1296)
        .fluidInputs(fluid('mendelevium') * 2592)
        .fluidInputs(fluid('cinobite') * 1296)
        .duration(600)
        .EUt(2097152)   // TODO: magic number
        .outputs(metaitem('tjceu:chaos_replicator'))
        .buildAndRegister()

// Dagon Egg Replicator
ASSLINE.recipeBuilder()
        .inputs(ore('plateTantalumHafniumSeaborgiumCarbide') * 10)
        .inputs(ore('plateDraconium') * 10)
        .inputs(ore('plateAwakenDraconium') * 10)
        .inputs(ore('cableGtSingleTungstenTitaniumCarbide') * 10)
        .inputs(metaitem('hull.uhv'))
        .inputs(ore('circuitUhv'))
        .inputs(metaitem('gcyl:red_halide_lamp'))
        .inputs(metaitem('sensor.uhv'))
        .fluidInputs(fluid('incoloy_ma_956') * 1296)
        .fluidInputs(fluid('einsteinium') * 2592)
        .duration(600)
        .EUt(7864320)   // TODO: magic number
        .outputs(metaitem('tjceu:dragon_egg_replicator'))
        .buildAndRegister()

// Large Powered Spawner
ASSLINE.recipeBuilder()
        .inputs(item('enderio:block_powered_spawner') * 16)
        .inputs(ore('plateCurium') * 12)
        .inputs(ore('cableGtQuadrupleNiobiumTitanium') * 8)
        .inputs(item('tjceu:multiblock_casing', 3) * 4)
        .inputs(ore('circuitZpm') * 2)
        .inputs(metaitem('field.generator.luv') * 2)
        .inputs(item('enderio:item_capacitor_stellar') * 2)
        .inputs(metaitem('emitter.luv') * 2)
        .inputs(metaitem('robot.arm.luv') * 2)
        .inputs(metaitem('electric.pump.luv') * 2)
        .inputs(metaitem('hull.luv'))
        .fluidInputs(fluid('soldering_alloy') * 576)
        .fluidInputs(fluid('hssg') * 2304)
        .fluidInputs(fluid('soularium') * 2304)
        .duration(800)
        .EUt(30000)
        .outputs(metaitem('tjceu:large_powered_spawner'))
        .buildAndRegister()

// Large Vial Processor
ASSLINE.recipeBuilder()
        .inputs(metaitem('tjceu:vial_processor.hv') * 16)
        .inputs(ore('plateCurium') * 12)
        .inputs(ore('cableGtQuadrupleNiobiumTitanium') * 8)
        .inputs(item('tjceu:multiblock_casing', 3) * 4)
        .inputs(ore('circuitZpm') * 2)
        .inputs(metaitem('field.generator.luv') * 2)
        .inputs(item('enderio:item_capacitor_stellar') * 2)
        .inputs(metaitem('conveyor.module.luv') * 2)
        .inputs(metaitem('electric.piston.luv') * 2)
        .inputs(metaitem('sensor.luv') * 2)
        .inputs(metaitem('hull.luv'))
        .fluidInputs(fluid('soldering_alloy') * 576)
        .fluidInputs(fluid('hssg') * 2304)
        .fluidInputs(fluid('soularium') * 2304)
        .duration(800)
        .EUt(30000)
        .outputs(metaitem('tjceu:large_vial_processor'))
        .buildAndRegister()

// Tiering Machines
Tier.TR.each { tier ->

    if (tier < Tier.LuV) {

        // Vial Processors
        crafting.shapedBuilder()
                .name(tjceu("tjceu.machine.vial_processor.${tier.lc()}"))
                .row('VKV')
                .row('SHR')
                .row('PPP')
                .key('V', item('enderio:item_soul_vial'))
                .key('K', tier.pipeNormal())
                .key('S', tier.sensor())
                .key('R', tier.robotArm())
                .key('H', tier.hull())
                .key('P', tier.plateDouble())
                .output(metaitem("tjceu:vial_processor.${tier.lc()}"))
                .register()

        // Gardening Greenhouses
        crafting.shapedBuilder()
                .name(tjceu("tjceu.gardening_greenhouse.${tier.lc()}"))
                .row('GGG')
                .row('RHR')
                .row('CWC')
                .key('G', tier.glass())
                .key('R', tier.robotArm())
                .key('H', tier.hull())
                .key('C', tier.circuit())
                .key('W', tier.cable())
                .output(metaitem("tjceu:gardening_greenhouse.${tier.lc()}"))
                .register()
    }

}