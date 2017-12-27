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
    field_78090_t = 128;
    field_78089_u = 128;
    
      Nose = new ModelRenderer(this, 41, 0);
      Nose.func_78789_a(-1.5F, -1F, -6F, 3, 2, 2);
      Nose.func_78793_a(0F, -13F, -4F);
      Nose.func_78787_b(128, 128);
      Nose.field_78809_i = true;
      setRotation(Nose, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 18, 20);
      RightArm.func_78789_a(-6F, -1F, -3F, 6, 22, 6);
      RightArm.func_78793_a(-10F, -12F, 0F);
      RightArm.func_78787_b(128, 128);
      RightArm.field_78809_i = true;
      setRotation(RightArm, 0F, 0F, 0F);
      LeftArm = new ModelRenderer(this, 104, 20);
      LeftArm.func_78789_a(0F, -1F, -3F, 6, 22, 6);
      LeftArm.func_78793_a(10F, -12F, 0F);
      LeftArm.func_78787_b(128, 128);
      LeftArm.field_78809_i = true;
      setRotation(LeftArm, 0F, 0F, 0F);
      LeftFeet = new ModelRenderer(this, 73, 75);
      LeftFeet.func_78789_a(-2.5F, 13F, -3.5F, 6, 7, 6);
      LeftFeet.func_78793_a(4F, 4F, 0.5F);
      LeftFeet.func_78787_b(128, 128);
      LeftFeet.field_78809_i = true;
      setRotation(LeftFeet, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 72, 57);
      LeftLeg.func_78789_a(-2F, 0F, -3F, 5, 13, 5);
      LeftLeg.func_78793_a(4F, 5F, 0.5F);
      LeftLeg.func_78787_b(128, 128);
      LeftLeg.field_78809_i = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      RightLeg = new ModelRenderer(this, 53, 57);
      RightLeg.func_78789_a(-3F, 0F, -3F, 5, 13, 5);
      RightLeg.func_78793_a(-4F, 5F, 0.5F);
      RightLeg.func_78787_b(128, 128);
      RightLeg.field_78809_i = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      RightFeet = new ModelRenderer(this, 49, 75);
      RightFeet.func_78789_a(-3.5F, 12F, -4F, 6, 7, 6);
      RightFeet.func_78793_a(-4F, 5F, 1F);
      RightFeet.func_78787_b(128, 128);
      RightFeet.field_78809_i = true;
      setRotation(RightFeet, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 53, 0);
      Head.func_78789_a(-5F, -8F, -4F, 10, 10, 10);
      Head.func_78793_a(0F, -13F, -4F);
      Head.func_78787_b(128, 128);
      Head.field_78809_i = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 42, 20);
      Body.func_78789_a(-10F, 0F, -5.5F, 20, 13, 11);
      Body.func_78793_a(0F, -14F, 0F);
      Body.func_78787_b(128, 128);
      Body.field_78809_i = true;
      setRotation(Body, 0F, 0F, 0F);
      Body2 = new ModelRenderer(this, 57, 44);
      Body2.func_78789_a(-5F, 0F, -3F, 10, 7, 6);
      Body2.func_78793_a(0F, -1F, 0F);
      Body2.func_78787_b(128, 128);
      Body2.field_78809_i = true;
      setRotation(Body2, 0F, 0F, 0F);
      HornBase = new ModelRenderer(this, 0, 100);
      HornBase.func_78789_a(-10F, -7F, -2F, 20, 5, 5);
      HornBase.func_78793_a(0F, -13F, -4F);
      HornBase.func_78787_b(128, 128);
      HornBase.field_78809_i = true;
      setRotation(HornBase, 0F, 0F, 0F);
      HornLeft = new ModelRenderer(this, -1, 0);
      HornLeft.func_78789_a(6F, -13F, 5F, 3, 12, 3);
      HornLeft.func_78793_a(0F, -13F, -4F);
      HornLeft.func_78787_b(128, 128);
      HornLeft.field_78809_i = true;
      setRotation(HornLeft, 0.8726646F, 0.3490659F, 0F);
      HornRight = new ModelRenderer(this, 0, 0);
      HornRight.func_78789_a(-9F, -13F, 5F, 3, 12, 3);
      HornRight.func_78793_a(0F, -13F, -4F);
      HornRight.func_78787_b(128, 128);
      HornRight.field_78809_i = true;
      setRotation(HornRight, 0.8726646F, -0.3490659F, 0F);
      RightRing = new ModelRenderer(this, 15, 0);
      RightRing.func_78789_a(-2.5F, 2F, -5F, 1, 3, 1);
      RightRing.func_78793_a(0F, -13F, -4F);
      RightRing.func_78787_b(128, 128);
      RightRing.field_78809_i = true;
      setRotation(RightRing, -0.4363323F, 0F, 0F);
      LeftRing = new ModelRenderer(this, 15, 0);
      LeftRing.func_78789_a(1.5F, 2F, -5F, 1, 3, 1);
      LeftRing.func_78793_a(0F, -13F, -4F);
      LeftRing.func_78787_b(128, 128);
      LeftRing.field_78809_i = true;
      setRotation(LeftRing, -0.4363323F, 0F, 0F);
      RingBase = new ModelRenderer(this, 22, 12);
      RingBase.func_78789_a(-2.5F, 4F, -5F, 5, 1, 1);
      RingBase.func_78793_a(0F, -13F, -4F);
      RingBase.func_78787_b(128, 128);
      RingBase.field_78809_i = true;
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
      child.field_78800_c -= parent.field_78800_c;
      child.field_78797_d -= parent.field_78797_d;
      child.field_78798_e -= parent.field_78798_e;
      
    // make rotations relative to parent
      child.field_78795_f -= parent.field_78795_f;
      child.field_78796_g -= parent.field_78796_g;
      child.field_78808_h -= parent.field_78808_h;
      
    //create relationship
      parent.func_78792_a(child);
      
  }
  
  public void func_78088_a(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
  {
    super.func_78088_a(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
    func_78087_a(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
    //Nose.render(scaleFactor);
    RightArm.func_78785_a(scaleFactor);
    LeftArm.func_78785_a(scaleFactor);
    //LeftFeet.render(scaleFactor);
    LeftLeg.func_78785_a(scaleFactor);
    RightLeg.func_78785_a(scaleFactor);
    //RightFeet.render(scaleFactor);
    Head.func_78785_a(scaleFactor);
    Body.func_78785_a(scaleFactor);
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
    model.field_78795_f = x;
    model.field_78796_g = y;
    model.field_78808_h = z;
  }
  
  public void func_78087_a(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity)
  {
      float XAngle = headPitch / 57.29578F;
      float YAngle = netHeadYaw / 57.29578F;
      
      this.Head.field_78795_f = (0.2617794F + XAngle);
      this.Head.field_78796_g = YAngle;
      
      this.LeftLeg.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
      this.RightLeg.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.LeftArm.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.RightArm.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
  }

}
