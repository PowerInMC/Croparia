package com.croparia.mod.Init;

import com.croparia.mod.Reference;
import com.croparia.mod.Block.BlockModCloud;
import com.croparia.mod.Block.BlockModTallGrass;
import com.croparia.mod.Block.BlockStemMod;
import com.croparia.mod.Block.Cane.CaneAcacia;
import com.croparia.mod.Block.Cane.CaneBirch;
import com.croparia.mod.Block.Cane.CaneBlack;
import com.croparia.mod.Block.Cane.CaneBlue;
import com.croparia.mod.Block.Cane.CaneBrown;
import com.croparia.mod.Block.Cane.CaneCobble;
import com.croparia.mod.Block.Cane.CaneCyan;
import com.croparia.mod.Block.Cane.CaneDarkOak;
import com.croparia.mod.Block.Cane.CaneGrass;
import com.croparia.mod.Block.Cane.CaneGray;
import com.croparia.mod.Block.Cane.CaneGreen;
import com.croparia.mod.Block.Cane.CaneJungle;
import com.croparia.mod.Block.Cane.CaneLightblue;
import com.croparia.mod.Block.Cane.CaneLime;
import com.croparia.mod.Block.Cane.CaneMagenta;
import com.croparia.mod.Block.Cane.CaneOak;
import com.croparia.mod.Block.Cane.CaneOrange;
import com.croparia.mod.Block.Cane.CanePink;
import com.croparia.mod.Block.Cane.CanePurple;
import com.croparia.mod.Block.Cane.CaneRed;
import com.croparia.mod.Block.Cane.CaneSand;
import com.croparia.mod.Block.Cane.CaneSilver;
import com.croparia.mod.Block.Cane.CaneSpruce;
import com.croparia.mod.Block.Cane.CaneWhite;
import com.croparia.mod.Block.Cane.CaneYellow;
import com.croparia.mod.Block.Crop.BlockCropMod;
import com.croparia.mod.Block.DayGiver.BlockDayGiver;
import com.croparia.mod.Block.Elemental.BlockElemental;
import com.croparia.mod.Block.Elemental.BlockElementalOre;
import com.croparia.mod.Block.Elemental.BlockElementalStone;
import com.croparia.mod.Block.Furnaces.BlockCoalFurnace;
import com.croparia.mod.Block.Furnaces.BlockDiamondFurnace;
import com.croparia.mod.Block.Furnaces.BlockFireFurnace;
import com.croparia.mod.Block.Furnaces.BlockGoldFurnace;
import com.croparia.mod.Block.Furnaces.BlockIronFurnace;
import com.croparia.mod.Block.Furnaces.BlockLapisFurnace;
import com.croparia.mod.Block.Furnaces.BlockObsidianFurnace;
import com.croparia.mod.Block.Furnaces.BlockRedstoneFurnace;
import com.croparia.mod.Block.Furnaces.BlockRenforcedFurnace;
import com.croparia.mod.Block.Ghost.BlockGhost;
import com.croparia.mod.Block.Ghost.BlockRitualGhost;
import com.croparia.mod.Block.Plant.BlockPlantBone;
import com.croparia.mod.Block.Plant.BlockPlantClay;
import com.croparia.mod.Block.Plant.BlockPlantCoal;
import com.croparia.mod.Block.Plant.BlockPlantCristal;
import com.croparia.mod.Block.Plant.BlockPlantDiamond;
import com.croparia.mod.Block.Plant.BlockPlantElemental;
import com.croparia.mod.Block.Plant.BlockPlantEmerald;
import com.croparia.mod.Block.Plant.BlockPlantGlass;
import com.croparia.mod.Block.Plant.BlockPlantGlowstone;
import com.croparia.mod.Block.Plant.BlockPlantGold;
import com.croparia.mod.Block.Plant.BlockPlantIron;
import com.croparia.mod.Block.Plant.BlockPlantLapis;
import com.croparia.mod.Block.Plant.BlockPlantMagma;
import com.croparia.mod.Block.Plant.BlockPlantNether;
import com.croparia.mod.Block.Plant.BlockPlantObsidian;
import com.croparia.mod.Block.Plant.BlockPlantQuartz;
import com.croparia.mod.Block.Plant.BlockPlantRedstone;
import com.croparia.mod.Block.Plant.BlockPlantShard;
import com.croparia.mod.Block.Plant.BlockPlantShell;
import com.croparia.mod.Block.Plant.BlockPlantSnow;
import com.croparia.mod.Block.Spawn.BlockCentaurSpawn;
import com.croparia.mod.Block.Spawn.BlockFlyingbeastSpawn;
import com.croparia.mod.Block.Spawn.BlockMinotaurSpawn;
import com.croparia.mod.Block.Spawn.BlockReaperSpawn;
import com.croparia.mod.Block.Spawn.BlockSeafarerSpawn;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;
import com.cropariaCompat.mod.Block.Crop.CompatBlockCrop;
import com.cropariaCompat.mod.OreDic.ModLoader;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;

public class BlockMod {


	private static CreativeTabs tab = CreativeTabsRegistry.MOD_BLOCK;
	private static CreativeTabs wip = CreativeTabsRegistry.WIP;

	
		public static Block block_crop_coal;
		public static Block block_crop_iron;
		public static Block block_crop_gold;
		public static Block block_crop_redstone;
		public static Block block_crop_lapis;
		public static Block block_crop_diamond;
		public static Block block_crop_emerald;
		public static Block block_crop_clay;
		public static Block block_crop_glowstone;
		public static Block block_crop_quartz;
		public static Block block_crop_shard;
		public static Block block_crop_cristal;
		public static Block block_crop_paper;
		public static Block block_crop_sugar;
		public static Block block_crop_charcoal;
		public static Block block_crop_flint;
		public static Block block_crop_snowball;
		public static Block block_crop_firework;
		public static Block block_crop_nether;
		public static Block block_crop_bottle;
		public static Block block_crop_foot;
		public static Block block_crop_hide;
		public static Block block_crop_leather;
		public static Block block_crop_feather;
		public static Block block_crop_ender;
		public static Block block_crop_bone;
		public static Block block_crop_eye;
		public static Block block_crop_powder;
		public static Block block_crop_blaze;
		public static Block block_crop_ghast;
		public static Block block_crop_magma;
		public static Block block_crop_shell;
		public static Block block_crop_slime;
		public static Block block_crop_star;
		public static Block block_crop_string;
		public static Block block_crop_zombie;
		public static Block block_crop_orange;
		public static Block block_crop_magenta;
		public static Block block_crop_lightblue;
		public static Block block_crop_yellow;
		public static Block block_crop_lime;
		public static Block block_crop_pink;
		public static Block block_crop_gray;
		public static Block block_crop_silver;
		public static Block block_crop_cyan;
		public static Block block_crop_purple;
		public static Block block_crop_brown;
		public static Block block_crop_green;
		public static Block block_crop_red;
		public static Block block_crop_black;	
		public static Block block_crop_vine;
		public static Block block_crop_lilypad;
		public static Block block_crop_tallgrass;
		public static Block block_crop_largefern;
		public static Block block_crop_bush;
		public static Block block_crop_grass1;
		public static Block block_crop_fern;
		public static Block block_crop_oak;
		public static Block block_crop_birch;
		public static Block block_crop_spruce;
		public static Block block_crop_jungle;
		public static Block block_crop_darkoak;
		public static Block block_crop_acacia;	
		public static Block block_crop_apple;
		public static Block block_crop_goldenapple;
		public static Block block_crop_bread;
		public static Block block_crop_egg;
		public static Block block_crop_clownfish;
		public static Block block_crop_pufferfish;
		public static Block block_crop_cookie;
		public static Block block_crop_chorus;
		public static Block block_crop_rawporc;
		public static Block block_crop_rawbeef;
		public static Block block_crop_fish;
		public static Block block_crop_salmon;
		public static Block block_crop_rawchicken;
		public static Block block_crop_rawrabbit;
		public static Block block_crop_rawmutton;
		public static Block block_crop_death;
		public static Block block_crop_totem;
		
