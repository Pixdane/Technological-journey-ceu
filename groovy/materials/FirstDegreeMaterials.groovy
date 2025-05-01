package materials

import gregtech.api.unification.material.Material

import static classes.utils.TJUtility.tjId
import static gregtech.api.unification.material.Materials.*
import static gregtech.api.unification.material.info.MaterialFlags.*
import static gregtech.api.unification.material.info.MaterialIconSet.*
import static materials.TJMaterials.*

class FirstDegreeMaterials {

    static void register() {
        Aquamarine = new Material.Builder(500, tjId('aquamarine'))
                .gem(4)
                .ore(true)
                .iconSet(RUBY)
                .color(0x45b3e7)
                .components(Beryllium * 3, Aluminium * 3, Silicon * 6, Oxygen * 18)
                .build()

        Starlight = new Material.Builder(501, tjId('starlight'))
                .color(0xffffff)
                .build()

        Starlight.setFormula('Sx', true)
    }

}
