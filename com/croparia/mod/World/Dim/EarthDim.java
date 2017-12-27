package com.croparia.mod.World.Dim;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;
import com.croparia.mod.World.Biome.EarthBiome;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;
import net.minecraft.world.gen.layer.IntCache;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SuppressWarnings("unchecked")
public class EarthDim {

	public static Object instance;
	public static int DIMID = 7;

	public static BlockEarthPortal portal;
	public static earthTrigger block;

	static {
		portal = (BlockEarthPortal) (new BlockEarthPortal().func_149663_c("earthdim_portal"));
		block = (earthTrigger) (new earthTrigger().func_77655_b("earthdim_trigger"));
	}

	public EarthDim() {
	}

	public static DimensionType dtype = DimensionType.register("earthdim", "_earthdim", DIMID, EarthDim.WorldProviderMod.class, false);

	public void load(FMLInitializationEvent event) {

		if (event.getSide() == Side.CLIENT)
			Minecraft.func_71410_x().func_175599_af().func_175037_a()
					.func_178086_a(block, 0, new ModelResourceLocation(Reference.MOD_ID + ":earthdim_trigger", "inventory"));

	}

	public void registerRenderers() {
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {

		portal.setRegistryName("earthdim_portal");
		ForgeRegistries.BLOCKS.register(portal);
		

		block.setRegistryName("earthdim_trigger");
		ForgeRegistries.ITEMS.register(block);
		DimensionManager.registerDimension(DIMID, dtype);

	}

	public static class WorldProviderMod extends WorldProvider {

		@Override
		public void func_76572_b() {
			this.field_76578_c = new BiomeProviderCustom(this.field_76579_a.func_72905_C(), field_76579_a.func_72912_H().func_76067_t());
		}

		public DimensionType func_186058_p() {
			return dtype;
		}

		@Override
		@SideOnly(Side.CLIENT)
		public Vec3d func_76562_b(float par1, float par2) {
			return new Vec3d(0.4D, 0.6D, 1.0D);
		}

		@Override
		public IChunkGenerator func_186060_c() {
			return new ChunkProviderModded(this.field_76579_a, this.field_76579_a.func_72905_C() - 19702);
		}

		@Override
		public boolean func_76569_d() {
			return false;
		}

		@Override
		public boolean func_76566_a(int par1, int par2) {
			return false;
		}

		@Override
		public boolean func_76567_e() {
			return false;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public boolean func_76568_b(int par1, int par2) {
			return false;
		}

		@Override
		protected void func_76556_a() {
			float f = 0.5F;
			for (int i = 0; i <= 15; ++i) {
				float f1 = 1.0F - (float) i / 15.0F;
				this.field_76573_f[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
			}
		}

	}

	public static class TeleporterDimensionMod extends Teleporter {

		private final WorldServer worldServerInstance;
		/** A private Random() function in Teleporter */
		private final Random random;
		private final it.unimi.dsi.fastutil.longs.Long2ObjectMap<Teleporter.PortalPosition> destinationCoordinateCache = new it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap(
				4096);
		private static final String __OBFID = "CL_00000153";

		public TeleporterDimensionMod(WorldServer worldIn) {
			super(worldIn);
			this.worldServerInstance = worldIn;
			this.random = new Random(worldIn.func_72905_C());
		}

		public void func_180266_a(Entity entityIn, float rotationYaw) {
			if (this.worldServerInstance.field_73011_w.getDimension() != 1) {
				if (!this.func_180620_b(entityIn, rotationYaw)) {
					this.func_85188_a(entityIn);
					this.func_180620_b(entityIn, rotationYaw);
				}
			} else {
				int i = MathHelper.func_76128_c(entityIn.field_70165_t);
				int j = MathHelper.func_76128_c(entityIn.field_70163_u) - 1;
				int k = MathHelper.func_76128_c(entityIn.field_70161_v);
				byte b0 = 1;
				byte b1 = 0;

				for (int l = -2; l <= 2; ++l) {
					for (int i1 = -2; i1 <= 2; ++i1) {
						for (int j1 = -1; j1 < 3; ++j1) {
							int k1 = i + i1 * b0 + l * b1;
							int l1 = j + j1;
							int i2 = k + i1 * b1 - l * b0;
							boolean flag = j1 < 0;
							this.worldServerInstance.func_175656_a(new BlockPos(k1, l1, i2),
									flag ? BlockMod.earth_block.func_176223_P() : Blocks.field_150350_a.func_176223_P());
						}
					}
				}

				entityIn.func_70012_b((double) i, (double) j, (double) k, entityIn.field_70177_z, 0.0F);
				entityIn.field_70159_w = entityIn.field_70181_x = entityIn.field_70179_y = 0.0D;
			}
		}

		public boolean func_180620_b(Entity entityIn, float p_180620_2_) {
			boolean flag = true;
			double d0 = -1.0D;
			int i = MathHelper.func_76128_c(entityIn.field_70165_t);
			int j = MathHelper.func_76128_c(entityIn.field_70161_v);
			boolean flag1 = true;
			BlockPos object = BlockPos.field_177992_a;
			long k = ChunkPos.func_77272_a(i, j);

			if (this.destinationCoordinateCache.containsKey(k)) {
				Teleporter.PortalPosition portalposition = (Teleporter.PortalPosition) this.destinationCoordinateCache.get(k);
				d0 = 0.0D;
				object = portalposition;
				portalposition.field_85087_d = this.worldServerInstance.func_82737_E();
				flag1 = false;
			} else {
				BlockPos blockpos4 = new BlockPos(entityIn);

				for (int l = -128; l <= 128; ++l) {
					BlockPos blockpos1;

					for (int i1 = -128; i1 <= 128; ++i1) {
						for (BlockPos blockpos = blockpos4.func_177982_a(l, this.worldServerInstance.func_72940_L() - 1 - blockpos4.func_177956_o(), i1); blockpos
								.func_177956_o() >= 0; blockpos = blockpos1) {
							blockpos1 = blockpos.func_177977_b();

							if (this.worldServerInstance.func_180495_p(blockpos).func_177230_c() == portal) {
								while (this.worldServerInstance.func_180495_p(blockpos1 = blockpos.func_177977_b()).func_177230_c() == portal) {
									blockpos = blockpos1;
								}

								double d1 = blockpos.func_177951_i(blockpos4);

								if (d0 < 0.0D || d1 < d0) {
									d0 = d1;
									object = blockpos;
								}
							}
						}
					}
				}
			}

			if (d0 >= 0.0D) {
				if (flag1) {
					this.destinationCoordinateCache.put(k, new Teleporter.PortalPosition(object, this.worldServerInstance.func_82737_E()));
				}

				double d4 = (double) ((BlockPos) object).func_177958_n() + 0.5D;
				double d5 = (double) ((BlockPos) object).func_177956_o() + 0.5D;
				double d6 = (double) ((BlockPos) object).func_177952_p() + 0.5D;
				EnumFacing enumfacing = null;

				if (this.worldServerInstance.func_180495_p(((BlockPos) object).func_177976_e()).func_177230_c() == portal) {
					enumfacing = EnumFacing.NORTH;
				}

				if (this.worldServerInstance.func_180495_p(((BlockPos) object).func_177974_f()).func_177230_c() == portal) {
					enumfacing = EnumFacing.SOUTH;
				}

				if (this.worldServerInstance.func_180495_p(((BlockPos) object).func_177978_c()).func_177230_c() == portal) {
					enumfacing = EnumFacing.EAST;
				}

				if (this.worldServerInstance.func_180495_p(((BlockPos) object).func_177968_d()).func_177230_c() == portal) {
					enumfacing = EnumFacing.WEST;
				}

				// func_181012_aH = getTeleportDirection
				// EnumFacing enumfacing1 =
				// EnumFacing.getHorizontal(entityIn.func_181012_aH());
				EnumFacing enumfacing1 = entityIn.func_181012_aH();

				if (enumfacing != null) {
					EnumFacing enumfacing2 = enumfacing.func_176735_f();
					BlockPos blockpos2 = ((BlockPos) object).func_177972_a(enumfacing);
					boolean flag2 = this.func_180265_a(blockpos2);
					boolean flag3 = this.func_180265_a(blockpos2.func_177972_a(enumfacing2));

					if (flag3 && flag2) {
						object = ((BlockPos) object).func_177972_a(enumfacing2);
						enumfacing = enumfacing.func_176734_d();
						enumfacing2 = enumfacing2.func_176734_d();
						BlockPos blockpos3 = ((BlockPos) object).func_177972_a(enumfacing);
						flag2 = this.func_180265_a(blockpos3);
						flag3 = this.func_180265_a(blockpos3.func_177972_a(enumfacing2));
					}

					float f6 = 0.5F;
					float f1 = 0.5F;

					if (!flag3 && flag2) {
						f6 = 1.0F;
					} else if (flag3 && !flag2) {
						f6 = 0.0F;
					} else if (flag3) {
						f1 = 0.0F;
					}

					d4 = (double) ((BlockPos) object).func_177958_n() + 0.5D;
					d5 = (double) ((BlockPos) object).func_177956_o() + 0.5D;
					d6 = (double) ((BlockPos) object).func_177952_p() + 0.5D;
					d4 += (double) ((float) enumfacing2.func_82601_c() * f6 + (float) enumfacing.func_82601_c() * f1);
					d6 += (double) ((float) enumfacing2.func_82599_e() * f6 + (float) enumfacing.func_82599_e() * f1);
					float f2 = 0.0F;
					float f3 = 0.0F;
					float f4 = 0.0F;
					float f5 = 0.0F;

					if (enumfacing1 != null && enumfacing == enumfacing1) {
						f2 = 1.0F;
						f3 = 1.0F;
					} else if (enumfacing1 != null && enumfacing == enumfacing1.func_176734_d()) {
						f2 = -1.0F;
						f3 = -1.0F;
					} else if (enumfacing1 != null && enumfacing == enumfacing1.func_176746_e()) {
						f4 = 1.0F;
						f5 = -1.0F;
					} else {
						f4 = -1.0F;
						f5 = 1.0F;
					}

					double d2 = entityIn.field_70159_w;
					double d3 = entityIn.field_70179_y;
					entityIn.field_70159_w = d2 * (double) f2 + d3 * (double) f5;
					entityIn.field_70179_y = d2 * (double) f4 + d3 * (double) f3;
					if (enumfacing1 != null)
						entityIn.field_70177_z = p_180620_2_ - (float) (enumfacing1.func_176736_b() * 90)
								+ (float) (enumfacing.func_176736_b() * 90);
				} else {
					entityIn.field_70159_w = entityIn.field_70181_x = entityIn.field_70179_y = 0.0D;
				}

				entityIn.func_70012_b(d4, d5, d6, entityIn.field_70177_z, entityIn.field_70125_A);
				return true;
			} else {
				return false;
			}
		}

		private boolean func_180265_a(BlockPos p_180265_1_) {
			return !this.worldServerInstance.func_175623_d(p_180265_1_) || !this.worldServerInstance.func_175623_d(p_180265_1_.func_177984_a());
		}

		public boolean func_85188_a(Entity p_85188_1_) {

			byte b0 = 16;
			double d0 = -1.0D;
			int i = MathHelper.func_76128_c(p_85188_1_.field_70165_t);
			int j = MathHelper.func_76128_c(p_85188_1_.field_70163_u);
			int k = MathHelper.func_76128_c(p_85188_1_.field_70161_v);
			int l = i;
			int i1 = j;
			int j1 = k;
			int k1 = 0;
			int l1 = this.random.nextInt(4);
			int i2;
			double d1;
			int k2;
			double d2;
			int i3;
			int j3;
			int k3;
			int l3;
			int i4;
			int j4;
			int k4;
			int l4;
			int i5;
			double d3;
			double d4;

			for (i2 = i - b0; i2 <= i + b0; ++i2) {
				d1 = (double) i2 + 0.5D - p_85188_1_.field_70165_t;

				for (k2 = k - b0; k2 <= k + b0; ++k2) {
					d2 = (double) k2 + 0.5D - p_85188_1_.field_70161_v;
					label271 :

					for (i3 = this.worldServerInstance.func_72940_L() - 1; i3 >= 0; --i3) {
						if (this.worldServerInstance.func_175623_d(new BlockPos(i2, i3, k2))) {
							while (i3 > 0 && this.worldServerInstance.func_175623_d(new BlockPos(i2, i3 - 1, k2))) {
								--i3;
							}

							for (j3 = l1; j3 < l1 + 4; ++j3) {
								k3 = j3 % 2;
								l3 = 1 - k3;

								if (j3 % 4 >= 2) {
									k3 = -k3;
									l3 = -l3;
								}

								for (i4 = 0; i4 < 3; ++i4) {
									for (j4 = 0; j4 < 4; ++j4) {
										for (k4 = -1; k4 < 4; ++k4) {
											l4 = i2 + (j4 - 1) * k3 + i4 * l3;
											i5 = i3 + k4;
											int j5 = k2 + (j4 - 1) * l3 - i4 * k3;
											Block tmp = this.worldServerInstance.func_180495_p(new BlockPos(l4, i5, j5)).func_177230_c();
											if (k4 < 0 && !tmp.func_149688_o(tmp.func_176223_P()).func_76220_a() || k4 >= 0
													&& !this.worldServerInstance.func_175623_d(new BlockPos(l4, i5, j5))) {
												continue label271;
											}
										}
									}
								}

								d3 = (double) i3 + 0.5D - p_85188_1_.field_70163_u;
								d4 = d1 * d1 + d3 * d3 + d2 * d2;

								if (d0 < 0.0D || d4 < d0) {
									d0 = d4;
									l = i2;
									i1 = i3;
									j1 = k2;
									k1 = j3 % 4;
								}
							}
						}
					}
				}
			}

			if (d0 < 0.0D) {
				for (i2 = i - b0; i2 <= i + b0; ++i2) {
					d1 = (double) i2 + 0.5D - p_85188_1_.field_70165_t;

					for (k2 = k - b0; k2 <= k + b0; ++k2) {
						d2 = (double) k2 + 0.5D - p_85188_1_.field_70161_v;
						label219 :

						for (i3 = this.worldServerInstance.func_72940_L() - 1; i3 >= 0; --i3) {
							if (this.worldServerInstance.func_175623_d(new BlockPos(i2, i3, k2))) {
								while (i3 > 0 && this.worldServerInstance.func_175623_d(new BlockPos(i2, i3 - 1, k2))) {
									--i3;
								}

								for (j3 = l1; j3 < l1 + 2; ++j3) {
									k3 = j3 % 2;
									l3 = 1 - k3;

									for (i4 = 0; i4 < 4; ++i4) {
										for (j4 = -1; j4 < 4; ++j4) {
											k4 = i2 + (i4 - 1) * k3;
											l4 = i3 + j4;
											i5 = k2 + (i4 - 1) * l3;
											Block tmpb = this.worldServerInstance.func_180495_p(new BlockPos(k4, l4, i5)).func_177230_c();
											if (j4 < 0 && !tmpb.func_149688_o(tmpb.func_176223_P()).func_76220_a() || j4 >= 0
													&& !this.worldServerInstance.func_175623_d(new BlockPos(k4, l4, i5))) {
												continue label219;
											}
										}
									}

									d3 = (double) i3 + 0.5D - p_85188_1_.field_70163_u;
									d4 = d1 * d1 + d3 * d3 + d2 * d2;

									if (d0 < 0.0D || d4 < d0) {
										d0 = d4;
										l = i2;
										i1 = i3;
										j1 = k2;
										k1 = j3 % 2;
									}
								}
							}
						}
					}
				}
			}

			int k5 = l;
			int j2 = i1;
			k2 = j1;
			int l5 = k1 % 2;
			int l2 = 1 - l5;

			if (k1 % 4 >= 2) {
				l5 = -l5;
				l2 = -l2;
			}

			if (d0 < 0.0D) {
				i1 = MathHelper.func_76125_a(i1, 70, this.worldServerInstance.func_72940_L() - 10);
				j2 = i1;

				for (i3 = -1; i3 <= 1; ++i3) {
					for (j3 = 1; j3 < 3; ++j3) {
						for (k3 = -1; k3 < 3; ++k3) {
							l3 = k5 + (j3 - 1) * l5 + i3 * l2;
							i4 = j2 + k3;
							j4 = k2 + (j3 - 1) * l2 - i3 * l5;
							boolean flag = k3 < 0;
							this.worldServerInstance.func_175656_a(new BlockPos(l3, i4, j4),
									flag ? BlockMod.earth_block.func_176223_P() : Blocks.field_150350_a.func_176223_P());
						}
					}
				}
			}

			IBlockState iblockstate = portal.func_176223_P().func_177226_a(BlockPortal.field_176550_a, l5 == 0 ? EnumFacing.Axis.Z : EnumFacing.Axis.X);

			for (j3 = 0; j3 < 4; ++j3) {
				for (k3 = 0; k3 < 4; ++k3) {
					for (l3 = -1; l3 < 4; ++l3) {
						i4 = k5 + (k3 - 1) * l5;
						j4 = j2 + l3;
						k4 = k2 + (k3 - 1) * l2;
						boolean flag1 = k3 == 0 || k3 == 3 || l3 == -1 || l3 == 3;
						this.worldServerInstance
								.func_180501_a(new BlockPos(i4, j4, k4), flag1 ? BlockMod.earth_block.func_176223_P() : iblockstate, 2);
					}
				}

				for (k3 = 0; k3 < 4; ++k3) {
					for (l3 = -1; l3 < 4; ++l3) {
						i4 = k5 + (k3 - 1) * l5;
						j4 = j2 + l3;
						k4 = k2 + (k3 - 1) * l2;
						this.worldServerInstance.func_175685_c(new BlockPos(i4, j4, k4),
								this.worldServerInstance.func_180495_p(new BlockPos(i4, j4, k4)).func_177230_c(), true);
					}
				}
			}

			return true;
		}

		/**
		 * called periodically to remove out-of-date portal locations from the
		 * cache list. Argument par1 is a WorldServer.getTotalWorldTime() value.
		 */
		public void func_85189_a(long worldTime) {
			if (worldTime % 100L == 0L) {
				long i = worldTime - 300L;
				it.unimi.dsi.fastutil.objects.ObjectIterator<Teleporter.PortalPosition> objectiterator = this.destinationCoordinateCache.values()
						.iterator();

				while (objectiterator.hasNext()) {
					Teleporter.PortalPosition teleporter$portalposition = (Teleporter.PortalPosition) objectiterator.next();

					if (teleporter$portalposition == null || teleporter$portalposition.field_85087_d < i) {
						objectiterator.remove();
					}
				}
			}
		}

		public class PortalPosition extends BlockPos {
			/** The worldtime at which this PortalPosition was last verified */
			public long lastUpdateTime;
			private static final String __OBFID = "CL_00000154";

			public PortalPosition(BlockPos pos, long p_i45747_3_) {
				super(pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
				this.lastUpdateTime = p_i45747_3_;
			}
		}

	}

	// /earth BLOCK

	static class BlockEarthMod extends Block {

		protected BlockEarthMod() {
			super(Material.field_151578_c);
		}

		public void onBlockAdded(World par1World, int par2, int par3, int par4) {
			/* TutorialPortal.tryToCreatePortal(par1World, par2, par3, par4); */
		}

	}// earth block end

	// /PORTAL BLOCK

	public static class BlockEarthPortal extends Block {

		public static final PropertyEnum<EnumFacing.Axis> AXIS = PropertyEnum.<EnumFacing.Axis> func_177706_a("axis", EnumFacing.Axis.class,
				new EnumFacing.Axis[]{EnumFacing.Axis.X, EnumFacing.Axis.Z});
		protected static final AxisAlignedBB field_185683_b = new AxisAlignedBB(0.0D, 0.0D, 0.375D, 1.0D, 1.0D, 0.625D);
		protected static final AxisAlignedBB field_185684_c = new AxisAlignedBB(0.375D, 0.0D, 0.0D, 0.625D, 1.0D, 1.0D);
		protected static final AxisAlignedBB field_185685_d = new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D);

		public BlockEarthPortal() {
			super(Material.field_151567_E);
			this.func_180632_j(this.field_176227_L.func_177621_b().func_177226_a(AXIS, EnumFacing.Axis.Z));
			this.func_149675_a(true);
			this.func_149711_c(-1.0F);
			this.func_149715_a(0.75F);
		}

		@javax.annotation.Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
			return field_185506_k;
		}

		public boolean func_149662_c(IBlockState state) {
			return false;
		}

		public AxisAlignedBB func_185496_a(IBlockState state, IBlockAccess source, BlockPos pos) {
			switch ((EnumFacing.Axis) state.func_177229_b(AXIS)) {
				case X :
					return field_185683_b;
				case Y :
				default :
					return field_185685_d;
				case Z :
					return field_185684_c;
			}
		}

		public static int getMetaForAxis(EnumFacing.Axis axis) {
			return axis == EnumFacing.Axis.X ? 1 : (axis == EnumFacing.Axis.Z ? 2 : 0);
		}

		public boolean func_149686_d(IBlockState state) {
			return false;
		}

		public int func_176201_c(IBlockState state) {
			return getMetaForAxis((EnumFacing.Axis) state.func_177229_b(AXIS));
		}

		public IBlockState func_176203_a(int meta) {
			return this.func_176223_P().func_177226_a(AXIS, (meta & 3) == 2 ? EnumFacing.Axis.Z : EnumFacing.Axis.X);
		}

		/**
		 * If this block doesn't render as an ordinary block it will return
		 * False (examples: signs, buttons, stairs, etc)
		 */
		/**
		 * Checks to see if this location is valid to create a portal and will
		 * return True if it does. Args: world, x, y, z
		 */
		public boolean tryToCreatePortal(World par1World, int par2, int par3, int par4) {
			byte b0 = 0;
			byte b1 = 0;
			if (getBlock(par1World, par2 - 1, par3, par4) == BlockMod.earth_block || getBlock(par1World, par2 + 1, par3, par4) == BlockMod.earth_block) {
				b0 = 1;
			}
			if (getBlock(par1World, par2, par3, par4 - 1) == BlockMod.earth_block || getBlock(par1World, par2, par3, par4 + 1) == BlockMod.earth_block) {
				b1 = 1;
			}
			if (b0 == b1) {
				return false;
			} else {
				if (getBlock(par1World, par2 - b0, par3, par4 - b1) == Blocks.field_150350_a) {
					par2 -= b0;
					par4 -= b1;
				}
				int l;
				int i1;
				for (l = -1; l <= 2; ++l) {
					for (i1 = -1; i1 <= 3; ++i1) {
						boolean flag = l == -1 || l == 2 || i1 == -1 || i1 == 3;
						if (l != -1 && l != 2 || i1 != -1 && i1 != 3) {
							Block j1 = getBlock(par1World, par2 + b0 * l, par3 + i1, par4 + b1 * l);
							if (flag) {
								if (j1 != BlockMod.earth_block) {
									return false;
								}
							}
							/*
							 * else if (j1 != 0 && j1 !=
							 * Main.Tutorialearth.blockID) { return false; }
							 */
						}
					}
				}
				for (l = 0; l < 2; ++l) {
					for (i1 = 0; i1 < 3; ++i1) {
						IBlockState iblockstate = this.func_176223_P().func_177226_a(BlockPortal.field_176550_a,
								b0 == 0 ? EnumFacing.Axis.Z : EnumFacing.Axis.X);
						par1World.func_180501_a(new BlockPos(par2 + b0 * l, par3 + i1, par4 + b1 * l), iblockstate, 3);
					}
				}
				return true;
			}
		}

		/**
		 * Lets the block know when one of its neighbor changes. Doesn't know
		 * which neighbor changed (coordinates passed are their own) Args: x, y,
		 * z, neighbor blockID
		 */
		@Override
		public void func_189540_a(IBlockState state, World par1World, BlockPos pos, Block neighborBlock, BlockPos fromPos) {

			int par2 = pos.func_177958_n();
			int par3 = pos.func_177956_o();
			int par4 = pos.func_177952_p();

			byte b0 = 0;
			byte b1 = 1;
			if (getBlock(par1World, par2 - 1, par3, par4) == this || getBlock(par1World, par2 + 1, par3, par4) == this) {
				b0 = 1;
				b1 = 0;
			}
			int i1;
			for (i1 = par3; getBlock(par1World, par2, i1 - 1, par4) == this; --i1) {
				;
			}
			if (getBlock(par1World, par2, i1 - 1, par4) != BlockMod.earth_block) {
				par1World.func_175698_g(new BlockPos(par2, par3, par4));
			} else {
				int j1;
				for (j1 = 1; j1 < 4 && getBlock(par1World, par2, i1 + j1, par4) == this; ++j1) {
					;
				}
				if (j1 == 3 && getBlock(par1World, par2, i1 + j1, par4) == BlockMod.earth_block) {
					boolean flag = getBlock(par1World, par2 - 1, par3, par4) == this || getBlock(par1World, par2 + 1, par3, par4) == this;
					boolean flag1 = getBlock(par1World, par2, par3, par4 - 1) == this || getBlock(par1World, par2, par3, par4 + 1) == this;
					if (flag && flag1) {
						par1World.func_175698_g(new BlockPos(par2, par3, par4));
					} else {
						if ((getBlock(par1World, par2 + b0, par3, par4 + b1) != BlockMod.earth_block || getBlock(par1World, par2 - b0, par3, par4 - b1) != this)
								&& (getBlock(par1World, par2 - b0, par3, par4 - b1) != BlockMod.earth_block || getBlock(par1World, par2 + b0, par3, par4
										+ b1) != this)) {
							par1World.func_175698_g(new BlockPos(par2, par3, par4));
						}
					}
				} else {
					par1World.func_175698_g(new BlockPos(par2, par3, par4));
				}
			}
		}

		@SideOnly(Side.CLIENT)
		@Override
		public boolean func_176225_a(IBlockState blockState, IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
			EnumFacing.Axis axis = null;
			IBlockState iblockstate = worldIn.func_180495_p(pos);

			if (worldIn.func_180495_p(pos).func_177230_c() == this) {
				axis = (EnumFacing.Axis) iblockstate.func_177229_b(AXIS);

				if (axis == null) {
					return false;
				}

				if (axis == EnumFacing.Axis.Z && side != EnumFacing.EAST && side != EnumFacing.WEST) {
					return false;
				}

				if (axis == EnumFacing.Axis.X && side != EnumFacing.SOUTH && side != EnumFacing.NORTH) {
					return false;
				}
			}

			boolean flag = worldIn.func_180495_p(pos.func_177976_e()).func_177230_c() == this && worldIn.func_180495_p(pos.func_177985_f(2)).func_177230_c() != this;
			boolean flag1 = worldIn.func_180495_p(pos.func_177974_f()).func_177230_c() == this && worldIn.func_180495_p(pos.func_177965_g(2)).func_177230_c() != this;
			boolean flag2 = worldIn.func_180495_p(pos.func_177978_c()).func_177230_c() == this && worldIn.func_180495_p(pos.func_177964_d(2)).func_177230_c() != this;
			boolean flag3 = worldIn.func_180495_p(pos.func_177968_d()).func_177230_c() == this && worldIn.func_180495_p(pos.func_177970_e(2)).func_177230_c() != this;
			boolean flag4 = flag || flag1 || axis == EnumFacing.Axis.X;
			boolean flag5 = flag2 || flag3 || axis == EnumFacing.Axis.Z;
			return flag4 && side == EnumFacing.WEST ? true : (flag4 && side == EnumFacing.EAST ? true : (flag5 && side == EnumFacing.NORTH
					? true
					: flag5 && side == EnumFacing.SOUTH));
		}

		@SideOnly(Side.CLIENT)
		public BlockRenderLayer func_180664_k() {
			return BlockRenderLayer.TRANSLUCENT;
		}

		protected net.minecraft.block.state.BlockStateContainer func_180661_e() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{AXIS});
		}

		public int func_149745_a(Random par1Random) {
			return 0;
		}

		@Override
		public void func_180634_a(World par1World, BlockPos pos, IBlockState state, Entity par5Entity) {

			int par2 = pos.func_177958_n();
			int par3 = pos.func_177956_o();
			int par4 = pos.func_177952_p();

			if (par5Entity.func_184187_bx() == null && !par5Entity.func_184207_aI() && par5Entity instanceof EntityPlayerMP) {

				EntityPlayerMP thePlayer = (EntityPlayerMP) par5Entity;
				if (thePlayer.field_71088_bW > 0) {
					thePlayer.field_71088_bW = 10;
				} else if (thePlayer.field_71093_bK != DIMID) {
					thePlayer.field_71088_bW = 10;
					thePlayer.field_71133_b.func_184103_al().transferPlayerToDimension(thePlayer, DIMID,
							new TeleporterDimensionMod(thePlayer.field_71133_b.func_71218_a(DIMID)));
				} else {
					thePlayer.field_71088_bW = 10;
					thePlayer.field_71133_b.func_184103_al().transferPlayerToDimension(thePlayer, 0,
							new TeleporterDimensionMod(thePlayer.field_71133_b.func_71218_a(0)));
				}
			}
		}

		@SideOnly(Side.CLIENT)
		/**
		 * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
		 */
		public int idPicked(World par1World, int par2, int par3, int par4) {
			return 0;
		}
	}

