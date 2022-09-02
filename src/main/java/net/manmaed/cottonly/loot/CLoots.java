package net.manmaed.cottonly.loot;

import com.mojang.serialization.Codec;
import net.manmaed.cottonly.Cottonly;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Created by manmaed on 04/12/2021.
 */
public class CLoots {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Cottonly.MOD_ID);

    public static final RegistryObject<Codec<GrassSeedModifier>> COTTON_FROM_GRASS = LOOT_MODIFIERS.register("cotton_from_grass", () -> GrassSeedModifier.CODEC);
    public static final RegistryObject<Codec<GrassSeedModifier>> COTTON_FROM_FERN = LOOT_MODIFIERS.register("cotton_from_fern", () -> GrassSeedModifier.CODEC);
    public static final RegistryObject<Codec<GrassSeedModifier>> COTTON_FROM_TALL_GRASS = LOOT_MODIFIERS.register("cotton_from_tall_grass", () -> GrassSeedModifier.CODEC);
    public static final RegistryObject<Codec<GrassSeedModifier>> COTTON_FROM_LARGE_FERN = LOOT_MODIFIERS.register("cotton_from_large_fern", () -> GrassSeedModifier.CODEC);

}
