package com.croparia.mod.Item.Relique;

import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemInfiniteApple extends ItemFood
{

	public ItemInfiniteApple() {
		super(6, 1.8F, false);
		this.func_77637_a(CreativeTabsRegistry.MOD_BLOCK);
	}
	
	@Override
	 public ItemStack func_77654_b(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        if (entityLiving instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
            entityplayer.func_71024_bL().func_151686_a(this, stack);
            worldIn.func_184148_a((EntityPlayer)null, entityplayer.field_70165_t, entityplayer.field_70163_u, entityplayer.field_70161_v, SoundEvents.field_187739_dZ, SoundCategory.PLAYERS, 0.5F, worldIn.field_73012_v.nextFloat() * 0.1F + 0.9F);
            this.func_77849_c(stack, worldIn, entityplayer);
            entityplayer.func_71029_a(StatList.func_188057_b(this));

            if (entityplayer instanceof EntityPlayerMP)
            {
                CriteriaTriggers.field_193138_y.func_193148_a((EntityPlayerMP)entityplayer, stack);
            }
        }
        return stack;
    }
    
}