	// portal block

	public static class earthTrigger extends Item {
		public earthTrigger() {
			super();
			this.field_77777_bU = 1;
			func_77656_e(64);
			func_77637_a(CreativeTabsRegistry.MOD_BLOCK);
		}

		@Override
		public EnumActionResult func_180614_a(EntityPlayer par2EntityPlayer, World par3World, BlockPos pos, EnumHand hand, EnumFacing side, float par8,
				float par9, float par10) {

			ItemStack par1ItemStack = par2EntityPlayer.func_184586_b(hand);

			int par4 = pos.func_177958_n();
			int par5 = pos.func_177956_o();
			int par6 = pos.func_177952_p();

			int par7 = side.func_176745_a();

			if (par7 == 0) {
				par5--;
			}
			if (par7 == 1) {
				par5++;
			}
			if (par7 == 2) {
				par6--;
			}
			if (par7 == 3) {
				par6++;
			}
			if (par7 == 4) {
				par4--;
			}
			if (par7 == 5) {
				par4++;
			}
			if (!par2EntityPlayer.func_175151_a(new BlockPos(par4, par5, par6), side, par1ItemStack)) {
				return EnumActionResult.FAIL;
			}
			Block i1 = getBlock(par3World, par4, par5, par6);
			if (i1 == Blocks.field_150350_a) {
				par3World.func_184133_a(par2EntityPlayer, new BlockPos(par4, par5, par6), SoundEvents.field_187649_bu, SoundCategory.BLOCKS, 1.0F,
						field_77697_d.nextFloat() * 0.4F + 0.8F);
				portal.tryToCreatePortal(par3World, par4, par5, par6);
			}
			par1ItemStack.func_77972_a(1, par2EntityPlayer);
			return EnumActionResult.SUCCESS;
		}
	}

