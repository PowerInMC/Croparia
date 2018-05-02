package com.croparia.mod.Renderer.Minotaur;

import com.croparia.mod.Reference;
import com.croparia.mod.Entity.Minotaur.EntityMinotaurS;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMinotaurS extends RenderLiving<EntityMinotaurS>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/minotaur.png");
    
    public RenderMinotaurS(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }   
    
    @Override
    protected ResourceLocation getEntityTexture(EntityMinotaurS entity) 
    {
        return ENTITY_TEXTURE;
    }
}
