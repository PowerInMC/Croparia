package com.croparia.mod.Item.Tool;

import com.croparia.mod.Init.ItemMod;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import net.minecraft.item.Item.ToolMaterial;

public class ItemModSword extends ItemSword
{
    public ItemModSword(ToolMaterial material)
    {
        super(material);
    }
    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(input.getItem() == ItemMod.air_sword)
        {
            if(repair.getItem() == ItemMod.elemental_air)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.fire_sword)
        {
            if(repair.getItem() == ItemMod.elemental_fire)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.water_sword)
        {
            if(repair.getItem() == ItemMod.elemental_water)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.earth_sword)
        {
            if(repair.getItem() == ItemMod.elemental_earth)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.obsidian_sword)
        {
            if(repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN))
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.renforced_sword)
        {
            if(repair.getItem() == Items.DIAMOND)
            {
                return true;
            }
        }
        return false;
    }

}
