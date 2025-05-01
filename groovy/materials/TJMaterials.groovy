package materials

class TJMaterials {

    public static def Soularium
    public static def StellarAlloy
    public static def DraconicStemCellFluid
    public static def RawChaos
    public static def PahoehoeLava
    public static def StarmetalAlloy
    public static def Aquamarine
    public static def StarlightRocketFuel
    public static def NaquadricFuelCatalyst
    public static def ExplosiveHydrazineFuelMixture
    public static def EternityPreparation
    public static def StarlightComplex
    public static def Octogen
    public static def Octaazacubane
    public static def OctaazacubaneSolution
    public static def Eternity
    public static def FermentationBase
    public static def Juice
    public static def Honey
    public static def Starlight
    public static def Starmetal

    static void register() {

        // Ranges 1-499
        ElementMaterials.register()

        // Ranges 500-999
        FirstDegreeMaterials.register()

        // Ranges 1000-1499
        SecondDegreeMaterials.register()

        // Ranges 1500-1999
        UnknownCompositionMaterials.register()
    }

}
