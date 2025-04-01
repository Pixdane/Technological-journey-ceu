import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.RecipeMaps
import gregtech.api.recipes.builders.*

class TJRecipeMaps {

    static final def VIAL_PROCESSING = new RecipeMap<>('vial_processing', 1, 4, 0, 0, new SimpleRecipeBuilder(), false)

    static final def ARMOR_INFUSION = new RecipeMap<>('armor_infusion', 12, 1, 1, 1, new SimpleRecipeBuilder(), false)
    static final def CHAOS_REPLICATION = new RecipeMap<>('chaos_replication', 4, 2, 1, 0, new SimpleRecipeBuilder(), false)
    static final def DRAGON_EGG_REPLICATION = new RecipeMap<>('dragon_egg_replication', 2, 3, 1, 1, new SimpleRecipeBuilder(), false)

    static void modifyRecipeMaps() {
        RecipeMaps.CHEMICAL_BATH_RECIPES.setMaxInputs(2)
    }

}
