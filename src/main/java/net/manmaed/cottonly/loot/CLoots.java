package net.manmaed.cottonly.loot;


import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.manmaed.cottonly.items.CItems;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;

/**
 * Created by manmaed on 04/12/2021.
 */
public class CLoots {
    public static void doLootEvent() {
        LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) ->
        {
            if (source.isBuiltin() && Blocks.GRASS.getLootTableId().equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .with(ItemEntry.builder(CItems.COTTON_SEED));
                tableBuilder.pool(poolBuilder);
            }
            if (source.isBuiltin() && Blocks.FERN.getLootTableId().equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .with(ItemEntry.builder(CItems.COTTON_SEED));
                tableBuilder.pool(poolBuilder);
            }
        }));
    }
}
