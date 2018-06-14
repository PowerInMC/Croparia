package com.croparia.mod.Block.Spawn;

import com.croparia.mod.Entity.Golem.EntityFireBoss;
import com.croparia.mod.Entity.Golem.EntityLavaBoss;
import com.croparia.mod.Entity.Golem.EntityObsidianBoss;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockFirebossSpawn  extends Block{


	public BlockFirebossSpawn(String name) {
		super(Material.PLANTS);
		setUnlocalizedName(name);
		setSoundType(SoundType.PLANT);
	}

	
	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		if(!worldIn.isRemote)
		{
			
			switch (worldIn.provider.getDimension())
			{
				case 0: 
					EntityFireBoss e = new EntityFireBoss(worldIn);
					e.setPosition(pos.getX(), pos.getY(), pos.getZ());
					worldIn.spawnEntity(e);
					break;
				case 5: 
					EntityObsidianBoss f = new EntityObsidianBoss(worldIn);
					f.setPosition(pos.getX(), pos.getY(), pos.getZ());
					worldIn.spawnEntity(f);
					break;
				case 7: 
					EntityLavaBoss g = new EntityLavaBoss(worldIn);
					g.setPosition(pos.getX(), pos.getY(), pos.getZ());
					worldIn.spawnEntity(g);
					break;
				
			}
		
		}
	}
}
