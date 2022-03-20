package net.manmaed.cottonly.loot;

import net.manmaed.cottonly.Cottonly;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Created by manmaed on 04/12/2021.
 */
public class CLoots {
    public static final DeferredRegister<GlobalLootModifierSerializer<?>> LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.LOOT_MODIFIER_SERIALIZERS, Cottonly.MOD_ID);

    public static final RegistryObject<GrassSeedModifier.Serializer> GRASS_SEED_MODIFIER = LOOT_MODIFIERS.register("cotton_seed_drops", GrassSeedModifier.Serializer::new);
}
