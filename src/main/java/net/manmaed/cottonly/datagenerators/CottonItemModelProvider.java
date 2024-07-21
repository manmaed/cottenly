package net.manmaed.cottonly.datagenerators;

import net.manmaed.cottonly.Cottonly;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class CottonItemModelProvider extends ItemModelProvider {
    public CottonItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Cottonly.MOD_ID, existingFileHelper);
    }

    private ResourceLocation getLoc(String loc){
        return ResourceLocation.fromNamespaceAndPath(Cottonly.MOD_ID, loc);
    }
    @Override
    protected void registerModels() {
        makeArmor("cotton_hat");
        makeArmor("cotton_shirt");
        makeArmor("cotton_trousers");
        makeArmor("cotton_socks");
        makeItem("cotton_seeds");
        makeItem("cotton_ball");
        makeItem("cotton_plant", "cotton_seeds");
    }

    public void makeArmor(String name) {
        getBuilder(name).parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", getLoc("item/" + name))
                .texture("layer1", getLoc("item/" + name + "_overlay"));
    }

    public void makeItem(String item) {
        makeItem(item, item);
        /*getBuilder(item).parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", getLoc("item/" + item));*/
    }
    public void makeItem(String filename, String texture) {
        getBuilder(filename).parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", getLoc("item/" + texture));
    }
}
