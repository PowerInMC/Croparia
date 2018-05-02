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
		this.setCreativeTab(tab);
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

	   public boolean getIsRepairable(ItemStack input, ItemStack repair)
	    {
	        if(input.getItem() == ItemMod.elemental_air_helmet)
	        {
	            if(repair.getItem() == ItemMod.elemental_air)
	            {
	                return true;
	            }
	        }
	        else if(input.getItem() ==ItemMod.elemental_air_chestplate)
	        {
	            if(repair.getItem() == ItemMod.elemental_air)
	            {
	                return true;
	            }
	        } 
	        else if(input.getItem() ==ItemMod.elemental_air_leggings)
	        {
	            if(repair.getItem() == ItemMod.elemental_air)
	            {
	                return true;
	            }
	        }
	        else if(input.getItem() ==ItemMod.elemental_air_boots)
	        {
	            if(repair.getItem() == ItemMod.elemental_air)
	            {
	                return true;
	            }
	        }
	        return false;
	    }
	
	   @Override
	    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
	    	
	    	entity.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 220, 1));	
	    	entity.addPotionEffect(new PotionEffect(MobEffects.SPEED, 220, 1));
	    	
	        ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
	        ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
	        ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
	        ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
	        if (head != null && head.getItem() == ItemMod.elemental_air_helmet && chest != null && chest.getItem() == ItemMod.elemental_air_chestplate && legs != null && legs.getItem() == ItemMod.elemental_air_leggings && feet != null && feet.getItem() == ItemMod.elemental_air_boots || entity.capabilities.isCreativeMode || entity.isSpectator()) {
	            entity.capabilities.allowFlying = true;
	            
	        } 
	        else{
	                entity.capabilities.isFlying = false;
	                entity.capabilities.allowFlying = false;
	        }
	    }
} 
