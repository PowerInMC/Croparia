package com.croparia.mod.Item.Fruit;

import com.croparia.mod.Item.ItemModFood;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FruitFire extends ItemModFood{

	public FruitFire(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}
	
	@Override
	protected void func_77849_c(ItemStack stack, World worldIn, EntityPlayer player) {
		if (!worldIn.field_72995_K)
		{		
			player.func_70015_d(60);
		}
	}
	

}
