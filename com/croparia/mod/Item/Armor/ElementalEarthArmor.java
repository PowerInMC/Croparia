package com.croparia.mod.Item.Armor;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ElementalEarthArmor extends ItemArmor
{
	public static CreativeTabs tab = CreativeTabsRegistry.MOD_BLOCK;
	
	public ElementalEarthArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 0, equipmentSlotIn);
		this.func_77637_a(tab);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
    {
        if(this == ItemMod.elemental_earth_leggings)
        {
            return Reference.MOD_ID + ":textures/models/armor/earth_layer_2.png";
        }
        
		else if (this == ItemMod.elemental_earth_helmet || this == ItemMod.elemental_earth_chestplate || this == ItemMod.elemental_earth_boots)
        {
            return Reference.MOD_ID + ":textures/models/armor/earth_layer_1.png";
        }
		return null;
	}

	   public boolean func_82789_a(ItemStack input, ItemStack repair)
	    {
	        if(input.func_77973_b() == ItemMod.elemental_earth_helmet)
	        {
	            if(repair.func_77973_b() == ItemMod.elemental_earth)
	            {
	                return true;
	            }
	        }
	        else if(input.func_77973_b() ==ItemMod.elemental_earth_chestplate)
	        {
	            if(repair.func_77973_b() == ItemMod.elemental_earth)
	            {
	                return true;
	            }
	        } 
	        else if(input.func_77973_b() ==ItemMod.elemental_earth_leggings)
	        {
	            if(repair.func_77973_b() == ItemMod.elemental_earth)
	            {
	                return true;
	            }
	        }
	        else if(input.func_77973_b() ==ItemMod.elemental_earth_boots)
	        {
	            if(repair.func_77973_b() == ItemMod.elemental_earth)
	            {
	                return true;
	            }
	        }
	        return false;
	    }
	
	
		public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
	    {								
				player.func_70690_d(new PotionEffect(MobEffects.field_76429_m, 220, 2));	
				
				
				ItemStack head = player.func_184582_a(EntityEquipmentSlot.HEAD);
		        ItemStack chest = player.func_184582_a(EntityEquipmentSlot.CHEST);
		        ItemStack legs = player.func_184582_a(EntityEquipmentSlot.LEGS);
		        ItemStack feet = player.func_184582_a(EntityEquipmentSlot.FEET);
		        if (player.func_110143_aJ() < 8 && head != null && head.func_77973_b() == ItemMod.elemental_earth_helmet && chest != null && chest.func_77973_b() == ItemMod.elemental_earth_chestplate && legs != null && legs.func_77973_b() == ItemMod.elemental_earth_leggings && feet != null && feet.func_77973_b() == ItemMod.elemental_earth_boots || player.field_71075_bZ.field_75098_d || player.func_175149_v()) {
		        	player.func_70606_j(9);
		        	player.func_70690_d(new PotionEffect(MobEffects.field_76428_l, 220, 0));	            
		        } 
		        
		}
} 
