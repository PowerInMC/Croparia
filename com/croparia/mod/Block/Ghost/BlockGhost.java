package com.croparia.mod.Block.Ghost;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGhost extends BlockBush {

	private String name;
	
	public BlockGhost(String name) {
		super(Material.field_151579_a);
		this.name = name;
		this.func_149663_c(name);
	}
	
	@Override
    public boolean func_176200_f(IBlockAccess worldIn, BlockPos pos)
    {
		if(isIt("ghost_nether", Blocks.field_150385_bj))
			return true;
		if(isIt("ghost_lava", Items.field_151129_at))
			return true;
		if(isIt("ghost_death", ItemMod.seed_crop_death))
			return true;
		if(isIt("ghost_magma", Blocks.field_189877_df))
			return true;
		if(isIt("ghost_elemental_cobble", BlockMod.elemental_cobblestone))
			return true;
		if(isIt("ghost_soulsand", Blocks.field_150425_aM))
			return true;
		if(isIt("ghost_slabstone", Blocks.field_150333_U))
			return true;
		if(isIt("ghost_slabnether", Blocks.field_150333_U))
			return true;
		if(isIt("ghost_slabnetherup", Blocks.field_150333_U))
			return true;
		if(isIt("ghost_andesite", Blocks.field_150348_b))
			return true;
		if(isIt("ghost_polished_andesite", Blocks.field_150348_b))
			return true;
		if(isIt("ghost_waterliquid", Items.field_151131_as))
			return true;
		if(isIt("ghost_redstone", ItemMod.seed_crop_redstone))
			return true;
		if(isIt("ghost_cropelemental", ItemMod.elemental_crop))
			return true;
		if(isIt("ghost_air", BlockMod.air_block))
			return true;
		if(isIt("ghost_fire", BlockMod.fire_block))
			return true;
		if(isIt("ghost_earth", BlockMod.earth_block))
			return true;
		if(isIt("ghost_water", BlockMod.water_block))
			return true;
		if(isIt("ghost_elementalstone", BlockMod.elemental_stone))
			return true;
		if(isIt("ghost_cropiron", ItemMod.seed_crop_iron))
			return true;
		if(isIt("ghost_cropgold", ItemMod.seed_crop_gold))
			return true;
		if(isIt("ghost_diorite", Blocks.field_150348_b))
			return true;
		
		return false;
    }

	
	public boolean isIt(String name, Block block)
	{
		if(this.name == name && Minecraft.func_71410_x().field_71439_g.func_184614_ca().func_77973_b() == Item.func_150898_a(block))
		{
			return true;
		}
		return false;
		
	}

	public boolean isIt(String name, Item item)
	{
		if(this.name == name && Minecraft.func_71410_x().field_71439_g.func_184614_ca().func_77973_b() == item)
		{
			return true;
		}
		return false;
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
	
}
