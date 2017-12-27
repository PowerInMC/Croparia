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

import net.minecraft.world.biome.Biome.SpawnListEntry;

public class EarthBiome {

	static Biome.BiomeProperties customProps = null;
	public static BiomeGenearthbiome biome = null;

	static {
		customProps = new Biome.BiomeProperties("earthbiome");
		customProps.func_185395_b(0.90F);
		customProps.func_185398_c(0.1F);
		customProps.func_185400_d(0.2F);
		customProps.func_185402_a(0x000099);
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
			field_76752_A = Blocks.field_150346_d.func_176203_a(2);
			field_76753_B = Blocks.field_150347_e.func_176223_P();
			field_76760_I.field_76808_K = false;
			field_76760_I.field_76832_z = 4;
			field_76760_I.field_76802_A = 0;
			field_76760_I.field_76803_B = 0;
			field_76760_I.field_76804_C = 10;
			field_76760_I.field_76798_D = 0;
			field_76760_I.field_76799_E = 0;
			field_76760_I.field_76800_F = 0;

			this.field_76761_J.clear();
			this.field_76762_K.clear();
			this.field_76755_L.clear();
			this.field_82914_M.clear();
			
			this.field_76761_J.add(new SpawnListEntry(EntityCentaur.class, 10, 5, 8));
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int func_180627_b(BlockPos pos) {
			return 0xB8400A;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int func_180625_c(BlockPos pos) {
			return 0xB8400A;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int func_76731_a(float currentTemperature) {
			return 0xE06666;
		}

	}

}
