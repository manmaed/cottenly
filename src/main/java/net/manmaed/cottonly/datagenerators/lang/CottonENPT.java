package net.manmaed.cottonly.datagenerators.lang;

import net.manmaed.cottonly.Cottonly;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class CottonENPT extends LanguageProvider {
    public CottonENPT(PackOutput output) {
        super(output, Cottonly.MOD_ID, "en_pt");
    }

    @Override
    protected void addTranslations() {
            add("a.lang.file.name", "Pirate Speak");
            add("a.lang.author.name", "manmaed");
            add("itemGroup." + Cottonly.MOD_ID, "Cottonly");
            add("item.cottonly.cotton_ball", "Ball o' Stuffin");
            add("item.cottonly.cotton_seeds", "Seeds o' Stuffin");
            add("item.cottonly.cotton_hat", "Bandana o' Raggs");
            add("item.cottonly.cotton_shirt", "Jacket 'o Raggs");
            add("item.cottonly.cotton_trousers", "Breeches o' Raggs");
            add("item.cottonly.cotton_socks", "Peg-leg o' Raggs");
            add("block.cottonly.cotton_plant", "Stuffin harvest");
    }
}
