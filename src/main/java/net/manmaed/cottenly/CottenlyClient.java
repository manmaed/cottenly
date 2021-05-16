package net.manmaed.cottenly;

import net.manmaed.cottenly.blocks.CBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CottenlyClient {

    public static void doClientStuff(final FMLClientSetupEvent event) {
        /*RenderTypeLookup.setRenderLayer(LIGHTBULB.get(), renderType -> renderType == RenderType.getSolid() || renderType == RenderType.getTranslucent());*/
        RenderTypeLookup.setRenderLayer(CBlocks.cotten_plant, renderType -> renderType == RenderType.getCutout() || renderType == RenderType.getTranslucent());
    }
}
