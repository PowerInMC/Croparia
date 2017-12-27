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
		super(Material.field_151578_c);
		func_149647_a(CreativeTabsRegistry.MOD_BLOCK);
	}

	@Override
	public boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
	{
		if(!worldIn.field_72995_K)
		{	
			if(i <= 3)
				i++;
			if(i > 3)
				i = 1;
			if(i == 1)
				Minecraft.func_71410_x().field_71439_g.func_71165_d("First Ritual");
			if(i == 2)
				Minecraft.func_71410_x().field_71439_g.func_71165_d("Second Ritual");
			if(i == 3)
				Minecraft.func_71410_x().field_71439_g.func_71165_d("Death Ritual");
		}
		return true;
	}
	
	@SideOnly(Side.CLIENT)
   @Override
    public BlockRenderLayer func_180664_k()
    {
        return BlockRenderLayer.TRANSLUCENT;
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
	
	
	
	
	@Override
	public void func_176199_a(World worldIn, BlockPos pos, Entity entityIn)
		{
		IBlockState soulsand = BlockMod.ghost_soulsand.func_176223_P();
		IBlockState andesite = BlockMod.ghost_andesite.func_176223_P();
		IBlockState polished_andesite = BlockMod.ghost_polished_andesite.func_176223_P();
		IBlockState elemental = BlockMod.ghost_elemental_cobble.func_176223_P();
		IBlockState elementalstone = BlockMod.ghost_elementalstone.func_176223_P();
		IBlockState slab = BlockMod.ghost_slabstone.func_176223_P();
		IBlockState lave = BlockMod.ghost_lava.func_176223_P();
		IBlockState waterliquid = BlockMod.ghost_waterliquid.func_176223_P();
		IBlockState plant = BlockMod.ghost_death.func_176203_a(7);
		IBlockState cropredstone = BlockMod.ghost_redstone.func_176203_a(7);
		IBlockState cropelemental = BlockMod.ghost_cropelemental.func_176203_a(7);
		IBlockState nether = BlockMod.ghost_nether.func_176223_P();
		IBlockState nethers = BlockMod.ghost_slabnether.func_176223_P();
		IBlockState nethersu = BlockMod.ghost_slabnetherup.func_176223_P();
		IBlockState magma = BlockMod.ghost_magma.func_176223_P();
		IBlockState air = BlockMod.ghost_air.func_176223_P();
		IBlockState fire = BlockMod.ghost_fire.func_176223_P();
		IBlockState earth = BlockMod.ghost_earth.func_176223_P();
		IBlockState water = BlockMod.ghost_water.func_176223_P();
		IBlockState cropiron = BlockMod.ghost_cropiron.func_176223_P();
		IBlockState cropgold = BlockMod.ghost_cropgold.func_176223_P();
		IBlockState diorite = BlockMod.ghost_diorite.func_176223_P();
		
			if(i == 1 && entityIn instanceof EntityPlayer && worldIn.field_72995_K)
			{
				if(worldIn.func_180495_p(pos.func_177977_b()) != BlockMod.elemental_cobblestone.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b(), elemental);
				
				if(worldIn.func_180495_p(pos.func_177978_c().func_177974_f()) != BlockMod.block_crop_iron.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177978_c().func_177974_f(), cropiron);
				if(worldIn.func_180495_p(pos.func_177978_c().func_177976_e()) != BlockMod.block_crop_iron.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177978_c().func_177976_e(), cropiron);
				if(worldIn.func_180495_p(pos.func_177968_d().func_177974_f()) != BlockMod.block_crop_iron.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177968_d().func_177974_f(), cropiron);
				if(worldIn.func_180495_p(pos.func_177968_d().func_177976_e()) != BlockMod.block_crop_iron.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177968_d().func_177976_e(), cropiron);
					
				if(worldIn.func_180495_p(pos.func_177964_d(3)) != BlockMod.block_crop_gold.func_176203_a(7))	
					worldIn.func_175656_a(pos.func_177964_d(3), cropgold);
				if(worldIn.func_180495_p(pos.func_177970_e(3)) != BlockMod.block_crop_gold.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177970_e(3), cropgold);
				if(worldIn.func_180495_p(pos.func_177965_g(3)) != BlockMod.block_crop_gold.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177965_g(3), cropgold);
				if(worldIn.func_180495_p(pos.func_177985_f(3)) != BlockMod.block_crop_gold.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177985_f(3), cropgold);
					
				if(worldIn.func_180495_p(pos.func_177977_b().func_177964_d(2).func_177985_f(2)) != Blocks.field_150355_j.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177964_d(2).func_177985_f(2), waterliquid);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177964_d(2).func_177965_g(2)) != Blocks.field_150355_j.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177964_d(2).func_177965_g(2), waterliquid);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177970_e(2).func_177985_f(2)) != Blocks.field_150355_j.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177970_e(2).func_177985_f(2), waterliquid);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177970_e(2).func_177965_g(2)) != Blocks.field_150355_j.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177970_e(2).func_177965_g(2), waterliquid);
					
				if(worldIn.func_180495_p(pos.func_177964_d(4).func_177974_f()) != Blocks.field_150348_b.func_176203_a(3))
					worldIn.func_175656_a(pos.func_177964_d(4).func_177974_f(), diorite);
				if(worldIn.func_180495_p(pos.func_177964_d(4).func_177976_e()) != Blocks.field_150348_b.func_176203_a(3))
					worldIn.func_175656_a(pos.func_177964_d(4).func_177976_e(), diorite);
				if(worldIn.func_180495_p(pos.func_177970_e(4).func_177974_f()) != Blocks.field_150348_b.func_176203_a(3))
					worldIn.func_175656_a(pos.func_177970_e(4).func_177974_f(), diorite);
				if(worldIn.func_180495_p(pos.func_177970_e(4).func_177976_e()) != Blocks.field_150348_b.func_176203_a(3))
					worldIn.func_175656_a(pos.func_177970_e(4).func_177976_e(), diorite);
				if(worldIn.func_180495_p(pos.func_177985_f(4).func_177978_c()) != Blocks.field_150348_b.func_176203_a(3))
					worldIn.func_175656_a(pos.func_177985_f(4).func_177978_c(), diorite);
				if(worldIn.func_180495_p(pos.func_177985_f(4).func_177968_d()) != Blocks.field_150348_b.func_176203_a(3))
					worldIn.func_175656_a(pos.func_177985_f(4).func_177968_d(), diorite);
				if(worldIn.func_180495_p(pos.func_177965_g(4).func_177978_c()) != Blocks.field_150348_b.func_176203_a(3))
					worldIn.func_175656_a(pos.func_177965_g(4).func_177978_c(), diorite);
				if(worldIn.func_180495_p(pos.func_177965_g(4).func_177968_d()) != Blocks.field_150348_b.func_176203_a(3))
					worldIn.func_175656_a(pos.func_177965_g(4).func_177968_d(), diorite);
					
				if(worldIn.func_180495_p(pos.func_177964_d(3).func_177965_g(3)) != Blocks.field_150348_b.func_176203_a(5))
					worldIn.func_175656_a(pos.func_177964_d(3).func_177965_g(3), andesite);
				if(worldIn.func_180495_p(pos.func_177964_d(3).func_177985_f(3)) != Blocks.field_150348_b.func_176203_a(5))
					worldIn.func_175656_a(pos.func_177964_d(3).func_177985_f(3), andesite);
				if(worldIn.func_180495_p(pos.func_177970_e(3).func_177965_g(3)) != Blocks.field_150348_b.func_176203_a(5))
					worldIn.func_175656_a(pos.func_177970_e(3).func_177965_g(3), andesite);
				if(worldIn.func_180495_p(pos.func_177970_e(3).func_177985_f(3)) != Blocks.field_150348_b.func_176203_a(5))
					worldIn.func_175656_a(pos.func_177970_e(3).func_177985_f(3), andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177985_f(3).func_177964_d(3)) != Blocks.field_150348_b.func_176203_a(5))
					worldIn.func_175656_a(pos.func_177984_a().func_177985_f(3).func_177964_d(3), andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177985_f(3).func_177970_e(3)) != Blocks.field_150348_b.func_176203_a(5))
					worldIn.func_175656_a(pos.func_177984_a().func_177985_f(3).func_177970_e(3), andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177965_g(3).func_177964_d(3)) != Blocks.field_150348_b.func_176203_a(5))
					worldIn.func_175656_a(pos.func_177984_a().func_177965_g(3).func_177964_d(3), andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177965_g(3).func_177970_e(3)) != Blocks.field_150348_b.func_176203_a(5))
					worldIn.func_175656_a(pos.func_177984_a().func_177965_g(3).func_177970_e(3), andesite);
			
			}
			
			if(i == 2 && entityIn instanceof EntityPlayer && worldIn.field_72995_K)
			{	
				if(worldIn.func_180495_p(pos.func_177977_b()) != BlockMod.elemental_cobblestone.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b(), elemental);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177978_c()) != BlockMod.elemental_stone.func_176223_P()) 
					worldIn.func_175656_a(pos.func_177977_b().func_177978_c(), elementalstone);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177968_d()) != BlockMod.elemental_stone.func_176223_P()) 
					worldIn.func_175656_a(pos.func_177977_b().func_177968_d(), elementalstone);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177974_f())  != BlockMod.elemental_stone.func_176223_P()) 
					worldIn.func_175656_a(pos.func_177977_b().func_177974_f(), elementalstone);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177976_e())  != BlockMod.elemental_stone.func_176223_P())						
					worldIn.func_175656_a(pos.func_177977_b().func_177976_e(), elementalstone);
				
				if(worldIn.func_180495_p(pos.func_177964_d(5)) != BlockMod.block_crop_redstone.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177964_d(5), cropredstone);
				if(worldIn.func_180495_p(pos.func_177970_e(5)) != BlockMod.block_crop_redstone.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177970_e(5), cropredstone);
				if(worldIn.func_180495_p(pos.func_177965_g(5))  != BlockMod.block_crop_redstone.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177965_g(5), cropredstone);
				if(worldIn.func_180495_p(pos.func_177985_f(5))  != BlockMod.block_crop_redstone.func_176203_a(7))	
					worldIn.func_175656_a(pos.func_177985_f(5), cropredstone);
				
				if(worldIn.func_180495_p(pos.func_177964_d(3).func_177985_f(3)) != BlockMod.elemental_crop.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177964_d(3).func_177985_f(3), cropelemental);
				if(worldIn.func_180495_p(pos.func_177964_d(3).func_177965_g(3)) != BlockMod.elemental_crop.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177964_d(3).func_177965_g(3), cropelemental);
				if(worldIn.func_180495_p(pos.func_177970_e(3).func_177985_f(3))  != BlockMod.elemental_crop.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177970_e(3).func_177985_f(3), cropelemental);
				if(worldIn.func_180495_p(pos.func_177970_e(3).func_177965_g(3))  != BlockMod.elemental_crop.func_176203_a(7))
					worldIn.func_175656_a(pos.func_177970_e(3).func_177965_g(3), cropelemental);
				
				if(worldIn.func_180495_p(pos.func_177977_b().func_177964_d(4).func_177976_e()) != Blocks.field_150355_j.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177964_d(4).func_177976_e(), waterliquid);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177964_d(4).func_177974_f()) != Blocks.field_150355_j.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177964_d(4).func_177974_f(), waterliquid);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177970_e(4).func_177976_e())  != Blocks.field_150355_j.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177970_e(4).func_177976_e(), waterliquid);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177970_e(4).func_177974_f())  != Blocks.field_150355_j.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177970_e(4).func_177974_f(), waterliquid);
				
				
				if(worldIn.func_180495_p(pos.func_177977_b().func_177985_f(4).func_177978_c()) != Blocks.field_150355_j.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177985_f(4).func_177978_c(), waterliquid);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177985_f(4).func_177968_d()) != Blocks.field_150355_j.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177985_f(4).func_177968_d(), waterliquid);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177965_g(4).func_177978_c())  != Blocks.field_150355_j.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177965_g(4).func_177978_c(), waterliquid);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177965_g(4).func_177968_d())  != Blocks.field_150355_j.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177965_g(4).func_177968_d(), waterliquid);
				
				
				if(worldIn.func_180495_p(pos.func_177964_d(4).func_177985_f(4)) != Blocks.field_150348_b.func_176203_a(6)) 
					worldIn.func_175656_a(pos.func_177964_d(4).func_177985_f(4), polished_andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177964_d(4).func_177985_f(4)) != BlockMod.elemental_stone.func_176223_P()) 
					worldIn.func_175656_a(pos.func_177984_a().func_177964_d(4).func_177985_f(4), elementalstone);
				if(worldIn.func_180495_p(pos.func_177981_b(2).func_177964_d(4).func_177985_f(4)) != Blocks.field_150348_b.func_176203_a(6))
					worldIn.func_175656_a(pos.func_177981_b(2).func_177964_d(4).func_177985_f(4), polished_andesite);
			
				
				if(worldIn.func_180495_p(pos.func_177964_d(4).func_177965_g(4)) != Blocks.field_150348_b.func_176203_a(6)) 
					worldIn.func_175656_a(pos.func_177964_d(4).func_177965_g(4), polished_andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177964_d(4).func_177965_g(4)) != BlockMod.elemental_stone.func_176223_P()) 
					worldIn.func_175656_a(pos.func_177984_a().func_177964_d(4).func_177965_g(4), elementalstone);
				if(worldIn.func_180495_p(pos.func_177981_b(2).func_177964_d(4).func_177965_g(4)) != Blocks.field_150348_b.func_176203_a(6))
					worldIn.func_175656_a(pos.func_177981_b(2).func_177964_d(4).func_177965_g(4), polished_andesite);
				
				
				if(worldIn.func_180495_p(pos.func_177970_e(4).func_177985_f(4)) != Blocks.field_150348_b.func_176203_a(6)) 
					worldIn.func_175656_a(pos.func_177970_e(4).func_177985_f(4), polished_andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177970_e(4).func_177985_f(4)) != BlockMod.elemental_stone.func_176223_P()) 
					worldIn.func_175656_a(pos.func_177984_a().func_177970_e(4).func_177985_f(4), elementalstone);
				if(worldIn.func_180495_p(pos.func_177981_b(2).func_177970_e(4).func_177985_f(4)) != Blocks.field_150348_b.func_176203_a(6))
					worldIn.func_175656_a(pos.func_177981_b(2).func_177970_e(4).func_177985_f(4), polished_andesite);
				
				
				if(worldIn.func_180495_p(pos.func_177970_e(4).func_177965_g(4)) != Blocks.field_150348_b.func_176203_a(6)) 
					worldIn.func_175656_a(pos.func_177970_e(4).func_177965_g(4), polished_andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177970_e(4).func_177965_g(4)) != BlockMod.elemental_stone.func_176223_P()) 
					worldIn.func_175656_a(pos.func_177984_a().func_177970_e(4).func_177965_g(4), elementalstone);
				if(worldIn.func_180495_p(pos.func_177981_b(2).func_177970_e(4).func_177965_g(4)) != Blocks.field_150348_b.func_176203_a(6))
					worldIn.func_175656_a(pos.func_177981_b(2).func_177970_e(4).func_177965_g(4), polished_andesite);
				
				
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(2), andesite);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(2), andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177964_d(5).func_177965_g(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177984_a().func_177964_d(5).func_177965_g(2), andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177964_d(5).func_177985_f(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177984_a().func_177964_d(5).func_177985_f(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(2).func_177964_d(5).func_177965_g(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(2).func_177964_d(5).func_177965_g(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(2).func_177964_d(5).func_177985_f(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(2).func_177964_d(5).func_177985_f(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177964_d(5).func_177965_g(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177964_d(5).func_177965_g(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177964_d(5).func_177985_f(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177964_d(5).func_177985_f(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177964_d(5).func_177974_f()) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177964_d(5).func_177974_f(), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177964_d(5).func_177976_e()) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177964_d(5).func_177976_e(), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177964_d(5)) != BlockMod.water_block.func_176223_P())
					worldIn.func_175656_a(pos.func_177981_b(3).func_177964_d(5), water);
				
				
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(2), andesite);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(2), andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177970_e(5).func_177965_g(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177984_a().func_177970_e(5).func_177965_g(2), andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177970_e(5).func_177985_f(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177984_a().func_177970_e(5).func_177985_f(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(2).func_177970_e(5).func_177965_g(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(2).func_177970_e(5).func_177965_g(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(2).func_177970_e(5).func_177985_f(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(2).func_177970_e(5).func_177985_f(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177970_e(5).func_177965_g(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177970_e(5).func_177965_g(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177970_e(5).func_177985_f(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177970_e(5).func_177985_f(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177970_e(5).func_177974_f()) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177970_e(5).func_177974_f(), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177970_e(5).func_177976_e()) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177970_e(5).func_177976_e(), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177970_e(5)) != BlockMod.fire_block.func_176223_P())
					worldIn.func_175656_a(pos.func_177981_b(3).func_177970_e(5), fire);

				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(2), andesite);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(2), andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177985_f(5).func_177964_d(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177984_a().func_177985_f(5).func_177964_d(2), andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177985_f(5).func_177970_e(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177984_a().func_177985_f(5).func_177970_e(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(2).func_177985_f(5).func_177964_d(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(2).func_177985_f(5).func_177964_d(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(2).func_177985_f(5).func_177970_e(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(2).func_177985_f(5).func_177970_e(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177985_f(5).func_177964_d(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177985_f(5).func_177964_d(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177985_f(5).func_177970_e(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177985_f(5).func_177970_e(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177985_f(5).func_177978_c()) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177985_f(5).func_177978_c(), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177985_f(5).func_177968_d()) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177985_f(5).func_177968_d(), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177985_f(5)) != BlockMod.earth_block.func_176223_P())
					worldIn.func_175656_a(pos.func_177981_b(3).func_177985_f(5), earth);
					
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(2), andesite);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(2), andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177965_g(5).func_177964_d(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177984_a().func_177965_g(5).func_177964_d(2), andesite);
				if(worldIn.func_180495_p(pos.func_177984_a().func_177965_g(5).func_177970_e(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177984_a().func_177965_g(5).func_177970_e(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(2).func_177965_g(5).func_177964_d(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(2).func_177965_g(5).func_177964_d(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(2).func_177965_g(5).func_177970_e(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(2).func_177965_g(5).func_177970_e(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177965_g(5).func_177964_d(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177965_g(5).func_177964_d(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177965_g(5).func_177970_e(2)) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177965_g(5).func_177970_e(2), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177965_g(5).func_177978_c()) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177965_g(5).func_177978_c(), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177965_g(5).func_177968_d()) != Blocks.field_150348_b.func_176203_a(5)) 
					worldIn.func_175656_a(pos.func_177981_b(3).func_177965_g(5).func_177968_d(), andesite);
				if(worldIn.func_180495_p(pos.func_177981_b(3).func_177965_g(5)) != BlockMod.air_block.func_176223_P())
					worldIn.func_175656_a(pos.func_177981_b(3).func_177965_g(5), air);
			}
			if(i == 3 && entityIn instanceof EntityPlayer && worldIn.field_72995_K)
			{


				if(worldIn.func_180495_p(pos.func_177977_b()) != BlockMod.elemental_cobblestone.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b(), elemental);	
				if(worldIn.func_180495_p(pos.func_177977_b().func_177964_d(2)) != Blocks.field_150425_aM.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177964_d(2), soulsand);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177970_e(2)) != Blocks.field_150425_aM.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177970_e(2), soulsand);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177965_g(2)) != Blocks.field_150425_aM.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177965_g(2), soulsand);   
				if(worldIn.func_180495_p(pos.func_177977_b().func_177985_f(2)) != Blocks.field_150425_aM.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177985_f(2), soulsand);   
				if(worldIn.func_180495_p(pos.func_177977_b().func_177978_c().func_177976_e()) != Blocks.field_150425_aM.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177978_c().func_177976_e(), soulsand);   
				if(worldIn.func_180495_p(pos.func_177977_b().func_177978_c().func_177974_f()) != Blocks.field_150425_aM.func_176223_P())
					worldIn.func_175656_a(pos.func_177977_b().func_177978_c().func_177974_f(), soulsand);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177968_d().func_177976_e()) != Blocks.field_150425_aM.func_176223_P())   
					worldIn.func_175656_a(pos.func_177977_b().func_177968_d().func_177976_e(), soulsand); 
				if(worldIn.func_180495_p(pos.func_177977_b().func_177968_d().func_177974_f()) != Blocks.field_150425_aM.func_176223_P())  
					worldIn.func_175656_a(pos.func_177977_b().func_177968_d().func_177974_f(), soulsand);
				if(worldIn.func_180495_p(pos.func_177978_c()) != Blocks.field_150333_U.func_176203_a(3))
					worldIn.func_175656_a(pos.func_177978_c(), slab);   			
				if(worldIn.func_180495_p(pos.func_177968_d()) != Blocks.field_150333_U.func_176203_a(3))
					worldIn.func_175656_a(pos.func_177968_d(), slab); 	
				if(worldIn.func_180495_p(pos.func_177974_f()) != Blocks.field_150333_U.func_176203_a(3))
					worldIn.func_175656_a(pos.func_177974_f(), slab);  
				if(worldIn.func_180495_p(pos.func_177976_e()) != Blocks.field_150333_U.func_176203_a(3))
					worldIn.func_175656_a(pos.func_177976_e(), slab);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177964_d(4).func_177976_e()) != Blocks.field_150353_l.func_176223_P())  
					worldIn.func_175656_a(pos.func_177977_b().func_177964_d(4).func_177976_e(), lave);   
				if(worldIn.func_180495_p(pos.func_177977_b().func_177964_d(4).func_177974_f()) != Blocks.field_150353_l.func_176223_P())  
					worldIn.func_175656_a(pos.func_177977_b().func_177964_d(4).func_177974_f(), lave);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177970_e(4).func_177976_e()) != Blocks.field_150353_l.func_176223_P())  
					worldIn.func_175656_a(pos.func_177977_b().func_177970_e(4).func_177976_e(), lave);  
				if(worldIn.func_180495_p(pos.func_177977_b().func_177970_e(4).func_177974_f()) != Blocks.field_150353_l.func_176223_P())  
					worldIn.func_175656_a(pos.func_177977_b().func_177970_e(4).func_177974_f(), lave);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177965_g(4).func_177968_d()) != Blocks.field_150353_l.func_176223_P())  
					worldIn.func_175656_a(pos.func_177977_b().func_177965_g(4).func_177968_d(), lave);   
				if(worldIn.func_180495_p(pos.func_177977_b().func_177965_g(4).func_177978_c()) != Blocks.field_150353_l.func_176223_P())  
					worldIn.func_175656_a(pos.func_177977_b().func_177965_g(4).func_177978_c(), lave);
				if(worldIn.func_180495_p(pos.func_177977_b().func_177985_f(4).func_177968_d()) != Blocks.field_150353_l.func_176223_P())  
					worldIn.func_175656_a(pos.func_177977_b().func_177985_f(4).func_177968_d(), lave);   
				if(worldIn.func_180495_p(pos.func_177977_b().func_177985_f(4).func_177978_c()) != Blocks.field_150353_l.func_176223_P())  
					worldIn.func_175656_a(pos.func_177977_b().func_177985_f(4).func_177978_c(), lave);
				for(int i = 0; i < 7; i++)
				{
					if(worldIn.func_180495_p(pos.func_177964_d(5).func_177974_f()) != BlockMod.block_crop_death.func_176203_a(i))
					    worldIn.func_175656_a(pos.func_177964_d(5).func_177974_f(), plant);  			
					if(worldIn.func_180495_p(pos.func_177964_d(5).func_177976_e()) != BlockMod.block_crop_death.func_176203_a(i))
					    worldIn.func_175656_a(pos.func_177964_d(5).func_177976_e(), plant); 			
					if(worldIn.func_180495_p(pos.func_177964_d(5)) != BlockMod.block_crop_death.func_176203_a(i))
					    worldIn.func_175656_a(pos.func_177964_d(5), plant);		
					if(worldIn.func_180495_p(pos.func_177970_e(5).func_177976_e()) != BlockMod.block_crop_death.func_176203_a(i))
					    worldIn.func_175656_a(pos.func_177970_e(5).func_177976_e(), plant);			
					if(worldIn.func_180495_p(pos.func_177970_e(5).func_177974_f()) != BlockMod.block_crop_death.func_176203_a(i))
					    worldIn.func_175656_a(pos.func_177970_e(5).func_177974_f(), plant); 			
					if(worldIn.func_180495_p(pos.func_177970_e(5)) != BlockMod.block_crop_death.func_176203_a(i))
					    worldIn.func_175656_a(pos.func_177970_e(5), plant);			
					if(worldIn.func_180495_p(pos.func_177965_g(5).func_177968_d()) != BlockMod.block_crop_death.func_176203_a(i))
					    worldIn.func_175656_a(pos.func_177965_g(5).func_177968_d(), plant);   				
					if(worldIn.func_180495_p(pos.func_177965_g(5).func_177978_c()) != BlockMod.block_crop_death.func_176203_a(i))
					    worldIn.func_175656_a(pos.func_177965_g(5).func_177978_c(), plant);  			
					if(worldIn.func_180495_p(pos.func_177965_g(5)) != BlockMod.block_crop_death.func_176203_a(i))
						worldIn.func_175656_a(pos.func_177965_g(5), plant);				
					if(worldIn.func_180495_p(pos.func_177985_f(5).func_177968_d()) != BlockMod.block_crop_death.func_176203_a(i))
					    worldIn.func_175656_a(pos.func_177985_f(5).func_177968_d(), plant);  			
					if(worldIn.func_180495_p(pos.func_177985_f(5).func_177978_c()) != BlockMod.block_crop_death.func_176203_a(i))
					    worldIn.func_175656_a(pos.func_177985_f(5).func_177978_c(), plant);  		
					if(worldIn.func_180495_p(pos.func_177985_f(5)) != BlockMod.block_crop_death.func_176203_a(i))
					    worldIn.func_175656_a(pos.func_177985_f(5), plant);
				}
				
				if(worldIn.func_180495_p(pos.func_177964_d(4).func_177965_g(4)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(4).func_177965_g(4), nether); 			
				if(worldIn.func_180495_p(pos.func_177964_d(4).func_177965_g(4).func_177984_a()) != BlockMod.elemental_cobblestone.func_176223_P())
					worldIn.func_175656_a(pos.func_177964_d(4).func_177965_g(4).func_177984_a(), elemental); 		
				if(worldIn.func_180495_p(pos.func_177964_d(4).func_177965_g(4).func_177981_b(2)) != BlockMod.elemental_cobblestone.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(4).func_177965_g(4).func_177981_b(2), elemental); 		
				if(worldIn.func_180495_p(pos.func_177964_d(4).func_177965_g(4).func_177981_b(3)) != Blocks.field_150333_U.func_176203_a(6))
					worldIn.func_175656_a(pos.func_177964_d(4).func_177965_g(4).func_177981_b(3), nethers);	
				if(worldIn.func_180495_p(pos.func_177970_e(4).func_177965_g(4)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(4).func_177965_g(4), nether);  				
				if(worldIn.func_180495_p(pos.func_177970_e(4).func_177965_g(4).func_177984_a()) != BlockMod.elemental_cobblestone.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(4).func_177965_g(4).func_177984_a(), elemental); 				
				if(worldIn.func_180495_p(pos.func_177970_e(4).func_177965_g(4).func_177981_b(2)) != BlockMod.elemental_cobblestone.func_176223_P())
					worldIn.func_175656_a(pos.func_177970_e(4).func_177965_g(4).func_177981_b(2), elemental); 				
				if(worldIn.func_180495_p(pos.func_177970_e(4).func_177965_g(4).func_177981_b(3)) != Blocks.field_150333_U.func_176203_a(6))
					worldIn.func_175656_a(pos.func_177970_e(4).func_177965_g(4).func_177981_b(3), nethers);				
				if(worldIn.func_180495_p(pos.func_177964_d(4).func_177985_f(4)) != Blocks.field_150385_bj.func_176223_P())
					worldIn.func_175656_a(pos.func_177964_d(4).func_177985_f(4), nether);  				
				if(worldIn.func_180495_p(pos.func_177964_d(4).func_177985_f(4).func_177984_a()) != BlockMod.elemental_cobblestone.func_176223_P())
					worldIn.func_175656_a(pos.func_177964_d(4).func_177985_f(4).func_177984_a(), elemental);				
				if(worldIn.func_180495_p(pos.func_177964_d(4).func_177985_f(4).func_177981_b(2)) != BlockMod.elemental_cobblestone.func_176223_P())  
				    worldIn.func_175656_a(pos.func_177964_d(4).func_177985_f(4).func_177981_b(2), elemental);				
				if(worldIn.func_180495_p(pos.func_177964_d(4).func_177985_f(4).func_177981_b(3)) != Blocks.field_150333_U.func_176203_a(6))
					worldIn.func_175656_a(pos.func_177964_d(4).func_177985_f(4).func_177981_b(3), nethers);			
				if(worldIn.func_180495_p(pos.func_177970_e(4).func_177985_f(4)) != Blocks.field_150385_bj.func_176223_P())
					worldIn.func_175656_a(pos.func_177970_e(4).func_177985_f(4), nether);  			
				if(worldIn.func_180495_p(pos.func_177970_e(4).func_177985_f(4).func_177984_a()) != BlockMod.elemental_cobblestone.func_176223_P())
					worldIn.func_175656_a(pos.func_177970_e(4).func_177985_f(4).func_177984_a(), elemental);   			
				if(worldIn.func_180495_p(pos.func_177970_e(4).func_177985_f(4).func_177981_b(2)) != BlockMod.elemental_cobblestone.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(4).func_177985_f(4).func_177981_b(2), elemental);   			
				if(worldIn.func_180495_p(pos.func_177970_e(4).func_177985_f(4).func_177981_b(3)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177970_e(4).func_177985_f(4).func_177981_b(3), nethers);
				
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(2), nether);	
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(2).func_177984_a()) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(2).func_177984_a(), nether);		
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(2).func_177981_b(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(2).func_177981_b(2), nether);		
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(2).func_177981_b(3)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(2).func_177981_b(3), nether);			
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(2).func_177981_b(4)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(2).func_177981_b(4), nethers);		
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(2), nether);			
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(2).func_177984_a()) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(2).func_177984_a(), nether);			
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(2).func_177981_b(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(2).func_177981_b(2), nether);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(2).func_177981_b(3)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(2).func_177981_b(3), nether);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(2).func_177981_b(4)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(2).func_177981_b(4), nethers);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(1).func_177984_a()) != Blocks.field_150333_U.func_176203_a(14))
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(1).func_177984_a(), nethersu);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(1).func_177981_b(2)) != Blocks.field_189877_df.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(1).func_177981_b(2), magma);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(1).func_177981_b(3)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(1).func_177981_b(3), nethers);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(1).func_177981_b(4)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(1).func_177981_b(4), nether);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(1).func_177981_b(5)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(1).func_177981_b(5), nether);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(1).func_177981_b(6)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177965_g(1).func_177981_b(6), nether);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(1).func_177984_a()) != Blocks.field_150333_U.func_176203_a(14))
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(1).func_177984_a(), nethersu);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(1).func_177981_b(2)) != Blocks.field_189877_df.func_176223_P())
					worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(1).func_177981_b(2), magma);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177976_e().func_177981_b(3)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(1).func_177981_b(3), nethers);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177976_e().func_177981_b(4)) != Blocks.field_150385_bj.func_176223_P())
					worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(1).func_177981_b(4), nether);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177976_e().func_177981_b(5)) != Blocks.field_150385_bj.func_176223_P())
					worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(1).func_177981_b(5), nether);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(1).func_177981_b(6)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177985_f(1).func_177981_b(6), nether);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177981_b(5)) != Blocks.field_150333_U.func_176203_a(14))
					worldIn.func_175656_a(pos.func_177964_d(5).func_177981_b(5), nethersu);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177981_b(6)) != Blocks.field_189877_df.func_176223_P())
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177981_b(6), magma);
				if(worldIn.func_180495_p(pos.func_177964_d(5).func_177981_b(7)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177964_d(5).func_177981_b(7), nethers);
				
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(2), nether);	
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(2).func_177984_a()) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(2).func_177984_a(), nether);		
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(2).func_177981_b(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(2).func_177981_b(2), nether);		
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(2).func_177981_b(3)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(2).func_177981_b(3), nether);			
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(2).func_177981_b(4)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(2).func_177981_b(4), nethers);		
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(2), nether);			
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(2).func_177984_a()) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(2).func_177984_a(), nether);			
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(2).func_177981_b(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(2).func_177981_b(2), nether);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(2).func_177981_b(3)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(2).func_177981_b(3), nether);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(2).func_177981_b(4)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(2).func_177981_b(4), nethers);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(1).func_177984_a()) != Blocks.field_150333_U.func_176203_a(14))
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(1).func_177984_a(), nethersu);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(1).func_177981_b(2)) != Blocks.field_189877_df.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(1).func_177981_b(2), magma);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(1).func_177981_b(3)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(1).func_177981_b(3), nethers);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(1).func_177981_b(4)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(1).func_177981_b(4), nether);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(1).func_177981_b(5)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(1).func_177981_b(5), nether);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(1).func_177981_b(6)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177965_g(1).func_177981_b(6), nether);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(1).func_177984_a()) != Blocks.field_150333_U.func_176203_a(14))
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(1).func_177984_a(), nethersu);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(1).func_177981_b(2)) != Blocks.field_189877_df.func_176223_P())
				worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(1).func_177981_b(2), magma);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177976_e().func_177981_b(3)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(1).func_177981_b(3), nethers);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177976_e().func_177981_b(4)) != Blocks.field_150385_bj.func_176223_P())
				worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(1).func_177981_b(4), nether);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177976_e().func_177981_b(5)) != Blocks.field_150385_bj.func_176223_P())
				worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(1).func_177981_b(5), nether);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(1).func_177981_b(6)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177985_f(1).func_177981_b(6), nether);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177981_b(5)) != Blocks.field_150333_U.func_176203_a(14))
				worldIn.func_175656_a(pos.func_177970_e(5).func_177981_b(5), nethersu);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177981_b(6)) != Blocks.field_189877_df.func_176223_P())
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177981_b(6), magma);
				if(worldIn.func_180495_p(pos.func_177970_e(5).func_177981_b(7)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177970_e(5).func_177981_b(7), nethers);
				
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(2), nether);	
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(2).func_177984_a()) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(2).func_177984_a(), nether);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(2).func_177981_b(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(2).func_177981_b(2), nether);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(2).func_177981_b(3)) != Blocks.field_150385_bj.func_176223_P())
				worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(2).func_177981_b(3), nether);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(2).func_177981_b(4)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(2).func_177981_b(4), nethers);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(2), nether);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2).func_177984_a()) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(2).func_177984_a(), nether);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2).func_177981_b(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(2).func_177981_b(2), nether);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2).func_177981_b(3)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(2).func_177981_b(3), nether);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2).func_177981_b(4)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(2).func_177981_b(4), nethers);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177978_c().func_177984_a()) != Blocks.field_150333_U.func_176203_a(14))
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(1).func_177984_a(), nethersu);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177978_c().func_177981_b(2)) != Blocks.field_189877_df.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(1).func_177981_b(2), magma);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177978_c().func_177981_b(3)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(1).func_177981_b(3), nethers);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177978_c().func_177981_b(4)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(1).func_177981_b(4), nether);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177978_c().func_177981_b(5)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(1).func_177981_b(5), nether);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177978_c().func_177981_b(6)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177964_d(1).func_177981_b(6), nether);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177968_d().func_177984_a()) != Blocks.field_150333_U.func_176203_a(14))
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(1).func_177984_a(), nethersu);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177968_d().func_177981_b(2)) != Blocks.field_189877_df.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(1).func_177981_b(2), magma);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177968_d().func_177981_b(3)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(1).func_177981_b(3), nethers);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177968_d().func_177981_b(4)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(1).func_177981_b(4), nether);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2).func_177981_b(5)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(1).func_177981_b(5), nether);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2).func_177981_b(6)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177970_e(1).func_177981_b(6), nether);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177981_b(5)) != Blocks.field_150333_U.func_176203_a(14))
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177981_b(5), nethersu);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177981_b(6)) != Blocks.field_189877_df.func_176223_P())
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177981_b(6), magma);
				if(worldIn.func_180495_p(pos.func_177965_g(5).func_177981_b(7)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177965_g(5).func_177981_b(7), nethers);
				
				
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(2), nether);	
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(2).func_177984_a()) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(2).func_177984_a(), nether);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(2).func_177981_b(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(2).func_177981_b(2), nether);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(2).func_177981_b(3)) != Blocks.field_150385_bj.func_176223_P())
					worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(2).func_177981_b(3), nether);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(2).func_177981_b(4)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(2).func_177981_b(4), nethers);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(2), nether);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2).func_177984_a()) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(2).func_177984_a(), nether);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2).func_177981_b(2)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(2).func_177981_b(2), nether);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2).func_177981_b(3)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(2).func_177981_b(3), nether);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2).func_177981_b(4)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(2).func_177981_b(4), nethers);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177978_c().func_177984_a()) != Blocks.field_150333_U.func_176203_a(14))
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(1).func_177984_a(), nethersu);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177978_c().func_177981_b(2)) != Blocks.field_189877_df.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(1).func_177981_b(2), magma);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177978_c().func_177981_b(3)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(1).func_177981_b(3), nethers);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177978_c().func_177981_b(4)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(1).func_177981_b(4), nether);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177978_c().func_177981_b(5)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(1).func_177981_b(5), nether);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177978_c().func_177981_b(6)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177964_d(1).func_177981_b(6), nether);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177968_d().func_177984_a()) != Blocks.field_150333_U.func_176203_a(14))
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(1).func_177984_a(), nethersu);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177968_d().func_177981_b(2)) != Blocks.field_189877_df.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(1).func_177981_b(2), magma);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177968_d().func_177981_b(3)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(1).func_177981_b(3), nethers);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177968_d().func_177981_b(4)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(1).func_177981_b(4), nether);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2).func_177981_b(5)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(1).func_177981_b(5), nether);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2).func_177981_b(6)) != Blocks.field_150385_bj.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177970_e(1).func_177981_b(6), nether);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177981_b(5)) != Blocks.field_150333_U.func_176203_a(14))
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177981_b(5), nethersu);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177981_b(6)) != Blocks.field_189877_df.func_176223_P())
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177981_b(6), magma);
				if(worldIn.func_180495_p(pos.func_177985_f(5).func_177981_b(7)) != Blocks.field_150333_U.func_176203_a(6))
				    worldIn.func_175656_a(pos.func_177985_f(5).func_177981_b(7), nethers);
		}
	}
}
			
