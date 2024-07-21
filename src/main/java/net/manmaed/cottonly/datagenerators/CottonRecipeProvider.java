package net.manmaed.cottonly.datagenerators;

import net.manmaed.cottonly.Cottonly;
import net.manmaed.cottonly.items.CItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.ArmorDyeRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class CottonRecipeProvider extends RecipeProvider {
    public CottonRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
        super(packOutput, providerCompletableFuture);
    }

    public static ResourceLocation getSave(String string) {
        return ResourceLocation.fromNamespaceAndPath(Cottonly.MOD_ID, string);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        //Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, CItems.COTTON_HAT.get(), 1)
                .define('c', Ingredient.of(CItems.COTTON_BALL))
                .pattern("ccc")
                .pattern("c c").unlockedBy("has_cotton", has(CItems.COTTON_BALL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, CItems.COTTON_SHIRT.get(), 1)
                .define('c', Ingredient.of(CItems.COTTON_BALL))
                .pattern("c c")
                .pattern("ccc")
                .pattern("ccc").unlockedBy("has_cotton", has(CItems.COTTON_BALL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, CItems.COTTON_TROUSERS.get(), 1)
                .define('c', Ingredient.of(CItems.COTTON_BALL))
                .pattern("ccc")
                .pattern("c c")
                .pattern("c c").unlockedBy("has_cotton", has(CItems.COTTON_BALL)).save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, CItems.COTTON_SOCKS.get(), 1)
                .define('c', Ingredient.of(CItems.COTTON_BALL))
                .pattern("c c")
                .pattern("c c").unlockedBy("has_cotton", has(CItems.COTTON_BALL)).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING,  4).requires(Ingredient
                .of(CItems.COTTON_BALL)).unlockedBy("has_cotton",has(CItems.COTTON_BALL)).save(output);
    }
}
