package com.croparia.mod.Item;

import org.lwjgl.input.Keyboard;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemEternalTime extends Item 
{

	public ItemEternalTime(String name)
	{
		super();
		func_77655_b(name);
		func_77637_a(CreativeTabsRegistry.MOD_BLOCK);
		setRegistryName(name);
		func_77625_d(1);
		func_77642_a(this);
		func_77656_e(5000);
	}
	
	
	@Override
	public void func_77663_a(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) 
	{	
		EntityPlayer player = (EntityPlayer)entityIn;

		
		if(player.func_70093_af())
		{
			if(stack.func_77952_i() < stack.func_77958_k())
			{
				worldIn.func_72877_b(worldIn.func_72820_D() + (long) 100F) ;
				stack.func_77964_b(stack.func_77952_i() + 1);	
			}

		}
		
			for(int i = 0; i < 4; i++)
			{
				ItemStack armor = player.field_71071_by.field_70460_b.get(i);
				if(armor != null && armor.func_77952_i() > 0 && stack.func_77952_i() < stack.func_77958_k())
				{
					armor.func_77964_b(armor.func_77952_i() - 1);
					stack.func_77964_b(stack.func_77952_i() + 1);	
				}					
			}	
			
			if(stack.func_77952_i() == stack.func_77958_k())
			{
				entityIn.func_70097_a(DamageSource.field_76376_m, 2000000F);
			}
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) 
	{
		stack.func_77964_b(stack.func_77952_i() - 100);
		entity.func_70106_y();
		return true;
	}
	

	

		
		
}
