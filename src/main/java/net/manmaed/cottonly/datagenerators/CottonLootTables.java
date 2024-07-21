package net.manmaed.cottonly.datagenerators;

import com.google.common.collect.Sets;
import net.manmaed.cottonly.Cottonly;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.WritableRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CottonLootTables extends LootTableProvider {
    public CottonLootTables(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, Set.of(), List.of(new SubProviderEntry(CottonBlockLootTables::new, LootContextParamSets.BLOCK)), completableFuture);
    }

    @Override
    protected void validate(WritableRegistry<LootTable> writableregistry, ValidationContext validationcontext, ProblemReporter.Collector problemreporter$collector) {
        var cottonLootTablesId = BuiltInLootTables.all()
                .stream()
                .filter(id -> id.registry().getNamespace().equals(Cottonly.MOD_ID))
                .collect(Collectors.toSet());

        for (var id: Sets.difference(cottonLootTablesId, writableregistry.keySet())) {
            validationcontext.reportProblem("Missing built-in table: " + id);
        }

        writableregistry.forEach((lootTable -> lootTable.validate(validationcontext)));
    }
}
