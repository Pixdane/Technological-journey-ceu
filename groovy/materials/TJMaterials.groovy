/* groovylint-disable PropertyName */
import gregtech.api.unification.material.Material

class TJMaterials {

    static Material Soularium
    static Material StellarAlloy
    static Material DraconicStemCellFluid
    static Material RawChaos
    static Material PahoehoeLava
    static Material StarmetalAlloy
    static Material Aquamarine
    static Material StarlightRocketFuel
    static Material NaquadricFuelCatalyst
    static Material ExplosiveHydrazineFuelMixture
    static Material EternityPreparation
    static Material StarlightComplex
    static Material Octogen
    static Material Octaazacubane
    static Material OctaazacubaneSolution
    static Material Eternity
    static Material Seabohrgium
    static Material Fordnium

    static void register() {
        /*
        * Ranges 1-499
        */
        ElementMaterials.register()

        /*
        * Ranges 500-999
        */
        FirstDegreeMaterials.register()

        /*
        * Ranges 1000-1499
        */
        SecondDegreeMaterials.register()

        /*
        * Ranges 1500-1999
        */
        UnknownCompositionMaterials.register()
    }

}
