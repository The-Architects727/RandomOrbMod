package net.architects.randomboxmod.item;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab RANDOM_TAB = new CreativeModeTab("random_box_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RANDOM_BOX.get());
        }
    };
}