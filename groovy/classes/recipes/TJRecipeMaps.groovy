import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.builders.*

class TJRecipeMaps {
    static final RecipeMap<SimpleRecipeBuilder> ARMOR_INFUSION = new RecipeMap<>('armor_infusion', 12, 1, 1, 1, new SimpleRecipeBuilder(), false)
    static final RecipeMap<SimpleRecipeBuilder> CHAOS_REPLICATION = new RecipeMap<>('chaos_replication', 4, 2, 1, 0, new SimpleRecipeBuilder(), false)
    static final RecipeMap<SimpleRecipeBuilder> DRAGON_EGG_REPLICATION = new RecipeMap<>('dragon_egg_replication', 2, 3, 1, 1, new SimpleRecipeBuilder(), false)
}
