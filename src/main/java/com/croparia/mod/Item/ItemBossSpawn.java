package com.croparia.mod.Item;

import java.util.Random;

import com.croparia.mod.Entity.Seafarer.EntitySeafarer;
import com.croparia.mod.World.WorldGen.Generator.WorldGenStructure;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ItemBossSpawn extends Item{
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 
	{
		if(!worldIn.isRemote)
		{
			EntitySeafarer e = new EntitySeafarer(worldIn);
			e.setPosition(playerIn.getPosition().getX() + worldIn.rand.nextInt(2) - worldIn.rand.nextInt(4), playerIn.getPosition().getY(), playerIn.getPosition().getZ() + worldIn.rand.nextInt(2)  - worldIn.rand.nextInt(4));
			worldIn.spawnEntity(e);
			ItemStack stack = new ItemStack(this);
			stack.shrink(1);
			
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, new ItemStack(this));
	}
}
