package com.croparia.mod.Renderer;

import com.croparia.mod.Reference;
import com.croparia.mod.Entity.EntityAkurojin;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAkurojin extends RenderLiving<EntityAkurojin>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/akurojin.png");
    
    public RenderAkurojin(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }   
    
    @Override
    protected ResourceLocation getEntityTexture(EntityAkurojin entity) 
    {
        return ENTITY_TEXTURE;
    }
}
