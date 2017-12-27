package com.croparia.mod.Item.Tool;

import java.util.Set;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBeacon;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockCauldron;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockDaylightDetector;
import net.minecraft.block.BlockDeadBush;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockMycelium;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.block.BlockPistonMoving;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.BlockRedstoneComparator;
import net.minecraft.block.BlockRedstoneRepeater;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTripWireHook;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemMultitool extends ItemTool
{

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {
    		BlockMod.block_plant_coal,
    		BlockMod.block_plant_iron,
    		BlockMod.block_plant_gold,
    		BlockMod.block_plant_redstone,
    		BlockMod.block_plant_lapis,
    		BlockMod.block_plant_diamond,
    		BlockMod.block_plant_clay,
    		BlockMod.block_plant_glowstone,
    		BlockMod.block_plant_emerald,
    		BlockMod.block_plant_quartz,
    		BlockMod.block_plant_shard,
    		BlockMod.block_plant_cristal,		
    		BlockMod.block_plant_obsidian,
    		BlockMod.block_plant_bone,
    		BlockMod.block_plant_snow,
    		BlockMod.block_plant_nether,
    		BlockMod.block_plant_glass,
    		BlockMod.block_plant_magma,
    		BlockMod.block_plant_shell,   		
    		BlockMod.elemental_stone,
    		BlockMod.elemental_cobblestone,
    		BlockMod.elemental_crop,
    		BlockMod.stem_elemental,
    		BlockMod.block_plant_elemental,
    		BlockMod.fruit_grass,
    		BlockMod.coal_furnace,
    		BlockMod.lit_coal_furnace,  		
    		BlockMod.iron_furnace,
    		BlockMod.lit_iron_furnace,	
    		BlockMod.gold_furnace,
    		BlockMod.lit_gold_furnace,
    		BlockMod.redstone_furnace,
    		BlockMod.lit_redstone_furnace,
    		BlockMod.lapis_furnace,
    		BlockMod.lit_lapis_furnace,
    		BlockMod.diamond_furnace,
    		BlockMod.lit_diamond_furnace,   				
    		BlockMod.obsidian_furnace,
    		BlockMod.lit_obsidian_furnace,	
    		BlockMod.renforced_furnace,
    		BlockMod.lit_renforced_furnace,		
    		BlockMod.fire_furnace,
    		BlockMod.lit_fire_furnace,  		
    		BlockMod.seafarer_spawn,
    		BlockMod.centaur_spawn,
    		BlockMod.minotaur_spawn,
    		BlockMod.flyingbeast_spawn,
       		BlockMod.water_block,
    		BlockMod.fire_block,
    		BlockMod.air_block,
    		BlockMod.earth_block,

    		Blocks.field_150348_b,
    		Blocks.field_150349_c,
    	    Blocks.field_150346_d,
    	    Blocks.field_150347_e,
    	    Blocks.field_150344_f,
    	    Blocks.field_150345_g,
    	    Blocks.field_150354_m,
    	    Blocks.field_150351_n,
    	    Blocks.field_150352_o,
    	    Blocks.field_150366_p,
    	    Blocks.field_150365_q,
    	    Blocks.field_150364_r,
    	    Blocks.field_150363_s,
    	    Blocks.field_150362_t,
    	    Blocks.field_150361_u,
    	    Blocks.field_150360_v,
    	    Blocks.field_150359_w,
    	    Blocks.field_150369_x,
    	    Blocks.field_150368_y,
    	    Blocks.field_150367_z,
    	    Blocks.field_150322_A,
    	    Blocks.field_150323_B,
    	    Blocks.field_150324_C,
    	    Blocks.field_150318_D,
    	    Blocks.field_150319_E,
    	    Blocks.field_150320_F,
    	    Blocks.field_150321_G,
    	    Blocks.field_150331_J,
    	    Blocks.field_150332_K,
    	    Blocks.field_150325_L,
    	    Blocks.field_150340_R,
    	    Blocks.field_150339_S,
    	    Blocks.field_150334_T,
    	    Blocks.field_150333_U,
    	    Blocks.field_150336_V,
    	    Blocks.field_150335_W,
    	    Blocks.field_150342_X,
    	    Blocks.field_150341_Y,
    	    Blocks.field_150343_Z,
    	    Blocks.field_150478_aa,
    	    Blocks.field_150474_ac,
    	    Blocks.field_150476_ad,
    	    Blocks.field_150486_ae,
    	    Blocks.field_150482_ag,
    	    Blocks.field_150484_ah,
    	    Blocks.field_150462_ai,
    	    Blocks.field_150464_aj,
    	    Blocks.field_150458_ak,
    	    Blocks.field_150460_al,
    	    Blocks.field_150470_am,
    	    Blocks.field_150472_an,
    	    Blocks.field_180413_ao,
    	    Blocks.field_180414_ap,
    	    Blocks.field_180412_aq,
    	    Blocks.field_180411_ar,
    	    Blocks.field_180410_as,
    	    Blocks.field_180409_at,
    	    Blocks.field_150468_ap,
    	    Blocks.field_150448_aq,
    	    Blocks.field_150446_ar,
    	    Blocks.field_150444_as,
    	    Blocks.field_150442_at,
    	    Blocks.field_150456_au,
    	    Blocks.field_150454_av,
    	    Blocks.field_150452_aw,
    	    Blocks.field_150450_ax,
    	    Blocks.field_150439_ay,
    	    Blocks.field_150437_az,
    	    Blocks.field_150429_aA,
    	    Blocks.field_150430_aB,
    	    Blocks.field_150431_aC,
    	    Blocks.field_150432_aD,
    	    Blocks.field_150433_aE,
    	    Blocks.field_150435_aG,
    	    Blocks.field_150421_aI,
    	    Blocks.field_180407_aO,
    	    Blocks.field_180408_aP,
    	    Blocks.field_180404_aQ,
    	    Blocks.field_180403_aR,
    	    Blocks.field_180406_aS,
    	    Blocks.field_180405_aT,
    	    Blocks.field_150423_aK,
    	    Blocks.field_150424_aL,
    	    Blocks.field_150425_aM,
    	    Blocks.field_150426_aN,
    	    Blocks.field_150428_aP,
    	    Blocks.field_150414_aQ,
    	    Blocks.field_150415_aT,
    	    Blocks.field_150418_aU,
    	    Blocks.field_150417_aV,
    	    Blocks.field_150420_aW,
    	    Blocks.field_150419_aX,
    	    Blocks.field_150411_aY,
    	    Blocks.field_150410_aZ,
    	    Blocks.field_150440_ba,
    	    Blocks.field_150393_bb,
    	    Blocks.field_150394_bc,
    	    Blocks.field_150395_bd,
    	    Blocks.field_180390_bo,
    	    Blocks.field_180391_bp,
    	    Blocks.field_180392_bq,
    	    Blocks.field_180386_br,
    	    Blocks.field_180385_bs,
    	    Blocks.field_180387_bt,
    	    Blocks.field_150389_bf,
    	    Blocks.field_150390_bg,
    	    Blocks.field_150391_bh,
    	    Blocks.field_150392_bi,
    	    Blocks.field_150385_bj,
    	    Blocks.field_150386_bk,
    	    Blocks.field_150387_bl,
    	    Blocks.field_150388_bm,
    	    Blocks.field_150381_bn,
    	    Blocks.field_150382_bo,
    	    Blocks.field_150383_bp,
    	    Blocks.field_150384_bq,
    	    Blocks.field_150378_br,
    	    Blocks.field_150377_bs,
    	    Blocks.field_150380_bt,
    	    Blocks.field_150379_bu,
    	    Blocks.field_150374_bv,
    	    Blocks.field_150373_bw,
    	    Blocks.field_150376_bx,
    	    Blocks.field_150375_by,
    	    Blocks.field_150372_bz,
    	    Blocks.field_150412_bA,
    	    Blocks.field_150477_bB,
    	    Blocks.field_150473_bD,
    	    Blocks.field_150475_bE,
    	    Blocks.field_150485_bF,
    	    Blocks.field_150487_bG,
    	    Blocks.field_150481_bH,
    	    Blocks.field_150483_bI,
    	    Blocks.field_150461_bJ,
    	    Blocks.field_150463_bK,
    	    Blocks.field_150457_bL,
    	    Blocks.field_150459_bM,
    	    Blocks.field_150469_bN,
    	    Blocks.field_150471_bO,
    	    Blocks.field_150467_bQ,
    	    Blocks.field_150447_bR,
    	    Blocks.field_150441_bU,
    	    Blocks.field_150455_bV,
    	    Blocks.field_150453_bW,
    	    Blocks.field_180402_cm,
    	    Blocks.field_150451_bX,
    	    Blocks.field_150449_bY,
    	    Blocks.field_150438_bZ,
    	    Blocks.field_150371_ca,
    	    Blocks.field_150370_cb,
    	    Blocks.field_150408_cc,
    	    Blocks.field_150409_cd,
    	    Blocks.field_150406_ce,
    	    Blocks.field_180401_cv,
    	    Blocks.field_180400_cw,
    	    Blocks.field_150407_cf,
    	    Blocks.field_150404_cg,
    	    Blocks.field_150405_ch,
    	    Blocks.field_150402_ci,
    	    Blocks.field_150403_cj,
    	    Blocks.field_150400_ck,
    	    Blocks.field_150401_cl,
    	    Blocks.field_180399_cE,
    	    Blocks.field_150398_cm,
    	    Blocks.field_150399_cn,
    	    Blocks.field_150397_co,
    	    Blocks.field_180397_cI,
    	    Blocks.field_180398_cJ,
    	    Blocks.field_180393_cK,
    	    Blocks.field_180394_cL,
    	    Blocks.field_180395_cM,
    	    Blocks.field_180396_cN,
    	    Blocks.field_180388_cO,
    	    Blocks.field_180389_cP,
    	    Blocks.field_185764_cQ,
    	    Blocks.field_185765_cR,
    	    Blocks.field_185766_cS,
    	    Blocks.field_185767_cT,
    	    Blocks.field_185768_cU,
    	    Blocks.field_185769_cV,
    	    Blocks.field_185770_cW,
    	    Blocks.field_185771_cX,
    	    Blocks.field_185772_cY,
    	    Blocks.field_185773_cZ,
    	    Blocks.field_185774_da,
    	    Blocks.field_185775_db,
    	    Blocks.field_185776_dc,
    	    Blocks.field_185777_dd,
    	    Blocks.field_185778_de,
    	    Blocks.field_189877_df,
    	    Blocks.field_189878_dg,
    	    Blocks.field_189879_dh,
    	    Blocks.field_189880_di,
    	    Blocks.field_189881_dj,
    	    Blocks.field_190976_dk,
    	    Blocks.field_190977_dl,
    	    Blocks.field_190978_dm,
    	    Blocks.field_190979_dn,
    	    Blocks.field_190980_do,
    	    Blocks.field_190981_dp,
    	    Blocks.field_190982_dq,
    	    Blocks.field_190983_dr,
    	    Blocks.field_190984_ds,
    	    Blocks.field_190985_dt,
    	    Blocks.field_190986_du,
    	    Blocks.field_190987_dv,
    	    Blocks.field_190988_dw,
    	    Blocks.field_190989_dx,
    	    Blocks.field_190990_dy,
    	    Blocks.field_190991_dz,
    	    Blocks.field_190975_dA,
    	    Blocks.field_192427_dB,
    	    Blocks.field_192428_dC,
    	    Blocks.field_192429_dD,
    	    Blocks.field_192430_dE,
    	    Blocks.field_192431_dF,
    	    Blocks.field_192432_dG,
    	    Blocks.field_192433_dH,
    	    Blocks.field_192434_dI,
    	    Blocks.field_192435_dJ,
    	    Blocks.field_192436_dK,
    	    Blocks.field_192437_dL,
    	    Blocks.field_192438_dM,
    	    Blocks.field_192439_dN,
    	    Blocks.field_192440_dO,
    	    Blocks.field_192441_dP,
    	    Blocks.field_192442_dQ,
    	    Blocks.field_192443_dR,
    	    Blocks.field_192444_dS,
    	    Blocks.field_190976_dk,
    	    Blocks.field_190977_dl,
    	    Blocks.field_190978_dm,
    	    Blocks.field_190979_dn,
    	    Blocks.field_190980_do,
    	    Blocks.field_190981_dp,
    	    Blocks.field_190982_dq,
    	    Blocks.field_190983_dr,
    	    Blocks.field_190984_ds,
    	    Blocks.field_190985_dt,
    	    Blocks.field_190986_du,
    	    Blocks.field_190987_dv,
    	    Blocks.field_190988_dw,
    	    Blocks.field_190989_dx,
    	    Blocks.field_190990_dy,
    	    Blocks.field_190991_dz,
    	    Blocks.field_190975_dA,
    	    Blocks.field_192427_dB,
    	    Blocks.field_192428_dC,
    	    Blocks.field_192429_dD,
    	    Blocks.field_192430_dE,
    	    Blocks.field_192431_dF,
    	    Blocks.field_192432_dG,
    	    Blocks.field_192433_dH,
    	    Blocks.field_192434_dI,
    	    Blocks.field_192435_dJ,
    	    Blocks.field_192436_dK,
    	    Blocks.field_192437_dL,
    	    Blocks.field_192438_dM,
    	    Blocks.field_192439_dN,
    	    Blocks.field_192440_dO,
    	    Blocks.field_192441_dP,
    	    Blocks.field_192442_dQ,
    	    Blocks.field_192443_dR,
    	    Blocks.field_192444_dS,
    	    Blocks.field_185779_df});

    
    private static final float[] ATTACK_DAMAGES = new float[] {6.0F, 8.0F, 8.0F, 8.0F, 6.0F};
    private static final float[] ATTACK_SPEEDS = new float[] {-3.2F, -3.2F, -3.1F, -3.0F, -3.0F};

    public ItemMultitool(Item.ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        this.field_77865_bY = ATTACK_DAMAGES[material.ordinal()];
        this.field_185065_c = ATTACK_SPEEDS[material.ordinal()];
    }

    public ItemMultitool(float damage, float speed, Item.ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        this.field_77865_bY = damage;
        this.field_185065_c = speed;
    }
    
	@Override
	public boolean func_150897_b(IBlockState blockIn)
	{
		return true;
	}


    public float getStrvVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.func_185904_a();
        return material != Material.field_151575_d && material != Material.field_151585_k && material != Material.field_151582_l && material != Material.field_151573_f && material != Material.field_151574_g && material != Material.field_151576_e ? super.func_150893_a(stack, state) : this.field_77864_a;
    }

    @SuppressWarnings("incomplete-switch")
    public EnumActionResult func_180614_a(EntityPlayer stack, World playerIn, BlockPos worldIn, EnumHand pos, EnumFacing hand, float facing, float hitX, float hitY)
    {
        ItemStack itemstack = stack.func_184586_b(pos);

        if (!stack.func_175151_a(worldIn.func_177972_a(hand), hand, itemstack))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, stack, playerIn, worldIn);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

            IBlockState iblockstate = playerIn.func_180495_p(worldIn);
            Block block = iblockstate.func_177230_c();

            if (hand != EnumFacing.DOWN && playerIn.func_175623_d(worldIn.func_177984_a()))
            {
                if (block == Blocks.field_150349_c || block == Blocks.field_185774_da)
                {
                    this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.field_150458_ak.func_176223_P());
                    return EnumActionResult.SUCCESS;
                }

                if (block == Blocks.field_150346_d)
                {
                    switch ((BlockDirt.DirtType)iblockstate.func_177229_b(BlockDirt.field_176386_a))
                    {
                        case DIRT:
                            this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.field_150458_ak.func_176223_P());
                            return EnumActionResult.SUCCESS;
                        case COARSE_DIRT:
                            this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.field_150346_d.func_176223_P().func_177226_a(BlockDirt.field_176386_a, BlockDirt.DirtType.DIRT));
                            return EnumActionResult.SUCCESS;
                    }
                }
            }

            return EnumActionResult.PASS;
        }
    }


    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
    {
        worldIn.func_184133_a(player, pos, SoundEvents.field_187693_cj, SoundCategory.BLOCKS, 1.0F, 1.0F);

        if (!worldIn.field_72995_K)
        {
            worldIn.func_180501_a(pos, state, 11);
            stack.func_77972_a(1, player);
        }
    }

    public boolean func_82789_a(ItemStack input, ItemStack repair)
    {
        if(input.func_77973_b() == ItemMod.wood_multitool)
        {
            if(repair.func_77973_b() == Item.func_150898_a(Blocks.field_150344_f))
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.stone_multitool)
        {
            if(repair.func_77973_b() == Item.func_150898_a(Blocks.field_150347_e))
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.iron_multitool)
        {
            if(repair.func_77973_b() == Items.field_151042_j)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.gold_multitool)
        {
            if(repair.func_77973_b() == Items.field_151043_k)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.diamond_multitool)
        {
            if(repair.func_77973_b() == Items.field_151045_i)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.air_multitool)
        {
            if(repair.func_77973_b() == ItemMod.elemental_air)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.fire_multitool)
        {
            if(repair.func_77973_b() == ItemMod.elemental_fire)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.water_multitool)
        {
            if(repair.func_77973_b() == ItemMod.elemental_water)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.earth_multitool)
        {
            if(repair.func_77973_b() == ItemMod.elemental_earth)
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.obsidian_multitool)
        {
            if(repair.func_77973_b() == Item.func_150898_a(Blocks.field_150343_Z))
            {
                return true;
            }
        }
        else if(input.func_77973_b() == ItemMod.renforced_multitool)
        {
            if(repair.func_77973_b() == Items.field_151045_i)
            {
                return true;
            }
        }
        return false;
    }

}
