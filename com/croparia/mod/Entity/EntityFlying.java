package com.croparia.mod.Entity;

import com.croparia.mod.Entity.AI.EntityAIBaseAttack;
import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.World.Dim.AirDim;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityFlying extends EntityMob
{
    /** Random offset used in floating behaviour */
    private float heightOffset = 0.5F;
    /** ticks until heightOffset is randomized */
    private int heightOffsetUpdateTime;

   
    public EntityFlying(World world)
    {
        super(world);
        this.func_70105_a(1, 2);
    }

    protected void func_184651_r()
    {
        this.field_70714_bg.func_75776_a(0, new EntityAISwimming(this));
        this.field_70714_bg.func_75776_a(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.field_70714_bg.func_75776_a(6, new EntityAIWander(this, 1.0D));
        this.field_70714_bg.func_75776_a(6, new EntityAIMoveTowardsTarget(this, 1, 20F));
        this.field_70714_bg.func_75776_a(8, new EntityAILookIdle(this));
        this.field_70714_bg.func_75776_a(4, new EntityFlying.AIFireballAttack(this));
        this.field_70714_bg.func_75776_a(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.field_70714_bg.func_75776_a(1, new EntityAIBaseAttack(this, 1.0D, false));
        this.field_70715_bh.func_75776_a(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));

    }

    protected void func_110147_ax()
    {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(400.0D);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.90D);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(100.0D / 2);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(60.0D);
        this.func_110148_a(SharedMonsterAttributes.field_111266_c).func_111128_a(0D);

    }

    @Override
    public void func_70645_a(DamageSource cause)
    {
        super.func_70645_a(cause);
        if(cause.func_76346_g() instanceof EntityPlayer)
        {
    		if(this.func_95999_t() == "Flying Beast")
			{
				this.func_145779_a(AirDim.block, 1);
			}
    		else
    		{
	            this.func_145779_a(ItemMod.elemental_air, 8);
	            this.func_145779_a(ItemMod.elemental_air_chestplate, 1);
	            this.func_145779_a(ItemMod.air_sword, 1);
    		}

        }
    }
    
    protected void func_70619_bc()
    {
        
        
        --this.heightOffsetUpdateTime;

        if (this.heightOffsetUpdateTime <= 0)
        {
            this.heightOffsetUpdateTime = 100;
            this.heightOffset = 0.5F + (float)this.field_70146_Z.nextGaussian() * 3.0F;
        }

        EntityLivingBase entitylivingbase = this.func_70638_az();

        if (entitylivingbase != null && entitylivingbase.field_70163_u + (double)entitylivingbase.func_70047_e() > this.field_70163_u + (double)this.func_70047_e() + (double)this.heightOffset)
        {
            this.field_70181_x += (0.30000001192092896D - this.field_70181_x) * 0.30000001192092896D;
            this.field_70160_al = true;
        }

        super.func_70619_bc();
    }

    public void func_180430_e(float distance, float damageMultiplier)
    {
    }
    
    public void func_70636_d()
    {
        if (!this.field_70122_E && this.field_70181_x < 0.0D)
        {
            this.field_70181_x *= 0.6D;
        }

        if (this.field_70170_p.field_72995_K)
        {
            if (this.field_70146_Z.nextInt(24) == 0 && !this.func_174814_R())
            {
                this.field_70170_p.func_184134_a(this.field_70165_t + 0.5D, this.field_70163_u + 0.5D, this.field_70161_v + 0.5D, SoundEvents.field_187597_B, this.func_184176_by(), 1.0F + this.field_70146_Z.nextFloat(), this.field_70146_Z.nextFloat() * 0.7F + 0.3F, false);
            }

            for (int i = 0; i < 2; ++i)
            {
                this.field_70170_p.func_175688_a(EnumParticleTypes.SMOKE_LARGE, this.field_70165_t + (this.field_70146_Z.nextDouble() - 0.5D) * (double)this.field_70130_N, this.field_70163_u + this.field_70146_Z.nextDouble() * (double)this.field_70131_O, this.field_70161_v + (this.field_70146_Z.nextDouble() - 0.5D) * (double)this.field_70130_N, 0.0D, 0.0D, 0.0D, new int[0]);
            }
        }

        super.func_70636_d();
    }
    
    public void func_184178_b(EntityPlayerMP player)

    {

    	super.func_184178_b(player);

    }
    
    public void func_184203_c(EntityPlayerMP player)

    {

        super.func_184203_c(player);

    }
    static class AIFireballAttack extends EntityAIBase
    {
        private final EntityFlying blaze;
        private int attackStep;
        private int attackTime;

        public AIFireballAttack(EntityFlying entityFlying)
        {
            this.blaze = entityFlying;
            this.func_75248_a(3);
        }

        /**
         * Returns whether the EntityAIBase should begin execution.
         */
        public boolean func_75250_a()
        {
            EntityLivingBase entitylivingbase = this.blaze.func_70638_az();
            return entitylivingbase != null && entitylivingbase.func_70089_S();
        }

        /**
         * Execute a one shot task or start executing a continuous task
         */
        public void func_75249_e()
        {
            this.attackStep = 0;
        }
        /**
         * Updates the task
         */
        public void func_75246_d()
        {
            --this.attackTime;
            EntityLivingBase entitylivingbase = this.blaze.func_70638_az();
            double d0 = this.blaze.func_70068_e(entitylivingbase);

            if (d0 < 4.0D)
            {
                if (this.attackTime <= 0)
                {
                    this.attackTime = 20;
                    this.blaze.func_70652_k(entitylivingbase);
                }

                this.blaze.func_70605_aq().func_75642_a(entitylivingbase.field_70165_t, entitylivingbase.field_70163_u, entitylivingbase.field_70161_v, 1.0D);
            }
            else if (d0 < this.func_191523_f() * this.func_191523_f())
            {
                double d1 = entitylivingbase.field_70165_t - this.blaze.field_70165_t;
                double d2 = entitylivingbase.func_174813_aQ().field_72338_b + (double)(entitylivingbase.field_70131_O / 2.0F) - (this.blaze.field_70163_u + (double)(this.blaze.field_70131_O / 2.0F));
                double d3 = entitylivingbase.field_70161_v - this.blaze.field_70161_v;

                if (this.attackTime <= 0)
                {
                    ++this.attackStep;

                    if (this.attackStep == 1)
                    {
                        this.attackTime = 60;
                   
                    }
                    else if (this.attackStep <= 4)
                    {
                        this.attackTime = 6;
                    }
                    else
                    {
                        this.attackTime = 100;
                        this.attackStep = 0;
                 
                    }

                    if (this.attackStep > 1)
                    {
                        float f = MathHelper.func_76129_c(MathHelper.func_76133_a(d0)) * 0.5F;
                        this.blaze.field_70170_p.func_180498_a((EntityPlayer)null, 1018, new BlockPos((int)this.blaze.field_70165_t, (int)this.blaze.field_70163_u, (int)this.blaze.field_70161_v), 0);

                        for (int i = 0; i < 1; ++i)
                        {
                            EntitySmallFireball entitysmallfireball = new EntitySmallFireball(this.blaze.field_70170_p, this.blaze, d1 + this.blaze.func_70681_au().nextGaussian() * (double)f, d2, d3 + this.blaze.func_70681_au().nextGaussian() * (double)f);
                            entitysmallfireball.field_70163_u = this.blaze.field_70163_u + (double)(this.blaze.field_70131_O / 2.0F) + 0.5D;
                            this.blaze.field_70170_p.func_72838_d(entitysmallfireball);
                        }
                    }
                }

                this.blaze.func_70671_ap().func_75651_a(entitylivingbase, 10.0F, 10.0F);
            }
            else
            {
                this.blaze.func_70661_as().func_75499_g();
                this.blaze.func_70605_aq().func_75642_a(entitylivingbase.field_70165_t, entitylivingbase.field_70163_u, entitylivingbase.field_70161_v, 1.0D);
            }

            super.func_75246_d();
        }

        private double func_191523_f()
        {
            IAttributeInstance iattributeinstance = this.blaze.func_110148_a(SharedMonsterAttributes.field_111265_b);
            return iattributeinstance == null ? 16.0D : iattributeinstance.func_111126_e();
        }
    }

}
