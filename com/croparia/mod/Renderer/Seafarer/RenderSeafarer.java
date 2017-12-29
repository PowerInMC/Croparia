package com.croparia.mod.Renderer.Seafarer;

import com.croparia.mod.Reference;
import com.croparia.mod.Entity.EntitySeafarer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerSaddle;
import net.minecraft.util.ResourceLocation;

public class RenderSeafarer extends RenderLiving<EntitySeafarer>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/seafarer.png");
    
    public RenderSeafarer(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }   
    
    @Override
    protected ResourceLocation getEntityTexture(EntitySeafarer entity) 
    {
        return ENTITY_TEXTURE;
    }
}
