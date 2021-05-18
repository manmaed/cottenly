package net.manmaed.cottonly.blocks;

import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.libs.RefHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CBlocks {

    @ObjectHolder(RefHelper.Register + "cotton_plant")
    public static Block cotton_plant;

    public static void load() {
        cotton_plant = new CottonPlant(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().zeroHardnessAndResistance().sound(SoundType.CROP)).setRegistryName("cotton_plant");


        Cottonly.getRegisteryHandler().registerBlock(cotton_plant);
    }

}
