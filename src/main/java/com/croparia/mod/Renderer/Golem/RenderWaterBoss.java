package com.croparia.mod.Renderer.Golem;

import com.croparia.mod.Reference;
import com.croparia.mod.Entity.Golem.EntityWaterBoss;
import com.croparia.mod.Models.ModelGolemBoss;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWaterBoss extends RenderLiving<EntityWaterBoss>
{


	public RenderWaterBoss(RenderManager rendermanagerIn, ModelGolemBoss modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		// TODO Auto-generated constructor stub
	}


	private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/golem/waterboss.png");
    

	@Override
    protected ResourceLocation getEntityTexture(EntityWaterBoss entity) 
    {
        return ENTITY_TEXTURE;
    }

}
