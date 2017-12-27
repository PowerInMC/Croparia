package com.croparia.mod.Init.Registry;

import com.croparia.mod.ModCroparia;
import com.croparia.mod.Reference;
import com.croparia.mod.Entity.EntityCentaur;
import com.croparia.mod.Entity.EntityFlying;
import com.croparia.mod.Entity.EntityMinotaur;
import com.croparia.mod.Entity.EntityReaper;
import com.croparia.mod.Entity.EntitySeafarer;
import com.croparia.mod.Models.ModelCentaur;
import com.croparia.mod.Models.ModelFlying;
import com.croparia.mod.Models.ModelMinotaur;
import com.croparia.mod.Models.ModelReaper;
import com.croparia.mod.Models.Seafarer.ModelSeafarer;
import com.croparia.mod.Renderer.RenderCentaur;
import com.croparia.mod.Renderer.RenderFlying;
import com.croparia.mod.Renderer.RenderMinotaur;
import com.croparia.mod.Renderer.RenderReaper;
import com.croparia.mod.Renderer.Seafarer.RenderSeafarer;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MobRegistry
{      
		private static final Biome[] PLAINS = new Biome[] {Biome.func_150568_d(1)};
		public static int entitiesId;
	
        public static void register()
        {
            MobRegistry.registerRender();
            MobRegistry.init();
        }
        
        public static void registerRender()
        {

            RenderingRegistry.registerEntityRenderingHandler(EntitySeafarer.class, new RenderSeafarer(Minecraft.func_71410_x().func_175598_ae(), new ModelSeafarer(), 0.5F));
            
            RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class, new RenderCentaur(Minecraft.func_71410_x().func_175598_ae(), new ModelCentaur(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityMinotaur.class, new RenderMinotaur(Minecraft.func_71410_x().func_175598_ae(), new ModelMinotaur(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityFlying.class, new RenderFlying(Minecraft.func_71410_x().func_175598_ae(), new ModelFlying(), 0.5F));
            RenderingRegistry.registerEntityRenderingHandler(EntityReaper.class, new RenderReaper(Minecraft.func_71410_x().func_175598_ae(), new ModelReaper(), 0.5F));
            

            //RenderingRegistry.registerEntityRenderingHandler(EntityGoldenChicken.class, new RenderGoldenChicken(Minecraft.getMinecraft().getRenderManager(), new ModelChicken(), 0.5F));
            }
        
        public static void init(){

    		register(EntitySeafarer.class, "Seafarer", 0x000069, 0x110BBF);  
    		
    		register(EntityCentaur.class, "Centaur", 0x000069, 0x913C04);
    		register(EntityMinotaur.class, "Minotaur", 0x000069, 0xDB000A);
    		register(EntityFlying.class, "Flying", 0x000069, 0xC0C0C0);
    		register(EntityReaper.class, "Reaper", 0x00000, 0xFFFFFF);  
    		
    		//register(EntityGoldenChicken.class, "GoldenChicken", 0xDEDE00, 0xFFFF8B);  
        }

    	

    	public static void register(Class EntityClass, String entityNameIn, int solidColorIn, int spotColorIn){

    		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + entityNameIn), EntityClass, entityNameIn, ++entitiesId, ModCroparia.instance, 64, 1, true, solidColorIn, spotColorIn);
    	}
}