		public static Block stem_iron;
		public static Block stem_coal;
		public static Block stem_gold;
		public static Block stem_redstone;
		public static Block stem_lapis;
		public static Block stem_diamond;
		public static Block stem_clay;
		public static Block stem_glowstone;
		public static Block stem_emerald;
		public static Block stem_quartz;
		public static Block stem_shard;
		public static Block stem_cristal;
        public static Block stem_obsidian;
        public static Block stem_bone;
        public static Block stem_snow;
        public static Block stem_nether;
        public static Block stem_glass;
        public static Block stem_magma;
        public static Block stem_shell;
        
		public static Block block_plant_coal;
		public static Block block_plant_iron;
		public static Block block_plant_gold;
		public static Block block_plant_redstone;
		public static Block block_plant_lapis;
		public static Block block_plant_diamond;
		public static Block block_plant_clay;
		public static Block block_plant_glowstone;
		public static Block block_plant_emerald;
		public static Block block_plant_quartz;
		public static Block block_plant_shard;
		public static Block block_plant_cristal;
		
		public static Block block_plant_obsidian;
		public static Block block_plant_bone;
		public static Block block_plant_snow;
		public static Block block_plant_nether;
		public static Block block_plant_glass;
		public static Block block_plant_magma;
		public static Block block_plant_shell;
		
		public static Block elemental_stone;
		public static Block elemental_cobblestone;
		public static Block elemental_crop;
		public static Block stem_elemental;
		public static Block block_plant_elemental;
		public static Block fruit_grass;



		public static Block coal_furnace;
		public static Block lit_coal_furnace;
		
		public static Block iron_furnace;
		public static Block lit_iron_furnace;
		
		public static Block gold_furnace;
		public static Block lit_gold_furnace;

		public static Block redstone_furnace;
		public static Block lit_redstone_furnace;

		public static Block lapis_furnace;
		public static Block lit_lapis_furnace;

		public static Block diamond_furnace;
		public static Block lit_diamond_furnace;
				
		public static Block obsidian_furnace;
		public static Block lit_obsidian_furnace;	

		public static Block renforced_furnace;
		public static Block lit_renforced_furnace;
		
		public static Block fire_furnace;
		public static Block lit_fire_furnace;
		
		public static Block seafarer_spawn;
		public static Block centaur_spawn;
		public static Block minotaur_spawn;
		public static Block flyingbeast_spawn;
		public static Block reaper_spawn;
	
		public static Block water_block;
		public static Block fire_block;
		public static Block air_block;
		public static Block earth_block;

		public static Block ice_water_ore;
		public static Block dirt_earth_ore;
		public static Block magma_fire_ore;
		public static Block cloud_air_ore;

		public static Block block_cane_cobble;
		public static Block block_cane_sand;
		public static Block block_cane_grass;
		public static Block block_cane_acacia;
		public static Block block_cane_birch;
		public static Block block_cane_darkoak;
		public static Block block_cane_jungle;
		public static Block block_cane_oak;
		public static Block block_cane_spruce;
		
		public static Block block_cane_black;
		public static Block block_cane_blue;
		public static Block block_cane_brown;
		public static Block block_cane_cyan;
		public static Block block_cane_gray;
		public static Block block_cane_green;
		public static Block block_cane_lightblue;
		public static Block block_cane_lime;
		public static Block block_cane_magenta;
		public static Block block_cane_orange;
		public static Block block_cane_pink;
		public static Block block_cane_purple;
		public static Block block_cane_red;
		public static Block block_cane_silver;
		public static Block block_cane_white;
		public static Block block_cane_yellow;	

		public static Block block_ritual_debug;

		public static Block ghost_nether;
		public static Block ghost_magma;
		public static Block ghost_lava;
		public static Block ghost_death;
		public static Block ghost_soulsand;
		public static Block ghost_elemental_cobble;
		public static Block ghost_slabstone;
		public static Block ghost_slabnether;
		public static Block ghost_slabnetherup;
		public static Block ghost_andesite;
		public static Block ghost_polished_andesite;
		public static Block ghost_waterliquid;
		public static Block ghost_redstone;
		public static Block ghost_cropelemental;
		public static Block ghost_air;
		public static Block ghost_fire;
		public static Block ghost_earth;
		public static Block ghost_water;
		public static Block ghost_elementalstone;
		public static Block ghost_cropiron;
		public static Block ghost_cropgold;
		public static Block ghost_diorite;

		public static Block cloud;

		public static Block reward;
		
		public static Block block_crop_aluminium;
		public static Block block_crop_brass;
		public static Block block_crop_bronze;
		public static Block block_crop_chrome;
		public static Block block_crop_copper;
		public static Block block_crop_electrum;
		public static Block block_crop_invar;
		public static Block block_crop_iridium;
		public static Block block_crop_lead;
		public static Block block_crop_nickel;
		public static Block block_crop_platinium;
		public static Block block_crop_silveringot;
		public static Block block_crop_steel;
		public static Block block_crop_tin;
		public static Block block_crop_titanium;
		public static Block block_crop_tungsten;
		public static Block block_crop_zinc;
		public static Block botania_crop_manasteel;
		public static Block botania_crop_terrasteel;
		public static Block botania_crop_manadiamond;
		public static Block botania_crop_dragonstone;
		public static Block botania_crop_elementium;
		public static Block botania_crop_manapearl;
		public static Block block_crop_gearwood;
		public static Block block_crop_gearstone;
		public static Block block_crop_geariron;
		public static Block block_crop_geargold;
		public static Block block_crop_geardiamond;
		public static Block block_crop_yellorium;
		public static Block block_crop_blutonium;
		public static Block block_crop_cyanite;
		public static Block block_crop_graphite;
		public static Block block_crop_ludicrite;
		public static Block block_crop_enderium;
		public static Block block_crop_lumium;
		public static Block block_crop_signalum;
		public static Block block_crop_constantan;
		public static Block block_crop_mithril;
		public static Block block_crop_uranium;
		public static Block block_crop_apatite;
		public static Block block_crop_silicon;
		public static Block block_crop_draconium;
		public static Block block_crop_draconium_awakened;
		public static Block block_crop_certus_quartz;
		public static Block block_crop_crystal_flux;
		public static Block block_crop_pure_fluix;

