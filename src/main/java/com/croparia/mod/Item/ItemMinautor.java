package com.croparia.mod.Item;

import com.croparia.mod.Entity.Minotaur.EntityMinotaur;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemMinautor extends Item
{
	public ItemMinautor(String name)
	{
		super();
		setUnlocalizedName(name);

		setRegistryName(name);
	}	
}
