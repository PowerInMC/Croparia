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
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabsCompat.MOD_COMPAT);
	}

}
