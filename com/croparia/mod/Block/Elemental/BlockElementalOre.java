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
		super(Material.field_151576_e);
		this.name = name;
		func_149663_c(name);
		func_149711_c(1.5F);
		func_149752_b(10.0F);
		func_149672_a(SoundType.field_185851_d);
        this.func_149713_g(1);
		this.func_149675_a(true);
		
	}	
	
	@Override
	public void func_180653_a(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) 
	{
		Random rand = worldIn.field_73012_v;
		int x = pos.func_177958_n();
		int y = pos.func_177956_o();
		int z = pos.func_177952_p();
		if(rand.nextInt(100) <= 30)
		{
			if(this.name == "ice_water_ore")
			{
				worldIn.func_72838_d(new EntityItem(worldIn, x, y, z, new ItemStack(ItemMod.elemental_water)));
			}	
			if(this.name == "dirt_earth_ore")
			{
				worldIn.func_72838_d(new EntityItem(worldIn, x, y, z, new ItemStack(ItemMod.elemental_earth)));
			}
			if(this.name == "magma_fire_ore")
			{
				worldIn.func_72838_d(new EntityItem(worldIn, x, y, z, new ItemStack(ItemMod.elemental_fire)));
			}
			if(this.name == "cloud_air_ore")
			{
				worldIn.func_72838_d(new EntityItem(worldIn, x, y, z, new ItemStack(ItemMod.elemental_air)));
			}
		}
	}
	
	@Override
	public boolean func_149751_l(IBlockState state) {
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
		return false;
	}
}
