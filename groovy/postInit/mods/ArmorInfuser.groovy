// import crafttweaker.world.IFacing;
// import crafttweaker.block.IBlock;
// import crafttweaker.block.IBlockState;
// import crafttweaker.item.IIngredient;
// import crafttweaker.item.IItemStack;
// 
// import mods.gregtech.multiblock.Builder;
// import mods.gregtech.multiblock.FactoryBlockPattern;
// import mods.gregtech.multiblock.IBlockMatcher;
// import mods.gregtech.multiblock.MultiblockAbility;
// import mods.gregtech.multiblock.RelativeDirection;
// import mods.gregtech.multiblock.FactoryMultiblockShapeInfo;
// import mods.gregtech.multiblock.IBlockInfo;
// import mods.gregtech.multiblock.IBlockWorldState;
// import mods.gregtech.multiblock.Multiblock;
// 
// import mods.gregtech.MetaTileEntities;
// 
// import mods.gregtech.recipe.FactoryRecipeMap;
// 
// import mods.gregtech.render.ITextureArea;
// import mods.gregtech.render.MoveType;
// import mods.gregtech.render.ICubeRenderer;
// import mods.gregtech.render.Textures;
// 
// var loc = "armor_infuser";
// var meta = 1004;
// val armor_infuser = Builder.start(loc, meta)
//     .withPattern(
//             FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
//                 .aisle(
//                     "HHHHH",
//                     "HCCCH",
//                     "HCCCH",
//                     "HCCCH",
//                     "HHSHH")
//                 .aisle(
//                     "~~~~~",
//                     "~~F~~",
//                     "~FGF~",
//                     "~~F~~",
//                     "~~~~~")
//                 .aisle(
//                     "~~~~~",
//                     "~~F~~",
//                     "~FGF~",
//                     "~~F~~",
//                     "~~~~~")
//                 .aisle(
//                     "AAAAA",
//                     "A~F~A",
//                     "AFGFA",
//                     "A~F~A",
//                     "AAAAA")
//                 .aisle(
//                     "~~~~~",
//                     "~~F~~",
//                     "~FGF~",
//                     "~~F~~",
//                     "~~~~~")
//                 .aisle(
//                     "~~~~~",
//                     "~~F~~",
//                     "~FGF~",
//                     "~~F~~",
//                     "~~~~~")
//                 .aisle(
//                     "AAAAA",
//                     "A~F~A",
//                     "AFGFA",
//                     "A~F~A",
//                     "AAAAA")
//                 .aisle(
//                     "~~~~~",
//                     "~~F~~",
//                     "~FGF~",
//                     "~~F~~",
//                     "~~~~~")
//                 .aisle(
//                     "~~~~~",
//                     "~~F~~",
//                     "~FGF~",
//                     "~~F~~",
//                     "~~~~~")
//                 .aisle(
//                     "CCCCC",
//                     "CCCCC",
//                     "CCCCC",
//                     "CCCCC",
//                     "CCCCC")
//                 .where("S", IBlockMatcher.controller(loc))
//                 .where("~", IBlockMatcher.ANY)
//                 .where("C", item('metastate:contenttweaker:draconiccasing'))
//                 .whereOr("H", 
//                 item('metastate:contenttweaker:draconiccasing'),
//                     IBlockMatcher.abilityPartPredicate(
//                         MultiblockAbility.IMPORT_FLUIDS,
//                         MultiblockAbility.IMPORT_ITEMS,
//                         MultiblockAbility.INPUT_ENERGY,
//                         MultiblockAbility.EXPORT_FLUIDS,
//                         MultiblockAbility.EXPORT_ITEMS
//                 ))
//                 .where("F", item('metastate:gregtech:multiblock_casing:4'))
//                 .where("G", item('metastate:gregtech:wire_coil:8'))
//                 .where("A", item('metastate:gtadditions:ga_fusion_casing:4'))
//                 .build())
//         .addDesign(
//                 FactoryMultiblockShapeInfo.start()
//                 .aisle(
//                     "CCECC",
//                     "     ",
//                     "     ",
//                     "AAAAA",
//                     "     ",
//                     "     ",
//                     "AAAAA",
//                     "     ",
//                     "     ",
//                     "CCCCC")
//                 .aisle(
//                     "OCCCC",
//                     "  F  ",
//                     "  F  ",
//                     "A F A",
//                     "  F  ",
//                     "  F  ",
//                     "A F A",
//                     "  F  ",
//                     "  F  ",
//                     "CCCCC")
//                 .aisle(
//                     "SCCCC",
//                     " FGF ",
//                     " FGF ",
//                     "AFGFA",
//                     " FGF ",
//                     " FGF ",
//                     "AFGFA",
//                     " FGF ",
//                     " FGF ",
//                     "CCCCC")
//                 .aisle(
//                     "ICCCC",
//                     "  F  ",
//                     "  F  ",
//                     "A F A",
//                     "  F  ",
//                     "  F  ",
//                     "A F A",
//                     "  F  ",
//                     "  F  ",
//                     "CCCCC")
//                 .aisle(
//                     "CCWXC",
//                     "     ",
//                     "     ",
//                     "AAAAA",
//                     "     ",
//                     "     ",
//                     "AAAAA",
//                     "     ",
//                     "     ",
//                     "CCCCC")
//                 .where("C", item('metastate:contenttweaker:draconiccasing'))
//                 .where("F", item('metastate:gregtech:multiblock_casing:4'))
//                 .where("S", IBlockInfo.controller(loc))
//                 .where("A", item('metastate:gtadditions:ga_fusion_casing:4'))
//                 .where("G", item('metastate:gregtech:wire_coil:8'))
//                 .where("I", MetaTileEntities.ITEM_IMPORT_BUS[2], IFacing.west())
//                 .where("O", MetaTileEntities.ITEM_EXPORT_BUS[2], IFacing.west())
//                 .where("W", MetaTileEntities.FLUID_IMPORT_HATCH[5], IFacing.south())
//                 .where("X", MetaTileEntities.FLUID_EXPORT_HATCH[5], IFacing.south())
//                 .where("E", MetaTileEntities.ENERGY_INPUT_HATCH[8], IFacing.north())
//                 .build())
// .withRecipeMap(
//         FactoryRecipeMap.start(loc)
//                         .maxFluidInputs(1)
//                         .maxFluidOutputs(1)
//                         .maxInputs(12)
//                         .maxOutputs(1)
//                         .build())
// .withTexture(ICubeRenderer.sided("contenttweaker:blocks/draconiccasing"))
// .withZoom(0.5f)
// 
// .buildAndRegister() as Multiblock;
// 
// 
// #VOLTAGE
// var basicVoltage = 524288;
// var wyvernVoltage = 2097152;
// var draconicVoltage = 8388608;
// var chaoticVoltage = 33554432;
// 
// var Dur = 150;
// var coolingfluid = fluid('supercooled_cryotheum');
// var heatedfluid = fluid('cryotheum');
// var basicFluidCost = 1000;
// var wyvernFluidCost = 2000;
// var draconicFluidCost = 3000;
// var chaoticFluidCost = 4000;
// 
// var shieldC = item('draconicevolution:tool_upgrade:8');
// var shieldR = item('draconicevolution:tool_upgrade:9');
// var capacity = item('draconicevolution:tool_upgrade:0');
// var jump = item('draconicevolution:tool_upgrade:11');
// #tool
// var speed = item('draconicevolution:tool_upgrade:1');
// var AOE = item('draconicevolution:tool_upgrade:2');
// var AAOE = item('draconicevolution:tool_upgrade:4');
// var damage = item('draconicevolution:tool_upgrade:3');
// #arrow
// var draw = item('draconicevolution:tool_upgrade:6');
// var Aspeed = item('draconicevolution:tool_upgrade:7');
// var ADamage = item('draconicevolution:tool_upgrade:5');
// 
// 
// var basicItem1 = item('minecraft:golden_apple:1');
// var basicItem2 = item('gtadditions:ga_meta_item:1718');
// var basicItem3 = item('gregtech:meta_item_1:32724');
// var basicItem4 = item('draconicevolution:draconic_core:0');
// 
// var wyvernItem1 = item('gregtech:meta_item_1:283');
// var wyvernItem2 = item('draconicevolution:draconic_core:0');
// var wyvernItem3 = item('gtadditions:ga_meta_item:1518');
// var wyvernItem4 = item('draconicevolution:wyvern_core:0');
// 
// var draconicItem1 = item('gcyl:gcyl_meta_item:343');
// var draconicItem2 = item('draconicevolution:wyvern_core:0');
// var draconicItem3 = item('gtadditions:ga_meta_item:1519');
// var draconicItem4 = item('draconicevolution:awakened_core:0');
// 
// var chaoticItem1 = item('contenttweaker:refinedchaoscrystal');
// var chaoticItem2 = item('draconicevolution:chaotic_core:0');
// var chaoticItem3 = item('draconicadditions:chaotic_energy_core:0');
// var chaoticItem4 = item('gtadditions:ga_meta_item:1520');
// 
// var draconicTools = [item('draconicevolution:draconic_pick:0'),item('draconicevolution:draconic_shovel:0'),item('draconicevolution:draconic_axe:0')] as IItemStack[];
// var wyvernTools = [item('draconicevolution:wyvern_pick:0'),item('draconicevolution:wyvern_shovel:0'),item('draconicevolution:wyvern_axe:0')] as IItemStack[];
// 
// 
// for i in 0 to 3 {
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2, (wyvernTools[i]))
// .outputs((draconicTools[i].withTag({DEUpgrades: {digSpeed: 0 as byte, digAOE: 0 as byte, rfCap: 0 as byte}, Energy: 0 })))
// .fluidInputs(coolingfluid * draconicFluidCost)
// .fluidOutputs(heatedfluid * draconicFluidCost)
// .duration(Dur)
// .EUt(draconicVoltage)
// .buildAndRegister();
// }
// 
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2, ore('toolHoe'))
// .outputs(ore('toolHoe').withTag({DEUpgrades: {digAOE: 0 as byte, rfCap: 0 as byte}, Energy: 0}))
// .fluidInputs(coolingfluid * draconicFluidCost)
// .fluidOutputs(heatedfluid * draconicFluidCost)
// .duration(Dur)
// .EUt(draconicVoltage)
// .buildAndRegister();
// //battery
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:awakened_core:0') * 4, item('draconicevolution:draconic_energy_core:0') * 4, item('draconicevolution:draconium_capacitor:0'))
// .outputs(item('draconicevolution:draconium_capacitor:1').withTag({DEUpgrades: {rfCap: 0 as byte}, Energy: 0}))
// .fluidInputs(coolingfluid * draconicFluidCost)
// .fluidOutputs(heatedfluid * draconicFluidCost)
// .duration(Dur)
// .EUt(draconicVoltage)
// .buildAndRegister();
// 
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2, item('draconicevolution:draconic_shovel:0'),item('draconicevolution:draconic_sword:0'),item('draconicevolution:draconic_pick:0'))
// .outputs(item('draconicevolution:draconic_staff_of_power:0').withTag({DEUpgrades: {attackDmg: 0 as byte, digSpeed: 0 as byte, digAOE: 0 as byte, rfCap: 0 as byte, attackAOE: 0 as byte}, Energy: 0}))
// .fluidInputs(coolingfluid * draconicFluidCost)
// .fluidOutputs(heatedfluid * draconicFluidCost)
// .duration(Dur)
// .EUt(draconicVoltage)
// .buildAndRegister();
// 
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:chaotic_core:0') * 2, item('draconicadditions:chaotic_energy_core:0') * 2,item('contenttweaker:refinedchaoscrystal') * 4, item('draconicevolution:draconic_staff_of_power:0'))
// .outputs(item('draconicadditions:chaotic_staff_of_power:0').withTag({DEUpgrades: {attackDmg: 0 as byte, digSpeed: 0 as byte, digAOE: 0 as byte, rfCap: 0 as byte, attackAOE: 0 as byte}, Energy: 0, isStable: 1 as byte}))
// .fluidInputs(coolingfluid * chaoticFluidCost)
// .fluidOutputs(heatedfluid * chaoticFluidCost)
// .duration(Dur)
// .EUt(chaoticVoltage)
// .buildAndRegister();
// 
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:chaotic_core:0') * 2, item('draconicadditions:chaotic_energy_core:0') * 2,item('contenttweaker:refinedchaoscrystal') * 4, item('draconicevolution:draconic_bow:0'))
// .outputs(item('draconicadditions:chaotic_bow:0').withTag({DEUpgrades: {arrowDmg: 0 as byte, arrowSpeed: 0 as byte, drawSpeed: 0 as byte, rfCap: 0 as byte}, Energy: 0, isStable: 1 as byte}))
// .fluidInputs(coolingfluid * chaoticFluidCost)
// .fluidOutputs(heatedfluid * chaoticFluidCost)
// .duration(Dur)
// .EUt(chaoticVoltage)
// .buildAndRegister();
// 
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2, item('draconicevolution:wyvern_sword:0'))
// .outputs(item('draconicevolution:draconic_sword:0').withTag({DEUpgrades: {attackDmg: 0 as byte, rfCap: 0 as byte, attackAOE: 0 as byte}, Energy: 0}))
// .fluidInputs(coolingfluid * draconicFluidCost)
// .fluidOutputs(heatedfluid * draconicFluidCost)
// .duration(Dur)
// .EUt(draconicVoltage)
// .buildAndRegister();
// 
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2,item('draconicevolution:wyvern_bow:0'))
// .outputs(item('draconicevolution:draconic_bow:0').withTag({DEUpgrades: {arrowDmg: 0 as byte, arrowSpeed: 0 as byte, drawSpeed: 0 as byte, rfCap: 0 as byte}, Energy: 0}))
// .fluidInputs(coolingfluid * draconicFluidCost)
// .fluidOutputs(heatedfluid * draconicFluidCost)
// .duration(Dur)
// .EUt(draconicVoltage)
// .buildAndRegister();
// 
// 
// //wyvern to dracon armor
// //head
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2,item('draconicevolution:wyvern_helm:0'))
// .outputs(item('draconicevolution:draconic_helm:0').withTag({DEUpgrades: {shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte}, Energy: 0}))
// .fluidInputs(coolingfluid * draconicFluidCost)
// .fluidOutputs(heatedfluid * draconicFluidCost)
// .duration(Dur)
// .EUt(draconicVoltage)
// .buildAndRegister();
// //chest
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2,item('draconicevolution:wyvern_chest:0'))
// .outputs(item('draconicevolution:draconic_chest:0').withTag({DEUpgrades: {shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte}, Energy: 0}))
// .fluidInputs(coolingfluid * draconicFluidCost)
// .fluidOutputs(heatedfluid * draconicFluidCost)
// .duration(Dur)
// .EUt(draconicVoltage)
// .buildAndRegister();
// //leg
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2,item('draconicevolution:wyvern_legs:0'))
// .outputs(item('draconicevolution:draconic_legs:0').withTag({DEUpgrades: {moveSpeed: 0 as byte, shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte}, Energy: 0}))
// .fluidInputs(coolingfluid * draconicFluidCost)
// .fluidOutputs(heatedfluid * draconicFluidCost)
// .duration(Dur)
// .EUt(draconicVoltage)
// .buildAndRegister();
// //boot
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:awakened_core:0') * 2, item('draconicevolution:draconic_energy_core:0') * 2,item('draconicevolution:wyvern_boots:0'))
// .outputs(item('draconicevolution:draconic_boots:0').withTag({DEUpgrades: {shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte, jumpBoost: 0 as byte}, Energy: 0}))
// .fluidInputs(coolingfluid * draconicFluidCost)
// .fluidOutputs(heatedfluid * draconicFluidCost)
// .duration(Dur)
// .EUt(draconicVoltage)
// .buildAndRegister();
// 
// //dracon to chaotic armor
// //head
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:chaotic_core:0') * 2, item('draconicadditions:chaotic_energy_core:0') * 2, item('contenttweaker:refinedchaoscrystal') * 4, item('draconicevolution:draconic_helm:0'))
// .outputs(item('draconicadditions:chaotic_helm:0').withTag({DEUpgrades: {shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte}, Energy: 0, isStable: 1 as byte}))
// .fluidInputs(coolingfluid * chaoticFluidCost)
// .fluidOutputs(heatedfluid * chaoticFluidCost)
// .duration(Dur)
// .EUt(chaoticVoltage)
// .buildAndRegister();
// //chest
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:chaotic_core:0') * 2, item('draconicadditions:chaotic_energy_core:0') * 2, item('contenttweaker:refinedchaoscrystal') * 4, item('draconicevolution:draconic_chest:0'))
// .outputs(item('draconicadditions:chaotic_chest:0').withTag({DEUpgrades: {attackDmg: 0 as byte, shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte}, Energy: 0, isStable: 1 as byte}))
// .fluidInputs(coolingfluid * chaoticFluidCost)
// .fluidOutputs(heatedfluid * chaoticFluidCost)
// .duration(Dur)
// .EUt(chaoticVoltage)
// .buildAndRegister();
// //leg
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:chaotic_core:0') * 2, item('draconicadditions:chaotic_energy_core:0') * 2, item('contenttweaker:refinedchaoscrystal') * 4, item('draconicevolution:draconic_legs:0'))
// .outputs(item('draconicadditions:chaotic_legs:0').withTag({DEUpgrades: {moveSpeed: 0 as byte, shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte}, Energy: 0, isStable: 1 as byte}))
// .fluidInputs(coolingfluid * chaoticFluidCost)
// .fluidOutputs(heatedfluid * chaoticFluidCost)
// .duration(Dur)
// .EUt(chaoticVoltage)
// .buildAndRegister();
// //boot
// armor_infuser.recipeMap.recipeBuilder()
// .inputs(item('draconicevolution:chaotic_core:0') * 2, item('draconicadditions:chaotic_energy_core:0') * 2, item('contenttweaker:refinedchaoscrystal') * 4, item('draconicevolution:draconic_boots:0'))
// .outputs(item('draconicadditions:chaotic_boots:0').withTag({DEUpgrades: {shieldRec: 0 as byte, shieldCap: 0 as byte, rfCap: 0 as byte, jumpBoost: 0 as byte}, Energy: 0, isStable: 1 as byte}))
// .fluidInputs(coolingfluid * chaoticFluidCost)
// .fluidOutputs(heatedfluid * chaoticFluidCost)
// .duration(Dur)
// .EUt(chaoticVoltage)
// .buildAndRegister();