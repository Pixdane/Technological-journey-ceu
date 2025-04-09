import static classes.utils.TJUtility.*

// Hide items from JEI
mods.jei.ingredient.yeet(
        item('thermalfoundation:ore'),
        item('thermalfoundation:ore', 1),
        item('thermalfoundation:ore', 2),
        item('thermalfoundation:ore', 3),
        item('thermalfoundation:ore', 4),
        item('thermalfoundation:ore', 5),
        item('thermalfoundation:ore', 6),
        item('thermalfoundation:ore', 7),
        item('thermalfoundation:ore', 8),

        item('thermalfoundation:ore_fluid'),
        item('thermalfoundation:ore_fluid', 1),
        item('thermalfoundation:ore_fluid', 2),
        item('thermalfoundation:ore_fluid', 3),
        item('thermalfoundation:ore_fluid', 4),
        item('thermalfoundation:ore_fluid', 5),

        item('thermalfoundation:storage'),
        item('thermalfoundation:storage', 1),
        item('thermalfoundation:storage', 2),
        item('thermalfoundation:storage', 3),
        item('thermalfoundation:storage', 4),
        item('thermalfoundation:storage', 5),
        item('thermalfoundation:storage', 6),
        item('thermalfoundation:storage', 7),

        item('thermalfoundation:storage_alloy'),
        item('thermalfoundation:storage_alloy', 1),
        item('thermalfoundation:storage_alloy', 2),
        item('thermalfoundation:storage_alloy', 3),
        item('thermalfoundation:storage_alloy', 7),

        item('thermalfoundation:storage_resource'),
        item('thermalfoundation:storage_resource', 1),

        item('thermalfoundation:material', 128),
        item('thermalfoundation:material', 129),
        item('thermalfoundation:material', 130),
        item('thermalfoundation:material', 131),
        item('thermalfoundation:material', 132),
        item('thermalfoundation:material', 132),
        item('thermalfoundation:material', 133),
        item('thermalfoundation:material', 134),
        item('thermalfoundation:material', 135),
        item('thermalfoundation:material', 160),
        item('thermalfoundation:material', 161),
        item('thermalfoundation:material', 162),
        item('thermalfoundation:material', 163),
        item('thermalfoundation:material', 167),

        item('thermalfoundation:material'),
        item('thermalfoundation:material', 1),
        item('thermalfoundation:material', 64),
        item('thermalfoundation:material', 65),
        item('thermalfoundation:material', 66),
        item('thermalfoundation:material', 67),
        item('thermalfoundation:material', 68),
        item('thermalfoundation:material', 69),
        item('thermalfoundation:material', 70),
        item('thermalfoundation:material', 71),
        item('thermalfoundation:material', 96),
        item('thermalfoundation:material', 97),
        item('thermalfoundation:material', 98),
        item('thermalfoundation:material', 99),
        item('thermalfoundation:material', 103),
        item('thermalfoundation:material', 768),
        item('thermalfoundation:material', 769),
        item('thermalfoundation:material', 770),
        item('thermalfoundation:material', 771),
        item('thermalfoundation:material', 772),
        item('thermalfoundation:material', 800),
        item('thermalfoundation:material', 801),

        item('thermalfoundation:material', 16),
        item('thermalfoundation:material', 17),
        item('thermalfoundation:material', 192),
        item('thermalfoundation:material', 193),
        item('thermalfoundation:material', 194),
        item('thermalfoundation:material', 195),
        item('thermalfoundation:material', 196),
        item('thermalfoundation:material', 196),
        item('thermalfoundation:material', 197),
        item('thermalfoundation:material', 198),
        item('thermalfoundation:material', 199),
        item('thermalfoundation:material', 224),
        item('thermalfoundation:material', 225),
        item('thermalfoundation:material', 226),
        item('thermalfoundation:material', 227),
        item('thermalfoundation:material', 231),

        item('thermalfoundation:material', 32),
        item('thermalfoundation:material', 33),
        item('thermalfoundation:material', 320),
        item('thermalfoundation:material', 321),
        item('thermalfoundation:material', 322),
        item('thermalfoundation:material', 323),
        item('thermalfoundation:material', 324),
        item('thermalfoundation:material', 325),
        item('thermalfoundation:material', 326),
        item('thermalfoundation:material', 327),
        item('thermalfoundation:material', 352),
        item('thermalfoundation:material', 353),
        item('thermalfoundation:material', 354),
        item('thermalfoundation:material', 355),
        item('thermalfoundation:material', 359),

        item('thermalfoundation:material', 22),
        item('thermalfoundation:material', 23),
        item('thermalfoundation:material', 24),
        item('thermalfoundation:material', 25),
        item('thermalfoundation:material', 26),
        item('thermalfoundation:material', 27),
        item('thermalfoundation:material', 256),
        item('thermalfoundation:material', 257),
        item('thermalfoundation:material', 258),
        item('thermalfoundation:material', 259),
        item('thermalfoundation:material', 260),
        item('thermalfoundation:material', 261),
        item('thermalfoundation:material', 262),
        item('thermalfoundation:material', 263),
        item('thermalfoundation:material', 288),
        item('thermalfoundation:material', 289),
        item('thermalfoundation:material', 290),
        item('thermalfoundation:material', 291),
        item('thermalfoundation:material', 295),

        item('thermalfoundation:geode'),
)

