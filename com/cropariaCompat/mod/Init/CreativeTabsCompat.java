package com.cropariaCompat.mod.Init;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class CreativeTabsCompat
{   
    public static final CreativeTabs MOD_COMPAT = new CreativeTabs("MOD_COMPAT")
	{
		@SideOnly(Side.CLIENT)
        public ItemStack func_78016_d()
        {
            return new ItemStack(ItemMod.seed_crop_diamond);
        }
	};
}
