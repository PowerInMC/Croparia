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
    field_78090_t = 128;
    field_78089_u = 64;
    
      tete2 = new ModelRenderer(this, 75, 35);
      tete2.func_78789_a(-2F, 4F, -17F, 2, 4, 1);
      tete2.func_78793_a(-5F, -1F, 0F);
      tete2.func_78787_b(128, 64);
      tete2.field_78809_i = true;
      setRotation(tete2, 0.504321F, 0F, 0F);
      tete = new ModelRenderer(this, 75, 28);
      tete.func_78789_a(-2F, 7F, -13F, 2, 5, 1);
      tete.func_78793_a(-5F, -1F, 0F);
      tete.func_78787_b(128, 64);
      tete.field_78809_i = true;
      setRotation(tete, 0F, 0F, 0F);
      manche = new ModelRenderer(this, 53, 27);
      manche.func_78789_a(-1.5F, 8F, -12F, 1, 1, 16);
      manche.func_78793_a(-5F, -1F, 0F);
      manche.func_78787_b(128, 64);
      manche.field_78809_i = true;
	  setRotation(manche, 0F, 0F, 0F);
      capuche = new ModelRenderer(this, 64, 0);
      capuche.func_78789_a(-4.5F, -8.5F, -4.5F, 9, 9, 9);
      capuche.func_78793_a(0F, -3F, 0F);
      capuche.func_78787_b(128, 64);
      capuche.field_78809_i = true;
      setRotation(capuche, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.func_78789_a(-4F, -8F, -4F, 8, 8, 8);
      head.func_78793_a(0F, -3F, 0F);
      head.func_78787_b(128, 64);
      head.field_78809_i = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.func_78789_a(-4F, 0F, -2F, 8, 12, 4);
      body.func_78793_a(0F, -3F, 0F);
      body.func_78787_b(128, 64);
      body.field_78809_i = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.func_78789_a(-3F, -2F, -2F, 4, 12, 4);
      rightarm.func_78793_a(-5F, -1F, 0F);
      rightarm.func_78787_b(128, 64);
      rightarm.field_78809_i = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.func_78789_a(-1F, -2F, -2F, 4, 12, 4);
      leftarm.func_78793_a(5F, -1F, 0F);
      leftarm.func_78787_b(128, 64);
      leftarm.field_78809_i = true;
      setRotation(leftarm, 0F, 0F, 0F);
      bas = new ModelRenderer(this, 0, 39);
      bas.func_78789_a(-4F, 0F, -2F, 8, 12, 4);
      bas.func_78793_a(0F, 9F, 0F);
      bas.func_78787_b(128, 64);
      bas.field_78809_i = true;
      setRotation(bas, 0F, 0F, 0F);
      tissucape = new ModelRenderer(this, 37, 0);
      tissucape.func_78789_a(-4F, 0F, 2.2F, 8, 9, 0);
      tissucape.func_78793_a(0F, -3F, 0F);
      tissucape.func_78787_b(128, 64);
      tissucape.field_78809_i = true;
      setRotation(tissucape, 0F, 0F, 0F);
      tissubrasl = new ModelRenderer(this, 33, 37);
      tissubrasl.func_78789_a(-3F, 10F, -2F, 4, 5, 4);
      tissubrasl.func_78793_a(-5F, -1F, 0F);
      tissubrasl.func_78787_b(128, 64);
      tissubrasl.field_78809_i = true;
      setRotation(tissubrasl, 0F, 0F, 0F);
      tissubrasR = new ModelRenderer(this, 33, 37);
      tissubrasR.func_78789_a(-1F, 10F, -2F, 4, 5, 4);
      tissubrasR.func_78793_a(5F, -1F, 0F);
      tissubrasR.func_78787_b(128, 64);
      tissubrasR.field_78809_i = true;
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
  
  public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
    func_78087_a(f, f1, f2, f3, f4, f5, entity);
//    capuche.render(f5);
    head.func_78785_a(f5);
    body.func_78785_a(f5);
    rightarm.func_78785_a(f5);
    leftarm.func_78785_a(f5);
    bas.func_78785_a(f5);
//    tissucape.render(f5);
//    tissubrasl.render(f5);
//    tissubrasR.render(f5);
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
      
      this.head.field_78795_f = (0.2617794F + XAngle);
      this.head.field_78796_g = YAngle;
      
      this.bas.field_78795_f = MathHelper.func_76134_b(0.6662F);
      this.leftarm.field_78795_f = MathHelper.func_76134_b(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
      this.rightarm.field_78795_f = (MathHelper.func_76134_b(limbSwing * 0.6662F) * 1.4F * limbSwingAmount) - 0.750F;
  }



}
