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

public class ElementalAirArmor extends ItemArmor
{
	public static CreativeTabs tab = CreativeTabsRegistry.MOD_BLOCK;
	
	public ElementalAirArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 0, equipmentSlotIn);
		this.func_77637_a(tab);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
    {
        if(this == ItemMod.elemental_air_leggings)
        {
            return Reference.MOD_ID + ":textures/models/armor/air_layer_2.png";
        }
        
		else if (this == ItemMod.elemental_air_helmet || this == ItemMod.elemental_air_chestplate || this == ItemMod.elemental_air_boots)
        {
            return Reference.MOD_ID + ":textures/models/armor/air_layer_1.png";
        }
		return null;
	}

	   public boolean func_82789_a(ItemStack input, ItemStack repair)
	    {
	        if(input.func_77973_b() == ItemMod.elemental_air_helmet)
	        {
	            if(repair.func_77973_b() == ItemMod.elemental_air)
	            {
	                return true;
	            }
	        }
	        else if(input.func_77973_b() ==ItemMod.elemental_air_chestplate)
	        {
	            if(repair.func_77973_b() == ItemMod.elemental_air)
	            {
	                return true;
	            }
	        } 
	        else if(input.func_77973_b() ==ItemMod.elemental_air_leggings)
	        {
	            if(repair.func_77973_b() == ItemMod.elemental_air)
	            {
	                return true;
	            }
	        }
	        else if(input.func_77973_b() ==ItemMod.elemental_air_boots)
	        {
	            if(repair.func_77973_b() == ItemMod.elemental_air)
	            {
	                return true;
	            }
	        }
	        return false;
	    }
	
	   @Override
	    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
	    	
	    	entity.func_70690_d(new PotionEffect(MobEffects.field_76430_j, 220, 1));	
	    	entity.func_70690_d(new PotionEffect(MobEffects.field_76424_c, 220, 1));
	    	
	        ItemStack head = entity.func_184582_a(EntityEquipmentSlot.HEAD);
	        ItemStack chest = entity.func_184582_a(EntityEquipmentSlot.CHEST);
	        ItemStack legs = entity.func_184582_a(EntityEquipmentSlot.LEGS);
	        ItemStack feet = entity.func_184582_a(EntityEquipmentSlot.FEET);
	        if (head != null && head.func_77973_b() == ItemMod.elemental_air_helmet && chest != null && chest.func_77973_b() == ItemMod.elemental_air_chestplate && legs != null && legs.func_77973_b() == ItemMod.elemental_air_leggings && feet != null && feet.func_77973_b() == ItemMod.elemental_air_boots || entity.field_71075_bZ.field_75098_d || entity.func_175149_v()) {
	            entity.field_71075_bZ.field_75101_c = true;
	            
	        } 
	        else{
	                entity.field_71075_bZ.field_75100_b = false;
	                entity.field_71075_bZ.field_75101_c = false;
	        }
	    }
} 
