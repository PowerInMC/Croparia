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
		super(Material.field_151576_e);
		func_149663_c(name);
		func_149672_a(SoundType.field_185858_k);
		
	}

	
	@Override
	public void func_176206_d(World worldIn, BlockPos pos, IBlockState state) {
		if(!worldIn.field_72995_K)
		{
			EntityReaper e = new EntityReaper(worldIn);

			e.func_70107_b(pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
			e.func_174805_g(true);
			e.func_96094_a("The Reaper");
			Minecraft.func_71410_x().field_71439_g.func_71165_d("The Reaper appears !");
			worldIn.func_72838_d(e);
		
		}
	}
	
	@Override
	public boolean func_149686_d(IBlockState state) {
		return false;
	}
	
	public boolean func_149662_c(IBlockState state) {
		return false;
	}
}
