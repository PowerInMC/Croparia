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
		this.setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.STONE);
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BlockMod.elemental_cobblestone);
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return 1;
	}

	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) 
	{		
		//Second Ritual
			if(worldIn.getBlockState(pos.down()) == BlockMod.elemental_cobblestone.getDefaultState() && worldIn.getBlockState(pos.down().north()) == BlockMod.elemental_stone.getDefaultState() &&worldIn.getBlockState(pos.down().south()) == BlockMod.elemental_stone.getDefaultState() &&worldIn.getBlockState(pos.down().east())  == BlockMod.elemental_stone.getDefaultState() &&worldIn.getBlockState(pos.down().west())  == BlockMod.elemental_stone.getDefaultState())						
				{
				if(worldIn.getBlockState(pos.north(5)) == BlockMod.block_crop_redstone.getStateFromMeta(7) &&worldIn.getBlockState(pos.south(5)) == BlockMod.block_crop_redstone.getStateFromMeta(7) &&worldIn.getBlockState(pos.east(5))  == BlockMod.block_crop_redstone.getStateFromMeta(7) &&worldIn.getBlockState(pos.west(5))  == BlockMod.block_crop_redstone.getStateFromMeta(7))	
				{
					if(worldIn.getBlockState(pos.north(3).west(3)) == BlockMod.elemental_crop.getStateFromMeta(7) &&worldIn.getBlockState(pos.north(3).east(3)) == BlockMod.elemental_crop.getStateFromMeta(7) &&worldIn.getBlockState(pos.south(3).west(3))  == BlockMod.elemental_crop.getStateFromMeta(7) &&worldIn.getBlockState(pos.south(3).east(3))  == BlockMod.elemental_crop.getStateFromMeta(7))
						{
						if(worldIn.getBlockState(pos.down().north(4).west()) == Blocks.WATER.getDefaultState() &&worldIn.getBlockState(pos.down().north(4).east()) == Blocks.WATER.getDefaultState() &&worldIn.getBlockState(pos.down().south(4).west())  == Blocks.WATER.getDefaultState() &&worldIn.getBlockState(pos.down().south(4).east())  == Blocks.WATER.getDefaultState())
						
							{
							if(worldIn.getBlockState(pos.down().west(4).north()) == Blocks.WATER.getDefaultState() &&worldIn.getBlockState(pos.down().west(4).south()) == Blocks.WATER.getDefaultState() &&worldIn.getBlockState(pos.down().east(4).north())  == Blocks.WATER.getDefaultState() &&worldIn.getBlockState(pos.down().east(4).south())  == Blocks.WATER.getDefaultState())
							
								{
								if(worldIn.getBlockState(pos.north(4).west(4)) == Blocks.STONE.getStateFromMeta(6) && worldIn.getBlockState(pos.up().north(4).west(4)) == BlockMod.elemental_stone.getDefaultState() && worldIn.getBlockState(pos.up(2).north(4).west(4)) == Blocks.STONE.getStateFromMeta(6))
							
									{
									if(worldIn.getBlockState(pos.north(4).east(4)) == Blocks.STONE.getStateFromMeta(6) && worldIn.getBlockState(pos.up().north(4).east(4)) == BlockMod.elemental_stone.getDefaultState() && worldIn.getBlockState(pos.up(2).north(4).east(4)) == Blocks.STONE.getStateFromMeta(6))
									
										{
										if(worldIn.getBlockState(pos.south(4).west(4)) == Blocks.STONE.getStateFromMeta(6) && worldIn.getBlockState(pos.up().south(4).west(4)) == BlockMod.elemental_stone.getDefaultState() && worldIn.getBlockState(pos.up(2).south(4).west(4)) == Blocks.STONE.getStateFromMeta(6))
										
											{
											if(worldIn.getBlockState(pos.south(4).east(4)) == Blocks.STONE.getStateFromMeta(6) && worldIn.getBlockState(pos.up().south(4).east(4)) == BlockMod.elemental_stone.getDefaultState() && worldIn.getBlockState(pos.up(2).south(4).east(4)) == Blocks.STONE.getStateFromMeta(6))
											
												{
												if(worldIn.getBlockState(pos.north(5).east(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.north(5).west(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up().north(5).east(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up().north(5).west(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(2).north(5).east(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(2).north(5).west(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).north(5).east(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).north(5).west(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).north(5).east()) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).north(5).west()) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).north(5)) == BlockMod.water_block.getDefaultState())
												
													{
													if(worldIn.getBlockState(pos.south(5).east(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.south(5).west(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up().south(5).east(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up().south(5).west(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(2).south(5).east(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(2).south(5).west(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).south(5).east(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).south(5).west(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).south(5).east()) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).south(5).west()) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).south(5)) == BlockMod.fire_block.getDefaultState())
													
														{
														if(worldIn.getBlockState(pos.west(5).north(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.west(5).south(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up().west(5).north(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up().west(5).south(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(2).west(5).north(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(2).west(5).south(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).west(5).north(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).west(5).south(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).west(5).north()) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).west(5).south()) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).west(5)) == BlockMod.earth_block.getDefaultState())
														
															{
															if(worldIn.getBlockState(pos.east(5).north(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.east(5).south(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up().east(5).north(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up().east(5).south(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(2).east(5).north(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(2).east(5).south(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).east(5).north(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).east(5).south(2)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).east(5).north()) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).east(5).south()) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up(3).east(5)) == BlockMod.air_block.getDefaultState())
															
																{
																if(worldIn.getBlockState(pos.north(2).east(2)) == BlockMod.fire_block.getDefaultState() && worldIn.getBlockState(pos.north(2).west(2)) == BlockMod.fire_block.getDefaultState() && worldIn.getBlockState(pos.south(2).west(2)) == BlockMod.fire_block.getDefaultState() && worldIn.getBlockState(pos.south(2).east(2)) == BlockMod.fire_block.getDefaultState())
																	{
																		worldIn.setBlockState(pos.up(2), BlockMod.minotaur_spawn.getDefaultState());
																		worldIn.spawnEntity(new EntityLightningBolt(worldIn, pos.getX(), pos.getY() + 2, pos.getZ(), false));
																		worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
																		worldIn.setBlockState(pos.north(2).west(2), Blocks.AIR.getDefaultState());
																		worldIn.setBlockState(pos.north(2).east(2), Blocks.AIR.getDefaultState());
																		worldIn.setBlockState(pos.south(2).east(2), Blocks.AIR.getDefaultState());
																		worldIn.setBlockState(pos.south(2).west(2), Blocks.AIR.getDefaultState());
																	}
																
																else if(worldIn.getBlockState(pos.north(2).east(2)) == BlockMod.water_block.getDefaultState() && worldIn.getBlockState(pos.north(2).west(2)) == BlockMod.water_block.getDefaultState() && worldIn.getBlockState(pos.south(2).west(2)) == BlockMod.water_block.getDefaultState() && worldIn.getBlockState(pos.south(2).east(2)) == BlockMod.water_block.getDefaultState())
																	{
																		worldIn.setBlockState(pos.up(2), BlockMod.seafarer_spawn.getDefaultState());	
																		worldIn.spawnEntity(new EntityLightningBolt(worldIn, pos.getX(), pos.getY() + 2, pos.getZ(), false));
																		worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
																		worldIn.setBlockState(pos.north(2).west(2), Blocks.AIR.getDefaultState());
																		worldIn.setBlockState(pos.north(2).east(2), Blocks.AIR.getDefaultState());
																		worldIn.setBlockState(pos.south(2).east(2), Blocks.AIR.getDefaultState());
																		worldIn.setBlockState(pos.south(2).west(2), Blocks.AIR.getDefaultState());
																	}	
																
																else if(worldIn.getBlockState(pos.north(2).east(2)) == BlockMod.earth_block.getDefaultState() && worldIn.getBlockState(pos.north(2).west(2)) == BlockMod.earth_block.getDefaultState() && worldIn.getBlockState(pos.south(2).west(2)) == BlockMod.earth_block.getDefaultState() && worldIn.getBlockState(pos.south(2).east(2)) == BlockMod.earth_block.getDefaultState())
																{
																	worldIn.setBlockState(pos.up(2), BlockMod.centaur_spawn.getDefaultState());	
																	worldIn.spawnEntity(new EntityLightningBolt(worldIn, pos.getX(), pos.getY() + 2, pos.getZ(), false));
																	worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
																	worldIn.setBlockState(pos.north(2).west(2), Blocks.AIR.getDefaultState());
																	worldIn.setBlockState(pos.north(2).east(2), Blocks.AIR.getDefaultState());
																	worldIn.setBlockState(pos.south(2).east(2), Blocks.AIR.getDefaultState());
																	worldIn.setBlockState(pos.south(2).west(2), Blocks.AIR.getDefaultState());
																}
																
																else if(worldIn.getBlockState(pos.north(2).east(2)) == BlockMod.air_block.getDefaultState() && worldIn.getBlockState(pos.north(2).west(2)) == BlockMod.air_block.getDefaultState() && worldIn.getBlockState(pos.south(2).west(2)) == BlockMod.air_block.getDefaultState() && worldIn.getBlockState(pos.south(2).east(2)) == BlockMod.air_block.getDefaultState())
																{
																	worldIn.setBlockState(pos.up(2), BlockMod.flyingbeast_spawn.getDefaultState());
																	worldIn.spawnEntity(new EntityLightningBolt(worldIn, pos.getX(), pos.getY() + 2, pos.getZ(), false));
																	worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
																	worldIn.setBlockState(pos.north(2).west(2), Blocks.AIR.getDefaultState());
																	worldIn.setBlockState(pos.north(2).east(2), Blocks.AIR.getDefaultState());
																	worldIn.setBlockState(pos.south(2).east(2), Blocks.AIR.getDefaultState());
																	worldIn.setBlockState(pos.south(2).west(2), Blocks.AIR.getDefaultState());
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
			if(worldIn.getBlockState(pos.down()) == BlockMod.elemental_cobblestone.getDefaultState() && !worldIn.isRemote)
			{
				if(worldIn.getBlockState(pos.north().east()) == BlockMod.block_crop_iron.getStateFromMeta(7) && worldIn.getBlockState(pos.north().west()) == BlockMod.block_crop_iron.getStateFromMeta(7) && worldIn.getBlockState(pos.south().east()) == BlockMod.block_crop_iron.getStateFromMeta(7) && worldIn.getBlockState(pos.south().west()) == BlockMod.block_crop_iron.getStateFromMeta(7))
				{
					if(worldIn.getBlockState(pos.north(3)) == BlockMod.block_crop_gold.getStateFromMeta(7) && 	worldIn.getBlockState(pos.south(3)) == BlockMod.block_crop_gold.getStateFromMeta(7) && worldIn.getBlockState(pos.east(3)) == BlockMod.block_crop_gold.getStateFromMeta(7) && worldIn.getBlockState(pos.west(3)) == BlockMod.block_crop_gold.getStateFromMeta(7))
					{
						if(worldIn.getBlockState(pos.down().north(2).west(2)) == Blocks.WATER.getDefaultState() && worldIn.getBlockState(pos.down().north(2).east(2)) == Blocks.WATER.getDefaultState() && worldIn.getBlockState(pos.down().south(2).west(2)) == Blocks.WATER.getDefaultState() && worldIn.getBlockState(pos.down().south(2).east(2)) == Blocks.WATER.getDefaultState())
						{			
							if(worldIn.getBlockState(pos.north(4).east()) == Blocks.STONE.getStateFromMeta(3) && worldIn.getBlockState(pos.north(4).west()) == Blocks.STONE.getStateFromMeta(3) && worldIn.getBlockState(pos.south(4).east()) == Blocks.STONE.getStateFromMeta(3) && worldIn.getBlockState(pos.south(4).west()) == Blocks.STONE.getStateFromMeta(3) && worldIn.getBlockState(pos.west(4).north()) == Blocks.STONE.getStateFromMeta(3) && worldIn.getBlockState(pos.west(4).south()) == Blocks.STONE.getStateFromMeta(3) && worldIn.getBlockState(pos.east(4).north()) == Blocks.STONE.getStateFromMeta(3) && worldIn.getBlockState(pos.east(4).south()) == Blocks.STONE.getStateFromMeta(3))
							{
								if(worldIn.getBlockState(pos.north(3).east(3)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.north(3).west(3)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.south(3).east(3)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.south(3).west(3)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up().west(3).north(3)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up().west(3).south(3)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up().east(3).north(3)) == Blocks.STONE.getStateFromMeta(5) && worldIn.getBlockState(pos.up().east(3).south(3)) == Blocks.STONE.getStateFromMeta(5))
								{
									if(worldIn.getBlockState(pos.down().north()) == Blocks.GOLD_BLOCK.getDefaultState() && worldIn.getBlockState(pos.down().east()) == Blocks.GOLD_BLOCK.getDefaultState() && worldIn.getBlockState(pos.down().south()) == Blocks.GOLD_BLOCK.getDefaultState() && worldIn.getBlockState(pos.down().west()) == Blocks.GOLD_BLOCK.getDefaultState())
									{
										/*if(placer.getHeldItemOffhand().getItem() == Items.EGG)
										{						
											EntityGoldenChicken e = new EntityGoldenChicken(worldIn);

											e.setPosition(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
											placer.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, new ItemStack(Blocks.AIR));
											worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());	
											worldIn.spawnEntity(e);
										}*/
										if(placer.getHeldItemOffhand().getItem() == Items.APPLE)
										{						
											worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());	
											worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ItemMod.infinite_apple)));																											
										
										}
										else
										{
											worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());	
											worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ItemMod.midas_hand)));																											
										}
										worldIn.setBlockState(pos.down().north(), Blocks.AIR.getDefaultState());
										worldIn.setBlockState(pos.down().east(), Blocks.AIR.getDefaultState());
										worldIn.setBlockState(pos.down().south(), Blocks.AIR.getDefaultState());
										worldIn.setBlockState(pos.down().west(), Blocks.AIR.getDefaultState());
									}
									if(worldIn.getBlockState(pos.down().north()) == Blocks.NETHER_WART_BLOCK.getDefaultState() && worldIn.getBlockState(pos.down().east()) == Blocks.NETHER_WART_BLOCK.getDefaultState() && worldIn.getBlockState(pos.down().south()) == Blocks.NETHER_WART_BLOCK.getDefaultState() && worldIn.getBlockState(pos.down().west()) == Blocks.NETHER_WART_BLOCK.getDefaultState())
									{
										worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());	
										worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ItemMod.horn_plenty)));																											
										worldIn.setBlockState(pos.down().north(), Blocks.AIR.getDefaultState());
										worldIn.setBlockState(pos.down().east(), Blocks.AIR.getDefaultState());
										worldIn.setBlockState(pos.down().south(), Blocks.AIR.getDefaultState());
										worldIn.setBlockState(pos.down().west(), Blocks.AIR.getDefaultState());
									}
									if(worldIn.getBlockState(pos.down().north()).getBlock() == Blocks.BONE_BLOCK && worldIn.getBlockState(pos.down().east()).getBlock() == Blocks.BONE_BLOCK && worldIn.getBlockState(pos.down().south()).getBlock() == Blocks.BONE_BLOCK && worldIn.getBlockState(pos.down().west()).getBlock() == Blocks.BONE_BLOCK && placer.getHeldItemOffhand().getItem() == Items.WATER_BUCKET)
									{
										worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());	
										worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ItemMod.water_can)));																											
										worldIn.setBlockState(pos.down().north(), Blocks.AIR.getDefaultState());
										worldIn.setBlockState(pos.down().east(), Blocks.AIR.getDefaultState());
										worldIn.setBlockState(pos.down().south(), Blocks.AIR.getDefaultState());
										worldIn.setBlockState(pos.down().west(), Blocks.AIR.getDefaultState());
									}
									if(ConfigInit.death == true)
									{
										if(worldIn.getBlockState(pos.down().north()) == BlockMod.block_crop_diamond.getStateFromMeta(7) && worldIn.getBlockState(pos.down().east()) == BlockMod.block_crop_diamond.getStateFromMeta(7) && worldIn.getBlockState(pos.down().south()) == BlockMod.block_crop_diamond.getStateFromMeta(7) && worldIn.getBlockState(pos.down().west()) == BlockMod.block_crop_diamond.getStateFromMeta(7))									
										{
											worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());	
											worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ItemMod.seed_crop_death)));																											
											worldIn.setBlockState(pos.down().north(), Blocks.AIR.getDefaultState());
											worldIn.setBlockState(pos.down().east(), Blocks.AIR.getDefaultState());
											worldIn.setBlockState(pos.down().south(), Blocks.AIR.getDefaultState());
											worldIn.setBlockState(pos.down().west(), Blocks.AIR.getDefaultState());
										}
									}
									
								}
							}
						}
					}
				}
			}	
			IBlockState soulsand = Blocks.SOUL_SAND.getDefaultState();
			IBlockState elemental = BlockMod.elemental_cobblestone.getDefaultState();
			IBlockState slab = Blocks.STONE_SLAB.getStateFromMeta(3);
			IBlockState lave = Blocks.LAVA.getDefaultState();
			IBlockState plant = BlockMod.block_crop_death.getStateFromMeta(7);
			IBlockState nether = Blocks.NETHER_BRICK.getDefaultState();
			IBlockState stone = BlockMod.elemental_stone.getDefaultState();
			IBlockState nethers = Blocks.STONE_SLAB.getStateFromMeta(6);
			IBlockState nethersu = Blocks.STONE_SLAB.getStateFromMeta(14);
			IBlockState magma = Blocks.MAGMA.getDefaultState();
			//Death ritual
			if(!worldIn.isRemote && worldIn.getBlockState(pos.down()) == elemental && worldIn.getBlockState(pos.down().north(2)) == soulsand && worldIn.getBlockState(pos.down().south(2)) == soulsand && worldIn.getBlockState(pos.down().east(2)) == soulsand && worldIn.getBlockState(pos.down().west(2)) == soulsand && worldIn.getBlockState(pos.down().north().west()) == soulsand && worldIn.getBlockState(pos.down().north().east()) == soulsand && worldIn.getBlockState(pos.down().south().west()) == soulsand && worldIn.getBlockState(pos.down().south().east()) == soulsand)
			{
				if(worldIn.getBlockState(pos.north()) == slab && worldIn.getBlockState(pos.south()) == slab && worldIn.getBlockState(pos.east()) == slab && worldIn.getBlockState(pos.west()) == slab)
				{
					if(worldIn.getBlockState(pos.down().north(4).west()) == lave && worldIn.getBlockState(pos.down().north(4).east()) == lave
							&& worldIn.getBlockState(pos.down().south(4).west()) == lave && worldIn.getBlockState(pos.down().south(4).east()) == lave
							&& worldIn.getBlockState(pos.down().east(4).south()) == lave && worldIn.getBlockState(pos.down().east(4).north()) == lave
							&& worldIn.getBlockState(pos.down().west(4).south()) == lave && worldIn.getBlockState(pos.down().west(4).north()) == lave)
					{	
					if(worldIn.getBlockState(pos.north(5).west()) == plant && worldIn.getBlockState(pos.north(5).east()) == plant && worldIn.getBlockState(pos.north(5)) == plant
							&& worldIn.getBlockState(pos.south(5).west()) == plant && worldIn.getBlockState(pos.south(5).east()) == plant && worldIn.getBlockState(pos.south(5)) == plant
							&& worldIn.getBlockState(pos.east(5).south()) == plant && worldIn.getBlockState(pos.east(5).north()) == plant && worldIn.getBlockState(pos.east(5)) == plant
							&& worldIn.getBlockState(pos.west(5).south()) == plant && worldIn.getBlockState(pos.west(5).north()) == plant && worldIn.getBlockState(pos.west(5)) == plant)
						{
						if(worldIn.getBlockState(pos.north(4).east(4)) == nether && worldIn.getBlockState(pos.north(4).east(4).up()) == elemental && worldIn.getBlockState(pos.north(4).east(4).up(2)) == elemental && worldIn.getBlockState(pos.north(4).east(4).up(3)) == nethers
								&& worldIn.getBlockState(pos.south(4).east(4)) == nether && worldIn.getBlockState(pos.south(4).east(4).up()) == elemental && worldIn.getBlockState(pos.south(4).east(4).up(2)) == elemental && worldIn.getBlockState(pos.south(4).east(4).up(3)) == nethers
								&& worldIn.getBlockState(pos.north(4).west(4)) == nether && worldIn.getBlockState(pos.north(4).west(4).up()) == elemental && worldIn.getBlockState(pos.north(4).west(4).up(2)) == elemental && worldIn.getBlockState(pos.north(4).west(4).up(3)) == nethers
								&& worldIn.getBlockState(pos.south(4).west(4)) == nether && worldIn.getBlockState(pos.south(4).west(4).up()) == elemental && worldIn.getBlockState(pos.south(4).west(4).up(2)) == elemental && worldIn.getBlockState(pos.south(4).west(4).up(3)) == nethers)
						{
							if(worldIn.getBlockState(pos.north(5).east(2)) == nether	
									&& worldIn.getBlockState(pos.north(5).east(2).up()) == nether
									&& worldIn.getBlockState(pos.north(5).east(2).up(2)) == nether
									&& worldIn.getBlockState(pos.north(5).east(2).up(3)) == nether
									&& worldIn.getBlockState(pos.north(5).east(2).up(4)) == nethers
								&& worldIn.getBlockState(pos.north(5).west(2)) == nether
									&& worldIn.getBlockState(pos.north(5).west(2).up()) == nether
									&& worldIn.getBlockState(pos.north(5).west(2).up(2)) == nether
									&& worldIn.getBlockState(pos.north(5).west(2).up(3)) == nether
									&& worldIn.getBlockState(pos.north(5).west(2).up(4)) == nethers
								&& worldIn.getBlockState(pos.north(5).east(1).up()) == nethersu
									&& worldIn.getBlockState(pos.north(5).east(1).up(2)) == magma
									&& worldIn.getBlockState(pos.north(5).east(1).up(3)) == nethers
									&& worldIn.getBlockState(pos.north(5).east(1).up(4)) == nether
									&& worldIn.getBlockState(pos.north(5).east(1).up(5)) == nether
									&& worldIn.getBlockState(pos.north(5).east(1).up(6)) == nether
								&& worldIn.getBlockState(pos.north(5).west(1).up()) == nethersu
									&& worldIn.getBlockState(pos.north(5).west(1).up(2)) == magma
									&& worldIn.getBlockState(pos.north(5).west(1).up(3)) == nethers
									&& worldIn.getBlockState(pos.north(5).west(1).up(4)) == nether
									&& worldIn.getBlockState(pos.north(5).west(1).up(5)) == nether
									&& worldIn.getBlockState(pos.north(5).west(1).up(6)) == nether
								&& worldIn.getBlockState(pos.north(5).up(5)) == nethersu
									&& worldIn.getBlockState(pos.north(5).up(6)) == magma
									&& worldIn.getBlockState(pos.north(5).up(7)) == nethers)
							{
								if(worldIn.getBlockState(pos.south(5).east(2)) == nether	
										&& worldIn.getBlockState(pos.south(5).east(2).up()) == nether
										&& worldIn.getBlockState(pos.south(5).east(2).up(2)) == nether
										&& worldIn.getBlockState(pos.south(5).east(2).up(3)) == nether
										&& worldIn.getBlockState(pos.south(5).east(2).up(4)) == nethers
									&& worldIn.getBlockState(pos.south(5).west(2)) == nether
										&& worldIn.getBlockState(pos.south(5).west(2).up()) == nether
										&& worldIn.getBlockState(pos.south(5).west(2).up(2)) == nether
										&& worldIn.getBlockState(pos.south(5).west(2).up(3)) == nether
										&& worldIn.getBlockState(pos.south(5).west(2).up(4)) == nethers
									&& worldIn.getBlockState(pos.south(5).east(1).up()) == nethersu
										&& worldIn.getBlockState(pos.south(5).east(1).up(2)) == magma
										&& worldIn.getBlockState(pos.south(5).east(1).up(3)) == nethers
										&& worldIn.getBlockState(pos.south(5).east(1).up(4)) == nether
										&& worldIn.getBlockState(pos.south(5).east(1).up(5)) == nether
										&& worldIn.getBlockState(pos.south(5).east(1).up(6)) == nether
									&& worldIn.getBlockState(pos.south(5).west(1).up()) == nethersu
										&& worldIn.getBlockState(pos.south(5).west(1).up(2)) == magma
										&& worldIn.getBlockState(pos.south(5).west(1).up(3)) == nethers
										&& worldIn.getBlockState(pos.south(5).west(1).up(4)) == nether
										&& worldIn.getBlockState(pos.south(5).west(1).up(5)) == nether
										&& worldIn.getBlockState(pos.south(5).west(1).up(6)) == nether
									&& worldIn.getBlockState(pos.south(5).up(5)) == nethersu
										&& worldIn.getBlockState(pos.south(5).up(6)) == magma
										&& worldIn.getBlockState(pos.south(5).up(7)) == nethers)
								{
									if(worldIn.getBlockState(pos.east(5).north(2)) == nether	
											&& worldIn.getBlockState(pos.east(5).north(2).up()) == nether
											&& worldIn.getBlockState(pos.east(5).north(2).up(2)) == nether
											&& worldIn.getBlockState(pos.east(5).north(2).up(3)) == nether
											&& worldIn.getBlockState(pos.east(5).north(2).up(4)) == nethers
										&& worldIn.getBlockState(pos.east(5).south(2)) == nether
											&& worldIn.getBlockState(pos.east(5).south(2).up()) == nether
											&& worldIn.getBlockState(pos.east(5).south(2).up(2)) == nether
											&& worldIn.getBlockState(pos.east(5).south(2).up(3)) == nether
											&& worldIn.getBlockState(pos.east(5).south(2).up(4)) == nethers
										&& worldIn.getBlockState(pos.east(5).north(1).up()) == nethersu
											&& worldIn.getBlockState(pos.east(5).north(1).up(2)) == magma
											&& worldIn.getBlockState(pos.east(5).north(1).up(3)) == nethers
											&& worldIn.getBlockState(pos.east(5).north(1).up(4)) == nether
											&& worldIn.getBlockState(pos.east(5).north(1).up(5)) == nether
											&& worldIn.getBlockState(pos.east(5).north(1).up(6)) == nether
										&& worldIn.getBlockState(pos.east(5).south(1).up()) == nethersu
											&& worldIn.getBlockState(pos.east(5).south(1).up(2)) == magma
											&& worldIn.getBlockState(pos.east(5).south(1).up(3)) == nethers
											&& worldIn.getBlockState(pos.east(5).south(1).up(4)) == nether
											&& worldIn.getBlockState(pos.east(5).south(1).up(5)) == nether
											&& worldIn.getBlockState(pos.east(5).south(1).up(6)) == nether
										&& worldIn.getBlockState(pos.east(5).up(5)) == nethersu
											&& worldIn.getBlockState(pos.east(5).up(6)) == magma
											&& worldIn.getBlockState(pos.east(5).up(7)) == nethers)
									{
										if(worldIn.getBlockState(pos.west(5).north(2)) == nether	
												&& worldIn.getBlockState(pos.west(5).north(2).up()) == nether
												&& worldIn.getBlockState(pos.west(5).north(2).up(2)) == nether
												&& worldIn.getBlockState(pos.west(5).north(2).up(3)) == nether
												&& worldIn.getBlockState(pos.west(5).north(2).up(4)) == nethers
											&& worldIn.getBlockState(pos.west(5).south(2)) == nether
												&& worldIn.getBlockState(pos.west(5).south(2).up()) == nether
												&& worldIn.getBlockState(pos.west(5).south(2).up(2)) == nether
												&& worldIn.getBlockState(pos.west(5).south(2).up(3)) == nether
												&& worldIn.getBlockState(pos.west(5).south(2).up(4)) == nethers
											&& worldIn.getBlockState(pos.west(5).north(1).up()) == nethersu
												&& worldIn.getBlockState(pos.west(5).north(1).up(2)) == magma
												&& worldIn.getBlockState(pos.west(5).north(1).up(3)) == nethers
												&& worldIn.getBlockState(pos.west(5).north(1).up(4)) == nether
												&& worldIn.getBlockState(pos.west(5).north(1).up(5)) == nether
												&& worldIn.getBlockState(pos.west(5).north(1).up(6)) == nether
											&& worldIn.getBlockState(pos.west(5).south(1).up()) == nethersu
												&& worldIn.getBlockState(pos.west(5).south(1).up(2)) == magma
												&& worldIn.getBlockState(pos.west(5).south(1).up(3)) == nethers
												&& worldIn.getBlockState(pos.west(5).south(1).up(4)) == nether
												&& worldIn.getBlockState(pos.west(5).south(1).up(5)) == nether
												&& worldIn.getBlockState(pos.west(5).south(1).up(6)) == nether
											&& worldIn.getBlockState(pos.west(5).up(5)) == nethersu
												&& worldIn.getBlockState(pos.west(5).up(6)) == magma
												&& worldIn.getBlockState(pos.west(5).up(7)) == nethers)
										{
											worldIn.setBlockState(pos.up(), BlockMod.reaper_spawn.getDefaultState());
											worldIn.setBlockState(pos, Blocks.COBBLESTONE.getDefaultState());
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

