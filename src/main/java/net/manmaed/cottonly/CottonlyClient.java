package net.manmaed.cottonly;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.manmaed.cottonly.blocks.CBlocks;
import net.manmaed.cottonly.items.CItems;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.DyeableItem;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CottonlyClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CBlocks.COTTON_PLANT);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
            if(stack.getItem() instanceof DyeableItem dyeableItem) {
                return dyeableItem.getColor(stack);
            }else {
                return 1;
            }
        }, CItems.COTTON_HAT, CItems.COTTON_SHIRT, CItems.COTTON_TROUSERS, CItems.COTTON_SOCKS);
    }
}