	public static class ChunkProviderModded implements IChunkGenerator {
		protected static final IBlockState field_185982_a = Blocks.field_150346_d.func_176203_a(2);
		private final Random rand;
		private NoiseGeneratorOctaves field_185991_j;
		private NoiseGeneratorOctaves field_185992_k;
		private NoiseGeneratorOctaves field_185993_l;
		private NoiseGeneratorPerlin field_185994_m;
		public NoiseGeneratorOctaves field_185983_b;
		public NoiseGeneratorOctaves field_185984_c;
		public NoiseGeneratorOctaves field_185985_d;
		
		private final World world;
		private final boolean mapFeaturesEnabled;
		private final WorldType terrainType;
		private final double[] heightMap;
		private final float[] field_185999_r;
		private ChunkGeneratorSettings settings;
		private IBlockState oceanBlock = Blocks.field_150355_j.func_176223_P();
		private double[] field_186002_u = new double[256];
		private MapGenBase caveGenerator = new MapGenCaves();
		private MapGenBase ravineGenerator = new MapGenRavine();
		private Biome[] biomesForGeneration;
		double[] field_185986_e;
		double[] field_185987_f;
		double[] field_185988_g;
		double[] field_185989_h;
		protected static final IBlockState AIR = Blocks.field_150350_a.func_176223_P();
		protected static final IBlockState BEDROCK = Blocks.field_150357_h.func_176223_P();
		protected static final IBlockState GRAVEL = Blocks.field_150346_d.func_176203_a(1);
		private final WorldGenerator quartzGen = new WorldGenMinable(BlockMod.dirt_earth_ore.func_176223_P(), 7, BlockMatcher.func_177642_a(Blocks.field_150346_d));
		private final WorldGenerator coarseGen = new WorldGenMinable(Blocks.field_150346_d.func_176203_a(1), 30, BlockMatcher.func_177642_a(Blocks.field_150346_d));
		
		

