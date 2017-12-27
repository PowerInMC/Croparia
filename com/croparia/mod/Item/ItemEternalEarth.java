package com.croparia.mod.Item;

import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemEternalEarth extends Item 
{
	public ItemEternalEarth(String name)
	{
		super();
		func_77655_b(name);
		func_77637_a(CreativeTabsRegistry.MOD_BLOCK);
		setRegistryName(name);
        func_77625_d(1);
        func_77642_a(this);
	}
	
	@Override
	public void func_77663_a(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) 
	{		
		entityIn.func_70031_b(true);
	}	
	
	public EnumActionResult func_180614_a(EntityPlayer stack, World playerIn, BlockPos worldIn, EnumHand pos, EnumFacing hand, float facing, float hitX, float hitY) 
	{
		ItemStack itemstack = stack.func_184586_b(pos);
		
		if(stack.func_70093_af() == true)
		{
			if (!stack.func_175151_a(worldIn.func_177972_a(hand), hand, itemstack))
	        {
	            return EnumActionResult.FAIL;
	        }
	        else
	        {
	            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, stack, playerIn, worldIn);
	            if (hook != 0) 
	            {
	            	return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;
	            }
	            
	            IBlockState iblockstate = playerIn.func_180495_p(worldIn);
	            Block block = iblockstate.func_177230_c();
	            
	            if (block != Blocks.field_150357_h || playerIn.func_180495_p(worldIn) != Blocks.field_150450_ax.func_176223_P() || playerIn.func_180495_p(worldIn) != Blocks.field_150439_ay.func_176223_P() || playerIn.func_180495_p(worldIn) != Blocks.field_150366_p.func_176223_P() || playerIn.func_180495_p(worldIn) != Blocks.field_150352_o.func_176223_P() || playerIn.func_180495_p(worldIn) != Blocks.field_150482_ag.func_176223_P() || playerIn.func_180495_p(worldIn) != Blocks.field_150365_q.func_176223_P() || playerIn.func_180495_p(worldIn) != Blocks.field_150449_bY.func_176223_P() || playerIn.func_180495_p(worldIn) != Blocks.field_150369_x.func_176223_P() || playerIn.func_180495_p(worldIn) != Blocks.field_150412_bA.func_176223_P())
        		{
	            		if (hand == EnumFacing.EAST)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.func_177974_f(), playerIn.func_180495_p(worldIn));
	            			return EnumActionResult.SUCCESS;  
            			
	            		}
	            		else if (hand == EnumFacing.WEST)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.func_177976_e(), playerIn.func_180495_p(worldIn));
	            			return EnumActionResult.SUCCESS;  
	            		}
	            		else if (hand == EnumFacing.SOUTH)
	            		{
	            				this.setBlock(itemstack, stack, playerIn, worldIn.func_177968_d(), playerIn.func_180495_p(worldIn));
	            				return EnumActionResult.SUCCESS;  
	            		}
	            		else if (hand == EnumFacing.NORTH)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.func_177978_c(), playerIn.func_180495_p(worldIn));
	            			return EnumActionResult.SUCCESS;  
	            		}
	            		else  if (hand == EnumFacing.UP)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.func_177984_a(), playerIn.func_180495_p(worldIn));
	            			return EnumActionResult.SUCCESS;  
	            		} 
	            		else  if (hand == EnumFacing.DOWN)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.func_177977_b(), playerIn.func_180495_p(worldIn));
	            			return EnumActionResult.SUCCESS;  
	            		}
	        		
	            }  
	        }
		
		}
		
		
		return EnumActionResult.PASS;	
	}
	
    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
    {
        worldIn.func_184133_a(player, pos, SoundEvents.field_187520_aJ, SoundCategory.BLOCKS, 2.0F, 2.0F);

        if (!worldIn.field_72995_K)
        {
            worldIn.func_180501_a(pos, state, 11);
            stack.func_77972_a(1, player);
        }
    }

	
}
