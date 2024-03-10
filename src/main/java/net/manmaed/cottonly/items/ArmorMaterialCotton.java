package net.manmaed.cottonly.items;


import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

/**
 * Complete copy paste from {@link net.minecraft.world.item.ArmorMaterials}
 */
public enum ArmorMaterialCotton implements ArmorMaterial {
    COTTON("cotton_armor_material", 5, Util.make(new EnumMap<>(ArmorItem.Type.class), type -> {
        type.put(ArmorItem.Type.BOOTS, 1);
        type.put(ArmorItem.Type.LEGGINGS, 2);
        type.put(ArmorItem.Type.CHESTPLATE, 3);
        type.put(ArmorItem.Type.HELMET, 1);
    }), 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.of(CItems.COTTON_BALL.get());
    });

    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), type -> {
        type.put(ArmorItem.Type.BOOTS, 13);
        type.put(ArmorItem.Type.LEGGINGS, 15);
        type.put(ArmorItem.Type.CHESTPLATE, 16);
        type.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ArmorMaterialCotton(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protection, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionFunctionForType = protection;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(repairMaterial);
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return HEALTH_FUNCTION_FOR_TYPE.get(type) * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionFunctionForType.get(type);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

}