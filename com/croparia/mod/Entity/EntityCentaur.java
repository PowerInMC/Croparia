package com.croparia.mod.Entity;

import com.croparia.mod.Entity.AI.EntityAIBaseAttack;
import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.World.Dim.EarthDim;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityCentaur extends EntityMob
{  
    
    public EntityCentaur(World world)
    {
        super(world);
        this.func_70105_a(1, 2.5F);
    }

    protected void func_184651_r()
    {
        this.field_70714_bg.func_75776_a(0, new EntityAISwimming(this));
        this.field_70714_bg.func_75776_a(6, new EntityAIWander(this, 1.0D));
        this.field_70714_bg.func_75776_a(6, new EntityAIMoveTowardsTarget(this, 1, 20F));
        this.field_70714_bg.func_75776_a(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.field_70714_bg.func_75776_a(1, new EntityAIBaseAttack(this, 1.0D, false));
        this.field_70715_bh.func_75776_a(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.field_70714_bg.func_75776_a(8, new EntityAILookIdle(this));


    }

    protected void func_110147_ax()
    {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(300.0D);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.90D);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(20.0D / 2);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(40.0D);
        this.func_110148_a(SharedMonsterAttributes.field_111266_c).func_111128_a(1.0D);

    }

    @Override
    public void func_70645_a(DamageSource cause)
    {
        super.func_70645_a(cause);
            
    	if(cause.func_76346_g() instanceof EntityPlayer)
        {
    		if(this.func_95999_t() == "Centaur")
			{
				this.func_145779_a(EarthDim.block, 1);
			}
    		else
    		{
			   this.func_145779_a(ItemMod.elemental_earth, 8);
			   this.func_145779_a(ItemMod.elemental_earth_chestplate, 1);
			   this.func_145779_a(ItemMod.earth_sword, 1);
    		}
         
        }
    }
    
    @Override

    protected void func_70619_bc()

    {

     super.func_70619_bc();

    }

    public void func_184178_b(EntityPlayerMP player)

    {

        super.func_184178_b(player);

    }
    
    public void func_184203_c(EntityPlayerMP player)

    {

        super.func_184203_c(player);

    }

}
