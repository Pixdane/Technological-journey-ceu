import mods.astralsorcery.grindstone as grindstone
import mods.astralsorcery.infusion_altar as infusion_altar
import mods.astralsorcery.light_transmutation as light_transmutation
import mods.astralsorcery.lightwell as lightwell
import mods.astralsorcery.starlight_altar as starlight_altar

EBF = recipemap('electric_blast_furnace')
MIXER = recipemap('mixer')
MACERATOR = recipemap('macerator')
CHEMICAL_BATH = recipemap('chemical_bath')
ASSEMBLER = recipemap('assembler')

// Infusion
infusion_altar.removeByOutput(item('minecraft:iron_ingot') * 3);
infusion_altar.removeByOutput(item('minecraft:gold_ingot') * 3);
infusion_altar.removeByOutput(item('minecraft:emerald') * 4);
infusion_altar.removeByOutput(item('minecraft:diamond') * 4);
infusion_altar.removeByOutput(item('minecraft:lapis_block'));
infusion_altar.removeByOutput(item('minecraft:redstone_block'));
infusion_altar.removeByOutput(item('astralsorcery:itemcraftingcomponent:4'));
infusion_altar.removeByOutput(item('astralsorcery:itemcraftingcomponent:3'));

infusion_altar.recipeBuilder()
        .input(metaitem('lensNetherStar'))
        .output(item('astralsorcery:itemcraftingcomponent', 3))
        .consumption(0.8f)
        .time(80)
        .register()

// Transmutation
light_transmutation.removeByOutput(block('minecraft:end_stone'));
light_transmutation.removeByOutput(block('minecraft:emerald_ore'));

light_transmutation.recipeBuilder()
        .input(block('gregtech:ore_magnetite_0'))
        .output(blockstate('astralsorcery:blockcustomore', 'oretype=starmetal'))
        .outputDisplayStack(item('astralsorcery:blockcustomore', 1))
        .cost(100)
        .register()

light_transmutation.recipeBuilder()
        .input(block('gregtech:ore_vanadium_magnetite_0'))
        .output(blockstate('astralsorcery:blockcustomore', 'oretype=starmetal'))
        .outputDisplayStack(item('astralsorcery:blockcustomore', 1))
        .cost(100)
        .register()

light_transmutation.recipeBuilder()
        .input(block('gregtech:ore_iron_0'))
        .output(blockstate('astralsorcery:blockcustomore', 'oretype=starmetal'))
        .outputDisplayStack(item('astralsorcery:blockcustomore', 1))
        .cost(100)
        .register()

// Grindstone
grindstone.recipeBuilder()
        .input(ore('oreNetherQuartz'))
        .output(metaitem('dustNetherQuartz'))
        .secondaryChance(0.5F)
        .register()

grindstone.recipeBuilder()
        .input(ore('oreCoal'))
        .output(metaitem('dustCoal'))
        .secondaryChance(0.5F)
        .register()

grindstone.recipeBuilder()
        .input(ore('oreCopper'))
        .output(metaitem('dustCopper'))
        .secondaryChance(0.5F)
        .register()

grindstone.recipeBuilder()
        .input(ore('oreTin'))
        .output(metaitem('dustTin'))
        .secondaryChance(0.5F)
        .register()

grindstone.recipeBuilder()
        .input(ore('oreIron'))
        .output(metaitem('dustIron'))
        .secondaryChance(0.5F)
        .register()

grindstone.recipeBuilder()
        .input(ore('ingotCopper'))
        .output(metaitem('dustCopper'))
        .secondaryChance(0.0F)
        .register()

grindstone.recipeBuilder()
        .input(ore('ingotTin'))
        .output(metaitem('dustTin'))
        .secondaryChance(0.0F)
        .register()

grindstone.recipeBuilder()
        .input(ore('ingotIron'))
        .output(metaitem('dustIron'))
        .secondaryChance(0.0F)
        .register()

grindstone.recipeBuilder()
        .input(ore('ingotNickel'))
        .output(metaitem('dustNickel'))
        .secondaryChance(0.0F)
        .register()

