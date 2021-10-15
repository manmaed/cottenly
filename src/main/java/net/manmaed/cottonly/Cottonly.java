package net.manmaed.cottonly;

import net.manmaed.cottonly.blocks.CBlocks;
import net.manmaed.cottonly.config.CottonConfig;
import net.manmaed.cottonly.items.CItems;
import net.manmaed.cottonly.libs.RefHelper;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Created by manmaed on 16/05/2021.
 */

@Mod(RefHelper.MOD_ID)
public class Cottonly {
    /*
     * TODOs:
     *
     */

    public static final ItemGroup itemGroup = new ItemGroup(RefHelper.MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.WITHER_ROSE);
        }
    };

    public Cottonly() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CItems.ITEMS.register(eventBus);
        CBlocks.BLOCKS.register(eventBus);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(CottonlyClient::doClientStuff);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CottonConfig.COMMON_CONFIG);
        /*ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CottonConfig.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, CottonConfig.SERVER_CONFIG);*/
        /*MinecraftForge.EVENT_BUS.addListener(LootHandler::loadLoot);*/
    }


    private void init(FMLCommonSetupEvent event) {
        registerCompostable(0.65F, CItems.COTTEN_SEED.get());
    }

    private static void registerCompostable(float chance, IItemProvider itemIn) {
        ComposterBlock.CHANCES.put(itemIn.asItem(), chance);
    }

}
