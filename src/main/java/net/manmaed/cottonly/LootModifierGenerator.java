package net.manmaed.cottonly;

import net.manmaed.cottonly.items.CItems;
import net.manmaed.cottonly.loot.GrassSeedModifier;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class LootModifierGenerator extends GlobalLootModifierProvider {

    public LootModifierGenerator(DataGenerator gen) {
        super(gen, Cottonly.MOD_ID);
    }

    @Override
    protected void start() {
        add("cotton_seed_drops", new GrassSeedModifier(
                createChanceCondition(0.1f, new ResourceLocation("minecraft", "blocks/grass")), new ItemStack(CItems.COTTON_SEED.get())
        )
        );
        add("cotton_seed_drops", new GrassSeedModifier(
                createChanceCondition(0.1f, new ResourceLocation("minecraft", "blocks/fern")), new ItemStack(CItems.COTTON_SEED.get())
        ));
    }

    public static LootItemCondition[] createChanceCondition(float chance, ResourceLocation table) {
        return new LootItemCondition[] { LootItemRandomChanceCondition.randomChance(chance).build(), LootTableIdCondition.builder(table).build() };
    }
}