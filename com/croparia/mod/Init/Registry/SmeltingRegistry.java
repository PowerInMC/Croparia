package com.croparia.mod.Init.Registry;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class SmeltingRegistry 
{
	
	public static void register() 
	{
		GameRegistry.addSmelting(Items.MILK_BUCKET, new ItemStack(ItemMod.cheese), 0.5F);
		GameRegistry.addSmelting(ItemMod.chicken_leg, new ItemStack(ItemMod.cooked_chicken_leg), 1.0F);
		GameRegistry.addSmelting(ItemMod.roast_porc, new ItemStack(ItemMod.cooked_roast_porc), 1.0F);
		GameRegistry.addSmelting(ItemMod.roast_beef, new ItemStack(ItemMod.cooked_roast_beef), 1.0F);
		GameRegistry.addSmelting(ItemMod.horse_meat, new ItemStack(ItemMod.cooked_horse_meat), 1.0F);
		GameRegistry.addSmelting(ItemMod.squid_meat, new ItemStack(ItemMod.cooked_squid_meat), 1.0F);	
		GameRegistry.addSmelting(ItemMod.flour, new ItemStack(Items.BREAD), 1.0F);	
		GameRegistry.addSmelting(BlockMod.elemental_cobblestone, new ItemStack(BlockMod.elemental_stone), 1.0F);

	}
}
