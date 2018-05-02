package com.croparia.mod.Init;

import com.croparia.mod.ModCroparia;
import com.croparia.mod.World.Biome.AirBiome;
import com.croparia.mod.World.Biome.EarthBiome;
import com.croparia.mod.World.Biome.FireBiome;
import com.croparia.mod.World.Biome.WaterBiome;
import com.croparia.mod.World.Dim.AirDim;
import com.croparia.mod.World.Dim.EarthDim;
import com.croparia.mod.World.Dim.FireDim;
import com.croparia.mod.World.Dim.WaterDim;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class BiomeAndDimMod{

	static final WaterBiome water_biome = new WaterBiome();
	static final FireBiome fire_biome = new FireBiome();
	static final EarthBiome earth_biome = new EarthBiome();
	static final AirBiome air_biome = new AirBiome();
	static final WaterDim water_dim = new WaterDim();
	static final FireDim fire_dim = new FireDim();
	static final EarthDim earth_dim = new EarthDim();
	static final AirDim air_dim = new AirDim();
	

	
	public static void preInit(FMLPreInitializationEvent event) {
		water_biome.instance = ModCroparia.instance;
		water_biome.preInit(event);
		fire_biome.instance = ModCroparia.instance;
		fire_biome.preInit(event);
		earth_biome.instance = ModCroparia.instance;
		earth_biome.preInit(event);
		air_biome.instance = ModCroparia.instance;
		air_biome.preInit(event);
		

		water_dim.instance = ModCroparia.instance;
		water_dim.preInit(event);
		fire_dim.instance = ModCroparia.instance;
		fire_dim.preInit(event);
		earth_dim.instance = ModCroparia.instance;
		earth_dim.preInit(event);
			air_dim.instance = ModCroparia.instance;
		air_dim.preInit(event);
	}
	
	public static void init(FMLInitializationEvent event) {

		water_biome.load(event);
		fire_biome.load(event);
		earth_biome.load(event);
		air_biome.load(event);
		

		water_dim.load(event);
		fire_dim.load(event);
		earth_dim.load(event);
		air_dim.load(event);
	}
	
	public static void serverLoad(FMLServerStartingEvent event) {
		water_biome.serverLoad(event);
		fire_biome.serverLoad(event);
		earth_biome.serverLoad(event);
		air_biome.serverLoad(event);
		

		water_dim.serverLoad(event);
		fire_dim.serverLoad(event);
		earth_dim.serverLoad(event);
		air_dim.serverLoad(event);
	}
}
