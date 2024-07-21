package net.manmaed.cottonly.datagenerators.lang;

import net.manmaed.cottonly.Cottonly;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class CottonENUS extends LanguageProvider {
    public CottonENUS(PackOutput output) {
        super(output, Cottonly.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
            add("a.lang.file.name", "English US");
            add("a.lang.author.name", "manmaed");
            add("itemGroup." + Cottonly.MOD_ID, "Cottonly");
            add("item.cottonly.cotton_ball", "Cotton Ball");
            add("item.cottonly.cotton_seeds", "Cotton Seeds");
            add("item.cottonly.cotton_hat", "Cotton Hat");
            add("item.cottonly.cotton_shirt", "Cotton Shirt");
            add("item.cottonly.cotton_trousers", "Cotton Trousers");
            add("item.cottonly.cotton_socks", "Cotton Socks");
            add("block.cottonly.cotton_plant", "Cotton Crops");
    }
}
