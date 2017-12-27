package com.croparia.mod.Item.Fruit;

import com.croparia.mod.Item.ItemModFood;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class IronMana extends ItemModFood{

	public IronMana(String name, CreativeTabs tabs) {
		super(0, 0, false);
		setRegistryName(name);
		func_77655_b(name);
		func_77637_a(tabs);
		func_77848_i();
	}
	
	protected void func_77849_c(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.field_72995_K)
        {           
        	player.func_70690_d(new PotionEffect(MobEffects.field_76429_m, 400, 1));
        	player.func_70690_d(new PotionEffect(MobEffects.field_188424_y, 350, 1));
        }
    }

}
