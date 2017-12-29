package com.croparia.mod.Block.Ghost;

import java.util.Random;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockRitualGhost extends Block{
	
	private int i = 0;
	
	public BlockRitualGhost() {
		super(Material.GROUND);
		setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
	{
		if(!worldIn.isRemote)
		{	
			if(i <= 3)
				i++;
			if(i > 3)
				i = 1;
			if(i == 1)
				Minecraft.getMinecraft().player.sendChatMessage("First Ritual");
			if(i == 2)
				Minecraft.getMinecraft().player.sendChatMessage("Second Ritual");
			if(i == 3)
				Minecraft.getMinecraft().player.sendChatMessage("Death Ritual");
		}
		return true;
	}
	
	@SideOnly(Side.CLIENT)
   @Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isTranslucent(IBlockState state) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
	
	
	
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
		{
		IBlockState soulsand = BlockMod.ghost_soulsand.getDefaultState();
		IBlockState andesite = BlockMod.ghost_andesite.getDefaultState();
		IBlockState polished_andesite = BlockMod.ghost_polished_andesite.getDefaultState();
		IBlockState elemental = BlockMod.ghost_elemental_cobble.getDefaultState();
		IBlockState elementalstone = BlockMod.ghost_elementalstone.getDefaultState();
		IBlockState slab = BlockMod.ghost_slabstone.getDefaultState();
		IBlockState lave = BlockMod.ghost_lava.getDefaultState();
		IBlockState waterliquid = BlockMod.ghost_waterliquid.getDefaultState();
		IBlockState plant = BlockMod.ghost_death.getStateFromMeta(7);
		IBlockState cropredstone = BlockMod.ghost_redstone.getStateFromMeta(7);
		IBlockState cropelemental = BlockMod.ghost_cropelemental.getStateFromMeta(7);
		IBlockState nether = BlockMod.ghost_nether.getDefaultState();
		IBlockState nethers = BlockMod.ghost_slabnether.getDefaultState();
		IBlockState nethersu = BlockMod.ghost_slabnetherup.getDefaultState();
		IBlockState magma = BlockMod.ghost_magma.getDefaultState();
		IBlockState air = BlockMod.ghost_air.getDefaultState();
		IBlockState fire = BlockMod.ghost_fire.getDefaultState();
		IBlockState earth = BlockMod.ghost_earth.getDefaultState();
		IBlockState water = BlockMod.ghost_water.getDefaultState();
		IBlockState cropiron = BlockMod.ghost_cropiron.getDefaultState();
		IBlockState cropgold = BlockMod.ghost_cropgold.getDefaultState();
		IBlockState diorite = BlockMod.ghost_diorite.getDefaultState();
		
			if(i == 1 && entityIn instanceof EntityPlayer && worldIn.isRemote)
			{
				if(worldIn.getBlockState(pos.down()) != BlockMod.elemental_cobblestone.getDefaultState())
					worldIn.setBlockState(pos.down(), elemental);
				
				if(worldIn.getBlockState(pos.north().east()) != BlockMod.block_crop_iron.getStateFromMeta(7))
					worldIn.setBlockState(pos.north().east(), cropiron);
				if(worldIn.getBlockState(pos.north().west()) != BlockMod.block_crop_iron.getStateFromMeta(7))
					worldIn.setBlockState(pos.north().west(), cropiron);
				if(worldIn.getBlockState(pos.south().east()) != BlockMod.block_crop_iron.getStateFromMeta(7))
					worldIn.setBlockState(pos.south().east(), cropiron);
				if(worldIn.getBlockState(pos.south().west()) != BlockMod.block_crop_iron.getStateFromMeta(7))
					worldIn.setBlockState(pos.south().west(), cropiron);
					
				if(worldIn.getBlockState(pos.north(3)) != BlockMod.block_crop_gold.getStateFromMeta(7))	
					worldIn.setBlockState(pos.north(3), cropgold);
				if(worldIn.getBlockState(pos.south(3)) != BlockMod.block_crop_gold.getStateFromMeta(7))
					worldIn.setBlockState(pos.south(3), cropgold);
				if(worldIn.getBlockState(pos.east(3)) != BlockMod.block_crop_gold.getStateFromMeta(7))
					worldIn.setBlockState(pos.east(3), cropgold);
				if(worldIn.getBlockState(pos.west(3)) != BlockMod.block_crop_gold.getStateFromMeta(7))
					worldIn.setBlockState(pos.west(3), cropgold);
					
				if(worldIn.getBlockState(pos.down().north(2).west(2)) != Blocks.WATER.getDefaultState())
					worldIn.setBlockState(pos.down().north(2).west(2), waterliquid);
				if(worldIn.getBlockState(pos.down().north(2).east(2)) != Blocks.WATER.getDefaultState())
					worldIn.setBlockState(pos.down().north(2).east(2), waterliquid);
				if(worldIn.getBlockState(pos.down().south(2).west(2)) != Blocks.WATER.getDefaultState())
					worldIn.setBlockState(pos.down().south(2).west(2), waterliquid);
				if(worldIn.getBlockState(pos.down().south(2).east(2)) != Blocks.WATER.getDefaultState())
					worldIn.setBlockState(pos.down().south(2).east(2), waterliquid);
					
				if(worldIn.getBlockState(pos.north(4).east()) != Blocks.STONE.getStateFromMeta(3))
					worldIn.setBlockState(pos.north(4).east(), diorite);
				if(worldIn.getBlockState(pos.north(4).west()) != Blocks.STONE.getStateFromMeta(3))
					worldIn.setBlockState(pos.north(4).west(), diorite);
				if(worldIn.getBlockState(pos.south(4).east()) != Blocks.STONE.getStateFromMeta(3))
					worldIn.setBlockState(pos.south(4).east(), diorite);
				if(worldIn.getBlockState(pos.south(4).west()) != Blocks.STONE.getStateFromMeta(3))
					worldIn.setBlockState(pos.south(4).west(), diorite);
				if(worldIn.getBlockState(pos.west(4).north()) != Blocks.STONE.getStateFromMeta(3))
					worldIn.setBlockState(pos.west(4).north(), diorite);
				if(worldIn.getBlockState(pos.west(4).south()) != Blocks.STONE.getStateFromMeta(3))
					worldIn.setBlockState(pos.west(4).south(), diorite);
				if(worldIn.getBlockState(pos.east(4).north()) != Blocks.STONE.getStateFromMeta(3))
					worldIn.setBlockState(pos.east(4).north(), diorite);
				if(worldIn.getBlockState(pos.east(4).south()) != Blocks.STONE.getStateFromMeta(3))
					worldIn.setBlockState(pos.east(4).south(), diorite);
					
				if(worldIn.getBlockState(pos.north(3).east(3)) != Blocks.STONE.getStateFromMeta(5))
					worldIn.setBlockState(pos.north(3).east(3), andesite);
				if(worldIn.getBlockState(pos.north(3).west(3)) != Blocks.STONE.getStateFromMeta(5))
					worldIn.setBlockState(pos.north(3).west(3), andesite);
				if(worldIn.getBlockState(pos.south(3).east(3)) != Blocks.STONE.getStateFromMeta(5))
					worldIn.setBlockState(pos.south(3).east(3), andesite);
				if(worldIn.getBlockState(pos.south(3).west(3)) != Blocks.STONE.getStateFromMeta(5))
					worldIn.setBlockState(pos.south(3).west(3), andesite);
				if(worldIn.getBlockState(pos.up().west(3).north(3)) != Blocks.STONE.getStateFromMeta(5))
					worldIn.setBlockState(pos.up().west(3).north(3), andesite);
				if(worldIn.getBlockState(pos.up().west(3).south(3)) != Blocks.STONE.getStateFromMeta(5))
					worldIn.setBlockState(pos.up().west(3).south(3), andesite);
				if(worldIn.getBlockState(pos.up().east(3).north(3)) != Blocks.STONE.getStateFromMeta(5))
					worldIn.setBlockState(pos.up().east(3).north(3), andesite);
				if(worldIn.getBlockState(pos.up().east(3).south(3)) != Blocks.STONE.getStateFromMeta(5))
					worldIn.setBlockState(pos.up().east(3).south(3), andesite);
			
			}
			
			if(i == 2 && entityIn instanceof EntityPlayer && worldIn.isRemote)
			{	
				if(worldIn.getBlockState(pos.down()) != BlockMod.elemental_cobblestone.getDefaultState())
					worldIn.setBlockState(pos.down(), elemental);
				if(worldIn.getBlockState(pos.down().north()) != BlockMod.elemental_stone.getDefaultState()) 
					worldIn.setBlockState(pos.down().north(), elementalstone);
				if(worldIn.getBlockState(pos.down().south()) != BlockMod.elemental_stone.getDefaultState()) 
					worldIn.setBlockState(pos.down().south(), elementalstone);
				if(worldIn.getBlockState(pos.down().east())  != BlockMod.elemental_stone.getDefaultState()) 
					worldIn.setBlockState(pos.down().east(), elementalstone);
				if(worldIn.getBlockState(pos.down().west())  != BlockMod.elemental_stone.getDefaultState())						
					worldIn.setBlockState(pos.down().west(), elementalstone);
				
				if(worldIn.getBlockState(pos.north(5)) != BlockMod.block_crop_redstone.getStateFromMeta(7))
					worldIn.setBlockState(pos.north(5), cropredstone);
				if(worldIn.getBlockState(pos.south(5)) != BlockMod.block_crop_redstone.getStateFromMeta(7))
					worldIn.setBlockState(pos.south(5), cropredstone);
				if(worldIn.getBlockState(pos.east(5))  != BlockMod.block_crop_redstone.getStateFromMeta(7))
					worldIn.setBlockState(pos.east(5), cropredstone);
				if(worldIn.getBlockState(pos.west(5))  != BlockMod.block_crop_redstone.getStateFromMeta(7))	
					worldIn.setBlockState(pos.west(5), cropredstone);
				
				if(worldIn.getBlockState(pos.north(3).west(3)) != BlockMod.elemental_crop.getStateFromMeta(7))
					worldIn.setBlockState(pos.north(3).west(3), cropelemental);
				if(worldIn.getBlockState(pos.north(3).east(3)) != BlockMod.elemental_crop.getStateFromMeta(7))
					worldIn.setBlockState(pos.north(3).east(3), cropelemental);
				if(worldIn.getBlockState(pos.south(3).west(3))  != BlockMod.elemental_crop.getStateFromMeta(7))
					worldIn.setBlockState(pos.south(3).west(3), cropelemental);
				if(worldIn.getBlockState(pos.south(3).east(3))  != BlockMod.elemental_crop.getStateFromMeta(7))
					worldIn.setBlockState(pos.south(3).east(3), cropelemental);
				
				if(worldIn.getBlockState(pos.down().north(4).west()) != Blocks.WATER.getDefaultState())
					worldIn.setBlockState(pos.down().north(4).west(), waterliquid);
				if(worldIn.getBlockState(pos.down().north(4).east()) != Blocks.WATER.getDefaultState())
					worldIn.setBlockState(pos.down().north(4).east(), waterliquid);
				if(worldIn.getBlockState(pos.down().south(4).west())  != Blocks.WATER.getDefaultState())
					worldIn.setBlockState(pos.down().south(4).west(), waterliquid);
				if(worldIn.getBlockState(pos.down().south(4).east())  != Blocks.WATER.getDefaultState())
					worldIn.setBlockState(pos.down().south(4).east(), waterliquid);
				
				
				if(worldIn.getBlockState(pos.down().west(4).north()) != Blocks.WATER.getDefaultState())
					worldIn.setBlockState(pos.down().west(4).north(), waterliquid);
				if(worldIn.getBlockState(pos.down().west(4).south()) != Blocks.WATER.getDefaultState())
					worldIn.setBlockState(pos.down().west(4).south(), waterliquid);
				if(worldIn.getBlockState(pos.down().east(4).north())  != Blocks.WATER.getDefaultState())
					worldIn.setBlockState(pos.down().east(4).north(), waterliquid);
				if(worldIn.getBlockState(pos.down().east(4).south())  != Blocks.WATER.getDefaultState())
					worldIn.setBlockState(pos.down().east(4).south(), waterliquid);
				
				
				if(worldIn.getBlockState(pos.north(4).west(4)) != Blocks.STONE.getStateFromMeta(6)) 
					worldIn.setBlockState(pos.north(4).west(4), polished_andesite);
				if(worldIn.getBlockState(pos.up().north(4).west(4)) != BlockMod.elemental_stone.getDefaultState()) 
					worldIn.setBlockState(pos.up().north(4).west(4), elementalstone);
				if(worldIn.getBlockState(pos.up(2).north(4).west(4)) != Blocks.STONE.getStateFromMeta(6))
					worldIn.setBlockState(pos.up(2).north(4).west(4), polished_andesite);
			
				
				if(worldIn.getBlockState(pos.north(4).east(4)) != Blocks.STONE.getStateFromMeta(6)) 
					worldIn.setBlockState(pos.north(4).east(4), polished_andesite);
				if(worldIn.getBlockState(pos.up().north(4).east(4)) != BlockMod.elemental_stone.getDefaultState()) 
					worldIn.setBlockState(pos.up().north(4).east(4), elementalstone);
				if(worldIn.getBlockState(pos.up(2).north(4).east(4)) != Blocks.STONE.getStateFromMeta(6))
					worldIn.setBlockState(pos.up(2).north(4).east(4), polished_andesite);
				
				
				if(worldIn.getBlockState(pos.south(4).west(4)) != Blocks.STONE.getStateFromMeta(6)) 
					worldIn.setBlockState(pos.south(4).west(4), polished_andesite);
				if(worldIn.getBlockState(pos.up().south(4).west(4)) != BlockMod.elemental_stone.getDefaultState()) 
					worldIn.setBlockState(pos.up().south(4).west(4), elementalstone);
				if(worldIn.getBlockState(pos.up(2).south(4).west(4)) != Blocks.STONE.getStateFromMeta(6))
					worldIn.setBlockState(pos.up(2).south(4).west(4), polished_andesite);
				
				
				if(worldIn.getBlockState(pos.south(4).east(4)) != Blocks.STONE.getStateFromMeta(6)) 
					worldIn.setBlockState(pos.south(4).east(4), polished_andesite);
				if(worldIn.getBlockState(pos.up().south(4).east(4)) != BlockMod.elemental_stone.getDefaultState()) 
					worldIn.setBlockState(pos.up().south(4).east(4), elementalstone);
				if(worldIn.getBlockState(pos.up(2).south(4).east(4)) != Blocks.STONE.getStateFromMeta(6))
					worldIn.setBlockState(pos.up(2).south(4).east(4), polished_andesite);
				
				
				if(worldIn.getBlockState(pos.north(5).east(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.north(5).east(2), andesite);
				if(worldIn.getBlockState(pos.north(5).west(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.north(5).west(2), andesite);
				if(worldIn.getBlockState(pos.up().north(5).east(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up().north(5).east(2), andesite);
				if(worldIn.getBlockState(pos.up().north(5).west(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up().north(5).west(2), andesite);
				if(worldIn.getBlockState(pos.up(2).north(5).east(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(2).north(5).east(2), andesite);
				if(worldIn.getBlockState(pos.up(2).north(5).west(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(2).north(5).west(2), andesite);
				if(worldIn.getBlockState(pos.up(3).north(5).east(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).north(5).east(2), andesite);
				if(worldIn.getBlockState(pos.up(3).north(5).west(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).north(5).west(2), andesite);
				if(worldIn.getBlockState(pos.up(3).north(5).east()) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).north(5).east(), andesite);
				if(worldIn.getBlockState(pos.up(3).north(5).west()) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).north(5).west(), andesite);
				if(worldIn.getBlockState(pos.up(3).north(5)) != BlockMod.water_block.getDefaultState())
					worldIn.setBlockState(pos.up(3).north(5), water);
				
				
				if(worldIn.getBlockState(pos.south(5).east(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.south(5).east(2), andesite);
				if(worldIn.getBlockState(pos.south(5).west(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.south(5).west(2), andesite);
				if(worldIn.getBlockState(pos.up().south(5).east(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up().south(5).east(2), andesite);
				if(worldIn.getBlockState(pos.up().south(5).west(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up().south(5).west(2), andesite);
				if(worldIn.getBlockState(pos.up(2).south(5).east(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(2).south(5).east(2), andesite);
				if(worldIn.getBlockState(pos.up(2).south(5).west(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(2).south(5).west(2), andesite);
				if(worldIn.getBlockState(pos.up(3).south(5).east(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).south(5).east(2), andesite);
				if(worldIn.getBlockState(pos.up(3).south(5).west(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).south(5).west(2), andesite);
				if(worldIn.getBlockState(pos.up(3).south(5).east()) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).south(5).east(), andesite);
				if(worldIn.getBlockState(pos.up(3).south(5).west()) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).south(5).west(), andesite);
				if(worldIn.getBlockState(pos.up(3).south(5)) != BlockMod.fire_block.getDefaultState())
					worldIn.setBlockState(pos.up(3).south(5), fire);

				if(worldIn.getBlockState(pos.west(5).north(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.west(5).north(2), andesite);
				if(worldIn.getBlockState(pos.west(5).south(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.west(5).south(2), andesite);
				if(worldIn.getBlockState(pos.up().west(5).north(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up().west(5).north(2), andesite);
				if(worldIn.getBlockState(pos.up().west(5).south(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up().west(5).south(2), andesite);
				if(worldIn.getBlockState(pos.up(2).west(5).north(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(2).west(5).north(2), andesite);
				if(worldIn.getBlockState(pos.up(2).west(5).south(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(2).west(5).south(2), andesite);
				if(worldIn.getBlockState(pos.up(3).west(5).north(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).west(5).north(2), andesite);
				if(worldIn.getBlockState(pos.up(3).west(5).south(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).west(5).south(2), andesite);
				if(worldIn.getBlockState(pos.up(3).west(5).north()) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).west(5).north(), andesite);
				if(worldIn.getBlockState(pos.up(3).west(5).south()) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).west(5).south(), andesite);
				if(worldIn.getBlockState(pos.up(3).west(5)) != BlockMod.earth_block.getDefaultState())
					worldIn.setBlockState(pos.up(3).west(5), earth);
					
				if(worldIn.getBlockState(pos.east(5).north(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.east(5).north(2), andesite);
				if(worldIn.getBlockState(pos.east(5).south(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.east(5).south(2), andesite);
				if(worldIn.getBlockState(pos.up().east(5).north(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up().east(5).north(2), andesite);
				if(worldIn.getBlockState(pos.up().east(5).south(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up().east(5).south(2), andesite);
				if(worldIn.getBlockState(pos.up(2).east(5).north(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(2).east(5).north(2), andesite);
				if(worldIn.getBlockState(pos.up(2).east(5).south(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(2).east(5).south(2), andesite);
				if(worldIn.getBlockState(pos.up(3).east(5).north(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).east(5).north(2), andesite);
				if(worldIn.getBlockState(pos.up(3).east(5).south(2)) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).east(5).south(2), andesite);
				if(worldIn.getBlockState(pos.up(3).east(5).north()) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).east(5).north(), andesite);
				if(worldIn.getBlockState(pos.up(3).east(5).south()) != Blocks.STONE.getStateFromMeta(5)) 
					worldIn.setBlockState(pos.up(3).east(5).south(), andesite);
				if(worldIn.getBlockState(pos.up(3).east(5)) != BlockMod.air_block.getDefaultState())
					worldIn.setBlockState(pos.up(3).east(5), air);
			}
			if(i == 3 && entityIn instanceof EntityPlayer && worldIn.isRemote)
			{


				if(worldIn.getBlockState(pos.down()) != BlockMod.elemental_cobblestone.getDefaultState())
					worldIn.setBlockState(pos.down(), elemental);	
				if(worldIn.getBlockState(pos.down().north(2)) != Blocks.SOUL_SAND.getDefaultState())
					worldIn.setBlockState(pos.down().north(2), soulsand);
				if(worldIn.getBlockState(pos.down().south(2)) != Blocks.SOUL_SAND.getDefaultState())
					worldIn.setBlockState(pos.down().south(2), soulsand);
				if(worldIn.getBlockState(pos.down().east(2)) != Blocks.SOUL_SAND.getDefaultState())
					worldIn.setBlockState(pos.down().east(2), soulsand);   
				if(worldIn.getBlockState(pos.down().west(2)) != Blocks.SOUL_SAND.getDefaultState())
					worldIn.setBlockState(pos.down().west(2), soulsand);   
				if(worldIn.getBlockState(pos.down().north().west()) != Blocks.SOUL_SAND.getDefaultState())
					worldIn.setBlockState(pos.down().north().west(), soulsand);   
				if(worldIn.getBlockState(pos.down().north().east()) != Blocks.SOUL_SAND.getDefaultState())
					worldIn.setBlockState(pos.down().north().east(), soulsand);
				if(worldIn.getBlockState(pos.down().south().west()) != Blocks.SOUL_SAND.getDefaultState())   
					worldIn.setBlockState(pos.down().south().west(), soulsand); 
				if(worldIn.getBlockState(pos.down().south().east()) != Blocks.SOUL_SAND.getDefaultState())  
					worldIn.setBlockState(pos.down().south().east(), soulsand);
				if(worldIn.getBlockState(pos.north()) != Blocks.STONE_SLAB.getStateFromMeta(3))
					worldIn.setBlockState(pos.north(), slab);   			
				if(worldIn.getBlockState(pos.south()) != Blocks.STONE_SLAB.getStateFromMeta(3))
					worldIn.setBlockState(pos.south(), slab); 	
				if(worldIn.getBlockState(pos.east()) != Blocks.STONE_SLAB.getStateFromMeta(3))
					worldIn.setBlockState(pos.east(), slab);  
				if(worldIn.getBlockState(pos.west()) != Blocks.STONE_SLAB.getStateFromMeta(3))
					worldIn.setBlockState(pos.west(), slab);
				if(worldIn.getBlockState(pos.down().north(4).west()) != Blocks.LAVA.getDefaultState())  
					worldIn.setBlockState(pos.down().north(4).west(), lave);   
				if(worldIn.getBlockState(pos.down().north(4).east()) != Blocks.LAVA.getDefaultState())  
					worldIn.setBlockState(pos.down().north(4).east(), lave);
				if(worldIn.getBlockState(pos.down().south(4).west()) != Blocks.LAVA.getDefaultState())  
					worldIn.setBlockState(pos.down().south(4).west(), lave);  
				if(worldIn.getBlockState(pos.down().south(4).east()) != Blocks.LAVA.getDefaultState())  
					worldIn.setBlockState(pos.down().south(4).east(), lave);
				if(worldIn.getBlockState(pos.down().east(4).south()) != Blocks.LAVA.getDefaultState())  
					worldIn.setBlockState(pos.down().east(4).south(), lave);   
				if(worldIn.getBlockState(pos.down().east(4).north()) != Blocks.LAVA.getDefaultState())  
					worldIn.setBlockState(pos.down().east(4).north(), lave);
				if(worldIn.getBlockState(pos.down().west(4).south()) != Blocks.LAVA.getDefaultState())  
					worldIn.setBlockState(pos.down().west(4).south(), lave);   
				if(worldIn.getBlockState(pos.down().west(4).north()) != Blocks.LAVA.getDefaultState())  
					worldIn.setBlockState(pos.down().west(4).north(), lave);
				for(int i = 0; i < 7; i++)
				{
					if(worldIn.getBlockState(pos.north(5).east()) != BlockMod.block_crop_death.getStateFromMeta(i))
					    worldIn.setBlockState(pos.north(5).east(), plant);  			
					if(worldIn.getBlockState(pos.north(5).west()) != BlockMod.block_crop_death.getStateFromMeta(i))
					    worldIn.setBlockState(pos.north(5).west(), plant); 			
					if(worldIn.getBlockState(pos.north(5)) != BlockMod.block_crop_death.getStateFromMeta(i))
					    worldIn.setBlockState(pos.north(5), plant);		
					if(worldIn.getBlockState(pos.south(5).west()) != BlockMod.block_crop_death.getStateFromMeta(i))
					    worldIn.setBlockState(pos.south(5).west(), plant);			
					if(worldIn.getBlockState(pos.south(5).east()) != BlockMod.block_crop_death.getStateFromMeta(i))
					    worldIn.setBlockState(pos.south(5).east(), plant); 			
					if(worldIn.getBlockState(pos.south(5)) != BlockMod.block_crop_death.getStateFromMeta(i))
					    worldIn.setBlockState(pos.south(5), plant);			
					if(worldIn.getBlockState(pos.east(5).south()) != BlockMod.block_crop_death.getStateFromMeta(i))
					    worldIn.setBlockState(pos.east(5).south(), plant);   				
					if(worldIn.getBlockState(pos.east(5).north()) != BlockMod.block_crop_death.getStateFromMeta(i))
					    worldIn.setBlockState(pos.east(5).north(), plant);  			
					if(worldIn.getBlockState(pos.east(5)) != BlockMod.block_crop_death.getStateFromMeta(i))
						worldIn.setBlockState(pos.east(5), plant);				
					if(worldIn.getBlockState(pos.west(5).south()) != BlockMod.block_crop_death.getStateFromMeta(i))
					    worldIn.setBlockState(pos.west(5).south(), plant);  			
					if(worldIn.getBlockState(pos.west(5).north()) != BlockMod.block_crop_death.getStateFromMeta(i))
					    worldIn.setBlockState(pos.west(5).north(), plant);  		
					if(worldIn.getBlockState(pos.west(5)) != BlockMod.block_crop_death.getStateFromMeta(i))
					    worldIn.setBlockState(pos.west(5), plant);
				}
				
				if(worldIn.getBlockState(pos.north(4).east(4)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.north(4).east(4), nether); 			
				if(worldIn.getBlockState(pos.north(4).east(4).up()) != BlockMod.elemental_cobblestone.getDefaultState())
					worldIn.setBlockState(pos.north(4).east(4).up(), elemental); 		
				if(worldIn.getBlockState(pos.north(4).east(4).up(2)) != BlockMod.elemental_cobblestone.getDefaultState())
				    worldIn.setBlockState(pos.north(4).east(4).up(2), elemental); 		
				if(worldIn.getBlockState(pos.north(4).east(4).up(3)) != Blocks.STONE_SLAB.getStateFromMeta(6))
					worldIn.setBlockState(pos.north(4).east(4).up(3), nethers);	
				if(worldIn.getBlockState(pos.south(4).east(4)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.south(4).east(4), nether);  				
				if(worldIn.getBlockState(pos.south(4).east(4).up()) != BlockMod.elemental_cobblestone.getDefaultState())
				    worldIn.setBlockState(pos.south(4).east(4).up(), elemental); 				
				if(worldIn.getBlockState(pos.south(4).east(4).up(2)) != BlockMod.elemental_cobblestone.getDefaultState())
					worldIn.setBlockState(pos.south(4).east(4).up(2), elemental); 				
				if(worldIn.getBlockState(pos.south(4).east(4).up(3)) != Blocks.STONE_SLAB.getStateFromMeta(6))
					worldIn.setBlockState(pos.south(4).east(4).up(3), nethers);				
				if(worldIn.getBlockState(pos.north(4).west(4)) != Blocks.NETHER_BRICK.getDefaultState())
					worldIn.setBlockState(pos.north(4).west(4), nether);  				
				if(worldIn.getBlockState(pos.north(4).west(4).up()) != BlockMod.elemental_cobblestone.getDefaultState())
					worldIn.setBlockState(pos.north(4).west(4).up(), elemental);				
				if(worldIn.getBlockState(pos.north(4).west(4).up(2)) != BlockMod.elemental_cobblestone.getDefaultState())  
				    worldIn.setBlockState(pos.north(4).west(4).up(2), elemental);				
				if(worldIn.getBlockState(pos.north(4).west(4).up(3)) != Blocks.STONE_SLAB.getStateFromMeta(6))
					worldIn.setBlockState(pos.north(4).west(4).up(3), nethers);			
				if(worldIn.getBlockState(pos.south(4).west(4)) != Blocks.NETHER_BRICK.getDefaultState())
					worldIn.setBlockState(pos.south(4).west(4), nether);  			
				if(worldIn.getBlockState(pos.south(4).west(4).up()) != BlockMod.elemental_cobblestone.getDefaultState())
					worldIn.setBlockState(pos.south(4).west(4).up(), elemental);   			
				if(worldIn.getBlockState(pos.south(4).west(4).up(2)) != BlockMod.elemental_cobblestone.getDefaultState())
				    worldIn.setBlockState(pos.south(4).west(4).up(2), elemental);   			
				if(worldIn.getBlockState(pos.south(4).west(4).up(3)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.south(4).west(4).up(3), nethers);
				
				if(worldIn.getBlockState(pos.north(5).east(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.north(5).east(2), nether);	
				if(worldIn.getBlockState(pos.north(5).east(2).up()) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.north(5).east(2).up(), nether);		
				if(worldIn.getBlockState(pos.north(5).east(2).up(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.north(5).east(2).up(2), nether);		
				if(worldIn.getBlockState(pos.north(5).east(2).up(3)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.north(5).east(2).up(3), nether);			
				if(worldIn.getBlockState(pos.north(5).east(2).up(4)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.north(5).east(2).up(4), nethers);		
				if(worldIn.getBlockState(pos.north(5).west(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.north(5).west(2), nether);			
				if(worldIn.getBlockState(pos.north(5).west(2).up()) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.north(5).west(2).up(), nether);			
				if(worldIn.getBlockState(pos.north(5).west(2).up(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.north(5).west(2).up(2), nether);
				if(worldIn.getBlockState(pos.north(5).west(2).up(3)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.north(5).west(2).up(3), nether);
				if(worldIn.getBlockState(pos.north(5).west(2).up(4)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.north(5).west(2).up(4), nethers);
				if(worldIn.getBlockState(pos.north(5).east(1).up()) != Blocks.STONE_SLAB.getStateFromMeta(14))
				    worldIn.setBlockState(pos.north(5).east(1).up(), nethersu);
				if(worldIn.getBlockState(pos.north(5).east(1).up(2)) != Blocks.MAGMA.getDefaultState())
				    worldIn.setBlockState(pos.north(5).east(1).up(2), magma);
				if(worldIn.getBlockState(pos.north(5).east(1).up(3)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.north(5).east(1).up(3), nethers);
				if(worldIn.getBlockState(pos.north(5).east(1).up(4)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.north(5).east(1).up(4), nether);
				if(worldIn.getBlockState(pos.north(5).east(1).up(5)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.north(5).east(1).up(5), nether);
				if(worldIn.getBlockState(pos.north(5).east(1).up(6)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.north(5).east(1).up(6), nether);
				if(worldIn.getBlockState(pos.north(5).west(1).up()) != Blocks.STONE_SLAB.getStateFromMeta(14))
				    worldIn.setBlockState(pos.north(5).west(1).up(), nethersu);
				if(worldIn.getBlockState(pos.north(5).west(1).up(2)) != Blocks.MAGMA.getDefaultState())
					worldIn.setBlockState(pos.north(5).west(1).up(2), magma);
				if(worldIn.getBlockState(pos.north(5).west().up(3)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.north(5).west(1).up(3), nethers);
				if(worldIn.getBlockState(pos.north(5).west().up(4)) != Blocks.NETHER_BRICK.getDefaultState())
					worldIn.setBlockState(pos.north(5).west(1).up(4), nether);
				if(worldIn.getBlockState(pos.north(5).west().up(5)) != Blocks.NETHER_BRICK.getDefaultState())
					worldIn.setBlockState(pos.north(5).west(1).up(5), nether);
				if(worldIn.getBlockState(pos.north(5).west(1).up(6)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.north(5).west(1).up(6), nether);
				if(worldIn.getBlockState(pos.north(5).up(5)) != Blocks.STONE_SLAB.getStateFromMeta(14))
					worldIn.setBlockState(pos.north(5).up(5), nethersu);
				if(worldIn.getBlockState(pos.north(5).up(6)) != Blocks.MAGMA.getDefaultState())
				    worldIn.setBlockState(pos.north(5).up(6), magma);
				if(worldIn.getBlockState(pos.north(5).up(7)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.north(5).up(7), nethers);
				
				if(worldIn.getBlockState(pos.south(5).east(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.south(5).east(2), nether);	
				if(worldIn.getBlockState(pos.south(5).east(2).up()) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.south(5).east(2).up(), nether);		
				if(worldIn.getBlockState(pos.south(5).east(2).up(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.south(5).east(2).up(2), nether);		
				if(worldIn.getBlockState(pos.south(5).east(2).up(3)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.south(5).east(2).up(3), nether);			
				if(worldIn.getBlockState(pos.south(5).east(2).up(4)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.south(5).east(2).up(4), nethers);		
				if(worldIn.getBlockState(pos.south(5).west(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.south(5).west(2), nether);			
				if(worldIn.getBlockState(pos.south(5).west(2).up()) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.south(5).west(2).up(), nether);			
				if(worldIn.getBlockState(pos.south(5).west(2).up(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.south(5).west(2).up(2), nether);
				if(worldIn.getBlockState(pos.south(5).west(2).up(3)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.south(5).west(2).up(3), nether);
				if(worldIn.getBlockState(pos.south(5).west(2).up(4)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.south(5).west(2).up(4), nethers);
				if(worldIn.getBlockState(pos.south(5).east(1).up()) != Blocks.STONE_SLAB.getStateFromMeta(14))
				    worldIn.setBlockState(pos.south(5).east(1).up(), nethersu);
				if(worldIn.getBlockState(pos.south(5).east(1).up(2)) != Blocks.MAGMA.getDefaultState())
				    worldIn.setBlockState(pos.south(5).east(1).up(2), magma);
				if(worldIn.getBlockState(pos.south(5).east(1).up(3)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.south(5).east(1).up(3), nethers);
				if(worldIn.getBlockState(pos.south(5).east(1).up(4)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.south(5).east(1).up(4), nether);
				if(worldIn.getBlockState(pos.south(5).east(1).up(5)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.south(5).east(1).up(5), nether);
				if(worldIn.getBlockState(pos.south(5).east(1).up(6)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.south(5).east(1).up(6), nether);
				if(worldIn.getBlockState(pos.south(5).west(1).up()) != Blocks.STONE_SLAB.getStateFromMeta(14))
				    worldIn.setBlockState(pos.south(5).west(1).up(), nethersu);
				if(worldIn.getBlockState(pos.south(5).west(1).up(2)) != Blocks.MAGMA.getDefaultState())
				worldIn.setBlockState(pos.south(5).west(1).up(2), magma);
				if(worldIn.getBlockState(pos.south(5).west().up(3)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.south(5).west(1).up(3), nethers);
				if(worldIn.getBlockState(pos.south(5).west().up(4)) != Blocks.NETHER_BRICK.getDefaultState())
				worldIn.setBlockState(pos.south(5).west(1).up(4), nether);
				if(worldIn.getBlockState(pos.south(5).west().up(5)) != Blocks.NETHER_BRICK.getDefaultState())
				worldIn.setBlockState(pos.south(5).west(1).up(5), nether);
				if(worldIn.getBlockState(pos.south(5).west(1).up(6)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.south(5).west(1).up(6), nether);
				if(worldIn.getBlockState(pos.south(5).up(5)) != Blocks.STONE_SLAB.getStateFromMeta(14))
				worldIn.setBlockState(pos.south(5).up(5), nethersu);
				if(worldIn.getBlockState(pos.south(5).up(6)) != Blocks.MAGMA.getDefaultState())
				    worldIn.setBlockState(pos.south(5).up(6), magma);
				if(worldIn.getBlockState(pos.south(5).up(7)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.south(5).up(7), nethers);
				
				if(worldIn.getBlockState(pos.east(5).north(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.east(5).north(2), nether);	
				if(worldIn.getBlockState(pos.east(5).north(2).up()) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.east(5).north(2).up(), nether);
				if(worldIn.getBlockState(pos.east(5).north(2).up(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.east(5).north(2).up(2), nether);
				if(worldIn.getBlockState(pos.east(5).north(2).up(3)) != Blocks.NETHER_BRICK.getDefaultState())
				worldIn.setBlockState(pos.east(5).north(2).up(3), nether);
				if(worldIn.getBlockState(pos.east(5).north(2).up(4)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.east(5).north(2).up(4), nethers);
				if(worldIn.getBlockState(pos.east(5).south(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.east(5).south(2), nether);
				if(worldIn.getBlockState(pos.east(5).south(2).up()) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.east(5).south(2).up(), nether);
				if(worldIn.getBlockState(pos.east(5).south(2).up(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.east(5).south(2).up(2), nether);
				if(worldIn.getBlockState(pos.east(5).south(2).up(3)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.east(5).south(2).up(3), nether);
				if(worldIn.getBlockState(pos.east(5).south(2).up(4)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.east(5).south(2).up(4), nethers);
				if(worldIn.getBlockState(pos.east(5).north().up()) != Blocks.STONE_SLAB.getStateFromMeta(14))
				    worldIn.setBlockState(pos.east(5).north(1).up(), nethersu);
				if(worldIn.getBlockState(pos.east(5).north().up(2)) != Blocks.MAGMA.getDefaultState())
				    worldIn.setBlockState(pos.east(5).north(1).up(2), magma);
				if(worldIn.getBlockState(pos.east(5).north().up(3)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.east(5).north(1).up(3), nethers);
				if(worldIn.getBlockState(pos.east(5).north().up(4)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.east(5).north(1).up(4), nether);
				if(worldIn.getBlockState(pos.east(5).north().up(5)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.east(5).north(1).up(5), nether);
				if(worldIn.getBlockState(pos.east(5).north().up(6)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.east(5).north(1).up(6), nether);
				if(worldIn.getBlockState(pos.east(5).south().up()) != Blocks.STONE_SLAB.getStateFromMeta(14))
				    worldIn.setBlockState(pos.east(5).south(1).up(), nethersu);
				if(worldIn.getBlockState(pos.east(5).south().up(2)) != Blocks.MAGMA.getDefaultState())
				    worldIn.setBlockState(pos.east(5).south(1).up(2), magma);
				if(worldIn.getBlockState(pos.east(5).south().up(3)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.east(5).south(1).up(3), nethers);
				if(worldIn.getBlockState(pos.east(5).south().up(4)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.east(5).south(1).up(4), nether);
				if(worldIn.getBlockState(pos.east(5).south(2).up(5)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.east(5).south(1).up(5), nether);
				if(worldIn.getBlockState(pos.east(5).south(2).up(6)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.east(5).south(1).up(6), nether);
				if(worldIn.getBlockState(pos.east(5).up(5)) != Blocks.STONE_SLAB.getStateFromMeta(14))
				    worldIn.setBlockState(pos.east(5).up(5), nethersu);
				if(worldIn.getBlockState(pos.east(5).up(6)) != Blocks.MAGMA.getDefaultState())
				    worldIn.setBlockState(pos.east(5).up(6), magma);
				if(worldIn.getBlockState(pos.east(5).up(7)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.east(5).up(7), nethers);
				
				
				if(worldIn.getBlockState(pos.west(5).north(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.west(5).north(2), nether);	
				if(worldIn.getBlockState(pos.west(5).north(2).up()) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.west(5).north(2).up(), nether);
				if(worldIn.getBlockState(pos.west(5).north(2).up(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.west(5).north(2).up(2), nether);
				if(worldIn.getBlockState(pos.west(5).north(2).up(3)) != Blocks.NETHER_BRICK.getDefaultState())
					worldIn.setBlockState(pos.west(5).north(2).up(3), nether);
				if(worldIn.getBlockState(pos.west(5).north(2).up(4)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.west(5).north(2).up(4), nethers);
				if(worldIn.getBlockState(pos.west(5).south(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.west(5).south(2), nether);
				if(worldIn.getBlockState(pos.west(5).south(2).up()) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.west(5).south(2).up(), nether);
				if(worldIn.getBlockState(pos.west(5).south(2).up(2)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.west(5).south(2).up(2), nether);
				if(worldIn.getBlockState(pos.west(5).south(2).up(3)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.west(5).south(2).up(3), nether);
				if(worldIn.getBlockState(pos.west(5).south(2).up(4)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.west(5).south(2).up(4), nethers);
				if(worldIn.getBlockState(pos.west(5).north().up()) != Blocks.STONE_SLAB.getStateFromMeta(14))
				    worldIn.setBlockState(pos.west(5).north(1).up(), nethersu);
				if(worldIn.getBlockState(pos.west(5).north().up(2)) != Blocks.MAGMA.getDefaultState())
				    worldIn.setBlockState(pos.west(5).north(1).up(2), magma);
				if(worldIn.getBlockState(pos.west(5).north().up(3)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.west(5).north(1).up(3), nethers);
				if(worldIn.getBlockState(pos.west(5).north().up(4)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.west(5).north(1).up(4), nether);
				if(worldIn.getBlockState(pos.west(5).north().up(5)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.west(5).north(1).up(5), nether);
				if(worldIn.getBlockState(pos.west(5).north().up(6)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.west(5).north(1).up(6), nether);
				if(worldIn.getBlockState(pos.west(5).south().up()) != Blocks.STONE_SLAB.getStateFromMeta(14))
				    worldIn.setBlockState(pos.west(5).south(1).up(), nethersu);
				if(worldIn.getBlockState(pos.west(5).south().up(2)) != Blocks.MAGMA.getDefaultState())
				    worldIn.setBlockState(pos.west(5).south(1).up(2), magma);
				if(worldIn.getBlockState(pos.west(5).south().up(3)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.west(5).south(1).up(3), nethers);
				if(worldIn.getBlockState(pos.west(5).south().up(4)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.west(5).south(1).up(4), nether);
				if(worldIn.getBlockState(pos.west(5).south(2).up(5)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.west(5).south(1).up(5), nether);
				if(worldIn.getBlockState(pos.west(5).south(2).up(6)) != Blocks.NETHER_BRICK.getDefaultState())
				    worldIn.setBlockState(pos.west(5).south(1).up(6), nether);
				if(worldIn.getBlockState(pos.west(5).up(5)) != Blocks.STONE_SLAB.getStateFromMeta(14))
				    worldIn.setBlockState(pos.west(5).up(5), nethersu);
				if(worldIn.getBlockState(pos.west(5).up(6)) != Blocks.MAGMA.getDefaultState())
				    worldIn.setBlockState(pos.west(5).up(6), magma);
				if(worldIn.getBlockState(pos.west(5).up(7)) != Blocks.STONE_SLAB.getStateFromMeta(6))
				    worldIn.setBlockState(pos.west(5).up(7), nethers);
		}
	}
}
			
