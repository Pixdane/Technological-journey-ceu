package classes.utils

import gregtech.api.unification.OreDictUnifier
import gregtech.api.unification.ore.OrePrefix
import gregtech.api.unification.stack.UnificationEntry
import gregtech.loaders.recipe.CraftingComponent
import groovy.transform.TupleConstructor
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.ItemStack

class TJUtility {

    static tjceu(String name) {
        return 'tjceu:' + name
    }

    static tjId(String name) {
        return resource('tjceu', name)
    }

    @TupleConstructor
    enum Tier {

        ULV('ULV', 'gregtech:wrought_iron'),
        LV('LV', 'gregtech:steel'),
        MV('MV', 'gregtech:aluminium'),
        HV('HV', 'gregtech:stainless_steel'),
        EV('EV', 'gregtech:titanium'),
        IV('IV', 'gregtech:tungsten_steel'),
        LuV('LuV', 'gregtech:rhodium_plated_palladium'),
        ZPM('ZPM', 'tjceu:starmetal_alloy'),
        UV('UV', 'gregtech:tritanium'),
        UHV('UHV', 'gregtech:seaborgium'),
        UEV('UEV', 'gregtech:bohrium'),
        UIV('UIV', 'gcyl:adamantium'),
        UXV('UXV', 'gcyl:vibranium'),
        OpV('OpV', 'gcyl:heavy_quark_degenerate_matter'),
        MAX('MAX', 'gregtech:neutronium'),
        ;

        static final TR = LV..OpV

        String tierName
        String materialName

        def lc() {
            this.tierName.toLowerCase()
        }

        def methodMissing(String methodName, args) {
            def snakeCase = methodName.toSnakeCase()
            if (CraftingComponent.hasProperty(snakeCase)) {
                def component = CraftingComponent.@"${snakeCase}" as CraftingComponent.Component
                return this.getTieredComponent(component)
            }

            if (OrePrefix.hasProperty(methodName)) {
                def prefix = OrePrefix.@"${methodName}"
                if (prefix) {
                    return OreDictUnifier.get(prefix, material(materialName))
                }
            }

            // Fallback
            return item()
        }

        def getTieredComponent(CraftingComponent.Component component) {
            def candidate = component.getIngredient(this.ordinal())
            if (candidate in ItemStack) {
                return candidate
            } else if (candidate in UnificationEntry) {
                return ore(candidate.toString())
            } else if (candidate in Block | candidate in Item) {
                return new ItemStack(candidate)
            }

            // Fallback
            return item()
        }

        def hull() {
            metaitem("hull.${this.lc()}")
        }

        def casing() {
            item('gregtech:machine_casing', this.ordinal())
        }

        def mat() {
            material(this.materialName)
        }

    }

}
