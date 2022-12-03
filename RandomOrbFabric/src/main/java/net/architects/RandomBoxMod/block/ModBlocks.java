package net.architects.RandomBoxMod.block;

import net.architects.RandomBoxMod.RandomBoxMod;
import net.architects.RandomBoxMod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block RANDOM_ORE = registerBlock("random_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.RANDOMBOX);
    public static final Block DEEPSLATE_RANDOM_ORE = registerBlock("deepslate_random_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f),
                    UniformIntProvider.create(3,7)), ModItemGroup.RANDOMBOX);
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(RandomBoxMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return  Registry.register(Registry.ITEM, new Identifier(RandomBoxMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        RandomBoxMod.LOGGER.debug("Registering ModBlocks for " + RandomBoxMod.MOD_ID);
    }
}
