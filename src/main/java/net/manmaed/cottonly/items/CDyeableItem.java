package net.manmaed.cottonly.items;

import net.minecraft.item.DyeableItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

//16448250
public interface CDyeableItem extends DyeableItem {
    String COLOR_KEY = "color";
    String DISPLAY_KEY = "display";
    int DEFAULT_COLOR = 16448250;
    @Override
    default boolean hasColor(ItemStack stack) {
        NbtCompound nbtCompound = stack.getSubNbt("display");
        return nbtCompound != null && nbtCompound.contains("color", 99);
    }

    @Override
    default int getColor(ItemStack stack) {
        NbtCompound nbtCompound = stack.getSubNbt("display");
        return nbtCompound != null && nbtCompound.contains("color", 99) ? nbtCompound.getInt("color") : 16448250;
    }

    @Override
    default void removeColor(ItemStack stack) {
        NbtCompound nbtCompound = stack.getSubNbt("display");
        if (nbtCompound != null && nbtCompound.contains("color")) {
            nbtCompound.remove("color");
        }

    }

    @Override
    default void setColor(ItemStack stack, int color) {
        stack.getOrCreateSubNbt("display").putInt("color", color);
    }

}
