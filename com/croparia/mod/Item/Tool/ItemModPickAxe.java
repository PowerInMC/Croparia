package com.croparia.mod.Item.Tool;

import com.croparia.mod.Init.ItemMod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import net.minecraft.item.Item.ToolMaterial;

public class ItemModPickAxe extends ItemPickaxe
{

    public ItemModPickAxe(ToolMaterial material)
    {
        super(material);
    }
    
    public boolean func_82789_a(ItemStack input, ItemStack repair)
    {
        if(input.func_77973_b() == ItemMod.air_pickaxe)
        {
            if(repair.func_77973_b() == ItemMod.elemental_air)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.fire_pickaxe)
        {
            if(repair.func_77973_b() == ItemMod.elemental_fire)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.water_pickaxe)
        {
            if(repair.func_77973_b() == ItemMod.elemental_water)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.earth_pickaxe)
        {
            if(repair.func_77973_b() == ItemMod.elemental_earth)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.obsidian_pickaxe)
        {
            if(repair.func_77973_b() == Item.func_150898_a(Blocks.field_150343_Z))
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.renforced_pickaxe)
        {
            if(repair.func_77973_b() == Items.field_151045_i)
            {
                return true;
            }
        }
        return false;
    }

}
