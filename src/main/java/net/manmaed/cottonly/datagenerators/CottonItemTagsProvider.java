package net.manmaed.cottonly.datagenerators;

import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.items.CItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CottonItemTagsProvider extends ItemTagsProvider {


    public CottonItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture, CompletableFuture<TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, blockTagProvider, Cottonly.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookup) {
        tag(ItemTags.DYEABLE).add(CItems.COTTON_HAT.asItem());
        tag(ItemTags.DYEABLE).add(CItems.COTTON_SHIRT.asItem());
        tag(ItemTags.DYEABLE).add(CItems.COTTON_TROUSERS.asItem());
        tag(ItemTags.DYEABLE).add(CItems.COTTON_SOCKS.asItem());
    }
}
