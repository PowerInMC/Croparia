package com.croparia.mod.Renderer;

import com.croparia.mod.Reference;
import com.croparia.mod.Entity.EntityMinotaur;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerSaddle;
import net.minecraft.util.ResourceLocation;

public class RenderMinotaur extends RenderLiving<EntityMinotaur>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/minotaur.png");
    
    public RenderMinotaur(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }   
    
    @Override
    protected ResourceLocation func_110775_a(EntityMinotaur entity) 
    {
        return ENTITY_TEXTURE;
    }
}
