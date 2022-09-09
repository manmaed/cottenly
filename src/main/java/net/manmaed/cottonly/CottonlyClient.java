package net.manmaed.cottonly;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.manmaed.cottonly.blocks.CBlocks;
import net.minecraft.client.render.RenderLayer;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CottonlyClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CBlocks.COTTON_PLANT);
    }
}
