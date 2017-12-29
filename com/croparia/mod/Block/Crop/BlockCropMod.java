package com.croparia.mod.Block.Crop;

import java.util.Random;

import com.croparia.mod.Init.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.MapColor;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;

public class BlockCropMod extends BlockCrops
{
	private String name;
	 	
	public BlockCropMod(String name) 
	{
		super();
		this.name = name;
		setUnlocalizedName(name);	
	}

	protected Item getSeed()
	{
		if(name == "block_crop_coal")
		{
			return ItemMod.seed_crop_coal;
		}
		else 
		{
			return this.name == "block_crop_iron" ? ItemMod.seed_crop_iron : 
				this.name == "block_crop_gold" ? ItemMod.seed_crop_gold : 
				this.name == "block_crop_redstone" ? ItemMod.seed_crop_redstone : 
				this.name == "block_crop_lapis" ? ItemMod.seed_crop_lapis : 
				this.name == "block_crop_diamond" ? ItemMod.seed_crop_diamond : 
				this.name == "block_crop_emerald" ? ItemMod.seed_crop_emerald : 
				this.name == "block_crop_clay" ? ItemMod.seed_crop_clay : 
				this.name == "block_crop_glowstone" ? ItemMod.seed_crop_glowstone : 
				this.name == "block_crop_quartz" ? ItemMod.seed_crop_quartz : 
				this.name == "block_crop_shard" ? ItemMod.seed_crop_shard : 
				this.name == "block_crop_cristal" ? ItemMod.seed_crop_cristal : 
				this.name == "block_crop_paper" ? ItemMod.seed_crop_paper : 
				this.name == "block_crop_sugar" ? ItemMod.seed_crop_sugar : 
				this.name == "block_crop_charcoal" ? ItemMod.seed_crop_charcoal : 
				this.name == "block_crop_flint" ? ItemMod.seed_crop_flint : 
				this.name == "block_crop_snowball" ? ItemMod.seed_crop_snowball : 
				this.name == "block_crop_firework" ? ItemMod.seed_crop_firework : 
				this.name == "block_crop_nether" ? ItemMod.seed_crop_nether : 
				this.name == "block_crop_botlle" ? ItemMod.seed_crop_bottle : 
				this.name == "block_crop_foot" ? ItemMod.seed_crop_foot : 
				this.name == "block_crop_hide" ? ItemMod.seed_crop_hide : 
				this.name == "block_crop_leather" ? ItemMod.seed_crop_leather : 
				this.name == "block_crop_feather" ? ItemMod.seed_crop_feather : 
				this.name == "block_crop_ender" ? ItemMod.seed_crop_ender : 
				this.name == "block_crop_bone" ? ItemMod.seed_crop_bone : 
				this.name == "block_crop_eye" ? ItemMod.seed_crop_eye : 
				this.name == "block_crop_powder" ? ItemMod.seed_crop_powder : 
				this.name == "block_crop_blaze" ? ItemMod.seed_crop_blaze : 
				this.name == "block_crop_ghast" ? ItemMod.seed_crop_ghast : 
				this.name == "block_crop_magma" ? ItemMod.seed_crop_magma : 
				this.name == "block_crop_shell" ? ItemMod.seed_crop_shell : 
				this.name == "block_crop_slime" ? ItemMod.seed_crop_slime : 
				this.name == "block_crop_star" ? ItemMod.seed_crop_star : 
				this.name == "block_crop_string" ? ItemMod.seed_crop_string : 
				this.name == "block_crop_zombie" ? ItemMod.seed_crop_zombie : 
				this.name == "block_crop_orange" ? ItemMod.seed_crop_orange : 
				this.name == "block_crop_magenta" ? ItemMod.seed_crop_magenta : 
				this.name == "block_crop_lightblue" ? ItemMod.seed_crop_lightblue : 
				this.name == "block_crop_yellow" ? ItemMod.seed_crop_yellow : 
				this.name == "block_crop_lime" ? ItemMod.seed_crop_lime : 
				this.name == "block_crop_pink" ? ItemMod.seed_crop_pink : 
				this.name == "block_crop_gray" ? ItemMod.seed_crop_gray : 
				this.name == "block_crop_silver" ? ItemMod.seed_crop_silver : 
				this.name == "block_crop_cyan" ? ItemMod.seed_crop_cyan : 
				this.name == "block_crop_purple" ? ItemMod.seed_crop_purple : 
				this.name == "block_crop_brown" ? ItemMod.seed_crop_brown : 
				this.name == "block_crop_green" ? ItemMod.seed_crop_green : 
				this.name == "block_crop_red" ? ItemMod.seed_crop_red : 
				this.name == "block_crop_black" ? ItemMod.seed_crop_black : 
				this.name == "block_crop_vine" ? ItemMod.seed_crop_vine : 
				this.name == "block_crop_lilypad" ? ItemMod.seed_crop_lilypad : 
				this.name == "block_crop_tallgrass" ? ItemMod.seed_crop_tallgrass : 
				this.name == "block_crop_largefern" ? ItemMod.seed_crop_largefern : 
				this.name == "block_crop_bush" ? ItemMod.seed_crop_bush : 
				this.name == "block_crop_grass1" ? ItemMod.seed_crop_grass1 : 
				this.name == "block_crop_fern" ? ItemMod.seed_crop_fern : 
				this.name == "block_crop_oak" ? ItemMod.seed_crop_oak : 
				this.name == "block_crop_birch" ? ItemMod.seed_crop_birch : 
				this.name == "block_crop_spruce" ? ItemMod.seed_crop_spruce : 
				this.name == "block_crop_jungle" ? ItemMod.seed_crop_jungle : 
				this.name == "block_crop_darkoak" ? ItemMod.seed_crop_darkoak : 
				this.name == "block_crop_acacia" ? ItemMod.seed_crop_acacia : 
				this.name == "block_crop_apple" ? ItemMod.seed_crop_apple : 
				this.name == "block_crop_goldenapple" ? ItemMod.seed_crop_goldenapple : 
				this.name == "block_crop_bread" ? ItemMod.seed_crop_bread : 
				this.name == "block_crop_egg" ? ItemMod.seed_crop_egg : 
				this.name == "block_crop_clownfish" ? ItemMod.seed_crop_clownfish : 
				this.name == "block_crop_pufferfish" ? ItemMod.seed_crop_pufferfish : 
				this.name == "block_crop_cookie" ? ItemMod.seed_crop_cookie : 
				this.name == "block_crop_chorus" ? ItemMod.seed_crop_chorus : 
				this.name == "block_crop_rawporc" ? ItemMod.seed_crop_rawporc : 
				this.name == "block_crop_rawbeef" ? ItemMod.seed_crop_rawbeef : 
				this.name == "block_crop_fish" ? ItemMod.seed_crop_fish :
				this.name == "block_crop_salmon" ? ItemMod.seed_crop_salmon : 
				this.name == "block_crop_rawchicken" ? ItemMod.seed_crop_rawchicken : 
				this.name == "block_crop_rawrabbit" ? ItemMod.seed_crop_rawrabbit : 
				this.name == "block_crop_rawmutton" ? ItemMod.seed_crop_rawmutton : 
				this.name == "block_crop_death" ? ItemMod.seed_crop_death : 
				this.name == "elemental_crop" ? ItemMod.elemental_seed:
				this.name == "block_crop_totem" ? ItemMod.seed_crop_totem : null;
		}
			
	}

