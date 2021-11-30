package net.manmaed.cottonly;

import net.manmaed.cottonly.blocks.CBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CottonlyClient {

    public static void doClientStuff(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(CBlocks.COTTON_PLANT.get(), RenderType.cutout());
    }
}
