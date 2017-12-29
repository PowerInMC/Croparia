package com.croparia.mod.Renderer;

import com.croparia.mod.Reference;
import com.croparia.mod.Entity.EntityFlying;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFlying extends RenderLiving<EntityFlying>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/flying.png");
    
    public RenderFlying(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }   
    
    @Override
    protected ResourceLocation getEntityTexture(EntityFlying entity) 
    {
        return ENTITY_TEXTURE;
    }
}
