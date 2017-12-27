package com.croparia.mod.Block.Elemental;

import java.util.Random;

import com.croparia.mod.Entity.EntityCentaur;
import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockElemental extends Block{

	public BlockElemental(String name) 
	{
		super(Material.field_151576_e);
		func_149663_c(name);
		func_149711_c(1.5F);
		func_149752_b(10.0F);
		func_149672_a(SoundType.field_185851_d);
		this.func_149675_a(true);
		
	}	
}
