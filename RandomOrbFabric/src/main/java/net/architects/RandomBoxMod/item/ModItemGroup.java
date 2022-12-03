package net.architects.RandomBoxMod.item;

import net.architects.RandomBoxMod.RandomBoxMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup RANDOMBOX = FabricItemGroupBuilder.build(
            new Identifier(RandomBoxMod.MOD_ID, "random_box"), () -> new ItemStack(ModItems.RANDOM_BOX));
}