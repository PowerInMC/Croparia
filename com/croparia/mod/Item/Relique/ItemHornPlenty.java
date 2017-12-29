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
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{			
		int random = worldIn.rand.nextInt(34);
		ItemStack a = new ItemStack(Items.CAKE);
		ItemStack b = new ItemStack(Items.RABBIT_STEW);
		ItemStack c = new ItemStack(Items.COOKED_PORKCHOP);
		ItemStack d = new ItemStack(Items.COOKED_BEEF);
		ItemStack e = new ItemStack(Items.PUMPKIN_PIE);
		ItemStack f = new ItemStack(Items.GOLDEN_CARROT);
		ItemStack g = new ItemStack(Items.COOKED_MUTTON);
		ItemStack h = new ItemStack(Items.COOKED_FISH, 1);
		ItemStack i = new ItemStack(Items.MUSHROOM_STEW);
		ItemStack j = new ItemStack(Items.COOKED_CHICKEN);
		ItemStack k = new ItemStack(Items.BAKED_POTATO);
		ItemStack l = new ItemStack(Items.COOKED_RABBIT);
		ItemStack m = new ItemStack(Items.BREAD);
		ItemStack n = new ItemStack(Items.COOKED_FISH);
		ItemStack o = new ItemStack(Items.CARROT);
		ItemStack p = new ItemStack(Items.APPLE);
		ItemStack q = new ItemStack(Items.CHORUS_FRUIT);
		ItemStack r = new ItemStack(Items.ROTTEN_FLESH);
		ItemStack s = new ItemStack(Items.PORKCHOP);
		ItemStack t = new ItemStack(Items.BEEF);
		ItemStack u = new ItemStack(Items.SPIDER_EYE);
		ItemStack v = new ItemStack(Items.RABBIT);
		ItemStack w = new ItemStack(Items.MUTTON);
		ItemStack x = new ItemStack(Items.FISH);
		ItemStack y = new ItemStack(Items.MELON);
		ItemStack z = new ItemStack(Items.CHICKEN);
		ItemStack aa = new ItemStack(Items.POISONOUS_POTATO);
		ItemStack ab = new ItemStack(Items.FISH, 1);
		ItemStack ac = new ItemStack(Items.COOKIE);
		ItemStack ad = new ItemStack(Items.BEETROOT);
		ItemStack ae = new ItemStack(Items.BEETROOT_SOUP);
		ItemStack af = new ItemStack(Items.POTATO);
		ItemStack ag = new ItemStack(Items.FISH, 2);
		ItemStack ah = new ItemStack(Items.FISH, 3);
		

		
		if(!worldIn.isRemote)			
		{
			
			if(random == 34)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5 + 0.5, pos.getY() + 1, pos.getZ() + 0.5, a));
			}
			if(random == 1)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5 + 0.5, pos.getY() + 1, pos.getZ() + 0.5, b));
			}
			if(random == 2)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5 + 0.5, pos.getY() + 1, pos.getZ() + 0.5, c));
			}
			if(random == 3)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5 + 0.5, pos.getY() + 1, pos.getZ() + 0.5, d));
			}
			if(random == 4)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5 + 0.5, pos.getY() + 1, pos.getZ() + 0.5, e));
			}
			if(random == 5)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5 + 0.5, pos.getY() + 1, pos.getZ() + 0.5, f));
			}
			if(random == 6)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, g));
			}
			if(random == 7)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, h));
			}
			if(random == 8)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, i));
			}
			if(random == 9)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, j));
			}
			if(random == 10)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, k));
			}
			if(random == 11)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, l));
			}
			if(random == 12)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, m));
			}
			if(random == 13)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, n));
			}
			if(random == 14)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, o));
			}
			if(random == 15)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, p));
			}
			if(random == 16)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, q));
			}
			if(random == 17)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, r));
			}
			if(random == 18)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, s));
			}
			if(random == 19)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, t));
			}
			if(random == 20)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, u));
			}
			if(random == 21)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, v));
			}
			if(random == 22)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, w));
			}
			if(random == 23)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, x));
			}
			if(random == 24)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, y));
			}
			if(random == 25)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, z));
			}
			if(random == 26)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, aa));
			}
			if(random == 27)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, ab));
			}
			if(random == 28)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, ac));
			}
			if(random == 29)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, ad));
			}
			if(random == 30)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, ae));
			}
			if(random == 31)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, af));
			}
			if(random == 32)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, ag));
			}
			if(random == 33)
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, ah));
			}

				
			
		}
		

		return EnumActionResult.SUCCESS;
	}
}
