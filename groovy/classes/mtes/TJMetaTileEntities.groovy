import classes.mtes.multiblocks.*
import classes.recipes.TJRecipeMaps
import gregtech.api.GTValues
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity
import gregtech.api.recipes.RecipeMap
import gregtech.api.util.GTUtility
import gregtech.client.renderer.ICubeRenderer
import gregtech.client.renderer.texture.Textures
import gregtech.common.metatileentities.MetaTileEntities
import gregtech.common.metatileentities.multi.multiblockpart.MetaTileEntityMultiFluidHatch
import groovy.transform.builder.Builder

import static classes.utils.TJUtility.tjId

class TJMetaTileEntities {

    static final def VIAL_PROCESSOR = new SimpleMachineMetaTileEntity[GTValues.V.length - 1]
    static final def GARDENING_GREENHOUSE = new SimpleMachineMetaTileEntity[GTValues.V.length - 1]

    static def PRIMITIVE_ALLOY_SMELTER
    static def ARMOR_INFUSER
    static def CHAOS_REPLICATOR
    static def DRAGON_EGG_REPLICATOR
    static def LARGE_VIAL_PROCESSOR
    static def LARGE_POWERED_SPAWNER

    static def HV_QUADRUPLE_IMPORT_HATCH
    static def HV_QUADRUPLE_EXPORT_HATCH
    static def HV_NONUPLE_IMPORT_HATCH
    static def HV_NONUPLE_EXPORT_HATCH

    static void register() {

        // Singleblocks 0 - 1999
        MTE.builder()
                .name('vial_processor')
                .startId(0)
                .mtes(VIAL_PROCESSOR)
                .recipeMap(TJRecipeMaps.VIAL_PROCESSING)
                .renderer(Textures.EXTRACTOR_OVERLAY) // TODO: custom overlay?
                .build().register()

        MTE.builder()
                .name('gardening_greenhouse')
                .startId(15)
                .mtes(GARDENING_GREENHOUSE)
                .recipeMap(TJRecipeMaps.HORTICULTURAL_CULTIVATION)
                .renderer(Textures.FERMENTER_OVERLAY) // TODO: custom overlay?
                .build().register()

        // Multiblocks 2000 - 2999
        PRIMITIVE_ALLOY_SMELTER = mte(2000, new PrimitiveAlloySmelter(tjId('primitive_alloy_smelter')))
        ARMOR_INFUSER = mte(2001, new ArmorInfuser(tjId('armor_infuser')))
        CHAOS_REPLICATOR = mte(2002, new ChaosReplicator(tjId('chaos_replicator')))
        DRAGON_EGG_REPLICATOR = mte(2003, new DragonEggReplicator(tjId('dragon_egg_replicator')))
        LARGE_VIAL_PROCESSOR = mte(2004, new LargeVialProcessor(tjId('large_vial_processor')))
        LARGE_POWERED_SPAWNER = mte(2005, new LargePoweredSpawner(tjId('large_powered_spawner')))

        // Hatches 3000 - 3999
        HV_QUADRUPLE_IMPORT_HATCH = mte(3000, new MetaTileEntityMultiFluidHatch(tjId('fluid_hatch.import_4x.hv'), GTValues.HV, 4, false) {
        }) // Using anonymous class as a workaround on subitem registration
        HV_QUADRUPLE_EXPORT_HATCH = mte(3001, new MetaTileEntityMultiFluidHatch(tjId('fluid_hatch.export_4x.hv'), GTValues.HV, 4, true) {
        })
        HV_NONUPLE_IMPORT_HATCH = mte(3002, new MetaTileEntityMultiFluidHatch(tjId('fluid_hatch.import_9x.hv'), GTValues.HV, 9, false) {
        })
        HV_NONUPLE_EXPORT_HATCH = mte(3003, new MetaTileEntityMultiFluidHatch(tjId('fluid_hatch.export_9x.hv'), GTValues.HV, 9, true) {
        })

        // Others 4000 - 4999

    }

    private static <T extends MetaTileEntity> T mte(int id, T mte) {
        MetaTileEntities.registerMetaTileEntity(id, mte)
    }

    @Builder
    private class MTE {

        String name
        int startId
        SimpleMachineMetaTileEntity[] mtes
        RecipeMap<?> recipeMap
        ICubeRenderer renderer
        boolean directional = true

        void register() {
            MetaTileEntities.registerMetaTileEntities(mtes, startId, name, { tier, voltageName ->
                new SimpleMachineMetaTileEntity(tjId("${name}.${voltageName}"), recipeMap, renderer, tier, directional, GTUtility.defaultTankSizeFunction)
            })

        }

    }

}
