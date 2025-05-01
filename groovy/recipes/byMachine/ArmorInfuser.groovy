ARMOR_INFUSION = recipemap('armor_infusion')

// Voltage
basicVoltage = 524288
wyvernVoltage = 2097152
draconicVoltage = 8388608
chaoticVoltage = 33554432

duration = 150
coolingfluid = fluid('supercooled_cryotheum')
heatedfluid = fluid('cryotheum')
basicFluidCost = 1000
wyvernFluidCost = 2000
draconicFluidCost = 3000
chaoticFluidCost = 4000

shieldC = item('draconicevolution:tool_upgrade', 8)
shieldR = item('draconicevolution:tool_upgrade', 9)
capacity = item('draconicevolution:tool_upgrade')
jump = item('draconicevolution:tool_upgrade', 11)

// Tool
speed = item('draconicevolution:tool_upgrade', 1)
AOE = item('draconicevolution:tool_upgrade', 2)
AAOE = item('draconicevolution:tool_upgrade', 4)
damage = item('draconicevolution:tool_upgrade', 3)

// Arrow
draw = item('draconicevolution:tool_upgrade', 6)
aSpeed = item('draconicevolution:tool_upgrade', 7)
aDamage = item('draconicevolution:tool_upgrade', 5)

basicItem1 = item('minecraft:golden_apple', 1)
basicItem2 = metaitem('gcyl:plateDoubleAdamantium')
basicItem3 = metaitem('quantumeye')
basicItem4 = item('draconicevolution:draconic_core')

wyvernItem1 = metaitem('gravistar')
wyvernItem2 = item('draconicevolution:draconic_core')
wyvernItem3 = metaitem('gcyl:plateDoubleDraconium')
wyvernItem3 = metaitem('plateDoubleSteel')
wyvernItem4 = item('draconicevolution:wyvern_core')

draconicItem1 = metaitem('gcyl:unstable.star')
draconicItem2 = item('draconicevolution:wyvern_core')
draconicItem3 = metaitem('gcyl:plateDoubleAwakenDraconium')
draconicItem3 = metaitem('plateDoubleSteel')
draconicItem4 = item('draconicevolution:awakened_core')

chaoticItem1 = metaitem('tjceu:crystal.refined_chaos')
chaoticItem2 = item('draconicevolution:chaotic_core')
chaoticItem3 = item('draconicadditions:chaotic_energy_core')
chaoticItem4 = metaitem('gcyl:plateDoubleChaos')
chaoticItem4 = metaitem('plateDoubleSteel')

draconicTools = [item('draconicevolution:draconic_pick'), item('draconicevolution:draconic_shovel'), item('draconicevolution:draconic_axe')]
wyvernTools = [item('draconicevolution:wyvern_pick'), item('draconicevolution:wyvern_shovel'), item('draconicevolution:wyvern_axe')]


