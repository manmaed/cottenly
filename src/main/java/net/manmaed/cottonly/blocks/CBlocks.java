package net.manmaed.cottonly.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.manmaed.cottonly.Cottonly;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



/**
 * Created by manmaed on 16/05/2021.
 */
public class CBlocks {

    public static final Block COTTON_PLANT = new CottonPlant(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Item COTTON_PLANT_ITEM = new BlockItem(CBlocks.COTTON_PLANT, (new FabricItemSettings()));

public static void doBlockRegistery() {
    Registry.register(Registry.BLOCK, getId("cotton_plant"), COTTON_PLANT );
    Registry.register(Registry.ITEM, getId("cotton_plant"), COTTON_PLANT_ITEM );

}

    private static Identifier getId(String name) {
        return new Identifier(Cottonly.MOD_ID, name);
    }

}