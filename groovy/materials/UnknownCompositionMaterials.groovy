package materials

import gregicality.multiblocks.api.fluids.GCYMFluidStorageKeys
import gregtech.api.fluids.FluidBuilder
import gregtech.api.unification.material.Material

import static classes.utils.TJUtility.tjId
import static gregtech.api.unification.material.info.MaterialFlags.*
import static gregtech.api.unification.material.info.MaterialIconSet.*
import static materials.TJMaterialIconSets.*
import static materials.TJMaterials.*

class UnknownCompositionMaterials {

    static void register() {
        Soularium = new Material.Builder(1500, tjId('soularium'))
                .ingot()
                .liquid().plasma()
                .iconSet(DULL)
                .color(0x3b2a15)
                .toolStats(13.0F, 6, 512, 10)
                .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_ROD, GENERATE_FRAME, GENERATE_BOLT_SCREW)
                .build()

        StellarAlloy = new Material.Builder(1501, tjId('stellar_alloy'))
                .fluid(GCYMFluidStorageKeys.MOLTEN, new FluidBuilder())
                .color(0xffefb5)
                .build()

        StellarAlloy.setFormula('(5(AxSx)Nq(Ir3Os)4(Am)(??))', true)

        DraconicStemCellFluid = new Material.Builder(1502, tjId('draconic_stem_cell_fluid'))
                .liquid()
                .color(0xff0000)
                .build()

        RawChaos = new Material.Builder(1503, tjId('raw_chaos'))
                .liquid()
                .color(0x000000)
                .build()

        PahoehoeLava = new Material.Builder(1504, tjId('pahoehoe_lava'))
                .liquid()
                .color(0x964B00)
                .build()

        StarmetalAlloy = new Material.Builder(1505, tjId('starmetal_alloy'))
                .ingot(4)
                .iconSet(SHINY)
                .color(0x050A30)
                .blast(b -> b.temp(7000))
                .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_DOUBLE_PLATE)
                .build()

        StarmetalAlloy.setFormula('(AxSx)Nq(Ir3Os)', true)

        StarlightRocketFuel = new Material.Builder(1506, tjId('starlight_rocket_fuel'))
                .liquid()
                .color(0xdf362d)
                .build()

        StarlightRocketFuel.setFormula('(AxSx)?2OC6H18', true)

        NaquadricFuelCatalyst = new Material.Builder(1507, tjId('naquadric_fuel_catalyst'))
                .dust()
                .iconSet(SHINY)
                .color(0x130642)
                .build()

        EternityPreparation = new Material.Builder(1508, tjId('eternity_preparation'))
                .dust()
                .iconSet(SHINY)
                .color(0x46008b)
                .build()

        StarlightComplex = new Material.Builder(1509, tjId('starlight_complex'))
                .liquid()
                .color(0xe1faf7)
                .build()

        StarlightComplex.setFormula('SxN8', true)

        Eternity = new Material.Builder(1510, tjId('eternity'))
                .ingot()
                .plasma()
                .color(0x46008b)
                .iconSet(ETERNITY)
                .flags(NO_UNIFICATION)
                .build()
    }

}
