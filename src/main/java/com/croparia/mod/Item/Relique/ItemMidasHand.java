package com.croparia.mod.Item.Relique;

import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemMidasHand extends Item 
{
	public ItemMidasHand(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
	}
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{

		if(worldIn.getBlockState(pos) != Blocks.BEDROCK.getDefaultState() && !worldIn.isRemote)
		{		
			worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.GOLD_INGOT)));	
		}			
		return EnumActionResult.SUCCESS;
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) 
	{
		entity.world.setBlockState(entity.getPosition(), Blocks.GOLD_BLOCK.getDefaultState());
		entity.setDead();
		return true;
	}
}