// Stralight Altar
starlight_altar.removeByOutput(item('astralsorcery:blockmachine', 1));
starlight_altar.removeByOutput(item('astraladditions:block_starmetal'));
starlight_altar.removeByOutput(item('astralsorcery:itemcraftingcomponent', 1));
starlight_altar.removeByOutput(item('astralsorcery:blockmarble', 6));
starlight_altar.removeByOutput(item('astralsorcery:blocktreebeacon'));
starlight_altar.removeByOutput(item('astralsorcery:blockaltar', 1));
starlight_altar.removeByOutput(item('astralsorcery:blockaltar', 2));
starlight_altar.removeByOutput(item('astralsorcery:blockaltar', 3));
starlight_altar.removeByOutput(item('astralsorcery:blockwell'));
starlight_altar.removeByOutput(item('astralsorcery:itemcraftingcomponent', 3));
starlight_altar.removeByOutput(item('astralsorcery:blockchalice'));
starlight_altar.removeByOutput(item('astralsorcery:blockworldilluminator'));
starlight_altar.removeByOutput(item('astralsorcery:itemlinkingtool'));

for (item in [
        item('astralsorcery:itemrockcrystalsimple'),
        item('astralsorcery:itemtunedrockcrystal'),
        item('astralsorcery:itemcelestialcrystal'),
        item('astralsorcery:itemtunedcelestialcrystal')
]) {
    ore_dict.add('rockCrystal', item)
}

rock_crystal = ore('rockCrystal')
stone_marble = ore('stoneMarble')
runed_marble = item('astralsorcery:blockmarble', 6)

starlight_altar.discoveryRecipeBuilder()
        .output(item('astralsorcery:blockaltar', 1))
        .matrix(
            'MCM',
            'RPR',
            'MPM'
        )
        .key('M', stone_marble)
        .key('C', rock_crystal)
        .key('R', runed_marble)
        .key('P', ore('plateDoubleTungstenSteel'))
        .starlight(200)
        .craftTime(300)
        .register()

starlight_altar.discoveryRecipeBuilder()
        .output(item('astralsorcery:itemcraftingcomponent', 3))
        .matrix(
            ' L ',
            'LAL',
            ' L '
        )
        .key('L', metaitem('lensNetherStar'))
        .key('A', ore('gemAquamarine'))
        .starlight(5)
        .craftTime(300)
        .register()

starlight_altar.discoveryRecipeBuilder()
        .output(item('astralsorcery:blockworldilluminator'))
        .matrix(
            'IAI',
            'A A',
            'IAI'
        )
        .key('I', item('astralsorcery:itemusabledust'))
        .key('A', ore('gemAquamarine'))
        .starlight(200)
        .craftTime(300)
        .register()

starlight_altar.discoveryRecipeBuilder()
        .output(item('astralsorcery:blockwell'))
        .matrix(
            'RAR',
            'XBX',
            'RYR'
        )
        .key('R', runed_marble)
        .key('B', ore('blockGlass'))
        .key('A', ore('gemAquamarine'))
        .key('X', ore('plateDenseQuantum')) // TODO: plateDenseRuthenium
        .key('Y', ore('plateDenseAdamantium')) // TODO: plateDenseOsmium
        .starlight(700)
        .craftTime(300)
        .register()

starlight_altar.discoveryRecipeBuilder()
        .output(item('astralsorcery:itemlinkingtool'))
        .matrix(
            'SAC',
            'SLA',
            'LSS'
        )
        .key('S', ore('stickWood'))
        .key('A', ore('gemAquamarine'))
        .key('L', ore('logWood'))
        .key('C', rock_crystal)
        .starlight(5)
        .craftTime(300)
        .register()

