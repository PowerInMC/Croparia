package com.croparia.mod.Init.Registry;

import com.croparia.mod.ModCroparia;
import com.croparia.mod.Reference;
import com.croparia.mod.Entity.EntityCentaur;
import com.croparia.mod.Entity.EntityFlying;
import com.croparia.mod.Entity.EntityReaper;
import com.croparia.mod.Entity.Golem.EntityIcyBoss;
import com.croparia.mod.Entity.Golem.EntitySteamBoss;
import com.croparia.mod.Entity.Golem.EntityWaterBoss;
import com.croparia.mod.Entity.Minotaur.EntityMinotaur;
import com.croparia.mod.Entity.Minotaur.EntityMinotaurL;
import com.croparia.mod.Entity.Minotaur.EntityMinotaurS;
import com.croparia.mod.Entity.Penguin.EntityPenguin;
import com.croparia.mod.Entity.Penguin.EntityPenguin2;
import com.croparia.mod.Entity.Penguin.EntityPenguin3;
import com.croparia.mod.Entity.Seafarer.EntitySeafarer;
import com.croparia.mod.Entity.Seafarer.EntitySeafarerL;
import com.croparia.mod.Entity.Seafarer.EntitySeafarerS;
import com.croparia.mod.Models.ModelCentaur;
import com.croparia.mod.Models.ModelFlying;
import com.croparia.mod.Models.ModelGolemBoss;
import com.croparia.mod.Models.ModelMinotaur;
import com.croparia.mod.Models.ModelPenguin;
import com.croparia.mod.Models.ModelReaper;
import com.croparia.mod.Models.Seafarer.ModelSeafarerRmx;
import com.croparia.mod.Renderer.RenderCentaur;
import com.croparia.mod.Renderer.RenderFlying;
import com.croparia.mod.Renderer.RenderReaper;
import com.croparia.mod.Renderer.Golem.RenderIcyBoss;
import com.croparia.mod.Renderer.Golem.RenderSteamBoss;
import com.croparia.mod.Renderer.Golem.RenderWaterBoss;
import com.croparia.mod.Renderer.Minotaur.RenderMinotaur;
import com.croparia.mod.Renderer.Minotaur.RenderMinotaurL;
import com.croparia.mod.Renderer.Minotaur.RenderMinotaurS;
import com.croparia.mod.Renderer.Penguin.RenderPenguin;
import com.croparia.mod.Renderer.Penguin.RenderPenguin2;
import com.croparia.mod.Renderer.Penguin.RenderPenguin3;
import com.croparia.mod.Renderer.Seafarer.RenderSeafarer;
import com.croparia.mod.Renderer.Seafarer.RenderSeafarerL;
import com.croparia.mod.Renderer.Seafarer.RenderSeafarerS;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MobRegistry
{      
		private static final Biome[] PLAINS = new Biome[] {Biome.getBiome(1)};
		public static int entitiesId;
	
        public static void register()
        {
            MobRegistry.registerRender();
            MobRegistry.init();
        }
        
        public static void registerRender()
        {

            RenderingRegistry.registerEntityRenderingHandler(EntitySeafarer.class, new RenderSeafarer(Minecraft.getMinecraft().getRenderManager(), new ModelSeafarerRmx(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntitySeafarerL.class, new RenderSeafarerL(Minecraft.getMinecraft().getRenderManager(), new ModelSeafarerRmx(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntitySeafarerS.class, new RenderSeafarerS(Minecraft.getMinecraft().getRenderManager(), new ModelSeafarerRmx(), 0.5F));

            RenderingRegistry.registerEntityRenderingHandler(EntityMinotaur.class, new RenderMinotaur(Minecraft.getMinecraft().getRenderManager(), new ModelMinotaur(), 0.5F));
       //     RenderingRegistry.registerEntityRenderingHandler(EntityMinotaurL.class, new RenderMinotaurL(Minecraft.getMinecraft().getRenderManager(), new ModelMinotaur(), 0.5F));
         //   RenderingRegistry.registerEntityRenderingHandler(EntityMinotaurS.class, new RenderMinotaurS(Minecraft.getMinecraft().getRenderManager(), new ModelMinotaur(), 0.5F));
            
            RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class, new RenderCentaur(Minecraft.getMinecraft().getRenderManager(), new ModelCentaur(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityFlying.class, new RenderFlying(Minecraft.getMinecraft().getRenderManager(), new ModelFlying(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityReaper.class, new RenderReaper(Minecraft.getMinecraft().getRenderManager(), new ModelReaper(), 0.5F));

            RenderingRegistry.registerEntityRenderingHandler(EntityPenguin.class, new RenderPenguin(Minecraft.getMinecraft().getRenderManager(), new ModelPenguin(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityPenguin2.class, new RenderPenguin2(Minecraft.getMinecraft().getRenderManager(), new ModelPenguin(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityPenguin3.class, new RenderPenguin3(Minecraft.getMinecraft().getRenderManager(), new ModelPenguin(), 0.5F));
            

            RenderingRegistry.registerEntityRenderingHandler(EntityWaterBoss.class, new RenderWaterBoss(Minecraft.getMinecraft().getRenderManager(), new ModelGolemBoss(), 0.5f));
            RenderingRegistry.registerEntityRenderingHandler(EntityIcyBoss.class, new RenderIcyBoss(Minecraft.getMinecraft().getRenderManager(), new ModelGolemBoss(), 0.5f));
            RenderingRegistry.registerEntityRenderingHandler(EntitySteamBoss.class, new RenderSteamBoss(Minecraft.getMinecraft().getRenderManager(), new ModelGolemBoss(), 0.5f));
            
            //RenderingRegistry.registerEntityRenderingHandler(EntityGoldenChicken.class, new RenderGoldenChicken(Minecraft.getMinecraft().getRenderManager(), new ModelChicken(), 0.5F));
            }
        
        public static void init(){

    		register(EntitySeafarer.class, "Seafarer", 0x000069, 0x110BBF);  
    		register(EntitySeafarerL.class, "SeafarerL", 0x000069, 0x110BBF);  
    		register(EntitySeafarerS.class, "SeafarerS", 0x000069, 0x110BBF);  
    		
    		register(EntityMinotaur.class, "Minotaur", 0x000069, 0xDB000A);
    		//register(EntityMinotaurL.class, "MinotaurL", 0x000069, 0xDB000A);
    		//register(EntityMinotaurS.class, "MinotaurS", 0x000069, 0xDB000A);
    		
    		register(EntityCentaur.class, "Centaur", 0x000069, 0x913C04);
    		register(EntityFlying.class, "Flying", 0x000069, 0xC0C0C0);
    		register(EntityReaper.class, "Reaper", 0x00000, 0xFFFFFF);  

    		register(EntityPenguin.class, "Penguin", 0x00000, 0xC5801F); 

    		register(EntityWaterBoss.class, "WaterBoss", 0xFFFFFF, 0x000BFF); 
    		register(EntityIcyBoss.class, "IcyBoss", 0xFFFFFF, 0xA5F4FF); 
    		register(EntitySteamBoss.class, "SteamBoss", 0xFFFFFF, 0xFFFFFF); 
    		
    		//register(EntityGoldenChicken.class, "GoldenChicken", 0xDEDE00, 0xFFFF8B);  
        }

    	

    	public static void register(Class EntityClass, String entityNameIn, int solidColorIn, int spotColorIn){

    		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + entityNameIn), EntityClass, entityNameIn, ++entitiesId, ModCroparia.instance, 64, 1, true, solidColorIn, spotColorIn);
    	}
}
