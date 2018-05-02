package com.croparia.mod.Util;

import com.croparia.mod.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler
{
	public static final ResourceLocation SEAFARER_HOUSE = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "seafarer_house"));
	public static final ResourceLocation MINOTAUR_THING = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "minotaur_thing"));
}