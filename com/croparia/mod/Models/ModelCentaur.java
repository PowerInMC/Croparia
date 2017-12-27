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
    field_78090_t = 128;
    field_78089_u = 128;
    
      Shape2 = new ModelRenderer(this, 63, 0);
      Shape2.func_78789_a(-2.5F, 10F, 2F, 5, 9, 4);
      Shape2.func_78793_a(0F, 2F, 12F);
      Shape2.func_78787_b(128, 128);
      Shape2.field_78809_i = true;
      setRotation(Shape2, -0.0242694F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 40, 0);
      Shape3.func_78789_a(-2.5F, 2F, 0F, 5, 9, 4);
      Shape3.func_78793_a(0F, 2F, 12F);
      Shape3.func_78787_b(128, 128);
      Shape3.field_78809_i = true;
      setRotation(Shape3, 0.1616237F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 26, 0);
      Shape1.func_78789_a(-1F, 0F, -1F, 2, 3, 2);
      Shape1.func_78793_a(0F, 2F, 12F);
      Shape1.func_78787_b(128, 128);
      Shape1.field_78809_i = true;
      setRotation(Shape1, 0.5705884F, 0F, 0F);
      LFlegtop = new ModelRenderer(this, 100, 15);
      LFlegtop.func_78789_a(-1.5F, -5F, -2.5F, 4, 9, 5);
      LFlegtop.func_78793_a(4F, 11F, -10F);
      LFlegtop.func_78787_b(128, 128);
      LFlegtop.field_78809_i = true;
      setRotation(LFlegtop, 0F, 0F, 0F);
      LFlegbottom = new ModelRenderer(this, 100, 30);
      LFlegbottom.func_78789_a(-1.5F, 0F, -2F, 3, 6, 4);
      LFlegbottom.func_78793_a(4.5F, 15F, -10F);
      LFlegbottom.func_78787_b(128, 128);
      LFlegbottom.field_78809_i = true;
      setRotation(LFlegbottom, 0F, 0F, 0F);
      LFfeet = new ModelRenderer(this, 0, 0);
      LFfeet.func_78789_a(-1.5F, 6F, -2.5F, 4, 3, 5);
      LFfeet.func_78793_a(4F, 15F, -10F);
      LFfeet.func_78787_b(128, 128);
      LFfeet.field_78809_i = true;
      setRotation(LFfeet, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 70);
      Body.func_78789_a(-5F, -5F, -12F, 11, 11, 24);
      Body.func_78793_a(0F, 7F, 0F);
      Body.func_78787_b(128, 128);
      Body.field_78809_i = true;
      setRotation(Body, 0F, 0F, 0F);
      RFlegtop = new ModelRenderer(this, 75, 15);
      RFlegtop.func_78789_a(-2.5F, -5F, -2.5F, 4, 9, 5);
      RFlegtop.func_78793_a(-3F, 11F, -10F);
      RFlegtop.func_78787_b(128, 128);
      RFlegtop.field_78809_i = true;
      setRotation(RFlegtop, 0F, 0F, 0F);
      RFlegbottom = new ModelRenderer(this, 75, 30);
      RFlegbottom.func_78789_a(-1.5F, 0F, -2F, 3, 6, 4);
      RFlegbottom.func_78793_a(-3.5F, 15F, -10F);
      RFlegbottom.func_78787_b(128, 128);
      RFlegbottom.field_78809_i = true;
      setRotation(RFlegbottom, 0F, 0F, 0F);
      RFfeet = new ModelRenderer(this, 0, 0);
      RFfeet.func_78789_a(-2F, 6F, -2.5F, 4, 3, 5);
      RFfeet.func_78793_a(-3.5F, 15F, -10F);
      RFfeet.func_78787_b(128, 128);
      RFfeet.field_78809_i = true;
      setRotation(RFfeet, 0F, 0F, 0F);
      LBlegtop = new ModelRenderer(this, 100, 45);
      LBlegtop.func_78789_a(-1.5F, -5F, -2.5F, 4, 9, 5);
      LBlegtop.func_78793_a(4F, 11F, 10F);
      LBlegtop.func_78787_b(128, 128);
      LBlegtop.field_78809_i = true;
      setRotation(LBlegtop, 0F, 0F, 0F);
      LBlegbottom = new ModelRenderer(this, 100, 60);
      LBlegbottom.func_78789_a(-1.5F, 0F, -2F, 3, 6, 4);
      LBlegbottom.func_78793_a(4.5F, 15F, 10F);
      LBlegbottom.func_78787_b(128, 128);
      LBlegbottom.field_78809_i = true;
      setRotation(LBlegbottom, 0F, 0F, 0F);
      LBfeet = new ModelRenderer(this, 0, 0);
      LBfeet.func_78789_a(-1.5F, 6F, -2.5F, 4, 3, 5);
      LBfeet.func_78793_a(4F, 15F, 10F);
      LBfeet.func_78787_b(128, 128);
      LBfeet.field_78809_i = true;
      setRotation(LBfeet, 0F, 0F, 0F);
      RBlegtop = new ModelRenderer(this, 75, 45);
      RBlegtop.func_78789_a(-2.5F, -5F, -2.5F, 4, 9, 5);
      RBlegtop.func_78793_a(-3F, 11F, 10F);
      RBlegtop.func_78787_b(128, 128);
      RBlegtop.field_78809_i = true;
      setRotation(RBlegtop, 0F, 0F, 0F);
      RBlegbottom = new ModelRenderer(this, 75, 60);
      RBlegbottom.func_78789_a(-1.5F, 0F, -2F, 3, 6, 4);
      RBlegbottom.func_78793_a(-3.5F, 15F, 10F);
      RBlegbottom.func_78787_b(128, 128);
      RBlegbottom.field_78809_i = true;
      setRotation(RBlegbottom, 0F, 0F, 0F);
      RBfeet = new ModelRenderer(this, 0, 0);
      RBfeet.func_78789_a(-2.5F, 6F, -2.5F, 4, 3, 5);
      RBfeet.func_78793_a(-3F, 15F, 10F);
      RBfeet.func_78787_b(128, 128);
      RBfeet.field_78809_i = true;
      setRotation(RBfeet, 0F, 0F, 0F);
      Rarm = new ModelRenderer(this, 0, 47);
      Rarm.func_78789_a(-4F, -3F, -2.5F, 5, 16, 5);
      Rarm.func_78793_a(-6F, -11F, -9.5F);
      Rarm.func_78787_b(128, 128);
      Rarm.field_78809_i = true;
      setRotation(Rarm, 0F, 0F, 0F);
      Larm = new ModelRenderer(this, 52, 47);
      Larm.func_78789_a(-1F, -3F, -2.5F, 5, 16, 5);
      Larm.func_78793_a(7F, -11F, -9.5F);
      Larm.func_78787_b(128, 128);
      Larm.field_78809_i = true;
      setRotation(Larm, 0F, 0F, 0F);
      MenHead = new ModelRenderer(this, 0, 29);
      MenHead.func_78789_a(-4.5F, -8.5F, -4.5F, 9, 9, 9);
      MenHead.func_78793_a(0.5F, -14.5F, -9.5F);
      MenHead.func_78787_b(128, 128);
      MenHead.field_78809_i = true;
      setRotation(MenHead, 0F, 0F, 0F);
      MenBody = new ModelRenderer(this, 20, 47);
      MenBody.func_78789_a(-5.5F, 0F, -3F, 11, 16, 5);
      MenBody.func_78793_a(0.5F, -14F, -9F);
      MenBody.func_78787_b(128, 128);
      MenBody.field_78809_i = true;
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
    //Shape3.render(scaleFactor);
    //Shape2.render(scaleFactor);
    Shape1.func_78785_a(scaleFactor);
    LFlegtop.func_78785_a(scaleFactor);
    //LFlegbottom.render(scaleFactor);
    //LFfeet.render(scaleFactor);
    Body.func_78785_a(scaleFactor);
    RFlegtop.func_78785_a(scaleFactor);
    //RFlegbottom.render(scaleFactor);
    //RFfeet.render(scaleFactor);
    LBlegtop.func_78785_a(scaleFactor);
    //LBlegbottom.render(scaleFactor);
    //LBfeet.render(scaleFactor);
    RBlegtop.func_78785_a(scaleFactor);
    //RBlegbottom.render(scaleFactor);
    //RBfeet.render(scaleFactor);
    Rarm.func_78785_a(scaleFactor);
    Larm.func_78785_a(scaleFactor);
    MenHead.func_78785_a(scaleFactor);
    //MenBody.render(scaleFactor);

    
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
      
      this.MenHead.field_78795_f = (0.2617794F + XAngle);
      this.MenHead.field_78796_g = YAngle;
      
      this.LFlegtop.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
      this.RFlegtop.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.LBlegtop.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.RBlegtop.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
  }

}
