package com.croparia.mod.Block.Plant;

import java.util.Random;

import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockPlantDiamond extends Block
{
	public BlockPlantDiamond (Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.func_149647_a(CreativeTabsRegistry.MOD_BLOCK);
		this.func_149711_c(1.0F);
		this.func_149672_a(SoundType.field_185850_c);
	}
	
	public Item func_180660_a(IBlockState state, Random rand, int fortune)
    {
        return Item.func_150898_a(Blocks.field_150484_ah);
    }
	
	public int func_149745_a(Random random)
    {
        return 1;
    }
}
