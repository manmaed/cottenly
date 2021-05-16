package net.manmaed.cottenly.blocks;

import net.manmaed.cottenly.Cottenly;
import net.manmaed.cottenly.libs.RefHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CBlocks {

    @ObjectHolder(RefHelper.Register + "cottenplant")
    public static Block cottenplant;

    public static void load() {
        cottenplant = new CottenPlant(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().zeroHardnessAndResistance().sound(SoundType.CROP)).setRegistryName("cottenplant");


        Cottenly.getRegisteryHandler().registerBlock(cottenplant);
    }

}
