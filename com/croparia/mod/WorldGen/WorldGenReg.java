package com.croparia.mod.WorldGen;

import java.util.Random;

import com.croparia.mod.WorldGen.Structure.Water.seafarer_house;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenReg implements IWorldGenerator 
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) 
	{
		switch (world.field_73011_w.getDimension()) {
		case -1:
			GenerateNether(world, chunkX * 16, chunkZ * 16, random);
			break;

		case 0:
			GenerateOverworld(world, chunkX * 16, chunkZ * 16, random);
			break;

		case 1:
			GenerateEnd(world, chunkX * 16, chunkZ * 16, random);

		case 5:
			GenerateWater(world, chunkX * 16, chunkZ * 16, random);
		}
	}

	private void GenerateNether(World world, int i, int j, Random random) 
	{

	}

	private void GenerateOverworld(World world, int i, int j, Random random) 
	{

	}

	private void GenerateEnd(World world, int i, int j, Random random) 
	{

	}
	
	private void GenerateWater(World world, int i, int j, Random random)
	{
		// Structures
		int Xpos = i + random.nextInt(16);
		int Ypos = random.nextInt(128);
		int Zpos = j + random.nextInt(16);

		for (int x = 0; x < 500; x++) {
			new seafarer_house().func_180709_b(world, random, new BlockPos(Xpos, Ypos, Zpos));
		}
	}
}
