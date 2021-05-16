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

    @ObjectHolder(RefHelper.Register + "cotten_plant")
    public static Block cotten_plant;

    public static void load() {
        cotten_plant = new CottenPlant(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().zeroHardnessAndResistance().sound(SoundType.CROP)).setRegistryName("cotten_plant");


        Cottenly.getRegisteryHandler().registerBlock(cotten_plant);
    }

}
