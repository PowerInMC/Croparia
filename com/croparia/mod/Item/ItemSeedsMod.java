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
		func_77655_b(name);
		setRegistryName(name);
		func_77637_a(CreativeTabsRegistry.MOD_BLOCK);
	}

}
