package com.croparia.mod.Item.Relique;

import java.util.Random;

import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemHornPlenty extends Item 
{
	public ItemHornPlenty(String name)
	{
		func_77655_b(name);
		setRegistryName(name);
		func_77625_d(1);
		func_77637_a(CreativeTabsRegistry.MOD_BLOCK);
	}

	@Override
	public EnumActionResult func_180614_a(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{			
		int random = worldIn.field_73012_v.nextInt(34);
		ItemStack a = new ItemStack(Items.field_151105_aU);
		ItemStack b = new ItemStack(Items.field_179560_bq);
		ItemStack c = new ItemStack(Items.field_151157_am);
		ItemStack d = new ItemStack(Items.field_151083_be);
		ItemStack e = new ItemStack(Items.field_151158_bO);
		ItemStack f = new ItemStack(Items.field_151150_bK);
		ItemStack g = new ItemStack(Items.field_179557_bn);
		ItemStack h = new ItemStack(Items.field_179566_aV, 1);
		ItemStack i = new ItemStack(Items.field_151009_A);
		ItemStack j = new ItemStack(Items.field_151077_bg);
		ItemStack k = new ItemStack(Items.field_151168_bH);
		ItemStack l = new ItemStack(Items.field_179559_bp);
		ItemStack m = new ItemStack(Items.field_151025_P);
		ItemStack n = new ItemStack(Items.field_179566_aV);
		ItemStack o = new ItemStack(Items.field_151172_bF);
		ItemStack p = new ItemStack(Items.field_151034_e);
		ItemStack q = new ItemStack(Items.field_185161_cS);
		ItemStack r = new ItemStack(Items.field_151078_bh);
		ItemStack s = new ItemStack(Items.field_151147_al);
		ItemStack t = new ItemStack(Items.field_151082_bd);
		ItemStack u = new ItemStack(Items.field_151070_bp);
		ItemStack v = new ItemStack(Items.field_179558_bo);
		ItemStack w = new ItemStack(Items.field_179561_bm);
		ItemStack x = new ItemStack(Items.field_151115_aP);
		ItemStack y = new ItemStack(Items.field_151127_ba);
		ItemStack z = new ItemStack(Items.field_151076_bf);
		ItemStack aa = new ItemStack(Items.field_151170_bI);
		ItemStack ab = new ItemStack(Items.field_151115_aP, 1);
		ItemStack ac = new ItemStack(Items.field_151106_aX);
		ItemStack ad = new ItemStack(Items.field_185164_cV);
		ItemStack ae = new ItemStack(Items.field_185165_cW);
		ItemStack af = new ItemStack(Items.field_151174_bG);
		ItemStack ag = new ItemStack(Items.field_151115_aP, 2);
		ItemStack ah = new ItemStack(Items.field_151115_aP, 3);
		

		
		if(!worldIn.field_72995_K)			
		{
			
			if(random == 34)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5 + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, a));
			}
			if(random == 1)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5 + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, b));
			}
			if(random == 2)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5 + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, c));
			}
			if(random == 3)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5 + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, d));
			}
			if(random == 4)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5 + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, e));
			}
			if(random == 5)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5 + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, f));
			}
			if(random == 6)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, g));
			}
			if(random == 7)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, h));
			}
			if(random == 8)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, i));
			}
			if(random == 9)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, j));
			}
			if(random == 10)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, k));
			}
			if(random == 11)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, l));
			}
			if(random == 12)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, m));
			}
			if(random == 13)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, n));
			}
			if(random == 14)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, o));
			}
			if(random == 15)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, p));
			}
			if(random == 16)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, q));
			}
			if(random == 17)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, r));
			}
			if(random == 18)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, s));
			}
			if(random == 19)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, t));
			}
			if(random == 20)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, u));
			}
			if(random == 21)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, v));
			}
			if(random == 22)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, w));
			}
			if(random == 23)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, x));
			}
			if(random == 24)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, y));
			}
			if(random == 25)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, z));
			}
			if(random == 26)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, aa));
			}
			if(random == 27)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, ab));
			}
			if(random == 28)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, ac));
			}
			if(random == 29)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, ad));
			}
			if(random == 30)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, ae));
			}
			if(random == 31)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, af));
			}
			if(random == 32)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, ag));
			}
			if(random == 33)
			{
				worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, ah));
			}

				
			
		}
		

		return EnumActionResult.SUCCESS;
	}
}
