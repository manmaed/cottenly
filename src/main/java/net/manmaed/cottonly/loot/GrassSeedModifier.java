package net.manmaed.cottonly.loot;

import com.google.gson.JsonObject;
import net.manmaed.cottonly.items.CItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by manmaed on 15/08/2021.
 */
public class GrassSeedModifier extends GlobalLootModifierSerializer<GrassSeedModifier.GrassDropModifier> {

    @Override
    public GrassDropModifier read(ResourceLocation resourceLocation, JsonObject jsonObject, LootItemCondition[] ailootcondition) {
        return new GrassDropModifier(ailootcondition);
    }

    @Override
    public JsonObject write(GrassDropModifier grassDropModifier) {
        return new JsonObject();
    }

    static class GrassDropModifier extends LootModifier {
        protected GrassDropModifier(LootItemCondition[] lootConditions) {
            super(lootConditions);
        }

        @NotNull
        @Override
        protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
            generatedLoot.add(new ItemStack(CItems.COTTON_SEED.get()));
            return generatedLoot;
        }
    }
}
