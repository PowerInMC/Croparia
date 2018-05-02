package com.croparia.mod.EventHandler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.croparia.mod.Block.DayGiver.TileEntityDayGiver;
import com.croparia.mod.Entity.EntityReaper;
import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent.ServerConnectionFromClientEvent;

public class CropariaEvent {
	public static Random random;
	public static int fort;
	public static int normal;
	public static int faible;
	public boolean getIt = false;
	List<Integer> intList = new ArrayList<Integer>();

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		random = new Random();
		fort = random.nextInt(6) + 3;
		normal = random.nextInt(3) + 2;
		faible = random.nextInt(2);

		if (event.getEntityLiving() instanceof EntityCow) {
			event.getEntityLiving().dropItem(ItemMod.roast_beef, faible);
		} 
		else if (event.getEntityLiving() instanceof EntityPig) {
			event.getEntityLiving().dropItem(ItemMod.roast_porc, faible);
		} 
		else if (event.getEntityLiving() instanceof EntityChicken) {
			event.getEntityLiving().dropItem(ItemMod.chicken_leg, 2);
		} 
		else if (event.getEntityLiving() instanceof EntityHorse) {
			event.getEntityLiving().dropItem(ItemMod.horse_meat, normal);
		} 
		else if (event.getEntityLiving() instanceof EntitySquid) {
			event.getEntityLiving().dropItem(ItemMod.squid_meat, fort);
		} 
		else if(event.getEntityLiving() instanceof EntityVillager) {
			event.getEntityLiving().dropItem(Items.EMERALD, 1);
		}
	}

	
	
	@SubscribeEvent
	public void onBlockDrop(BlockEvent.HarvestDropsEvent event) {
		if (event.getState().getBlock() != BlockMod.fruit_grass)
			return;
		event.setDropChance(0.2F);
		event.getDrops().add(new ItemStack(ItemMod.cherry));
		event.getDrops().add(new ItemStack(ItemMod.apricot));
		event.getDrops().add(new ItemStack(ItemMod.banana));
		event.getDrops().add(new ItemStack(ItemMod.kiwi));
		event.getDrops().add(new ItemStack(ItemMod.lemon));
		event.getDrops().add(new ItemStack(ItemMod.pear));
		event.getDrops().add(new ItemStack(ItemMod.orange));
	}

	@SubscribeEvent
	public void onDeathEvent(LivingDeathEvent event)
	{
		Random rand = new Random(); 
		World world = Minecraft.getMinecraft().world;
		EntityReaper e = new EntityReaper(Minecraft.getMinecraft().world);
		if(event.getEntity() instanceof EntityPlayer && event.getSource().getTrueSource() instanceof EntityReaper && !world.isRemote)
		{
			event.getSource().getTrueSource().setDead();
			Minecraft.getMinecraft().player.sendChatMessage("The Reaper disappears...");
		}

	}
	

}