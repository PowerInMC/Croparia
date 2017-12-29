package com.croparia.mod.EventHandler;

import com.croparia.mod.Init.ItemMod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class AddGrassSeed {
	
	public static void addGrassSeeds()
	{
		MinecraftForge.addGrassSeed(new ItemStack(ItemMod.cherry), 15);
		MinecraftForge.addGrassSeed(new ItemStack(ItemMod.lemon), 15);
		MinecraftForge.addGrassSeed(new ItemStack(ItemMod.apricot), 15);
		MinecraftForge.addGrassSeed(new ItemStack(ItemMod.kiwi), 15);
		MinecraftForge.addGrassSeed(new ItemStack(ItemMod.orange), 15);
		MinecraftForge.addGrassSeed(new ItemStack(ItemMod.pear), 15);
		MinecraftForge.addGrassSeed(new ItemStack(ItemMod.banana), 15);
		MinecraftForge.addGrassSeed(new ItemStack(Items.WHEAT_SEEDS), 30);

		MinecraftForge.addGrassSeed(new ItemStack(ItemMod.seed_crop_coal), 10);
	}

}
