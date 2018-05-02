package com.croparia.mod.Block.DayGiver;

import java.util.Date;

import com.croparia.mod.Init.ItemMod;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityDayGiver extends TileEntity
{
	public int dateCounter = new Date().getYear() + new Date().getMonth() + new Date().getDay();
	public int dateChecker = new Date().getYear() + new Date().getMonth() + new Date().getDay();
	public boolean useYet;
	
	public boolean more()
	{
		if(!world.isRemote)
		{
			dateCounter++;
			return true;
		}
		return false;
	}
	
	public void resetCounter()
	{
		dateCounter = new Date().getYear() + new Date().getMonth() + new Date().getDay();
	}
	
	public void resetChecker()
	{
		dateChecker = new Date().getYear() + new Date().getMonth() + new Date().getDay();
	}
	
	
	public void resetAll()
	{
		resetCounter();
		resetChecker();
		Minecraft.getMinecraft().player.sendChatMessage("Rewards Have Been Reset");
		Minecraft.getMinecraft().player.sendChatMessage("You can get the first Reward");
	}
	
	public void getCounter()
	{
		Minecraft.getMinecraft().player.sendChatMessage("te date :" + dateCounter);
	}
	
	public boolean less()
	{
		if(!world.isRemote)
		{
			dateCounter--;
			return true;
		}
		return false;
	}
	
	public void give()
	{
		if(dateChecker == dateCounter)
		{
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.seed_crop_coal)));
			useYet = true;
		}
		else if(dateChecker+1 == dateCounter)
		{
			for(int i = 0;i<=1;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.seed_crop_iron)));
			}
			useYet = true;
		}
		else if(dateChecker+2 == dateCounter)
		{
			for(int i = 0;i<=2;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.seed_crop_gold)));
			}
			useYet = true;
		}
		else if(dateChecker+3 == dateCounter)
		{
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.seed_crop_redstone)));
			}
			useYet = true;
		}
		else if(dateChecker+4 == dateCounter)
		{
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.seed_crop_lapis)));	
			}
			useYet = true;
		}
		else if(dateChecker+5 == dateCounter)
		{
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.seed_crop_diamond)));
			}
			useYet = true;
		}
		else if(dateChecker+6 == dateCounter)
		{
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.seed_crop_emerald)));
			}
			useYet = true;
		}
		else if(dateChecker+7 == dateCounter)
		{
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.elemental_seed)));
			}
			useYet = true;
		}
		else if(dateChecker+8 == dateCounter)
		{
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_mob)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_natural)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_monster)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.elemental_water)));

			useYet = true;
			
		}
		else if(dateChecker+9 == dateCounter)
		{
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_mob)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_natural)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_monster)));
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.elemental_water)));
			}
			useYet = true;
	
			
		}
		else if(dateChecker+10 == dateCounter)
		{
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_mob)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_natural)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_monster)));
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.elemental_earth)));
			}
			useYet = true;
	
			
		}
		else if(dateChecker+11 == dateCounter)
		{
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_mob)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_natural)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_monster)));
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.elemental_fire)));
			}
			useYet = true;
			
		}
		else if(dateChecker+12 == dateCounter)
		{
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_mob)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_natural)));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.fruit_start_monster)));
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(ItemMod.elemental_air)));
			}
			useYet = true;
			resetAll();
		}
		else if(useYet = false)
		{
			resetAll();
		}
	}
		
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setInteger("date", dateCounter);
		compound.setInteger("checker", dateChecker);
		compound.setBoolean("yet", useYet);
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		dateCounter = compound.getInteger("date");
		dateChecker = compound.getInteger("checker");
		useYet = compound.getBoolean("yet");
	}
}
