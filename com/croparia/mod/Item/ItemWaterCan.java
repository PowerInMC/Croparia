package com.croparia.mod.Item;

import java.util.Set;

import com.croparia.mod.Init.Registry.CreativeTabsRegistry;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemWaterCan extends ItemTool
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.AIR});

	public ItemWaterCan() {
		super(ToolMaterial.IRON, EFFECTIVE_ON);
		setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
		setMaxDamage(500);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		ItemStack stack = player.getHeldItemMainhand();
		if(!worldIn.isRemote && worldIn.getBlockState(pos).getBlock() == Blocks.BONE_BLOCK && stack.getItemDamage() >= 18)
		{
			worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
			stack.damageItem(-18, player);
			return EnumActionResult.SUCCESS;	
		}
		if(applyBonemeal(stack, worldIn, pos, player, hand))
            {
                if (!worldIn.isRemote)
                {
                    worldIn.playEvent(2005, pos, 0);
            		stack.damageItem(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.north(), player, hand))
            {
                if (!worldIn.isRemote)
                {
                    worldIn.playEvent(2005, pos, 0);
            		stack.damageItem(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.south(), player, hand))
            {
                if (!worldIn.isRemote)
                {
                    worldIn.playEvent(2005, pos, 0);
            		stack.damageItem(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.east(), player, hand))
            {
                if (!worldIn.isRemote)
                {
                    worldIn.playEvent(2005, pos, 0);
            		stack.damageItem(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.west(), player, hand))
            {
                if (!worldIn.isRemote)
                {
                    worldIn.playEvent(2005, pos, 0);
            		stack.damageItem(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.north().west(), player, hand))
		{
			if (!worldIn.isRemote)
			{
				worldIn.playEvent(2005, pos, 0);
				stack.damageItem(1, player);
			}
		}
		if(applyBonemeal(stack, worldIn, pos.south().east(), player, hand))
            {
                if (!worldIn.isRemote)
                {
                    worldIn.playEvent(2005, pos, 0);
            		stack.damageItem(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.north().east(), player, hand))
            {
                if (!worldIn.isRemote)
                {
                    worldIn.playEvent(2005, pos, 0);
            		stack.damageItem(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.south().west(), player, hand))
            {
                if (!worldIn.isRemote)
                {
                    worldIn.playEvent(2005, pos, 0);
            		stack.damageItem(1, player);
                }
            }

		return EnumActionResult.SUCCESS;	
	}
	
	public static boolean applyBonemeal(ItemStack stack, World worldIn, BlockPos target, EntityPlayer player, @javax.annotation.Nullable EnumHand hand)
    {
        IBlockState iblockstate = worldIn.getBlockState(target);
        int hook = net.minecraftforge.event.ForgeEventFactory.onApplyBonemeal(player, worldIn, target, iblockstate, stack, hand);
        if (hook != 0) return hook > 0;

        if (iblockstate.getBlock() instanceof IGrowable)
        {
            IGrowable igrowable = (IGrowable)iblockstate.getBlock();

            if (igrowable.canGrow(worldIn, target, iblockstate, worldIn.isRemote))
            {

                if (!worldIn.isRemote)
                {

                    if (igrowable.canUseBonemeal(worldIn, worldIn.rand, target, iblockstate))
                    {

                        igrowable.grow(worldIn, worldIn.rand, target, iblockstate);
                    }
                }

                return true;
            }  
        }

        return false;
    }
}
