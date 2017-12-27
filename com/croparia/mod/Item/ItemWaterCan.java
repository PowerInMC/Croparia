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

import net.minecraft.item.Item.ToolMaterial;

public class ItemWaterCan extends ItemTool
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.field_150350_a});

	public ItemWaterCan() {
		super(ToolMaterial.IRON, EFFECTIVE_ON);
		func_77637_a(CreativeTabsRegistry.MOD_BLOCK);
		func_77656_e(500);
	}

	@Override
	public EnumActionResult func_180614_a(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		ItemStack stack = player.func_184614_ca();
		if(!worldIn.field_72995_K && worldIn.func_180495_p(pos).func_177230_c() == Blocks.field_189880_di && stack.func_77952_i() >= 18)
		{
			worldIn.func_175656_a(pos, Blocks.field_150350_a.func_176223_P());
			stack.func_77972_a(-18, player);
			return EnumActionResult.SUCCESS;	
		}
		if(applyBonemeal(stack, worldIn, pos, player, hand))
            {
                if (!worldIn.field_72995_K)
                {
                    worldIn.func_175718_b(2005, pos, 0);
            		stack.func_77972_a(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.func_177978_c(), player, hand))
            {
                if (!worldIn.field_72995_K)
                {
                    worldIn.func_175718_b(2005, pos, 0);
            		stack.func_77972_a(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.func_177968_d(), player, hand))
            {
                if (!worldIn.field_72995_K)
                {
                    worldIn.func_175718_b(2005, pos, 0);
            		stack.func_77972_a(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.func_177974_f(), player, hand))
            {
                if (!worldIn.field_72995_K)
                {
                    worldIn.func_175718_b(2005, pos, 0);
            		stack.func_77972_a(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.func_177976_e(), player, hand))
            {
                if (!worldIn.field_72995_K)
                {
                    worldIn.func_175718_b(2005, pos, 0);
            		stack.func_77972_a(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.func_177978_c().func_177976_e(), player, hand))
		{
			if (!worldIn.field_72995_K)
			{
				worldIn.func_175718_b(2005, pos, 0);
				stack.func_77972_a(1, player);
			}
		}
		if(applyBonemeal(stack, worldIn, pos.func_177968_d().func_177974_f(), player, hand))
            {
                if (!worldIn.field_72995_K)
                {
                    worldIn.func_175718_b(2005, pos, 0);
            		stack.func_77972_a(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.func_177978_c().func_177974_f(), player, hand))
            {
                if (!worldIn.field_72995_K)
                {
                    worldIn.func_175718_b(2005, pos, 0);
            		stack.func_77972_a(1, player);
                }
            }
		if(applyBonemeal(stack, worldIn, pos.func_177968_d().func_177976_e(), player, hand))
            {
                if (!worldIn.field_72995_K)
                {
                    worldIn.func_175718_b(2005, pos, 0);
            		stack.func_77972_a(1, player);
                }
            }

		return EnumActionResult.SUCCESS;	
	}
	
	public static boolean applyBonemeal(ItemStack stack, World worldIn, BlockPos target, EntityPlayer player, @javax.annotation.Nullable EnumHand hand)
    {
        IBlockState iblockstate = worldIn.func_180495_p(target);
        int hook = net.minecraftforge.event.ForgeEventFactory.onApplyBonemeal(player, worldIn, target, iblockstate, stack, hand);
        if (hook != 0) return hook > 0;

        if (iblockstate.func_177230_c() instanceof IGrowable)
        {
            IGrowable igrowable = (IGrowable)iblockstate.func_177230_c();

            if (igrowable.func_176473_a(worldIn, target, iblockstate, worldIn.field_72995_K))
            {

                if (!worldIn.field_72995_K)
                {

                    if (igrowable.func_180670_a(worldIn, worldIn.field_73012_v, target, iblockstate))
                    {

                        igrowable.func_176474_b(worldIn, worldIn.field_73012_v, target, iblockstate);
                    }
                }

                return true;
            }  
        }

        return false;
    }
}
