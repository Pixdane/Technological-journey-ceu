ARMOR_INFUSION = recipemap('armor_infusion')

// Voltage
basicVoltage = 524288;
wyvernVoltage = 2097152;
draconicVoltage = 8388608;
chaoticVoltage = 33554432;

duration = 150;
coolingfluid = fluid('supercooled_cryotheum');
heatedfluid = fluid('cryotheum');
basicFluidCost = 1000;
wyvernFluidCost = 2000;
draconicFluidCost = 3000;
chaoticFluidCost = 4000;

shieldC = item('draconicevolution:tool_upgrade:8');
shieldR = item('draconicevolution:tool_upgrade:9');
capacity = item('draconicevolution:tool_upgrade:0');
jump = item('draconicevolution:tool_upgrade:11');

// Tool
speed = item('draconicevolution:tool_upgrade:1');
AOE = item('draconicevolution:tool_upgrade:2');
AAOE = item('draconicevolution:tool_upgrade:4');
damage = item('draconicevolution:tool_upgrade:3');

// Arrow
draw = item('draconicevolution:tool_upgrade:6');
aSpeed = item('draconicevolution:tool_upgrade:7');
aDamage = item('draconicevolution:tool_upgrade:5');

basicItem1 = item('minecraft:golden_apple:1');
// TODO: plateDoubleAdamantium
// basicItem2 = item('gtadditions:ga_meta_item:1718'); 
basicItem3 = metaitem('quantumeye');
basicItem4 = item('draconicevolution:draconic_core:0');

wyvernItem1 = item('gregtech:meta_item_1:283');
wyvernItem2 = item('draconicevolution:draconic_core:0');
// TODO: plateDoubleDraconium
// wyvernItem3 = item('gtadditions:ga_meta_item:1518');
wyvernItem3 = metaitem('plateDoubleSteel');
wyvernItem4 = item('draconicevolution:wyvern_core:0');

draconicItem1 = item('gcyl:gcyl_meta_item:343');
draconicItem2 = item('draconicevolution:wyvern_core:0');
// TODO: plateDoubleAwakenDraconium
// draconicItem3 = item('gtadditions:ga_meta_item:1519');
draconicItem3 = metaitem('plateDoubleSteel');
draconicItem4 = item('draconicevolution:awakened_core:0');

chaoticItem1 = metaitem('tjceu:crystal.refined_chaos');
chaoticItem2 = item('draconicevolution:chaotic_core:0');
chaoticItem3 = item('draconicadditions:chaotic_energy_core:0');
// TODO: plateDoubleChaos
// chaoticItem4 = item('gtadditions:ga_meta_item:1520');
chaoticItem4 = metaitem('plateDoubleSteel');

draconicTools = [item('draconicevolution:draconic_pick:0'),item('draconicevolution:draconic_shovel:0'),item('draconicevolution:draconic_axe:0')];
wyvernTools = [item('draconicevolution:wyvern_pick:0'),item('draconicevolution:wyvern_shovel:0'),item('draconicevolution:wyvern_axe:0')];


