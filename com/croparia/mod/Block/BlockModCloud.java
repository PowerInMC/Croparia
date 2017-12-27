package com.croparia.mod.Block;

import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockModCloud extends BlockGlass
{

	public BlockModCloud(String name) {
		super(Material.field_151592_s, true);
		this.func_149663_c(name);
		this.func_149647_a(CreativeTabsRegistry.MOD_BLOCK);
	}

	@Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer func_180664_k()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
	
	@Override
	public AxisAlignedBB func_185496_a(IBlockState state, IBlockAccess source, BlockPos pos) {
		// TODO Auto-generated method stub
		return Blocks.field_150413_aR.func_185496_a(state, source, pos);
	}
	
	
	@Override
	public boolean func_149662_c(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean func_149751_l(IBlockState state) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
    public boolean func_149686_d(IBlockState state)
    {
        return false;
    }
}
