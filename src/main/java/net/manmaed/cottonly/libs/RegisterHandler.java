package net.manmaed.cottonly.libs;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.ArrayList;

/**
 * Created by manmaed on 24/03/2020
 */
public class RegisterHandler {
    private final ArrayList<Block> blocks = new ArrayList<>();
    private final ArrayList<Item> items = new ArrayList<>();
    public ArrayList<Block> getRegisteredBlocks() {
        return blocks;
    }
    public void registerBlock(Block block) {
        blocks.add(block);
    }
    public ArrayList<Item> getRegisteredItems() {
        return items;
    }
    public void registerItem(Item item) {
        this.items.add(item);
    }
}
