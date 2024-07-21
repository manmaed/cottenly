package net.manmaed.cottonly.items;


import net.manmaed.cottonly.Cottonly;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

/**
 * Complete copy & paste from {@link net.minecraft.world.item.ArmorMaterials}
 * then edited to make look good :-)
 */
public class ArmorMaterialCotton {
    public static final Holder<ArmorMaterial> COTTON = register("cotton", Util.make(new EnumMap<>(ArmorItem.Type.class), type ->  {
        type.put(ArmorItem.Type.BOOTS, 1);
        type.put(ArmorItem.Type.LEGGINGS, 2);
        type.put(ArmorItem.Type.CHESTPLATE, 3);
        type.put(ArmorItem.Type.HELMET, 1);
    }), 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0F ,0F,() -> Ingredient.of(CItems.COTTON_BALL),
            List.of(
                    new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Cottonly.MOD_ID, "cotton"),"", true),
                    new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Cottonly.MOD_ID, "cotton"),"_overlay", false)
            )
    );



    private static Holder<ArmorMaterial> register(
            String name,
            EnumMap<ArmorItem.Type, Integer> protectionFunctionForType,
            int durabilityMultiplier,
            Holder<SoundEvent> sound,
            float toughness,
            float knockbackResistance,
            Supplier<Ingredient> repairIngredient
    ) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Cottonly.MOD_ID, name)));
        return register(name, protectionFunctionForType, durabilityMultiplier, sound ,toughness, knockbackResistance, repairIngredient, list);
    }
    private static Holder<ArmorMaterial> register(
            String name,
            EnumMap<ArmorItem.Type, Integer> protectionFunctionForType,
            int durabilityMultiplier,
            Holder<SoundEvent> sound,
            float toughness,
            float knockbackResistance,
            Supplier<Ingredient> repairIngredient,
            List<ArmorMaterial.Layer> list
    ) {
        EnumMap<ArmorItem.Type, Integer> enummap = new EnumMap<>(ArmorItem.Type.class);

        for (ArmorItem.Type armoritem$type : ArmorItem.Type.values()) {
            enummap.put(armoritem$type, protectionFunctionForType.get(armoritem$type));
        }

        return Registry.registerForHolder(
                BuiltInRegistries.ARMOR_MATERIAL,
                ResourceLocation.fromNamespaceAndPath(Cottonly.MOD_ID, name),
                new ArmorMaterial(enummap, durabilityMultiplier, sound, repairIngredient, list, toughness, knockbackResistance)
        );
    }
}