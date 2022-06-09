package net.manmaed.cottonly.loot;

import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.manmaed.cottonly.items.CItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by manmaed on 15/08/2021.
 */
public class GrassSeedModifier extends LootModifier {


    protected GrassSeedModifier(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        generatedLoot.add(new ItemStack(CItems.COTTON_SEED.get()));
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<GrassSeedModifier> {

        @Override
        public GrassSeedModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] ailootcondition) {
            return new GrassSeedModifier(ailootcondition);
        }

        @Override
        public JsonObject write(GrassSeedModifier instance) {
            JsonObject jsonObject = makeConditions(instance.conditions);
            ResourceLocation location = ForgeRegistries.ITEMS.getKey(CItems.COTTON_SEED.get());
            jsonObject.addProperty("item", location.toString());
            return jsonObject;
        }
    }
}

//Old Code
/*public class GrassSeedModifier extends GlobalLootModifierSerializer<GrassSeedModifier.GrassDropModifier> {

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
            LogHelper.info(generatedLoot);
            return generatedLoot;
        }
    }
}*/
