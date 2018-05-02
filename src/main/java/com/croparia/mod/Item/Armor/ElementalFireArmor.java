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

public class ElementalFireArmor extends ItemArmor
{
	public static CreativeTabs tab = CreativeTabsRegistry.MOD_BLOCK;

	public ElementalFireArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 0, equipmentSlotIn);
		this.setCreativeTab(tab);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
    {
        if(this == ItemMod.elemental_fire_leggings)
        {
            return Reference.MOD_ID + ":textures/models/armor/fire_layer_2.png";
        }
        
        else if (this == ItemMod.elemental_fire_helmet || this == ItemMod.elemental_fire_chestplate || this == ItemMod.elemental_fire_boots)
        {
            return Reference.MOD_ID + ":textures/models/armor/fire_layer_1.png";
        }
		return null;
	}

	public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(input.getItem() == ItemMod.elemental_fire_helmet)
        {
            if(repair.getItem() == ItemMod.elemental_fire)
            {
                return true;
            }
        }
        else if(input.getItem() ==ItemMod.elemental_fire_chestplate)
        {
            if(repair.getItem() == ItemMod.elemental_fire)
            {
                return true;
            }
        } 
        else if(input.getItem() ==ItemMod.elemental_fire_leggings)
        {
            if(repair.getItem() == ItemMod.elemental_fire)
            {
                return true;
            }
        }
        else if(input.getItem() ==ItemMod.elemental_fire_boots)
        {
            if(repair.getItem() == ItemMod.elemental_fire)
            {
                return true;
            }
        }
        return false;
    }
	
	
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
    {								
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 220, 2));					

			ItemStack head = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
	        ItemStack chest = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
	        ItemStack legs = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
	        ItemStack feet = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
	        if (head != null && head.getItem() == ItemMod.elemental_fire_helmet && chest != null && chest.getItem() == ItemMod.elemental_fire_chestplate && legs != null && legs.getItem() == ItemMod.elemental_fire_leggings && feet != null && feet.getItem() == ItemMod.elemental_fire_boots || player.capabilities.isCreativeMode || player.isSpectator()) {
				player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 220, 2));

	        } 
	}
} 
