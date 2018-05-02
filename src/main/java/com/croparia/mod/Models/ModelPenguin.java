package com.croparia.mod.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelChicken - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPenguin extends ModelBase {
    public ModelRenderer head;
    public ModelRenderer rightLeg;
    public ModelRenderer leftLeg;
    public ModelRenderer body;
    public ModelRenderer leftWing;
    public ModelRenderer rightWing;
    public ModelRenderer bill;

    public ModelPenguin() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 13.9F, 0.8F);
        this.head.addBox(-2.0F, -4.0F, -2.0F, 4, 4, 3, 0.0F);
        this.body = new ModelRenderer(this, 0, 9);
        this.body.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.body.addBox(-3.0F, 0.0F, -8.0F, 6, 5, 11, 0.0F);
        this.setRotateAngle(body, 1.5707963267948966F, 0.0F, 0.0F);
        this.leftWing = new ModelRenderer(this, 24, 13);
        this.leftWing.setRotationPoint(3.0F, 14.3F, 2.5F);
        this.leftWing.addBox(0.0F, -1.9F, -6.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(leftWing, 1.5707963267948966F, 0.0F, -0.0F);
        this.bill = new ModelRenderer(this, 14, 0);
        this.bill.setRotationPoint(0.0F, 13.2F, -0.8F);
        this.bill.addBox(-1.0F, -0.5F, -2.2F, 2, 1, 2, 0.0F);
        this.rightLeg = new ModelRenderer(this, 26, 0);
        this.rightLeg.setRotationPoint(-2.0F, 23.0F, 1.0F);
        this.rightLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F);
        this.leftLeg = new ModelRenderer(this, 26, 0);
        this.leftLeg.setRotationPoint(1.0F, 23.0F, 1.0F);
        this.leftLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F);
        this.rightWing = new ModelRenderer(this, 24, 13);
        this.rightWing.setRotationPoint(-3.0F, 14.3F, 2.5F);
        this.rightWing.addBox(-1.0F, -2.0F, 0.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(rightWing, -1.5707963267948966F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.head.render(f5);
        this.body.render(f5);
        this.leftWing.render(f5);
        this.bill.render(f5);
        this.rightLeg.render(f5);
        this.leftLeg.render(f5);
        this.rightWing.render(f5);
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
