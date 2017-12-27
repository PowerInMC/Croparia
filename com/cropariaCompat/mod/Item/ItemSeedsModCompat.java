package com.cropariaCompat.mod.Item;

import com.cropariaCompat.mod.Init.CreativeTabsCompat;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class ItemSeedsModCompat extends ItemSeeds{

	public ItemSeedsModCompat(Block block, Block soil) {
		super(block, soil);
	}
	
	public ItemSeedsModCompat(Block block, Block soil, String name) {
		super(block, soil);
		func_77655_b(name);
		setRegistryName(name);
		func_77637_a(CreativeTabsCompat.MOD_COMPAT);
	}

}
