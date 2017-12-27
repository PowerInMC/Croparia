package com.croparia.mod.Block.Harvester;

import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockHarvester extends Block implements ITileEntityProvider{

	public BlockHarvester(String name) {
		super(Material.field_151573_f);
		this.func_149663_c(name);
		this.func_149647_a(CreativeTabsRegistry.MOD_BLOCK);
	}
	
	World worldIn = Minecraft.func_71410_x().field_71441_e;
	
	@Override
	public void func_176213_c(World worldIn, BlockPos pos, IBlockState state) 
	{
		if(worldIn.func_180495_p(pos.func_177977_b()).func_177230_c().func_176223_P() != Blocks.field_150355_j.func_176223_P())
		{
			System.out.print("This Block Need A Water Source Under It");
		}
	}
	
	@Override
	public void onNeighborChange(IBlockAccess world, BlockPos pos, BlockPos neighbor) 
	{
		if(!worldIn.field_72995_K)
		{
			TileEntity te = worldIn.func_175625_s(pos);
			if(te instanceof TileEntityHarvester)
			{
				TileEntityHarvester harvester = (TileEntityHarvester)te;
				harvester.run();
			}
		}
	}

	@Override
	public TileEntity func_149915_a(World worldIn, int meta) 
	{
		return new TileEntityHarvester();
	}

}
