package com.croparia.mod.Block.Furnaces;

import java.util.Random;

import com.croparia.mod.Block.TileEntity.TileEntityDiamondFurnace;
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

public class BlockDiamondFurnace extends BlockContainer {

	public static final PropertyDirection FACING = BlockHorizontal.field_185512_D;
	private final boolean isBurning;
	private static boolean keepInventory;

	public BlockDiamondFurnace(boolean isBurning, String name) {
		super(Material.field_151576_e);
		func_149663_c(name);
		func_149711_c(5F);
		func_149752_b(10F);
		this.func_180632_j(this.field_176227_L.func_177621_b().func_177226_a(FACING, EnumFacing.NORTH));
		this.isBurning = isBurning;
		func_149672_a(SoundType.field_185852_e);

	}

	public Item func_180660_a(IBlockState state, Random rand, int fortune) {
		return Item.func_150898_a(BlockMod.diamond_furnace);
	}

	public void func_176213_c(World worldIn, BlockPos pos, IBlockState state) {
		setDefaultFacing(worldIn, pos, state);
	}

	private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state) {
		if (worldIn.field_72995_K)
			return;
		IBlockState iblockstate = worldIn.func_180495_p(pos.func_177978_c());
		IBlockState iblockstate1 = worldIn.func_180495_p(pos.func_177968_d());
		IBlockState iblockstate2 = worldIn.func_180495_p(pos.func_177976_e());
		IBlockState iblockstate3 = worldIn.func_180495_p(pos.func_177974_f());
		EnumFacing enumfacing = (EnumFacing) state.func_177229_b(FACING);

		if ((enumfacing == EnumFacing.NORTH) && (iblockstate.func_185913_b()) && (!(iblockstate1.func_185913_b()))) {
			enumfacing = EnumFacing.SOUTH;
		} else if ((enumfacing == EnumFacing.SOUTH) && (iblockstate1.func_185913_b()) && (!(iblockstate.func_185913_b()))) {
			enumfacing = EnumFacing.NORTH;
		} else if ((enumfacing == EnumFacing.WEST) && (iblockstate2.func_185913_b()) && (!(iblockstate3.func_185913_b()))) {
			enumfacing = EnumFacing.EAST;
		} else if ((enumfacing == EnumFacing.EAST) && (iblockstate3.func_185913_b()) && (!(iblockstate2.func_185913_b()))) {
			enumfacing = EnumFacing.WEST;
		}

		worldIn.func_180501_a(pos, state.func_177226_a(FACING, enumfacing), 2);
	}

	@SuppressWarnings("incomplete-switch")
	@SideOnly(Side.CLIENT)
	public void func_180655_c(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		if (!(this.isBurning))
			return;
		EnumFacing enumfacing = (EnumFacing) stateIn.func_177229_b(FACING);
		double d0 = pos.func_177958_n() + 0.5D;
		double d1 = pos.func_177956_o() + rand.nextDouble() * 6.0D / 16.0D;
		double d2 = pos.func_177952_p() + 0.5D;
		double d3 = 0.52D;
		double d4 = rand.nextDouble() * 0.6D - 0.3D;

		if (rand.nextDouble() < 0.1D) {
			worldIn.func_184134_a(pos.func_177958_n() + 0.5D, pos.func_177956_o(), pos.func_177952_p() + 0.5D, SoundEvents.field_187652_bv,
					SoundCategory.BLOCKS, 1.0F, 1.0F, false);
		}

		switch (enumfacing) {
		case WEST:
			worldIn.func_175688_a(EnumParticleTypes.SMOKE_NORMAL, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D,
					new int[0]);
			worldIn.func_175688_a(EnumParticleTypes.FLAME, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
			break;
		case EAST:
			worldIn.func_175688_a(EnumParticleTypes.SMOKE_NORMAL, d0 + 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D,
					new int[0]);
			worldIn.func_175688_a(EnumParticleTypes.FLAME, d0 + 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
			break;
		case NORTH:
			worldIn.func_175688_a(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - 0.52D, 0.0D, 0.0D, 0.0D,
					new int[0]);
			worldIn.func_175688_a(EnumParticleTypes.FLAME, d0 + d4, d1, d2 - 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
			break;
		case SOUTH:
			worldIn.func_175688_a(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D,
					new int[0]);
			worldIn.func_175688_a(EnumParticleTypes.FLAME, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
		}
	}

	public boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (worldIn.field_72995_K) {
			return true;
		}

		TileEntity tileentity = worldIn.func_175625_s(pos);

		if (tileentity instanceof TileEntityDiamondFurnace) {
			playerIn.func_71007_a((TileEntityDiamondFurnace) tileentity);
			playerIn.func_71029_a(StatList.field_188061_aa);
		}

		return true;
	}

	public static void setState(boolean active, World worldIn, BlockPos pos) {
		IBlockState iblockstate = worldIn.func_180495_p(pos);
		TileEntity tileentity = worldIn.func_175625_s(pos);
		keepInventory = true;

		if (active) {
			worldIn.func_180501_a(pos,
					BlockMod.lit_diamond_furnace.func_176223_P().func_177226_a(FACING, iblockstate.func_177229_b(FACING)), 3);
			worldIn.func_180501_a(pos,
					BlockMod.lit_diamond_furnace.func_176223_P().func_177226_a(FACING, iblockstate.func_177229_b(FACING)), 3);
		} else {
			worldIn.func_180501_a(pos,
					BlockMod.diamond_furnace.func_176223_P().func_177226_a(FACING, iblockstate.func_177229_b(FACING)), 3);
			worldIn.func_180501_a(pos,
					BlockMod.diamond_furnace.func_176223_P().func_177226_a(FACING, iblockstate.func_177229_b(FACING)), 3);
		}

		keepInventory = false;

		if (tileentity == null)
			return;
		tileentity.func_145829_t();
		worldIn.func_175690_a(pos, tileentity);
	}

	public TileEntity func_149915_a(World worldIn, int meta) {
		return new TileEntityDiamondFurnace();
	}

	public IBlockState func_180642_a(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY,
			float hitZ, int meta, EntityLivingBase placer) {
		return func_176223_P().func_177226_a(FACING, placer.func_174811_aO().func_176734_d());
	}

	public void func_180633_a(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
			ItemStack stack) {
		worldIn.func_180501_a(pos, state.func_177226_a(FACING, placer.func_174811_aO().func_176734_d()), 2);

		if (!(stack.func_82837_s()))
			return;
		TileEntity tileentity = worldIn.func_175625_s(pos);

		if (!(tileentity instanceof TileEntityDiamondFurnace))
			return;
		((TileEntityDiamondFurnace) tileentity).setCustomInventoryName(stack.func_82833_r());
	}

	public void func_180663_b(World worldIn, BlockPos pos, IBlockState state) {
		if (!(keepInventory)) {
			TileEntity tileentity = worldIn.func_175625_s(pos);

			if (tileentity instanceof TileEntityDiamondFurnace) {
				InventoryHelper.func_180175_a(worldIn, pos, (TileEntityDiamondFurnace) tileentity);
				worldIn.func_175666_e(pos, this);
			}
		}

		super.func_180663_b(worldIn, pos, state);
	}

	public boolean func_149740_M(IBlockState state) {
		return true;
	}

	public int func_180641_l(IBlockState blockState, World worldIn, BlockPos pos) {
		return Container.func_178144_a(worldIn.func_175625_s(pos));
	}

	public ItemStack func_185473_a(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(BlockMod.diamond_furnace);
	}

	public EnumBlockRenderType func_149645_b(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	public IBlockState func_176203_a(int meta) {
		EnumFacing enumfacing = EnumFacing.func_82600_a(meta);

		if (enumfacing.func_176740_k() == EnumFacing.Axis.Y) {
			enumfacing = EnumFacing.NORTH;
		}

		return func_176223_P().func_177226_a(FACING, enumfacing);
	}

	public int func_176201_c(IBlockState state) {
		return ((EnumFacing) state.func_177229_b(FACING)).func_176745_a();
	}

	public IBlockState func_185499_a(IBlockState state, Rotation rot) {
		return state.func_177226_a(FACING, rot.func_185831_a((EnumFacing) state.func_177229_b(FACING)));
	}

	public IBlockState func_185471_a(IBlockState state, Mirror mirrorIn) {
		return state.func_185907_a(mirrorIn.func_185800_a((EnumFacing) state.func_177229_b(FACING)));
	}

	protected BlockStateContainer func_180661_e() {
		return new BlockStateContainer(this, new IProperty[] { FACING });
	}
}
