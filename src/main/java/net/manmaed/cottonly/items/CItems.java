package net.manmaed.cottonly.items;

import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.blocks.CBlocks;
import net.manmaed.cottonly.libs.RefHelper;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CItems {

    @ObjectHolder(RefHelper.Register + "cotton_seeds")
    public static Item cotton_seed;

    @ObjectHolder(RefHelper.Register + "ball")
    public static Item ball;

    @ObjectHolder(RefHelper.Register + "cotton_hat")
    public static Item hat;

    @ObjectHolder(RefHelper.Register + "cotton_shirt")
    public static Item shirt;

    @ObjectHolder(RefHelper.Register + "cotton_trousers")
    public static Item trousers;

    @ObjectHolder(RefHelper.Register + "cotton_socks")
    public static Item socks;


    public static void load() {
        cotton_seed = new BlockNamedItem(CBlocks.cotton_plant, (new Item.Properties().group(Cottonly.itemGroup))).setRegistryName("cotton_seeds");
        ball = new Item(new Item.Properties().group(Cottonly.itemGroup)).setRegistryName("ball");
        hat = new CDyeableArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlotType.HEAD, (new Item.Properties().group(Cottonly.itemGroup))).setRegistryName("cotton_hat");
        shirt = new CDyeableArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlotType.CHEST, (new Item.Properties().group(Cottonly.itemGroup))).setRegistryName("cotton_shirt");
        trousers = new CDyeableArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlotType.LEGS, (new Item.Properties().group(Cottonly.itemGroup))).setRegistryName("cotton_trousers");
        socks = new CDyeableArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlotType.FEET, (new Item.Properties().group(Cottonly.itemGroup))).setRegistryName("cotton_socks");

        Cottonly.getRegisteryHandler().registerItem(cotton_seed);
        Cottonly.getRegisteryHandler().registerItem(ball);
        Cottonly.getRegisteryHandler().registerItem(hat);
        Cottonly.getRegisteryHandler().registerItem(shirt);
        Cottonly.getRegisteryHandler().registerItem(trousers);
        Cottonly.getRegisteryHandler().registerItem(socks);
    }

}
