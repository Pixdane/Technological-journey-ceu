import gregtech.api.unification.material.Material

import static classes.utils.TJUtility.tjId
import static gregtech.api.unification.material.Materials.*
import static gregtech.api.unification.material.info.MaterialFlags.*
import static gregtech.api.unification.material.info.MaterialIconSet.*
import static materials.TJMaterials.*

class SecondDegreeMaterials {

    static void register() {
        ExplosiveHydrazineFuelMixture = new Material.Builder(1000, tjId('explosive_hydrazine_mixture'))
                .liquid()
                .color(0x3b0c5c)
                .build()

        ExplosiveHydrazineFuelMixture.setFormula('(8((N2H4)(CH4O))4(C7H7NO2)(C3H5N3O9))', true)

        Octogen = new Material.Builder(1001, tjId('octogen'))
                .dust()
                .iconSet(SHINY)
                .color(0xf3ffdb)
                .components(Carbon * 4, Hydrogen * 8, Nitrogen * 8, Oxygen * 8)
                .build()

        Octaazacubane = new Material.Builder(1002, tjId('octaazacubane'))
                .dust()
                .iconSet(SHINY)
                .color(0x5f5fd9)
                .components(Nitrogen * 8)
                .build()

        OctaazacubaneSolution = new Material.Builder(1003, tjId('octaazacubane_solution'))
                .liquid()
                .color(0x5f5fd9)
                .components(Octaazacubane, Water)
                .build()

        Seabohrgium = new Material.Builder(1004, tjId('seabohrgium'))
                .liquid()
                .color(0x7B0EFF)
                .build()

        Seabohrgium.setFormula('BhSg', true)

        Fordnium = new Material.Builder(1005, tjId('seabohrgium'))
                .liquid()
                .color(0xE9FA50)
                .build()

        Fordnium.setFormula('RfDb', true)
    }

}
