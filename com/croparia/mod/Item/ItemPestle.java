package com.croparia.mod.Item;

import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPestle extends Item
{
	public static CreativeTabs tab = CreativeTabsRegistry.MOD_BLOCK;
	
    public ItemPestle()
    {
        super();
        this.func_77637_a(tab);
        this.func_77625_d(1);
        this.func_77642_a(this);
    }
}