starlight_altar.attunementRecipeBuilder()
        .output(item('astralsorcery:blockaltar', 2))
        .matrix(
            'D   D',
            ' G G ',
            ' RCR ',
            ' PIP ',
            'I   I'
        )
        .key('D', ore('dustAstralStarmetal'))
        .key('G', item('astralsorcery:itemcraftingcomponent', 4))
        .key('R', runed_marble)
        .key('C', rock_crystal)
        .key('I', ore('ingotAstralStarmetal'))
        .key('P', ore('plateDoubleRhodiumPlatedPalladium'))
        .starlight(500)
        .craftTime(300)
        .register()

starlight_altar.constellationRecipeBuilder()
        .output(item('astralsorcery:blockchalice'))
        .matrix(
            'IG GI',
            'ABTBA',
            ' B B ',
            'DPPPD',
            'II II'
        )
        .key('A', ore('gemAquamarine'))
        .key('D', ore('dustAstralStarmetal'))
        .key('G', item('astralsorcery:itemcraftingcomponent', 4))
        .key('I', ore('ingotAstralStarmetal'))
        .key('P', ore('plateDoubleRhodiumPlatedPalladium'))
        .key('T', metaitem('drum.tungstensteel'))
        .key('B', ore('blockGlass'))
        .starlight(450)
        .craftTime(300)
        .register()

starlight_altar.constellationRecipeBuilder()
        .output(item('astralsorcery:blockaltar', 3))
        .matrix(
            'RS SR',
            'GRLRG',
            ' PCP ',
            'GRLRG',
            'RS SR'
        )
        .key('R', runed_marble)
        .key('C', rock_crystal)
        .key('G', item('astralsorcery:itemcraftingcomponent', 4))
        .key('S', item('astralsorcery:blockblackmarble'))
        .key('P', metaitem('tjceu:plateStarmetalAlloy'))
        .key('L', item('astralsorcery:itemcraftingcomponent', 3))
        .starlight(800)
        .craftTime(400)
        .register()

crafting.removeByOutput(runed_marble)

crafting.addShaped(item('astralsorcery:blockmachine:1'), [
        [null, ore('dustIron'), null],
        [ore('plankWood'), ore('stone'), ore('stickWood')],
        [ore('plankWood'), ore('plankWood'), metaitem('tjceu:steam.motor.ulv')]
]);

// Runed Marble
ore_dict.remove('stoneMarble', runed_marble)

crafting.addShaped(runed_marble * 4, [
        [ore('foilTungsten'), ore('stoneMarble'), ore('foilTungsten')],
        [ore('stoneMarble'), ore('wireFinePlatinum'), ore('stoneMarble')],
        [ore('foilTungsten'), ore('stoneMarble'), ore('foilTungsten')]
]);

furnace.removeByOutput(item('astralsorcery:itemcraftingcomponent', 1));

furnace.recipeBuilder()
        .input(ore('oreAstralStarmetal'))
        .output(item('astralsorcery:itemcraftingcomponent', 2))
        .exp(0.0)
        .register()

