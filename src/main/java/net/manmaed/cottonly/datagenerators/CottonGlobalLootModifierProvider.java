package net.manmaed.cottonly.datagenerators;

import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.items.CItems;
import net.manmaed.cottonly.loot.FernModifier;
import net.manmaed.cottonly.loot.LargeFernModifier;
import net.manmaed.cottonly.loot.ShortGrassModifier;
import net.manmaed.cottonly.loot.TallGrassModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class CottonGlobalLootModifierProvider extends GlobalLootModifierProvider {

    private Float seedChance = 0.1F;
    private ItemStack cotton = new ItemStack(CItems.COTTON_SEED.get());
    public CottonGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture, Cottonly.MOD_ID);
    }

    @Override
    protected void start() {
        add("cotton_from_short_grass", new ShortGrassModifier(lootItemConditions(seedChance, getMCLoc("short_grass")), cotton));
        add("cotton_from_tall_grass", new TallGrassModifier(lootItemConditions(seedChance, getMCLoc("tall_grass")), cotton));
        add("cotton_from_fern", new FernModifier(lootItemConditions(seedChance, getMCLoc("fern")), cotton));
        add("cotton_from_large_fern", new LargeFernModifier(lootItemConditions(seedChance, getMCLoc("large_fern")), cotton));
    }

    private ResourceLocation getMCLoc(String block_name) {
        return ResourceLocation.fromNamespaceAndPath("minecraft","blocks/" + block_name);
    }
    private static LootItemCondition[] lootItemConditions(float chance, ResourceLocation table) {
        return new LootItemCondition[] {
                LootItemRandomChanceCondition.randomChance(chance).build(), LootTableIdCondition.builder(table).build()
        };
    }
}
