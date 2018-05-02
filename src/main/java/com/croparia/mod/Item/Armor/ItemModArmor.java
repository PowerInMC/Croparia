package com.croparia.mod.Item.Armor;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemModArmor extends ItemArmor
{
	public static CreativeTabs tab = CreativeTabsRegistry.MOD_BLOCK;
	
    public ItemModArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, 0, equipmentSlotIn);
        this.setCreativeTab(tab);
    }
    
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
    {
        if(this == ItemMod.obsidian_leggings)
        {
            return Reference.MOD_ID + ":textures/models/armor/obsidian_layer_2.png";
        }
        
        else if (this == ItemMod.obsidian_helmet || this == ItemMod.obsidian_chestplate || this == ItemMod.obsidian_boots)
        {
            return Reference.MOD_ID + ":textures/models/armor/obsidian_layer_1.png";
        }
        
        else if(this == ItemMod.renforced_leggings)
        {
            return Reference.MOD_ID + ":textures/models/armor/renforced_layer_2.png";
        }
        
        else if (this == ItemMod.renforced_helmet || this == ItemMod.renforced_chestplate || this == ItemMod.renforced_boots)
        {
            return Reference.MOD_ID + ":textures/models/armor/renforced_layer_1.png";
        }
        
        return null;
    }
    
    public boolean func_82789_a(ItemStack input, ItemStack repair)
	{
    	if(input == new ItemStack(ItemMod.obsidian_helmet))
    	{
    		if(repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN))
    		{
    			return true;
    		}
    		return false;
    	}
    	else if(input == new ItemStack(ItemMod.obsidian_chestplate))
    	{
    		if(repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN))
    		{
    			return true;
    		}
    		return false;
    	} 
    	else if(input == new ItemStack(ItemMod.obsidian_leggings))
    	{
    		if(repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN))
    		{
    			return true;
    		}
    		return false;
    	}
    	else if(input == new ItemStack(ItemMod.obsidian_boots))
    	{
    		if(repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN))
    		{
    			return true;
    		}
    		return false;
    	} 
    	else if(input == new ItemStack(ItemMod.renforced_helmet))
    	{
    		if(repair.getItem() == Items.DIAMOND)
    		{
    			return true;
    		}
    		return false;
    	}
    	else if(input == new ItemStack(ItemMod.renforced_chestplate))
    	{
    		if(repair.getItem() == Items.DIAMOND)
    		{
    			return true;
    		}
    		return false;
    	} 
    	else if(input == new ItemStack(ItemMod.renforced_leggings))
    	{
    		if(repair.getItem() == Items.DIAMOND)
    		{
    			return true;
    		}
    		return false;
    	}
    	else if(input == new ItemStack(ItemMod.renforced_boots))
    	{
    		if(repair.getItem() == Items.DIAMOND)
    		{
    			return true;
    		}
    		return false;
    	} 
		
		return false;
	}
}
