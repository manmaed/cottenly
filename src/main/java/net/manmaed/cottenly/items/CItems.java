package net.manmaed.cottenly.items;

import net.manmaed.cottenly.Cottenly;
import net.manmaed.cottenly.blocks.CBlocks;
import net.manmaed.cottenly.libs.RefHelper;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CItems {

    @ObjectHolder(RefHelper.Register + "cotten_seeds")
    public static Item cotten_seed;

    @ObjectHolder(RefHelper.Register + "ball")
    public static Item ball;

    public static void load() {
        cotten_seed = new BlockNamedItem(CBlocks.cotten_plant, (new Item.Properties().group(Cottenly.itemGroup))).setRegistryName("cotten_seeds");
        ball = new Item(new Item.Properties().group(Cottenly.itemGroup)).setRegistryName("ball");

        Cottenly.getRegisteryHandler().registerItem(cotten_seed);
        Cottenly.getRegisteryHandler().registerItem(ball);
    }

}