		public static void init() {
			

			ghost_nether = new BlockGhost("ghost_nether");
			ghost_magma = new BlockGhost("ghost_magma");
			ghost_lava = new BlockGhost("ghost_lava");
			ghost_death = new BlockGhost("ghost_death");
			ghost_soulsand = new BlockGhost("ghost_soulsand");
			ghost_elemental_cobble = new BlockGhost("ghost_elemental_cobble");
			ghost_slabstone = new BlockGhost("ghost_slabstone");
			ghost_slabnether = new BlockGhost("ghost_slabnether");
			ghost_slabnetherup = new BlockGhost("ghost_slabnetherup");
			ghost_andesite = new BlockGhost("ghost_andesite");
			ghost_polished_andesite = new BlockGhost("ghost_polished_andesite");
			ghost_waterliquid = new BlockGhost("ghost_waterliquid");
			ghost_redstone = new BlockGhost("ghost_redstone");
			ghost_cropelemental = new BlockGhost("ghost_cropelemental");
			ghost_air = new BlockGhost("ghost_air");
			ghost_fire = new BlockGhost("ghost_fire");
			ghost_earth = new BlockGhost("ghost_earth");
			ghost_water = new BlockGhost("ghost_water");
			ghost_elementalstone = new BlockGhost("ghost_elementalstone");
			ghost_cropiron = new BlockGhost("ghost_cropiron");
			ghost_cropgold = new BlockGhost("ghost_cropgold");
			ghost_diorite = new BlockGhost("ghost_diorite");
			
			
			reward = new BlockDayGiver("reward");

			cloud = new BlockModCloud("cloud");
			
			
			fruit_grass = new BlockModTallGrass().func_149663_c("fruit_grass");
			
			coal_furnace = new BlockCoalFurnace(false, "coal_furnace").func_149647_a(tab);
			lit_coal_furnace = new BlockCoalFurnace(true, "lit_coal_furnace").func_149715_a(0.875F);

			iron_furnace = new BlockIronFurnace(false, "iron_furnace").func_149647_a(tab);
			lit_iron_furnace = new BlockIronFurnace(true, "lit_iron_furnace").func_149715_a(0.875F);

			gold_furnace = new BlockGoldFurnace(false, "gold_furnace").func_149647_a(tab);
			lit_gold_furnace = new BlockGoldFurnace(true, "lit_gold_furnace").func_149715_a(0.875F);

			redstone_furnace = new BlockRedstoneFurnace(false, "redstone_furnace").func_149647_a(tab);
			lit_redstone_furnace = new BlockRedstoneFurnace(true, "lit_redstone_furnace").func_149715_a(0.875F);

			lapis_furnace = new BlockLapisFurnace(false, "lapis_furnace").func_149647_a(tab);
			lit_lapis_furnace = new BlockLapisFurnace(true, "lit_lapis_furnace").func_149715_a(0.875F);

			diamond_furnace = new BlockDiamondFurnace(false, "diamond_furnace").func_149647_a(tab);
			lit_diamond_furnace = new BlockDiamondFurnace(true, "lit_diamond_furnace").func_149715_a(0.875F);

			obsidian_furnace = new BlockObsidianFurnace(false, "obsidian_furnace").func_149647_a(tab);
			lit_obsidian_furnace = new BlockObsidianFurnace(true, "lit_obsidian_furnace").func_149715_a(0.875F);
			
			renforced_furnace = new BlockRenforcedFurnace(false, "renforced_furnace").func_149647_a(tab);
			lit_renforced_furnace = new BlockRenforcedFurnace(true, "lit_renforced_furnace").func_149715_a(0.875F);
			
			fire_furnace = new BlockFireFurnace(false, "fire_furnace").func_149647_a(tab);
			lit_fire_furnace = new BlockFireFurnace(true, "lit_fire_furnace").func_149715_a(0.875F);
			
			block_crop_coal = new BlockCropMod("block_crop_coal");
			block_crop_iron = new BlockCropMod("block_crop_iron");
			block_crop_gold = new BlockCropMod("block_crop_gold");
			block_crop_redstone = new BlockCropMod("block_crop_redstone");
			block_crop_lapis = new BlockCropMod("block_crop_lapis");
			block_crop_diamond = new BlockCropMod("block_crop_diamond");
			block_crop_emerald = new BlockCropMod("block_crop_emerald");
			block_crop_clay = new BlockCropMod("block_crop_clay");
			block_crop_glowstone = new BlockCropMod("block_crop_glowstone").func_149715_a(1f);
			block_crop_quartz = new BlockCropMod("block_crop_quartz");
			block_crop_shard = new BlockCropMod("block_crop_shard");
			block_crop_cristal = new BlockCropMod("block_crop_cristal").func_149715_a(1f);
			block_crop_paper = new BlockCropMod("block_crop_paper");
			block_crop_sugar = new BlockCropMod("block_crop_sugar");
			block_crop_charcoal = new BlockCropMod("block_crop_charcoal");
			block_crop_flint = new BlockCropMod("block_crop_flint");
			block_crop_snowball = new BlockCropMod("block_crop_snowball");
			block_crop_firework = new BlockCropMod("block_crop_firework");
			block_crop_nether = new BlockCropMod("block_crop_nether");
			block_crop_bottle = new BlockCropMod("block_crop_bottle");
			block_crop_foot = new BlockCropMod("block_crop_foot");
			block_crop_hide = new BlockCropMod("block_crop_hide");
			block_crop_leather = new BlockCropMod("block_crop_leather");
			block_crop_feather = new BlockCropMod("block_crop_feather");
			block_crop_ender = new BlockCropMod("block_crop_ender");
			block_crop_bone = new BlockCropMod("block_crop_bone");
			block_crop_eye = new BlockCropMod("block_crop_eye");
			block_crop_powder = new BlockCropMod("block_crop_powder");
			block_crop_blaze = new BlockCropMod("block_crop_blaze");
			block_crop_ghast = new BlockCropMod("block_crop_ghast");
			block_crop_magma = new BlockCropMod("block_crop_magma");
			block_crop_shell = new BlockCropMod("block_crop_shell");
			block_crop_slime = new BlockCropMod("block_crop_slime");
			block_crop_star = new BlockCropMod("block_crop_star");
			block_crop_string = new BlockCropMod("block_crop_string");
			block_crop_zombie = new BlockCropMod("block_crop_zombie");			
			block_crop_orange = new BlockCropMod("block_crop_orange"); 
			block_crop_magenta = new BlockCropMod("block_crop_magenta"); 
			block_crop_lightblue = new BlockCropMod("block_crop_lightblue"); 
			block_crop_yellow = new BlockCropMod("block_crop_yellow"); 
			block_crop_lime = new BlockCropMod("block_crop_lime"); 
			block_crop_pink = new BlockCropMod("block_crop_pink");
			block_crop_gray = new BlockCropMod("block_crop_gray");
			block_crop_silver = new BlockCropMod("block_crop_silver");
			block_crop_cyan = new BlockCropMod("block_crop_cyan");
			block_crop_purple = new BlockCropMod("block_crop_purple");
			block_crop_brown = new BlockCropMod("block_crop_brown");
			block_crop_green = new BlockCropMod("block_crop_green");
			block_crop_red = new BlockCropMod("block_crop_red");
			block_crop_black = new BlockCropMod("block_crop_black");			
			block_crop_vine = new BlockCropMod("block_crop_vine");
			block_crop_lilypad = new BlockCropMod("block_crop_lilypad");
			block_crop_tallgrass = new BlockCropMod("block_crop_tallgrass");
			block_crop_largefern = new BlockCropMod("block_crop_largefern");
			block_crop_bush = new BlockCropMod("block_crop_bush");
			block_crop_grass1 = new BlockCropMod("block_crop_grass1");
			block_crop_fern = new BlockCropMod("block_crop_fern");
			block_crop_oak = new BlockCropMod("block_crop_oak");
			block_crop_birch = new BlockCropMod("block_crop_birch");
			block_crop_spruce = new BlockCropMod("block_crop_spruce");
			block_crop_jungle = new BlockCropMod("block_crop_jungle");
			block_crop_darkoak = new BlockCropMod("block_crop_darkoak");
			block_crop_acacia = new BlockCropMod("block_crop_acacia");
			block_crop_apple = new BlockCropMod("block_crop_apple");
			block_crop_goldenapple = new BlockCropMod("block_crop_goldenapple");
			block_crop_bread = new BlockCropMod("block_crop_bread");
			block_crop_egg = new BlockCropMod("block_crop_egg");
			block_crop_clownfish = new BlockCropMod("block_crop_clownfish");
			block_crop_pufferfish = new BlockCropMod("block_crop_pufferfish");
			block_crop_cookie = new BlockCropMod("block_crop_cookie");
			block_crop_chorus = new BlockCropMod("block_crop_chorus");
			block_crop_rawporc = new BlockCropMod("block_crop_rawporc");
			block_crop_rawbeef = new BlockCropMod("block_crop_rawbeef");
			block_crop_fish = new BlockCropMod("block_crop_fish");
			block_crop_salmon = new BlockCropMod("block_crop_salmon");
			block_crop_rawchicken = new BlockCropMod("block_crop_rawchicken");
			block_crop_rawrabbit = new BlockCropMod("block_crop_rawrabbit");
			block_crop_rawmutton = new BlockCropMod("block_crop_rawmutton");
			block_crop_death = new BlockCropMod("block_crop_death");
			block_crop_totem = new BlockCropMod("block_crop_totem");
			


			block_plant_iron = new BlockPlantIron(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_iron");
			block_plant_coal = new BlockPlantCoal(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_coal");
			block_plant_gold = new BlockPlantGold(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_gold");
			block_plant_redstone = new BlockPlantRedstone(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_redstone");
			block_plant_lapis = new BlockPlantLapis(Material.field_151585_k, MapColor.field_151672_u)	.func_149663_c("block_plant_lapis");
			block_plant_diamond = new BlockPlantDiamond(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_diamond");
			block_plant_clay = new BlockPlantClay(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_clay");
			block_plant_glowstone = new BlockPlantGlowstone(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_glowstone").func_149715_a(1.0F);
			block_plant_emerald = new BlockPlantEmerald(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_emerald");
			block_plant_quartz = new BlockPlantQuartz(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_quartz");
			block_plant_shard = new BlockPlantShard(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_shard");
			block_plant_cristal = new BlockPlantCristal(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_cristal").func_149715_a(1.0F);

			block_plant_obsidian = new BlockPlantObsidian(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_obsidian");
			block_plant_bone = new BlockPlantBone(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_bone");
			block_plant_snow = new BlockPlantSnow(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_snow");
			block_plant_nether = new BlockPlantNether(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_nether");
			block_plant_glass = new BlockPlantGlass(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_glass");
			block_plant_magma = new BlockPlantMagma(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_magma");
			block_plant_shell = new BlockPlantShell(Material.field_151585_k, MapColor.field_151672_u).func_149663_c("block_plant_shell");
			

			stem_iron = new BlockStemMod(block_plant_iron, "stem_iron");
			stem_coal = new BlockStemMod(block_plant_coal, "stem_coal");
			stem_gold = new BlockStemMod(block_plant_gold, "stem_gold");
			stem_redstone = new BlockStemMod(block_plant_redstone, "stem_redstone");
			stem_lapis = new BlockStemMod(block_plant_lapis, "stem_lapis");
			stem_diamond = new BlockStemMod(block_plant_diamond, "stem_diamond");
			stem_clay = new BlockStemMod(block_plant_clay, "stem_clay");
			stem_glowstone = new BlockStemMod(block_plant_glowstone, "stem_glowstone").func_149715_a(1.0F);
			stem_emerald = new BlockStemMod(block_plant_emerald, "stem_emerald");
			stem_quartz = new BlockStemMod(block_plant_quartz, "stem_quartz");
			stem_shard = new BlockStemMod(block_plant_shard, "stem_shard");
			stem_cristal = new BlockStemMod(block_plant_cristal, "stem_cristal").func_149715_a(1.0F);
	        stem_obsidian = new BlockStemMod(block_plant_obsidian, "stem_obsidian");
	        stem_bone = new BlockStemMod(block_plant_bone, "stem_bone");
	        stem_snow = new BlockStemMod(block_plant_snow, "stem_snow");
	        stem_nether = new BlockStemMod(block_plant_nether, "stem_nether");
	        stem_glass = new BlockStemMod(block_plant_glass, "stem_glass");
	        stem_magma = new BlockStemMod(block_plant_magma, "stem_magma").func_149715_a(1.0F);;
	        stem_shell = new BlockStemMod(block_plant_shell, "stem_shell");

			elemental_stone = new BlockElementalStone(Material.field_151578_c, MapColor.field_151678_z).func_149663_c("elemental_stone");
			elemental_cobblestone = new BlockElementalStone(Material.field_151578_c, MapColor.field_151678_z).func_149663_c("elemental_cobblestone");
			elemental_crop = new BlockCropMod("elemental_crop");
			block_plant_elemental = new BlockPlantElemental(Material.field_151585_k, MapColor.field_151678_z).func_149663_c("block_plant_elemental");
			stem_elemental = new BlockStemMod(block_plant_elemental, "stem_elemental");

			seafarer_spawn = new BlockSeafarerSpawn("seafarer_spawn");
			centaur_spawn = new BlockCentaurSpawn("centaur_spawn");
			minotaur_spawn = new BlockMinotaurSpawn("minotaur_spawn");
			flyingbeast_spawn = new BlockFlyingbeastSpawn("flyingbeast_spawn");
			reaper_spawn = new BlockReaperSpawn("Reaper_spawn");
			
			water_block = new BlockElemental("water_block").func_149647_a(tab);
			fire_block = new BlockElemental("fire_block").func_149647_a(tab);
			earth_block = new BlockElemental("earth_block").func_149647_a(tab);
			air_block = new BlockElemental("air_block").func_149647_a(tab);

			ice_water_ore = new BlockElementalOre("ice_water_ore").func_149647_a(tab);
			dirt_earth_ore = new BlockElementalOre("dirt_earth_ore").func_149647_a(tab);
			magma_fire_ore = new BlockElementalOre("magma_fire_ore").func_149647_a(tab);
			cloud_air_ore = new BlockElementalOre("cloud_air_ore").func_149647_a(tab);

			block_cane_cobble = new CaneCobble("block_cane_cobble").func_149647_a(tab);
			block_cane_sand = new CaneSand("block_cane_sand").func_149647_a(tab);
			block_cane_grass = new CaneGrass("block_cane_grass").func_149647_a(tab);
			block_cane_acacia = new CaneAcacia("block_cane_acacia").func_149647_a(tab);
			block_cane_birch = new CaneBirch("block_cane_birch").func_149647_a(tab);
			block_cane_darkoak = new CaneDarkOak("block_cane_darkoak").func_149647_a(tab);
			block_cane_jungle = new CaneJungle("block_cane_jungle").func_149647_a(tab);
			block_cane_oak = new CaneOak("block_cane_oak").func_149647_a(tab);
			block_cane_spruce = new CaneSpruce("block_cane_spruce").func_149647_a(tab);
			
			block_cane_black = new CaneBlack("block_cane_black").func_149647_a(tab);	
			block_cane_blue = new CaneBlue("block_cane_blue").func_149647_a(tab);	
			block_cane_brown = new CaneBrown("block_cane_brown").func_149647_a(tab);	
			block_cane_cyan = new CaneCyan("block_cane_cyan").func_149647_a(tab);	
			block_cane_gray = new CaneGray("block_cane_gray").func_149647_a(tab);	
			block_cane_green = new CaneGreen("block_cane_green").func_149647_a(tab);	
			block_cane_lightblue = new CaneLightblue("block_cane_lightblue").func_149647_a(tab);	
			block_cane_lime = new CaneLime("block_cane_lime").func_149647_a(tab);	
			block_cane_magenta = new CaneMagenta("block_cane_magenta").func_149647_a(tab);	
			block_cane_orange = new CaneOrange("block_cane_orange").func_149647_a(tab);	
			block_cane_pink = new CanePink("block_cane_pink").func_149647_a(tab);	
			block_cane_purple = new CanePurple("block_cane_purple").func_149647_a(tab);	
			block_cane_red = new CaneRed("block_cane_red").func_149647_a(tab);	
			block_cane_silver = new CaneSilver("block_cane_silver").func_149647_a(tab);	
			block_cane_white = new CaneWhite("block_cane_white").func_149647_a(tab);	
			block_cane_yellow = new CaneYellow("block_cane_yellow").func_149647_a(tab);
			
			block_ritual_debug = new BlockRitualGhost().func_149663_c("debug_ritual");
			
			block_crop_aluminium = new CompatBlockCrop("block_crop_aluminium");
			block_crop_brass = new CompatBlockCrop("block_crop_brass");
			block_crop_bronze = new CompatBlockCrop("block_crop_bronze");
			block_crop_chrome = new CompatBlockCrop("block_crop_chrome");
			block_crop_copper = new CompatBlockCrop("block_crop_copper");
			block_crop_electrum = new CompatBlockCrop("block_crop_electrum");
			block_crop_invar = new CompatBlockCrop("block_crop_invar");
			block_crop_iridium = new CompatBlockCrop("block_crop_iridium");
			block_crop_lead = new CompatBlockCrop("block_crop_lead");
			block_crop_nickel = new CompatBlockCrop("block_crop_nickel");
			block_crop_platinium = new CompatBlockCrop("block_crop_platinium");
			block_crop_silveringot = new CompatBlockCrop("block_crop_silveringot");
			block_crop_steel = new CompatBlockCrop("block_crop_steel");
			block_crop_tin = new CompatBlockCrop("block_crop_tin");
			block_crop_titanium = new CompatBlockCrop("block_crop_titanium");
			block_crop_tungsten = new CompatBlockCrop("block_crop_tungsten");
			block_crop_zinc = new CompatBlockCrop("block_crop_zinc");
		    botania_crop_manasteel = new CompatBlockCrop("botania_crop_manasteel");
		    botania_crop_terrasteel = new CompatBlockCrop("botania_crop_terrasteel");
		    botania_crop_manadiamond = new CompatBlockCrop("botania_crop_manadiamond");
		    botania_crop_dragonstone = new CompatBlockCrop("botania_crop_dragonstone");
		    botania_crop_elementium = new CompatBlockCrop("botania_crop_elementium");
		    botania_crop_manapearl = new CompatBlockCrop("botania_crop_manapearl");
			block_crop_gearwood = new CompatBlockCrop("block_crop_gearwood");
			block_crop_gearstone = new CompatBlockCrop("block_crop_gearstone");
			block_crop_geariron = new CompatBlockCrop("block_crop_geariron");
			block_crop_geargold = new CompatBlockCrop("block_crop_geargold");
			block_crop_geardiamond = new CompatBlockCrop("block_crop_geardiamond");
			block_crop_yellorium = new CompatBlockCrop("block_crop_yellorium");
			block_crop_blutonium = new CompatBlockCrop("block_crop_blutonium");
			block_crop_cyanite = new CompatBlockCrop("block_crop_cyanite");
			block_crop_graphite = new CompatBlockCrop("block_crop_graphite");
			block_crop_ludicrite = new CompatBlockCrop("block_crop_ludicrite");
			block_crop_enderium = new CompatBlockCrop("block_crop_enderium");
			block_crop_lumium = new CompatBlockCrop("block_crop_lumium");
			block_crop_signalum = new CompatBlockCrop("block_crop_signalum");
			block_crop_constantan = new CompatBlockCrop("block_crop_constantan");
			block_crop_mithril = new CompatBlockCrop("block_crop_mithril");	
			block_crop_uranium = new CompatBlockCrop("block_crop_uranium");
			block_crop_apatite = new CompatBlockCrop("block_crop_apatite");
			block_crop_silicon = new CompatBlockCrop("block_crop_silicon");
			block_crop_draconium = new CompatBlockCrop("block_crop_draconium");
			block_crop_draconium_awakened = new CompatBlockCrop("block_crop_draconium_awakened");
			block_crop_certus_quartz = new CompatBlockCrop("block_crop_certus_quartz");
			block_crop_crystal_flux = new CompatBlockCrop("block_crop_crystal_flux");
			block_crop_pure_fluix = new CompatBlockCrop("block_crop_pure_fluix");
		
		}

		public static void register() {	
			addWithItem(fruit_grass);

			addWithItem(coal_furnace);
			add(lit_coal_furnace);
			addWithItem(iron_furnace);
			add(lit_iron_furnace);
			addWithItem(gold_furnace);
			add(lit_gold_furnace);
			addWithItem(redstone_furnace);
			add(lit_redstone_furnace);
			addWithItem(lapis_furnace);
			add(lit_lapis_furnace);
			addWithItem(diamond_furnace);
			add(lit_diamond_furnace);
			addWithItem(obsidian_furnace);
			add(lit_obsidian_furnace);
			addWithItem(renforced_furnace);
			add(lit_renforced_furnace);
			addWithItem(fire_furnace);
			add(lit_fire_furnace);

			add(block_crop_coal);
			add(block_crop_iron);
			add(block_crop_gold);
			add(block_crop_redstone);
			add(block_crop_lapis);
			add(block_crop_diamond);
			add(block_crop_emerald);
			add(block_crop_clay);
			add(block_crop_glowstone);
			add(block_crop_quartz);
			add(block_crop_shard);
			add(block_crop_cristal);
			add(block_crop_paper);
			add(block_crop_sugar);
			add(block_crop_charcoal);
			add(block_crop_flint);
			add(block_crop_snowball);
			add(block_crop_firework);
			add(block_crop_nether);
			add(block_crop_bottle);
			add(block_crop_foot);
			add(block_crop_hide);
			add(block_crop_leather);
			add(block_crop_feather);
			add(block_crop_ender);
			add(block_crop_bone);
			add(block_crop_eye);
			add(block_crop_powder);
			add(block_crop_blaze);
			add(block_crop_ghast);
			add(block_crop_magma);
			add(block_crop_shell);
			add(block_crop_slime);
			add(block_crop_star);
			add(block_crop_string);
			add(block_crop_zombie);		
			add(block_crop_orange);
			add(block_crop_magenta);
			add(block_crop_lightblue);
			add(block_crop_yellow);
			add(block_crop_lime);
			add(block_crop_pink);
			add(block_crop_gray);
			add(block_crop_silver);
			add(block_crop_cyan);
			add(block_crop_purple);
			add(block_crop_brown);
			add(block_crop_green);
			add(block_crop_red);
			add(block_crop_black);	
			add(block_crop_vine);
			add(block_crop_lilypad);
			add(block_crop_tallgrass);
			add(block_crop_largefern);
			add(block_crop_bush);
			add(block_crop_grass1);
			add(block_crop_fern);
			add(block_crop_oak);
			add(block_crop_birch);
			add(block_crop_spruce);
			add(block_crop_jungle);
			add(block_crop_darkoak);
			add(block_crop_acacia);		
			add(block_crop_apple);
			add(block_crop_goldenapple);
			add(block_crop_bread);
			add(block_crop_egg);
			add(block_crop_clownfish);
			add(block_crop_pufferfish);
			add(block_crop_cookie);
			add(block_crop_chorus);
			add(block_crop_rawporc);
			add(block_crop_rawbeef);
			add(block_crop_fish);
			add(block_crop_salmon);
			add(block_crop_rawchicken);
			add(block_crop_rawrabbit);
			add(block_crop_rawmutton);
			add(block_crop_death);
			add(block_crop_totem);
			

			addWithItem(block_cane_cobble);
			addWithItem(block_cane_sand);
			addWithItem(block_cane_grass);
			addWithItem(block_cane_oak);
			addWithItem(block_cane_spruce);
			addWithItem(block_cane_birch);
			addWithItem(block_cane_jungle);
			addWithItem(block_cane_acacia);
			addWithItem(block_cane_darkoak);	
			

			addWithItem(block_cane_black);
			addWithItem(block_cane_blue);
			addWithItem(block_cane_brown);
			addWithItem(block_cane_cyan);
			addWithItem(block_cane_gray);
			addWithItem(block_cane_green);
			addWithItem(block_cane_lightblue);
			addWithItem(block_cane_lime);
			addWithItem(block_cane_magenta);
			addWithItem(block_cane_orange);
			addWithItem(block_cane_pink);
			addWithItem(block_cane_purple);
			addWithItem(block_cane_red);
			addWithItem(block_cane_silver);
			addWithItem(block_cane_white);
			addWithItem(block_cane_yellow);	
			
			addWithItem(block_plant_coal);
			addWithItem(block_plant_iron);
			addWithItem(block_plant_gold);
			addWithItem(block_plant_redstone);
			addWithItem(block_plant_lapis);
			addWithItem(block_plant_diamond);
			addWithItem(block_plant_emerald);
			addWithItem(block_plant_clay);
			addWithItem(block_plant_glowstone);
			addWithItem(block_plant_quartz);
			addWithItem(block_plant_shard);
			addWithItem(block_plant_cristal);
			
			addWithItem(block_plant_obsidian);
			addWithItem(block_plant_bone);
			addWithItem(block_plant_snow);
			addWithItem(block_plant_nether);
			addWithItem(block_plant_glass);
			addWithItem(block_plant_magma);
			addWithItem(block_plant_shell);

			add(stem_iron);
			add(stem_coal);
			add(stem_gold);
			add(stem_redstone);
			add(stem_lapis);
			add(stem_diamond);
			add(stem_emerald);
			add(stem_clay);
			add(stem_glowstone);
			add(stem_quartz);
			add(stem_shard);
			add(stem_cristal);
			add(stem_obsidian);
			add(stem_bone);
			add(stem_snow);
			add(stem_nether);
			add(stem_glass);
			add(stem_magma);
			add(stem_shell);

			addWithItem(elemental_stone);
			addWithItem(elemental_cobblestone);
			add(elemental_crop);
			addWithItem(block_plant_elemental);
			add(stem_elemental);
			

			addWithItem(seafarer_spawn);
			addWithItem(centaur_spawn);
			addWithItem(minotaur_spawn);
			addWithItem(flyingbeast_spawn);
			addWithItem(reaper_spawn);
			
			addWithItem(water_block);
			addWithItem(fire_block);
			addWithItem(earth_block);
			addWithItem(air_block);

			addWithItem(ice_water_ore);
			addWithItem(dirt_earth_ore);
			addWithItem(magma_fire_ore);
			addWithItem(cloud_air_ore);
			
			addWithItem(block_ritual_debug);

			add(ghost_nether);
			add(ghost_magma);
			add(ghost_lava);
			add(ghost_death);
			add(ghost_soulsand);
			add(ghost_elemental_cobble);
			add(ghost_slabstone);
			add(ghost_slabnether);
			add(ghost_slabnetherup);
			
			add(ghost_andesite);
			add(ghost_polished_andesite);
			add(ghost_waterliquid);
			add(ghost_redstone);
			add(ghost_cropelemental);
			add(ghost_air);
			add(ghost_fire);
			add(ghost_earth);
			add(ghost_water);
			add(ghost_elementalstone);
			add(ghost_cropiron);
			add(ghost_cropgold);
			add(ghost_diorite);

			addWithItem(cloud);

			addWithItem(reward);
			
			if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true)
	    	{
	    		add(block_crop_aluminium);
	    	}
	    	if(ModLoader.getTechReborn() == true)
	    	{
	    		add(block_crop_brass); 		
	    	}
			
			if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getForestry() == true || ModLoader.getIC2() == true)
	    	{
				add(block_crop_bronze);
	    	}
			
			if(ModLoader.getTechReborn() == true)
	    	{
				add(block_crop_chrome);
	    	}
			
			if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true || ModLoader.getForestry() == true || ModLoader.getIC2() == true)
	    	{
				add(block_crop_copper);
	    	}
			
			if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true)
	    	{
				add(block_crop_electrum);
	    	}
			
			if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true)
	    	{
				add(block_crop_invar);
	    	}
			
			if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true)
	    	{
				add(block_crop_iridium);
	    	}
			
			if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true || ModLoader.getIC2() == true)
	    	{
				add(block_crop_lead);
	    	}
			
			if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true)
	    	{
				add(block_crop_nickel);
	    	}
			
			if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true)
	    	{
				add(block_crop_platinium);
	    	}
			
			if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true || ModLoader.getIC2() == true)
	    	{
				add(block_crop_silveringot);
	    	}
			
			if(ModLoader.getTechReborn() == true || ModLoader.getBigReactor() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true || ModLoader.getIC2() == true)
	    	{
				add(block_crop_steel);
	    	}		
			
			if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getForestry() == true || ModLoader.getIC2() == true)
	    	{
				add(block_crop_tin);
	    	}
			
			if(ModLoader.getTechReborn() == true)
	    	{
				add(block_crop_titanium);
	    	}
			
			if(ModLoader.getTechReborn() == true)
	    	{
				add(block_crop_tungsten);
	    	}
			
			if(ModLoader.getTechReborn() == true)
	    	{
				add(block_crop_zinc);
	    	}
			
			if(ModLoader.getBotania() == true)
	    	{
				add(botania_crop_manasteel);
	    	}
			
			if(ModLoader.getBotania() == true)
	    	{
				add(botania_crop_terrasteel);
	    	}
			
			if(ModLoader.getBotania() == true)
	    	{
				add(botania_crop_elementium);
	    	}
		    
		    if(ModLoader.getBotania() == true)
	    	{
	    		add(botania_crop_manadiamond);
	    	}
		    
		    if(ModLoader.getBotania() == true)
	    	{
		    	add(botania_crop_manapearl);	
	    	}
		    
		    if(ModLoader.getBotania() == true)
	    	{
		    	add(botania_crop_dragonstone);
	    	}
		    
		    if(ModLoader.getBuildcraft() == true || ModLoader.getAe2() == true)
	    	{
		    	add(block_crop_gearwood);	
	    	}
			
			if(ModLoader.getBuildcraft() == true)
	    	{
				add(block_crop_gearstone);	
	    	}
			
			if(ModLoader.getBuildcraft() == true)
	    	{
				add(block_crop_geariron);
	    	}
			
			if(ModLoader.getBuildcraft() == true)
	    	{
				add(block_crop_geargold);	
	    	}
			
			if(ModLoader.getBuildcraft() == true)
	    	{
				add(block_crop_geardiamond);	
	    	}

			if(ModLoader.getBigReactor() == true)
			{
				add(block_crop_yellorium);
			}
			
			if(ModLoader.getBigReactor() == true)
			{
				add(block_crop_blutonium);
			}
			if(ModLoader.getBigReactor() == true)
			{
				add(block_crop_cyanite);
			}

			if(ModLoader.getBigReactor() == true)
			{
				add(block_crop_graphite);
			}
			
			if(ModLoader.getBigReactor() == true)
			{
				add(block_crop_ludicrite);
			}
			
			if(ModLoader.getThermalFoundation() == true)
			{
				add(block_crop_enderium);
			}
			
			if(ModLoader.getThermalFoundation() == true)
			{
				add(block_crop_lumium);
			}
			
			if(ModLoader.getThermalFoundation() == true)
			{
				add(block_crop_signalum);
			}
			
			if(ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true)
			{
				add(block_crop_constantan);
			}
			
			if(ModLoader.getThermalFoundation() == true)
			{
				add(block_crop_mithril);
			}
			
			if(ModLoader.getImmersive() == true)
			{
				add(block_crop_uranium);
			}

			if(ModLoader.getForestry() == true)
			{
				add(block_crop_apatite);
			}

			if(ModLoader.getRefinedStorage() == true || ModLoader.getAe2() == true)
			{
				add(block_crop_silicon);
			}
			
			if(ModLoader.getDraconic() == true)
			{
				add(block_crop_draconium);
			}
			
			if(ModLoader.getDraconic() == true)
			{
				add(block_crop_draconium_awakened);
			}
			
			if(ModLoader.getAe2() == true)
			{
				add(block_crop_certus_quartz);
			}
			
			if(ModLoader.getAe2() == true)
			{
				add(block_crop_crystal_flux);
			}
			
			if(ModLoader.getAe2() == true)
			{
				add(block_crop_pure_fluix);
			}
		
		}

		public static void registerRenders() {
			
			registerRender(fruit_grass);

			registerRender(coal_furnace);			
			registerRender(lit_coal_furnace);
			registerRender(iron_furnace);			
			registerRender(lit_iron_furnace);
			registerRender(gold_furnace);			
			registerRender(lit_gold_furnace);
			registerRender(redstone_furnace);			
			registerRender(lit_redstone_furnace);
			registerRender(lapis_furnace);			
			registerRender(lit_lapis_furnace);
			registerRender(diamond_furnace);			
			registerRender(lit_diamond_furnace);
			registerRender(obsidian_furnace);			
			registerRender(lit_obsidian_furnace);
			registerRender(renforced_furnace);			
			registerRender(lit_renforced_furnace);
			registerRender(fire_furnace);			
			registerRender(lit_fire_furnace);

			registerRender(block_crop_coal);
			registerRender(block_crop_iron);
			registerRender(block_crop_gold);
			registerRender(block_crop_redstone);
			registerRender(block_crop_lapis);
			registerRender(block_crop_diamond);
			registerRender(block_crop_emerald);
			registerRender(block_crop_clay);
			registerRender(block_crop_glowstone);
			registerRender(block_crop_quartz);
			registerRender(block_crop_shard);
			registerRender(block_crop_cristal);	
			registerRender(block_crop_ender);
			registerRender(block_crop_bone);
			registerRender(block_crop_eye);
			registerRender(block_crop_powder);		
			registerRender(block_crop_paper);
			registerRender(block_crop_sugar);
			registerRender(block_crop_charcoal);
			registerRender(block_crop_flint);
			registerRender(block_crop_snowball);
			registerRender(block_crop_firework);
			registerRender(block_crop_nether);
			registerRender(block_crop_bottle);
			registerRender(block_crop_foot);
			registerRender(block_crop_hide);
			registerRender(block_crop_leather);
			registerRender(block_crop_feather);
			registerRender(block_crop_blaze);
			registerRender(block_crop_ghast);
			registerRender(block_crop_magma);
			registerRender(block_crop_shell);
			registerRender(block_crop_slime);
			registerRender(block_crop_star);
			registerRender(block_crop_string);
			registerRender(block_crop_zombie);			
			registerRender(block_crop_orange);
			registerRender(block_crop_magenta);
			registerRender(block_crop_lightblue);
			registerRender(block_crop_yellow);
			registerRender(block_crop_lime);
			registerRender(block_crop_pink);
			registerRender(block_crop_gray);
			registerRender(block_crop_silver);
			registerRender(block_crop_cyan);
			registerRender(block_crop_purple);
			registerRender(block_crop_brown);
			registerRender(block_crop_green);
			registerRender(block_crop_red);
			registerRender(block_crop_black);			
			registerRender(block_crop_vine);
			registerRender(block_crop_lilypad);
			registerRender(block_crop_tallgrass);
			registerRender(block_crop_largefern);
			registerRender(block_crop_bush);
			registerRender(block_crop_grass1);
			registerRender(block_crop_fern);
			registerRender(block_crop_oak);
			registerRender(block_crop_birch);
			registerRender(block_crop_spruce);
			registerRender(block_crop_jungle);
			registerRender(block_crop_darkoak);
			registerRender(block_crop_acacia);		
			registerRender(block_crop_apple);
			registerRender(block_crop_goldenapple);
			registerRender(block_crop_bread);
			registerRender(block_crop_egg);
			registerRender(block_crop_clownfish);
			registerRender(block_crop_pufferfish);
			registerRender(block_crop_cookie);
			registerRender(block_crop_chorus);
			registerRender(block_crop_rawporc);
			registerRender(block_crop_rawbeef);
			registerRender(block_crop_fish);
			registerRender(block_crop_salmon);
			registerRender(block_crop_rawchicken);
			registerRender(block_crop_rawrabbit);
			registerRender(block_crop_rawmutton);
			registerRender(block_crop_death);
			registerRender(block_crop_totem);
			

			registerRender(block_cane_cobble);
			registerRender(block_cane_sand);
			registerRender(block_cane_grass);
			registerRender(block_cane_oak);
			registerRender(block_cane_spruce);
			registerRender(block_cane_birch);
			registerRender(block_cane_jungle);
			registerRender(block_cane_acacia);
			registerRender(block_cane_darkoak);

			
			registerRender(block_cane_black);
			registerRender(block_cane_blue);
			registerRender(block_cane_brown);
			registerRender(block_cane_cyan);
			registerRender(block_cane_gray);
			registerRender(block_cane_green);
			registerRender(block_cane_lightblue);
			registerRender(block_cane_lime);
			registerRender(block_cane_magenta);
			registerRender(block_cane_orange);
			registerRender(block_cane_pink);
			registerRender(block_cane_purple);
			registerRender(block_cane_red);
			registerRender(block_cane_silver);
			registerRender(block_cane_white);
			registerRender(block_cane_yellow);	

			registerRender(block_plant_coal);
			registerRender(block_plant_iron);
			registerRender(block_plant_gold);
			registerRender(block_plant_redstone);
			registerRender(block_plant_lapis);
			registerRender(block_plant_diamond);
			registerRender(block_plant_emerald);
			registerRender(block_plant_clay);
			registerRender(block_plant_glowstone);
			registerRender(block_plant_quartz);
			registerRender(block_plant_shard);
			registerRender(block_plant_cristal);
			registerRender(block_plant_obsidian);
			registerRender(block_plant_bone);
			registerRender(block_plant_snow);
			registerRender(block_plant_nether);
			registerRender(block_plant_glass);
			registerRender(block_plant_magma);
			registerRender(block_plant_shell);

			registerRender(stem_iron);
			registerRender(stem_coal);
			registerRender(stem_gold);
			registerRender(stem_redstone);
			registerRender(stem_lapis);
			registerRender(stem_diamond);
			registerRender(stem_emerald);
			registerRender(stem_clay);
			registerRender(stem_glowstone);
			registerRender(stem_quartz);
			registerRender(stem_shard);
			registerRender(stem_cristal);
			registerRender(stem_obsidian);
			registerRender(stem_bone);
			registerRender(stem_snow);
			registerRender(stem_nether);
			registerRender(stem_glass);
			registerRender(stem_magma);
			registerRender(stem_shell);

			registerRender(elemental_stone);
			registerRender(elemental_cobblestone);
			registerRender(elemental_crop);
			registerRender(block_plant_elemental);
			registerRender(stem_elemental);
			

			registerRender(seafarer_spawn);
			registerRender(centaur_spawn);
			registerRender(minotaur_spawn);
			registerRender(flyingbeast_spawn);
			registerRender(reaper_spawn);
			
			registerRender(water_block);
			registerRender(fire_block);
			registerRender(earth_block);
			registerRender(air_block);

			registerRender(ice_water_ore);
			registerRender(dirt_earth_ore);
			registerRender(magma_fire_ore);
			registerRender(cloud_air_ore);
			
			
			registerRender(block_ritual_debug);

			registerRender(ghost_nether);
			registerRender(ghost_magma);
			registerRender(ghost_lava);
			registerRender(ghost_death);
			registerRender(ghost_soulsand);
			registerRender(ghost_elemental_cobble);
			registerRender(ghost_slabstone);
			registerRender(ghost_slabnether);
			registerRender(ghost_slabnetherup);
			registerRender(ghost_andesite);
			registerRender(ghost_polished_andesite);
			registerRender(ghost_waterliquid);
			registerRender(ghost_redstone);
			registerRender(ghost_cropelemental);
			registerRender(ghost_air);
			registerRender(ghost_fire);
			registerRender(ghost_earth);
			registerRender(ghost_water);
			registerRender(ghost_elementalstone);
			registerRender(ghost_cropiron);
			registerRender(ghost_cropgold);
			registerRender(ghost_diorite);

			registerRender(cloud);
			
			registerRender(reward);
			
			registerRender(block_crop_aluminium);
			registerRender(block_crop_brass);
			registerRender(block_crop_bronze);
			registerRender(block_crop_chrome);
			registerRender(block_crop_copper);
			registerRender(block_crop_electrum);
			registerRender(block_crop_invar);
			registerRender(block_crop_iridium);
			registerRender(block_crop_lead);
			registerRender(block_crop_nickel);
			registerRender(block_crop_platinium);
			registerRender(block_crop_silveringot);
			registerRender(block_crop_steel);
			registerRender(block_crop_tin);
			registerRender(block_crop_titanium);
			registerRender(block_crop_tungsten);
			registerRender(block_crop_zinc);
			registerRender(botania_crop_manasteel);
			registerRender(botania_crop_terrasteel);
			registerRender(botania_crop_manadiamond);
			registerRender(botania_crop_dragonstone);
			registerRender(botania_crop_elementium);
			registerRender(botania_crop_manapearl);
			registerRender(block_crop_gearwood);
			registerRender(block_crop_gearstone);
			registerRender(block_crop_geariron);
			registerRender(block_crop_geargold);
			registerRender(block_crop_geardiamond);	
			registerRender(block_crop_yellorium);
			registerRender(block_crop_blutonium);
			registerRender(block_crop_cyanite);
			registerRender(block_crop_graphite);
			registerRender(block_crop_ludicrite);
			registerRender(block_crop_enderium);
			registerRender(block_crop_lumium);
			registerRender(block_crop_signalum);
			registerRender(block_crop_constantan);
			registerRender(block_crop_mithril);
			registerRender(block_crop_uranium);
			registerRender(block_crop_apatite);
			registerRender(block_crop_silicon);
			registerRender(block_crop_draconium);
			registerRender(block_crop_draconium_awakened);
			registerRender(block_crop_certus_quartz);
			registerRender(block_crop_crystal_flux);
			registerRender(block_crop_pure_fluix);

		}
		
		
		public static void add(Block block) {
			ForgeRegistries.BLOCKS.register(block.setRegistryName(block.func_149739_a().substring(5)));
		}
		
		public static void addWithItem(Block block) {
			ForgeRegistries.BLOCKS.register(block.setRegistryName(block.func_149739_a().substring(5)));
			ForgeRegistries.ITEMS.register(new ItemBlock(block).func_77664_n().setRegistryName(block.func_149739_a().substring(5)));
		}
		
		public static void addOreDic(String what, Block block) 
		{
				if(OreDictionary.doesOreNameExist(what))			
				{
					ForgeRegistries.BLOCKS.register(block.setRegistryName(block.func_149739_a().substring(5)));
				}

		}
		
	public static void registerRender(Block block) {
		Item item = Item.func_150898_a(block);
		Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(item, 0, new ModelResourceLocation(
				Reference.MOD_ID + ":" + item.func_77658_a().substring(5), "inventory"));
	}
}
