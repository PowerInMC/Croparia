package com.croparia.mod.Block.Harvester;

import java.util.Date;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityHarvester extends TileEntity
{
	public void run() 
	{
		if(world.getBlockState(pos.north()).getBlock().getStateFromMeta(7) == BlockMod.block_crop_coal.getStateFromMeta(7))
		{
			Block block = world.getBlockState(pos.north()).getBlock();
			block.breakBlock(world, pos, BlockMod.block_crop_coal.getStateFromMeta(7));
			world.setBlockState(pos.north(), Blocks.AIR.getDefaultState());
		}
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
	}

	
}
