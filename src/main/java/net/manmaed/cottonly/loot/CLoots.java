package net.manmaed.cottonly.loot;

import com.mojang.serialization.Codec;
import net.manmaed.cottonly.Cottonly;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;


/**
 * Created by manmaed on 04/12/2021.
 */
public class CLoots {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Cottonly.MOD_ID);
    public static final DeferredHolder<Codec<? extends IGlobalLootModifier>, Codec<GrassSeedModifier>> COTTON_FROM_SHORT_GRASS = LOOT_MODIFIERS.register("cotton_from_short_grass", () -> GrassSeedModifier.CODEC);
    public static final DeferredHolder<Codec<? extends IGlobalLootModifier>, Codec<GrassSeedModifier2>> COTTON_FROM_FERN = LOOT_MODIFIERS.register("cotton_from_fern", () -> GrassSeedModifier2.CODEC);
    public static final DeferredHolder<Codec<? extends IGlobalLootModifier>, Codec<GrassSeedModifier3>> COTTON_FROM_TALL_GRASS = LOOT_MODIFIERS.register("cotton_from_tall_grass", () -> GrassSeedModifier3.CODEC);
    public static final DeferredHolder<Codec<? extends IGlobalLootModifier>, Codec<GrassSeedModifier4>> COTTON_FROM_LARGE_FERN = LOOT_MODIFIERS.register("cotton_from_large_fern", () -> GrassSeedModifier4.CODEC);
}
