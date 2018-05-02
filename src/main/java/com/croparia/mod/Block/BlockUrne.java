package com.croparia.mod.Block;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockUrne extends Block{

	public boolean empty;
	public boolean seafarer;
	public boolean minotaur;
	public boolean centaur;
	public boolean flying_beast;
	public boolean raw;
	
	public BlockUrne(String name, boolean empty, boolean seafarer, boolean minotaur, boolean centaur, boolean flying_beast, boolean raw) {
		super(Material.CLAY);
		this.setUnlocalizedName(name);
		setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
		this.empty = empty;
		this.seafarer = seafarer;
		this.minotaur = minotaur;
		this.centaur = centaur;
		this.flying_beast = flying_beast;
		this.raw = raw;
		setResistance(5);
		setHardness(5);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		// TODO Auto-generated method stub
		return new AxisAlignedBB(0.05, 0, 0.05, 0.95, 0.8, 0.95);
	}
	
	@Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
    {
    	if(!worldIn.isRemote)
    	{
    		ItemStack stack = playerIn.getHeldItemMainhand();
    		if(stack.getItem() == ItemMod.seafarer_gem && empty == true)
    		{
    			stack.shrink(1);
    			worldIn.setBlockState(pos, BlockMod.filled_urne_s.getDefaultState());
    		}	
    		else if(stack.getItem() == ItemMod.minotaur_gem && empty == true)
    		{
    			stack.shrink(1);
    			worldIn.setBlockState(pos, BlockMod.filled_urne_m.getDefaultState());
    		}
    		else if(stack.getItem() == ItemMod.centaur_gem && empty == true)
    		{
    			stack.shrink(1);
    			worldIn.setBlockState(pos, BlockMod.filled_urne_c.getDefaultState());
    		}
    		else if(stack.getItem() == ItemMod.flyingbeast_gem && empty == true)
    		{
    			stack.shrink(1);
    			worldIn.setBlockState(pos, BlockMod.filled_urne_f.getDefaultState());
    		}
    		else if(seafarer == true)
    		{
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ItemMod.seafarer_gem))); 
    			worldIn.setBlockState(pos, BlockMod.empty_urne.getDefaultState());
    		}
    		else if(minotaur == true)
    		{
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ItemMod.minotaur_gem))); 
    			worldIn.setBlockState(pos, BlockMod.empty_urne.getDefaultState());
    		}
    		else if(centaur == true)
    		{
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ItemMod.centaur_gem))); 
    			worldIn.setBlockState(pos, BlockMod.empty_urne.getDefaultState());
    		}
    		else if(flying_beast == true)
    		{
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ItemMod.flyingbeast_gem))); 
    			worldIn.setBlockState(pos, BlockMod.empty_urne.getDefaultState());
    		}
    			
    	}
    	return true;
    }

    @Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) 
    {
    	if(!worldIn.isRemote)
    	{
    		if(empty == true)
    		{
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(BlockMod.empty_urne)));  
    		}
    		else if(seafarer == true)
    		{
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ItemMod.seafarer_gem))); 
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(BlockMod.empty_urne)));
    		}
    		else if(minotaur == true)
    		{
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ItemMod.minotaur_gem))); 
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(BlockMod.empty_urne))); 
    		}
    		else if(centaur == true)
    		{
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ItemMod.centaur_gem))); 
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(BlockMod.empty_urne))); 
    		}
    		else if(flying_beast == true)
    		{
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ItemMod.flyingbeast_gem))); 
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(BlockMod.empty_urne))); 
    		}
    		else if(raw == true)
    		{
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(BlockMod.empty_urne_raw)));  
    		}
    		
    	}
    }
	
}
