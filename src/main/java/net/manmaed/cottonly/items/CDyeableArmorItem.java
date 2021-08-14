package net.manmaed.cottonly.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;

/**
 * mostly copy paste from (it auto gened the constrcture) {@link net.minecraft.item.DyeableArmorItem}
 */
public class CDyeableArmorItem extends ArmorItem implements CIDyeableArmorItem {
    public CDyeableArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }
}
