package com.croparia.mod.Block.Cane;

import java.util.Random;

import com.croparia.mod.Entity.EntityCentaur;
import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockReed;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CaneSand extends BlockReed
{

	public Block onIt = Blocks.field_150354_m;
	
	public CaneSand(String name) 
	{
		super();
		func_149663_c(name);
		func_149672_a(SoundType.field_185850_c);
	}


	
	@Override
	public Item func_180660_a(IBlockState state, Random rand, int fortune) 
	{
		return Item.func_150898_a(BlockMod.block_cane_sand);
	}
	
	@Override
	public ItemStack func_185473_a(World worldIn, BlockPos pos, IBlockState state)
	{
		return new ItemStack(Item.func_150898_a(BlockMod.block_cane_sand));
	}
	
	@Override
	public boolean func_176196_c(World worldIn, BlockPos pos)
    {
        IBlockState state = worldIn.func_180495_p(pos.func_177977_b());
        Block block = state.func_177230_c();
        if (block.canSustainPlant(state, worldIn, pos.func_177977_b(), EnumFacing.UP, this)) return true;

        if (block == this)
        {
            return true;
        }
        else if (block != onIt)
        {
            return false;
        }
        else
        {
            BlockPos blockpos = pos.func_177977_b();

            for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
            {
                IBlockState iblockstate = worldIn.func_180495_p(blockpos.func_177972_a(enumfacing));

                if (iblockstate.func_185904_a() == Material.field_151586_h || iblockstate.func_177230_c() == Blocks.field_185778_de)
                {
                    return true;
                }
            }

            return false;
        }
    }
}
