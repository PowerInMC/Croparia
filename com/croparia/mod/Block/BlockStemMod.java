package com.croparia.mod.Block;

import java.util.Random;

import javax.annotation.Nullable;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStem;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockStemMod extends BlockStem
{

	private Block crop;

	public BlockStemMod(Block crop, String name) 
	{
		super(crop);
		this.crop = crop;
		func_149663_c(name);
	}
	
	@Override
	protected Item func_176481_j() 
	{
		if (this.crop == BlockMod.block_plant_coal)
	    {
            return ItemMod.seed_stem_coal;
	    }
		else
	    {
            return this.crop == BlockMod.block_plant_iron ? ItemMod.seed_stem_iron : 
         	   	   this.crop == BlockMod.block_plant_gold ? ItemMod.seed_stem_gold : 
            	   this.crop == BlockMod.block_plant_redstone ? ItemMod.seed_stem_redstone : 
            	   this.crop == BlockMod.block_plant_lapis ? ItemMod.seed_stem_lapis : 
	        	   this.crop == BlockMod.block_plant_diamond ? ItemMod.seed_stem_diamond :  
            	   this.crop == BlockMod.block_plant_emerald ? ItemMod.seed_stem_emerald :  
            	   this.crop == BlockMod.block_plant_clay ? ItemMod.seed_stem_clay :  
            	   this.crop == BlockMod.block_plant_glowstone ? ItemMod.seed_stem_glowstone :  
            	   this.crop == BlockMod.block_plant_quartz ? ItemMod.seed_stem_quartz :  
            	   this.crop == BlockMod.block_plant_shard ? ItemMod.seed_stem_shard :  
	        	   this.crop == BlockMod.block_plant_cristal ? ItemMod.seed_stem_cristal :  
            	   this.crop == BlockMod.block_plant_obsidian ? ItemMod.seed_stem_obsidian :  
            	   this.crop == BlockMod.block_plant_bone ? ItemMod.seed_stem_bone :  
            	   this.crop == BlockMod.block_plant_snow ? ItemMod.seed_stem_snow :  
            	   this.crop == BlockMod.block_plant_nether ? ItemMod.seed_stem_nether :  
            	   this.crop == BlockMod.block_plant_glass ? ItemMod.seed_stem_glass :  
            	   this.crop == BlockMod.block_plant_magma ? ItemMod.seed_stem_magma :  
            	   this.crop == BlockMod.block_plant_shell ? ItemMod.seed_stem_shell : 
        		   this.crop == BlockMod.block_plant_elemental ? ItemMod.elemental_seed_stem : null;        
        }
	}

	
	@Override
	public boolean func_149744_f(IBlockState state) 
	{
		for(int i = 0; i<8; i++)
		if(state == BlockMod.stem_redstone.func_176203_a(i))
		{
			return true;
		}
		return false;		
	}
}
