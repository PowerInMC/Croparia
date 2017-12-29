package com.croparia.mod.Item.Tool.Getter;

import java.util.Collection;
import java.util.Set;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BananaGetter extends ItemTool {

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {BlockMod.fruit_grass});
	
    public BananaGetter(Item.ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        this.setUnlocalizedName("banana_getter");
        this.setRegistryName("banana_getter");
        this.setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
    }

    public BananaGetter(float damage, float speed, Item.ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        damage = 0;
        speed = 0;
        this.setUnlocalizedName("banana_getter");
        this.setRegistryName("banana_getter");
        this.setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
    }
    
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
    {
    	ItemStack stack = player.getHeldItem(hand);
    			
    	if(worldIn.getBlockState(pos).getBlock() == Blocks.LEAVES)
    	{
    		
    	}
    	return EnumActionResult.SUCCESS;
    }
    
    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state) {
		worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

		if (!worldIn.isRemote) {
			worldIn.setBlockState(pos, state, 11);
			stack.damageItem(1, player);
		}
	}
}
