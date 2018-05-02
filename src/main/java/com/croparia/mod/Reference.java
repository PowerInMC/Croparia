package com.croparia.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Reference
{
    public static final String MOD_ID = "croparia";
    public static final String MOD_NAME = "Croparia";
    public static final String VERSION = "1.16.3";
    public static final String CLIENT_PROXY_CLASS = "com.croparia.mod.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.croparia.mod.proxy.CommonProxy";
    public static final String DEPENDENCIES = "before:guideapi;"
    		+ "before:appliedenergistics2;"
    		+ "before:bigreactors;"
    		+ "before:botania;"
    		+ "before:buildcraftcore;"
    		+ "before:techreborn;"
    		+ "before:thermalfoundation;"
    		+ "before:immersiveengineering;"
    		+ "before:forestry;"
    		+ "before:refinedstorage;"
    		+ "before:draconicevolution;"
    		+ "before:ic2;"
    		+ "before:embers;"
    		+ "before:mekanism";
    
	public static int infini = 40000;
	public static int longtemps = 4000;
	public static int longtempsmoins = 1000;
	public static int normalplus = 600;
	public static int normal = 400;
	public static int trespeu = 100;
    
}
