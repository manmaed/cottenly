package net.manmaed.cottonly.blocks;

import net.manmaed.cottonly.items.CItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraftforge.common.PlantType;

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

    @Override
    public PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return PlantType.CROP;
    }

    @Override
    public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> itemStack) {
        itemStack.add(new ItemStack(CItems.COTTON_SEED.get()));
    }
}
