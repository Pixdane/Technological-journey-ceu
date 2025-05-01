import gregtech.api.fluids.FluidState
import gregtech.api.fluids.store.FluidStorageKeys
import gregtech.api.unification.material.Material
import gregtech.api.unification.material.properties.FluidProperty
import gregtech.api.unification.material.properties.PropertyKey
import gregtech.api.util.FluidTooltipUtil
import net.minecraftforge.fluids.FluidStack
import org.apache.commons.lang3.StringUtils

Material.metaClass.addFluid << { FluidStack stack ->
    f = stack.getFluid()
    property = delegate.getProperty(PropertyKey.FLUID)
    if (!property) {
        property = new FluidProperty()
        delegate.@properties.setProperty(PropertyKey.FLUID, property)
    }
    property.store(FluidStorageKeys.LIQUID, f)

    FluidTooltipUtil.registerTooltip(f, FluidTooltipUtil.createFluidTooltip(delegate, f, FluidState.LIQUID))
    delegate
}

String.metaClass.toSnakeCase = { ->
    StringUtils.splitByCharacterTypeCamelCase(delegate)
            *.toUpperCase()
            .join('_')
}
