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
        this.func_77655_b("banana_getter");
        this.setRegistryName("banana_getter");
        this.func_77637_a(CreativeTabsRegistry.MOD_BLOCK);
    }

    public BananaGetter(float damage, float speed, Item.ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        damage = 0;
        speed = 0;
        this.func_77655_b("banana_getter");
        this.setRegistryName("banana_getter");
        this.func_77637_a(CreativeTabsRegistry.MOD_BLOCK);
    }
    
    @Override
    public EnumActionResult func_180614_a(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
    {
    	ItemStack stack = player.func_184586_b(hand);
    			
    	if(worldIn.func_180495_p(pos).func_177230_c() == Blocks.field_150362_t)
    	{
    		
    	}
    	return EnumActionResult.SUCCESS;
    }
    
    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state) {
		worldIn.func_184133_a(player, pos, SoundEvents.field_187693_cj, SoundCategory.BLOCKS, 1.0F, 1.0F);

		if (!worldIn.field_72995_K) {
			worldIn.func_180501_a(pos, state, 11);
			stack.func_77972_a(1, player);
		}
	}
}
