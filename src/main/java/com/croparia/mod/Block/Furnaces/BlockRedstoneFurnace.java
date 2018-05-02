package com.croparia.mod.Block.Furnaces;

import java.util.Random;

import com.croparia.mod.Block.TileEntity.TileEntityRedstoneFurnace;
import com.croparia.mod.Init.BlockMod;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockRedstoneFurnace extends BlockContainer {

	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	private final boolean isBurning;
	private static boolean keepInventory;

	public BlockRedstoneFurnace(boolean isBurning, String name) {
		super(Material.ROCK);
		setUnlocalizedName(name);
		setHardness(5F);
		setResistance(10F);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		this.isBurning = isBurning;
		setSoundType(SoundType.METAL);

	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BlockMod.redstone_furnace);
	}

	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		setDefaultFacing(worldIn, pos, state);
	}

	private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state) {
		if (worldIn.isRemote)
			return;
		IBlockState iblockstate = worldIn.getBlockState(pos.north());
		IBlockState iblockstate1 = worldIn.getBlockState(pos.south());
		IBlockState iblockstate2 = worldIn.getBlockState(pos.west());
		IBlockState iblockstate3 = worldIn.getBlockState(pos.east());
		EnumFacing enumfacing = (EnumFacing) state.getValue(FACING);

		if ((enumfacing == EnumFacing.NORTH) && (iblockstate.isFullBlock()) && (!(iblockstate1.isFullBlock()))) {
			enumfacing = EnumFacing.SOUTH;
		} else if ((enumfacing == EnumFacing.SOUTH) && (iblockstate1.isFullBlock()) && (!(iblockstate.isFullBlock()))) {
			enumfacing = EnumFacing.NORTH;
		} else if ((enumfacing == EnumFacing.WEST) && (iblockstate2.isFullBlock()) && (!(iblockstate3.isFullBlock()))) {
			enumfacing = EnumFacing.EAST;
		} else if ((enumfacing == EnumFacing.EAST) && (iblockstate3.isFullBlock()) && (!(iblockstate2.isFullBlock()))) {
			enumfacing = EnumFacing.WEST;
		}

		worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
	}

	@SuppressWarnings("incomplete-switch")
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		if (!(this.isBurning))
			return;
		EnumFacing enumfacing = (EnumFacing) stateIn.getValue(FACING);
		double d0 = pos.getX() + 0.5D;
		double d1 = pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
		double d2 = pos.getZ() + 0.5D;
		double d3 = 0.52D;
		double d4 = rand.nextDouble() * 0.6D - 0.3D;

		if (rand.nextDouble() < 0.1D) {
			worldIn.playSound(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE,
					SoundCategory.BLOCKS, 1.0F, 1.0F, false);
		}

		switch (enumfacing) {
		case WEST:
			worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D,
					new int[0]);
			worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
			break;
		case EAST:
			worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D,
					new int[0]);
			worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
			break;
		case NORTH:
			worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - 0.52D, 0.0D, 0.0D, 0.0D,
					new int[0]);
			worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 - 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
			break;
		case SOUTH:
			worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D,
					new int[0]);
			worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
		}
	}

	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (worldIn.isRemote) {
			return true;
		}

		TileEntity tileentity = worldIn.getTileEntity(pos);

		if (tileentity instanceof TileEntityRedstoneFurnace) {
			playerIn.displayGUIChest((TileEntityRedstoneFurnace) tileentity);
			playerIn.addStat(StatList.FURNACE_INTERACTION);
		}

		return true;
	}

	public static void setState(boolean active, World worldIn, BlockPos pos) {
		IBlockState iblockstate = worldIn.getBlockState(pos);
		TileEntity tileentity = worldIn.getTileEntity(pos);
		keepInventory = true;

		if (active) {
			worldIn.setBlockState(pos,
					BlockMod.lit_redstone_furnace.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
			worldIn.setBlockState(pos,
					BlockMod.lit_redstone_furnace.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
		} else {
			worldIn.setBlockState(pos,
					BlockMod.redstone_furnace.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
			worldIn.setBlockState(pos,
					BlockMod.redstone_furnace.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
		}

		keepInventory = false;

		if (tileentity == null)
			return;
		tileentity.validate();
		worldIn.setTileEntity(pos, tileentity);
	}

	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityRedstoneFurnace();
	}

	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY,
			float hitZ, int meta, EntityLivingBase placer) {
		return getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
			ItemStack stack) {
		worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);

		if (!(stack.hasDisplayName()))
			return;
		TileEntity tileentity = worldIn.getTileEntity(pos);

		if (!(tileentity instanceof TileEntityRedstoneFurnace))
			return;
		((TileEntityRedstoneFurnace) tileentity).setCustomInventoryName(stack.getDisplayName());
	}

	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		if (!(keepInventory)) {
			TileEntity tileentity = worldIn.getTileEntity(pos);

			if (tileentity instanceof TileEntityRedstoneFurnace) {
				InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityRedstoneFurnace) tileentity);
				worldIn.updateComparatorOutputLevel(pos, this);
			}
		}

		super.breakBlock(worldIn, pos, state);
	}

	public boolean hasComparatorInputOverride(IBlockState state) {
		return true;
	}

	public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
		return Container.calcRedstone(worldIn.getTileEntity(pos));
	}

	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(BlockMod.redstone_furnace);
	}

	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	public IBlockState getStateFromMeta(int meta) {
		EnumFacing enumfacing = EnumFacing.getFront(meta);

		if (enumfacing.getAxis() == EnumFacing.Axis.Y) {
			enumfacing = EnumFacing.NORTH;
		}

		return getDefaultState().withProperty(FACING, enumfacing);
	}

	public int getMetaFromState(IBlockState state) {
		return ((EnumFacing) state.getValue(FACING)).getIndex();
	}

	public IBlockState withRotation(IBlockState state, Rotation rot) {
		return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
	}

	public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
		return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
	}

	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { FACING });
	}
}
