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
		super(Material.IRON);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
	}
	
	World worldIn = Minecraft.getMinecraft().world;
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) 
	{
		if(worldIn.getBlockState(pos.down()).getBlock().getDefaultState() != Blocks.WATER.getDefaultState())
		{
			System.out.print("This Block Need A Water Source Under It");
		}
	}
	
	@Override
	public void onNeighborChange(IBlockAccess world, BlockPos pos, BlockPos neighbor) 
	{
		if(!worldIn.isRemote)
		{
			TileEntity te = worldIn.getTileEntity(pos);
			if(te instanceof TileEntityHarvester)
			{
				TileEntityHarvester harvester = (TileEntityHarvester)te;
				harvester.run();
			}
		}
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return new TileEntityHarvester();
	}

}
