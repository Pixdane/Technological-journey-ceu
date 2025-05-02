package materials

import gregtech.api.unification.material.Material

import static classes.utils.TJUtility.tjId
import static gregtech.api.unification.material.Materials.*
import static gregtech.api.unification.material.info.MaterialFlags.DISABLE_DECOMPOSITION
import static gregtech.api.unification.material.info.MaterialIconSet.SHINY
import static materials.TJMaterials.*

class SecondDegreeMaterials {

    static void register() {
        ExplosiveHydrazineFuelMixture = new Material.Builder(1000, tjId('explosive_hydrazine_mixture'))
                .liquid()
                .color(0x3b0c5c)
                .build()

        ExplosiveHydrazineFuelMixture.setFormula('((N2H4)(CH4O))8(C7H7NO2)4(C3H5N3O9)', true)

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
                .flags(DISABLE_DECOMPOSITION)
                .build()

        FermentationBase = new Material.Builder(1004, tjId('fermentation_base'))
                .liquid()
                .color(0x3D5917)
                .build()

        Juice = new Material.Builder(1005, tjId('juice'))
                .liquid()
                .color(0xA8C972)
                .build()

        Honey = new Material.Builder(1006, tjId('honey'))
                .liquid()
                .color(0xD2C800)
                .build()

        Starmetal = new Material.Builder(1007, tjId('starmetal'))
                .ingot()
                .iconSet(SHINY)
                .color(0x000D46)
                .build()

        Starmetal.setFormula('SxAx', true)
    }

}
