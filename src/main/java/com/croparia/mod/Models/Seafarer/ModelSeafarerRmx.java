package com.croparia.mod.Models.Seafarer;

import org.lwjgl.opengl.GL11;

import com.croparia.mod.Entity.Seafarer.EntitySeafarerL;
import com.croparia.mod.Entity.Seafarer.EntitySeafarerS;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelSeafarerRmx extends ModelBiped {

    public ModelRenderer bipedHead;
    public ModelRenderer leftarmPlus;
    public ModelRenderer bipedHeadPlus;
    public ModelRenderer rightlegPlus;
    public ModelRenderer leflegPlus;

    public ModelSeafarerRmx() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
        this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.rightlegPlus = new ModelRenderer(this, 1, 35);
        this.rightlegPlus.setRotationPoint(-2.0F, 1.0F, 0.0F);
        this.rightlegPlus.addBox(0.0F, 0.0F, 0.0F, 3, 8, 0, 0.0F);
        this.setRotateAngle(rightlegPlus, 0.0F, 3.141592653589793F, 0.0F);
        this.bipedBody = new ModelRenderer(this, 16, 16);
        this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.bipedHead = new ModelRenderer(this, 0, 0);
        this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(bipedHead, 0.7853981633974483F, 0.6108652381980153F, 0.5235987755982988F);
        this.bipedRightLeg = new ModelRenderer(this, 0, 16);
        this.bipedRightLeg.setRotationPoint(-1.899999976158142F, 12.0F, 0.10000000149011612F);
        this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.bipedRightArm = new ModelRenderer(this, 0, 16);
        this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.bipedHeadPlus = new ModelRenderer(this, 78, 17);
        this.bipedHeadPlus.setRotationPoint(4.0F, -8.0F, -4.0F);
        this.bipedHeadPlus.addBox(-17.0F, -8.0F, 0.0F, 17, 13, 0, 0.0F);
        this.setRotateAngle(bipedHeadPlus, -0.3490658503988659F, 0.6981317007977318F, -0.4363323129985824F);
        this.bipedLeftArm = new ModelRenderer(this, 40, 16);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.leftarmPlus = new ModelRenderer(this, 1, 35);
        this.leftarmPlus.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.leftarmPlus.addBox(0.0F, 0.0F, 0.0F, 3, 8, 0, 0.0F);
        this.setRotateAngle(leftarmPlus, 0.0F, -1.5707963267948966F, 0.0F);
        this.leflegPlus = new ModelRenderer(this, 1, 35);
        this.leflegPlus.setRotationPoint(2.0F, 1.0F, 0.0F);
        this.leflegPlus.addBox(0.0F, 0.0F, 0.0F, 3, 8, 0, 0.0F);
        this.bipedRightLeg.addChild(this.rightlegPlus);
        this.bipedHead.addChild(this.bipedHeadPlus);
        this.bipedLeftArm.addChild(this.leftarmPlus);
        this.bipedLeftLeg.addChild(this.leflegPlus);
        this.bipedRightArm.addChild(this.leftarmPlus);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 

        
    	GL11.glPushMatrix();
    	if(entity instanceof EntitySeafarerS)
    	{
        	GL11.glScalef(0.5f, 0.5f, 0.5f);
        	GL11.glTranslatef(0f, 1.55f, 0f);
    	}
    	else if (entity instanceof EntitySeafarerL)
    	{
        	GL11.glScalef(1.5f, 1.5f, 1.5f);
        	GL11.glTranslatef(0f, -0.5f, 0f);
    	}
        this.bipedLeftLeg.render(f5);
        this.bipedBody.render(f5);
        this.bipedHead.render(f5);
        this.bipedRightLeg.render(f5);
        this.bipedRightArm.render(f5);
        this.bipedLeftArm.render(f5);
    	GL11.glPopMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
