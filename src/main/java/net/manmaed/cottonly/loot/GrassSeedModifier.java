package net.manmaed.cottonly.loot;

import com.google.gson.JsonObject;
import net.manmaed.cottonly.items.CItems;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * Created by manmaed on 15/08/2021.
 */
public class GrassSeedModifier extends GlobalLootModifierSerializer<GrassSeedModifier.GrassDropModifier> {

    @Override
    public GrassDropModifier read(ResourceLocation resourceLocation, JsonObject jsonObject, ILootCondition[] lootcondition) {
        return new GrassDropModifier(lootcondition);
    }

    @Override
    public JsonObject write(GrassDropModifier grassDropModifier) {
        return new JsonObject();
    }

    static class GrassDropModifier extends LootModifier {
        protected GrassDropModifier(ILootCondition[] lootConditions) {
            super(lootConditions);
        }

        @Nonnull
        @Override
        protected List<ItemStack> doApply(List<ItemStack> list, LootContext context) {
            list.add(new ItemStack(CItems.cotton_seed));
            return list;
        }
    }
}
