package net.manmaed.cottonly;

import net.manmaed.cottonly.blocks.CBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CottonlyClient {

    public static void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(CBlocks.COTTON_PLANT.get(), renderType -> renderType == RenderType.getCutout() || renderType == RenderType.getTranslucent());
    }
}
