package net.architects.RandomBoxMod.item.custom;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class RandomBoxItem extends Item {
    public RandomBoxItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {


        java.util.Random roll = new java.util.Random();
        ItemStack random_box = user.getStackInHand(hand);
        Item chosenItem = Registry.ITEM.getRandom(net.minecraft.util.math.random.Random.create()).get().value();
        ItemStack itemStack = new ItemStack(chosenItem, (roll.nextInt(chosenItem.getMaxCount()) + 1));

        boolean bl = user.getInventory().insertStack(itemStack);
        ItemEntity itemEntity;
            itemEntity = user.dropItem(itemStack, false);
            if (itemEntity != null) {
                itemEntity.resetPickupDelay();
                itemEntity.setOwner(user.getUuid());
            }
        if (!user.getAbilities().creativeMode) {
            random_box.decrement(1);
        }


//        if(!world.isClient() && hand == Hand.MAIN_HAND) {
//            // output a random number
//            user.giveItemStack(new ItemStack(chosenItem, (roll.nextInt(chosenItem.getMaxCount()) + 1)));
//            // clear item
//            if (!user.getAbilities().creativeMode) {
//                itemStack.decrement(1);
//            }
//        }


        return super.use(world, user, hand);
    }

    private int getRandomNumber() {
        return Random.createLocal().nextInt(16);
    }
}
