package net.manmaed.cottonly.config;

import net.minecraftforge.common.ForgeConfigSpec;

/**
 * Created by manmaed on 15/08/2021.
 */
public class CottonConfig {
    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    private static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
    private static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();

    public static ForgeConfigSpec COMMON_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;
    public static ForgeConfigSpec SERVER_CONFIG;

    public static final String CAT_LOOT = "loot tables";
    public static ForgeConfigSpec.BooleanValue REMOVE_GRASS_LOOT_TABLE;

    static {
        COMMON_BUILDER.comment("Loot Table Settings").push(CAT_LOOT);
        doLootTableMagic();
        COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();

    }

    private static void doLootTableMagic() {
        REMOVE_GRASS_LOOT_TABLE = COMMON_BUILDER.comment("Remove Cotton seeds from the grass loot table? [DEFAULT:false]")
                .define("remove_cotton_seeds_loot_table", false);
    }
}
