package com.croparia.mod.World;

import java.util.Random;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.World.Dim.WaterDim;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldgenMod implements IWorldGenerator {
	
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.field_73011_w.getDimension()) {
		case -1:
			genNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 0:
			genWorld(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			genEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 5:
			genWaterDim(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 6:
			genFireDim(world, random, chunkX * 16, chunkZ * 16);
			break;

		}

	}
	
	
	private void genFireDim(World world, Random rand, int chunkX, int chunkZ) {
		for(int i = 0;i < 10; i++)
		{
			addWorldGenMinable(BlockMod.magma_fire_ore.func_176223_P(), 9, 128, world, rand, chunkX, chunkZ);
		}
	}
	
	private void genWaterDim(World world, Random rand, int chunkX, int chunkZ) {
		for(int i = 0;i < 10; i++)
		{
			
		}
	}

	private void genEnd(World world, Random rand, int chunkX, int chunkZ) {
	}


	private void genNether(World world, Random rand, int chunkX, int chunkZ) {
		// Pour l'enfer(Nether)
		// code \/
		// code /\
	}

	private void genWorld(World world, Random rand, int chunkX, int chunkZ) {

		for (int i = 0; i < 10; i++) {
			// code \/
			
			// code /\
		}
	}

	public void addWorldGenMinable(IBlockState BlocID, int MaxMinerai, int MaxY, World world, Random rand, int chunkX,
			int chunkZ) {
		int randPosX = chunkX + rand.nextInt(16);
		int randPosY = rand.nextInt(MaxY);
		int randPosZ = chunkZ + rand.nextInt(16);
		new WorldGenMinable(BlocID, MaxMinerai).func_180709_b(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
	}

}
