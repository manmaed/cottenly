package net.manmaed.cottonly.blocks;

import net.manmaed.cottonly.items.CItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CottonPlant extends CropsBlock {
    public CottonPlant(Properties builder) {
        super(builder);
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return CItems.COTTEN_SEED.get();
    }

    @Override
    public BlockState getPlant(IBlockReader world, BlockPos pos) {
        return super.getPlant(world, pos);
    }
}
