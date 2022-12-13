package net.manmaed.cottonly.items;

import net.manmaed.cottonly.Cottonly;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.DyeableArmorItem;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

/**
 * mostly copy paste from (it auto gened the constrcture) {@link net.minecraft.world.item.DyeableArmorItem}
 */
public class CArmorItem extends DyeableArmorItem {
    public CArmorItem(ArmorMaterial materialIn, EquipmentSlot slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    @Override
    public int getColor(ItemStack stack) {
        CompoundTag compoundTag = stack.getTagElement("display");
        return compoundTag != null && compoundTag.contains("color", 99) ? compoundTag.getInt("color") : 16448250;
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        String armorloc = Cottonly.MOD_ID + ":textures/models/armor/cotton_armor_material_layer_";
        if (type == null) {
            return armorloc + (slot == EquipmentSlot.LEGS ? "2" : "1") + ".png";
        } else {
            return armorloc + (slot == EquipmentSlot.LEGS ? "2" : "1") + "_" + type + ".png";
        }
    }
}
