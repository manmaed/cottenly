package net.manmaed.cottonly.items;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.DyeableLeatherItem;
import net.minecraft.world.item.ItemStack;

/**
 * Just getColor copy paste from (changed defult color) {@link net.minecraft.world.item.DyeableLeatherItem}
 */
public interface CIDyeableArmorItem extends DyeableLeatherItem {

    @Override
    default int getColor(ItemStack stack) {
        CompoundTag compoundTag = stack.getTagElement("display");
        return compoundTag != null && compoundTag.contains("color", 99) ? compoundTag.getInt("color") : 16448250;
    }
}
