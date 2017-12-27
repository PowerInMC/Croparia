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
		func_77655_b(name);
		func_77637_a(CreativeTabsRegistry.WIP);
		setRegistryName(name);
		func_77625_d(1);
		func_77642_a(this);
	}
	
	@Override
	public void func_77663_a(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {

		((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_76424_c, 10, 4));
		((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_76430_j, 10, 4));
		((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_76429_m, 10, 4));
		if(entityIn.func_70093_af())
		{
			entityIn.func_70016_h(0,	1, 0);
			
			
			
			
		}
	}
}
