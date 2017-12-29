package com.croparia.mod.World.Biome;

import java.util.Random;

import com.croparia.mod.Entity.EntityCentaur;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EarthBiome {

	static Biome.BiomeProperties customProps = null;
	public static BiomeGenearthbiome biome = null;

	static {
		customProps = new Biome.BiomeProperties("earthbiome");
		customProps.setRainfall(0.90F);
		customProps.setBaseHeight(0.1F);
		customProps.setHeightVariation(0.2F);
		customProps.setWaterColor(0x000099);
		biome = new BiomeGenearthbiome(customProps);
	}

	public static Object instance;

	public EarthBiome() {
	}

	public void load(FMLInitializationEvent event) {
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.NETHER);
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

	static class BiomeGenearthbiome extends Biome {
		public BiomeGenearthbiome(Biome.BiomeProperties mycustomProps) {
			super(mycustomProps);
			setRegistryName("earthbiome");
			topBlock = Blocks.DIRT.getStateFromMeta(2);
			fillerBlock = Blocks.COBBLESTONE.getDefaultState();
			decorator.generateFalls = false;
			decorator.treesPerChunk = 4;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.deadBushPerChunk = 10;
			decorator.mushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;

			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			
			this.spawnableMonsterList.add(new SpawnListEntry(EntityCentaur.class, 10, 5, 8));
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
