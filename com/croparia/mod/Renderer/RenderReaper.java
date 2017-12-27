package com.croparia.mod.Renderer;

import com.croparia.mod.Reference;
import com.croparia.mod.Entity.EntityReaper;
import com.croparia.mod.Entity.EntitySeafarer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerSaddle;
import net.minecraft.util.ResourceLocation;

public class RenderReaper extends RenderLiving<EntityReaper>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/reaper.png");
    
    public RenderReaper(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }   
    
    @Override
    protected ResourceLocation func_110775_a(EntityReaper entity) 
    {
        return ENTITY_TEXTURE;
    }
}
