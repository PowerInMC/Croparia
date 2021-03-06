package com.croparia.mod.Entity.Seafarer;

import com.croparia.mod.Entity.AI.EntityAIBaseAttack;
import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.World.Dim.WaterDim;

import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
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
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntitySeafarerS extends EntityMob
{
	
    public EntitySeafarerS(World world)
    {
        super(world);
        this.setSize(0.5f, 1f);
    }

    
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIMoveTowardsTarget(this, 1, 20F));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(1, new EntityAIBaseAttack(this, 1.0D, false));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.tasks.addTask(8, new EntityAILookIdle(this));


    }
    
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D / 2);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.40D * 1.5);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(15.0D / 4);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(30.0D);
        
    }
    

    @Override
    public void onDeath(DamageSource cause)
    {
        super.onDeath(cause); 
    	if(cause.getTrueSource() instanceof EntityPlayer)
	    {
    		int i = rand.nextInt(4);
    		if(i < 2)
    		{
    			i = i + 1;
    		}
	    	this.dropItem(ItemMod.elemental_water, i); 
	    }
    }
    
    @Override

    protected void updateAITasks()

    {

     super.updateAITasks();


    }

    public void addTrackingPlayer(EntityPlayerMP player)

    {

        super.addTrackingPlayer(player);


    }
    
    public void removeTrackingPlayer(EntityPlayerMP player)

    {

        super.removeTrackingPlayer(player);

    }

}
