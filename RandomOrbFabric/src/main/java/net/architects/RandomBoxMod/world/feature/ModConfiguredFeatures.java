package net.architects.RandomBoxMod.world.feature;

import net.architects.RandomBoxMod.RandomBoxMod;
import net.architects.RandomBoxMod.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_RANDOM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RANDOM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RANDOM_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RANDOM_ORE =
            ConfiguredFeatures.register("random_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_RANDOM_ORES, 2));



    public static void registerConfiguredFeatures() {
        RandomBoxMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + RandomBoxMod.MOD_ID);
    }
}
