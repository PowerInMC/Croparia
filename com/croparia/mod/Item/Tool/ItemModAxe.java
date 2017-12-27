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
        if(input.func_77973_b() == ItemMod.air_axe)
        {
            if(repair.func_77973_b() == ItemMod.elemental_air)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.fire_axe)
        {
            if(repair.func_77973_b() == ItemMod.elemental_fire)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.water_axe)
        {
            if(repair.func_77973_b() == ItemMod.elemental_water)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.earth_axe)
        {
            if(repair.func_77973_b() == ItemMod.elemental_earth)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.obsidian_axe)
        {
            if(repair.func_77973_b() == Item.func_150898_a(Blocks.field_150343_Z))
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.renforced_axe)
        {
            if(repair.func_77973_b() == Items.field_151045_i)
            {
                return true;
            }
        }
        return false;
    }

}
