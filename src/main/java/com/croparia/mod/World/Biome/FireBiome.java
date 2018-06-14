package com.croparia.mod.World.Biome;

import java.util.Random;

import com.croparia.mod.Entity.EntityAkurojin;
import com.croparia.mod.Entity.Minotaur.EntityMinotaur;
import com.croparia.mod.Entity.Minotaur.EntityMinotaurL;
import com.croparia.mod.Entity.Minotaur.EntityMinotaurS;
import com.croparia.mod.World.WorldGen.Generator.ObsidianGroundGenerator;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FireBiome {

	static Biome.BiomeProperties customProps = null;
	public static BiomeGenfirebiome biome = null;

	static {
		customProps = new Biome.BiomeProperties("firebiome");
		customProps.setRainfall(0.90F);
		customProps.setBaseHeight(0.1F);
		customProps.setHeightVariation(0.4F);
		customProps.setWaterColor(0x000099);
		biome = new BiomeGenfirebiome(customProps);
	}

	public static Object instance;

	public FireBiome() {
	}

	public void load(FMLInitializationEvent event) {
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.NETHER);
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 0));
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		
	}

	public void registerRenderers() {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {
	}

	static class BiomeGenfirebiome extends Biome {
		public BiomeGenfirebiome(Biome.BiomeProperties mycustomProps) {
			super(mycustomProps);
			setRegistryName("firebiome");
			topBlock = Blocks.MAGMA.getDefaultState();
			fillerBlock = Blocks.BEDROCK.getDefaultState();
			decorator.generateFalls = false;
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 20;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;

			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();

			this.spawnableMonsterList.add(new SpawnListEntry(EntityMinotaur.class, 4, 1, 2));
			this.spawnableMonsterList.add(new SpawnListEntry(EntityMinotaurS.class, 3, 2, 4));
			this.spawnableMonsterList.add(new SpawnListEntry(EntityMinotaurL.class, 2, 1, 2));
			this.spawnableMonsterList.add(new SpawnListEntry(EntityAkurojin.class, 4, 1, 2));
		
		}
		
		@Override
		public WorldGenerator getRandomWorldGenForGrass(Random rand) 
		{
			return new ObsidianGroundGenerator();
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getGrassColorAtPos(BlockPos pos) {
			return 0xB8400A;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getFoliageColorAtPos(BlockPos pos) {
			return 0xB8400A;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return 0xE06666;
		}

	}

}
