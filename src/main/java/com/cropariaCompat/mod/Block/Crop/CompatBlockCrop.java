package com.cropariaCompat.mod.Block.Crop;

import java.util.Random;

import com.croparia.mod.Config.CropariaConfig;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

public class CompatBlockCrop extends BlockCrops
{
	private String name;
	
	public CompatBlockCrop(String name) 
	{
		this.setUnlocalizedName(name);
		this.name = name;
	}
	 
	@Override
	protected Item getSeed()
	{
		if(name == "block_crop_aluminium")
		{
			return ItemMod.seed_crop_aluminium;
		}
		else
		{
			return 
			this.name == "block_crop_brass" ? ItemMod.seed_crop_brass :
			this.name == "block_crop_bronze" ? ItemMod.seed_crop_bronze :
			this.name == "block_crop_chrome" ? ItemMod.seed_crop_chrome :
			this.name == "block_crop_copper" ? ItemMod.seed_crop_copper :
			this.name == "block_crop_electrum" ? ItemMod.seed_crop_electrum :
			this.name == "block_crop_invar" ? ItemMod.seed_crop_invar :
			this.name == "block_crop_iridium" ? ItemMod.seed_crop_iridium :
			this.name == "block_crop_lead" ? ItemMod.seed_crop_lead :
			this.name == "block_crop_nickel" ? ItemMod.seed_crop_nickel :
			this.name == "block_crop_platinium" ? ItemMod.seed_crop_platinium :
			this.name == "block_crop_silveringot" ? ItemMod.seed_crop_silveringot :
			this.name == "block_crop_steel" ? ItemMod.seed_crop_steel :
			this.name == "block_crop_tin" ? ItemMod.seed_crop_tin :
			this.name == "block_crop_titanium" ? ItemMod.seed_crop_titanium :
			this.name == "block_crop_tungsten" ? ItemMod.seed_crop_tungsten :
			this.name == "block_crop_zinc" ? ItemMod.seed_crop_zinc :
			this.name == "botania_crop_manasteel" ? ItemMod.seed_crop_manasteel :
			this.name == "botania_crop_terrasteel" ? ItemMod.seed_crop_terrasteel :
			this.name == "botania_crop_manadiamond" ? ItemMod.seed_crop_manadiamond :
			this.name == "botania_crop_dragonstone" ? ItemMod.seed_crop_dragonstone :
			this.name == "botania_crop_elementium" ? ItemMod.seed_crop_elementium :
			this.name == "botania_crop_manapearl" ? ItemMod.seed_crop_manapearl :
			this.name == "block_crop_gearwood" ? ItemMod.seed_crop_gearwood :
			this.name == "block_crop_gearstone" ? ItemMod.seed_crop_gearstone :
			this.name == "block_crop_geariron" ? ItemMod.seed_crop_geariron :
			this.name == "block_crop_geargold" ? ItemMod.seed_crop_geargold :
			this.name == "block_crop_geardiamond" ? ItemMod.seed_crop_geardiamond :
			this.name == "block_crop_yellorium" ? ItemMod.seed_crop_yellorium :
			this.name == "block_crop_blutonium" ? ItemMod.seed_crop_blutonium :
			this.name == "block_crop_cyanite" ? ItemMod.seed_crop_cyanite :
			this.name == "block_crop_graphite" ? ItemMod.seed_crop_graphite :
			this.name == "block_crop_ludicrite" ? ItemMod.seed_crop_ludicrite :
			this.name == "block_crop_enderium" ? ItemMod.seed_crop_enderium :
			this.name == "block_crop_lumium" ? ItemMod.seed_crop_lumium :
			this.name == "block_crop_signalum" ? ItemMod.seed_crop_signalum :
			this.name == "block_crop_constantan" ? ItemMod.seed_crop_constantan :
			this.name == "block_crop_mithril" ? ItemMod.seed_crop_mithril :
			this.name == "block_crop_uranium" ? ItemMod.seed_crop_uranium : 
			this.name == "block_crop_apatite" ? ItemMod.seed_crop_apatite : 
			this.name == "block_crop_silicon" ? ItemMod.seed_crop_silicon : 
			this.name == "block_crop_draconium" ? ItemMod.seed_crop_draconium :
			this.name == "block_crop_draconium_awakened" ? ItemMod.seed_crop_draconium_awakened :
			this.name == "block_crop_osmium" ? ItemMod.seed_crop_osmium :null;
		}
	}

