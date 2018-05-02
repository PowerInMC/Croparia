package com.croparia.mod.Item.Relique;

import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import scala.Int;

public class ItemScythe extends ItemSword 
{

	public ItemScythe(ToolMaterial mat, String name) {
		super(mat);
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
		setNoRepair();
	}
}
