package com.croparia.mod.World.WorldGen.Generator;

import java.util.Random;

import com.croparia.mod.Block.BlockObsidianGround;
import com.croparia.mod.Init.BlockMod;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ObsidianGroundGenerator extends WorldGenerator
{

	private final IBlockState obsiidanGroundState;
	
    public ObsidianGroundGenerator()
    {
    	 this.obsiidanGroundState = BlockMod.obsidian_ground.getDefaultState();
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        for (IBlockState iblockstate = worldIn.getBlockState(position); (iblockstate.getBlock().isAir(iblockstate, worldIn, position) || iblockstate.getBlock().isLeaves(iblockstate, worldIn, position)) && position.getY() > 0; iblockstate = worldIn.getBlockState(position))
        {
            position = position.down();
        }

        for (int i = 0; i < 128; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (worldIn.isAirBlock(blockpos) && ((BlockObsidianGround)BlockMod.obsidian_ground).canBlockStay(worldIn, blockpos, this.obsiidanGroundState))
            {
                worldIn.setBlockState(blockpos, this.obsiidanGroundState, 2);
            }
        }

        return true;
    }
}