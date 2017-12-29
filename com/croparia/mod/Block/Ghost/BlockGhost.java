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
		super(Material.AIR);
		this.name = name;
		this.setUnlocalizedName(name);
	}
	
	@Override
    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
    {
		if(isIt("ghost_nether", Blocks.NETHER_BRICK))
			return true;
		if(isIt("ghost_lava", Items.LAVA_BUCKET))
			return true;
		if(isIt("ghost_death", ItemMod.seed_crop_death))
			return true;
		if(isIt("ghost_magma", Blocks.MAGMA))
			return true;
		if(isIt("ghost_elemental_cobble", BlockMod.elemental_cobblestone))
			return true;
		if(isIt("ghost_soulsand", Blocks.SOUL_SAND))
			return true;
		if(isIt("ghost_slabstone", Blocks.STONE_SLAB))
			return true;
		if(isIt("ghost_slabnether", Blocks.STONE_SLAB))
			return true;
		if(isIt("ghost_slabnetherup", Blocks.STONE_SLAB))
			return true;
		if(isIt("ghost_andesite", Blocks.STONE))
			return true;
		if(isIt("ghost_polished_andesite", Blocks.STONE))
			return true;
		if(isIt("ghost_waterliquid", Items.WATER_BUCKET))
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
		if(isIt("ghost_diorite", Blocks.STONE))
			return true;
		
		return false;
    }

	
	public boolean isIt(String name, Block block)
	{
		if(this.name == name && Minecraft.getMinecraft().player.getHeldItemMainhand().getItem() == Item.getItemFromBlock(block))
		{
			return true;
		}
		return false;
		
	}

	public boolean isIt(String name, Item item)
	{
		if(this.name == name && Minecraft.getMinecraft().player.getHeldItemMainhand().getItem() == item)
		{
			return true;
		}
		return false;
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
	
}
