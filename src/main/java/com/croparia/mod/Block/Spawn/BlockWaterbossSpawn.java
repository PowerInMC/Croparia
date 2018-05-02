package com.croparia.mod.Block.Spawn;

import com.croparia.mod.Entity.EntityFlying;
import com.croparia.mod.Entity.Golem.EntityIcyBoss;
import com.croparia.mod.Entity.Golem.EntitySteamBoss;
import com.croparia.mod.Entity.Golem.EntityWaterBoss;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockWaterbossSpawn  extends Block{


	public BlockWaterbossSpawn(String name) {
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
					EntityWaterBoss e = new EntityWaterBoss(worldIn);
					e.setPosition(pos.getX(), pos.getY(), pos.getZ());
					worldIn.spawnEntity(e);
					break;
				case 5: 
					EntityIcyBoss f = new EntityIcyBoss(worldIn);
					f.setPosition(pos.getX(), pos.getY(), pos.getZ());
					worldIn.spawnEntity(f);
					break;
				case 6: 
					EntitySteamBoss g = new EntitySteamBoss(worldIn);
					g.setPosition(pos.getX(), pos.getY(), pos.getZ());
					worldIn.spawnEntity(g);
					break;
				
			}
		
		}
	}
}
