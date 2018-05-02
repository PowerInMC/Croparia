package com.croparia.mod.Models;



import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelReaper extends ModelBase
{
  //fields
    ModelRenderer tete2;
    ModelRenderer tete;
    ModelRenderer manche;
    ModelRenderer capuche;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer bas;
    ModelRenderer tissucape;
    ModelRenderer tissubrasl;
    ModelRenderer tissubrasR;
  
  public ModelReaper()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      tete2 = new ModelRenderer(this, 75, 35);
      tete2.addBox(-2F, 4F, -17F, 2, 4, 1);
      tete2.setRotationPoint(-5F, -1F, 0F);
      tete2.setTextureSize(128, 64);
      tete2.mirror = true;
      setRotation(tete2, 0.504321F, 0F, 0F);
      tete = new ModelRenderer(this, 75, 28);
      tete.addBox(-2F, 7F, -13F, 2, 5, 1);
      tete.setRotationPoint(-5F, -1F, 0F);
      tete.setTextureSize(128, 64);
      tete.mirror = true;
      setRotation(tete, 0F, 0F, 0F);
      manche = new ModelRenderer(this, 53, 27);
      manche.addBox(-1.5F, 8F, -12F, 1, 1, 16);
      manche.setRotationPoint(-5F, -1F, 0F);
      manche.setTextureSize(128, 64);
      manche.mirror = true;
	  setRotation(manche, 0F, 0F, 0F);
      capuche = new ModelRenderer(this, 64, 0);
      capuche.addBox(-4.5F, -8.5F, -4.5F, 9, 9, 9);
      capuche.setRotationPoint(0F, -3F, 0F);
      capuche.setTextureSize(128, 64);
      capuche.mirror = true;
      setRotation(capuche, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, -3F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, -3F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, -1F, 0F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, -1F, 0F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      bas = new ModelRenderer(this, 0, 39);
      bas.addBox(-4F, 0F, -2F, 8, 12, 4);
      bas.setRotationPoint(0F, 9F, 0F);
      bas.setTextureSize(128, 64);
      bas.mirror = true;
      setRotation(bas, 0F, 0F, 0F);
      tissucape = new ModelRenderer(this, 37, 0);
      tissucape.addBox(-4F, 0F, 2.2F, 8, 9, 0);
      tissucape.setRotationPoint(0F, -3F, 0F);
      tissucape.setTextureSize(128, 64);
      tissucape.mirror = true;
      setRotation(tissucape, 0F, 0F, 0F);
      tissubrasl = new ModelRenderer(this, 33, 37);
      tissubrasl.addBox(-3F, 10F, -2F, 4, 5, 4);
      tissubrasl.setRotationPoint(-5F, -1F, 0F);
      tissubrasl.setTextureSize(128, 64);
      tissubrasl.mirror = true;
      setRotation(tissubrasl, 0F, 0F, 0F);
      tissubrasR = new ModelRenderer(this, 33, 37);
      tissubrasR.addBox(-1F, 10F, -2F, 4, 5, 4);
      tissubrasR.setRotationPoint(5F, -1F, 0F);
      tissubrasR.setTextureSize(128, 64);
      tissubrasR.mirror = true;
      setRotation(tissubrasR, 0F, 0F, 0F);
 
      convertToChild(head, capuche);
      convertToChild(head, tissucape);
      convertToChild(leftarm, tissubrasR);
      convertToChild(rightarm, tissubrasl);
      convertToChild(rightarm, tete);
      convertToChild(rightarm, tete2);
      convertToChild(rightarm, manche);
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
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
//    capuche.render(f5);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    bas.render(f5);
//    tissucape.render(f5);
//    tissubrasl.render(f5);
//    tissubrasR.render(f5);
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
      
      this.head.rotateAngleX = (0.2617794F + XAngle);
      this.head.rotateAngleY = YAngle;
      
      this.bas.rotateAngleX = MathHelper.cos(0.6662F);
      this.leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.rightarm.rotateAngleX = (MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount) - 0.750F;
  }



}
