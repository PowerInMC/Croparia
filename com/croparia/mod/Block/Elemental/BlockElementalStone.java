package com.croparia.mod.Block.Elemental;

import java.util.Random;

import com.croparia.mod.Config.ConfigInit;
import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockElementalStone extends Block {
	
	public boolean ok = true;
	
	public BlockElementalStone(Material blockMaterialIn, MapColor blockMapColorIn) {
		super(blockMaterialIn, blockMapColorIn);
		this.func_149647_a(CreativeTabsRegistry.MOD_BLOCK);
		this.func_149711_c(1.5F);
		this.func_149752_b(10.0F);
		this.func_149672_a(SoundType.field_185851_d);
	}

	public Item func_180660_a(IBlockState state, Random rand, int fortune) {
		return Item.func_150898_a(BlockMod.elemental_cobblestone);
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return 1;
	}

	@Override
	public void func_180633_a(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) 
	{		
		//Second Ritual
			if(worldIn.func_180495_p(pos.func_177977_b()) == BlockMod.elemental_cobblestone.func_176223_P() && worldIn.func_180495_p(pos.func_177977_b().func_177978_c()) == BlockMod.elemental_stone.func_176223_P() &&worldIn.func_180495_p(pos.func_177977_b().func_177968_d()) == BlockMod.elemental_stone.func_176223_P() &&worldIn.func_180495_p(pos.func_177977_b().func_177974_f())  == BlockMod.elemental_stone.func_176223_P() &&worldIn.func_180495_p(pos.func_177977_b().func_177976_e())  == BlockMod.elemental_stone.func_176223_P())						
				{
				if(worldIn.func_180495_p(pos.func_177964_d(5)) == BlockMod.block_crop_redstone.func_176203_a(7) &&worldIn.func_180495_p(pos.func_177970_e(5)) == BlockMod.block_crop_redstone.func_176203_a(7) &&worldIn.func_180495_p(pos.func_177965_g(5))  == BlockMod.block_crop_redstone.func_176203_a(7) &&worldIn.func_180495_p(pos.func_177985_f(5))  == BlockMod.block_crop_redstone.func_176203_a(7))	
				{
					if(worldIn.func_180495_p(pos.func_177964_d(3).func_177985_f(3)) == BlockMod.elemental_crop.func_176203_a(7) &&worldIn.func_180495_p(pos.func_177964_d(3).func_177965_g(3)) == BlockMod.elemental_crop.func_176203_a(7) &&worldIn.func_180495_p(pos.func_177970_e(3).func_177985_f(3))  == BlockMod.elemental_crop.func_176203_a(7) &&worldIn.func_180495_p(pos.func_177970_e(3).func_177965_g(3))  == BlockMod.elemental_crop.func_176203_a(7))
						{
						if(worldIn.func_180495_p(pos.func_177977_b().func_177964_d(4).func_177976_e()) == Blocks.field_150355_j.func_176223_P() &&worldIn.func_180495_p(pos.func_177977_b().func_177964_d(4).func_177974_f()) == Blocks.field_150355_j.func_176223_P() &&worldIn.func_180495_p(pos.func_177977_b().func_177970_e(4).func_177976_e())  == Blocks.field_150355_j.func_176223_P() &&worldIn.func_180495_p(pos.func_177977_b().func_177970_e(4).func_177974_f())  == Blocks.field_150355_j.func_176223_P())
						
							{
							if(worldIn.func_180495_p(pos.func_177977_b().func_177985_f(4).func_177978_c()) == Blocks.field_150355_j.func_176223_P() &&worldIn.func_180495_p(pos.func_177977_b().func_177985_f(4).func_177968_d()) == Blocks.field_150355_j.func_176223_P() &&worldIn.func_180495_p(pos.func_177977_b().func_177965_g(4).func_177978_c())  == Blocks.field_150355_j.func_176223_P() &&worldIn.func_180495_p(pos.func_177977_b().func_177965_g(4).func_177968_d())  == Blocks.field_150355_j.func_176223_P())
							
								{
								if(worldIn.func_180495_p(pos.func_177964_d(4).func_177985_f(4)) == Blocks.field_150348_b.func_176203_a(6) && worldIn.func_180495_p(pos.func_177984_a().func_177964_d(4).func_177985_f(4)) == BlockMod.elemental_stone.func_176223_P() && worldIn.func_180495_p(pos.func_177981_b(2).func_177964_d(4).func_177985_f(4)) == Blocks.field_150348_b.func_176203_a(6))
							
									{
									if(worldIn.func_180495_p(pos.func_177964_d(4).func_177965_g(4)) == Blocks.field_150348_b.func_176203_a(6) && worldIn.func_180495_p(pos.func_177984_a().func_177964_d(4).func_177965_g(4)) == BlockMod.elemental_stone.func_176223_P() && worldIn.func_180495_p(pos.func_177981_b(2).func_177964_d(4).func_177965_g(4)) == Blocks.field_150348_b.func_176203_a(6))
									
										{
										if(worldIn.func_180495_p(pos.func_177970_e(4).func_177985_f(4)) == Blocks.field_150348_b.func_176203_a(6) && worldIn.func_180495_p(pos.func_177984_a().func_177970_e(4).func_177985_f(4)) == BlockMod.elemental_stone.func_176223_P() && worldIn.func_180495_p(pos.func_177981_b(2).func_177970_e(4).func_177985_f(4)) == Blocks.field_150348_b.func_176203_a(6))
										
											{
											if(worldIn.func_180495_p(pos.func_177970_e(4).func_177965_g(4)) == Blocks.field_150348_b.func_176203_a(6) && worldIn.func_180495_p(pos.func_177984_a().func_177970_e(4).func_177965_g(4)) == BlockMod.elemental_stone.func_176223_P() && worldIn.func_180495_p(pos.func_177981_b(2).func_177970_e(4).func_177965_g(4)) == Blocks.field_150348_b.func_176203_a(6))
											
												{
												if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177984_a().func_177964_d(5).func_177965_g(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177984_a().func_177964_d(5).func_177985_f(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(2).func_177964_d(5).func_177965_g(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(2).func_177964_d(5).func_177985_f(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177964_d(5).func_177965_g(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177964_d(5).func_177985_f(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177964_d(5).func_177974_f()) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177964_d(5).func_177976_e()) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177964_d(5)) == BlockMod.water_block.func_176223_P())
												
													{
													if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177984_a().func_177970_e(5).func_177965_g(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177984_a().func_177970_e(5).func_177985_f(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(2).func_177970_e(5).func_177965_g(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(2).func_177970_e(5).func_177985_f(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177970_e(5).func_177965_g(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177970_e(5).func_177985_f(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177970_e(5).func_177974_f()) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177970_e(5).func_177976_e()) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177970_e(5)) == BlockMod.fire_block.func_176223_P())
													
														{
														if(worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177984_a().func_177985_f(5).func_177964_d(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177984_a().func_177985_f(5).func_177970_e(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(2).func_177985_f(5).func_177964_d(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(2).func_177985_f(5).func_177970_e(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177985_f(5).func_177964_d(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177985_f(5).func_177970_e(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177985_f(5).func_177978_c()) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177985_f(5).func_177968_d()) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177985_f(5)) == BlockMod.earth_block.func_176223_P())
														
															{
															if(worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177984_a().func_177965_g(5).func_177964_d(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177984_a().func_177965_g(5).func_177970_e(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(2).func_177965_g(5).func_177964_d(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(2).func_177965_g(5).func_177970_e(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177965_g(5).func_177964_d(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177965_g(5).func_177970_e(2)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177965_g(5).func_177978_c()) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177965_g(5).func_177968_d()) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177981_b(3).func_177965_g(5)) == BlockMod.air_block.func_176223_P())
															
																{
																if(worldIn.func_180495_p(pos.func_177964_d(2).func_177965_g(2)) == BlockMod.fire_block.func_176223_P() && worldIn.func_180495_p(pos.func_177964_d(2).func_177985_f(2)) == BlockMod.fire_block.func_176223_P() && worldIn.func_180495_p(pos.func_177970_e(2).func_177985_f(2)) == BlockMod.fire_block.func_176223_P() && worldIn.func_180495_p(pos.func_177970_e(2).func_177965_g(2)) == BlockMod.fire_block.func_176223_P())
																	{
																		worldIn.func_175656_a(pos.func_177981_b(2), BlockMod.minotaur_spawn.func_176223_P());
																		worldIn.func_72838_d(new EntityLightningBolt(worldIn, pos.func_177958_n(), pos.func_177956_o() + 2, pos.func_177952_p(), false));
																		worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());
																		worldIn.func_175656_a(pos.func_177964_d(2).func_177985_f(2), Blocks.field_150350_a.func_176223_P());
																		worldIn.func_175656_a(pos.func_177964_d(2).func_177965_g(2), Blocks.field_150350_a.func_176223_P());
																		worldIn.func_175656_a(pos.func_177970_e(2).func_177965_g(2), Blocks.field_150350_a.func_176223_P());
																		worldIn.func_175656_a(pos.func_177970_e(2).func_177985_f(2), Blocks.field_150350_a.func_176223_P());
																	}
																
																else if(worldIn.func_180495_p(pos.func_177964_d(2).func_177965_g(2)) == BlockMod.water_block.func_176223_P() && worldIn.func_180495_p(pos.func_177964_d(2).func_177985_f(2)) == BlockMod.water_block.func_176223_P() && worldIn.func_180495_p(pos.func_177970_e(2).func_177985_f(2)) == BlockMod.water_block.func_176223_P() && worldIn.func_180495_p(pos.func_177970_e(2).func_177965_g(2)) == BlockMod.water_block.func_176223_P())
																	{
																		worldIn.func_175656_a(pos.func_177981_b(2), BlockMod.seafarer_spawn.func_176223_P());	
																		worldIn.func_72838_d(new EntityLightningBolt(worldIn, pos.func_177958_n(), pos.func_177956_o() + 2, pos.func_177952_p(), false));
																		worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());
																		worldIn.func_175656_a(pos.func_177964_d(2).func_177985_f(2), Blocks.field_150350_a.func_176223_P());
																		worldIn.func_175656_a(pos.func_177964_d(2).func_177965_g(2), Blocks.field_150350_a.func_176223_P());
																		worldIn.func_175656_a(pos.func_177970_e(2).func_177965_g(2), Blocks.field_150350_a.func_176223_P());
																		worldIn.func_175656_a(pos.func_177970_e(2).func_177985_f(2), Blocks.field_150350_a.func_176223_P());
																	}	
																
																else if(worldIn.func_180495_p(pos.func_177964_d(2).func_177965_g(2)) == BlockMod.earth_block.func_176223_P() && worldIn.func_180495_p(pos.func_177964_d(2).func_177985_f(2)) == BlockMod.earth_block.func_176223_P() && worldIn.func_180495_p(pos.func_177970_e(2).func_177985_f(2)) == BlockMod.earth_block.func_176223_P() && worldIn.func_180495_p(pos.func_177970_e(2).func_177965_g(2)) == BlockMod.earth_block.func_176223_P())
																{
																	worldIn.func_175656_a(pos.func_177981_b(2), BlockMod.centaur_spawn.func_176223_P());	
																	worldIn.func_72838_d(new EntityLightningBolt(worldIn, pos.func_177958_n(), pos.func_177956_o() + 2, pos.func_177952_p(), false));
																	worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());
																	worldIn.func_175656_a(pos.func_177964_d(2).func_177985_f(2), Blocks.field_150350_a.func_176223_P());
																	worldIn.func_175656_a(pos.func_177964_d(2).func_177965_g(2), Blocks.field_150350_a.func_176223_P());
																	worldIn.func_175656_a(pos.func_177970_e(2).func_177965_g(2), Blocks.field_150350_a.func_176223_P());
																	worldIn.func_175656_a(pos.func_177970_e(2).func_177985_f(2), Blocks.field_150350_a.func_176223_P());
																}
																
																else if(worldIn.func_180495_p(pos.func_177964_d(2).func_177965_g(2)) == BlockMod.air_block.func_176223_P() && worldIn.func_180495_p(pos.func_177964_d(2).func_177985_f(2)) == BlockMod.air_block.func_176223_P() && worldIn.func_180495_p(pos.func_177970_e(2).func_177985_f(2)) == BlockMod.air_block.func_176223_P() && worldIn.func_180495_p(pos.func_177970_e(2).func_177965_g(2)) == BlockMod.air_block.func_176223_P())
																{
																	worldIn.func_175656_a(pos.func_177981_b(2), BlockMod.flyingbeast_spawn.func_176223_P());
																	worldIn.func_72838_d(new EntityLightningBolt(worldIn, pos.func_177958_n(), pos.func_177956_o() + 2, pos.func_177952_p(), false));
																	worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());
																	worldIn.func_175656_a(pos.func_177964_d(2).func_177985_f(2), Blocks.field_150350_a.func_176223_P());
																	worldIn.func_175656_a(pos.func_177964_d(2).func_177965_g(2), Blocks.field_150350_a.func_176223_P());
																	worldIn.func_175656_a(pos.func_177970_e(2).func_177965_g(2), Blocks.field_150350_a.func_176223_P());
																	worldIn.func_175656_a(pos.func_177970_e(2).func_177985_f(2), Blocks.field_150350_a.func_176223_P());
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
	//first Ritual
			if(worldIn.func_180495_p(pos.func_177977_b()) == BlockMod.elemental_cobblestone.func_176223_P() && !worldIn.field_72995_K)
			{
				if(worldIn.func_180495_p(pos.func_177978_c().func_177974_f()) == BlockMod.block_crop_iron.func_176203_a(7) && worldIn.func_180495_p(pos.func_177978_c().func_177976_e()) == BlockMod.block_crop_iron.func_176203_a(7) && worldIn.func_180495_p(pos.func_177968_d().func_177974_f()) == BlockMod.block_crop_iron.func_176203_a(7) && worldIn.func_180495_p(pos.func_177968_d().func_177976_e()) == BlockMod.block_crop_iron.func_176203_a(7))
				{
					if(worldIn.func_180495_p(pos.func_177964_d(3)) == BlockMod.block_crop_gold.func_176203_a(7) && 	worldIn.func_180495_p(pos.func_177970_e(3)) == BlockMod.block_crop_gold.func_176203_a(7) && worldIn.func_180495_p(pos.func_177965_g(3)) == BlockMod.block_crop_gold.func_176203_a(7) && worldIn.func_180495_p(pos.func_177985_f(3)) == BlockMod.block_crop_gold.func_176203_a(7))
					{
						if(worldIn.func_180495_p(pos.func_177977_b().func_177964_d(2).func_177985_f(2)) == Blocks.field_150355_j.func_176223_P() && worldIn.func_180495_p(pos.func_177977_b().func_177964_d(2).func_177965_g(2)) == Blocks.field_150355_j.func_176223_P() && worldIn.func_180495_p(pos.func_177977_b().func_177970_e(2).func_177985_f(2)) == Blocks.field_150355_j.func_176223_P() && worldIn.func_180495_p(pos.func_177977_b().func_177970_e(2).func_177965_g(2)) == Blocks.field_150355_j.func_176223_P())
						{			
							if(worldIn.func_180495_p(pos.func_177964_d(4).func_177974_f()) == Blocks.field_150348_b.func_176203_a(3) && worldIn.func_180495_p(pos.func_177964_d(4).func_177976_e()) == Blocks.field_150348_b.func_176203_a(3) && worldIn.func_180495_p(pos.func_177970_e(4).func_177974_f()) == Blocks.field_150348_b.func_176203_a(3) && worldIn.func_180495_p(pos.func_177970_e(4).func_177976_e()) == Blocks.field_150348_b.func_176203_a(3) && worldIn.func_180495_p(pos.func_177985_f(4).func_177978_c()) == Blocks.field_150348_b.func_176203_a(3) && worldIn.func_180495_p(pos.func_177985_f(4).func_177968_d()) == Blocks.field_150348_b.func_176203_a(3) && worldIn.func_180495_p(pos.func_177965_g(4).func_177978_c()) == Blocks.field_150348_b.func_176203_a(3) && worldIn.func_180495_p(pos.func_177965_g(4).func_177968_d()) == Blocks.field_150348_b.func_176203_a(3))
							{
								if(worldIn.func_180495_p(pos.func_177964_d(3).func_177965_g(3)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177964_d(3).func_177985_f(3)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177970_e(3).func_177965_g(3)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177970_e(3).func_177985_f(3)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177984_a().func_177985_f(3).func_177964_d(3)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177984_a().func_177985_f(3).func_177970_e(3)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177984_a().func_177965_g(3).func_177964_d(3)) == Blocks.field_150348_b.func_176203_a(5) && worldIn.func_180495_p(pos.func_177984_a().func_177965_g(3).func_177970_e(3)) == Blocks.field_150348_b.func_176203_a(5))
								{
									if(worldIn.func_180495_p(pos.func_177977_b().func_177978_c()) == Blocks.field_150340_R.func_176223_P() && worldIn.func_180495_p(pos.func_177977_b().func_177974_f()) == Blocks.field_150340_R.func_176223_P() && worldIn.func_180495_p(pos.func_177977_b().func_177968_d()) == Blocks.field_150340_R.func_176223_P() && worldIn.func_180495_p(pos.func_177977_b().func_177976_e()) == Blocks.field_150340_R.func_176223_P())
									{
										/*if(placer.getHeldItemOffhand().getItem() == Items.EGG)
										{						
											EntityGoldenChicken e = new EntityGoldenChicken(worldIn);

											e.setPosition(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
											placer.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, new ItemStack(Blocks.AIR));
											worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());	
											worldIn.spawnEntity(e);
										}*/
										if(placer.func_184592_cb().func_77973_b() == Items.field_151034_e)
										{						
											worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());	
											worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, new ItemStack(ItemMod.infinite_apple)));																											
										
										}
										else
										{
											worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());	
											worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, new ItemStack(ItemMod.midas_hand)));																											
										}
										worldIn.func_175656_a(pos.func_177977_b().func_177978_c(), Blocks.field_150350_a.func_176223_P());
										worldIn.func_175656_a(pos.func_177977_b().func_177974_f(), Blocks.field_150350_a.func_176223_P());
										worldIn.func_175656_a(pos.func_177977_b().func_177968_d(), Blocks.field_150350_a.func_176223_P());
										worldIn.func_175656_a(pos.func_177977_b().func_177976_e(), Blocks.field_150350_a.func_176223_P());
									}
									if(worldIn.func_180495_p(pos.func_177977_b().func_177978_c()) == Blocks.field_189878_dg.func_176223_P() && worldIn.func_180495_p(pos.func_177977_b().func_177974_f()) == Blocks.field_189878_dg.func_176223_P() && worldIn.func_180495_p(pos.func_177977_b().func_177968_d()) == Blocks.field_189878_dg.func_176223_P() && worldIn.func_180495_p(pos.func_177977_b().func_177976_e()) == Blocks.field_189878_dg.func_176223_P())
									{
										worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());	
										worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, new ItemStack(ItemMod.horn_plenty)));																											
										worldIn.func_175656_a(pos.func_177977_b().func_177978_c(), Blocks.field_150350_a.func_176223_P());
										worldIn.func_175656_a(pos.func_177977_b().func_177974_f(), Blocks.field_150350_a.func_176223_P());
										worldIn.func_175656_a(pos.func_177977_b().func_177968_d(), Blocks.field_150350_a.func_176223_P());
										worldIn.func_175656_a(pos.func_177977_b().func_177976_e(), Blocks.field_150350_a.func_176223_P());
									}
									if(worldIn.func_180495_p(pos.func_177977_b().func_177978_c()).func_177230_c() == Blocks.field_189880_di && worldIn.func_180495_p(pos.func_177977_b().func_177974_f()).func_177230_c() == Blocks.field_189880_di && worldIn.func_180495_p(pos.func_177977_b().func_177968_d()).func_177230_c() == Blocks.field_189880_di && worldIn.func_180495_p(pos.func_177977_b().func_177976_e()).func_177230_c() == Blocks.field_189880_di && placer.func_184592_cb().func_77973_b() == Items.field_151131_as)
									{
										worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());	
										worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, new ItemStack(ItemMod.water_can)));																											
										worldIn.func_175656_a(pos.func_177977_b().func_177978_c(), Blocks.field_150350_a.func_176223_P());
										worldIn.func_175656_a(pos.func_177977_b().func_177974_f(), Blocks.field_150350_a.func_176223_P());
										worldIn.func_175656_a(pos.func_177977_b().func_177968_d(), Blocks.field_150350_a.func_176223_P());
										worldIn.func_175656_a(pos.func_177977_b().func_177976_e(), Blocks.field_150350_a.func_176223_P());
									}
									if(ConfigInit.death == true)
									{
										if(worldIn.func_180495_p(pos.func_177977_b().func_177978_c()) == BlockMod.block_crop_diamond.func_176203_a(7) && worldIn.func_180495_p(pos.func_177977_b().func_177974_f()) == BlockMod.block_crop_diamond.func_176203_a(7) && worldIn.func_180495_p(pos.func_177977_b().func_177968_d()) == BlockMod.block_crop_diamond.func_176203_a(7) && worldIn.func_180495_p(pos.func_177977_b().func_177976_e()) == BlockMod.block_crop_diamond.func_176203_a(7))									
										{
											worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());	
											worldIn.func_72838_d(new EntityItem(worldIn, pos.func_177958_n() + 0.5, pos.func_177956_o() + 1, pos.func_177952_p() + 0.5, new ItemStack(ItemMod.seed_crop_death)));																											
											worldIn.func_175656_a(pos.func_177977_b().func_177978_c(), Blocks.field_150350_a.func_176223_P());
											worldIn.func_175656_a(pos.func_177977_b().func_177974_f(), Blocks.field_150350_a.func_176223_P());
											worldIn.func_175656_a(pos.func_177977_b().func_177968_d(), Blocks.field_150350_a.func_176223_P());
											worldIn.func_175656_a(pos.func_177977_b().func_177976_e(), Blocks.field_150350_a.func_176223_P());
										}
									}
									
								}
							}
						}
					}
				}
			}	
			IBlockState soulsand = Blocks.field_150425_aM.func_176223_P();
			IBlockState elemental = BlockMod.elemental_cobblestone.func_176223_P();
			IBlockState slab = Blocks.field_150333_U.func_176203_a(3);
			IBlockState lave = Blocks.field_150353_l.func_176223_P();
			IBlockState plant = BlockMod.block_crop_death.func_176203_a(7);
			IBlockState nether = Blocks.field_150385_bj.func_176223_P();
			IBlockState stone = BlockMod.elemental_stone.func_176223_P();
			IBlockState nethers = Blocks.field_150333_U.func_176203_a(6);
			IBlockState nethersu = Blocks.field_150333_U.func_176203_a(14);
			IBlockState magma = Blocks.field_189877_df.func_176223_P();
			//Death ritual
			if(!worldIn.field_72995_K && worldIn.func_180495_p(pos.func_177977_b()) == elemental && worldIn.func_180495_p(pos.func_177977_b().func_177964_d(2)) == soulsand && worldIn.func_180495_p(pos.func_177977_b().func_177970_e(2)) == soulsand && worldIn.func_180495_p(pos.func_177977_b().func_177965_g(2)) == soulsand && worldIn.func_180495_p(pos.func_177977_b().func_177985_f(2)) == soulsand && worldIn.func_180495_p(pos.func_177977_b().func_177978_c().func_177976_e()) == soulsand && worldIn.func_180495_p(pos.func_177977_b().func_177978_c().func_177974_f()) == soulsand && worldIn.func_180495_p(pos.func_177977_b().func_177968_d().func_177976_e()) == soulsand && worldIn.func_180495_p(pos.func_177977_b().func_177968_d().func_177974_f()) == soulsand)
			{
				if(worldIn.func_180495_p(pos.func_177978_c()) == slab && worldIn.func_180495_p(pos.func_177968_d()) == slab && worldIn.func_180495_p(pos.func_177974_f()) == slab && worldIn.func_180495_p(pos.func_177976_e()) == slab)
				{
					if(worldIn.func_180495_p(pos.func_177977_b().func_177964_d(4).func_177976_e()) == lave && worldIn.func_180495_p(pos.func_177977_b().func_177964_d(4).func_177974_f()) == lave
							&& worldIn.func_180495_p(pos.func_177977_b().func_177970_e(4).func_177976_e()) == lave && worldIn.func_180495_p(pos.func_177977_b().func_177970_e(4).func_177974_f()) == lave
							&& worldIn.func_180495_p(pos.func_177977_b().func_177965_g(4).func_177968_d()) == lave && worldIn.func_180495_p(pos.func_177977_b().func_177965_g(4).func_177978_c()) == lave
							&& worldIn.func_180495_p(pos.func_177977_b().func_177985_f(4).func_177968_d()) == lave && worldIn.func_180495_p(pos.func_177977_b().func_177985_f(4).func_177978_c()) == lave)
					{	
					if(worldIn.func_180495_p(pos.func_177964_d(5).func_177976_e()) == plant && worldIn.func_180495_p(pos.func_177964_d(5).func_177974_f()) == plant && worldIn.func_180495_p(pos.func_177964_d(5)) == plant
							&& worldIn.func_180495_p(pos.func_177970_e(5).func_177976_e()) == plant && worldIn.func_180495_p(pos.func_177970_e(5).func_177974_f()) == plant && worldIn.func_180495_p(pos.func_177970_e(5)) == plant
							&& worldIn.func_180495_p(pos.func_177965_g(5).func_177968_d()) == plant && worldIn.func_180495_p(pos.func_177965_g(5).func_177978_c()) == plant && worldIn.func_180495_p(pos.func_177965_g(5)) == plant
							&& worldIn.func_180495_p(pos.func_177985_f(5).func_177968_d()) == plant && worldIn.func_180495_p(pos.func_177985_f(5).func_177978_c()) == plant && worldIn.func_180495_p(pos.func_177985_f(5)) == plant)
						{
						if(worldIn.func_180495_p(pos.func_177964_d(4).func_177965_g(4)) == nether && worldIn.func_180495_p(pos.func_177964_d(4).func_177965_g(4).func_177984_a()) == elemental && worldIn.func_180495_p(pos.func_177964_d(4).func_177965_g(4).func_177981_b(2)) == elemental && worldIn.func_180495_p(pos.func_177964_d(4).func_177965_g(4).func_177981_b(3)) == nethers
								&& worldIn.func_180495_p(pos.func_177970_e(4).func_177965_g(4)) == nether && worldIn.func_180495_p(pos.func_177970_e(4).func_177965_g(4).func_177984_a()) == elemental && worldIn.func_180495_p(pos.func_177970_e(4).func_177965_g(4).func_177981_b(2)) == elemental && worldIn.func_180495_p(pos.func_177970_e(4).func_177965_g(4).func_177981_b(3)) == nethers
								&& worldIn.func_180495_p(pos.func_177964_d(4).func_177985_f(4)) == nether && worldIn.func_180495_p(pos.func_177964_d(4).func_177985_f(4).func_177984_a()) == elemental && worldIn.func_180495_p(pos.func_177964_d(4).func_177985_f(4).func_177981_b(2)) == elemental && worldIn.func_180495_p(pos.func_177964_d(4).func_177985_f(4).func_177981_b(3)) == nethers
								&& worldIn.func_180495_p(pos.func_177970_e(4).func_177985_f(4)) == nether && worldIn.func_180495_p(pos.func_177970_e(4).func_177985_f(4).func_177984_a()) == elemental && worldIn.func_180495_p(pos.func_177970_e(4).func_177985_f(4).func_177981_b(2)) == elemental && worldIn.func_180495_p(pos.func_177970_e(4).func_177985_f(4).func_177981_b(3)) == nethers)
						{
							if(worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(2)) == nether	
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(2).func_177984_a()) == nether
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(2).func_177981_b(2)) == nether
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(2).func_177981_b(3)) == nether
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(2).func_177981_b(4)) == nethers
								&& worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(2)) == nether
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(2).func_177984_a()) == nether
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(2).func_177981_b(2)) == nether
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(2).func_177981_b(3)) == nether
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(2).func_177981_b(4)) == nethers
								&& worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(1).func_177984_a()) == nethersu
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(1).func_177981_b(2)) == magma
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(1).func_177981_b(3)) == nethers
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(1).func_177981_b(4)) == nether
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(1).func_177981_b(5)) == nether
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177965_g(1).func_177981_b(6)) == nether
								&& worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(1).func_177984_a()) == nethersu
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(1).func_177981_b(2)) == magma
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(1).func_177981_b(3)) == nethers
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(1).func_177981_b(4)) == nether
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(1).func_177981_b(5)) == nether
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177985_f(1).func_177981_b(6)) == nether
								&& worldIn.func_180495_p(pos.func_177964_d(5).func_177981_b(5)) == nethersu
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177981_b(6)) == magma
									&& worldIn.func_180495_p(pos.func_177964_d(5).func_177981_b(7)) == nethers)
							{
								if(worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(2)) == nether	
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(2).func_177984_a()) == nether
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(2).func_177981_b(2)) == nether
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(2).func_177981_b(3)) == nether
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(2).func_177981_b(4)) == nethers
									&& worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(2)) == nether
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(2).func_177984_a()) == nether
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(2).func_177981_b(2)) == nether
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(2).func_177981_b(3)) == nether
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(2).func_177981_b(4)) == nethers
									&& worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(1).func_177984_a()) == nethersu
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(1).func_177981_b(2)) == magma
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(1).func_177981_b(3)) == nethers
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(1).func_177981_b(4)) == nether
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(1).func_177981_b(5)) == nether
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177965_g(1).func_177981_b(6)) == nether
									&& worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(1).func_177984_a()) == nethersu
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(1).func_177981_b(2)) == magma
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(1).func_177981_b(3)) == nethers
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(1).func_177981_b(4)) == nether
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(1).func_177981_b(5)) == nether
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177985_f(1).func_177981_b(6)) == nether
									&& worldIn.func_180495_p(pos.func_177970_e(5).func_177981_b(5)) == nethersu
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177981_b(6)) == magma
										&& worldIn.func_180495_p(pos.func_177970_e(5).func_177981_b(7)) == nethers)
								{
									if(worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(2)) == nether	
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(2).func_177984_a()) == nether
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(2).func_177981_b(2)) == nether
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(2).func_177981_b(3)) == nether
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(2).func_177981_b(4)) == nethers
										&& worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2)) == nether
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2).func_177984_a()) == nether
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2).func_177981_b(2)) == nether
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2).func_177981_b(3)) == nether
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(2).func_177981_b(4)) == nethers
										&& worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(1).func_177984_a()) == nethersu
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(1).func_177981_b(2)) == magma
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(1).func_177981_b(3)) == nethers
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(1).func_177981_b(4)) == nether
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(1).func_177981_b(5)) == nether
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177964_d(1).func_177981_b(6)) == nether
										&& worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(1).func_177984_a()) == nethersu
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(1).func_177981_b(2)) == magma
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(1).func_177981_b(3)) == nethers
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(1).func_177981_b(4)) == nether
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(1).func_177981_b(5)) == nether
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177970_e(1).func_177981_b(6)) == nether
										&& worldIn.func_180495_p(pos.func_177965_g(5).func_177981_b(5)) == nethersu
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177981_b(6)) == magma
											&& worldIn.func_180495_p(pos.func_177965_g(5).func_177981_b(7)) == nethers)
									{
										if(worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(2)) == nether	
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(2).func_177984_a()) == nether
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(2).func_177981_b(2)) == nether
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(2).func_177981_b(3)) == nether
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(2).func_177981_b(4)) == nethers
											&& worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2)) == nether
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2).func_177984_a()) == nether
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2).func_177981_b(2)) == nether
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2).func_177981_b(3)) == nether
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(2).func_177981_b(4)) == nethers
											&& worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(1).func_177984_a()) == nethersu
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(1).func_177981_b(2)) == magma
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(1).func_177981_b(3)) == nethers
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(1).func_177981_b(4)) == nether
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(1).func_177981_b(5)) == nether
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177964_d(1).func_177981_b(6)) == nether
											&& worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(1).func_177984_a()) == nethersu
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(1).func_177981_b(2)) == magma
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(1).func_177981_b(3)) == nethers
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(1).func_177981_b(4)) == nether
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(1).func_177981_b(5)) == nether
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177970_e(1).func_177981_b(6)) == nether
											&& worldIn.func_180495_p(pos.func_177985_f(5).func_177981_b(5)) == nethersu
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177981_b(6)) == magma
												&& worldIn.func_180495_p(pos.func_177985_f(5).func_177981_b(7)) == nethers)
										{
											worldIn.func_175656_a(pos.func_177984_a(), BlockMod.reaper_spawn.func_176223_P());
											worldIn.func_175656_a(pos, Blocks.field_150347_e.func_176223_P());
										}
									}
								}
							}	
						}
					}
				}
			}
		}
	}
}

