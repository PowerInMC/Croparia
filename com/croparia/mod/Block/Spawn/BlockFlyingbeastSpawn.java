package com.croparia.mod.Block.Spawn;

import java.util.Random;

import com.croparia.mod.Entity.EntityFlying;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFlyingbeastSpawn  extends Block{


	public BlockFlyingbeastSpawn(String name) {
		super(Material.field_151585_k);
		func_149663_c(name);
		func_149672_a(SoundType.field_185850_c);
	}

	
	@Override
	public void func_176206_d(World worldIn, BlockPos pos, IBlockState state) {
		if(!worldIn.field_72995_K)
		{
			EntityFlying e = new EntityFlying(worldIn);

			e.func_70107_b(pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
			e.func_96094_a("Flying Beast");

			worldIn.func_72838_d(e);
		
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void func_180655_c(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) 
	{
		super.func_180655_c(stateIn, worldIn, pos, rand);

        for (int i = -2; i <= 2; ++i)
        {
            for (int j = -2; j <= 2; ++j)
            {
                if (i > -2 && i < 2 && j == -1)
                {
                    j = 2;
                }


                    for (int k = 0; k <= 1; ++k)
                    {



                            worldIn.func_175688_a(EnumParticleTypes.ENCHANTMENT_TABLE, (double)pos.func_177958_n() + 0.5D, (double)pos.func_177956_o() + 2.0D, (double)pos.func_177952_p() + 0.5D, (double)((float)i + rand.nextFloat()) - 0.5D, (double)((float)k - rand.nextFloat() - 3.0F), (double)((float)j + rand.nextFloat()) - 0.5D, new int[0]);
                    }
                    
                
            }
        }
	}

}
