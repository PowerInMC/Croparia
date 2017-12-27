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
		func_77655_b(name);
		func_77637_a(tabs);
		func_77848_i();
		this.name = name;
	}
	
	protected void func_77849_c(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.field_72995_K && this.name != "fruit_uranium")
        {           
        	player.func_70690_d(new PotionEffect(MobEffects.field_76429_m, 400, 1));
        }
        else if(!worldIn.field_72995_K && this.name == "fruit_uranium")
        {
        	player.func_70690_d(new PotionEffect(MobEffects.field_76429_m, 400, 1));
        	player.func_70690_d(new PotionEffect(MobEffects.field_76436_u, Reference.infini, 2));
        }
    }

}
