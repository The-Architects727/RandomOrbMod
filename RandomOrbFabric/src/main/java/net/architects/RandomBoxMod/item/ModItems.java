package net.architects.RandomBoxMod.item;

import net.architects.RandomBoxMod.RandomBoxMod;
import net.architects.RandomBoxMod.item.custom.RandomBoxItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RANDOM_BOX = registerItem("random_box",
            new RandomBoxItem(new FabricItemSettings().group(ModItemGroup.RANDOMBOX).maxCount(64)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RandomBoxMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RandomBoxMod.LOGGER.debug("Registering Mod Items for " + RandomBoxMod.MOD_ID);
    }
}