	@Override
	protected Item getCrop()
	{
		if(name == "block_crop_aluminium")
		{
			return ItemMod.fruit_aluminium;
		}
		else
		{
			return 
			this.name == "block_crop_brass" ? ItemMod.fruit_brass :
			this.name == "block_crop_bronze" ? ItemMod.fruit_bronze :
			this.name == "block_crop_chrome" ? ItemMod.fruit_chrome :
			this.name == "block_crop_copper" ? ItemMod.fruit_copper :
			this.name == "block_crop_electrum" ? ItemMod.fruit_electrum :
			this.name == "block_crop_invar" ? ItemMod.fruit_invar :
			this.name == "block_crop_iridium" ? ItemMod.fruit_iridium :
			this.name == "block_crop_lead" ? ItemMod.fruit_lead :
			this.name == "block_crop_nickel" ? ItemMod.fruit_nickel :
			this.name == "block_crop_platinium" ? ItemMod.fruit_platinium :
			this.name == "block_crop_silveringot" ? ItemMod.fruit_silveringot :
			this.name == "block_crop_steel" ? ItemMod.fruit_steel :
			this.name == "block_crop_tin" ? ItemMod.fruit_tin :
			this.name == "block_crop_titanium" ? ItemMod.fruit_titanium :
			this.name == "block_crop_tungsten" ? ItemMod.fruit_tungsten :
			this.name == "block_crop_zinc" ? ItemMod.fruit_zinc :
			this.name == "botania_crop_manasteel" ? ItemMod.fruit_manasteel :
			this.name == "botania_crop_terrasteel" ? ItemMod.fruit_terrasteel :
			this.name == "botania_crop_manadiamond" ? ItemMod.fruit_manadiamond :
			this.name == "botania_crop_dragonstone" ? ItemMod.fruit_dragonstone :
			this.name == "botania_crop_elementium" ? ItemMod.fruit_elementium :
			this.name == "botania_crop_manapearl" ? ItemMod.fruit_manapearl :
			this.name == "block_crop_gearwood" ? ItemMod.fruit_gearwood :
			this.name == "block_crop_gearstone" ? ItemMod.fruit_gearstone :
			this.name == "block_crop_geariron" ? ItemMod.fruit_geariron :
			this.name == "block_crop_geargold" ? ItemMod.fruit_geargold :
			this.name == "block_crop_geardiamond" ? ItemMod.fruit_geardiamond :
			this.name == "block_crop_yellorium" ? ItemMod.fruit_yellorium :
			this.name == "block_crop_blutonium" ? ItemMod.fruit_blutonium :
			this.name == "block_crop_cyanite" ? ItemMod.fruit_cyanite :
			this.name == "block_crop_graphite" ? ItemMod.fruit_graphite :
			this.name == "block_crop_ludicrite" ? ItemMod.fruit_ludicrite :
			this.name == "block_crop_enderium" ? ItemMod.fruit_enderium :
			this.name == "block_crop_lumium" ? ItemMod.fruit_lumium :
			this.name == "block_crop_signalum" ? ItemMod.fruit_signalum :
			this.name == "block_crop_constantan" ? ItemMod.fruit_constantan :
			this.name == "block_crop_mithril" ? ItemMod.fruit_mithril :
			this.name == "block_crop_uranium" ? ItemMod.fruit_uranium : 
			this.name == "block_crop_apatite" ? ItemMod.fruit_apatite :
			this.name == "block_crop_silicon" ? ItemMod.fruit_silicon :
			this.name == "block_crop_draconium" ? ItemMod.fruit_draconium :
			this.name == "block_crop_draconium_awakened" ? ItemMod.fruit_draconium_awakened :   
	        this.name == "block_crop_osmium" ? ItemMod.fruit_osmium : null;  
		}
	}
	
	 @Override
	 public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) 
	 {
		 return EnumPlantType.Crop;
	 }
	 
	
	 @Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		 if(CropariaConfig.enableBonemeal)
		 {
			 return true;
		 }
		 return false;
	}
	 
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		 if(CropariaConfig.enableBonemeal == false)
		 {
			 if(playerIn.getActiveItemStack() == new ItemStack(Items.DYE, 15))
				 {
				 playerIn.getActiveItemStack().grow(1);
				 return true;
				 }
		 }
		 return false;
	}
}