// StarMetal
EBF.recipeBuilder()
        .circuitMeta(0)
        .inputs(ore('dustAstralStarmetal'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 6000)
        .outputs(item('astralsorcery:itemcraftingcomponent', 1))
        .property("temperature", 7000)
        .duration(1000)
        .EUt(6000)
        .buildAndRegister()

// Resonating Gem
EBF.recipeBuilder()
        .inputs(ore('gemAquamarine'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 6000)
        .outputs(item('astralsorcery:itemcraftingcomponent', 4))
        .property("temperature", 7000)
        .duration(1000)
        .EUt(6000)
        .buildAndRegister();

// Illumination Powder
MIXER.recipeBuilder()
        .circuitMeta(1)
        .inputs([ore('dustGlowstone') * 4, ore('gemAquamarine')])
        .outputs([item('astralsorcery:itemusabledust:0') * 16])
        .duration(30)
        .EUt(800)
        .buildAndRegister();

// Nocturnal Powder
MIXER.recipeBuilder()
        .circuitMeta(1)
        .inputs([item('astralsorcery:itemusabledust:0'), ore('gemLapis'), ore('dustCarbon') * 3])
        .outputs([item('astralsorcery:itemusabledust:1')* 4])
        .duration(30)
        .EUt(1150)
        .buildAndRegister();


// Starmetal Ore to Dust
MACERATOR.recipeBuilder()
        .inputs([ore('oreAstralStarmetal')])
        .outputs([item('astralsorcery:itemcraftingcomponent', 2) * 2])
        .duration(20)
        .EUt(12)
        .buildAndRegister();

// TODO: Add Tooltips
// //tooltips addTooltip(); format."color()"
// fluid('astralsorcery.liquidstarlight').addTooltip("Sx");
// ore('dustAstralStarmetal').addTooltip("Ax");
// ore('ingotAstralStarmetal').addTooltip("(AxSx)");
// ore('oreAstralStarmetal').addTooltip("Ax");
// item('astraladditions:block_starmetal:0').addTooltip("(AxSx)");
// ore('gemAquamarine').addTooltip("Be₃Al₃Si₆O₁₈");
// item('astralsorcery:itemcraftingcomponent:4').addTooltip("Be₃Al₃Si₆O₁₈Sx");
// util.getCrystalORIngredient(false, false).addTooltip("(SiO₂)﹖");

// Treebeacon
crafting.addShaped(item('astralsorcery:blocktreebeacon:0'), [
        [ore('circuitLv'), ore('treeSapling'), ore('circuitLv')],
        [ore('plateSteel'), ore('circuitLv'), ore('plateSteel')],
        [ore('plateDoubleSteel'), ore('plateSteel'), ore('plateDoubleSteel')]
]);

// Lightwell
lightwell.removeByOutput(fluid('water'))
lightwell.removeByOutput(fluid('lava'))

lightwell.recipeBuilder()
        .catalyst(item('randomthings:ingredient', 2))
        .output(fluid('astralsorcery.liquidstarlight'))
        .productionMultiplier(20)
        .shatterMultiplier(1000)
        .catalystColor(0xFFFFFF)
        .register()

EBF.recipeBuilder()
        .inputs(ore('ingotNaquadahAlloy'),ore('ingotAstralStarmetal'))
        .outputs(metaitem('tjceu:ingotHotStarmetalAlloy') *2)
        .property("temperature", 7600)
        .duration(1000)
        .EUt(30720)
        .buildAndRegister();

// TODO: Add Tooltips
// item('gregtech:meta_item_1:524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_item_1:1524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_item_1:2524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_item_1:9524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_item_1:10524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_item_1:11524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_item_1:12524').addTooltip("(AxSx)Nq(Ir₃Os)");
// item('gregtech:meta_block_compressed_32:12').addTooltip("(AxSx)Nq(Ir₃Os)");
// fluid('star_metal_alloy').addTooltip("(AxSx)Nq(Ir₃Os)");

// ZPM Direct Starmetal
CHEMICAL_BATH.recipeBuilder()
        .inputs(ore('dustIron'))
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 1000)
        .notConsumable(metaitem('tjceu:dustNaquadricFuelCatalyst'))
        .outputs(item('astralsorcery:itemcraftingcomponent', 2))
        .duration(240)
        .EUt(100000)
        .buildAndRegister();

CHEMICAL_BATH.recipeBuilder()
        .inputs(ore('dustBrightSteel') * 2)
        .outputs(item('astralsorcery:itemcraftingcomponent', 2) * 2)
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 1000)
        .duration(100)
        .EUt(131072)
        .buildAndRegister();

LCR.recipeBuilder()
        .circuitMeta(1)
        .inputs([rock_crystal, ore('dustAstralStarmetal')])
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 1000)
        .outputs(item('astralsorcery:blockcelestialcrystals', 4))
        .duration(500)
        .EUt(30000)
        .buildAndRegister();

MACERATOR.recipeBuilder()
        .inputs([ore('ingotAstralStarmetal')])
        .outputs([item('astralsorcery:itemcraftingcomponent', 2)])
        .duration(30)
        .EUt(128)
        .buildAndRegister();
