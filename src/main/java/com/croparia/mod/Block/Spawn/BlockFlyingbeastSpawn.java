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
		super(Material.PLANTS);
		setUnlocalizedName(name);
		setSoundType(SoundType.PLANT);
	}

	
	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		if(!worldIn.isRemote)
		{
			EntityFlying e = new EntityFlying(worldIn);

			e.setPosition(pos.getX(), pos.getY(), pos.getZ());
			e.setCustomNameTag("Flying Beast");

			worldIn.spawnEntity(e);
		
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) 
	{
		super.randomDisplayTick(stateIn, worldIn, pos, rand);

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



                            worldIn.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, (double)pos.getX() + 0.5D, (double)pos.getY() + 2.0D, (double)pos.getZ() + 0.5D, (double)((float)i + rand.nextFloat()) - 0.5D, (double)((float)k - rand.nextFloat() - 3.0F), (double)((float)j + rand.nextFloat()) - 0.5D, new int[0]);
                    }
                    
                
            }
        }
	}

}
