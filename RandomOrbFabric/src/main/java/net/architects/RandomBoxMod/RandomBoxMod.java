package net.architects.RandomBoxMod;

import net.architects.RandomBoxMod.block.ModBlocks;
import net.architects.RandomBoxMod.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import net.architects.RandomBoxMod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class RandomBoxMod implements ModInitializer {
	public static final String MOD_ID = "randomboxmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGen.generateWorldGen();

	}
}