package com.croparia.mod.Models.Seafarer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelSeafarer extends ModelBase
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
    field_78090_t = 128;
    field_78089_u = 64;
    
      HeadTop = new ModelRenderer(this, 30, 0);
      HeadTop.func_78789_a(-3F, -7F, -4.8F, 6, 2, 7);
      HeadTop.func_78793_a(0F, 0F, 0F);
      HeadTop.func_78787_b(128, 64);
      HeadTop.field_78809_i = true;
      setRotation(HeadTop, 0.1850049F, 0F, 0F);
      Head1 = new ModelRenderer(this, 0, 0);
      Head1.func_78789_a(-3F, -6F, -6F, 6, 6, 7);
      Head1.func_78793_a(0F, 0F, 0F);
      Head1.func_78787_b(128, 64);
      Head1.field_78809_i = true;
      setRotation(Head1, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.func_78789_a(-4F, 0F, -2F, 8, 12, 4);
      body.func_78793_a(0F, 0F, 0F);
      body.func_78787_b(128, 64);
      body.field_78809_i = true;
      setRotation(body, 0F, 0F, 0F);
      RA = new ModelRenderer(this, 40, 16);
      RA.func_78789_a(-3F, -2F, -2F, 4, 12, 4);
      RA.func_78793_a(-5F, 2F, 0F);
      RA.func_78787_b(128, 64);
      RA.field_78809_i = true;
      setRotation(RA, 0F, 0F, 0F);
      LA = new ModelRenderer(this, 40, 16);
      LA.func_78789_a(-1F, -2F, -2F, 4, 12, 4);
      LA.func_78793_a(5F, 2F, 0F);
      LA.func_78787_b(128, 64);
      LA.field_78809_i = true;
      setRotation(LA, 0F, 0F, 0F);
      RL = new ModelRenderer(this, 0, 16);
      RL.func_78789_a(-2F, 0F, -2F, 4, 12, 4);
      RL.func_78793_a(-2F, 12F, 0F);
      RL.func_78787_b(128, 64);
      RL.field_78809_i = true;
      setRotation(RL, 0F, 0F, 0F);
      LL = new ModelRenderer(this, 0, 16);
      LL.func_78789_a(-2F, 0F, -2F, 4, 12, 4);
      LL.func_78793_a(2F, 12F, 0F);
      LL.func_78787_b(128, 64);
      LL.field_78809_i = true;
      setRotation(LL, 0F, 0F, 0F);
      LL2 = new ModelRenderer(this, 1, 36);
      LL2.func_78789_a(2F, 3F, 0F, 3, 7, 0);
      LL2.func_78793_a(2F, 12F, 0F);
      LL2.func_78787_b(128, 64);
      LL2.field_78809_i = true;
      setRotation(LL2, 0F, 0F, 0F);
      RL2 = new ModelRenderer(this, 10, 36);
      RL2.func_78789_a(-5F, 3F, 0F, 3, 7, 0);
      RL2.func_78793_a(-2F, 12F, 0F);
      RL2.func_78787_b(128, 64);
      RL2.field_78809_i = true;
      setRotation(RL2, 0F, 0F, 0F);
      headBase = new ModelRenderer(this, 60, 0);
      headBase.func_78789_a(-3F, -7.26F, 0.8F, 6, 11, 2);
      headBase.func_78793_a(0F, 0F, 0F);
      headBase.func_78787_b(128, 64);
      headBase.field_78809_i = true;
      setRotation(headBase, 0F, 0F, 0F);
      
      convertToChild(Head1, headBase);
      convertToChild(Head1, HeadTop);

         
      convertToChild(LL, LL2);
      
      convertToChild(RL, RL2);

      

      
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
    //HeadTop.render(scaleFactor);
    Head1.func_78785_a(scaleFactor);
    body.func_78785_a(scaleFactor);
    RA.func_78785_a(scaleFactor);
    LA.func_78785_a(scaleFactor);
    RL.func_78785_a(scaleFactor);
    LL.func_78785_a(scaleFactor);
    //LL.render(scaleFactor);
    //RL.render(scaleFactor);
    //headBase.render(scaleFactor);
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
      
      this.Head1.field_78795_f = (0.2617794F + XAngle);
      this.Head1.field_78796_g = YAngle;
      
      this.LL.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
      this.RL.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.LA.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.RA.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
  }

}
