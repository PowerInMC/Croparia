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

public class MultitoolFire extends ItemMultitool 
{

	public MultitoolFire(float damage, float speed, ToolMaterial material)
	{
		super(damage, speed, material);
	}
    
	public EnumActionResult onItemUse(EntityPlayer stack, World playerIn, BlockPos worldIn, EnumHand pos, EnumFacing hand, float facing, float hitX, float hitY) 
	{
		ItemStack itemstack = stack.getHeldItem(pos);
		
		if(stack.isSneaking() == true)
		{
			if (!stack.canPlayerEdit(worldIn.offset(hand), hand, itemstack))
	        {
	            return EnumActionResult.FAIL;
	        }
	        else
	        {
	            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, stack, playerIn, worldIn);
	            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

	            IBlockState iblockstate = playerIn.getBlockState(worldIn);
	            Block block = iblockstate.getBlock();

	            if (hand != EnumFacing.DOWN)
	            {
	            	if(playerIn.getBlockState(worldIn.up()).getBlock() == Blocks.LAVA || playerIn.getBlockState(worldIn.up()).getBlock() == Blocks.AIR)
	            	{
	            		if (block == Blocks.GRASS || block == Blocks.STONE || block == Blocks.DIRT || block == Blocks.SAND  || block == Blocks.GRAVEL || block == Blocks.SANDSTONE || block == Blocks.HARDENED_CLAY )
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.LAVA.getDefaultState());
		            		stack.attackEntityFrom(DamageSource.MAGIC, 4.0F);
	            			return EnumActionResult.SUCCESS;          
	            		}
	                }
	            	if(playerIn.getBlockState(worldIn).getBlock() == Blocks.OBSIDIAN ||playerIn.getBlockState(worldIn).getBlock() == Blocks.NETHERRACK)
	            	{
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.up(), Blocks.FIRE.getDefaultState());
		            		stack.attackEntityFrom(DamageSource.MAGIC, 4.0F);
	            			return EnumActionResult.SUCCESS;
	            		}
	            	}
	            }            
	        }
		}
		
		if (!stack.canPlayerEdit(worldIn.offset(hand), hand, itemstack))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, stack, playerIn, worldIn);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

            IBlockState iblockstate = playerIn.getBlockState(worldIn);
            Block block = iblockstate.getBlock();

            if (hand != EnumFacing.DOWN && playerIn.isAirBlock(worldIn.up()))
            {
                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
                {
                    this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.FARMLAND.getDefaultState());
                    return EnumActionResult.SUCCESS;
                }

                if (block == Blocks.DIRT)
                {
                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
                    {
                        case DIRT:
                            this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.FARMLAND.getDefaultState());
                            return EnumActionResult.SUCCESS;
                        case COARSE_DIRT:
                            this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
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
