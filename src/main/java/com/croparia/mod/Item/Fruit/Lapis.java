package com.croparia.mod.Item.Fruit;

import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Item.ItemModFood;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Lapis extends ItemModFood{

	public Lapis(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}
	
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote)
        {           
        	player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 1000, 1));
        }
    }

}
