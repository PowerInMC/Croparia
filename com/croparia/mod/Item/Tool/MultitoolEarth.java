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
	private static final Set<Block> WORK_ON = Sets.newHashSet(new Block[] {Blocks.field_150346_d, Blocks.field_150349_c, Blocks.field_150351_n, Blocks.field_150354_m, Blocks.field_150322_A, Blocks.field_150405_ch, Blocks.field_150364_r, Blocks.field_150363_s, Blocks.field_150347_e, Blocks.field_150341_Y, Blocks.field_150348_b, Blocks.field_150344_f, Blocks.field_150334_T, Blocks.field_150432_aD, Blocks.field_150424_aL, Blocks.field_150403_cj, Blocks.field_180395_cM, Blocks.field_150333_U, Blocks.field_150435_aG, Blocks.field_150458_ak, Blocks.field_150391_bh, Blocks.field_150433_aE, Blocks.field_150431_aC, Blocks.field_150425_aM, Blocks.field_185774_da});
	

	public MultitoolEarth(float damage, float speed, ToolMaterial material)
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
	            if (hook != 0) 
	            {
	            	return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;
	            }
	            
	            IBlockState iblockstate = playerIn.func_180495_p(worldIn);
	            Block block = iblockstate.func_177230_c();
	            
	            if (block != Blocks.field_150357_h)
        		{
	            	if (block == Blocks.field_150346_d || block == Blocks.field_150349_c || block ==  Blocks.field_150351_n || block ==  Blocks.field_150354_m || block ==  Blocks.field_150322_A || block ==  Blocks.field_150405_ch || block ==  Blocks.field_150364_r || block ==  Blocks.field_150363_s || block ==  Blocks.field_150347_e || block ==  Blocks.field_150341_Y || block ==  Blocks.field_150348_b || block ==  Blocks.field_150344_f || block ==  Blocks.field_150334_T || block ==  Blocks.field_150432_aD || block ==  Blocks.field_150424_aL || block ==  Blocks.field_150403_cj || block ==  Blocks.field_180395_cM || block ==  Blocks.field_150333_U || block ==  Blocks.field_150435_aG || block ==  Blocks.field_150458_ak || block ==  Blocks.field_150391_bh || block ==  Blocks.field_150433_aE || block ==  Blocks.field_150431_aC || block ==  Blocks.field_150425_aM || block ==  Blocks.field_185774_da)
	            		if (hand == EnumFacing.EAST)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.func_177974_f(), playerIn.func_180495_p(worldIn));
	            			stack.func_70097_a(DamageSource.field_76376_m, 4.0F);
            			
	            		}
	            		else if (hand == EnumFacing.WEST)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.func_177976_e(), playerIn.func_180495_p(worldIn));
	            			stack.func_70097_a(DamageSource.field_76376_m, 4.0F);
	            			return EnumActionResult.SUCCESS;  
	            		}
	            		else if (hand == EnumFacing.SOUTH)
	            		{
	            				this.setBlock(itemstack, stack, playerIn, worldIn.func_177968_d(), playerIn.func_180495_p(worldIn));
	            				stack.func_70097_a(DamageSource.field_76376_m, 4.0F);
	            				return EnumActionResult.SUCCESS;  
	            		}
	            		else if (hand == EnumFacing.NORTH)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.func_177978_c(), playerIn.func_180495_p(worldIn));
	            			stack.func_70097_a(DamageSource.field_76376_m, 4.0F);
	            			return EnumActionResult.SUCCESS;  
	            		}
	            		else  if (hand == EnumFacing.UP)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.func_177984_a(), playerIn.func_180495_p(worldIn));
	            			stack.func_70097_a(DamageSource.field_76376_m, 4.0F);
	            			return EnumActionResult.SUCCESS;  
	            		} 
	            		else  if (hand == EnumFacing.DOWN)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.func_177977_b(), playerIn.func_180495_p(worldIn));
	            			stack.func_70097_a(DamageSource.field_76376_m, 4.0F);
	            			return EnumActionResult.SUCCESS;  
	            		}
	        		
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
