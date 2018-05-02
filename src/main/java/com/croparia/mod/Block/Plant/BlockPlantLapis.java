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

public class BlockPlantLapis extends Block
{
	public BlockPlantLapis (Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
		this.setHardness(1.0F);
		this.setSoundType(SoundType.PLANT);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(Blocks.LAPIS_BLOCK);
    }
	
	public int quantityDropped(Random random)
    {
        return 1;
    }
}