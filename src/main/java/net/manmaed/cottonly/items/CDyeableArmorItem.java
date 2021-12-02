package net.manmaed.cottonly.items;

import net.manmaed.cottonly.Cottonly;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

/**
 * mostly copy paste from (it auto gened the constrcture) {@link net.minecraft.world.item.DyeableArmorItem}
 */
public class CDyeableArmorItem extends ArmorItem implements CIDyeableArmorItem {
    public CDyeableArmorItem(ArmorMaterial materialIn, EquipmentSlot slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
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
