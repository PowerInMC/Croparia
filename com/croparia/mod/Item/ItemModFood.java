package com.croparia.mod.Item;

import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemModFood extends ItemFood
{
	public static CreativeTabs tab = CreativeTabsRegistry.MOD_BLOCK;
	
	public ItemModFood(int amount, float saturation, boolean isWolfFood)
    {
		super(amount, saturation, isWolfFood);
		this.func_77637_a(tab);
    }  
}
