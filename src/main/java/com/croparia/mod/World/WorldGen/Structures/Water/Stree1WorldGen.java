package com.croparia.mod.World.WorldGen.Structures.Water;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import com.croparia.mod.Reference;
import com.croparia.mod.Util.LootTableHandler;
import com.croparia.mod.World.WorldGen.StructureWorldGen;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class Stree1WorldGen extends WorldGenerator {
	 Random r2 =new Random();
	
  
    int r;
	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		WorldServer worldserver = (WorldServer) world;
		MinecraftServer minecraftserver = world.getMinecraftServer();
		TemplateManager templatemanager = worldserver.getStructureTemplateManager();
		Template template = templatemanager.getTemplate(minecraftserver, new ResourceLocation(Reference.MOD_ID+":seafarer_tree1"));
		
		if(template == null)
		{
			System.out.println("NO STRUCTURE");
			return false;
		}
		
		if(StructureWorldGen.canSpawnHere(template, worldserver, position)) {
			IBlockState iblockstate = world.getBlockState(position);
			world.notifyBlockUpdate(position, iblockstate, iblockstate, 3);
			
			PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
					.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
					.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
			
			template.getDataBlocks(position, placementsettings);
			template.addBlocksToWorld(world, position.add(0, 1, 0), placementsettings);
			
			
			 Map<BlockPos, String> map = template.getDataBlocks(position, placementsettings);
	     
			return true;
		}
		
		return false;
	}
	
	
	public void addLoot(World world) {
		
		
		
		
		
	}

}