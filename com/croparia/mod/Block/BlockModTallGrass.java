package com.croparia.mod.Block;

import java.util.List;

import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockModTallGrass extends BlockBush
{
    public BlockModTallGrass()
    {
        super(Material.GRASS, MapColor.GRASS);
        this.setSoundType(SoundType.PLANT);
        this.setCreativeTab(CreativeTabsRegistry.MOD_BLOCK);
    }



    public boolean func_176200_f(IBlockAccess worldIn, BlockPos pos)
    {
        return true;
    }
}
