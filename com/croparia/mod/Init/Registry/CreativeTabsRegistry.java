package com.croparia.mod.Init.Registry;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class CreativeTabsRegistry
{   
    public static final CreativeTabs MOD_BLOCK = new CreativeTabs("MOD_BLOCK")
	{
		@SideOnly(Side.CLIENT)
        public ItemStack func_78016_d()
        {
            return new ItemStack(ItemMod.elemental_fragment);
        }
	};
	
	 public static final CreativeTabs WIP = new CreativeTabs("WIP")
		{
			@SideOnly(Side.CLIENT)
	        public ItemStack func_78016_d()
	        {
	            return new ItemStack(ItemMod.element_eternity);
	        }
		};
	

}
