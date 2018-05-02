package com.croparia.mod.Models.Seafarer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelSeafarer extends ModelBiped
{
  //fields
    ModelRenderer HeadTop;
    ModelRenderer Head1;
    ModelRenderer body;
    ModelRenderer RA;
    ModelRenderer LA;
    ModelRenderer RL;
    ModelRenderer LL;
    ModelRenderer LL2;
    ModelRenderer RL2;
    ModelRenderer headBase;
  
  public ModelSeafarer()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      HeadTop = new ModelRenderer(this, 30, 0);
      HeadTop.addBox(-3F, -7F, -4.8F, 6, 2, 7);
      HeadTop.setRotationPoint(0F, 0F, 0F);
      HeadTop.setTextureSize(128, 64);
      HeadTop.mirror = true;
      setRotation(HeadTop, 0.1850049F, 0F, 0F);
      Head1 = new ModelRenderer(this, 0, 0);
      Head1.addBox(-3F, -6F, -6F, 6, 6, 7);
      Head1.setRotationPoint(0F, 0F, 0F);
      Head1.setTextureSize(128, 64);
      Head1.mirror = true;
      setRotation(Head1, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      RA = new ModelRenderer(this, 40, 16);
      RA.addBox(-3F, -2F, -2F, 4, 12, 4);
      RA.setRotationPoint(-5F, 2F, 0F);
      RA.setTextureSize(128, 64);
      RA.mirror = true;
      setRotation(RA, 0F, 0F, 0F);
      LA = new ModelRenderer(this, 40, 16);
      LA.addBox(-1F, -2F, -2F, 4, 12, 4);
      LA.setRotationPoint(5F, 2F, 0F);
      LA.setTextureSize(128, 64);
      LA.mirror = true;
      setRotation(LA, 0F, 0F, 0F);
      RL = new ModelRenderer(this, 0, 16);
      RL.addBox(-2F, 0F, -2F, 4, 12, 4);
      RL.setRotationPoint(-2F, 12F, 0F);
      RL.setTextureSize(128, 64);
      RL.mirror = true;
      setRotation(RL, 0F, 0F, 0F);
      LL = new ModelRenderer(this, 0, 16);
      LL.addBox(-2F, 0F, -2F, 4, 12, 4);
      LL.setRotationPoint(2F, 12F, 0F);
      LL.setTextureSize(128, 64);
      LL.mirror = true;
      setRotation(LL, 0F, 0F, 0F);
      LL2 = new ModelRenderer(this, 1, 36);
      LL2.addBox(2F, 3F, 0F, 3, 7, 0);
      LL2.setRotationPoint(2F, 12F, 0F);
      LL2.setTextureSize(128, 64);
      LL2.mirror = true;
      setRotation(LL2, 0F, 0F, 0F);
      RL2 = new ModelRenderer(this, 10, 36);
      RL2.addBox(-5F, 3F, 0F, 3, 7, 0);
      RL2.setRotationPoint(-2F, 12F, 0F);
      RL2.setTextureSize(128, 64);
      RL2.mirror = true;
      setRotation(RL2, 0F, 0F, 0F);
      headBase = new ModelRenderer(this, 60, 0);
      headBase.addBox(-3F, -7.26F, 0.8F, 6, 11, 2);
      headBase.setRotationPoint(0F, 0F, 0F);
      headBase.setTextureSize(128, 64);
      headBase.mirror = true;
      setRotation(headBase, 0F, 0F, 0F);
      
      convertToChild(Head1, headBase);
      convertToChild(Head1, HeadTop);

         
      convertToChild(LL, LL2);
      
      convertToChild(RL, RL2);

      

      
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
    //HeadTop.render(scaleFactor);
    Head1.render(scaleFactor);
    body.render(scaleFactor);
    RA.render(scaleFactor);
    LA.render(scaleFactor);
    RL.render(scaleFactor);
    LL.render(scaleFactor);
    //LL.render(scaleFactor);
    //RL.render(scaleFactor);
    //headBase.render(scaleFactor);
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
      
      this.Head1.rotateAngleX = (0.2617794F + XAngle);
      this.Head1.rotateAngleY = YAngle;
      
      this.LL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
      this.RL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.LA.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.RA.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
  }

}
