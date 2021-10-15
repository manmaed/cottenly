package net.manmaed.cottonly.items;

import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.blocks.CBlocks;
import net.manmaed.cottonly.libs.RefHelper;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RefHelper.MOD_ID);

    public static final RegistryObject<Item> COTTEN_SEED = ITEMS.register("cotton_seeds", () -> new BlockNamedItem(CBlocks.COTTEN_PLANT.get(), (new Item.Properties().group(Cottonly.itemGroup))));
    public static final RegistryObject<Item> COTTEN_BALL = ITEMS.register("ball", () -> new Item(new Item.Properties().group(Cottonly.itemGroup)));
    public static final RegistryObject<Item> COTTEN_HAT = ITEMS.register("cotton_hat", () -> new CDyeableArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlotType.HEAD, (new Item.Properties().group(Cottonly.itemGroup))));
    public static final RegistryObject<Item> COTTEN_SHIRT = ITEMS.register("cotton_shirt", () -> new CDyeableArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlotType.CHEST, (new Item.Properties().group(Cottonly.itemGroup))));
    public static final RegistryObject<Item> COTTEN_TROUSERS = ITEMS.register("cotton_trousers", () -> new CDyeableArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlotType.LEGS, (new Item.Properties().group(Cottonly.itemGroup))));
    public static final RegistryObject<Item> COTTEN_SOCKS = ITEMS.register("cotton_socks", () -> new CDyeableArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlotType.FEET, (new Item.Properties().group(Cottonly.itemGroup))));

}
