package com.croparia.mod.Item;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class ItemSeedsMod extends ItemSeeds{

	public ItemSeedsMod(Block block, Block soil) {
		super(block, soil);
	}
	
	public ItemSeedsMod(Block block, Block soil, String name) {
		super(block, soil);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
	}

}
