package com.croparia.mod.Entity.Penguin;

import com.croparia.mod.Entity.EntityReaper;
import com.croparia.mod.Entity.AI.EntityAIBaseAttack;

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
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityPenguin extends EntityMob
{  
    
    public EntityPenguin(World world)
    {
        super(world);
        this.setSize(0.9F, 1.0F);
    }

    public int penguinId = 2;
    public int counter = 0;
    
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
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(6.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0D);

    }

    
    
    protected EntityPenguin createInstance()
    {
        return new EntityPenguin(this.world);
    }
    
    @Override
    public void onDeath(DamageSource cause)
    {
        super.onDeath(cause);
            
    	if(cause.getTrueSource() instanceof EntityPlayer)
        {
    		if(!world.isRemote)
    		{
    			int i = this.penguinId;
    			  int j = 2 + this.rand.nextInt(3);

    	            for (int k = 0; k < j; ++k)
    	            {
    	                float f = ((float)(k % 2) - 0.5F) * (float)i / 4.0F;
    	                float f1 = ((float)(k / 2) - 0.5F) * (float)i / 4.0F;
    	                EntityPenguin entitypenguin = this.createInstance();

    	                if (this.hasCustomName())
    	                {
    	                    entitypenguin.setCustomNameTag(this.getCustomNameTag());
    	                }

    	                if (this.isNoDespawnRequired())
    	                {
    	                    entitypenguin.enablePersistence();
    	                }
    	                entitypenguin.setLocationAndAngles(this.posX + (double)f, this.posY + 0.5D, this.posZ + (double)f1, this.rand.nextFloat() * 360.0F, 0.0F);
    	                this.world.spawnEntity(entitypenguin);
    	                this.counter++;
    	                entitypenguin.counter = this.counter;
    	            }
    	        	if(counter == 20)
    	    		{
    	    			EntityReaper reaper = new EntityReaper(world);
    	    			reaper.setPosition(posX, posY, posZ);
    	    			world.spawnEntity(reaper);	
    	    		}
    		} 
    	
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
