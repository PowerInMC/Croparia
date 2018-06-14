package com.croparia.mod.Models;

import org.lwjgl.opengl.GL11;

import com.croparia.mod.LlibraryImplementation.AdvancedModelBase;
import com.croparia.mod.LlibraryImplementation.AdvancedModelRenderer;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Icyboss - Defacto34
 * Created using Tabula 7.0.0
 */
public class ModelGolemBoss extends AdvancedModelBase {
		public AdvancedModelRenderer Body;
	    public AdvancedModelRenderer Body1;
	    public AdvancedModelRenderer Head;
	    public AdvancedModelRenderer LeftShoulder;
	    public AdvancedModelRenderer RightShoulder;
	    public AdvancedModelRenderer LeftLeg;
	    public AdvancedModelRenderer RightLeg;
	    public AdvancedModelRenderer LeftLeg1;
	    public AdvancedModelRenderer LeftLeg2;
	    public AdvancedModelRenderer RightLeg1;
	    public AdvancedModelRenderer RightLeg2;
	    public AdvancedModelRenderer Head1;
	    public AdvancedModelRenderer LeftArm1;
	    public AdvancedModelRenderer LeftArm2;
	    public AdvancedModelRenderer RightArm1;
	    public AdvancedModelRenderer RightArm2;

