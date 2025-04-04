import gregtech.api.unification.material.properties.PropertyKey

class MaterialModifications {

    static void init() {
        changeFlags()
        modifyProperties()
    }

    static void changeFlags() {

        //no_replication
        material('gcyl:adamantium').addFlags('no_replication')
        material('gcyl:vibranium').addFlags('no_replication')
        material('gcyl:taranium').addFlags('no_replication')
        material('bohrium').addFlags('no_replication')

        material('gcyl:metastable_oganesson').addFlags('no_replication')
        material('gcyl:metastable_flerovium').addFlags('no_replication')
        material('gcyl:metastable_hassium').addFlags('no_replication')
        material('trinium').addFlags('no_replication')
    }

    static void modifyProperties() {

        material('iron').addBlastProperty(1751) // minimum temperature for hot ingot generation

        // Ore
        material('nether_star').addOre(true)
        material('coke').addOre()
        material('neptunium').addOre()
        material('gcyl:rhodium_salt').addOre()
        material('californium').addOre()
        material('curium').addOre()
        material('rutherfordium').addOre()
        material('tritanium').addOre()
        material('naquadria').addOre()
        material('bohrium').addOre()
        material('seaborgium').addOre()
        material('fermium').addOre()
        material('einsteinium').addOre()
        material('americium').addOre()
        material('berkelium').addOre()
        material('rhodium').addOre()
        material('ruthenium').addOre()

        material('gcyl:lv_superconductor_base').getProperty(PropertyKey.WIRE).setLossPerBlock(6)
        material('gcyl:bright_steel').getProperty(PropertyKey.WIRE).setLossPerBlock(2)
    }

}