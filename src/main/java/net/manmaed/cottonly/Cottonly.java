package net.manmaed.cottonly;

import net.manmaed.cottonly.blocks.CBlocks;
import net.manmaed.cottonly.config.CottonConfig;
import net.manmaed.cottonly.items.CItems;
import net.manmaed.cottonly.libs.LogHelper;
import net.manmaed.cottonly.loot.CLoots;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.jline.utils.Log;

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

    /*public static final CreativeModeTab itemGroup = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.WITHER_ROSE);
        }
    };*/

    public Cottonly() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CItems.ITEMS.register(eventBus);
        CBlocks.BLOCKS.register(eventBus);
        eventBus.addListener(this::init);
        CLoots.LOOT_MODIFIERS.register(eventBus);
        eventBus.addListener(this::createTabs);
/*
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CottonConfig.COMMON_CONFIG);
*/
        /*ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CottonConfig.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, CottonConfig.SERVER_CONFIG);*/
    }

    private void init(FMLCommonSetupEvent event) {
        registerCompostable(0.65F, CItems.COTTON_SEED.get());
    }

    private static void registerCompostable(float chance, Item itemIn) {
        ComposterBlock.COMPOSTABLES.put(itemIn, chance);
    }

    public void createTabs(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "creative_tab"), builder -> builder
                .icon(() -> new ItemStack(Items.WITHER_ROSE))
                .title(Component.translatable("itemGroup." + MOD_ID))
                .displayItems((features, output, hasPrems) -> {
                    for (Item item : ForgeRegistries.ITEMS.getValues()) {
                        if (item.getCreatorModId(item.getDefaultInstance()).equals(MOD_ID)) {
                            if (!item.toString().equals("cotton_plant")) {
                                output.accept(item);
                            }
                        }
                    }
                })
        );
    }

}
