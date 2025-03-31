// side: client
import gregtech.client.renderer.texture.cube.*

class TJTextures {

    static SimpleOverlayRenderer DRACONIC_CASING
    static SimpleOverlayRenderer AWAKENED_DRACONIUM_CASING
    static SimpleOverlayRenderer REFINED_CHAOS_CASING
    static SimpleOverlayRenderer SOUL_INSULATION_CASING

    static void init() {
        DRACONIC_CASING = new SimpleOverlayRenderer('casings/multiblock/machine_casing_draconic')
        AWAKENED_DRACONIUM_CASING = new SimpleOverlayRenderer('casings/multiblock/machine_casing_awakened_draconium')
        REFINED_CHAOS_CASING = new SimpleOverlayRenderer('casings/multiblock/machine_casing_refined_chaos')
        SOUL_INSULATION_CASING = new SimpleOverlayRenderer('casings/multiblock/machine_casing_soul_insulation')
    }

}
