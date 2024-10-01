package net.manmaed.cottonly.datagenerators;

import net.manmaed.cottonly.items.CItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class CottonDataMaps extends DataMapProvider {

    public CottonDataMaps(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        builder(NeoForgeDataMaps.COMPOSTABLES)
                .add(BuiltInRegistries.ITEM.wrapAsHolder(CItems.COTTON_SEED.get()), new Compostable(0.3F, true), false)
                .add(BuiltInRegistries.ITEM.wrapAsHolder(CItems.COTTON_BALL.get()), new Compostable(0.65F), false);
        ;
    }

    /* how it should look like
      "minecraft:wheat_seeds": {
      "can_villager_compost": true,
      "chance": 0.3
    }
     */
}
