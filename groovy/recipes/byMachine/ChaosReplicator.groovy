CHAOS_REPLICATION = recipemap('chaos_replication')

CHAOS_REPLICATION.recipeBuilder()
        .inputs(item('gcyl:gcyl_meta_item', 343) * 16, item('gregtech:meta_item_1', 282) * 16, item('gregtech:meta_item_1', 283) * 16, metaitem('tjceu:crystal.refined_chaos'))
        .fluidInputs(fluid('uu_matter') * 32000)
        .outputs(metaitem('tjceu:crystal.refined_chaos') * 64, metaitem('tjceu:shard.refined_chaos') * 32)
        .duration(500)
        .EUt(524288)
        .buildAndRegister()