for (i in [0, 1, 2]) {
    ARMOR_INFUSION.recipeBuilder()
            .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2, (wyvernTools[i]))
            .outputs((draconicTools[i].withNbt(DEUpgrades: [digSpeed: 0 as byte, digAOE: 0 as byte, rfCap: 0 as byte], Energy: 0)))
            .fluidInputs(coolingfluid * draconicFluidCost)
            .fluidOutputs(heatedfluid * draconicFluidCost)
            .duration(duration)
            .EUt(draconicVoltage)
            .buildAndRegister();
}

ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2, item('minecraft:diamond_hoe'))
        .outputs(item('draconicevolution:draconic_hoe').withNbt(DEUpgrades: [digAOE: 0 as byte, rfCap: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister();

// Battery
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core:0') * 4, item('draconicevolution:draconic_energy_core:0') * 4, item('draconicevolution:draconium_capacitor:0'))
        .outputs(item('draconicevolution:draconium_capacitor:1').withNbt(DEUpgrades: [rfCap: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister();

ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2, item('draconicevolution:draconic_shovel:0'),item('draconicevolution:draconic_sword:0'),item('draconicevolution:draconic_pick:0'))
        .outputs(item('draconicevolution:draconic_staff_of_power:0').withNbt(DEUpgrades: [attackDmg: 0 as byte, digSpeed: 0 as byte, digAOE: 0 as byte, rfCap: 0 as byte, attackAOE: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister();

ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:chaotic_core:0') * 2, item('draconicadditions:chaotic_energy_core:0') * 2,metaitem('tjceu:crystal.refined_chaos') * 4, item('draconicevolution:draconic_staff_of_power:0'))
        .outputs(item('draconicadditions:chaotic_staff_of_power:0').withNbt(DEUpgrades: [attackDmg: 0 as byte, digSpeed: 0 as byte, digAOE: 0 as byte, rfCap: 0 as byte, attackAOE: 0 as byte], Energy: 0, isStable: 1 as byte))
        .fluidInputs(coolingfluid * chaoticFluidCost)
        .fluidOutputs(heatedfluid * chaoticFluidCost)
        .duration(duration)
        .EUt(chaoticVoltage)
        .buildAndRegister();

ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:chaotic_core:0') * 2, item('draconicadditions:chaotic_energy_core:0') * 2,metaitem('tjceu:crystal.refined_chaos') * 4, item('draconicevolution:draconic_bow:0'))
        .outputs(item('draconicadditions:chaotic_bow:0').withNbt(DEUpgrades: [arrowDmg: 0 as byte, arrowSpeed: 0 as byte, drawSpeed: 0 as byte, rfCap: 0 as byte], Energy: 0, isStable: 1 as byte))
        .fluidInputs(coolingfluid * chaoticFluidCost)
        .fluidOutputs(heatedfluid * chaoticFluidCost)
        .duration(duration)
        .EUt(chaoticVoltage)
        .buildAndRegister();

ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2, item('draconicevolution:wyvern_sword:0'))
        .outputs(item('draconicevolution:draconic_sword:0').withNbt(DEUpgrades: [attackDmg: 0 as byte, rfCap: 0 as byte, attackAOE: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister();

ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2,item('draconicevolution:wyvern_bow:0'))
        .outputs(item('draconicevolution:draconic_bow:0').withNbt(DEUpgrades: [arrowDmg: 0 as byte, arrowSpeed: 0 as byte, drawSpeed: 0 as byte, rfCap: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister();

// Wyvern to dracon armor
// Head
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2,item('draconicevolution:wyvern_helm:0'))
        .outputs(item('draconicevolution:draconic_helm:0').withNbt(DEUpgrades: [shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister();

// Chest
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2,item('draconicevolution:wyvern_chest:0'))
        .outputs(item('draconicevolution:draconic_chest:0').withNbt(DEUpgrades: [shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister();

// Leg
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2,item('draconicevolution:wyvern_legs:0'))
        .outputs(item('draconicevolution:draconic_legs:0').withNbt(DEUpgrades: [moveSpeed: 0 as byte, shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister();

// Boot
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2,item('draconicevolution:wyvern_boots:0'))
        .outputs(item('draconicevolution:draconic_boots:0').withNbt(DEUpgrades: [shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte, jumpBoost: 0 as byte], Energy: 0))
        .fluidInputs(coolingfluid * draconicFluidCost)
        .fluidOutputs(heatedfluid * draconicFluidCost)
        .duration(duration)
        .EUt(draconicVoltage)
        .buildAndRegister();

// Dracon to chaotic armor
// Head
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:chaotic_core:0') * 2, item('draconicadditions:chaotic_energy_core:0') * 2, metaitem('tjceu:crystal.refined_chaos') * 4, item('draconicevolution:draconic_helm:0'))
        .outputs(item('draconicadditions:chaotic_helm:0').withNbt(DEUpgrades: [shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte], Energy: 0, isStable: 1 as byte))
        .fluidInputs(coolingfluid * chaoticFluidCost)
        .fluidOutputs(heatedfluid * chaoticFluidCost)
        .duration(duration)
        .EUt(chaoticVoltage)
        .buildAndRegister();

// Chest
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:chaotic_core:0') * 2, item('draconicadditions:chaotic_energy_core:0') * 2, metaitem('tjceu:crystal.refined_chaos') * 4, item('draconicevolution:draconic_chest:0'))
        .outputs(item('draconicadditions:chaotic_chest:0').withNbt(DEUpgrades: [attackDmg: 0 as byte, shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte], Energy: 0, isStable: 1 as byte))
        .fluidInputs(coolingfluid * chaoticFluidCost)
        .fluidOutputs(heatedfluid * chaoticFluidCost)
        .duration(duration)
        .EUt(chaoticVoltage)
        .buildAndRegister();

// Leg
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:chaotic_core:0') * 2, item('draconicadditions:chaotic_energy_core:0') * 2, metaitem('tjceu:crystal.refined_chaos') * 4, item('draconicevolution:draconic_legs:0'))
        .outputs(item('draconicadditions:chaotic_legs:0').withNbt(DEUpgrades: [moveSpeed: 0 as byte, shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte], Energy: 0, isStable: 1 as byte))
        .fluidInputs(coolingfluid * chaoticFluidCost)
        .fluidOutputs(heatedfluid * chaoticFluidCost)
        .duration(duration)
        .EUt(chaoticVoltage)
        .buildAndRegister();

// Boot
ARMOR_INFUSION.recipeBuilder()
        .inputs(item('draconicevolution:chaotic_core:0') * 2, item('draconicadditions:chaotic_energy_core:0') * 2, metaitem('tjceu:crystal.refined_chaos') * 4, item('draconicevolution:draconic_boots:0'))
        .outputs(item('draconicadditions:chaotic_boots:0').withNbt(DEUpgrades: [shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte, jumpBoost: 0 as byte], Energy: 0, isStable: 1 as byte))
        .fluidInputs(coolingfluid * chaoticFluidCost)
        .fluidOutputs(heatedfluid * chaoticFluidCost)
        .duration(duration)
        .EUt(chaoticVoltage)
        .buildAndRegister();
