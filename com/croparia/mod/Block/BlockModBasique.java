package com.croparia.mod.Block;

import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockModBasique extends Block
{

	public BlockModBasique(Material blockMaterialIn, String name) {
		super(blockMaterialIn);
		this.func_149663_c(name);
		this.setRegistryName(name);
		this.func_149647_a(CreativeTabsRegistry.MOD_BLOCK);
	}


}
