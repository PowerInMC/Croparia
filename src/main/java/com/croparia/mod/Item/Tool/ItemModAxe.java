package com.croparia.mod.Item.Tool;

import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.item.Item.ToolMaterial;

public class ItemModAxe extends ItemAxe
{

    public ItemModAxe(ToolMaterial material, float damage, float speed)
    {
        super(material, damage, speed);
        
    }
   

    public boolean isRepairable(ItemStack input, ItemStack repair)
    {
        if(input.getItem() == ItemMod.air_axe)
        {
            if(repair.getItem() == ItemMod.elemental_air)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.fire_axe)
        {
            if(repair.getItem() == ItemMod.elemental_fire)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.water_axe)
        {
            if(repair.getItem() == ItemMod.elemental_water)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.earth_axe)
        {
            if(repair.getItem() == ItemMod.elemental_earth)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.obsidian_axe)
        {
            if(repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN))
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.renforced_axe)
        {
            if(repair.getItem() == Items.DIAMOND)
            {
                return true;
            }
        }
        return false;
    }

}
