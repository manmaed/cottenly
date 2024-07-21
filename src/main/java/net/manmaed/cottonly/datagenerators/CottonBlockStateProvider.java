package net.manmaed.cottonly.datagenerators;

import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.blocks.CBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class CottonBlockStateProvider extends BlockStateProvider {
    public CottonBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Cottonly.MOD_ID, exFileHelper);
    }

    private ResourceLocation getLoc(String loc){
        return ResourceLocation.fromNamespaceAndPath(Cottonly.MOD_ID, loc);
    }
    @Override
    protected void registerStatesAndModels() {
        createCottonPlantBlockState();
    }

    private void createCottonPlantBlockState() {
        getVariantBuilder(CBlocks.COTTON_PLANT.get())
                .forAllStates(state -> {
                    int age = state.getValue(CropBlock.AGE);
                    String model = switch (age) {
                        case 0, 1 -> "block/cotton_plant_0";
                        case 2, 3 -> "block/cotton_plant_1";
                        case 4, 5 -> "block/cotton_plant_2";
                        case 6 -> "block/cotton_plant_3";
                        case 7 -> "block/cotton_plant_4";
                        default -> "block/cotton_plant_0";
                    };
                    return ConfiguredModel.builder()
                            .modelFile(models().getExistingFile(getLoc(model)))
                            .build();
                });
    }
}
