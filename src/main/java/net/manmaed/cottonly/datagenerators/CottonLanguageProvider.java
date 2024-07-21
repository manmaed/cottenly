package net.manmaed.cottonly.datagenerators;

import net.manmaed.cottonly.datagenerators.lang.CottonENPT;
import net.manmaed.cottonly.datagenerators.lang.CottonENUD;
import net.manmaed.cottonly.datagenerators.lang.CottonENUS;
import net.manmaed.cottonly.datagenerators.lang.CottonLOLUS;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;

public class CottonLanguageProvider {
    public static void addTranslations(DataGenerator generator) {
        PackOutput output = generator.getPackOutput();
        generator.addProvider(true, new CottonENUS(output));
        generator.addProvider(true, new CottonENPT(output));
        generator.addProvider(true, new CottonENUD(output));
        generator.addProvider(true, new CottonLOLUS(output));
    }
}
