package com.croparia.mod.Init.Registry;


import com.croparia.mod.Reference;
import com.croparia.mod.Block.DayGiver.TileEntityDayGiver;
import com.croparia.mod.Block.TileEntity.TileEntityCoalFurnace;
import com.croparia.mod.Block.TileEntity.TileEntityDiamondFurnace;
import com.croparia.mod.Block.TileEntity.TileEntityFireFurnace;
import com.croparia.mod.Block.TileEntity.TileEntityGoldFurnace;
import com.croparia.mod.Block.TileEntity.TileEntityIronFurnace;
import com.croparia.mod.Block.TileEntity.TileEntityLapisFurnace;
import com.croparia.mod.Block.TileEntity.TileEntityObsidianFurnace;
import com.croparia.mod.Block.TileEntity.TileEntityPedestal;
import com.croparia.mod.Block.TileEntity.TileEntityRedstoneFurnace;
import com.croparia.mod.Block.TileEntity.TileEntityRenforcedFurnace;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityRegistry 
{
	public static void init()
	{
		GameRegistry.registerTileEntity(TileEntityCoalFurnace.class, Reference.MOD_ID + "TECoalFurnace");
		GameRegistry.registerTileEntity(TileEntityIronFurnace.class, Reference.MOD_ID + "TEIronFurnace");
		GameRegistry.registerTileEntity(TileEntityGoldFurnace.class, Reference.MOD_ID + "TEGoldFurnace");
		GameRegistry.registerTileEntity(TileEntityRedstoneFurnace.class, Reference.MOD_ID + "TERedstoneFurnace");
		GameRegistry.registerTileEntity(TileEntityLapisFurnace.class, Reference.MOD_ID + "TELapisFurnace");
		GameRegistry.registerTileEntity(TileEntityDiamondFurnace.class, Reference.MOD_ID + "TEDiamondFurnace");
		GameRegistry.registerTileEntity(TileEntityObsidianFurnace.class, Reference.MOD_ID + "TEObsidianFurnace");
		GameRegistry.registerTileEntity(TileEntityRenforcedFurnace.class, Reference.MOD_ID + "TERenforcedFurnace");
		GameRegistry.registerTileEntity(TileEntityFireFurnace.class, Reference.MOD_ID + "TEFireFurnace");	

		GameRegistry.registerTileEntity(TileEntityDayGiver.class, Reference.MOD_ID + "TEDayGiver");
		GameRegistry.registerTileEntity(TileEntityPedestal.class, Reference.MOD_ID + "TEPedestal");
	}
}
