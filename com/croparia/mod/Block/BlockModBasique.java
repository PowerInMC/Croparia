package com.croparia.mod.Block;

import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockModBasique extends Block
{

	public BlockModBasique(Material blockMaterialIn, String name) {
		super(blockMaterialIn);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
	}


}
