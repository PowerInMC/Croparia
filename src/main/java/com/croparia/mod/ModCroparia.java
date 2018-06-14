package com.croparia.mod;

import com.croparia.mod.Config.CropariaConfig;
import com.croparia.mod.Init.BiomeAndDimMod;
import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.RecipeRegistry;
import com.croparia.mod.Init.Registry.SmeltingRegistry;
import com.croparia.mod.Init.Registry.TileEntityRegistry;
import com.croparia.mod.World.WorldGen.OreWorldGen;
import com.croparia.mod.World.WorldGen.StructureWorldGen;
import com.croparia.mod.proxy.CommonProxy;
import com.cropariaCompat.mod.OreDic.OreDictionaryRegistry;
import com.cropariaCompat.mod.OreDic.RecipeOreDictionaryRegistry;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = "after:guideapiModelGolemBoss")
public class ModCroparia{
	

	
	@SidedProxy(clientSide = "com.croparia.mod.proxy.ClientProxy", serverSide = "com.croparia.mod.proxy.CommonProxy")
	public static CommonProxy proxy;

	@Mod.Instance("croparia")
	public static ModCroparia instance;
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		CropariaConfig.config(); 
		BlockMod.init();
		ItemMod.init();		
		OreDictionaryRegistry.register();
		BlockMod.register();
		ItemMod.register();
		RecipeRegistry.init();
		SmeltingRegistry.register();
		BiomeAndDimMod.preInit(event);

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		BiomeAndDimMod.init(event);
		TileEntityRegistry.init();	
		GameRegistry.registerWorldGenerator(new OreWorldGen(), 0);
		GameRegistry.registerWorldGenerator(new StructureWorldGen(), 0); 
	}
	

	@Mod.EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		BiomeAndDimMod.serverLoad(event);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		OreDictionaryRegistry.register();
		RecipeOreDictionaryRegistry.register();
		proxy.registerRenders();		
	}
}