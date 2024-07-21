package net.manmaed.cottonly.blocks;

import net.manmaed.cottonly.items.CItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CottonPlant extends CropBlock {
    public CottonPlant(Properties builder) {
        super(builder);
    }

    @Override
    public ItemLike getBaseSeedId() {
        return CItems.COTTON_SEED.get();
    }
}
