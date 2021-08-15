package net.manmaed.cottonly;

import net.manmaed.cottonly.config.CottonConfig;
import net.manmaed.cottonly.libs.RefHelper;
import net.manmaed.cottonly.libs.RegisterHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Created by manmaed on 16/05/2021.
 */

@Mod(RefHelper.id)
public class Cottonly {
    /*
     * TODOs:
     *
     */
    private static RegisterHandler registeryHandler;

    public static final ItemGroup itemGroup = new ItemGroup(RefHelper.id) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.WITHER_ROSE);
        }
    };

    public Cottonly() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(CottonlyClient::doClientStuff);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CottonConfig.COMMON_CONFIG);
        /*ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CottonConfig.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, CottonConfig.SERVER_CONFIG);*/
        registeryHandler = new RegisterHandler();
        /*MinecraftForge.EVENT_BUS.addListener(LootHandler::loadLoot);*/
    }

    public static RegisterHandler getRegisteryHandler() {
        return registeryHandler;
    }

    private void init(FMLCommonSetupEvent event) {
    }

}
