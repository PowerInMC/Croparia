package com.croparia.mod.Item.Tool;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.minecraft.item.Item.ToolMaterial;

public class MultitoolAir extends ItemMultitool 
{

	public MultitoolAir(float damage, float speed, ToolMaterial material)
	{
		super(damage, speed, material);
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
	            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

	            IBlockState iblockstate = playerIn.func_180495_p(worldIn);
	            Block block = iblockstate.func_177230_c();
	            
	            		if (block != Blocks.field_150357_h)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.field_150350_a.func_176223_P());
		            		stack.func_70097_a(DamageSource.field_76376_m, 4.0F);
	            			return EnumActionResult.SUCCESS;          
	            		}
	                
	                       
	        }
		}
		
		if (!stack.func_175151_a(worldIn.func_177972_a(hand), hand, itemstack))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, stack, playerIn, worldIn);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

            IBlockState iblockstate = playerIn.func_180495_p(worldIn);
            Block block = iblockstate.func_177230_c();

            if (hand != EnumFacing.DOWN && playerIn.func_175623_d(worldIn.func_177984_a()))
            {
                if (block == Blocks.field_150349_c || block == Blocks.field_185774_da)
                {
                    this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.field_150458_ak.func_176223_P());
                    return EnumActionResult.SUCCESS;
                }

                if (block == Blocks.field_150346_d)
                {
                    switch ((BlockDirt.DirtType)iblockstate.func_177229_b(BlockDirt.field_176386_a))
                    {
                        case DIRT:
                            this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.field_150458_ak.func_176223_P());
                            return EnumActionResult.SUCCESS;
                        case COARSE_DIRT:
                            this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.field_150346_d.func_176223_P().func_177226_a(BlockDirt.field_176386_a, BlockDirt.DirtType.DIRT));
                            return EnumActionResult.SUCCESS;
                        case PODZOL:
                        	break;
         
                    }
                }
            }

        }
		return EnumActionResult.PASS;	
	}

}
