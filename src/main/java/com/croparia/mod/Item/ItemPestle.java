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
        this.setCreativeTab(tab);
        this.setMaxStackSize(1);
        this.setContainerItem(this);
    }
}
