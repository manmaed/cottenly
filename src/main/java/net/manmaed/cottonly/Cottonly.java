package net.manmaed.cottonly;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.manmaed.cottonly.blocks.CBlocks;
import net.manmaed.cottonly.items.CItems;
import net.manmaed.cottonly.loot.CLoots;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

/**
 * Created by manmaed on 16/05/2021.
 */

public class Cottonly implements ModInitializer {
    public static final String MOD_ID = "cottonly";

    /*
     * TODOs:
     * Armor Colors
     */
    @Override
    public void onInitialize() {
        CItems.doItemRegistery();
        CBlocks.doBlockRegistery();
        CLoots.doLootEvent();
        registerCompostable(0.65F, CItems.COTTON_SEED);
    }

    public static final ItemGroup itemGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "name"),
            () -> new ItemStack(Items.WITHER_ROSE));

    private static void registerCompostable(float chance, Item itemIn) {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(itemIn.asItem(), chance);
    }
}

