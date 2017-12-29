package com.croparia.mod.World.Biome;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.entity.boss.EntityWither;

import java.util.Random;

import com.croparia.mod.Entity.EntitySeafarer;
import com.croparia.mod.Init.BlockMod;

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
			decorator.grassPerChunk = 0;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.reedsPerChunk = 10;
			decorator.cactiPerChunk = 0;

			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			
			this.spawnableMonsterList.add(new SpawnListEntry(EntitySeafarer.class, 10, 5, 8));

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
