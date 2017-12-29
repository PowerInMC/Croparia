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

    		Blocks.STONE,
    		Blocks.GRASS,
    	    Blocks.DIRT,
    	    Blocks.COBBLESTONE,
    	    Blocks.PLANKS,
    	    Blocks.SAPLING,
    	    Blocks.SAND,
    	    Blocks.GRAVEL,
    	    Blocks.GOLD_ORE,
    	    Blocks.IRON_ORE,
    	    Blocks.COAL_ORE,
    	    Blocks.LOG,
    	    Blocks.LOG2,
    	    Blocks.LEAVES,
    	    Blocks.LEAVES2,
    	    Blocks.SPONGE,
    	    Blocks.GLASS,
    	    Blocks.LAPIS_ORE,
    	    Blocks.LAPIS_BLOCK,
    	    Blocks.DISPENSER,
    	    Blocks.SANDSTONE,
    	    Blocks.NOTEBLOCK,
    	    Blocks.BED,
    	    Blocks.GOLDEN_RAIL,
    	    Blocks.DETECTOR_RAIL,
    	    Blocks.STICKY_PISTON,
    	    Blocks.WEB,
    	    Blocks.PISTON,
    	    Blocks.PISTON_HEAD,
    	    Blocks.WOOL,
    	    Blocks.GOLD_BLOCK,
    	    Blocks.IRON_BLOCK,
    	    Blocks.DOUBLE_STONE_SLAB,
    	    Blocks.STONE_SLAB,
    	    Blocks.BRICK_BLOCK,
    	    Blocks.TNT,
    	    Blocks.BOOKSHELF,
    	    Blocks.MOSSY_COBBLESTONE,
    	    Blocks.OBSIDIAN,
    	    Blocks.TORCH,
    	    Blocks.MOB_SPAWNER,
    	    Blocks.OAK_STAIRS,
    	    Blocks.CHEST,
    	    Blocks.DIAMOND_ORE,
    	    Blocks.DIAMOND_BLOCK,
    	    Blocks.CRAFTING_TABLE,
    	    Blocks.WHEAT,
    	    Blocks.FARMLAND,
    	    Blocks.FURNACE,
    	    Blocks.LIT_FURNACE,
    	    Blocks.STANDING_SIGN,
    	    Blocks.OAK_DOOR,
    	    Blocks.SPRUCE_DOOR,
    	    Blocks.BIRCH_DOOR,
    	    Blocks.JUNGLE_DOOR,
    	    Blocks.ACACIA_DOOR,
    	    Blocks.DARK_OAK_DOOR,
    	    Blocks.LADDER,
    	    Blocks.RAIL,
    	    Blocks.STONE_STAIRS,
    	    Blocks.WALL_SIGN,
    	    Blocks.LEVER,
    	    Blocks.STONE_PRESSURE_PLATE,
    	    Blocks.IRON_DOOR,
    	    Blocks.WOODEN_PRESSURE_PLATE,
    	    Blocks.REDSTONE_ORE,
    	    Blocks.LIT_REDSTONE_ORE,
    	    Blocks.UNLIT_REDSTONE_TORCH,
    	    Blocks.REDSTONE_TORCH,
    	    Blocks.STONE_BUTTON,
    	    Blocks.SNOW_LAYER,
    	    Blocks.ICE,
    	    Blocks.SNOW,
    	    Blocks.CLAY,
    	    Blocks.JUKEBOX,
    	    Blocks.OAK_FENCE,
    	    Blocks.SPRUCE_FENCE,
    	    Blocks.BIRCH_FENCE,
    	    Blocks.JUNGLE_FENCE,
    	    Blocks.DARK_OAK_FENCE,
    	    Blocks.ACACIA_FENCE,
    	    Blocks.PUMPKIN,
    	    Blocks.NETHERRACK,
    	    Blocks.SOUL_SAND,
    	    Blocks.GLOWSTONE,
    	    Blocks.LIT_PUMPKIN,
    	    Blocks.CAKE,
    	    Blocks.TRAPDOOR,
    	    Blocks.MONSTER_EGG,
    	    Blocks.STONEBRICK,
    	    Blocks.BROWN_MUSHROOM_BLOCK,
    	    Blocks.RED_MUSHROOM_BLOCK,
    	    Blocks.IRON_BARS,
    	    Blocks.GLASS_PANE,
    	    Blocks.MELON_BLOCK,
    	    Blocks.PUMPKIN_STEM,
    	    Blocks.MELON_STEM,
    	    Blocks.VINE,
    	    Blocks.OAK_FENCE_GATE,
    	    Blocks.SPRUCE_FENCE_GATE,
    	    Blocks.BIRCH_FENCE_GATE,
    	    Blocks.JUNGLE_FENCE_GATE,
    	    Blocks.DARK_OAK_FENCE_GATE,
    	    Blocks.ACACIA_FENCE_GATE,
    	    Blocks.BRICK_STAIRS,
    	    Blocks.STONE_BRICK_STAIRS,
    	    Blocks.MYCELIUM,
    	    Blocks.WATERLILY,
    	    Blocks.NETHER_BRICK,
    	    Blocks.NETHER_BRICK_FENCE,
    	    Blocks.NETHER_BRICK_STAIRS,
    	    Blocks.NETHER_WART,
    	    Blocks.ENCHANTING_TABLE,
    	    Blocks.BREWING_STAND,
    	    Blocks.CAULDRON,
    	    Blocks.END_PORTAL,
    	    Blocks.END_PORTAL_FRAME,
    	    Blocks.END_STONE,
    	    Blocks.DRAGON_EGG,
    	    Blocks.REDSTONE_LAMP,
    	    Blocks.LIT_REDSTONE_LAMP,
    	    Blocks.DOUBLE_WOODEN_SLAB,
    	    Blocks.WOODEN_SLAB,
    	    Blocks.COCOA,
    	    Blocks.SANDSTONE_STAIRS,
    	    Blocks.EMERALD_ORE,
    	    Blocks.ENDER_CHEST,
    	    Blocks.TRIPWIRE,
    	    Blocks.EMERALD_BLOCK,
    	    Blocks.SPRUCE_STAIRS,
    	    Blocks.BIRCH_STAIRS,
    	    Blocks.JUNGLE_STAIRS,
    	    Blocks.COMMAND_BLOCK,
    	    Blocks.BEACON,
    	    Blocks.COBBLESTONE_WALL,
    	    Blocks.FLOWER_POT,
    	    Blocks.CARROTS,
    	    Blocks.POTATOES,
    	    Blocks.WOODEN_BUTTON,
    	    Blocks.ANVIL,
    	    Blocks.TRAPPED_CHEST,
    	    Blocks.UNPOWERED_COMPARATOR,
    	    Blocks.POWERED_COMPARATOR,
    	    Blocks.DAYLIGHT_DETECTOR,
    	    Blocks.DAYLIGHT_DETECTOR_INVERTED,
    	    Blocks.REDSTONE_BLOCK,
    	    Blocks.QUARTZ_ORE,
    	    Blocks.HOPPER,
    	    Blocks.QUARTZ_BLOCK,
    	    Blocks.QUARTZ_STAIRS,
    	    Blocks.ACTIVATOR_RAIL,
    	    Blocks.DROPPER,
    	    Blocks.STAINED_HARDENED_CLAY,
    	    Blocks.BARRIER,
    	    Blocks.IRON_TRAPDOOR,
    	    Blocks.HAY_BLOCK,
    	    Blocks.CARPET,
    	    Blocks.HARDENED_CLAY,
    	    Blocks.COAL_BLOCK,
    	    Blocks.PACKED_ICE,
    	    Blocks.ACACIA_STAIRS,
    	    Blocks.DARK_OAK_STAIRS,
    	    Blocks.SLIME_BLOCK,
    	    Blocks.DOUBLE_PLANT,
    	    Blocks.STAINED_GLASS,
    	    Blocks.STAINED_GLASS_PANE,
    	    Blocks.PRISMARINE,
    	    Blocks.SEA_LANTERN,
    	    Blocks.STANDING_BANNER,
    	    Blocks.WALL_BANNER,
    	    Blocks.RED_SANDSTONE,
    	    Blocks.RED_SANDSTONE_STAIRS,
    	    Blocks.DOUBLE_STONE_SLAB2,
    	    Blocks.STONE_SLAB2,
    	    Blocks.END_ROD,
    	    Blocks.CHORUS_PLANT,
    	    Blocks.CHORUS_FLOWER,
    	    Blocks.PURPUR_BLOCK,
    	    Blocks.PURPUR_PILLAR,
    	    Blocks.PURPUR_STAIRS,
    	    Blocks.PURPUR_DOUBLE_SLAB,
    	    Blocks.PURPUR_SLAB,
    	    Blocks.END_BRICKS,
    	    Blocks.BEETROOTS,
    	    Blocks.GRASS_PATH,
    	    Blocks.END_GATEWAY,
    	    Blocks.REPEATING_COMMAND_BLOCK,
    	    Blocks.CHAIN_COMMAND_BLOCK,
    	    Blocks.FROSTED_ICE,
    	    Blocks.MAGMA,
    	    Blocks.NETHER_WART_BLOCK,
    	    Blocks.RED_NETHER_BRICK,
    	    Blocks.BONE_BLOCK,
    	    Blocks.STRUCTURE_VOID,
    	    Blocks.OBSERVER,
    	    Blocks.WHITE_SHULKER_BOX,
    	    Blocks.ORANGE_SHULKER_BOX,
    	    Blocks.MAGENTA_SHULKER_BOX,
    	    Blocks.LIGHT_BLUE_SHULKER_BOX,
    	    Blocks.YELLOW_SHULKER_BOX,
    	    Blocks.LIME_SHULKER_BOX,
    	    Blocks.PINK_SHULKER_BOX,
    	    Blocks.GRAY_SHULKER_BOX,
    	    Blocks.SILVER_SHULKER_BOX,
    	    Blocks.CYAN_SHULKER_BOX,
    	    Blocks.PURPLE_SHULKER_BOX,
    	    Blocks.BLUE_SHULKER_BOX,
    	    Blocks.BROWN_SHULKER_BOX,
    	    Blocks.GREEN_SHULKER_BOX,
    	    Blocks.RED_SHULKER_BOX,
    	    Blocks.BLACK_SHULKER_BOX,
    	    Blocks.WHITE_GLAZED_TERRACOTTA,
    	    Blocks.ORANGE_GLAZED_TERRACOTTA,
    	    Blocks.MAGENTA_GLAZED_TERRACOTTA,
    	    Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA,
    	    Blocks.YELLOW_GLAZED_TERRACOTTA,
    	    Blocks.LIME_GLAZED_TERRACOTTA,
    	    Blocks.PINK_GLAZED_TERRACOTTA,
    	    Blocks.GRAY_GLAZED_TERRACOTTA,
    	    Blocks.SILVER_GLAZED_TERRACOTTA,
    	    Blocks.CYAN_GLAZED_TERRACOTTA,
    	    Blocks.PURPLE_GLAZED_TERRACOTTA,
    	    Blocks.BLUE_GLAZED_TERRACOTTA,
    	    Blocks.BROWN_GLAZED_TERRACOTTA,
    	    Blocks.GREEN_GLAZED_TERRACOTTA,
    	    Blocks.RED_GLAZED_TERRACOTTA,
    	    Blocks.BLACK_GLAZED_TERRACOTTA,
    	    Blocks.CONCRETE,
    	    Blocks.CONCRETE_POWDER,
    	    Blocks.OBSERVER,
    	    Blocks.WHITE_SHULKER_BOX,
    	    Blocks.ORANGE_SHULKER_BOX,
    	    Blocks.MAGENTA_SHULKER_BOX,
    	    Blocks.LIGHT_BLUE_SHULKER_BOX,
    	    Blocks.YELLOW_SHULKER_BOX,
    	    Blocks.LIME_SHULKER_BOX,
    	    Blocks.PINK_SHULKER_BOX,
    	    Blocks.GRAY_SHULKER_BOX,
    	    Blocks.SILVER_SHULKER_BOX,
    	    Blocks.CYAN_SHULKER_BOX,
    	    Blocks.PURPLE_SHULKER_BOX,
    	    Blocks.BLUE_SHULKER_BOX,
    	    Blocks.BROWN_SHULKER_BOX,
    	    Blocks.GREEN_SHULKER_BOX,
    	    Blocks.RED_SHULKER_BOX,
    	    Blocks.BLACK_SHULKER_BOX,
    	    Blocks.WHITE_GLAZED_TERRACOTTA,
    	    Blocks.ORANGE_GLAZED_TERRACOTTA,
    	    Blocks.MAGENTA_GLAZED_TERRACOTTA,
    	    Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA,
    	    Blocks.YELLOW_GLAZED_TERRACOTTA,
    	    Blocks.LIME_GLAZED_TERRACOTTA,
    	    Blocks.PINK_GLAZED_TERRACOTTA,
    	    Blocks.GRAY_GLAZED_TERRACOTTA,
    	    Blocks.SILVER_GLAZED_TERRACOTTA,
    	    Blocks.CYAN_GLAZED_TERRACOTTA,
    	    Blocks.PURPLE_GLAZED_TERRACOTTA,
    	    Blocks.BLUE_GLAZED_TERRACOTTA,
    	    Blocks.BROWN_GLAZED_TERRACOTTA,
    	    Blocks.GREEN_GLAZED_TERRACOTTA,
    	    Blocks.RED_GLAZED_TERRACOTTA,
    	    Blocks.BLACK_GLAZED_TERRACOTTA,
    	    Blocks.CONCRETE,
    	    Blocks.CONCRETE_POWDER,
    	    Blocks.STRUCTURE_BLOCK});

    
    private static final float[] ATTACK_DAMAGES = new float[] {6.0F, 8.0F, 8.0F, 8.0F, 6.0F};
    private static final float[] ATTACK_SPEEDS = new float[] {-3.2F, -3.2F, -3.1F, -3.0F, -3.0F};

    public ItemMultitool(Item.ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        this.damageVsEntity = ATTACK_DAMAGES[material.ordinal()];
        this.attackSpeed = ATTACK_SPEEDS[material.ordinal()];
    }

    public ItemMultitool(float damage, float speed, Item.ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        this.damageVsEntity = damage;
        this.attackSpeed = speed;
    }
    
	@Override
	public boolean canHarvestBlock(IBlockState blockIn)
	{
		return true;
	}


    public float getStrvVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE && material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }

    @SuppressWarnings("incomplete-switch")
    public EnumActionResult onItemUse(EntityPlayer stack, World playerIn, BlockPos worldIn, EnumHand pos, EnumFacing hand, float facing, float hitX, float hitY)
    {
        ItemStack itemstack = stack.getHeldItem(pos);

        if (!stack.canPlayerEdit(worldIn.offset(hand), hand, itemstack))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, stack, playerIn, worldIn);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

            IBlockState iblockstate = playerIn.getBlockState(worldIn);
            Block block = iblockstate.getBlock();

            if (hand != EnumFacing.DOWN && playerIn.isAirBlock(worldIn.up()))
            {
                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
                {
                    this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.FARMLAND.getDefaultState());
                    return EnumActionResult.SUCCESS;
                }

                if (block == Blocks.DIRT)
                {
                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
                    {
                        case DIRT:
                            this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.FARMLAND.getDefaultState());
                            return EnumActionResult.SUCCESS;
                        case COARSE_DIRT:
                            this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                            return EnumActionResult.SUCCESS;
                    }
                }
            }

            return EnumActionResult.PASS;
        }
    }


    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
    {
        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

        if (!worldIn.isRemote)
        {
            worldIn.setBlockState(pos, state, 11);
            stack.damageItem(1, player);
        }
    }

    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(input.getItem() == ItemMod.wood_multitool)
        {
            if(repair.getItem() == Item.getItemFromBlock(Blocks.PLANKS))
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.stone_multitool)
        {
            if(repair.getItem() == Item.getItemFromBlock(Blocks.COBBLESTONE))
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.iron_multitool)
        {
            if(repair.getItem() == Items.IRON_INGOT)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.gold_multitool)
        {
            if(repair.getItem() == Items.GOLD_INGOT)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.diamond_multitool)
        {
            if(repair.getItem() == Items.DIAMOND)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.air_multitool)
        {
            if(repair.getItem() == ItemMod.elemental_air)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.fire_multitool)
        {
            if(repair.getItem() == ItemMod.elemental_fire)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.water_multitool)
        {
            if(repair.getItem() == ItemMod.elemental_water)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.earth_multitool)
        {
            if(repair.getItem() == ItemMod.elemental_earth)
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.obsidian_multitool)
        {
            if(repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN))
            {
                return true;
            }
        }
        else if(input.getItem() == ItemMod.renforced_multitool)
        {
            if(repair.getItem() == Items.DIAMOND)
            {
                return true;
            }
        }
        return false;
    }

}