		public ChunkProviderModded(World worldIn, long seed) {
			{
				caveGenerator = net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(caveGenerator,
						net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.CAVE);
				ravineGenerator = net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(ravineGenerator,
						net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.RAVINE);
			}
			this.world = worldIn;
			this.mapFeaturesEnabled = false;
			this.terrainType = worldIn.func_72912_H().func_76067_t();
			this.rand = new Random(seed);
			this.field_185991_j = new NoiseGeneratorOctaves(this.rand, 16);
			this.field_185992_k = new NoiseGeneratorOctaves(this.rand, 16);
			this.field_185993_l = new NoiseGeneratorOctaves(this.rand, 8);
			this.field_185994_m = new NoiseGeneratorPerlin(this.rand, 4);
			this.field_185983_b = new NoiseGeneratorOctaves(this.rand, 10);
			this.field_185984_c = new NoiseGeneratorOctaves(this.rand, 16);
			this.field_185985_d = new NoiseGeneratorOctaves(this.rand, 8);
			this.heightMap = new double[825];
			this.field_185999_r = new float[25];

			for (int i = -2; i <= 2; ++i) {
				for (int j = -2; j <= 2; ++j) {
					float f = 10.0F / MathHelper.func_76129_c((float) (i * i + j * j) + 0.2F);
					this.field_185999_r[i + 2 + (j + 2) * 5] = f;
				}
			}

			this.settings = ChunkGeneratorSettings.Factory.func_177865_a("").func_177864_b();

			net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextOverworld ctx = new net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextOverworld(
					field_185991_j, field_185992_k, field_185993_l, field_185994_m, field_185983_b, field_185984_c, field_185985_d);
			ctx = net.minecraftforge.event.terraingen.TerrainGen.getModdedNoiseGenerators(worldIn, this.rand, ctx);
			this.field_185991_j = ctx.getLPerlin1();
			this.field_185992_k = ctx.getLPerlin2();
			this.field_185993_l = ctx.getPerlin();
			this.field_185994_m = ctx.getHeight();
			this.field_185983_b = ctx.getScale();
			this.field_185984_c = ctx.getDepth();
			this.field_185985_d = ctx.getForest();
		}

