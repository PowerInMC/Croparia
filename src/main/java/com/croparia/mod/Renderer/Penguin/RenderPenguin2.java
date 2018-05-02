package com.croparia.mod.Renderer.Penguin;

import com.croparia.mod.Reference;
import com.croparia.mod.Entity.Penguin.EntityPenguin2;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPenguin2 extends RenderLiving<EntityPenguin2>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/penguin.png");
    
    public RenderPenguin2(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }   
    
    @Override
    protected ResourceLocation getEntityTexture(EntityPenguin2 entity) 
    {
        return ENTITY_TEXTURE;
    }
}
