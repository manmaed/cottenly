package net.manmaed.cottonly.datagenerators;

import net.manmaed.cottonly.Cottonly;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class CottonBlockModelProvider extends BlockModelProvider {
    public CottonBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Cottonly.MOD_ID, existingFileHelper);
    }

    private ResourceLocation getLoc(String loc){
        return ResourceLocation.fromNamespaceAndPath(Cottonly.MOD_ID, loc);
    }

    @Override
    protected void registerModels() {
        makeCrop("0");
        makeCrop("1");
        makeCrop("2");
        makeCrop("3");
        makeCrop("4");
        makePlant("cotton_plant");
    }

    public void makeCrop(String number) {
        getBuilder("cotton_plant_" + number).parent(new ModelFile.UncheckedModelFile("block/crop"))
                .renderType("cutout")
                .texture("crop", getLoc("block/cotton_stage_" + number));
    }

    public void makePlant(String name) {
        getBuilder(name).parent(new ModelFile.UncheckedModelFile("block/crop"))
                .renderType("cutout")
                .texture("crop", getLoc("block/cotton_stage_0"))
                .texture("all", getLoc("block/cotton_stage_0"));
    }
}
