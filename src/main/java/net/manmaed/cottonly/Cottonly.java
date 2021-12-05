package net.manmaed.cottonly;

import net.manmaed.cottonly.blocks.CBlocks;
import net.manmaed.cottonly.config.CottonConfig;
import net.manmaed.cottonly.items.CItems;
import net.manmaed.cottonly.loot.CLoots;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Created by manmaed on 16/05/2021.
 */

@Mod(Cottonly.MOD_ID)
public class Cottonly {
    public static final String MOD_ID = "cottonly";
    /*
     * TODOs:
     *
     */

    public static final CreativeModeTab itemGroup = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.WITHER_ROSE);
        }
    };

    public Cottonly() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CItems.ITEMS.register(eventBus);
        CBlocks.BLOCKS.register(eventBus);
        eventBus.addListener(this::init);
        eventBus.addListener(CottonlyClient::doClientStuff);
        if (!CottonConfig.REMOVE_GRASS_LOOT_TABLE.get()) {
            CLoots.LOOT_MODIFIERS.register(eventBus);
        }
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CottonConfig.COMMON_CONFIG);
        /*ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CottonConfig.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, CottonConfig.SERVER_CONFIG);*/
    }


    private void init(FMLCommonSetupEvent event) {
        registerCompostable(0.65F, CItems.COTTON_SEED.get());
    }

    private static void registerCompostable(float chance, Item itemIn) {
        ComposterBlock.COMPOSTABLES.put(itemIn, chance);
    }

}
