package net.manmaed.cottonly.datagenerators.lang;

import net.manmaed.cottonly.Cottonly;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class CottonENUD extends LanguageProvider {
    public CottonENUD(PackOutput output) {
        super(output, Cottonly.MOD_ID, "en_ud");
    }

    @Override
    protected void addTranslations() {
            add("a.lang.file.name", "ɥsᴉꞁᵷuƎ (uʍoᗡ ǝpᴉsd∩)");
            add("a.lang.author.name", "manmaed");
            add("itemGroup." + Cottonly.MOD_ID, "ʎluoʇʇoƆ");
            add("item.cottonly.cotton_ball", "llɐq uoʇʇoƆ");
            add("item.cottonly.cotton_seeds", "spǝǝS uoʇʇoƆ");
            add("item.cottonly.cotton_hat", "ʇɐH uoʇʇoƆ");
            add("item.cottonly.cotton_shirt", "ʇɹᴉɥS uoʇʇoƆ");
            add("item.cottonly.cotton_trousers", "sɹǝsnoɹʇ uoʇʇoƆ");
            add("item.cottonly.cotton_socks", "sʞɔoS uoʇʇoƆ");
            add("block.cottonly.cotton_plant", "sdoɹƆ uoʇʇoƆ");
    }
}
