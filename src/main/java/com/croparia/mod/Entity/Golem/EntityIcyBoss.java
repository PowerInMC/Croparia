package com.croparia.mod.Entity.Golem;

import com.croparia.mod.Init.ItemMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityIcyBoss extends EntityGolem
{

	public EntityIcyBoss(World world) {
		super(world);
	}
	
	 @Override
	    public void onDeath(DamageSource cause) {
	        super.onDeath(cause);
	    	if(cause.getTrueSource() instanceof EntityPlayer)
	    	{
	    		this.dropItem(ItemMod.icy_crane, 1);
	    	}
	    }

}
