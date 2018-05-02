package com.croparia.mod.Item;

import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemEternalEarth extends Item 
{
	public ItemEternalEarth(String name)
	{
		super();
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
		setRegistryName(name);
        setMaxStackSize(1);
        setContainerItem(this);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) 
	{		
		entityIn.setSprinting(true);
	}	
	
	public EnumActionResult onItemUse(EntityPlayer stack, World playerIn, BlockPos worldIn, EnumHand pos, EnumFacing hand, float facing, float hitX, float hitY) 
	{
		ItemStack itemstack = stack.getHeldItem(pos);
		
		if(stack.isSneaking() == true)
		{
			if (!stack.canPlayerEdit(worldIn.offset(hand), hand, itemstack))
	        {
	            return EnumActionResult.FAIL;
	        }
	        else
	        {
	            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, stack, playerIn, worldIn);
	            if (hook != 0) 
	            {
	            	return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;
	            }
	            
	            IBlockState iblockstate = playerIn.getBlockState(worldIn);
	            Block block = iblockstate.getBlock();
	            
	            if (block != Blocks.BEDROCK || playerIn.getBlockState(worldIn) != Blocks.REDSTONE_ORE.getDefaultState() || playerIn.getBlockState(worldIn) != Blocks.LIT_REDSTONE_ORE.getDefaultState() || playerIn.getBlockState(worldIn) != Blocks.IRON_ORE.getDefaultState() || playerIn.getBlockState(worldIn) != Blocks.GOLD_ORE.getDefaultState() || playerIn.getBlockState(worldIn) != Blocks.DIAMOND_ORE.getDefaultState() || playerIn.getBlockState(worldIn) != Blocks.COAL_ORE.getDefaultState() || playerIn.getBlockState(worldIn) != Blocks.QUARTZ_ORE.getDefaultState() || playerIn.getBlockState(worldIn) != Blocks.LAPIS_ORE.getDefaultState() || playerIn.getBlockState(worldIn) != Blocks.EMERALD_ORE.getDefaultState())
        		{
	            		if (hand == EnumFacing.EAST)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.east(), playerIn.getBlockState(worldIn));
	            			return EnumActionResult.SUCCESS;  
            			
	            		}
	            		else if (hand == EnumFacing.WEST)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.west(), playerIn.getBlockState(worldIn));
	            			return EnumActionResult.SUCCESS;  
	            		}
	            		else if (hand == EnumFacing.SOUTH)
	            		{
	            				this.setBlock(itemstack, stack, playerIn, worldIn.south(), playerIn.getBlockState(worldIn));
	            				return EnumActionResult.SUCCESS;  
	            		}
	            		else if (hand == EnumFacing.NORTH)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.north(), playerIn.getBlockState(worldIn));
	            			return EnumActionResult.SUCCESS;  
	            		}
	            		else  if (hand == EnumFacing.UP)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.up(), playerIn.getBlockState(worldIn));
	            			return EnumActionResult.SUCCESS;  
	            		} 
	            		else  if (hand == EnumFacing.DOWN)
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.down(), playerIn.getBlockState(worldIn));
	            			return EnumActionResult.SUCCESS;  
	            		}
	        		
	            }  
	        }
		
		}
		
		
		return EnumActionResult.PASS;	
	}
	
    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
    {
        worldIn.playSound(player, pos, SoundEvents.BLOCK_ENDERCHEST_OPEN, SoundCategory.BLOCKS, 2.0F, 2.0F);

        if (!worldIn.isRemote)
        {
            worldIn.setBlockState(pos, state, 11);
            stack.damageItem(1, player);
        }
    }

	
}
