package com.croparia.mod.Renderer.Golem;

import com.croparia.mod.Reference;
import com.croparia.mod.Entity.Golem.EntitySteamBoss;
import com.croparia.mod.Models.ModelGolemBoss;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSteamBoss extends RenderLiving<EntitySteamBoss>
{



	public RenderSteamBoss(RenderManager rendermanagerIn, ModelGolemBoss modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		// TODO Auto-generated constructor stub
	}


	private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/golem/steamboss.png");
    

	@Override
    protected ResourceLocation getEntityTexture(EntitySteamBoss entity) 
    {
        return ENTITY_TEXTURE;
    }

}