		@Override
		public Chunk func_185932_a(int x, int z) {
			this.rand.setSeed((long) x * 341873128712L + (long) z * 132897987541L);
			ChunkPrimer chunkprimer = new ChunkPrimer();
			this.setBlocksInChunk(x, z, chunkprimer);
			this.biomesForGeneration = this.world.func_72959_q().func_76937_a(this.biomesForGeneration, x * 16, z * 16, 16, 16);
			this.replaceBiomeBlocks(x, z, chunkprimer, this.biomesForGeneration);

			if (this.settings.field_177839_r) {
				this.caveGenerator.func_186125_a(this.world, x, z, chunkprimer);
			}

			if (this.settings.field_177850_z) {
				this.ravineGenerator.func_186125_a(this.world, x, z, chunkprimer);
			}

			Chunk chunk = new Chunk(this.world, chunkprimer, x, z);
			byte[] abyte = chunk.func_76605_m();

			for (int i = 0; i < abyte.length; ++i) {
				abyte[i] = (byte) Biome.func_185362_a(this.biomesForGeneration[i]);
			}

			chunk.func_76603_b();
			return chunk;
		}

		@Override
		public void func_185931_b(int x, int z) {
			BlockFalling.field_149832_M = true;
			int i = x * 16;
			int j = z * 16;
			BlockPos blockpos = new BlockPos(i, 0, j);
			Biome Biome = this.world.func_180494_b(blockpos.func_177982_a(16, 0, 16));
			this.rand.setSeed(this.world.func_72905_C());
			long k = this.rand.nextLong() / 2L * 2L + 1L;
			long l = this.rand.nextLong() / 2L * 2L + 1L;
			this.rand.setSeed((long) x * k + (long) z * l ^ this.world.func_72905_C());
			boolean flag = false;

			net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(true, this, this.world, this.rand, x, z, flag);

			if (Biome != Biomes.field_76769_d && Biome != Biomes.field_76786_s && this.settings.field_177781_A && !flag
					&& this.rand.nextInt(this.settings.field_177782_B) == 0)
				if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag,
						net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAKE)) {
					int i1 = this.rand.nextInt(16) + 8;
					int j1 = this.rand.nextInt(256);
					int k1 = this.rand.nextInt(16) + 8;
					(new WorldGenLakes(Blocks.field_150353_l)).func_180709_b(this.world, this.rand, blockpos.func_177982_a(i1, j1, k1));
				}

