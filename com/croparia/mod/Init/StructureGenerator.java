package com.croparia.mod.Init;

import java.util.Random;

import com.croparia.mod.WorldGen.Structure.Water.seafarer_house;
import com.croparia.mod.WorldGen.Structure.Water.seafarer_trident;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class StructureGenerator implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) 
	{
		switch (world.provider.getDimension())
		{
			case -1:
				generateNether(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 1:
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 5:
				generateWater(world, random, chunkX * 16, chunkZ * 16);
				break;
		}	
	}

	private void generateSurface(World world, Random random, int i, int j)
	{

	}

	private void generateNether(World world, Random random, int i, int j)
	{

	}

	private void generateEnd(World world, Random random, int i, int j)
	{

	}
	
	private void generateWater(World world, Random random, int i, int j)
	{
		int x1 = i + random.nextInt(16);
		int y1 = random.nextInt(128); 
		int z1 = j + random.nextInt(16); 
		BlockPos pos = new BlockPos(x1, y1, z1);
		if(world.getBlockState(pos.down()) == Blocks.ICE.getDefaultState() && world.isAirBlock(pos.up()))
		{
			new seafarer_house().generate(world, random, pos);
		}
	}
	
}
