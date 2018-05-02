package com.croparia.mod.Item.Tool;

import java.util.Set;

import com.croparia.mod.Reference;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class MultitoolEarth extends ItemMultitool 
{
	private static final Set<Block> WORK_ON = Sets.newHashSet(new Block[] {Blocks.DIRT, Blocks.GRASS, Blocks.GRAVEL, Blocks.SAND, Blocks.SANDSTONE, Blocks.HARDENED_CLAY, Blocks.LOG, Blocks.LOG2, Blocks.COBBLESTONE, Blocks.MOSSY_COBBLESTONE, Blocks.STONE, Blocks.PLANKS, Blocks.DOUBLE_STONE_SLAB, Blocks.ICE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RED_SANDSTONE, Blocks.STONE_SLAB, Blocks.CLAY, Blocks.FARMLAND, Blocks.MYCELIUM, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH});
	

	public MultitoolEarth(float damage, float speed, ToolMaterial material)
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
	            if (hook != 0) 
	            {
	            	return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;
	            }
	            
	            IBlockState iblockstate = playerIn.getBlockState(worldIn);
	            Block block = iblockstate.getBlock();
	            
	            if (block != Blocks.BEDROCK)
        		{
	            	if (block == Blocks.DIRT || block == Blocks.GRASS || block ==  Blocks.GRAVEL || block ==  Blocks.SAND || block ==  Blocks.SANDSTONE || block ==  Blocks.HARDENED_CLAY || block ==  Blocks.LOG || block ==  Blocks.LOG2 || block ==  Blocks.COBBLESTONE || block ==  Blocks.MOSSY_COBBLESTONE || block ==  Blocks.STONE || block ==  Blocks.PLANKS || block ==  Blocks.DOUBLE_STONE_SLAB || block ==  Blocks.ICE || block ==  Blocks.NETHERRACK || block ==  Blocks.PACKED_ICE || block ==  Blocks.RED_SANDSTONE || block ==  Blocks.STONE_SLAB || block ==  Blocks.CLAY || block ==  Blocks.FARMLAND || block ==  Blocks.MYCELIUM || block ==  Blocks.SNOW || block ==  Blocks.SNOW_LAYER || block ==  Blocks.SOUL_SAND || block ==  Blocks.GRASS_PATH)
	            		if (hand == EnumFacing.EAST)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.east(), playerIn.getBlockState(worldIn));
	            			stack.attackEntityFrom(DamageSource.MAGIC, 4.0F);
            			
	            		}
	            		else if (hand == EnumFacing.WEST)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.west(), playerIn.getBlockState(worldIn));
	            			stack.attackEntityFrom(DamageSource.MAGIC, 4.0F);
	            			return EnumActionResult.SUCCESS;  
	            		}
	            		else if (hand == EnumFacing.SOUTH)
	            		{
	            				this.setBlock(itemstack, stack, playerIn, worldIn.south(), playerIn.getBlockState(worldIn));
	            				stack.attackEntityFrom(DamageSource.MAGIC, 4.0F);
	            				return EnumActionResult.SUCCESS;  
	            		}
	            		else if (hand == EnumFacing.NORTH)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.north(), playerIn.getBlockState(worldIn));
	            			stack.attackEntityFrom(DamageSource.MAGIC, 4.0F);
	            			return EnumActionResult.SUCCESS;  
	            		}
	            		else  if (hand == EnumFacing.UP)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.up(), playerIn.getBlockState(worldIn));
	            			stack.attackEntityFrom(DamageSource.MAGIC, 4.0F);
	            			return EnumActionResult.SUCCESS;  
	            		} 
	            		else  if (hand == EnumFacing.DOWN)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.down(), playerIn.getBlockState(worldIn));
	            			stack.attackEntityFrom(DamageSource.MAGIC, 4.0F);
	            			return EnumActionResult.SUCCESS;  
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
