package materials

import gregicality.multiblocks.api.fluids.GCYMFluidStorageKeys
import gregtech.api.fluids.FluidBuilder
import gregtech.api.unification.material.Material

import static classes.utils.TJUtility.tjId
import static gregtech.api.unification.material.info.MaterialFlags.*
import static gregtech.api.unification.material.info.MaterialIconSet.*
import static materials.TJMaterialIconSets.*
import static materials.TJMaterials.*

import groovy.lang.Newify

@Newify
class UnknownCompositionMaterials {

    static void register() {
        Soularium = Material.Builder.new(1500, tjId('soularium')).with {
            ingot()
            liquid().plasma()
            iconSet DULL
            color 0x3b2a15
            toolStats 13.0F, 6, 512, 10
            flags GENERATE_PLATE, GENERATE_DENSE, GENERATE_ROD, GENERATE_FRAME, GENERATE_BOLT_SCREW
            build()
        }

        StellarAlloy = Material.Builder.new(1501, tjId('stellar_alloy')).with {
            fluid GCYMFluidStorageKeys.MOLTEN, FluidBuilder.new()
            color 0xffefb5
            build()
        }

        StellarAlloy.setFormula('(5(AxSx)Nq(Ir3Os)4(Am)(??))', true)

        DraconicStemCellFluid = Material.Builder.new(1502, tjId('draconic_stem_cell_fluid')).with {
            liquid()
            color 0xff0000
            build()
        }

        RawChaos = Material.Builder.new(1503, tjId('raw_chaos')).with {
            liquid()
            color 0x000000
            build()
        }

        PahoehoeLava = Material.Builder.new(1504, tjId('pahoehoe_lava')).with {
            liquid()
            color 0x964B00
            build()
        }

        StarmetalAlloy = Material.Builder.new(1505, tjId('starmetal_alloy')).with {
            ingot 4
            iconSet SHINY
            color 0x050A30
            blast { it.temp(7000) }
            flags GENERATE_PLATE, GENERATE_DENSE, GENERATE_DOUBLE_PLATE
            build()
        }

        StarmetalAlloy.setFormula('(AxSx)Nq(Ir3Os)', true)

        StarlightRocketFuel = Material.Builder.new(1506, tjId('starlight_rocket_fuel')).with {
            liquid()
            color 0xdf362d
            build()
        }

        StarlightRocketFuel.setFormula('(AxSx)?2OC6H18', true)

        NaquadricFuelCatalyst = Material.Builder.new(1507, tjId('naquadric_fuel_catalyst')).with {
            dust()
            iconSet SHINY
            color 0x130642
            build()
        }

        EternityPreparation = Material.Builder.new(1508, tjId('eternity_preparation')).with {
                dust()
                iconSet SHINY
                color 0x46008b
                build()
        }

        StarlightComplex = Material.Builder.new(1509, tjId('starlight_complex')).with {
                liquid()
                color 0xe1faf7
                build()
        }

        StarlightComplex.setFormula('SxN8', true)

        Eternity = Material.Builder.new(1510, tjId('eternity')).with {
                ingot()
                plasma()
                color 0x46008b
                iconSet ETERNITY
                flags NO_UNIFICATION
                build()
        }
    }

}
