package net.manmaed.cottenly.libs;

import net.manmaed.cottenly.Cottenly;
import net.manmaed.cottenly.blocks.CBlocks;
import net.manmaed.cottenly.items.CItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Created by manmaed on 24/03/2020
 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {

    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
        CBlocks.load();
        for (Block block : Cottenly.getRegisteryHandler().getRegisteredBlocks()) {
            event.getRegistry().registerAll(block);
        }
    }

    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        CItems.load();
        for (Block block : Cottenly.getRegisteryHandler().getRegisteredBlocks()) {
            /*event.getRegistry().register(new BlockItem(new Block.Properties.from(block).setRegistryName(block.getRegistryName())));*/
            event.getRegistry().register(new BlockItem(block, new Item.Properties().group(Cottenly.itemGroup)).setRegistryName(block.getRegistryName()));
        }
        for (Item item : Cottenly.getRegisteryHandler().getRegisteredItems()) {
            event.getRegistry().register(item);
        }
    }
}