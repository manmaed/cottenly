package net.manmaed.cottonly.blocks;

import net.manmaed.cottonly.items.CItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CottonPlant extends CropBlock {
    public CottonPlant(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public ItemConvertible getSeedsItem() {
        return CItems.COTTON_SEED;
    }


    /*@Override
    public PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return PlantType.CROP;
    }

    @Override
    public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> itemStack) {
        itemStack.add(new ItemStack(CItems.COTTON_SEED.get()));
    }*/
}
