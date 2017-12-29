package com.croparia.mod.Block.Elemental;

import java.util.Random;

import com.croparia.mod.Entity.EntityCentaur;
import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockElementalOre extends Block{

	private String name;
	
	public BlockElementalOre(String name) 
	{
		super(Material.ROCK);
		this.name = name;
		setUnlocalizedName(name);
		setHardness(1.5F);
		setResistance(10.0F);
		setSoundType(SoundType.STONE);
        this.setLightOpacity(1);
		this.setTickRandomly(true);
		
	}	
	
	@Override
	public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) 
	{
		Random rand = worldIn.rand;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		if(rand.nextInt(100) <= 30)
		{
			if(this.name == "ice_water_ore")
			{
				worldIn.spawnEntity(new EntityItem(worldIn, x, y, z, new ItemStack(ItemMod.elemental_water)));
			}	
			if(this.name == "dirt_earth_ore")
			{
				worldIn.spawnEntity(new EntityItem(worldIn, x, y, z, new ItemStack(ItemMod.elemental_earth)));
			}
			if(this.name == "magma_fire_ore")
			{
				worldIn.spawnEntity(new EntityItem(worldIn, x, y, z, new ItemStack(ItemMod.elemental_fire)));
			}
			if(this.name == "cloud_air_ore")
			{
				worldIn.spawnEntity(new EntityItem(worldIn, x, y, z, new ItemStack(ItemMod.elemental_air)));
			}
		}
	}
	
	@Override
	public boolean isTranslucent(IBlockState state) {
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
		return false;
	}
}
