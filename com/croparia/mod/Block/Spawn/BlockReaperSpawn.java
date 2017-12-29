package com.croparia.mod.Block.Spawn;

import java.util.Random;

import com.croparia.mod.Entity.EntityFlying;
import com.croparia.mod.Entity.EntityReaper;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockReaperSpawn  extends Block{


	public BlockReaperSpawn(String name) {
		super(Material.ROCK);
		setUnlocalizedName(name);
		setSoundType(SoundType.ANVIL);
		
	}

	
	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		if(!worldIn.isRemote)
		{
			EntityReaper e = new EntityReaper(worldIn);

			e.setPosition(pos.getX(), pos.getY(), pos.getZ());
			e.setAlwaysRenderNameTag(true);
			e.setCustomNameTag("The Reaper");
			Minecraft.getMinecraft().player.sendChatMessage("The Reaper appears !");
			worldIn.spawnEntity(e);
		
		}
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
}
