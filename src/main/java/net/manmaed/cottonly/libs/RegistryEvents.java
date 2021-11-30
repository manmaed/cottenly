package net.manmaed.cottonly.libs;

import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.config.CottonConfig;
import net.manmaed.cottonly.loot.GrassSeedModifier;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Created by manmaed on 24/03/2020
 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {

    @SubscribeEvent
    public static void onGlobalLootModifier(final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        if (!CottonConfig.REMOVE_GRASS_LOOT_TABLE.get()) {
            event.getRegistry().register(new GrassSeedModifier().setRegistryName(Cottonly.MOD_ID, "cotton_seed_drops"));
        }
    }
}