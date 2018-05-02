package com.croparia.mod.Renderer.Seafarer;

import com.croparia.mod.Reference;
import com.croparia.mod.Entity.Seafarer.EntitySeafarerS;
import com.croparia.mod.Models.Seafarer.ModelSeafarerRmx;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSeafarerS extends RenderLiving<EntitySeafarerS>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/seafarer.png"); 
    

	public RenderSeafarerS(RenderManager renderManager, ModelSeafarerRmx modelSeafarerRmx, float f) {
		super(renderManager, modelSeafarerRmx, f);
	}


	@Override
    protected ResourceLocation getEntityTexture(EntitySeafarerS entity) 
    {
        return ENTITY_TEXTURE;
    }
}
