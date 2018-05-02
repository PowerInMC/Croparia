package com.croparia.mod.World.Biome;

import java.util.Random;

import com.croparia.mod.Entity.Penguin.EntityPenguin;
import com.croparia.mod.Entity.Seafarer.EntitySeafarer;
import com.croparia.mod.Entity.Seafarer.EntitySeafarerL;
import com.croparia.mod.Entity.Seafarer.EntitySeafarerS;
import com.croparia.mod.World.WorldGen.Generator.IcyPlantGenerator;

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

public class WaterBiome {

	static Biome.BiomeProperties customProps = null;
	public static BiomeGenwaterbiome biome = null;

	static {
		customProps = new Biome.BiomeProperties("waterbiome");
		customProps.setRainfall(0.90F);
		customProps.setBaseHeight(0.1F);
		customProps.setHeightVariation(0.4F);
		customProps.setWaterColor(0x000099);
		biome = new BiomeGenwaterbiome(customProps);
	}

	public static Object instance;

	public WaterBiome() {
	}

	public void load(FMLInitializationEvent event) {
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.BEACH);
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 0));
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

	static class BiomeGenwaterbiome extends Biome {
		public BiomeGenwaterbiome(Biome.BiomeProperties mycustomProps) {
			super(mycustomProps);
			setRegistryName("waterbiome");
			topBlock = Blocks.PACKED_ICE.getDefaultState();
			fillerBlock = Blocks.ICE.getDefaultState();
			decorator.generateFalls = false;
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 20;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.reedsPerChunk = 10;
			decorator.cactiPerChunk = 0;

			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();

			// int weight, int groupCountMin, int groupCountMax
			this.spawnableMonsterList.add(new SpawnListEntry(EntitySeafarer.class, 4, 1, 2));
			this.spawnableMonsterList.add(new SpawnListEntry(EntitySeafarerL.class, 2, 1, 1));
			this.spawnableMonsterList.add(new SpawnListEntry(EntitySeafarerS.class, 3, 2, 4));
			this.spawnableMonsterList.add(new SpawnListEntry(EntityPenguin.class, 15, 5, 8));

		}
		
		@Override
		public WorldGenerator getRandomWorldGenForGrass(Random rand) 
		{
			return new IcyPlantGenerator();
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getGrassColorAtPos(BlockPos pos) {
			return 0x00cc99;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getFoliageColorAtPos(BlockPos pos) {
			return 0x00cc99;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return 0x9999ff;
		}
		
		@Override
		public boolean getEnableSnow() {
			return true;
		}

	}

}
