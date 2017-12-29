package com.croparia.mod.Item;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemEternalSpace extends Item 
{
	public ItemEternalSpace(String name)
	{
		super();
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabsRegistry.WIP);
		setRegistryName(name);
		setMaxStackSize(1);
		setContainerItem(this);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {

		((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 4));
		((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 10, 4));
		((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 10, 4));
		if(entityIn.isSneaking())
		{
			entityIn.setVelocity(0,	1, 0);
			
			
			
			
		}
	}
}