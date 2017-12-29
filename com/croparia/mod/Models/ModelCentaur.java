package com.croparia.mod.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelCentaur extends ModelBase
{
  //fields
    ModelRenderer Shape3;
    ModelRenderer Shape2;
    ModelRenderer Shape1;
    ModelRenderer LFlegtop;
    ModelRenderer LFlegbottom;
    ModelRenderer LFfeet;
    ModelRenderer Body;
    ModelRenderer RFlegtop;
    ModelRenderer RFlegbottom;
    ModelRenderer RFfeet;
    ModelRenderer LBlegtop;
    ModelRenderer LBlegbottom;
    ModelRenderer LBfeet;
    ModelRenderer RBlegtop;
    ModelRenderer RBlegbottom;
    ModelRenderer RBfeet;
    ModelRenderer Rarm;
    ModelRenderer Larm;
    ModelRenderer MenHead;
    ModelRenderer MenBody;
  
  public ModelCentaur()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Shape2 = new ModelRenderer(this, 63, 0);
      Shape2.addBox(-2.5F, 10F, 2F, 5, 9, 4);
      Shape2.setRotationPoint(0F, 2F, 12F);
      Shape2.setTextureSize(128, 128);
      Shape2.mirror = true;
      setRotation(Shape2, -0.0242694F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 40, 0);
      Shape3.addBox(-2.5F, 2F, 0F, 5, 9, 4);
      Shape3.setRotationPoint(0F, 2F, 12F);
      Shape3.setTextureSize(128, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0.1616237F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 26, 0);
      Shape1.addBox(-1F, 0F, -1F, 2, 3, 2);
      Shape1.setRotationPoint(0F, 2F, 12F);
      Shape1.setTextureSize(128, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0.5705884F, 0F, 0F);
      LFlegtop = new ModelRenderer(this, 100, 15);
      LFlegtop.addBox(-1.5F, -5F, -2.5F, 4, 9, 5);
      LFlegtop.setRotationPoint(4F, 11F, -10F);
      LFlegtop.setTextureSize(128, 128);
      LFlegtop.mirror = true;
      setRotation(LFlegtop, 0F, 0F, 0F);
      LFlegbottom = new ModelRenderer(this, 100, 30);
      LFlegbottom.addBox(-1.5F, 0F, -2F, 3, 6, 4);
      LFlegbottom.setRotationPoint(4.5F, 15F, -10F);
      LFlegbottom.setTextureSize(128, 128);
      LFlegbottom.mirror = true;
      setRotation(LFlegbottom, 0F, 0F, 0F);
      LFfeet = new ModelRenderer(this, 0, 0);
      LFfeet.addBox(-1.5F, 6F, -2.5F, 4, 3, 5);
      LFfeet.setRotationPoint(4F, 15F, -10F);
      LFfeet.setTextureSize(128, 128);
      LFfeet.mirror = true;
      setRotation(LFfeet, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 70);
      Body.addBox(-5F, -5F, -12F, 11, 11, 24);
      Body.setRotationPoint(0F, 7F, 0F);
      Body.setTextureSize(128, 128);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      RFlegtop = new ModelRenderer(this, 75, 15);
      RFlegtop.addBox(-2.5F, -5F, -2.5F, 4, 9, 5);
      RFlegtop.setRotationPoint(-3F, 11F, -10F);
      RFlegtop.setTextureSize(128, 128);
      RFlegtop.mirror = true;
      setRotation(RFlegtop, 0F, 0F, 0F);
      RFlegbottom = new ModelRenderer(this, 75, 30);
      RFlegbottom.addBox(-1.5F, 0F, -2F, 3, 6, 4);
      RFlegbottom.setRotationPoint(-3.5F, 15F, -10F);
      RFlegbottom.setTextureSize(128, 128);
      RFlegbottom.mirror = true;
      setRotation(RFlegbottom, 0F, 0F, 0F);
      RFfeet = new ModelRenderer(this, 0, 0);
      RFfeet.addBox(-2F, 6F, -2.5F, 4, 3, 5);
      RFfeet.setRotationPoint(-3.5F, 15F, -10F);
      RFfeet.setTextureSize(128, 128);
      RFfeet.mirror = true;
      setRotation(RFfeet, 0F, 0F, 0F);
      LBlegtop = new ModelRenderer(this, 100, 45);
      LBlegtop.addBox(-1.5F, -5F, -2.5F, 4, 9, 5);
      LBlegtop.setRotationPoint(4F, 11F, 10F);
      LBlegtop.setTextureSize(128, 128);
      LBlegtop.mirror = true;
      setRotation(LBlegtop, 0F, 0F, 0F);
      LBlegbottom = new ModelRenderer(this, 100, 60);
      LBlegbottom.addBox(-1.5F, 0F, -2F, 3, 6, 4);
      LBlegbottom.setRotationPoint(4.5F, 15F, 10F);
      LBlegbottom.setTextureSize(128, 128);
      LBlegbottom.mirror = true;
      setRotation(LBlegbottom, 0F, 0F, 0F);
      LBfeet = new ModelRenderer(this, 0, 0);
      LBfeet.addBox(-1.5F, 6F, -2.5F, 4, 3, 5);
      LBfeet.setRotationPoint(4F, 15F, 10F);
      LBfeet.setTextureSize(128, 128);
      LBfeet.mirror = true;
      setRotation(LBfeet, 0F, 0F, 0F);
      RBlegtop = new ModelRenderer(this, 75, 45);
      RBlegtop.addBox(-2.5F, -5F, -2.5F, 4, 9, 5);
      RBlegtop.setRotationPoint(-3F, 11F, 10F);
      RBlegtop.setTextureSize(128, 128);
      RBlegtop.mirror = true;
      setRotation(RBlegtop, 0F, 0F, 0F);
      RBlegbottom = new ModelRenderer(this, 75, 60);
      RBlegbottom.addBox(-1.5F, 0F, -2F, 3, 6, 4);
      RBlegbottom.setRotationPoint(-3.5F, 15F, 10F);
      RBlegbottom.setTextureSize(128, 128);
      RBlegbottom.mirror = true;
      setRotation(RBlegbottom, 0F, 0F, 0F);
      RBfeet = new ModelRenderer(this, 0, 0);
      RBfeet.addBox(-2.5F, 6F, -2.5F, 4, 3, 5);
      RBfeet.setRotationPoint(-3F, 15F, 10F);
      RBfeet.setTextureSize(128, 128);
      RBfeet.mirror = true;
      setRotation(RBfeet, 0F, 0F, 0F);
      Rarm = new ModelRenderer(this, 0, 47);
      Rarm.addBox(-4F, -3F, -2.5F, 5, 16, 5);
      Rarm.setRotationPoint(-6F, -11F, -9.5F);
      Rarm.setTextureSize(128, 128);
      Rarm.mirror = true;
      setRotation(Rarm, 0F, 0F, 0F);
      Larm = new ModelRenderer(this, 52, 47);
      Larm.addBox(-1F, -3F, -2.5F, 5, 16, 5);
      Larm.setRotationPoint(7F, -11F, -9.5F);
      Larm.setTextureSize(128, 128);
      Larm.mirror = true;
      setRotation(Larm, 0F, 0F, 0F);
      MenHead = new ModelRenderer(this, 0, 29);
      MenHead.addBox(-4.5F, -8.5F, -4.5F, 9, 9, 9);
      MenHead.setRotationPoint(0.5F, -14.5F, -9.5F);
      MenHead.setTextureSize(128, 128);
      MenHead.mirror = true;
      setRotation(MenHead, 0F, 0F, 0F);
      MenBody = new ModelRenderer(this, 20, 47);
      MenBody.addBox(-5.5F, 0F, -3F, 11, 16, 5);
      MenBody.setRotationPoint(0.5F, -14F, -9F);
      MenBody.setTextureSize(128, 128);
      MenBody.mirror = true;
      setRotation(MenBody, 0F, 0F, 0F);
      
      convertToChild(Body, MenBody);
      
      convertToChild(LFlegtop, LFlegbottom);
      convertToChild(LFlegtop, LFfeet);
      
      convertToChild(RFlegtop, RFlegbottom);
      convertToChild(RFlegtop, RFfeet);
      
      convertToChild(LBlegtop, LBlegbottom);
      convertToChild(LBlegtop, LBfeet);
      
      convertToChild(RBlegtop, RBlegbottom);
      convertToChild(RBlegtop, RBfeet);
      
      convertToChild(Shape1, Shape2);
      convertToChild(Shape1, Shape3);
      
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
    //Shape3.render(scaleFactor);
    //Shape2.render(scaleFactor);
    Shape1.render(scaleFactor);
    LFlegtop.render(scaleFactor);
    //LFlegbottom.render(scaleFactor);
    //LFfeet.render(scaleFactor);
    Body.render(scaleFactor);
    RFlegtop.render(scaleFactor);
    //RFlegbottom.render(scaleFactor);
    //RFfeet.render(scaleFactor);
    LBlegtop.render(scaleFactor);
    //LBlegbottom.render(scaleFactor);
    //LBfeet.render(scaleFactor);
    RBlegtop.render(scaleFactor);
    //RBlegbottom.render(scaleFactor);
    //RBfeet.render(scaleFactor);
    Rarm.render(scaleFactor);
    Larm.render(scaleFactor);
    MenHead.render(scaleFactor);
    //MenBody.render(scaleFactor);

    
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
      
      this.MenHead.rotateAngleX = (0.2617794F + XAngle);
      this.MenHead.rotateAngleY = YAngle;
      
      this.LFlegtop.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
      this.RFlegtop.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.LBlegtop.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.RBlegtop.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
  }

}
