package com.github.merpous.baked;

import com.github.merpous.baked.block.BakedBlocks;
import com.github.merpous.baked.item.BakedItems;
import net.fabricmc.api.ModInitializer;

public class BakedMod implements ModInitializer {

	public static final String MOD_ID = "baked";

	@Override
	public void onInitialize() {


		BakedItems.registerModItems();
		BakedBlocks.registerModBlocks();


		System.out.println("printed fuckin shit amen");
	}
}
