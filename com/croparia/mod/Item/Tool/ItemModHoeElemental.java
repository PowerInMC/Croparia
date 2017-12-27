package com.croparia.mod.Item.Tool;

import com.croparia.mod.Init.ItemMod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

import net.minecraft.item.Item.ToolMaterial;

public class ItemModHoeElemental extends HoeElemental
{

    public ItemModHoeElemental(ToolMaterial material)
    {
        super(material);
    }
    
    public boolean func_82789_a(ItemStack input, ItemStack repair)
    {
        if(input.func_77973_b() == ItemMod.air_hoe)
        {
            if(repair.func_77973_b() == ItemMod.elemental_air)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.fire_hoe)
        {
            if(repair.func_77973_b() == ItemMod.elemental_fire)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.water_hoe)
        {
            if(repair.func_77973_b() == ItemMod.elemental_water)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.earth_hoe)
        {
            if(repair.func_77973_b() == ItemMod.elemental_earth)
            {
                return true;
            }
        }
        return false;
    }

}
