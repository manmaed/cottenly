package net.manmaed.cottonly.blocks;

import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.items.CItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Cottonly.MOD_ID);

    public static final DeferredBlock<Block> COTTON_PLANT = BLOCKS.register("cotton_plant", () -> new CottonPlant(BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.CROP)));
    public static final DeferredItem<Item> COTTON_PLANT_ITEM = CItems.ITEMS.register("cotton_plant", () -> new BlockItem(COTTON_PLANT.get(), new Item.Properties()));
}