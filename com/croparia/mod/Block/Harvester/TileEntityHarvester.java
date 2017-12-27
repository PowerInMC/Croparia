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
		if(field_145850_b.func_180495_p(field_174879_c.func_177978_c()).func_177230_c().func_176203_a(7) == BlockMod.block_crop_coal.func_176203_a(7))
		{
			Block block = field_145850_b.func_180495_p(field_174879_c.func_177978_c()).func_177230_c();
			block.func_180663_b(field_145850_b, field_174879_c, BlockMod.block_crop_coal.func_176203_a(7));
			field_145850_b.func_175656_a(field_174879_c.func_177978_c(), Blocks.field_150350_a.func_176223_P());
		}
	}
	
	@Override
	public NBTTagCompound func_189515_b(NBTTagCompound compound) {
		super.func_189515_b(compound);
		return compound;
	}
	
	@Override
	public void func_145839_a(NBTTagCompound compound) {
		super.func_145839_a(compound);
	}

	
}
