package net.manmaed.cottonly.loot;

import com.mojang.serialization.MapCodec;
import net.manmaed.cottonly.Cottonly;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;


/**
 * Created by manmaed on 04/12/2021.
 */
public class CLoots {

    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Cottonly.MOD_ID);
    public static final DeferredHolder<MapCodec<? extends IGlobalLootModifier>, MapCodec<ShortGrassModifier>> COTTON_FROM_SHORT_GRASS = LOOT_MODIFIERS.register("cotton_from_short_grass", () -> ShortGrassModifier.CODEC);
    public static final DeferredHolder<MapCodec<? extends IGlobalLootModifier>, MapCodec<FernModifier>> COTTON_FROM_FERN = LOOT_MODIFIERS.register("cotton_from_fern", () -> FernModifier.CODEC);
    public static final DeferredHolder<MapCodec<? extends IGlobalLootModifier>, MapCodec<TallGrassModifier>> COTTON_FROM_TALL_GRASS = LOOT_MODIFIERS.register("cotton_from_tall_grass", () -> TallGrassModifier.CODEC);
    public static final DeferredHolder<MapCodec<? extends IGlobalLootModifier>, MapCodec<LargeFernModifier>> COTTON_FROM_LARGE_FERN = LOOT_MODIFIERS.register("cotton_from_large_fern", () -> LargeFernModifier.CODEC);
}
