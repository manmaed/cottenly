package net.manmaed.cottonly.loot;


import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

/**
 * Created by manmaed on 15/08/2021.
 */
public class GrassSeedModifier3 extends LootModifier {

    public static final Codec<GrassSeedModifier3> CODEC = RecordCodecBuilder.create(inst ->
            codecStart(inst)
                    .and(ItemStack.CODEC.fieldOf("stack").forGetter(GrassSeedModifier3::getStack))
                    .apply(inst, GrassSeedModifier3::new));

    private final ItemStack stack;

    public GrassSeedModifier3(LootItemCondition[] conditionsIn, ItemStack itemStack) {
        super(conditionsIn);
        this.stack = itemStack;
    }
    public ItemStack getStack() {
        return stack;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        generatedLoot.add(stack.copy());
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }
}