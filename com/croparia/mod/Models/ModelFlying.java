package com.croparia.mod.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelFlying extends ModelBase
{
    ModelRenderer BodyR;
    ModelRenderer Block;
    ModelRenderer BodyL;
    ModelRenderer lA2;
    ModelRenderer Final1;
    ModelRenderer LA;
    ModelRenderer Final2;
    ModelRenderer RA2;
    ModelRenderer Head;
    ModelRenderer RA;
  
  public ModelFlying()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      BodyR = new ModelRenderer(this, 100, 15);
      BodyR.addBox(-6F, -5F, -3F, 6, 10, 4);
      BodyR.setRotationPoint(0F, 0F, 0F);
      BodyR.setTextureSize(128, 128);
      BodyR.mirror = true;
      setRotation(BodyR, 0.6981317F, 0.5235988F, 0F);
      Block = new ModelRenderer(this, 0, 0);
      Block.addBox(-3F, -3F, -4F, 8, 8, 8);
      Block.setRotationPoint(0F, 8F, -8F);
      Block.setTextureSize(128, 128);
      Block.mirror = true;
      setRotation(Block, 0.5948578F, 0F, 0F);
      BodyL = new ModelRenderer(this, 79, 15);
      BodyL.addBox(0F, -5F, -3F, 6, 10, 4);
      BodyL.setRotationPoint(0F, 0F, 0F);
      BodyL.setTextureSize(128, 128);
      BodyL.mirror = true;
      setRotation(BodyL, 0.6981317F, -0.5235988F, 0F);
      lA2 = new ModelRenderer(this, 20, 67);
      lA2.addBox(-6F, 2F, 3F, 3, 7, 3);
      lA2.setRotationPoint(-4F, 0F, -2F);
      lA2.setTextureSize(128, 128);
      lA2.mirror = true;
      setRotation(lA2, -1.082104F, -0.8726646F, 0F);
      Final1 = new ModelRenderer(this, 0, 20);
      Final1.addBox(-1F, 4.266667F, 1F, 2, 1, 8);
      Final1.setRotationPoint(0F, 0F, 0F);
      Final1.setTextureSize(128, 128);
      Final1.mirror = true;
      setRotation(Final1, -0.3346075F, 0F, 0F);
      LA = new ModelRenderer(this, 20, 55);
      LA.addBox(-1F, 0F, -2F, 3, 7, 3);
      LA.setRotationPoint(-4F, 0F, -2F);
      LA.setTextureSize(128, 128);
      LA.mirror = true;
      setRotation(LA, -0.7504916F, 0.8552113F, 0F);
      Final2 = new ModelRenderer(this, 0, 34);
      Final2.addBox(-1F, 8F, 4F, 2, 1, 6);
      Final2.setRotationPoint(0F, 0F, 0F);
      Final2.setTextureSize(128, 128);
      Final2.mirror = true;
      setRotation(Final2, 0.2617994F, 0F, 0F);
      RA2 = new ModelRenderer(this, 0, 67);
      RA2.addBox(3F, 2F, 3F, 3, 7, 3);
      RA2.setRotationPoint(5F, 0F, -1F);
      RA2.setTextureSize(128, 128);
      RA2.mirror = true;
      setRotation(RA2, -1.082104F, 0.8726646F, 0F);
      Head = new ModelRenderer(this, 86, 0);
      Head.addBox(-3F, -3F, -3F, 6, 6, 6);
      Head.setRotationPoint(0F, -6F, -3F);
      Head.setTextureSize(128, 128);
      Head.mirror = true;
      setRotation(Head, 0.3490659F, -0.6981317F, -0.296706F);
      RA = new ModelRenderer(this, 0, 55);
      RA.addBox(-2F, 0F, -2F, 3, 7, 3);
      RA.setRotationPoint(5F, 0F, -1F);
      RA.setTextureSize(128, 128);
      RA.mirror = true;
      setRotation(RA, -0.7504916F, -0.8552113F, 0F);
           
      convertToChild(Final1, Final2);
   
  }
  
  protected void convertToChild(ModelRenderer parent, ModelRenderer child)
  {
    // move child rotation point to be relative to parent
      child.rotationPointX -= parent.rotationPointX;
      child.rotationPointY -= parent.rotationPointY;
      child.rotationPointZ -= parent.rotationPointZ;
      
    // make rotations relative to parent
      child.rotateAngleX -= parent.rotateAngleX;
      child.rotateAngleY -= parent.rotateAngleY;
      child.rotateAngleZ -= parent.rotateAngleZ;
      
    //create relationship
      parent.addChild(child);
      
  }
  public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
  {
    super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
    setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
    BodyR.render(scaleFactor);
    Block.render(scaleFactor);
    BodyL.render(scaleFactor);
    lA2.render(scaleFactor);
    Final1.render(scaleFactor);
    LA.render(scaleFactor);
    //Final2.render(scaleFactor);
    RA2.render(scaleFactor);
    Head.render(scaleFactor);
    RA.render(scaleFactor);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity)
  {
      float XAngle = headPitch / 57.29578F;
      float YAngle = netHeadYaw / 57.29578F;
      
      this.Head.rotateAngleX = (0.2617794F + XAngle);
      this.Head.rotateAngleY = YAngle;

      this.Final1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
  }

}
