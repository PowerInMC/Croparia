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
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
		setRegistryName(name);
		setMaxStackSize(1);
		setContainerItem(this);
		setMaxDamage(5000);
	}
	
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) 
	{	
		EntityPlayer player = (EntityPlayer)entityIn;

		
		if(player.isSneaking())
		{
			if(stack.getItemDamage() < stack.getMaxDamage())
			{
				worldIn.setWorldTime(worldIn.getWorldTime() + (long) 100F) ;
				stack.setItemDamage(stack.getItemDamage() + 1);	
			}

		}
		
			for(int i = 0; i < 4; i++)
			{
				ItemStack armor = player.inventory.armorInventory.get(i);
				if(armor != null && armor.getItemDamage() > 0 && stack.getItemDamage() < stack.getMaxDamage())
				{
					armor.setItemDamage(armor.getItemDamage() - 1);
					stack.setItemDamage(stack.getItemDamage() + 1);	
				}					
			}	
			
			if(stack.getItemDamage() == stack.getMaxDamage())
			{
				entityIn.attackEntityFrom(DamageSource.MAGIC, 2000000F);
			}
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) 
	{
		stack.setItemDamage(stack.getItemDamage() - 100);
		entity.setDead();
		return true;
	}
	

	

		
		
}
