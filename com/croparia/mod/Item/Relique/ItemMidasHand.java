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
		func_77655_b(name);
		setRegistryName(name);
		func_77625_d(1);
		func_77637_a(CreativeTabsRegistry.MOD_BLOCK);
	}
	@Override
	public EnumActionResult func_180614_a(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{

		if(worldIn.func_180495_p(pos) != Blocks.field_150357_h.func_176223_P() && !worldIn.field_72995_K)
		{		
			worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());
			worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p(), new ItemStack(Items.field_151043_k)));	
		}			
		return EnumActionResult.SUCCESS;
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) 
	{
		entity.field_70170_p.func_175656_a(entity.func_180425_c(), Blocks.field_150340_R.func_176223_P());
		entity.func_70106_y();
		return true;
	}
}
