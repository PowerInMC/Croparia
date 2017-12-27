package com.croparia.mod.proxy;

import com.croparia.mod.EventHandler.CropariaEvent;
import com.croparia.mod.EventHandler.FuelHandler;
import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.MobRegistry;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy
{	
	
	@Override
    public void registerRenders()
    {
        BlockMod.registerRenders();
        ItemMod.registerRenders();
             
        MobRegistry.register();      

		MinecraftForge.EVENT_BUS.register(new CropariaEvent());
        GameRegistry.registerFuelHandler(new FuelHandler());

     
    }
}