	 protected Item getCrop()
	    {
			if(name == "block_crop_coal")
			{
				return ItemMod.fruit_coal;
			}
			else
			{
				return this.name == "block_crop_iron" ? ItemMod.fruit_iron : 
					this.name == "block_crop_gold" ? ItemMod.fruit_gold : 
					this.name == "block_crop_redstone" ? ItemMod.fruit_redstone : 
					this.name == "block_crop_lapis" ? ItemMod.fruit_lapis : 
					this.name == "block_crop_diamond" ? ItemMod.fruit_diamond : 
					this.name == "block_crop_emerald" ? ItemMod.fruit_emerald : 
					this.name == "block_crop_clay" ? ItemMod.fruit_clay : 
					this.name == "block_crop_glowstone" ? ItemMod.fruit_glowstone : 
					this.name == "block_crop_quartz" ? ItemMod.fruit_quartz : 
					this.name == "block_crop_shard" ? ItemMod.fruit_shard : 
					this.name == "block_crop_cristal" ? ItemMod.fruit_cristal : 
					this.name == "block_crop_paper" ? ItemMod.fruit_paper : 
					this.name == "block_crop_sugar" ? ItemMod.fruit_sugar : 
					this.name == "block_crop_charcoal" ? ItemMod.fruit_charcoal : 
					this.name == "block_crop_flint" ? ItemMod.fruit_flint : 
					this.name == "block_crop_snowball" ? ItemMod.fruit_snowball : 
					this.name == "block_crop_firework" ? ItemMod.fruit_firework : 
					this.name == "block_crop_nether" ? ItemMod.fruit_nether : 
					this.name == "block_crop_botlle" ? ItemMod.fruit_bottle : 
					this.name == "block_crop_foot" ? ItemMod.fruit_foot : 
					this.name == "block_crop_hide" ? ItemMod.fruit_hide : 
					this.name == "block_crop_leather" ? ItemMod.fruit_leather : 
					this.name == "block_crop_feather" ? ItemMod.fruit_feather : 
					this.name == "block_crop_ender" ? ItemMod.fruit_ender : 
					this.name == "block_crop_bone" ? ItemMod.fruit_bone : 
					this.name == "block_crop_eye" ? ItemMod.fruit_eye : 
					this.name == "block_crop_powder" ? ItemMod.fruit_powder : 
					this.name == "block_crop_blaze" ? ItemMod.fruit_blaze : 
					this.name == "block_crop_ghast" ? ItemMod.fruit_ghast : 
					this.name == "block_crop_magma" ? ItemMod.fruit_magma : 
					this.name == "block_crop_shell" ? ItemMod.fruit_shell : 
					this.name == "block_crop_slime" ? ItemMod.fruit_slime : 
					this.name == "block_crop_star" ? ItemMod.fruit_star : 
					this.name == "block_crop_string" ? ItemMod.fruit_string : 
					this.name == "block_crop_zombie" ? ItemMod.fruit_zombie : 
					this.name == "block_crop_orange" ? ItemMod.fruit_orange : 
					this.name == "block_crop_magenta" ? ItemMod.fruit_magenta : 
					this.name == "block_crop_lightblue" ? ItemMod.fruit_lightblue : 
					this.name == "block_crop_yellow" ? ItemMod.fruit_yellow : 
					this.name == "block_crop_lime" ? ItemMod.fruit_lime : 
					this.name == "block_crop_pink" ? ItemMod.fruit_pink : 
					this.name == "block_crop_gray" ? ItemMod.fruit_gray : 
					this.name == "block_crop_silver" ? ItemMod.fruit_silver : 
					this.name == "block_crop_cyan" ? ItemMod.fruit_cyan : 
					this.name == "block_crop_purple" ? ItemMod.fruit_purple : 
					this.name == "block_crop_brown" ? ItemMod.fruit_brown : 
					this.name == "block_crop_green" ? ItemMod.fruit_green : 
					this.name == "block_crop_red" ? ItemMod.fruit_red : 
					this.name == "block_crop_black" ? ItemMod.fruit_black : 
					this.name == "block_crop_vine" ? ItemMod.fruit_vine : 
					this.name == "block_crop_lilypad" ? ItemMod.fruit_lilypad : 
					this.name == "block_crop_tallgrass" ? ItemMod.fruit_tallgrass : 
					this.name == "block_crop_largefern" ? ItemMod.fruit_largefern : 
					this.name == "block_crop_bush" ? ItemMod.fruit_bush : 
					this.name == "block_crop_grass1" ? ItemMod.fruit_grass1 : 
					this.name == "block_crop_fern" ? ItemMod.fruit_fern : 
					this.name == "block_crop_oak" ? ItemMod.fruit_oak : 
					this.name == "block_crop_birch" ? ItemMod.fruit_birch : 
					this.name == "block_crop_spruce" ? ItemMod.fruit_spruce : 
					this.name == "block_crop_jungle" ? ItemMod.fruit_jungle : 
					this.name == "block_crop_darkoak" ? ItemMod.fruit_darkoak : 
					this.name == "block_crop_acacia" ? ItemMod.fruit_acacia : 
					this.name == "block_crop_apple" ? ItemMod.fruit_apple : 
					this.name == "block_crop_goldenapple" ? ItemMod.fruit_goldenapple : 
					this.name == "block_crop_bread" ? ItemMod.fruit_bread : 
					this.name == "block_crop_egg" ? ItemMod.fruit_egg : 
					this.name == "block_crop_clownfish" ? ItemMod.fruit_clownfish : 
					this.name == "block_crop_pufferfish" ? ItemMod.fruit_pufferfish : 
					this.name == "block_crop_cookie" ? ItemMod.fruit_cookie : 
					this.name == "block_crop_chorus" ? ItemMod.fruit_chorus : 
					this.name == "block_crop_rawporc" ? ItemMod.fruit_rawporc : 
					this.name == "block_crop_rawbeef" ? ItemMod.fruit_rawbeef : 
					this.name == "block_crop_fish" ? ItemMod.fruit_fish :
					this.name == "block_crop_salmon" ? ItemMod.fruit_salmon : 
					this.name == "block_crop_rawchicken" ? ItemMod.fruit_rawchicken : 
					this.name == "block_crop_rawrabbit" ? ItemMod.fruit_rawrabbit : 
					this.name == "block_crop_rawmutton" ? ItemMod.fruit_rawmutton : 
					this.name == "block_crop_death" ? ItemMod.fruit_death : 
					this.name == "elemental_crop" ? ItemMod.elemental_fragment:
					this.name == "block_crop_totem" ? ItemMod.fruit_totem : null;
			}
	    }
	 
	 @Override
	 public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) 
	 {
		 return EnumPlantType.Crop;
	 }
	 
}
