package com.croparia.mod.Item.Fruit;

import com.croparia.mod.Reference;
import com.croparia.mod.Entity.EntityCentaur;
import com.croparia.mod.Item.ItemModFood;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Star extends ItemModFood{
	
	public Star(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}
	
	protected void func_77849_c(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.field_72995_K)
        {           
        	player.func_70634_a(player.func_180425_c().func_177958_n(), player.func_180425_c().func_177956_o() + 1000, player.func_180425_c().func_177952_p());
        }
    }

}
