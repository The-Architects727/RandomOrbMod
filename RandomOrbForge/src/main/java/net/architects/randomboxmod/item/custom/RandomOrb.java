package net.architects.randomboxmod.item.custom;

import net.minecraft.core.Registry;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RandomOrb extends Item {
    public RandomOrb(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player user, InteractionHand hand) {


        java.util.Random roll = new java.util.Random();
        ItemStack random_box = user.getItemInHand(hand);
        Item chosenItem = Registry.ITEM.getRandom(RandomSource.create()).get().value();
        ItemStack itemstack = new ItemStack(chosenItem, (roll.nextInt(chosenItem.getMaxStackSize()) + 1));


        boolean flag = user.getInventory().add(itemstack);
        if (flag && itemstack.isEmpty()) {
            itemstack.setCount(1);
            ItemEntity itementity1 = user.drop(itemstack, false);
            if (itementity1 != null) {
                itementity1.makeFakeItem();
            }
        } else {
            ItemEntity itementity = user.drop(itemstack, false);
            if (itementity != null) {
                itementity.setNoPickUpDelay();
                itementity.setOwner(user.getUUID());
            }
        }
        if(!user.getAbilities().invulnerable) {
            random_box.shrink(1);
        }


        return super.use(level, user, hand);
    }

    private int getRandomNumber() {
        return RandomSource.createNewThreadLocalInstance().nextInt(10);
    }
}