package net.manmaed.cottonly.loot;


import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.manmaed.cottonly.items.CItems;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

/**
 * Created by manmaed on 04/12/2021.
 */
public class CLoots {
    public static void doLootEvent() {
        LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) ->
        {
            if (source.isBuiltin() && Blocks.GRASS.getLootTableId().equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35F))
                        .with(ItemEntry.builder(CItems.COTTON_SEED));
                tableBuilder.pool(poolBuilder);
            }
            if (source.isBuiltin() && Blocks.FERN.getLootTableId().equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35F))
                        .with(ItemEntry.builder(CItems.COTTON_SEED));
                tableBuilder.pool(poolBuilder);
            }
            if (source.isBuiltin() && Blocks.TALL_GRASS.getLootTableId().equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35F))
                        .with(ItemEntry.builder(CItems.COTTON_SEED));
                tableBuilder.pool(poolBuilder);
            }
            if (source.isBuiltin() && Blocks.LARGE_FERN.getLootTableId().equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35F))
                        .with(ItemEntry.builder(CItems.COTTON_SEED));
                tableBuilder.pool(poolBuilder);
            }
        }));
    }
}
