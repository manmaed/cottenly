package net.manmaed.cottonly.items;

import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

/**
 * Just getColor copy paste from (changed defult color) {@link net.minecraft.item.IDyeableArmorItem}
 */
public interface CIDyeableArmorItem extends IDyeableArmorItem {

    @Override
    default int getColor(ItemStack stack) {
        CompoundNBT compoundnbt = stack.getChildTag("display");
        return compoundnbt != null && compoundnbt.contains("color", 99) ? compoundnbt.getInt("color") : 16448250;
    }
}
