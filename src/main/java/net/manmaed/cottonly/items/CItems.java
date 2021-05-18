package net.manmaed.cottonly.items;

import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.blocks.CBlocks;
import net.manmaed.cottonly.libs.RefHelper;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CItems {

    @ObjectHolder(RefHelper.Register + "cotton_seeds")
    public static Item cotton_seed;

    @ObjectHolder(RefHelper.Register + "ball")
    public static Item ball;

    public static void load() {
        cotton_seed = new BlockNamedItem(CBlocks.cotton_plant, (new Item.Properties().group(Cottonly.itemGroup))).setRegistryName("cotton_seeds");
        ball = new Item(new Item.Properties().group(Cottonly.itemGroup)).setRegistryName("ball");

        Cottonly.getRegisteryHandler().registerItem(cotton_seed);
        Cottonly.getRegisteryHandler().registerItem(ball);
    }

}
