package com.croparia.mod.Entity;

import com.croparia.mod.Entity.AI.EntityAIBaseAttack;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;

public class EntityReaper extends EntityMob
{

    
    public EntityReaper(World world)
    {
        super(world);
    }


    
    
    protected void func_184651_r()
    {
        this.field_70714_bg.func_75776_a(0, new EntityAISwimming(this));
        this.field_70714_bg.func_75776_a(6, new EntityAIWander(this, 1.0D));
        this.field_70714_bg.func_75776_a(6, new EntityAIMoveTowardsTarget(this, 4, 300F));
        this.field_70714_bg.func_75776_a(7, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0F));
        this.field_70714_bg.func_75776_a(1, new EntityAIBaseAttack(this, 1.0D, false));
        this.field_70715_bh.func_75776_a(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.field_70714_bg.func_75776_a(8, new EntityAILookIdle(this));
    }

    protected void func_110147_ax()
    {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(1000.0D);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.40D);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(Double.MAX_VALUE);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(60.0D);
        this.func_110148_a(SharedMonsterAttributes.field_111266_c).func_111128_a(0D);

    }

    @Override
    public void func_70645_a(DamageSource cause)
    {
        super.func_70645_a(cause);
        if(cause.func_76346_g() instanceof EntityPlayer)
        {
            this.func_145779_a(ItemMod.scythe, 1);
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
