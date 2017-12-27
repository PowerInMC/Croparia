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
		if(!field_145850_b.field_72995_K)
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
		Minecraft.func_71410_x().field_71439_g.func_71165_d("Rewards Have Been Reset");
		Minecraft.func_71410_x().field_71439_g.func_71165_d("You can get the first Reward");
	}
	
	public void getCounter()
	{
		Minecraft.func_71410_x().field_71439_g.func_71165_d("te date :" + dateCounter);
	}
	
	public boolean less()
	{
		if(!field_145850_b.field_72995_K)
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
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.seed_crop_coal)));
			useYet = true;
		}
		else if(dateChecker+1 == dateCounter)
		{
			for(int i = 0;i<=1;i++)
			{
				field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.seed_crop_iron)));
			}
			useYet = true;
		}
		else if(dateChecker+2 == dateCounter)
		{
			for(int i = 0;i<=2;i++)
			{
				field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.seed_crop_gold)));
			}
			useYet = true;
		}
		else if(dateChecker+3 == dateCounter)
		{
			for(int i = 0;i<=3;i++)
			{
				field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.seed_crop_redstone)));
			}
			useYet = true;
		}
		else if(dateChecker+4 == dateCounter)
		{
			for(int i = 0;i<=3;i++)
			{
				field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.seed_crop_lapis)));	
			}
			useYet = true;
		}
		else if(dateChecker+5 == dateCounter)
		{
			for(int i = 0;i<=3;i++)
			{
				field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.seed_crop_diamond)));
			}
			useYet = true;
		}
		else if(dateChecker+6 == dateCounter)
		{
			for(int i = 0;i<=3;i++)
			{
				field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.seed_crop_emerald)));
			}
			useYet = true;
		}
		else if(dateChecker+7 == dateCounter)
		{
			for(int i = 0;i<=3;i++)
			{
				field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.elemental_seed)));
			}
			useYet = true;
		}
		else if(dateChecker+8 == dateCounter)
		{
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_mob)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_natural)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_monster)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.elemental_water)));

			useYet = true;
			
		}
		else if(dateChecker+9 == dateCounter)
		{
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_mob)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_natural)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_monster)));
			for(int i = 0;i<=3;i++)
			{
				field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.elemental_water)));
			}
			useYet = true;
	
			
		}
		else if(dateChecker+10 == dateCounter)
		{
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_mob)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_natural)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_monster)));
			for(int i = 0;i<=3;i++)
			{
				field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.elemental_earth)));
			}
			useYet = true;
	
			
		}
		else if(dateChecker+11 == dateCounter)
		{
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_mob)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_natural)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_monster)));
			for(int i = 0;i<=3;i++)
			{
				field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.elemental_fire)));
			}
			useYet = true;
			
		}
		else if(dateChecker+12 == dateCounter)
		{
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_mob)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_natural)));
			field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.fruit_start_monster)));
			for(int i = 0;i<=3;i++)
			{
				field_145850_b.func_72838_d(new EntityItem(field_145850_b, field_174879_c.func_177958_n()+0.5, field_174879_c.func_177956_o()+1, field_174879_c.func_177952_p()+0.5, new ItemStack(ItemMod.elemental_air)));
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
	public NBTTagCompound func_189515_b(NBTTagCompound compound) {
		super.func_189515_b(compound);
		compound.func_74768_a("date", dateCounter);
		compound.func_74768_a("checker", dateChecker);
		compound.func_74757_a("yet", useYet);
		return compound;
	}
	
	@Override
	public void func_145839_a(NBTTagCompound compound) {
		super.func_145839_a(compound);
		dateCounter = compound.func_74762_e("date");
		dateChecker = compound.func_74762_e("checker");
		useYet = compound.func_74767_n("yet");
	}
}
