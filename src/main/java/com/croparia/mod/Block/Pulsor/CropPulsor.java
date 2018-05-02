package com.croparia.mod.Block.Pulsor;

import java.util.Random;

import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockStem;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

public class CropPulsor extends Block {

    public CropPulsor(String name) {
		super(Material.IRON);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
		setHardness(5F);
		setResistance(10F);
	}

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) 
    {
    	if(!worldIn.isRemote)
    	{
	    	 Block block_above = worldIn.getBlockState(pos).getBlock();
	
	         if (!worldIn.isAirBlock(pos))
	             return;
	
	         if (block_above instanceof CropPulsor) {
	             block_above.updateTick(worldIn, pos, state, rand);
	             return;
	         }
	
	         if (!worldIn.isAirBlock(pos.up(2)))
	             return;
	
	         Block plant_block = worldIn.getBlockState(pos.up(2)).getBlock();
	         if (plant_block instanceof BlockStem)
	         {
	        	 plant_block.updateTick(worldIn, pos.up(2), state, rand);
	         }
	         // Cactus and Sugar Canes too are handled slightly differently
	         else if (plant_block instanceof BlockReed || plant_block instanceof BlockCactus)
	         {
	             for (int l = 1; worldIn.isAirBlock(pos.up(1 + l)) && l < 3; l++)
	             {
	                 worldIn.getBlockState(pos.up(1 + l)).getBlock().updateTick(worldIn, pos.up(1 + l), state, rand);
	             }
	         }
	         else if (plant_block instanceof IPlantable)
	         {
	             plant_block.updateTick(worldIn, pos.up(2), state, rand);
	         }
	    }
    	else
    		Minecraft.getMinecraft().player.sendChatMessage("no");
    }
}