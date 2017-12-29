package com.croparia.mod.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelMinotaur extends ModelBase
{
    ModelRenderer Nose;
    ModelRenderer RightArm;
    ModelRenderer LeftArm;
    ModelRenderer LeftFeet;
    ModelRenderer LeftLeg;
    ModelRenderer RightLeg;
    ModelRenderer RightFeet;
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer Body2;
    ModelRenderer HornBase;
    ModelRenderer HornLeft;
    ModelRenderer HornRight;
    ModelRenderer RightRing;
    ModelRenderer LeftRing;
    ModelRenderer RingBase;
  
  public ModelMinotaur()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Nose = new ModelRenderer(this, 41, 0);
      Nose.addBox(-1.5F, -1F, -6F, 3, 2, 2);
      Nose.setRotationPoint(0F, -13F, -4F);
      Nose.setTextureSize(128, 128);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 18, 20);
      RightArm.addBox(-6F, -1F, -3F, 6, 22, 6);
      RightArm.setRotationPoint(-10F, -12F, 0F);
      RightArm.setTextureSize(128, 128);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 0F, 0F);
      LeftArm = new ModelRenderer(this, 104, 20);
      LeftArm.addBox(0F, -1F, -3F, 6, 22, 6);
      LeftArm.setRotationPoint(10F, -12F, 0F);
      LeftArm.setTextureSize(128, 128);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0F, 0F, 0F);
      LeftFeet = new ModelRenderer(this, 73, 75);
      LeftFeet.addBox(-2.5F, 13F, -3.5F, 6, 7, 6);
      LeftFeet.setRotationPoint(4F, 4F, 0.5F);
      LeftFeet.setTextureSize(128, 128);
      LeftFeet.mirror = true;
      setRotation(LeftFeet, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 72, 57);
      LeftLeg.addBox(-2F, 0F, -3F, 5, 13, 5);
      LeftLeg.setRotationPoint(4F, 5F, 0.5F);
      LeftLeg.setTextureSize(128, 128);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      RightLeg = new ModelRenderer(this, 53, 57);
      RightLeg.addBox(-3F, 0F, -3F, 5, 13, 5);
      RightLeg.setRotationPoint(-4F, 5F, 0.5F);
      RightLeg.setTextureSize(128, 128);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      RightFeet = new ModelRenderer(this, 49, 75);
      RightFeet.addBox(-3.5F, 12F, -4F, 6, 7, 6);
      RightFeet.setRotationPoint(-4F, 5F, 1F);
      RightFeet.setTextureSize(128, 128);
      RightFeet.mirror = true;
      setRotation(RightFeet, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 53, 0);
      Head.addBox(-5F, -8F, -4F, 10, 10, 10);
      Head.setRotationPoint(0F, -13F, -4F);
      Head.setTextureSize(128, 128);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 42, 20);
      Body.addBox(-10F, 0F, -5.5F, 20, 13, 11);
      Body.setRotationPoint(0F, -14F, 0F);
      Body.setTextureSize(128, 128);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Body2 = new ModelRenderer(this, 57, 44);
      Body2.addBox(-5F, 0F, -3F, 10, 7, 6);
      Body2.setRotationPoint(0F, -1F, 0F);
      Body2.setTextureSize(128, 128);
      Body2.mirror = true;
      setRotation(Body2, 0F, 0F, 0F);
      HornBase = new ModelRenderer(this, 0, 100);
      HornBase.addBox(-10F, -7F, -2F, 20, 5, 5);
      HornBase.setRotationPoint(0F, -13F, -4F);
      HornBase.setTextureSize(128, 128);
      HornBase.mirror = true;
      setRotation(HornBase, 0F, 0F, 0F);
      HornLeft = new ModelRenderer(this, -1, 0);
      HornLeft.addBox(6F, -13F, 5F, 3, 12, 3);
      HornLeft.setRotationPoint(0F, -13F, -4F);
      HornLeft.setTextureSize(128, 128);
      HornLeft.mirror = true;
      setRotation(HornLeft, 0.8726646F, 0.3490659F, 0F);
      HornRight = new ModelRenderer(this, 0, 0);
      HornRight.addBox(-9F, -13F, 5F, 3, 12, 3);
      HornRight.setRotationPoint(0F, -13F, -4F);
      HornRight.setTextureSize(128, 128);
      HornRight.mirror = true;
      setRotation(HornRight, 0.8726646F, -0.3490659F, 0F);
      RightRing = new ModelRenderer(this, 15, 0);
      RightRing.addBox(-2.5F, 2F, -5F, 1, 3, 1);
      RightRing.setRotationPoint(0F, -13F, -4F);
      RightRing.setTextureSize(128, 128);
      RightRing.mirror = true;
      setRotation(RightRing, -0.4363323F, 0F, 0F);
      LeftRing = new ModelRenderer(this, 15, 0);
      LeftRing.addBox(1.5F, 2F, -5F, 1, 3, 1);
      LeftRing.setRotationPoint(0F, -13F, -4F);
      LeftRing.setTextureSize(128, 128);
      LeftRing.mirror = true;
      setRotation(LeftRing, -0.4363323F, 0F, 0F);
      RingBase = new ModelRenderer(this, 22, 12);
      RingBase.addBox(-2.5F, 4F, -5F, 5, 1, 1);
      RingBase.setRotationPoint(0F, -13F, -4F);
      RingBase.setTextureSize(128, 128);
      RingBase.mirror = true;
      setRotation(RingBase, -0.4363323F, 0F, 0F);
      
      convertToChild(Body, Body2);
      
      convertToChild(Head, Nose);
      convertToChild(Head, RingBase);
      convertToChild(Head, LeftRing);
      convertToChild(Head, RightRing);
      convertToChild(Head, HornBase);
      convertToChild(Head, HornLeft);
      convertToChild(Head, HornRight);
         
      convertToChild(LeftLeg, LeftFeet);
      
      convertToChild(RightLeg, RightFeet);

      

      
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
    //Nose.render(scaleFactor);
    RightArm.render(scaleFactor);
    LeftArm.render(scaleFactor);
    //LeftFeet.render(scaleFactor);
    LeftLeg.render(scaleFactor);
    RightLeg.render(scaleFactor);
    //RightFeet.render(scaleFactor);
    Head.render(scaleFactor);
    Body.render(scaleFactor);
    //Body2.render(scaleFactor);
    //HornBase.render(scaleFactor);
    //HornLeft.render(scaleFactor);
    //HornRight.render(scaleFactor);
    //RightRing.render(scaleFactor);
    //LeftRing.render(scaleFactor);
    //RingBase.render(scaleFactor);
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
      
      this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
      this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
  }

}
