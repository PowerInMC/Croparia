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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ElementalWaterArmor extends ItemArmor
{
	public static CreativeTabs tab = CreativeTabsRegistry.MOD_BLOCK;

	public ElementalWaterArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 0, equipmentSlotIn);
		this.func_77637_a(tab);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
    {
        if(this == ItemMod.elemental_water_leggings)
        {
            return Reference.MOD_ID + ":textures/models/armor/water_layer_2.png";
        }
        
        else if (this == ItemMod.elemental_water_helmet || this == ItemMod.elemental_water_chestplate || this == ItemMod.elemental_water_boots)
        {
            return Reference.MOD_ID + ":textures/models/armor/water_layer_1.png";
        }
		return null;
	}
	   public boolean func_82789_a(ItemStack input, ItemStack repair)
	    {
	        if(input.func_77973_b() == ItemMod.elemental_water_helmet)
	        {
	            if(repair.func_77973_b() == ItemMod.elemental_water)
	            {
	                return true;
	            }
	        }
	        else if(input.func_77973_b() ==ItemMod.elemental_water_chestplate)
	        {
	            if(repair.func_77973_b() == ItemMod.elemental_water)
	            {
	                return true;
	            }
	        } 
	        else if(input.func_77973_b() ==ItemMod.elemental_water_leggings)
	        {
	            if(repair.func_77973_b() == ItemMod.elemental_water)
	            {
	                return true;
	            }
	        }
	        else if(input.func_77973_b() ==ItemMod.elemental_water_boots)
	        {
	            if(repair.func_77973_b() == ItemMod.elemental_water)
	            {
	                return true;
	            }
	        }
	        return false;
	    }
	
	
		public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
	    {								
				player.func_70690_d(new PotionEffect(MobEffects.field_76439_r, 220, 2));
				
				ItemStack head = player.func_184582_a(EntityEquipmentSlot.HEAD);
		        ItemStack chest = player.func_184582_a(EntityEquipmentSlot.CHEST);
		        ItemStack legs = player.func_184582_a(EntityEquipmentSlot.LEGS);
		        ItemStack feet = player.func_184582_a(EntityEquipmentSlot.FEET);
		        if (head != null && head.func_77973_b() == ItemMod.elemental_water_helmet && chest != null && chest.func_77973_b() == ItemMod.elemental_water_chestplate && legs != null && legs.func_77973_b() == ItemMod.elemental_water_leggings && feet != null && feet.func_77973_b() == ItemMod.elemental_water_boots || player.field_71075_bZ.field_75098_d || player.func_175149_v()) {
					player.func_70690_d(new PotionEffect(MobEffects.field_76427_o, 220, 2));					
		        } 
		}
} 
