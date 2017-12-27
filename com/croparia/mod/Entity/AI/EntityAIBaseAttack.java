package com.croparia.mod.Entity.AI;

import com.croparia.mod.Entity.EntityCentaur;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.monster.EntityZombie;

public class EntityAIBaseAttack extends EntityAIAttackMelee
{

    public EntityAIBaseAttack(EntityCreature creature, double speedIn, boolean useLongMemory)
    {
        super(creature, speedIn, useLongMemory);
    }
  
 
}
