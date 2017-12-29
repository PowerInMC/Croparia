package com.croparia.mod.Item.Fruit;

import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Item.ItemModFood;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Diamond extends ItemModFood{

	public Diamond(String name, CreativeTabs tabs) {
		super(0, 0, false);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(tabs);
		setAlwaysEdible();
	}
	
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote)
        {           
        	player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 400, 3));
        }
    }

}
