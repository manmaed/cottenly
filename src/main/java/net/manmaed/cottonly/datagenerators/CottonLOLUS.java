package net.manmaed.cottonly.datagenerators;

import net.manmaed.cottonly.Cottonly;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class CottonLOLUS extends LanguageProvider {
    public CottonLOLUS(PackOutput output) {
        super(output, Cottonly.MOD_ID, "lol_us");
    }

    @Override
    protected void addTranslations() {
            add("a.lang.file.name", "LOLCAT");
            add("a.lang.author.name", "manmaed");
            add("itemGroup." + Cottonly.MOD_ID, "Cottonly");
            add("item.cottonly.cotton_ball", "Boll of fluffz");
            add("item.cottonly.cotton_seeds", "Cottnz Sedz");
            add("item.cottonly.cotton_hat", "Cottnz Kap");
            add("item.cottonly.cotton_shirt", "Cottnz Jackett");
            add("item.cottonly.cotton_trousers", "Cottnz Pantz");
            add("item.cottonly.cotton_socks", "Cottnz Butz");
            add("block.cottonly.cotton_plant", "Cottnz Cropz");
    }
}
