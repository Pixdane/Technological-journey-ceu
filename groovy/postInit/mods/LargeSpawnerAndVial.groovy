// #priority 0
// 
// import mods.gregtech.multiblock.Builder;
// import mods.gregtech.multiblock.FactoryBlockPattern;
// import mods.gregtech.multiblock.RelativeDirection;
// import mods.gregtech.multiblock.IBlockMatcher;
// import mods.gregtech.multiblock.MultiblockAbility;
// import mods.gregtech.multiblock.FactoryMultiblockShapeInfo;
// import mods.gregtech.multiblock.IBlockInfo;
// import mods.gregtech.multiblock.Multiblock;
// import mods.gregtech.multiblock.IBlockWorldState;
// 
// import mods.gregtech.MetaTileEntities;
// import mods.gregtech.recipe.FactoryRecipeMap;
// import mods.gregtech.recipe.RecipeMap;
// import mods.gtadditions.recipe.GARecipeMaps;
// import crafttweaker.world.IFacing;
// import crafttweaker.block.IBlock;
// import crafttweaker.block.IBlockState;
// import crafttweaker.item.IIngredient;
// import crafttweaker.item.IItemStack;
// 
// import mods.gregtech.render.ITextureArea;
// import mods.gregtech.render.MoveType;
// import mods.gregtech.render.ICubeRenderer;
// import mods.gregtech.render.Textures;
// 
// 
// 
// val assembler = mods.gregtech.recipe.RecipeMap.getByName("assembler");
// assembler.recipeBuilder()
//     .inputs([ore('frameGtSoularium') * 1, ore('platePolytetrafluoroethylene') * 4, ore('gearSmallTungstenSteel')*2, ore('ingotEndSteel') * 2]) 
//     .fluidInputs([fluid('soularium') * 288])
//     .outputs(item('contenttweaker:soulcasing') * 2)
//     .duration(160)
//     .EUt(30720)
//     .buildAndRegister();
// 
// 
// var loc = "large_powered_spawner";
// var meta = 4201;
// 
// val large_spawner = Builder.start(loc, meta)
//     .withPattern(
//             FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
//                 .aisle(
//                     "SSSSS",
//                     "SSSSS",
//                     "SSSSS",
//                     "SSSSS",
//                     "SSCSS")
//                 .aisle(
//                     "F~~~F",
//                     "~PMP~",
//                     "~MEM~",
//                     "~PMP~",
//                     "F~~~F")
//                 .aisle(
//                     "F~~~F",
//                     "~PMP~",
//                     "~MEM~",
//                     "~PMP~",
//                     "F~~~F")
//                 .aisle(
//                     "F~~~F",
//                     "~PMP~",
//                     "~MEM~",
//                     "~PMP~",
//                     "F~~~F")
//                 .aisle(
//                     "SSSSS",
//                     "SGGGS",
//                     "SGGGS",
//                     "SGGGS",
//                     "SSSSS")
//                 .where("C", IBlockMatcher.controller(loc))
//                 .where("~", IBlockMatcher.ANY)
//                 .whereOr("S", 
//                 item('metastate:contenttweaker:soulcasing'),
//                     IBlockMatcher.abilityPartPredicate(
//                         MultiblockAbility.IMPORT_FLUIDS,
//                         MultiblockAbility.IMPORT_ITEMS,
//                         MultiblockAbility.INPUT_ENERGY,
//                         MultiblockAbility.EXPORT_ITEMS
//                 ))
//                 .where("F", item('metastate:gregtech:frame_protactinium:0'))
//                 .where("E", item('metastate:enderio:block_alloy:8'))
//                 .where("P", item('metastate:gregtech:boiler_casing:3'))
//                 .where("M", item('metastate:enderio:block_decoration1'))
//                 .where("G", item('metastate:gregtech:multiblock_casing:1'))
//                 .build())
//         .addDesign(
//                 FactoryMultiblockShapeInfo.start()
// 		.aisle(
// 		    "LSSSS",
// 		    "F~~~F",
// 		    "F~~~F",
// 		    "F~~~F",
// 		    "SSSSS")
// 		.aisle(
// 		    "ISSSS",
// 		    "~PMP~",
// 		    "~PMP~",
// 		    "~PMP~",
// 		    "SGGGS")
// 		.aisle(
// 		    "CSSSS",
// 		    "~MEM~",
// 		    "~MEM~",
// 		    "~MEM~",
// 		    "SGGGS")
// 		.aisle(
// 		    "OSSSS",
// 		    "~PMP~",
// 		    "~PMP~",
// 		    "~PMP~",
// 		    "SGGGS")
// 		.aisle(
// 		    "TSSSS",
// 		    "F~~~F",
// 		    "F~~~F",
// 		    "F~~~F",
// 		    "SSSSS")
//                 .where("S", item('metastate:contenttweaker:soulcasing'))
//                 .where("C", IBlockInfo.controller(loc))
//                 .where("I", MetaTileEntities.ITEM_IMPORT_BUS[2], IFacing.west())
//                 .where("O", MetaTileEntities.ITEM_EXPORT_BUS[2], IFacing.west())
//                 .where("L", MetaTileEntities.FLUID_IMPORT_HATCH[2], IFacing.west())
//                 .where("T", MetaTileEntities.ENERGY_INPUT_HATCH[6], IFacing.west())
//                 .where("F", item('metastate:gregtech:frame_protactinium:0'))
//                 .where("E", item('metastate:enderio:block_alloy:8'))
//                 .where("P", item('metastate:gregtech:boiler_casing:3'))
//                 .where("M", item('metastate:enderio:block_decoration1'))
//                 .where("G", item('metastate:gregtech:multiblock_casing:1'))
//                 .build())
// 	.withRecipeMap(
//         	FactoryRecipeMap.start(loc)
//                         .maxFluidInputs(1)
//                         .maxInputs(2)
//                         .maxOutputs(1)
//                         .build())
// 	.withTexture(ICubeRenderer.sided("contenttweaker:blocks/soulcasing"))
// 	.withZoom(0.5f)
// 	.buildAndRegister() as Multiblock;
// 
// 
// 
// val MOB_TYPE = [
// 	"enderman",
// 	"zombie",
// 	"skeleton",
// 	"blaze",
// 	"ghast",
// 	"spider",
// 	"slime",
// 	"creeper",
// 	"magma_cube",
// 	"witch",
// 	"wither_skeleton",
// 	"snowman",
// 	"sheep",
// 	"pig",
// 	"chicken",
// 	"cow",
// ] as string[];
// 
// 
// val multiplierArray = [1, 4] as int[]; 
// 
// for j,k in multiplierArray {
//     for i,mob in MOB_TYPE {
//     	large_spawner.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:0') * (16 * k))
// 		.outputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + mob}) * (16 * k))
// 		.fluidInputs(fluid('xpjuice') * (16000 * k))
// 		.duration(20)
// 		.EUt(30720 * k)
// 		.notConsumable(item('gregtech:meta_item_1:32766').withTag({Configuration:(i + 16 * j)}))
// 		.buildAndRegister();
// 	}
// }
// 
// loc = "large_vial_processor";
// meta += 1;
// 
// val large_vial = Builder.start(loc, meta)
//     .withPattern(
//             FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.BACK, RelativeDirection.UP)
//                 .aisle(
//                     "SSSSS",
//                     "SPPPS",
//                     "SPEPS",
//                     "SPPPS",
//                     "SSCSS")
//                 .aisle(
//                     "F~~~F",
//                     "~BGB~",
//                     "~GEG~",
//                     "~BGB~",
//                     "F~~~F")
//                 .aisle(
//                     "F~~~F",
//                     "~BGB~",
//                     "~GEG~",
//                     "~BGB~",
//                     "F~~~F")
//                 .aisle(
//                     "F~~~F",
//                     "~BGB~",
//                     "~GEG~",
//                     "~BGB~",
//                     "F~~~F")
//                 .aisle(
//                     "SSSSS",
//                     "SPPPS",
//                     "SPEPS",
//                     "SPPPS",
//                     "SSSSS")
//                 .where("C", IBlockMatcher.controller(loc))
//                 .where("~", IBlockMatcher.ANY)
//                 .whereOr("S", 
//                 item('metastate:contenttweaker:soulcasing'),
//                     IBlockMatcher.abilityPartPredicate(
//                         MultiblockAbility.IMPORT_ITEMS,
//                         MultiblockAbility.INPUT_ENERGY,
//                         MultiblockAbility.EXPORT_FLUIDS,
//                         MultiblockAbility.EXPORT_ITEMS
//                 ))
//                 .where("F", item('metastate:gregtech:frame_protactinium:0'))
//                 .where("E", item('metastate:enderio:block_alloy:8'))
//                 .where("P", item('metastate:gregtech:boiler_casing:3'))
//                 .where("B", item('metastate:gtadditions:ga_multiblock_casing:15'))
//                 .where("G", item('metastate:gregtech:multiblock_casing:1'))
//                 .build())
//         .addDesign(
//                 FactoryMultiblockShapeInfo.start()
// 		.aisle(
// 		    "LSSSS",
// 		    "F~~~F",
// 		    "F~~~F",
// 		    "F~~~F",
// 		    "SSSSS")
// 		.aisle(
// 		    "IPPPS",
// 		    "~BGB~",
// 		    "~BGB~",
// 		    "~BGB~",
// 		    "SPPPS")
// 		.aisle(
// 		    "CPEPS",
// 		    "~GEG~",
// 		    "~GEG~",
// 		    "~GEG~",
// 		    "SPEPS")
// 		.aisle(
// 		    "OPPPS",
// 		    "~BGB~",
// 		    "~BGB~",
// 		    "~BGB~",
// 		    "SPPPS")
// 		.aisle(
// 		    "TSSSS",
// 		    "F~~~F",
// 		    "F~~~F",
// 		    "F~~~F",
// 		    "SSSSS")
//                 .where("S", item('metastate:contenttweaker:soulcasing'))
//                 .where("C", IBlockInfo.controller(loc))
//                 .where("I", MetaTileEntities.ITEM_IMPORT_BUS[2], IFacing.west())
//                 .where("O", MetaTileEntities.ITEM_EXPORT_BUS[4], IFacing.west())
//                 .where("T", MetaTileEntities.ENERGY_INPUT_HATCH[6], IFacing.west())
//                 .where("F", item('metastate:gregtech:frame_protactinium:0'))
//                 .where("E", item('metastate:enderio:block_alloy:8'))
//                 .where("P", item('metastate:gregtech:boiler_casing:3'))
//                 .where("G", item('metastate:gregtech:multiblock_casing:1'))
//                 .where("B", item('metastate:gtadditions:ga_multiblock_casing:15'))
//                 .where("L", MetaTileEntities.FLUID_EXPORT_HATCH[2], IFacing.west())
//                 .build())
// 	.withRecipeMap(
//         	FactoryRecipeMap.start(loc)
//                         .maxInputs(1)
//                         .minOutputs(4)
//                         .maxOutputs(14)
//                         .maxFluidOutputs(1)
//                         .build())
// 	.withTexture(ICubeRenderer.sided("contenttweaker:blocks/soulcasing"))
// 	.withZoom(0.5f)
// 	.buildAndRegister() as Multiblock;
// 
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[0]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			ore('itemSkull') * 64,
// 			ore('itemSkull') * 64,
// 			ore('itemSkull') * 64,
// 			ore('enderpearl,gemEnderPearl,materialEnderPearl') * 64,
// 			ore('enderpearl,gemEnderPearl,materialEnderPearl') * 64,
// 			ore('enderpearl,gemEnderPearl,materialEnderPearl') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[1]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			ore('itemSkull') * 64,
// 			ore('itemSkull') * 64,
// 			ore('itemSkull') * 32,
// 			item('minecraft:rotten_flesh:0') * 64,
// 			item('minecraft:rotten_flesh:0') * 64,
// 			item('minecraft:rotten_flesh:0') * 32,
// 			ore('itemSkull') * 24,
// 			ore('cropPotato') * 4,
// 			ore('cropCarrot') * 4,
// 			item('minecraft:melon:0') * 4,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[2]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			ore('bone,stickBone') * 64,
// 			ore('bone,stickBone') * 64,
// 			ore('itemSkull') * 24,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[3]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			ore('itemBlazeRod,rodBlaze,stickBlaze') * 64,
// 			ore('itemBlazeRod,rodBlaze,stickBlaze') * 64,
// 			ore('itemBlazeRod,rodBlaze,stickBlaze') * 32,
// 			ore('dustBlaze,itemBlazePowder') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[4]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			ore('itemGhastTear') * 64,
// 			ore('itemGhastTear') * 48,
// 			ore('dustSalt') * 48,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[5]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			ore('cropFlax,string') * 64,
// 			ore('cropFlax,string') * 64,
// 			ore('cropFlax,string') * 32,
// 			item('minecraft:web:0') * 12,
// 			item('minecraft:spider_eye:0') * 16,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[6]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			ore('slimeball') * 64,
// 			ore('slimeball') * 64,
// 			ore('blockSlime') * 4,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[7]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			ore('dustGunpowder,gunpowder') * 64,
// 			ore('dustGunpowder,gunpowder') * 32,
// 			ore('dustSulfur') * 32,
// 			ore('dustSaltpeter') * 16,
// 			ore('dustCoal') * 16,
// 			ore('itemSkull') * 24,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[8]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			item('minecraft:magma_cream:0') * 64,
// 			item('minecraft:magma_cream:0') * 16,
// 			ore('dustBlaze,itemBlazePowder') * 32,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[9]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			ore('dustRedstone') * 64,
// 			ore('dustRedstone') * 16,
// 			ore('dustGlowstone') * 48,
// 			ore('dustGunpowder,gunpowder') * 32,
// 			ore('dustSugar') * 64,
// 			ore('dustSugar') * 32,
// 			item('minecraft:glass_bottle:0') * 12,
// 			ore('cofh:potion').withTag({Potion: "minecraft:water"}) * 4,
// 			ore('stickWood') * 32,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[10]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			ore('bone,stickBone') * 48,
// 			ore('itemSkull') * 12,
// 			ore('dustCoal') * 32,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[11]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			item('minecraft:snowball:0') * 16,
// 			item('minecraft:snowball:0') * 16,
// 			item('minecraft:snowball:0') * 16,
// 			item('minecraft:snowball:0') * 16,
// 			item('minecraft:snow:0') * 4,
// 			item('minecraft:ice') * 8,
// 			ore('cropPumpkin') * 4,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[12]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			item('minecraft:wool:0') * 64,
// 			item('minecraft:wool:0') * 64,
// 			ore('cropFlax,string') * 32,
// 			item('minecraft:mutton:0') * 64,
// 			item('minecraft:mutton:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[13]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			item('minecraft:porkchop:0') * 512,
// 			item('minecraft:porkchop:0') * 512,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[14]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			ore('egg') * 960,
// 			ore('craftingFeather,feather') * 400,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// large_vial.recipeMap.recipeBuilder()
// 		.inputs(item('enderio:item_soul_vial:1').withTag({entityId: "minecraft:" + MOB_TYPE[15]}) * 16)
// 		.outputs([
// 			item('enderio:item_soul_vial:0') * 16,
// 			ore('itemLeather,leather') * 64,
// 			ore('itemLeather,leather') * 64,
// 			item('minecraft:beef:0') * 512,
// 			item('actuallyadditions:item_solidified_experience:0') * 64,
// 			item('actuallyadditions:item_solidified_experience:0') * 64
// 		])
// 		.fluidOutputs(fluid('milk') * 16000)
// 		.duration(20)
// 		.EUt(30720)
// 		.buildAndRegister();
// 
// 
// val assemblyLine = mods.gregtech.recipe.RecipeMap.getByName("assembly_line");
// 
// assemblyLine.recipeBuilder()
//     .inputs([
// 			item('gregtech:mte:991') * 1,
// 			item('enderio:block_powered_spawner:0') * 16,
// 			item('contenttweaker:soulcasing') * 4,
// 			ore('plateCurium') * 12,
// 			ore('circuitUltimate') * 2,
// 			item('gregtech:meta_item_1:32675') * 2,
// 			item('enderio:item_capacitor_stellar:0') * 2,
// 			ore('cableGtQuadrupleNiobiumTitanium') * 8,
// 			item('gregtech:meta_item_1:32685') * 2,
// 			item('gregtech:meta_item_1:32655') * 2,
// 			item('gregtech:meta_item_1:32615') * 2
// 
// 		]) 
//     .fluidInputs([
// 			fluid('soldering_alloy') * 576,
// 			fluid('hssg') * 2304,
// 			fluid('soularium') * 2304,
// 		])
//     .outputs(item('gregtech:machine:4201') * 1)
//     .duration(800)
//     .EUt(30000)
//     .buildAndRegister();
// 
// 
// assemblyLine.recipeBuilder()
//     .inputs([
// 			item('gregtech:mte:991') * 1,
// 			item('gregtech:machine:1400') * 16,
// 			item('contenttweaker:soulcasing') * 4,
// 			ore('plateCurium') * 12,
// 			ore('circuitUltimate') * 2,
// 			item('gregtech:meta_item_1:32675') * 2,
// 			item('enderio:item_capacitor_stellar:0') * 2,
// 			ore('cableGtQuadrupleNiobiumTitanium') * 8,
// 			item('gregtech:meta_item_1:32635') * 2,
// 			item('gregtech:meta_item_1:32645') * 2,
// 			item('gregtech:meta_item_1:32695') * 2
// 
// 		]) 
//     .fluidInputs([
// 			fluid('soldering_alloy') * 576,
// 			fluid('hssg') * 2304,
// 			fluid('soularium') * 2304,
// 		])
//     .outputs(item('gregtech:machine:4202') * 1)
//     .duration(800)
//     .EUt(30000)
//     .buildAndRegister();