// Recipe removals
[
        item('thermalfoundation:upgrade'),
        item('thermalfoundation:upgrade', 1),
        item('thermalfoundation:upgrade', 2),
        item('thermalfoundation:upgrade', 3),
        item('thermalfoundation:upgrade', 33),
        item('thermalfoundation:upgrade', 34),
        item('thermalfoundation:upgrade', 35),

        item('thermalfoundation:material', 101),
        item('thermalfoundation:material', 102),
        item('thermalfoundation:material', 1026),
        item('thermalfoundation:material', 1027),
].forEach {
    crafting.removeByOutput(it)
}

furnace.add(item('thermalfoundation:material', 833), metaitem('rubber_drop'), 0.0);

// Hardened upgrade
ASSLINE.recipeBuilder()
       .inputs(item('draconicevolution:draconic_core') * 10,)
       .inputs(ore('plateStarmetalAlloy') * 64)
       .inputs( ore('wireGtSingleUvSuperconductor') * 64,)
       .inputs( ore('plateTitanSteel') * 64)
       .fluidInputs(fluid('soldering_alloy') * 1440)
       .fluidInputs(fluid('draconium') * 1440)
       .outputs(item('thermalfoundation:upgrade'))
       .duration(100)
       .EUt(2013265920)
       .buildAndRegister()

// Reinforced upgrade
ASSLINE.recipeBuilder()
       .inputs(item('draconicevolution:wyvern_core') * 10)
       .inputs(ore('plateProtoAdamantium') * 64)
       .inputs(ore('wireGtSingleUhvSuperconductor') * 64)
       .inputs(ore('platePikyonium') * 64)
       .fluidInputs(fluid('soldering_alloy') * 1440)
       .fluidInputs(fluid('draconium') * 1440)
       .fluidInputs(fluid('naquadah_alloy') * 1440)
       .outputs(item('thermalfoundation:upgrade', 1))
       .duration(100)
       .EUt(2013265920)
       .buildAndRegister()

// Signalum upgrade
ASSLINE.recipeBuilder()
       .inputs(item('draconicevolution:awakened_core') * 10)
       .inputs(ore('plateSeaborgium') * 64,)
       .inputs(ore('wireGtSingleUevSuperconductor') * 64)
       .inputs(ore('plateBlackTitanium') * 64)
       .fluidInputs(fluid('soldering_alloy') * 1440)
       .fluidInputs(fluid('awaken_draconium') * 14400)
       .fluidInputs(fluid('enriched_naquadah_alloy') * 1440)
       .outputs(item('thermalfoundation:upgrade', 2))
       .duration(100)
       .EUt(2013265920)
       .buildAndRegister()

// Resonant upgrade
ASSLINE.recipeBuilder()
       .inputs(item('draconicevolution:chaotic_core') * 10)
       .inputs(ore('plateBohrium') * 64)
       .inputs(ore('wireGtSingleUivSuperconductor') * 64)
       .inputs(ore('plateHdcs') * 64)
       .fluidInputs(fluid('soldering_alloy') * 1440)
       .fluidInputs(fluid('chaos') * 1440)
       .fluidInputs(fluid('naquadriatic_taranium') * 1440)
       .outputs(item('thermalfoundation:upgrade', 3))
       .duration(100)
       .EUt(2013265920)
       .buildAndRegister()

// Creative conversion kit
ASSLINE.recipeBuilder()
       .inputs(item('thermalfoundation:upgrade'))
       .inputs(item('thermalfoundation:upgrade', 1))
       .inputs(item('thermalfoundation:upgrade', 2))
       .inputs(item('thermalfoundation:upgrade', 3))
       .fluidInputs(fluid('naquadriatic_taranium') * 1440)
       .fluidInputs(fluid('cosmic_neutronium') * 1440)
       .fluidInputs(fluid('enriched_naquadah_alloy') * 1440)
       .fluidInputs(fluid('naquadah_alloy') * 1440)
       .outputs(item('thermalfoundation:upgrade', 256))
       .duration(100)
       .EUt(2013265920)
       .buildAndRegister()