for (i in 0..2) {
    ARMOR_INFUSION.recipeBuilder()
            .inputs(item('draconicevolution:awakened_core') * 2, item('draconicevolution:draconic_energy_core') * 2, (wyvernTools[i]))
            .outputs((draconicTools[i].withNbt(DEUpgrades: [digSpeed: 0 as byte, digAOE: 0 as byte, rfCap: 0 as byte], Energy: 0)))
            .fluidInputs(coolingfluid * draconicFluidCost)
            .fluidOutputs(heatedfluid * draconicFluidCost)
            .duration(duration)
            .EUt(draconicVoltage)
            .buildAndRegister()
}

ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core') * 2, item('draconicevolution:draconic_energy_core') * 2, item('minecraft:diamond_hoe'))
        .outputs(item('draconicevolution:draconic_hoe').withNbt(DEUpgrades: [digAOE: 0 as byte, rfCap: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister()

// Battery
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core') * 4, item('draconicevolution:draconic_energy_core') * 4, item('draconicevolution:draconium_capacitor'))
        .outputs(item('draconicevolution:draconium_capacitor', 1).withNbt(DEUpgrades: [rfCap: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister()

ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core') * 2, item('draconicevolution:draconic_energy_core') * 2, item('draconicevolution:draconic_shovel'), item('draconicevolution:draconic_sword'), item('draconicevolution:draconic_pick'))
        .outputs(item('draconicevolution:draconic_staff_of_power').withNbt(DEUpgrades: [attackDmg: 0 as byte, digSpeed: 0 as byte, digAOE: 0 as byte, rfCap: 0 as byte, attackAOE: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister()

ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:chaotic_core') * 2, item('draconicadditions:chaotic_energy_core') * 2, metaitem('tjceu:crystal.refined_chaos') * 4, item('draconicevolution:draconic_staff_of_power'))
        .outputs(item('draconicadditions:chaotic_staff_of_power').withNbt(DEUpgrades: [attackDmg: 0 as byte, digSpeed: 0 as byte, digAOE: 0 as byte, rfCap: 0 as byte, attackAOE: 0 as byte], Energy: 0, isStable: 1 as byte))
        .fluidInputs(coolingfluid * chaoticFluidCost)
        .fluidOutputs(heatedfluid * chaoticFluidCost)
        .duration(duration)
        .EUt(chaoticVoltage)
        .buildAndRegister()

ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:chaotic_core') * 2, item('draconicadditions:chaotic_energy_core') * 2, metaitem('tjceu:crystal.refined_chaos') * 4, item('draconicevolution:draconic_bow'))
        .outputs(item('draconicadditions:chaotic_bow').withNbt(DEUpgrades: [arrowDmg: 0 as byte, arrowSpeed: 0 as byte, drawSpeed: 0 as byte, rfCap: 0 as byte], Energy: 0, isStable: 1 as byte))
        .fluidInputs(coolingfluid * chaoticFluidCost)
        .fluidOutputs(heatedfluid * chaoticFluidCost)
        .duration(duration)
        .EUt(chaoticVoltage)
        .buildAndRegister()

ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core') * 2, item('draconicevolution:draconic_energy_core') * 2, item('draconicevolution:wyvern_sword'))
        .outputs(item('draconicevolution:draconic_sword').withNbt(DEUpgrades: [attackDmg: 0 as byte, rfCap: 0 as byte, attackAOE: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister()

ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core') * 2, item('draconicevolution:draconic_energy_core') * 2, item('draconicevolution:wyvern_bow'))
        .outputs(item('draconicevolution:draconic_bow').withNbt(DEUpgrades: [arrowDmg: 0 as byte, arrowSpeed: 0 as byte, drawSpeed: 0 as byte, rfCap: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister()

// Wyvern to dracon armor
// Head
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core') * 2, item('draconicevolution:draconic_energy_core') * 2, item('draconicevolution:wyvern_helm'))
        .outputs(item('draconicevolution:draconic_helm').withNbt(DEUpgrades: [shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister()

// Chest
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core') * 2, item('draconicevolution:draconic_energy_core') * 2, item('draconicevolution:wyvern_chest'))
        .outputs(item('draconicevolution:draconic_chest').withNbt(DEUpgrades: [shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister()

// Leg
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core') * 2, item('draconicevolution:draconic_energy_core') * 2, item('draconicevolution:wyvern_legs'))
        .outputs(item('draconicevolution:draconic_legs').withNbt(DEUpgrades: [moveSpeed: 0 as byte, shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister()

// Boot
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core') * 2, item('draconicevolution:draconic_energy_core') * 2, item('draconicevolution:wyvern_boots'))
        .outputs(item('draconicevolution:draconic_boots').withNbt(DEUpgrades: [shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte, jumpBoost: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister()

// Dracon to chaotic armor
// Head
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:chaotic_core') * 2, item('draconicadditions:chaotic_energy_core') * 2, metaitem('tjceu:crystal.refined_chaos') * 4, item('draconicevolution:draconic_helm'))
        .outputs(item('draconicadditions:chaotic_helm').withNbt(DEUpgrades: [shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte], Energy: 0, isStable: 1 as byte))
        .fluidInputs(coolingfluid * chaoticFluidCost)
        .fluidOutputs(heatedfluid * chaoticFluidCost)
        .duration(duration)
        .EUt(chaoticVoltage)
        .buildAndRegister()

// Chest
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:chaotic_core') * 2, item('draconicadditions:chaotic_energy_core') * 2, metaitem('tjceu:crystal.refined_chaos') * 4, item('draconicevolution:draconic_chest'))
        .outputs(item('draconicadditions:chaotic_chest').withNbt(DEUpgrades: [attackDmg: 0 as byte, shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte], Energy: 0, isStable: 1 as byte))
        .fluidInputs(coolingfluid * chaoticFluidCost)
        .fluidOutputs(heatedfluid * chaoticFluidCost)
        .duration(duration)
        .EUt(chaoticVoltage)
        .buildAndRegister()

// Leg
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:chaotic_core') * 2, item('draconicadditions:chaotic_energy_core') * 2, metaitem('tjceu:crystal.refined_chaos') * 4, item('draconicevolution:draconic_legs'))
        .outputs(item('draconicadditions:chaotic_legs').withNbt(DEUpgrades: [moveSpeed: 0 as byte, shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte], Energy: 0, isStable: 1 as byte))
        .fluidInputs(coolingfluid * chaoticFluidCost)
        .fluidOutputs(heatedfluid * chaoticFluidCost)
        .duration(duration)
        .EUt(chaoticVoltage)
        .buildAndRegister()

// Boot
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:chaotic_core') * 2, item('draconicadditions:chaotic_energy_core') * 2, metaitem('tjceu:crystal.refined_chaos') * 4, item('draconicevolution:draconic_boots'))
        .outputs(item('draconicadditions:chaotic_boots').withNbt(DEUpgrades: [shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte, jumpBoost: 0 as byte], Energy: 0, isStable: 1 as byte))
        .fluidInputs(coolingfluid * chaoticFluidCost)
        .fluidOutputs(heatedfluid * chaoticFluidCost)
        .duration(duration)
        .EUt(chaoticVoltage)
        .buildAndRegister()
