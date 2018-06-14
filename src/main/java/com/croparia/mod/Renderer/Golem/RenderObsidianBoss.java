package com.croparia.mod.Renderer.Golem;

import com.croparia.mod.Reference;
import com.croparia.mod.Entity.Golem.EntityObsidianBoss;
import com.croparia.mod.Models.ModelGolemBoss;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderObsidianBoss extends RenderLiving<EntityObsidianBoss>
{
    
	
	
	public RenderObsidianBoss(RenderManager rendermanagerIn, ModelGolemBoss modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		// TODO Auto-generated constructor stub
	}


	private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/golem/obsidianboss.png");
    

	@Override
    protected ResourceLocation getEntityTexture(EntityObsidianBoss entity) 
    {
        return ENTITY_TEXTURE;
    }

}
