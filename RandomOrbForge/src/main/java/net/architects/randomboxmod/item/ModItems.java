package net.architects.randomboxmod.item;

import net.architects.randomboxmod.RandomBoxMod;
import net.architects.randomboxmod.item.custom.RandomOrb;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RandomBoxMod.MOD_ID);


    public static final RegistryObject<Item> RANDOM_BOX = ITEMS.register("random_orb",
            () -> new RandomOrb(new Item.Properties().tab(ModCreativeModeTab.RANDOM_TAB).stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}