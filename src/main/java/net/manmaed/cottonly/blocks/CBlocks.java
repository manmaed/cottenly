package net.manmaed.cottonly.blocks;

import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.items.CItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Cottonly.MOD_ID);

    public static final RegistryObject<Block> COTTON_PLANT = BLOCKS.register("cotton_plant", () -> new CottonPlant(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)));
    public static final RegistryObject<Item> COTTON_PLANT_ITEM = CItems.ITEMS.register("cotton_plant", () -> new BlockItem(COTTON_PLANT.get(), new Item.Properties().tab(Cottonly.itemGroup)));
}