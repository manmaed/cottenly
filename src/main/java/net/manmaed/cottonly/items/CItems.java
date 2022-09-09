package net.manmaed.cottonly.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.blocks.CBlocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Created by manmaed on 16/05/2021.
 */
public class CItems {



    public static final Item COTTON_SEED = new AliasedBlockItem(CBlocks.COTTON_PLANT, (new FabricItemSettings().group(Cottonly.itemGroup)));
    public static final Item COTTON_BALL = new Item(new FabricItemSettings().group(Cottonly.itemGroup));
    public static final Item COTTON_HAT = new CArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlot.HEAD, (new FabricItemSettings().group(Cottonly.itemGroup)));
    public static final Item COTTON_SHIRT = new CArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlot.CHEST, (new FabricItemSettings().group(Cottonly.itemGroup)));
    public static final Item COTTON_TROUSERS = new CArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlot.LEGS, (new FabricItemSettings().group(Cottonly.itemGroup)));
    public static final Item COTTON_SOCKS = new CArmorItem(ArmorMaterialCotton.COTTON, EquipmentSlot.FEET, (new FabricItemSettings().group(Cottonly.itemGroup)));
    public static void doItemRegistery() {
        Registry.register(Registry.ITEM, getId("cotton_seeds"), COTTON_SEED);
        Registry.register(Registry.ITEM, getId("ball"), COTTON_BALL);
        Registry.register(Registry.ITEM, getId("cotton_hat"), COTTON_HAT);
        Registry.register(Registry.ITEM, getId("cotton_shirt"), COTTON_SHIRT);
        Registry.register(Registry.ITEM, getId("cotton_trousers"), COTTON_TROUSERS);
        Registry.register(Registry.ITEM, getId("cotton_socks"), COTTON_SOCKS);
    }

    private static Identifier getId(String name) {
        return new Identifier(Cottonly.MOD_ID, name);
    }
}
