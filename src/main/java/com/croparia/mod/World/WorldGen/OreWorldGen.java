package com.croparia.mod.World.WorldGen;

import java.util.Random;

import com.croparia.mod.Init.BlockMod;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreWorldGen implements IWorldGenerator {

	//0formatter:off

	private WorldGenerator gen_ice;
	private WorldGenerator gen_poisonous_icy_plant;
	private WorldGenerator gen_obsi_fired;
	private WorldGenerator gen_fruitgrass;
	private WorldGenerator gen_coalcrop;
	
	//Oformatter:on
	
	public OreWorldGen()
	{
		this.gen_ice = new WorldGenMinable(Blocks.ICE.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.PACKED_ICE));
		this.gen_poisonous_icy_plant = new WorldGenMinable(BlockMod.poisonous_icy_plant.getDefaultState(), 6, BlockMatcher.forBlock(BlockMod.icy_plant));
		this.gen_obsi_fired = new WorldGenMinable(BlockMod.obsidian_fired_ground.getDefaultState(), 6, BlockMatcher.forBlock(BlockMod.obsidian_ground));
		this.gen_fruitgrass = new WorldGenMinable(BlockMod.fruit_grass.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.TALLGRASS));
		this.gen_coalcrop = new WorldGenMinable(BlockMod.block_crop_coal.getStateFromMeta(2), 6, BlockMatcher.forBlock(Blocks.TALLGRASS));
		
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 0 : //OverWorld
			this.runGenerator(this.gen_fruitgrass, world, random, chunkX, chunkZ, 60, Blocks.GRASS);
			this.runGenerator(this.gen_coalcrop, world, random, chunkX, chunkZ, 30, Blocks.GRASS);
			break;
		case 1 : //Nether
			
			break;
		case -1 : // End
			
			break;
			
		case 5 : //Waterdim
			this.runGenerator(this.gen_ice, world, random, chunkX, chunkZ, 40, 0, 256);
			this.runGenerator(this.gen_poisonous_icy_plant, world, random, chunkX, chunkZ, 60, Blocks.ICE);
			break;
			
		case 6 : //Firedim
		this.runGenerator(this.gen_obsi_fired, world, random, chunkX, chunkZ, 60, Blocks.MAGMA);
		break;
	}
	} 
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chancesToSpawn, int minHeight, int maxHeight)
	{
		if(minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
		{
			throw new IllegalArgumentException("Illegal Height Argument For WorldGenerator");
		}
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chancesToSpawn; i++)
		{
			int x = chunkX * 16 + random.nextInt(16);
			int y  = minHeight + random.nextInt(heightDiff);
			int z = chunkZ * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chancesToSpawn, Block topblock)
	{
		for(int i = 0; i < chancesToSpawn; i++)
		{
			int x = chunkX * 16 + random.nextInt(16);
			int z = chunkZ * 16 + random.nextInt(16);
			int y = calculateGenerationHeight(world, x, z, topblock);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}
	
	private static int calculateGenerationHeight(World world, int x, int z, Block topBlock)
	{
		int y = world.getHeight();
		boolean foundGround = false;
		
		while(!foundGround && y-- >= 0)
		{
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = block == topBlock;
		}
		
		return y;
	}
}
