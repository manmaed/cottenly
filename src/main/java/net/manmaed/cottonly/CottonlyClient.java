package net.manmaed.cottonly;


import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CottonlyClient {

    public static void doClientStuff(final FMLClientSetupEvent event) {
        //ItemBlockRenderTypes.setRenderLayer(CBlocks.COTTON_PLANT.get(), RenderType.cutout());
        /*ItemColors itemcolors = new ItemColors();
        itemcolors.register(
                //Default Leather? -6265536
                (item, color) -> color > 0 ? -1 : DyedItemColor.getOrDefault(item, -16777215),
                CItems.COTTON_HAT,
                CItems.COTTON_SHIRT,
                CItems.COTTON_TROUSERS,
                CItems.COTTON_SOCKS
        );*/
    }

    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        /*ItemColors itemcolors = new ItemColors();
        itemcolors.register(
                //Default Leather? -6265536
                (item, color) -> color > 0 ? -1 : DyedItemColor.getOrDefault(item, -16777215),
                CItems.COTTON_HAT,
                CItems.COTTON_SHIRT,
                CItems.COTTON_TROUSERS,
                CItems.COTTON_SOCKS
        );*/

    }
}
