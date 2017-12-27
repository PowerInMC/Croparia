package com.croparia.mod.Item.Fruit;

import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Item.ItemModFood;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Emerald extends ItemModFood{

	public Emerald(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}
	
	protected void func_77849_c(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.field_72995_K)
        {           
        	player.func_70690_d(new PotionEffect(MobEffects.field_76420_g, 400, 2));
        }
    }

}
