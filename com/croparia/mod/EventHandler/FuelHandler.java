package com.croparia.mod.EventHandler;

import com.croparia.mod.Init.ItemMod;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) 
	{
		if(fuel.func_77973_b() == ItemMod.fruit_coal || fuel.func_77973_b() == ItemMod.seed_crop_coal)
		{
			return 1600;
		}
		
		else if(fuel.func_77973_b() == ItemMod.wood_multitool)
		{
			return 200;
		}
		
		else if(fuel.func_77973_b() == ItemMod.elemental_fire)
		{
			return 80000;
		}
		
		else if(fuel.func_77973_b() == ItemMod.eternal_fire)
		{
			return 999999999;
		}
		
		return 0;
	}

}
