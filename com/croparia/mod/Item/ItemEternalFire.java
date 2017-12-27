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

public class ItemEternalFire extends Item 
{
	public ItemEternalFire(String name)
	{
		super();
		func_77655_b(name);
		func_77637_a(CreativeTabsRegistry.MOD_BLOCK);
		setRegistryName(name);
        func_77625_d(1);
        func_77642_a(this);
	}
	
	@Override
	public void func_77663_a(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) 
	{
		entityIn.func_70015_d(10);
		entityIn.func_70031_b(true);
	}	
	
	public EnumActionResult func_180614_a(EntityPlayer stack, World playerIn, BlockPos worldIn, EnumHand pos, EnumFacing hand, float facing, float hitX, float hitY) 
	{
		ItemStack itemstack = stack.func_184586_b(pos);
		
		if(stack.func_70093_af() == true)
		{
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

	            if (hand != EnumFacing.DOWN)
	            {
	            	if(playerIn.func_180495_p(worldIn).func_177230_c() != Blocks.field_150357_h || playerIn.func_180495_p(worldIn).func_177230_c() != Blocks.field_150343_Z ||playerIn.func_180495_p(worldIn).func_177230_c() != Blocks.field_150424_aL)
	            	{

	            			this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.field_150353_l.func_176223_P());
	            			return EnumActionResult.SUCCESS;          
	            		
	                }
	            	if(playerIn.func_180495_p(worldIn).func_177230_c() == Blocks.field_150343_Z ||playerIn.func_180495_p(worldIn).func_177230_c() == Blocks.field_150424_aL)
	            	{
	            		{
	            			this.setBlock(itemstack, stack, playerIn, worldIn.func_177984_a(), Blocks.field_150480_ab.func_176223_P());
	            			return EnumActionResult.SUCCESS;
	            		}
	            	}
	            }            
	        }
		}
		
		
		return EnumActionResult.PASS;	
	}
	
    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
    {
        worldIn.func_184133_a(player, pos, SoundEvents.field_187662_cZ, SoundCategory.BLOCKS, 2.0F, 2.0F);

        if (!worldIn.field_72995_K)
        {
            worldIn.func_180501_a(pos, state, 11);
            stack.func_77972_a(1, player);
        }
    }

	
}
