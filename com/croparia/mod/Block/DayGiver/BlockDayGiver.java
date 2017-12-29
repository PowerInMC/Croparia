package com.croparia.mod.Block.DayGiver;

import java.util.Date;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockDayGiver extends Block implements ITileEntityProvider{

	public BlockDayGiver(String name) {
		super(Material.IRON);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
		setHardness(5F);
		setResistance(10F);
	}
	
	public int date = new Date().getYear() + new Date().getMonth() + new Date().getDay();
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
	{
		if(!worldIn.isRemote)
		{
			TileEntity te = worldIn.getTileEntity(pos);
			if(te instanceof TileEntityDayGiver)
			{
				MinecraftServer sender;
				TileEntityDayGiver giver = (TileEntityDayGiver)te;
				if(this.date == giver.dateCounter)
				{
					giver.give();
					giver.more();
					Minecraft.getMinecraft().player.sendChatMessage("Come Back Tomorrow For Another Reward");
				}
				else if(date > giver.dateCounter)
				{
					giver.resetAll();
				}
				else if(date < giver.dateCounter)
				{
					Minecraft.getMinecraft().player.sendChatMessage("You already had your reward, come back tomorrow");
				}		
			}

		}
		return true;
	}
	

	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) 
	{
	//	worldIn.spawnEntity(new EntityItem(worldIn, pos.getX()+0.5, pos.getY()+0.5, pos.getZ()+0.5, new ItemStack(BlockMod.reward)));
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return new TileEntityDayGiver();
	}
}
