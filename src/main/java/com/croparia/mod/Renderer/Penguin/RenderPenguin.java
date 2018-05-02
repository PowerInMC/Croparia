package com.croparia.mod.Renderer.Penguin;

import com.croparia.mod.Reference;
import com.croparia.mod.Entity.Penguin.EntityPenguin;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPenguin extends RenderLiving<EntityPenguin>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/penguin.png");
    
    public RenderPenguin(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }   
    
    @Override
    protected ResourceLocation getEntityTexture(EntityPenguin entity) 
    {
        return ENTITY_TEXTURE;
    }
}
