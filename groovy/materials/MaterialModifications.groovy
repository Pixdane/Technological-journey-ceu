import gregtech.api.fluids.FluidBuilder
import gregtech.api.fluids.store.FluidStorageKeys
import gregtech.api.unification.material.properties.FluidProperty
import gregtech.api.unification.material.properties.PropertyKey
import gregtech.api.unification.ore.OrePrefix

class MaterialModifications {

    static void init() {
        changeFlags()
        modifyProperties()
        modifyOrePrefixes()
    }

    static void changeFlags() {

        material('nether_star').addFlags('no_smelting')

        material('protactinium').addFlags('generate_frame')

        material('curium').addFlags('generate_plate')

        //no_replication
        material('gcyl:adamantium').addFlags('no_replication')
        material('gcyl:vibranium').addFlags('no_replication')
        material('gcyl:taranium').addFlags('no_replication')
        material('bohrium').addFlags('no_replication')

        material('gcyl:metastable_oganesson').addFlags('no_replication')
        material('gcyl:metastable_flerovium').addFlags('no_replication')
        material('gcyl:metastable_hassium').addFlags('no_replication')
        material('trinium').addFlags('no_replication')

        material('neodymium_magnetic').addFlags('generate_gear')
        material('gcyl:draconium').addFlags('generate_double_plate')
    }

    static void modifyProperties() {

        material('iron').addBlastProperty(1811)

        // For periodic table
        material('lithium').addIngot()
        material('carbon').addIngot()
        material('sodium').addIngot()
        material('magnesium').addIngot()
        material('potassium').addIngot()
        material('scandium').addIngot()
        material('germanium').addIngot()
        material('rubidium').addIngot()
        material('strontium').addIngot()
        material('technetium').addIngot()
        material('cadmium').addIngot()
        material('tellurium').addIngot()
        material('caesium').addIngot()
        material('polonium').addIngot()
        material('francium').addIngot()
        material('radium').addIngot()
        material('meitnerium').addIngot()
        material('roentgenium').addIngot()
        material('copernicium').addIngot()
        material('nihonium').addIngot()
        material('moscovium').addIngot()
        material('livermorium').addIngot()
        material('lanthanum').addIngot()
        material('praseodymium').addIngot()
        material('promethium').addIngot()
        material('gadolinium').addIngot()
        material('terbium').addIngot()
        material('dysprosium').addIngot()
        material('holmium').addIngot()
        material('erbium').addIngot()
        material('thulium').addIngot()
        material('ytterbium').addIngot()
        material('lutetium').addIngot()
        material('actinium').addIngot()
        material('uranium').addIngot()
        material('protactinium').addIngot()
        material('neptunium').addIngot()
        material('curium').addIngot()
        material('berkelium').addIngot()
        material('einsteinium').addIngot()
        material('fermium').addIngot()
        material('mendelevium').addIngot()
        material('nobelium').addIngot()
        material('lawrencium').addIngot()

        material('supercritical:plutonium_244').addIngot()

        def property = new FluidProperty()
        property.enqueueRegistration(FluidStorageKeys.LIQUID, new FluidBuilder().temperature(1173))
        material('californium').setProperty(PropertyKey.FLUID, property)

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
        material('naquadah_enriched').addOre()
        material('niobium').addOre()
        material('rarest_metal_mixture').addOre()

        material('gcyl:lv_superconductor_base').getProperty(PropertyKey.WIRE).setLossPerBlock(6)
        material('gcyl:bright_steel').getProperty(PropertyKey.WIRE).setLossPerBlock(2)
    }

    static void modifyOrePrefixes() {

        OrePrefix.dust.setIgnored(material('tjceu:soularium'))
        OrePrefix.nugget.setIgnored(material('tjceu:soularium'))
        OrePrefix.ingot.setIgnored(material('tjceu:soularium'))
        OrePrefix.block.setIgnored(material('tjceu:soularium'))

        OrePrefix.gem.setIgnored(material('tjceu:aquamarine'))

        OrePrefix.dust.setIgnored(material('gcyl:draconium'))
        OrePrefix.nugget.setIgnored(material('gcyl:draconium'))
        OrePrefix.ingot.setIgnored(material('gcyl:draconium'))
        OrePrefix.block.setIgnored(material('gcyl:draconium'))

        OrePrefix.nugget.setIgnored(material('gcyl:awaken_draconium'))
        OrePrefix.ingot.setIgnored(material('gcyl:awaken_draconium'))
        OrePrefix.block.setIgnored(material('gcyl:awaken_draconium'))

        OrePrefix.dust.setIgnored(material('gcyl:pyrotheum'))

        OrePrefix.dust.setIgnored(material('gcyl:cryotheum'))

        // Colors
        material('holmium').setIconSet('SHINY')
        material('holmium').setMaterialRGB(0xA25F79)
        material('promethium').setMaterialRGB(0x6E1D26)
        material('lawrencium').setMaterialRGB(0x95C278)
        material('terbium').setMaterialRGB(0xBABBAC)
        material('dysprosium').setMaterialRGB(0xCCBDFA3)
        material('erbium').setMaterialRGB(0xEAB8C8)
        material('thulium').setMaterialRGB(0xCABFBE)

    }

}