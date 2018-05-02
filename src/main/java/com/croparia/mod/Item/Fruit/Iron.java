package com.croparia.mod.Item.Fruit;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;
import com.croparia.mod.Item.ItemModFood;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Iron extends ItemModFood{

	public static String name;
	
	public Iron(String name, CreativeTabs tabs) {
		super(0, 0, false);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(tabs);
		setAlwaysEdible();
		this.name = name;
	}
	
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote && this.name != "fruit_uranium")
        {           
        	player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 400, 1));
        }
        else if(!worldIn.isRemote && this.name == "fruit_uranium")
        {
        	player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 400, 1));
        	player.addPotionEffect(new PotionEffect(MobEffects.POISON, Reference.infini, 2));
        }
    }

}
