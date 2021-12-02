package net.manmaed.cottonly.items;

import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.blocks.CBlocks;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cottonly.MOD_ID);

    public static final RegistryObject<Item> COTTON_SEED = ITEMS.register("cotton_seeds", () -> new ItemNameBlockItem(CBlocks.COTTON_PLANT.get(), (new Item.Properties().tab(Cottonly.itemGroup))));
    public static final RegistryObject<Item> COTTON_BALL = ITEMS.register("ball", () -> new Item(new Item.Properties().tab(Cottonly.itemGroup)));
    public static final RegistryObject<Item> COTTON_HAT = ITEMS.register("cotton_hat", () -> new CDyeableArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlot.HEAD, (new Item.Properties().tab(Cottonly.itemGroup))));
    public static final RegistryObject<Item> COTTON_SHIRT = ITEMS.register("cotton_shirt", () -> new CDyeableArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlot.CHEST, (new Item.Properties().tab(Cottonly.itemGroup))));
    public static final RegistryObject<Item> COTTON_TROUSERS = ITEMS.register("cotton_trousers", () -> new CDyeableArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlot.LEGS, (new Item.Properties().tab(Cottonly.itemGroup))));
    public static final RegistryObject<Item> COTTON_SOCKS = ITEMS.register("cotton_socks", () -> new CDyeableArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlot.FEET, (new Item.Properties().tab(Cottonly.itemGroup))));

}
