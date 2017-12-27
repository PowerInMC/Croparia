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
    field_78090_t = 128;
    field_78089_u = 128;
    
      BodyR = new ModelRenderer(this, 100, 15);
      BodyR.func_78789_a(-6F, -5F, -3F, 6, 10, 4);
      BodyR.func_78793_a(0F, 0F, 0F);
      BodyR.func_78787_b(128, 128);
      BodyR.field_78809_i = true;
      setRotation(BodyR, 0.6981317F, 0.5235988F, 0F);
      Block = new ModelRenderer(this, 0, 0);
      Block.func_78789_a(-3F, -3F, -4F, 8, 8, 8);
      Block.func_78793_a(0F, 8F, -8F);
      Block.func_78787_b(128, 128);
      Block.field_78809_i = true;
      setRotation(Block, 0.5948578F, 0F, 0F);
      BodyL = new ModelRenderer(this, 79, 15);
      BodyL.func_78789_a(0F, -5F, -3F, 6, 10, 4);
      BodyL.func_78793_a(0F, 0F, 0F);
      BodyL.func_78787_b(128, 128);
      BodyL.field_78809_i = true;
      setRotation(BodyL, 0.6981317F, -0.5235988F, 0F);
      lA2 = new ModelRenderer(this, 20, 67);
      lA2.func_78789_a(-6F, 2F, 3F, 3, 7, 3);
      lA2.func_78793_a(-4F, 0F, -2F);
      lA2.func_78787_b(128, 128);
      lA2.field_78809_i = true;
      setRotation(lA2, -1.082104F, -0.8726646F, 0F);
      Final1 = new ModelRenderer(this, 0, 20);
      Final1.func_78789_a(-1F, 4.266667F, 1F, 2, 1, 8);
      Final1.func_78793_a(0F, 0F, 0F);
      Final1.func_78787_b(128, 128);
      Final1.field_78809_i = true;
      setRotation(Final1, -0.3346075F, 0F, 0F);
      LA = new ModelRenderer(this, 20, 55);
      LA.func_78789_a(-1F, 0F, -2F, 3, 7, 3);
      LA.func_78793_a(-4F, 0F, -2F);
      LA.func_78787_b(128, 128);
      LA.field_78809_i = true;
      setRotation(LA, -0.7504916F, 0.8552113F, 0F);
      Final2 = new ModelRenderer(this, 0, 34);
      Final2.func_78789_a(-1F, 8F, 4F, 2, 1, 6);
      Final2.func_78793_a(0F, 0F, 0F);
      Final2.func_78787_b(128, 128);
      Final2.field_78809_i = true;
      setRotation(Final2, 0.2617994F, 0F, 0F);
      RA2 = new ModelRenderer(this, 0, 67);
      RA2.func_78789_a(3F, 2F, 3F, 3, 7, 3);
      RA2.func_78793_a(5F, 0F, -1F);
      RA2.func_78787_b(128, 128);
      RA2.field_78809_i = true;
      setRotation(RA2, -1.082104F, 0.8726646F, 0F);
      Head = new ModelRenderer(this, 86, 0);
      Head.func_78789_a(-3F, -3F, -3F, 6, 6, 6);
      Head.func_78793_a(0F, -6F, -3F);
      Head.func_78787_b(128, 128);
      Head.field_78809_i = true;
      setRotation(Head, 0.3490659F, -0.6981317F, -0.296706F);
      RA = new ModelRenderer(this, 0, 55);
      RA.func_78789_a(-2F, 0F, -2F, 3, 7, 3);
      RA.func_78793_a(5F, 0F, -1F);
      RA.func_78787_b(128, 128);
      RA.field_78809_i = true;
      setRotation(RA, -0.7504916F, -0.8552113F, 0F);
           
      convertToChild(Final1, Final2);
   
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
    BodyR.func_78785_a(scaleFactor);
    Block.func_78785_a(scaleFactor);
    BodyL.func_78785_a(scaleFactor);
    lA2.func_78785_a(scaleFactor);
    Final1.func_78785_a(scaleFactor);
    LA.func_78785_a(scaleFactor);
    //Final2.render(scaleFactor);
    RA2.func_78785_a(scaleFactor);
    Head.func_78785_a(scaleFactor);
    RA.func_78785_a(scaleFactor);
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

      this.Final1.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
  }

}
