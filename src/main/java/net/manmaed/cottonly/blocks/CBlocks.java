package net.manmaed.cottonly.blocks;

import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.items.CItems;
import net.manmaed.cottonly.libs.RefHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RefHelper.MOD_ID);

    public static final RegistryObject<Block> COTTON_PLANT = BLOCKS.register("cotton_plant", () -> new CottonPlant(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().zeroHardnessAndResistance().sound(SoundType.CROP)));
    public static final RegistryObject<Item> COTTON_PLANT_ITEM = CItems.ITEMS.register("cotton_plant", () -> new BlockItem(COTTON_PLANT.get(), new Item.Properties().group(Cottonly.itemGroup)));
}