	    public ModelGolemBoss() {
	        this.textureWidth = 512;
	        this.textureHeight = 512;
	        this.RightLeg2 = new AdvancedModelRenderer(this, 150, 450);
	        this.RightLeg2.setRotationPoint(0.0F, 20.0F, 0.0F);
	        this.RightLeg2.addBox(-11.0F, 0.0F, -11.0F, 22, 15, 22, 0.0F);
	        this.LeftLeg1 = new AdvancedModelRenderer(this, 0, 400);
	        this.LeftLeg1.setRotationPoint(0.0F, 18.0F, 0.0F);
	        this.LeftLeg1.addBox(-7.0F, 0.0F, -7.0F, 14, 20, 14, 0.0F);
	        this.Head = new AdvancedModelRenderer(this, 0, 0);
	        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
	        this.Head.addBox(-22.0F, -10.0F, -14.0F, 44, 22, 14, 0.0F);
	        this.RightArm1 = new AdvancedModelRenderer(this, 300, 300);
	        this.RightArm1.setRotationPoint(-25.0F, 19.0F, 0.0F);
	        this.RightArm1.addBox(-10.0F, 0.0F, -10.0F, 20, 29, 20, 0.0F);
	        this.Body1 = new AdvancedModelRenderer(this, 30, 231);
	        this.Body1.setRotationPoint(0.0F, 32.0F, 15.0F);
	        this.Body1.addBox(-28.0F, 0.0F, -5.0F, 56, 32, 18, 0.0F);
	        this.Head1 = new AdvancedModelRenderer(this, 150, 0);
	        this.Head1.setRotationPoint(0.2F, 12.0F, -7.0F);
	        this.Head1.addBox(-11.0F, 0.0F, -7.0F, 22, 13, 14, 0.0F);
	        this.RightLeg = new AdvancedModelRenderer(this, 150, 330);
	        this.RightLeg.setRotationPoint(-20.0F, 24.0F, 3.0F);
	        this.RightLeg.addBox(-15.0F, -2.0F, -15.0F, 30, 20, 30, 0.0F);
	        this.RightArm2 = new AdvancedModelRenderer(this, 300, 300);
	        this.RightArm2.setRotationPoint(0.0F, 29.0F, 0.0F);
	        this.RightArm2.addBox(-10.0F, 0.0F, -10.0F, 20, 29, 20, 0.0F);
	        this.RightLeg1 = new AdvancedModelRenderer(this, 150, 400);
	        this.RightLeg1.setRotationPoint(0.0F, 18.0F, 0.0F);
	        this.RightLeg1.addBox(-7.0F, 0.0F, -7.0F, 14, 20, 14, 0.0F);
	        this.Body = new AdvancedModelRenderer(this, 30, 120);
	        this.Body.setRotationPoint(0.0F, -86.0F, -20.0F);
	        this.Body.addBox(-54.0F, -14.0F, 0.0F, 108, 46, 40, 0.0F);
	        this.LeftArm2 = new AdvancedModelRenderer(this, 400, 360);
	        this.LeftArm2.setRotationPoint(0.0F, 29.0F, 0.0F);
	        this.LeftArm2.addBox(-10.0F, 0.0F, -10.0F, 20, 30, 20, 0.0F);
	        this.LeftShoulder = new AdvancedModelRenderer(this, 300, 167);
	        this.LeftShoulder.setRotationPoint(40.0F, -10.0F, 20.0F);
	        this.LeftShoulder.addBox(-8.0F, -25.0F, -22.0F, 44, 44, 44, 0.0F);
	        this.LeftLeg = new AdvancedModelRenderer(this, 0, 330);
	        this.LeftLeg.setRotationPoint(20.0F, 24.0F, 3.0F);
	        this.LeftLeg.addBox(-15.0F, -2.0F, -15.0F, 30, 20, 30, 0.0F);
	        this.LeftArm1 = new AdvancedModelRenderer(this, 400, 300);
	        this.LeftArm1.setRotationPoint(20.0F, 19.0F, 0.0F);
	        this.LeftArm1.addBox(-10.0F, 0.0F, -10.0F, 20, 29, 20, 0.0F);
	        this.RightShoulder = new AdvancedModelRenderer(this, 300, 415);
	        this.RightShoulder.setRotationPoint(-36.0F, -10.0F, 20.0F);
	        this.RightShoulder.addBox(-40.1F, -25.0F, -22.0F, 44, 44, 44, 0.0F);
	        this.LeftLeg2 = new AdvancedModelRenderer(this, 0, 450);
	        this.LeftLeg2.setRotationPoint(0.0F, 20.0F, 0.0F);
	        this.LeftLeg2.addBox(-11.0F, 0.0F, -11.0F, 22, 15, 22, 0.0F);
	        
	        this.RightLeg1.addChild(this.RightLeg2);
	        this.LeftLeg.addChild(this.LeftLeg1);
	        this.Body.addChild(this.Head);
	        this.RightShoulder.addChild(this.RightArm1);
	        this.Body.addChild(this.Body1);
	        this.Head.addChild(this.Head1);
	        this.Body1.addChild(this.RightLeg);
	        this.RightArm1.addChild(this.RightArm2);
	        this.RightLeg.addChild(this.RightLeg1);
	        this.LeftArm1.addChild(this.LeftArm2);
	        this.Body.addChild(this.LeftShoulder);
	        this.Body1.addChild(this.LeftLeg);
	        this.LeftShoulder.addChild(this.LeftArm1);
	        this.Body.addChild(this.RightShoulder);
	        this.LeftLeg1.addChild(this.LeftLeg2);
        
        AdvancedModelRenderer[] parts = new AdvancedModelRenderer[] {LeftLeg, Body, Head, LeftArm1, LeftArm2, RightArm1, RightArm2, RightLeg, LeftLeg1, LeftLeg2, Body1, Head1, LeftShoulder, RightShoulder, RightLeg2, RightLeg1};
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	GL11.glPushMatrix();
    	GL11.glScalef(0.5f, 0.5f, 0.5f);
    	GL11.glTranslatef(0f, 1.55f, 0f);
        this.Body.render(f5);
    	GL11.glPopMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
    	
    	ModelRenderer.rotateAngleX = x;
    	ModelRenderer.rotateAngleY = y;
    	ModelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
    	super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	resetToDefaultPose();
    	//f = entity.ticksExisted;
    	//f1 = 0.5f;

    	float globalSpeed = 0.6f;
    	float globalHeight = 1.2f;
    	float globalDegree = 0.6f;

    	bob(Body, 1 * globalSpeed, 2 * globalHeight, false, f, f1);

    	walk(LeftLeg, 0.5f * globalSpeed, 1.4f * globalDegree, false, 0, 0, f, f1);
    	walk(RightLeg, 0.5f * globalSpeed, 1.4f * globalDegree, true, 0, 0, f, f1);
    	walk(LeftLeg1, 0.5f * globalSpeed, 1.2F * globalDegree, false, -1.5f, 0, f, f1);
    	walk(RightLeg1, 0.5f * globalSpeed, 1.2F * globalDegree, true, -1.5f, 0, f, f1);
    	walk(LeftLeg2, 0.5f * globalSpeed, 1.2F * globalDegree, false, -3f, 0.6f, f, f1);
    	walk(RightLeg2, 0.5f * globalSpeed, 1.2F * globalDegree, true, -3f, 0.6f, f, f1);
    	
    	walk(Head, globalSpeed, 0.2f * globalHeight, true, 0.5f, 0, f, f1);

    	walk(LeftShoulder, 0.5f * globalSpeed, 1F * globalDegree, true, 0f, 0f, f, f1);
    	walk(RightShoulder, 0.5f * globalSpeed, 1F * globalDegree, false, 0f, 0f, f, f1);
    	walk(RightArm1, 0.5f * globalSpeed, 1F * globalDegree, true, 0.6f, 0f, f, f1);
    	walk(LeftArm1, 0.5f * globalSpeed, 1F * globalDegree, false, 0.6f, 0f, f, f1);
    	walk(RightArm2, 0.5f * globalSpeed, 0.4F * globalDegree, true, 0.2f, 1f, f, f1);
    	walk(LeftArm2, 0.5f * globalSpeed, 0.4F * globalDegree, false, 0.2f, -1f, f, f1);
    }
}