			if (!flag && this.rand.nextInt(this.settings.field_177777_D / 10) == 0 && this.settings.field_177783_C)
				if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag,
						net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAVA)) {
					int i2 = this.rand.nextInt(16) + 8;
					int l2 = this.rand.nextInt(this.rand.nextInt(248) + 8);
					int k3 = this.rand.nextInt(16) + 8;

					if (l2 < this.world.func_181545_F() || this.rand.nextInt(this.settings.field_177777_D / 8) == 0) {
						(new WorldGenLakes(Blocks.field_150353_l)).func_180709_b(this.world, this.rand, blockpos.func_177982_a(i2, l2, k3));
					}
				}
			
			if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(this.world, this.rand, quartzGen, blockpos,
					net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.QUARTZ))
				for (int l1 = 0; l1 < 16; ++l1) {
					this.quartzGen.func_180709_b(this.world, this.rand,
							blockpos.func_177982_a(this.rand.nextInt(16), this.rand.nextInt(108) + 10, this.rand.nextInt(16)));
				}	
			if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(this.world, this.rand, coarseGen, blockpos,
					net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.QUARTZ))
				for (int l1 = 0; l1 < 16; ++l1) {
					this.coarseGen.func_180709_b(this.world, this.rand,
							blockpos.func_177982_a(this.rand.nextInt(16), this.rand.nextInt(108) + 10, this.rand.nextInt(16)));
				}

			if (this.settings.field_177837_s)
				if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag,
						net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.DUNGEON)) {
					for (int j2 = 0; j2 < this.settings.field_177835_t; ++j2) {
						int i3 = this.rand.nextInt(16) + 8;
						int l3 = this.rand.nextInt(256);
						int l1 = this.rand.nextInt(16) + 8;
						(new WorldGenDungeons()).func_180709_b(this.world, this.rand, blockpos.func_177982_a(i3, l3, l1));
					}
				}

			Biome.func_180624_a(this.world, this.rand, new BlockPos(i, 0, j));
			if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag,
					net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ANIMALS))
				WorldEntitySpawner.func_77191_a(this.world, Biome, i + 8, j + 8, 16, 16, this.rand);
			blockpos = blockpos.func_177982_a(8, 0, 8);

			if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag,
					net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAVA)) {
				for (int k2 = 0; k2 < 16; ++k2) {
					for (int j3 = 0; j3 < 16; ++j3) {
						BlockPos blockpos1 = this.world.func_175725_q(blockpos.func_177982_a(k2, 0, j3));
						BlockPos blockpos2 = blockpos1.func_177977_b();

						if (this.world.func_175675_v(blockpos2)) {
							this.world.func_180501_a(blockpos2, Blocks.field_150432_aD.func_176223_P(), 2);
						}

						if (this.world.func_175708_f(blockpos1, true)) {
							this.world.func_180501_a(blockpos1, Blocks.field_150431_aC.func_176223_P(), 2);
						}
					}
				}
			}

			int var4 = x * 16;
			int var5 = z * 16;

			net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(false, this, this.world, this.rand, x, z, flag);

			BlockFalling.field_149832_M = false;
		}

		@Override
		public List<Biome.SpawnListEntry> func_177458_a(EnumCreatureType creatureType, BlockPos pos) {
			Biome Biome = this.world.func_180494_b(pos);
			return Biome.func_76747_a(creatureType);
		}

		@Override
		public void func_180514_a(Chunk chunkIn, int x, int z) {
		}

		@Override
		public boolean func_193414_a(World worldIn, String structureName, BlockPos pos) {
			return false;
		}

		@Override
		public BlockPos func_180513_a(World worldIn, String structureName, BlockPos position, boolean findUnexplored) {
			return null;
		}

		@Override
		public boolean func_185933_a(Chunk chunkIn, int x, int z) {
			return false;
		}

		private void setBlocksInChunk(int x, int z, ChunkPrimer primer) {
			this.biomesForGeneration = this.world.func_72959_q().func_76937_a(this.biomesForGeneration, x * 4 - 2, z * 4 - 2, 10, 10);
			this.generateHeightmap(x * 4, 0, z * 4);

			for (int i = 0; i < 4; ++i) {
				int j = i * 5;
				int k = (i + 1) * 5;

				for (int l = 0; l < 4; ++l) {
					int i1 = (j + l) * 33;
					int j1 = (j + l + 1) * 33;
					int k1 = (k + l) * 33;
					int l1 = (k + l + 1) * 33;

					for (int i2 = 0; i2 < 32; ++i2) {
						double d0 = 0.125D;
						double d1 = this.heightMap[i1 + i2];
						double d2 = this.heightMap[j1 + i2];
						double d3 = this.heightMap[k1 + i2];
						double d4 = this.heightMap[l1 + i2];
						double d5 = (this.heightMap[i1 + i2 + 1] - d1) * d0;
						double d6 = (this.heightMap[j1 + i2 + 1] - d2) * d0;
						double d7 = (this.heightMap[k1 + i2 + 1] - d3) * d0;
						double d8 = (this.heightMap[l1 + i2 + 1] - d4) * d0;

						for (int j2 = 0; j2 < 8; ++j2) {
							double d9 = 0.25D;
							double d10 = d1;
							double d11 = d2;
							double d12 = (d3 - d1) * d9;
							double d13 = (d4 - d2) * d9;

							for (int k2 = 0; k2 < 4; ++k2) {
								double d14 = 0.25D;
								double d16 = (d11 - d10) * d14;
								double lvt_45_1_ = d10 - d16;

								for (int l2 = 0; l2 < 4; ++l2) {
									if ((lvt_45_1_ += d16) > 0.0D) {
										primer.func_177855_a(i * 4 + k2, i2 * 8 + j2, l * 4 + l2, field_185982_a);
									} else if (i2 * 8 + j2 < this.settings.field_177841_q) {
										primer.func_177855_a(i * 4 + k2, i2 * 8 + j2, l * 4 + l2, this.oceanBlock);
									}
								}

								d10 += d12;
								d11 += d13;
							}

							d1 += d5;
							d2 += d6;
							d3 += d7;
							d4 += d8;
						}
					}
				}
			}
		}

		private void replaceBiomeBlocks(int x, int z, ChunkPrimer primer, Biome[] biomesIn) {
			if (!net.minecraftforge.event.ForgeEventFactory.onReplaceBiomeBlocks(this, x, z, primer, this.world))
				return;
			double d0 = 0.03125D;
			this.field_186002_u = this.field_185994_m.func_151599_a(this.field_186002_u, (double) (x * 16), (double) (z * 16), 16, 16, d0 * 2.0D,
					d0 * 2.0D, 1.0D);

			for (int i = 0; i < 16; ++i) {
				for (int j = 0; j < 16; ++j) {
					Biome Biome = biomesIn[j + i * 16];
					generateBiomeTerrain(this.world, this.rand, primer, x * 16 + i, z * 16 + j, this.field_186002_u[j + i * 16], Biome);
				}
			}
		}

		private void generateBiomeTerrain(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal, Biome Biome) {
			int i = worldIn.func_181545_F();
			IBlockState iblockstate = Biome.field_76752_A;
			IBlockState iblockstate1 = Biome.field_76753_B;
			int j = -1;
			int k = (int) (noiseVal / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
			int l = x & 15;
			int i1 = z & 15;
			BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

			for (int j1 = 255; j1 >= 0; --j1) {
				if (j1 <= rand.nextInt(5)) {
					chunkPrimerIn.func_177855_a(i1, j1, l, BEDROCK);
				} else {
					IBlockState iblockstate2 = chunkPrimerIn.func_177856_a(i1, j1, l);

					if (iblockstate2.func_185904_a() == Material.field_151579_a) {
						j = -1;
					} else if (iblockstate2.func_177230_c() == Blocks.field_189877_df) {
						if (j == -1) {
							if (k <= 0) {
								iblockstate = AIR;
								iblockstate1 = Blocks.field_189877_df.func_176223_P();
							} else if (j1 >= i - 4 && j1 <= i + 1) {
								iblockstate = Biome.field_76752_A;
								iblockstate1 = Biome.field_76753_B;
							}

							if (j1 < i && (iblockstate == null || iblockstate.func_185904_a() == Material.field_151579_a)) {
								iblockstate1 = Blocks.field_150432_aD.func_176223_P();
							}

							j = k;

							if (j1 >= i - 1) {
								chunkPrimerIn.func_177855_a(i1, j1, l, iblockstate);
							} else if (j1 < i - 7 - k) {
								iblockstate = AIR;
								iblockstate1 = Blocks.field_189877_df.func_176223_P();
								chunkPrimerIn.func_177855_a(i1, j1, l, GRAVEL);
							} else {
								chunkPrimerIn.func_177855_a(i1, j1, l, iblockstate1);
							}
						} else if (j > 0) {
							--j;
							chunkPrimerIn.func_177855_a(i1, j1, l, iblockstate1);

							if (j == 0 && iblockstate1.func_177230_c() == Blocks.field_150354_m) {
								j = rand.nextInt(4) + Math.max(0, j1 - 63);
								iblockstate1 = Blocks.field_189877_df.func_176223_P();
							}
						}
					}
				}
			}
		}

		private void generateHeightmap(int p_185978_1_, int p_185978_2_, int p_185978_3_) {
			this.field_185989_h = this.field_185984_c.func_76305_a(this.field_185989_h, p_185978_1_, p_185978_3_, 5, 5,
					(double) this.settings.field_177808_e, (double) this.settings.field_177803_f, (double) this.settings.field_177804_g);
			float f = this.settings.field_177811_a;
			float f1 = this.settings.field_177809_b;
			this.field_185986_e = this.field_185993_l.func_76304_a(this.field_185986_e, p_185978_1_, p_185978_2_, p_185978_3_, 5, 33, 5,
					(double) (f / this.settings.field_177825_h), (double) (f1 / this.settings.field_177827_i),
					(double) (f / this.settings.field_177821_j));
			this.field_185987_f = this.field_185991_j.func_76304_a(this.field_185987_f, p_185978_1_, p_185978_2_, p_185978_3_, 5, 33, 5,
					(double) f, (double) f1, (double) f);
			this.field_185988_g = this.field_185992_k.func_76304_a(this.field_185988_g, p_185978_1_, p_185978_2_, p_185978_3_, 5, 33, 5,
					(double) f, (double) f1, (double) f);
			p_185978_3_ = 0;
			p_185978_1_ = 0;
			int i = 0;
			int j = 0;

			for (int k = 0; k < 5; ++k) {
				for (int l = 0; l < 5; ++l) {
					float f2 = 0.0F;
					float f3 = 0.0F;
					float f4 = 0.0F;
					int i1 = 2;
					Biome Biome = this.biomesForGeneration[k + 2 + (l + 2) * 10];

					for (int j1 = -i1; j1 <= i1; ++j1) {
						for (int k1 = -i1; k1 <= i1; ++k1) {
							Biome Biome1 = this.biomesForGeneration[k + j1 + 2 + (l + k1 + 2) * 10];
							float f5 = this.settings.field_177813_n + Biome1.func_185355_j() * this.settings.field_177819_m;
							float f6 = this.settings.field_177843_p + Biome1.func_185360_m() * this.settings.field_177815_o;

							if (this.terrainType == WorldType.field_151360_e && f5 > 0.0F) {
								f5 = 1.0F + f5 * 2.0F;
								f6 = 1.0F + f6 * 4.0F;
							}

							float f7 = this.field_185999_r[j1 + 2 + (k1 + 2) * 5] / (f5 + 2.0F);

							if (Biome1.func_185355_j() > Biome.func_185355_j()) {
								f7 /= 2.0F;
							}

							f2 += f6 * f7;
							f3 += f5 * f7;
							f4 += f7;
						}
					}

					f2 = f2 / f4;
					f3 = f3 / f4;
					f2 = f2 * 0.9F + 0.1F;
					f3 = (f3 * 4.0F - 1.0F) / 8.0F;
					double d7 = this.field_185989_h[j] / 8000.0D;

					if (d7 < 0.0D) {
						d7 = -d7 * 0.3D;
					}

					d7 = d7 * 3.0D - 2.0D;

					if (d7 < 0.0D) {
						d7 = d7 / 2.0D;

						if (d7 < -1.0D) {
							d7 = -1.0D;
						}

						d7 = d7 / 1.4D;
						d7 = d7 / 2.0D;
					} else {
						if (d7 > 1.0D) {
							d7 = 1.0D;
						}

						d7 = d7 / 8.0D;
					}

					++j;
					double d8 = (double) f3;
					double d9 = (double) f2;
					d8 = d8 + d7 * 0.2D;
					d8 = d8 * (double) this.settings.field_177823_k / 8.0D;
					double d0 = (double) this.settings.field_177823_k + d8 * 4.0D;

					for (int l1 = 0; l1 < 33; ++l1) {
						double d1 = ((double) l1 - d0) * (double) this.settings.field_177817_l * 128.0D / 256.0D / d9;

						if (d1 < 0.0D) {
							d1 *= 4.0D;
						}

						double d2 = this.field_185987_f[i] / (double) this.settings.field_177806_d;
						double d3 = this.field_185988_g[i] / (double) this.settings.field_177810_c;
						double d4 = (this.field_185986_e[i] / 10.0D + 1.0D) / 2.0D;
						double d5 = MathHelper.func_151238_b(d2, d3, d4) - d1;

						if (l1 > 29) {
							double d6 = (double) ((float) (l1 - 29) / 3.0F);
							d5 = d5 * (1.0D - d6) + -10.0D * d6;
						}

						this.heightMap[i] = d5;
						++i;
					}
				}
			}
		}

	}

	public static class BiomeProviderCustom extends BiomeProvider {

		private GenLayer genBiomes;
		/** A GenLayer containing the indices into Biome.biomeList[] */
		private GenLayer biomeIndexLayer;
		/** The BiomeCache object for this world. */
		private BiomeCache biomeCache;
		/** A list of biomes that the player can spawn in. */
		private List<Biome> biomesToSpawnIn;

		@SuppressWarnings({"unchecked", "rawtypes"})
		public BiomeProviderCustom() {
			this.biomeCache = new BiomeCache(this);
			this.biomesToSpawnIn = new ArrayList();
			this.biomesToSpawnIn.addAll(allowedBiomes);
		}

		public BiomeProviderCustom(long seed, WorldType worldType) {
			this();
			GenLayer[] agenlayer = GenLayerFix.makeTheWorld(seed, worldType);
			agenlayer = getModdedBiomeGenerators(worldType, seed, agenlayer);
			this.genBiomes = agenlayer[0];
			this.biomeIndexLayer = agenlayer[1];

		}

		public BiomeProviderCustom(World world) {
			this(world.func_72905_C(), world.func_72912_H().func_76067_t());

		}

		/**
		 * Gets the list of valid biomes for the player to spawn in.
		 */
		@Override
		public List<Biome> func_76932_a() {
			return this.biomesToSpawnIn;
		}

		/**
		 * Returns the Biome related to the x, z position on the world.
		 */

		public Biome getBiomeGenerator(BlockPos pos) {
			return this.getBiomeGenerator(pos, (Biome) null);
		}

		public Biome getBiomeGenerator(BlockPos pos, Biome biomeGenBaseIn) {
			return this.biomeCache.func_180284_a(pos.func_177958_n(), pos.func_177952_p(), biomeGenBaseIn);
		}

		/**
		 * Return an adjusted version of a given temperature based on the y
		 * height
		 */
		@Override
		@SideOnly(Side.CLIENT)
		public float func_76939_a(float par1, int par2) {
			return par1;
		}

		/**
		 * Returns an array of biomes for the location input.
		 */
		@Override
		public Biome[] func_76937_a(Biome[] par1ArrayOfBiome, int par2, int par3, int par4, int par5) {
			IntCache.func_76446_a();

			if (par1ArrayOfBiome == null || par1ArrayOfBiome.length < par4 * par5) {
				par1ArrayOfBiome = new Biome[par4 * par5];
			}

			int[] aint = this.genBiomes.func_75904_a(par2, par3, par4, par5);

			try {
				for (int i = 0; i < par4 * par5; ++i) {
					par1ArrayOfBiome[i] = Biome.func_150568_d(aint[i]);
				}

				return par1ArrayOfBiome;
			} catch (Throwable throwable) {
				CrashReport crashreport = CrashReport.func_85055_a(throwable, "Invalid Biome id");
				CrashReportCategory crashreportcategory = crashreport.func_85058_a("RawBiomeBlock");
				crashreportcategory.func_71507_a("biomes[] size", Integer.valueOf(par1ArrayOfBiome.length));
				crashreportcategory.func_71507_a("x", Integer.valueOf(par2));
				crashreportcategory.func_71507_a("z", Integer.valueOf(par3));
				crashreportcategory.func_71507_a("w", Integer.valueOf(par4));
				crashreportcategory.func_71507_a("h", Integer.valueOf(par5));
				throw new ReportedException(crashreport);
			}
		}

		/**
		 * Returns biomes to use for the blocks and loads the other data like
		 * temperature and humidity onto the WorldChunkManager Args:
		 * oldBiomeList, x, z, width, depth
		 */
		@Override
		public Biome[] func_76933_b(Biome[] oldBiomeList, int x, int z, int width, int depth) {
			return this.func_76931_a(oldBiomeList, x, z, width, depth, true);
		}

		/**
		 * Return a list of biomes for the specified blocks. Args: listToReuse,
		 * x, y, width, length, cacheFlag (if false, don't check biomeCache to
		 * avoid infinite loop in BiomeCacheBlock)
		 */
		@Override
		public Biome[] func_76931_a(Biome[] listToReuse, int x, int y, int width, int length, boolean cacheFlag) {
			IntCache.func_76446_a();

			if (listToReuse == null || listToReuse.length < width * length) {
				listToReuse = new Biome[width * length];
			}

			if (cacheFlag && width == 16 && length == 16 && (x & 15) == 0 && (y & 15) == 0) {
				Biome[] aBiome1 = this.biomeCache.func_76839_e(x, y);
				System.arraycopy(aBiome1, 0, listToReuse, 0, width * length);
				return listToReuse;
			} else {
				int[] aint = this.biomeIndexLayer.func_75904_a(x, y, width, length);

				for (int i = 0; i < width * length; ++i) {
					listToReuse[i] = Biome.func_150568_d(aint[i]);
				}
				return listToReuse;
			}
		}

		/**
		 * checks given Chunk's Biomes against List of allowed ones
		 */
		@Override
		@SuppressWarnings("rawtypes")
		public boolean func_76940_a(int x, int y, int z, List par4List) {
			IntCache.func_76446_a();
			int l = x - z >> 2;
			int i1 = y - z >> 2;
			int j1 = x + z >> 2;
			int k1 = y + z >> 2;
			int l1 = j1 - l + 1;
			int i2 = k1 - i1 + 1;
			int[] aint = this.genBiomes.func_75904_a(l, i1, l1, i2);

			try {
				for (int j2 = 0; j2 < l1 * i2; ++j2) {
					Biome biome = Biome.func_150568_d(aint[j2]);

					if (!par4List.contains(biome)) {
						return false;
					}
				}

				return true;
			} catch (Throwable throwable) {
				CrashReport crashreport = CrashReport.func_85055_a(throwable, "Invalid Biome id");
				CrashReportCategory crashreportcategory = crashreport.func_85058_a("Layer");
				crashreportcategory.func_71507_a("Layer", this.genBiomes.toString());
				crashreportcategory.func_71507_a("x", Integer.valueOf(x));
				crashreportcategory.func_71507_a("z", Integer.valueOf(y));
				crashreportcategory.func_71507_a("radius", Integer.valueOf(z));
				crashreportcategory.func_71507_a("allowed", par4List);
				throw new ReportedException(crashreport);
			}
		}

		/**
		 * Finds a valid position within a range, that is in one of the listed
		 * biomes. Searches {par1,par2} +-par3 blocks. Strongly favors positive
		 * y positions.
		 */
		@Override
		@SuppressWarnings("rawtypes")
		public BlockPos func_180630_a(int x, int z, int range, List biomes, Random random) {
			IntCache.func_76446_a();
			int l = x - range >> 2;
			int i1 = z - range >> 2;
			int j1 = x + range >> 2;
			int k1 = z + range >> 2;
			int l1 = j1 - l + 1;
			int i2 = k1 - i1 + 1;
			int[] aint = this.genBiomes.func_75904_a(l, i1, l1, i2);
			BlockPos blockpos = null;
			int j2 = 0;

			for (int k2 = 0; k2 < l1 * i2; ++k2) {
				int l2 = l + k2 % l1 << 2;
				int i3 = i1 + k2 / l1 << 2;
				Biome biome = Biome.func_150568_d(aint[k2]);

				if (biomes.contains(biome) && (blockpos == null || random.nextInt(j2 + 1) == 0)) {
					blockpos = new BlockPos(l2, 0, i3);
					++j2;
				}
			}

			return blockpos;
		}

		/**
		 * Calls the WorldChunkManager's biomeCache.cleanupCache()
		 */
		@Override
		public void func_76938_b() {
			this.biomeCache.func_76838_a();
		}
	}

	public static class GenLayerFix extends GenLayer {

		public GenLayerFix(long seed) {
			super(seed);
		}

		public static GenLayer[] makeTheWorld(long seed, WorldType type) {
			GenLayer biomes = new GenLayerBiomesCustom(1L);
			biomes = new GenLayerZoom(1000L, biomes);
			biomes = new GenLayerZoom(1001L, biomes);
			biomes = new GenLayerZoom(1002L, biomes);
			biomes = new GenLayerZoom(1003L, biomes);
			biomes = new GenLayerZoom(1004L, biomes);
			biomes = new GenLayerZoom(1005L, biomes);
			GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);
			biomes.func_75905_a(seed);
			genlayervoronoizoom.func_75905_a(seed);
			return new GenLayer[]{biomes, genlayervoronoizoom};
		}

		@Override
		public int[] func_75904_a(int p_75904_1_, int p_75904_2_, int p_75904_3_, int p_75904_4_) {
			return null;
		}
	}

	public static class GenLayerBiomesCustom extends GenLayer {

		protected Biome[] allowedBiomes = {EarthBiome.biome,};

		public GenLayerBiomesCustom(long seed) {
			super(seed);
		}

		public GenLayerBiomesCustom(long seed, GenLayer genlayer) {
			super(seed);
			this.field_75909_a = genlayer;
		}

		@Override
		public int[] func_75904_a(int x, int z, int width, int depth) {
			int[] dest = IntCache.func_76445_a(width * depth);
			for (int dz = 0; dz < depth; dz++) {
				for (int dx = 0; dx < width; dx++) {
					this.func_75903_a(dx + x, dz + z);
					dest[(dx + dz * width)] = Biome.func_185362_a(this.allowedBiomes[func_75902_a(this.allowedBiomes.length)]);
				}
			}
			return dest;
		}
	}

	// helpers
	public static Block getBlock(IBlockAccess world, int i, int j, int k) {
		return world.func_180495_p(new BlockPos(i, j, k)).func_177230_c();
	}

}
