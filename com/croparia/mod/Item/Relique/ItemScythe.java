package com.croparia.mod.Item.Relique;

import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import scala.Int;

import net.minecraft.item.Item.ToolMaterial;

public class ItemScythe extends ItemSword 
{

	public ItemScythe(ToolMaterial mat, String name) {
		super(mat);
		func_77655_b(name);
		setRegistryName(name);
		func_77625_d(1);
		func_77637_a(CreativeTabsRegistry.MOD_BLOCK);
		setNoRepair();
	}
}
