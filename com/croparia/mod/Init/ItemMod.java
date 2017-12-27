package com.croparia.mod.Init;

import com.croparia.mod.Reference;
import com.croparia.mod.Config.ConfigInit;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;
import com.croparia.mod.Item.ItemEternalAir;
import com.croparia.mod.Item.ItemEternalEarth;
import com.croparia.mod.Item.ItemEternalFire;
import com.croparia.mod.Item.ItemEternalTime;
import com.croparia.mod.Item.ItemEternalWater;
import com.croparia.mod.Item.ItemModFood;
import com.croparia.mod.Item.ItemPestle;
import com.croparia.mod.Item.ItemSeedsMod;
import com.croparia.mod.Item.ItemWaterCan;
import com.croparia.mod.Item.Armor.ElementalAirArmor;
import com.croparia.mod.Item.Armor.ElementalEarthArmor;
import com.croparia.mod.Item.Armor.ElementalFireArmor;
import com.croparia.mod.Item.Armor.ElementalWaterArmor;
import com.croparia.mod.Item.Armor.ItemModArmor;
import com.croparia.mod.Item.Fruit.Bone;
import com.croparia.mod.Item.Fruit.Bottle;
import com.croparia.mod.Item.Fruit.Charcoal;
import com.croparia.mod.Item.Fruit.Clay;
import com.croparia.mod.Item.Fruit.Coal;
import com.croparia.mod.Item.Fruit.Colored;
import com.croparia.mod.Item.Fruit.Cristal;
import com.croparia.mod.Item.Fruit.DeathFruit;
import com.croparia.mod.Item.Fruit.Diamond;
import com.croparia.mod.Item.Fruit.Emerald;
import com.croparia.mod.Item.Fruit.Ender;
import com.croparia.mod.Item.Fruit.Eye;
import com.croparia.mod.Item.Fruit.Feather;
import com.croparia.mod.Item.Fruit.Firework;
import com.croparia.mod.Item.Fruit.FishFruit;
import com.croparia.mod.Item.Fruit.Flint;
import com.croparia.mod.Item.Fruit.Foot;
import com.croparia.mod.Item.Fruit.FruitFire;
import com.croparia.mod.Item.Fruit.FruitFood;
import com.croparia.mod.Item.Fruit.FruitNoGravity;
import com.croparia.mod.Item.Fruit.FruitTree;
import com.croparia.mod.Item.Fruit.Gapple;
import com.croparia.mod.Item.Fruit.Glowstone;
import com.croparia.mod.Item.Fruit.Gold;
import com.croparia.mod.Item.Fruit.Hide;
import com.croparia.mod.Item.Fruit.Iron;
import com.croparia.mod.Item.Fruit.IronMana;
import com.croparia.mod.Item.Fruit.Lapis;
import com.croparia.mod.Item.Fruit.Leather;
import com.croparia.mod.Item.Fruit.Lilypad;
import com.croparia.mod.Item.Fruit.Monster;
import com.croparia.mod.Item.Fruit.Natural;
import com.croparia.mod.Item.Fruit.NaturalTall;
import com.croparia.mod.Item.Fruit.Nether;
import com.croparia.mod.Item.Fruit.Paper;
import com.croparia.mod.Item.Fruit.Powder;
import com.croparia.mod.Item.Fruit.Quartz;
import com.croparia.mod.Item.Fruit.RawFruit;
import com.croparia.mod.Item.Fruit.RawRabbit;
import com.croparia.mod.Item.Fruit.Redstone;
import com.croparia.mod.Item.Fruit.Shard;
import com.croparia.mod.Item.Fruit.Slime;
import com.croparia.mod.Item.Fruit.Snowball;
import com.croparia.mod.Item.Fruit.Sring;
import com.croparia.mod.Item.Fruit.Star;
import com.croparia.mod.Item.Fruit.Sugar;
import com.croparia.mod.Item.Relique.ItemHornPlenty;
import com.croparia.mod.Item.Relique.ItemInfiniteApple;
import com.croparia.mod.Item.Relique.ItemMidasHand;
import com.croparia.mod.Item.Relique.ItemScythe;
import com.croparia.mod.Item.Tool.ItemModAxe;
import com.croparia.mod.Item.Tool.ItemModHoe;
import com.croparia.mod.Item.Tool.ItemModHoeElemental;
import com.croparia.mod.Item.Tool.ItemModPickAxe;
import com.croparia.mod.Item.Tool.ItemModShovel;
import com.croparia.mod.Item.Tool.ItemModSword;
import com.croparia.mod.Item.Tool.ItemMultitool;
import com.croparia.mod.Item.Tool.MultitoolAir;
import com.croparia.mod.Item.Tool.MultitoolEarth;
import com.croparia.mod.Item.Tool.MultitoolFire;
import com.croparia.mod.Item.Tool.MultitoolWater;
import com.cropariaCompat.mod.Init.CreativeTabsCompat;
import com.cropariaCompat.mod.Item.ItemSeedsModCompat;
import com.cropariaCompat.mod.OreDic.ModLoader;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;

public class ItemMod
{
	public static CreativeTabs tab = CreativeTabsRegistry.MOD_BLOCK;
	public static CreativeTabs wip = CreativeTabsRegistry.WIP;
	
    public static ArmorMaterial obsidian_mod = EnumHelper.addArmorMaterial("obsidian_mod", Reference.MOD_ID + ":obsidian_mod", 40, new int[] {5, 8, 10, 5}, 12, SoundEvents.field_187716_o, 2.0F);
    public static ArmorMaterial renforced_mod = EnumHelper.addArmorMaterial("renforced_mod", Reference.MOD_ID + ":renforced_mod", 40 * 2, new int[] {5 * 2, 8 * 2, 10 * 2, 5 * 2}, 12 * 2, SoundEvents.field_187716_o, 4.0F);
    public static ArmorMaterial elemental_mod = EnumHelper.addArmorMaterial("elemental_mod", Reference.MOD_ID + ":elemental_mod", 40 * 3, new int[] {5 * 3, 8 * 3, 10 * 3, 5 * 3}, 12 * 3, SoundEvents.field_187716_o, 6.0F);

    public static ToolMaterial wood_multi = EnumHelper.addToolMaterial("wood_multi", 0, 59 * 4, 2.0F, 0.0F, 15);
    public static ToolMaterial stone_multi = EnumHelper.addToolMaterial("stone_multi", 1, 131 * 4, 4.0F, 1.0F, 5);
    public static ToolMaterial iron_multi = EnumHelper.addToolMaterial("iron_multi", 2, 250 * 4, 6.0F, 2.0F, 14);
    public static ToolMaterial gold_multi = EnumHelper.addToolMaterial("gold_multi", 30, 32 * 4, 12.0F, 0.0F, 22);
    public static ToolMaterial diamond_multi = EnumHelper.addToolMaterial("diamond_multi", 3, 1561 * 4, 8.0F, 3.0F, 10);
    
    public static ToolMaterial obsidian_tool = EnumHelper.addToolMaterial("obsidian_tool", 3, 3000, 12.0F, 5.0F, 12);
    public static ToolMaterial obsidian_multi = EnumHelper.addToolMaterial("obsidian_multi", 3, 3000 * 4, 12.0F, 5.0F, 12);
    
    public static ToolMaterial renforced_tool = EnumHelper.addToolMaterial("renforced_tool", 3, 6000, 24.0F, 10.0F, 24);
    public static ToolMaterial renforced_multi = EnumHelper.addToolMaterial("renforced_multi", 3, 6000 * 4, 24.0F, 10.0F, 24);
    
    public static ToolMaterial elemental_tool = EnumHelper.addToolMaterial("elemental_tool", 3, 7500, 27.0F, 15.0F, 27);
    public static ToolMaterial elemental_multi = EnumHelper.addToolMaterial("elemental_multi", 3, 7500 * 4, 27.0F, 15.0F, 27);
    

    public static ToolMaterial scythe_mat = EnumHelper.addToolMaterial("scythe_mat", 3, 1561, 8.0F, Float.MAX_VALUE, 0);

    
    
    
	/** Food */
    public static Item cheese;
    public static Item raclette;
    public static Item cherry; 
    public static Item lemon; 
    public static Item apricot; 
    public static Item kiwi;  
    public static Item orange; 
    public static Item pear; 
    public static Item banana;
    public static Item cherry_pie; 
    public static Item lemon_pie; 
    public static Item apricot_pie; 
    public static Item kiwi_pie;  
    public static Item orange_pie; 
    public static Item pear_pie; 
    public static Item banana_pie;
    public static Item chicken_leg;
    public static Item roast_beef;
    public static Item roast_porc;
    public static Item horse_meat;
    public static Item squid_meat;
    public static Item cooked_chicken_leg;
    public static Item cooked_roast_beef;
    public static Item cooked_roast_porc;
    public static Item cooked_horse_meat;
    public static Item cooked_squid_meat;         
    public static Item flour;
    public static Item powder_cobble;
    public static Item powder_sand;
    public static Item powder_grass;
    public static Item powder_oak;
    public static Item powder_spruce;
    public static Item powder_birch;
    public static Item powder_jungle;
    public static Item powder_darkoak;
    public static Item powder_acacia;

    /** Tool */
    public static Item obsidian_axe, obsidian_pickaxe, obsidian_shovel, obsidian_hoe, obsidian_sword, obsidian_multitool,
                       renforced_axe, renforced_pickaxe, renforced_shovel, renforced_hoe, renforced_sword, renforced_multitool,
                       fire_axe, fire_pickaxe, fire_shovel, fire_hoe, fire_sword, fire_multitool,
                       water_axe, water_pickaxe, water_shovel, water_hoe, water_sword, water_multitool,
                       air_axe, air_pickaxe, air_shovel, air_hoe, air_sword, air_multitool,
                       earth_axe, earth_pickaxe, earth_shovel, earth_hoe, earth_sword, earth_multitool,
          
                       iron_multitool, 
                       gold_multitool,
                       wood_multitool, 
                       stone_multitool, 
                       diamond_multitool,
                       
                       horn_plenty,
                       midas_hand,
                     //  golden_egg,
                       infinite_apple,
                       scythe,
                       
                       wood_pestle,
                       stone_pestle,
                       iron_pestle,
                       gold_pestle,
                       diamond_pestle,
                       obsidian_pestle,
                       renforced_pestle,
                       elemental_pestle,
                       
                       water_can;

    /** Armor */
    public static Item obsidian_helmet, obsidian_chestplate, obsidian_leggings, obsidian_boots,
                       renforced_helmet, renforced_chestplate, renforced_leggings, renforced_boots,
                       elemental_fire_helmet, elemental_fire_chestplate, elemental_fire_leggings, elemental_fire_boots,
                       elemental_water_helmet, elemental_water_chestplate, elemental_water_leggings, elemental_water_boots,
                       elemental_air_helmet, elemental_air_chestplate, elemental_air_leggings, elemental_air_boots,
                       elemental_earth_helmet, elemental_earth_chestplate, elemental_earth_leggings, elemental_earth_boots;

    /** Seed & frag */
    public static Item seed_crop_coal, 
                       seed_crop_iron, 
                       seed_crop_gold, 
                       seed_crop_redstone, 
                       seed_crop_lapis, 
                       seed_crop_diamond,
                       seed_crop_emerald, 
                       seed_crop_clay,
                       seed_crop_glowstone, 
                       seed_crop_quartz, 
                       seed_crop_shard, 
                       seed_crop_cristal,
                       seed_crop_ender,
                       seed_crop_bone,
                       seed_crop_eye,
                       seed_crop_powder,
                       seed_crop_paper,
                       seed_crop_sugar,
                       seed_crop_charcoal,
                       seed_crop_flint,
                       seed_crop_snowball,
                       seed_crop_firework,
                       seed_crop_nether,
                       seed_crop_bottle,
                       seed_crop_foot,
                       seed_crop_hide,
                       seed_crop_leather,
                       seed_crop_feather,                       
                       seed_crop_blaze,
                       seed_crop_ghast,
                       seed_crop_magma,
                       seed_crop_shell,
                       seed_crop_slime,
                       seed_crop_star,
                       seed_crop_string,
                       seed_crop_zombie,
                       seed_crop_orange,
                       seed_crop_magenta,
                       seed_crop_lightblue,
                       seed_crop_yellow,
                       seed_crop_lime,
                       seed_crop_pink,
                       seed_crop_gray,
                       seed_crop_silver,
                       seed_crop_cyan,
                       seed_crop_purple,
                       seed_crop_brown,
                       seed_crop_green,
                       seed_crop_red,
                       seed_crop_black,                       
           			   seed_crop_vine,
           			   seed_crop_lilypad,
           			   seed_crop_tallgrass,
           			   seed_crop_largefern,
           			   seed_crop_bush,
           			   seed_crop_grass1,
           			   seed_crop_fern,
           			   seed_crop_oak,
           			   seed_crop_birch,
           			   seed_crop_spruce,
           			   seed_crop_jungle,
           			   seed_crop_darkoak,
           			   seed_crop_acacia,
           			   
           			   seed_crop_apple,
           			   seed_crop_goldenapple,
           			   seed_crop_bread,
           			   seed_crop_egg,
           			   seed_crop_clownfish,
           			   seed_crop_pufferfish,
           			   seed_crop_cookie,
           			   seed_crop_chorus,
           			   seed_crop_rawporc,
           			   seed_crop_rawbeef,
           			   seed_crop_fish,
           			   seed_crop_salmon,
           			   seed_crop_rawchicken,
           			   seed_crop_rawrabbit,
           			   seed_crop_rawmutton,
           			   seed_crop_death,
           			   seed_crop_totem,
                                            
                       fruit_coal, 
                       fruit_iron, 
                       fruit_gold, 
                       fruit_redstone, 
                       fruit_lapis, 
                       fruit_diamond,
                       fruit_emerald, 
                       fruit_clay,
                       fruit_glowstone, 
                       fruit_quartz, 
                       fruit_shard, 
                       fruit_cristal,
                       fruit_ender,
                       fruit_start,
                       fruit_start_monster,
                       fruit_bone,
                       fruit_eye,
                       fruit_powder,
                       fruit_paper,
                       fruit_sugar,
                       fruit_charcoal,
                       fruit_flint,
                       fruit_snowball,
                       fruit_firework,
                       fruit_nether,
                       fruit_bottle,
                       fruit_foot,
                       fruit_hide,
                       fruit_leather,
                       fruit_feather,
                       fruit_start_mob,                       
                       fruit_blaze,
                       fruit_ghast,
                       fruit_magma,
                       fruit_shell,
                       fruit_slime,
                       fruit_star,
                       fruit_string,
                       fruit_zombie,                    
                       fruit_orange,
                       fruit_magenta,
                       fruit_lightblue,
                       fruit_yellow,
                       fruit_lime,
                       fruit_pink,
                       fruit_gray,
                       fruit_silver,
                       fruit_cyan,
                       fruit_purple,
                       fruit_brown,
                       fruit_green,
                       fruit_red,
                       fruit_black,                      
                       fruit_start_natural,  
             		   fruit_vine,
             		   fruit_lilypad,
             		   fruit_tallgrass,
             		   fruit_largefern,
             		   fruit_bush,
             		   fruit_grass1,
             		   fruit_fern,
             		   fruit_oak,
             		   fruit_birch,
             		   fruit_spruce,
             		   fruit_jungle,
             		   fruit_darkoak,
             		   fruit_acacia,         		   
           			   fruit_apple,
           			   fruit_goldenapple,
           			   fruit_bread,
           			   fruit_egg,
           			   fruit_clownfish,
           			   fruit_pufferfish,
           			   fruit_cookie,
           			   fruit_chorus,
           			   fruit_rawporc,
           			   fruit_rawbeef,
           			   fruit_fish,
           			   fruit_salmon,
           			   fruit_rawchicken,
           			   fruit_rawrabbit,
           			   fruit_rawmutton,
           			   fruit_death,
           			   fruit_totem,
                      	
                       seed_stem_coal, 
                       seed_stem_iron, 
                       seed_stem_gold, 
                       seed_stem_redstone,                        
                       seed_stem_lapis, 
                       seed_stem_diamond,
                       seed_stem_emerald, 
                       seed_stem_clay, 
                       seed_stem_glowstone, 
                       seed_stem_quartz, 
                       seed_stem_shard, 
                       seed_stem_cristal,
                       seed_stem_obsidian,
                       seed_stem_bone,
                       seed_stem_snow,
                       seed_stem_nether,
                       seed_stem_glass,
                       seed_stem_magma,
                       seed_stem_shell,
                       
                       elemental_seed, 
                       elemental_fragment, 
                       elemental_water, 
                       elemental_fire, 
                       elemental_air, 
                       elemental_earth,
                       element_eternity,
                       eternal_fire,
                       eternal_water,
                       eternal_earth,
                       eternal_air,
                       eternal_time,
                       elemental_seed_stem;
    
    public static Item block_crop_iron, 
					   block_crop_diamond, 
					   block_crop_gold, 
					   block_crop_redstone, 
					   block_crop_lapis,
					   block_crop_coal, 
					   block_crop_clay, 
					   block_crop_glowstone, 
					   block_crop_emerald, 
					   block_crop_quartz,
					   block_crop_shard, 
					   block_crop_cristal, 
					   block_crop_ender,
					   block_crop_bone,
					   block_crop_eye,
					   block_crop_powder,
					   stem_iron, 
					   stem_coal, 
					   stem_gold, 
					   stem_redstone, 
					   stem_lapis, 
					   stem_diamond, 
					   stem_clay, 
					   stem_glowstone,
					   stem_emerald, 
					   stem_quartz, 
					   stem_shard, 
					   stem_cristal,
					   block_plant_coal, 
					   block_plant_iron, 
					   block_plant_gold, 
					   block_plant_redstone, 
					   block_plant_lapis,
					   block_plant_diamond, 
					   block_plant_clay, 
					   block_plant_glowstone, 
					   block_plant_emerald, 
					   block_plant_quartz,
					   block_plant_shard, 
					   block_plant_cristal,
					   elemental_stone, 
					   elemental_cobblestone, 
					   elemental_crop, 
					   stem_elemental, 
					   block_plant_elemental;
    
    public static Item copper_ingot;
    public static Item aluminium_ingot;
    public static Item brass_ingot;
    public static Item bronze_ingot;
    public static Item chrome_ingot;
    public static Item electrum_ingot;
    public static Item invar_ingot;
    public static Item iridium_ingot;
	public static Item lead_ingot;
	public static Item nickel_ingot;
	public static Item platinium_ingot;
	public static Item silver_ingot;	
	public static Item steel_ingot;
	public static Item tin_ingot;
	public static Item titanium_ingot;
	public static Item tungsten_ingot;
	public static Item zinc_ingot;	
	public static Item ingot_elementium;
	public static Item ingot_terrasteel;
	public static Item mana_diamond;
	public static Item mana_pearl;
	public static Item ingot_manasteel;
	public static Item dragonstone;
	public static Item gearwood;
	public static Item gearstone;
	public static Item geariron;
	public static Item geargold;
	public static Item geardiamond;
	public static Item ingot_yellorium;
	public static Item ingot_blutonium;
	public static Item ingot_cyanite;
	public static Item ingot_graphite;
	public static Item ingot_ludicrite;
	public static Item ingot_enderium;
	public static Item ingot_lumium;
	public static Item ingot_signalum;
	public static Item ingot_constantan;
	public static Item ingot_mithril;
	public static Item ingot_uranium;
	public static Item gem_apatite;
	public static Item silicon;
	public static Item ingot_draconium;
	public static Item ingot_draconium_awakened;
	public static Item certus_quartz;
	public static Item crystal_flux;
	public static Item pure_fluix;
	
	
    public static Item fruit_aluminium;
    public static Item fruit_brass;
    public static Item fruit_bronze;
    public static Item fruit_chrome;
    public static Item fruit_copper;
    public static Item fruit_electrum;
    public static Item fruit_invar;
    public static Item fruit_iridium;
    public static Item fruit_lead;
    public static Item fruit_nickel;
    public static Item fruit_platinium;
    public static Item fruit_silveringot;
    public static Item fruit_steel;
    public static Item fruit_tin;
    public static Item fruit_titanium;
    public static Item fruit_tungsten;
    public static Item fruit_zinc;
    public static Item fruit_manasteel;
    public static Item fruit_terrasteel;
    public static Item fruit_manadiamond;
    public static Item fruit_manapearl;
    public static Item fruit_elementium;
    public static Item fruit_dragonstone;
    public static Item fruit_gearwood;
    public static Item fruit_gearstone;
    public static Item fruit_geariron;
    public static Item fruit_geargold;
    public static Item fruit_geardiamond;  
	public static Item fruit_yellorium;
	public static Item fruit_blutonium;
	public static Item fruit_cyanite;
	public static Item fruit_graphite;
	public static Item fruit_ludicrite;
	public static Item fruit_enderium;
	public static Item fruit_lumium;
	public static Item fruit_signalum;
	public static Item fruit_constantan;
	public static Item fruit_mithril;
	public static Item fruit_uranium;
	public static Item fruit_apatite;
	public static Item fruit_silicon;
	public static Item fruit_draconium;
	public static Item fruit_draconium_awakened;
	public static Item fruit_certus_quartz;
	public static Item fruit_crystal_flux;
	public static Item fruit_pure_fluix;
	
    
    public static Item seed_crop_aluminium;
    public static Item seed_crop_brass;
    public static Item seed_crop_bronze;
    public static Item seed_crop_chrome;
    public static Item seed_crop_copper;
    public static Item seed_crop_electrum;
    public static Item seed_crop_invar;
    public static Item seed_crop_iridium;
    public static Item seed_crop_lead;
    public static Item seed_crop_nickel;
    public static Item seed_crop_platinium;
    public static Item seed_crop_silveringot;
    public static Item seed_crop_steel;
    public static Item seed_crop_tin;
    public static Item seed_crop_titanium;
    public static Item seed_crop_tungsten;
    public static Item seed_crop_zinc;
    public static Item seed_crop_manasteel;
    public static Item seed_crop_terrasteel;
    public static Item seed_crop_manadiamond;
    public static Item seed_crop_manapearl;
    public static Item seed_crop_elementium;
    public static Item seed_crop_dragonstone;
    public static Item seed_crop_gearwood;
    public static Item seed_crop_gearstone;
    public static Item seed_crop_geariron;
    public static Item seed_crop_geargold;
    public static Item seed_crop_geardiamond;   
	public static Item seed_crop_yellorium;
	public static Item seed_crop_blutonium;
	public static Item seed_crop_cyanite;
	public static Item seed_crop_graphite;
	public static Item seed_crop_ludicrite;
	public static Item seed_crop_enderium;
	public static Item seed_crop_lumium;
	public static Item seed_crop_signalum;
	public static Item seed_crop_constantan;
	public static Item seed_crop_mithril;
	public static Item seed_crop_uranium;
	public static Item seed_crop_apatite;
	public static Item seed_crop_silicon;
	public static Item seed_crop_draconium;
	public static Item seed_crop_draconium_awakened;
	public static Item seed_crop_certus_quartz;
	public static Item seed_crop_crystal_flux;
	public static Item seed_crop_pure_fluix;

    public static void init(){
     	 
    	
        /** Food */
    	cheese = new ItemModFood(6, 0.8F, false).func_77655_b("cheese").setRegistryName("cheese");
        raclette = new ItemModFood(14, 1.8F, false).func_77655_b("raclette").setRegistryName("raclette");
        cherry = new ItemModFood(2, 0.3F, false).func_77655_b("cherry").setRegistryName("cherry");
        lemon = new ItemModFood(2, 0.3F, false).func_77655_b("lemon").setRegistryName("lemon");
        apricot = new ItemModFood(2, 0.3F, false).func_77655_b("apricot").setRegistryName("apricot");
        kiwi = new ItemModFood(2, 0.3F, false).func_77655_b("kiwi").setRegistryName("kiwi");
        orange = new ItemModFood(2, 0.3F, false).func_77655_b("orange").setRegistryName("orange");
        pear = new ItemModFood(2, 0.3F, false).func_77655_b("pear").setRegistryName("pear");
        banana = new ItemModFood(2, 0.3F, false).func_77655_b("banana").setRegistryName("banana");

        cherry_pie = new ItemModFood(8, 1.0F, false).func_77655_b("cherry_pie").setRegistryName("cherry_pie");
        lemon_pie = new ItemModFood(8, 1.0F, false).func_77655_b("lemon_pie").setRegistryName("lemon_pie");
        apricot_pie = new ItemModFood(8, 1.0F, false).func_77655_b("apricot_pie").setRegistryName("apricot_pie");
        kiwi_pie = new ItemModFood(8, 1.0F, false).func_77655_b("kiwi_pie").setRegistryName("kiwi_pie");
        orange_pie = new ItemModFood(8, 1.0F, false).func_77655_b("orange_pie").setRegistryName("orange_pie");
        pear_pie = new ItemModFood(8, 1.0F, false).func_77655_b("pear_pie").setRegistryName("pear_pie");
        banana_pie = new ItemModFood(8, 1.0F, false).func_77655_b("banana_pie").setRegistryName("banana_pie");
        
        chicken_leg = new ItemModFood(1, 0.3F, true).func_77655_b("chicken_leg").setRegistryName("chicken_leg");
        roast_beef = new ItemModFood(6, 0.3F, true).func_77655_b("roast_beef").setRegistryName("roast_beef");
        roast_porc = new ItemModFood(6, 0.3F, true).func_77655_b("roast_porc").setRegistryName("roast_porc");
        horse_meat = new ItemModFood(3, 0.3F, true).func_77655_b("horse_meat").setRegistryName("horse_meat");
        squid_meat = new ItemModFood(2, 0.3F, true).func_77655_b("squid_meat").setRegistryName("squid_meat");
        
        cooked_chicken_leg = new ItemModFood(6, 0.6F, true).func_77655_b("cooked_chicken_leg").setRegistryName("cooked_chicken_leg");
        cooked_roast_beef = new ItemModFood(10, 1.4F, true).func_77655_b("cooked_roast_beef").setRegistryName("cooked_roast_beef");
        cooked_roast_porc = new ItemModFood(10, 1.4F, true).func_77655_b("cooked_roast_porc").setRegistryName("cooked_roast_porc");
        cooked_horse_meat = new ItemModFood(8, 0.8F, true).func_77655_b("cooked_horse_meat").setRegistryName("cooked_horse_meat");
        cooked_squid_meat = new ItemModFood(6, 0.6F, true).func_77655_b("cooked_squid_meat").setRegistryName("cooked_squid_meat");
        
        flour = new Item().func_77655_b("flour").func_77637_a(tab).setRegistryName("flour");
        
        
        /** Tool */
        obsidian_axe = new ItemModAxe(ItemMod.obsidian_tool, 7.5F, -2.8F).func_77655_b("obsidian_axe").func_77637_a(tab).setRegistryName("obsidian_axe");
        obsidian_pickaxe = new ItemModPickAxe(ItemMod.obsidian_tool).func_77655_b("obsidian_pickaxe").func_77637_a(tab).setRegistryName("obsidian_pickaxe");
        obsidian_shovel = new ItemModShovel(ItemMod.obsidian_tool).func_77655_b("obsidian_shovel").func_77637_a(tab).setRegistryName("obsidian_shovel");
        obsidian_hoe = new ItemModHoe(ItemMod.obsidian_tool).func_77655_b("obsidian_hoe").func_77637_a(tab).setRegistryName("obsidian_hoe");
        obsidian_sword = new ItemModSword(ItemMod.obsidian_tool).func_77655_b("obsidian_sword").func_77637_a(tab).setRegistryName("obsidian_sword");
        obsidian_multitool = new ItemMultitool(5.0F, -3.2F, obsidian_multi).func_77655_b("obsidian_multitool").func_77637_a(tab).setRegistryName("obsidian_multitool");
        
        renforced_axe = new ItemModAxe(ItemMod.renforced_tool, 15.0F, -2.2F).func_77655_b("renforced_axe").func_77637_a(tab).setRegistryName("renforced_axe");
        renforced_pickaxe = new ItemModPickAxe(ItemMod.renforced_tool).func_77655_b("renforced_pickaxe").func_77637_a(tab).setRegistryName("renforced_pickaxe");
        renforced_shovel = new ItemModShovel(ItemMod.renforced_tool).func_77655_b("renforced_shovel").func_77637_a(tab).setRegistryName("renforced_shovel");
        renforced_hoe = new ItemModHoe(ItemMod.renforced_tool).func_77655_b("renforced_hoe").func_77637_a(tab).setRegistryName("renforced_hoe");
        renforced_sword = new ItemModSword(ItemMod.renforced_tool).func_77655_b("renforced_sword").func_77637_a(tab).setRegistryName("renforced_sword");
        renforced_multitool = new ItemMultitool(10.0F, -3.0F, renforced_multi).func_77655_b("renforced_multitool").func_77637_a(tab).setRegistryName("renforced_multitool");

        fire_axe = new ItemModAxe(ItemMod.elemental_tool, 22.5F, -2.2F).func_77655_b("fire_axe").func_77637_a(tab).setRegistryName("fire_axe");
        fire_pickaxe = new ItemModPickAxe(ItemMod.elemental_tool).func_77655_b("fire_pickaxe").func_77637_a(tab).setRegistryName("fire_pickaxe");
        fire_shovel = new ItemModShovel(ItemMod.elemental_tool).func_77655_b("fire_shovel").func_77637_a(tab).setRegistryName("fire_shovel");
        fire_hoe = new ItemModHoeElemental(ItemMod.elemental_tool).func_77655_b("fire_hoe").func_77637_a(tab).setRegistryName("fire_hoe");
        fire_sword = new ItemModSword(ItemMod.elemental_tool).func_77655_b("fire_sword").func_77637_a(tab).setRegistryName("fire_sword");
        fire_multitool = new MultitoolFire(15.0F, -2.8F, elemental_multi).func_77655_b("fire_multitool").func_77637_a(tab).setRegistryName("fire_multitool");

        water_axe = new ItemModAxe(ItemMod.elemental_tool, 17.5F, -2.2F).func_77655_b("water_axe").func_77637_a(tab).setRegistryName("water_axe");
        water_pickaxe = new ItemModPickAxe(ItemMod.elemental_tool).func_77655_b("water_pickaxe").func_77637_a(tab).setRegistryName("water_pickaxe");
        water_shovel = new ItemModShovel(ItemMod.elemental_tool).func_77655_b("water_shovel").func_77637_a(tab).setRegistryName("water_shovel");
        water_hoe = new ItemModHoeElemental(ItemMod.elemental_tool).func_77655_b("water_hoe").func_77637_a(tab).setRegistryName("water_hoe");
        water_sword = new ItemModSword(ItemMod.elemental_tool).func_77655_b("water_sword").func_77637_a(tab).setRegistryName("water_sword");
        water_multitool = new MultitoolWater(15.0F, -2.8F, elemental_multi).func_77655_b("water_multitool").func_77637_a(tab).setRegistryName("water_multitool");

        air_axe = new ItemModAxe(ItemMod.elemental_tool, 17.5F, -2.2F).func_77655_b("air_axe").func_77637_a(tab).setRegistryName("air_axe");
        air_pickaxe = new ItemModPickAxe(ItemMod.elemental_tool).func_77655_b("air_pickaxe").func_77637_a(tab).setRegistryName("air_pickaxe");
        air_shovel = new ItemModShovel(ItemMod.elemental_tool).func_77655_b("air_shovel").func_77637_a(tab).setRegistryName("air_shovel");
        air_hoe = new ItemModHoeElemental(ItemMod.elemental_tool).func_77655_b("air_hoe").func_77637_a(tab).setRegistryName("air_hoe");
        air_sword = new ItemModSword(ItemMod.elemental_tool).func_77655_b("air_sword").func_77637_a(tab).setRegistryName("air_sword");
        air_multitool = new MultitoolAir(15.0F, -2.8F, elemental_multi).func_77655_b("air_multitool").func_77637_a(tab).setRegistryName("air_multitool");

        earth_axe = new ItemModAxe(ItemMod.elemental_tool, 17.5F, -2.2F).func_77655_b("earth_axe").func_77637_a(tab).setRegistryName("earth_axe");
        earth_pickaxe = new ItemModPickAxe(ItemMod.elemental_tool).func_77655_b("earth_pickaxe").func_77637_a(tab).setRegistryName("earth_pickaxe");
        earth_shovel = new ItemModShovel(ItemMod.elemental_tool).func_77655_b("earth_shovel").func_77637_a(tab).setRegistryName("earth_shovel");
        earth_hoe = new ItemModHoeElemental(ItemMod.elemental_tool).func_77655_b("earth_hoe").func_77637_a(tab).setRegistryName("earth_hoe");
        earth_sword = new ItemModSword(ItemMod.elemental_tool).func_77655_b("earth_sword").func_77637_a(tab).setRegistryName("earth_sword");
        earth_multitool = new MultitoolEarth(15.0F, -2.8F, elemental_multi).func_77655_b("earth_multitool").func_77637_a(tab).setRegistryName("earth_multitool");
        
        wood_multitool = new ItemMultitool(0.0F, -2.8F, wood_multi).func_77655_b("wood_multitool").func_77637_a(tab).setRegistryName("wood_multitool");
        stone_multitool = new ItemMultitool(1.0F, -2.8F, stone_multi).func_77655_b("stone_multitool").func_77637_a(tab).setRegistryName("stone_multitool");
        iron_multitool = new ItemMultitool(2.0F, -2.8F, iron_multi).func_77655_b("iron_multitool").func_77637_a(tab).setRegistryName("iron_multitool");
        gold_multitool = new ItemMultitool(0.0F, -2.8F, gold_multi).func_77655_b("gold_multitool").func_77637_a(tab).setRegistryName("gold_multitool");
        diamond_multitool = new ItemMultitool(3.0F, -2.8F, diamond_multi).func_77655_b("diamond_multitool").func_77637_a(tab).setRegistryName("diamond_multitool");
        
        wood_pestle = new ItemPestle().func_77655_b("wood_pestle").setRegistryName("wood_pestle");
        stone_pestle = new ItemPestle().func_77655_b("stone_pestle").setRegistryName("stone_pestle");
        iron_pestle = new ItemPestle().func_77655_b("iron_pestle").setRegistryName("iron_pestle");
        gold_pestle = new ItemPestle().func_77655_b("gold_pestle").setRegistryName("gold_pestle");
        diamond_pestle = new ItemPestle().func_77655_b("diamond_pestle").setRegistryName("diamond_pestle");
        obsidian_pestle = new ItemPestle().func_77655_b("obsidian_pestle").setRegistryName("obsidian_pestle");
        renforced_pestle = new ItemPestle().func_77655_b("renforced_pestle").setRegistryName("renforced_pestle");
        elemental_pestle = new ItemPestle().func_77655_b("elemental_pestle").setRegistryName("elemental_pestle");     
        
        water_can = new ItemWaterCan().func_77655_b("water_can").setRegistryName("water_can");     
        
        horn_plenty = new ItemHornPlenty("horn_plenty");
        midas_hand = new ItemMidasHand("midas_hand");
        //golden_egg = new Item().setCreativeTab(tab).setUnlocalizedName("golden_egg").setRegistryName("golden_egg");
        infinite_apple = new ItemInfiniteApple().func_77655_b("infinite_apple").setRegistryName("infinite_apple");
        scythe = new ItemScythe(scythe_mat, "scythe");
       
        /** Armor */
        obsidian_helmet = new ItemModArmor(obsidian_mod, EntityEquipmentSlot.HEAD).func_77655_b("obsidian_helmet").setRegistryName("obsidian_helmet");
        obsidian_chestplate = new ItemModArmor(obsidian_mod, EntityEquipmentSlot.CHEST).func_77655_b("obsidian_chestplate").setRegistryName("obsidian_chestplate");
        obsidian_leggings = new ItemModArmor(obsidian_mod, EntityEquipmentSlot.LEGS).func_77655_b("obsidian_leggings").setRegistryName("obsidian_leggings");
        obsidian_boots = new ItemModArmor(obsidian_mod, EntityEquipmentSlot.FEET).func_77655_b("obsidian_boots").setRegistryName("obsidian_boots");

        renforced_helmet = new ItemModArmor(renforced_mod, EntityEquipmentSlot.HEAD).func_77655_b("renforced_helmet").setRegistryName("renforced_helmet");
        renforced_chestplate = new ItemModArmor(renforced_mod, EntityEquipmentSlot.CHEST).func_77655_b("renforced_chestplate").setRegistryName("renforced_chestplate");
        renforced_leggings = new ItemModArmor(renforced_mod, EntityEquipmentSlot.LEGS).func_77655_b("renforced_leggings").setRegistryName("renforced_leggings");
        renforced_boots = new ItemModArmor(renforced_mod, EntityEquipmentSlot.FEET).func_77655_b("renforced_boots").setRegistryName("renforced_boots");

        elemental_water_helmet = new ElementalWaterArmor(elemental_mod, EntityEquipmentSlot.HEAD).func_77655_b("elemental_water_helmet").setRegistryName("elemental_water_helmet");
        elemental_water_chestplate = new ElementalWaterArmor(elemental_mod, EntityEquipmentSlot.CHEST).func_77655_b("elemental_water_chestplate").setRegistryName("elemental_water_chestplate");
        elemental_water_leggings = new ElementalWaterArmor(elemental_mod, EntityEquipmentSlot.LEGS).func_77655_b("elemental_water_leggings").setRegistryName("elemental_water_leggings");
        elemental_water_boots = new ElementalWaterArmor(elemental_mod, EntityEquipmentSlot.FEET).func_77655_b("elemental_water_boots").setRegistryName("elemental_water_boots");

        elemental_air_helmet = new ElementalAirArmor(elemental_mod, EntityEquipmentSlot.HEAD).func_77655_b("elemental_air_helmet").setRegistryName("elemental_air_helmet");
        elemental_air_chestplate = new ElementalAirArmor(elemental_mod, EntityEquipmentSlot.CHEST).func_77655_b("elemental_air_chestplate").setRegistryName("elemental_air_chestplate");
        elemental_air_leggings = new ElementalAirArmor(elemental_mod, EntityEquipmentSlot.LEGS).func_77655_b("elemental_air_leggings").setRegistryName("elemental_air_leggings");
        elemental_air_boots = new ElementalAirArmor(elemental_mod, EntityEquipmentSlot.FEET).func_77655_b("elemental_air_boots").setRegistryName("elemental_air_boots");

        elemental_earth_helmet = new ElementalEarthArmor(elemental_mod, EntityEquipmentSlot.HEAD).func_77655_b("elemental_earth_helmet").setRegistryName("elemental_earth_helmet");
        elemental_earth_chestplate = new ElementalEarthArmor(elemental_mod, EntityEquipmentSlot.CHEST).func_77655_b("elemental_earth_chestplate").setRegistryName("elemental_earth_chestplate");
        elemental_earth_leggings = new ElementalEarthArmor(elemental_mod, EntityEquipmentSlot.LEGS).func_77655_b("elemental_earth_leggings").setRegistryName("elemental_earth_leggings");
        elemental_earth_boots = new ElementalEarthArmor(elemental_mod, EntityEquipmentSlot.FEET).func_77655_b("elemental_earth_boots").setRegistryName("elemental_earth_boots");

        elemental_fire_helmet = new ElementalFireArmor(elemental_mod, EntityEquipmentSlot.HEAD).func_77655_b("elemental_fire_helmet").setRegistryName("elemental_fire_helmet");
        elemental_fire_chestplate = new ElementalFireArmor(elemental_mod, EntityEquipmentSlot.CHEST).func_77655_b("elemental_fire_chestplate").setRegistryName("elemental_fire_chestplate");
        elemental_fire_leggings = new ElementalFireArmor(elemental_mod, EntityEquipmentSlot.LEGS).func_77655_b("elemental_fire_leggings").setRegistryName("elemental_fire_leggings");
        elemental_fire_boots = new ElementalFireArmor(elemental_mod, EntityEquipmentSlot.FEET).func_77655_b("elemental_fire_boots").setRegistryName("elemental_fire_boots");

        /** Seed */
        
        seed_crop_coal = new ItemSeedsMod(BlockMod.block_crop_coal, Blocks.field_150458_ak).func_77655_b("seed_crop_coal").func_77637_a(tab).setRegistryName("seed_crop_coal");
        seed_crop_iron = new ItemSeedsMod(BlockMod.block_crop_iron, Blocks.field_150458_ak).func_77655_b("seed_crop_iron").func_77637_a(tab).setRegistryName("seed_crop_iron");
        seed_crop_gold = new ItemSeedsMod(BlockMod.block_crop_gold, Blocks.field_150458_ak).func_77655_b("seed_crop_gold").func_77637_a(tab).setRegistryName("seed_crop_gold");
        seed_crop_redstone = new ItemSeedsMod(BlockMod.block_crop_redstone, Blocks.field_150458_ak).func_77655_b("seed_crop_redstone").func_77637_a(tab).setRegistryName("seed_crop_redstone");
        seed_crop_lapis = new ItemSeedsMod(BlockMod.block_crop_lapis,Blocks.field_150458_ak).func_77655_b("seed_crop_lapis").func_77637_a(tab).setRegistryName("seed_crop_lapis");
        seed_crop_diamond = new ItemSeedsMod(BlockMod.block_crop_diamond, Blocks.field_150458_ak).func_77655_b("seed_crop_diamond").func_77637_a(tab).setRegistryName("seed_crop_diamond");
        seed_crop_emerald = new ItemSeedsMod(BlockMod.block_crop_emerald, Blocks.field_150458_ak).func_77655_b("seed_crop_emerald").func_77637_a(tab).setRegistryName("seed_crop_emerald");
        seed_crop_clay =  new ItemSeedsMod(BlockMod.block_crop_clay, Blocks.field_150458_ak).func_77655_b("seed_crop_clay").func_77637_a(tab).setRegistryName("seed_crop_clay");
		seed_crop_glowstone =  new ItemSeedsMod(BlockMod.block_crop_glowstone, Blocks.field_150458_ak).func_77655_b("seed_crop_glowstone").func_77637_a(tab).setRegistryName("seed_crop_glowstone");
		seed_crop_quartz =  new ItemSeedsMod(BlockMod.block_crop_quartz, Blocks.field_150458_ak).func_77655_b("seed_crop_quartz").func_77637_a(tab).setRegistryName("seed_crop_quartz");
		seed_crop_shard =  new ItemSeedsMod(BlockMod.block_crop_shard, Blocks.field_150458_ak).func_77655_b("seed_crop_shard").func_77637_a(tab).setRegistryName("seed_crop_shard");
		seed_crop_cristal =  new ItemSeedsMod(BlockMod.block_crop_cristal, Blocks.field_150458_ak).func_77655_b("seed_crop_cristal").func_77637_a(tab).setRegistryName("seed_crop_cristal");
		seed_crop_ender =  new ItemSeedsMod(BlockMod.block_crop_ender, Blocks.field_150458_ak).func_77655_b("seed_crop_ender").func_77637_a(tab).setRegistryName("seed_crop_ender");
		seed_crop_bone =  new ItemSeedsMod(BlockMod.block_crop_bone, Blocks.field_150458_ak).func_77655_b("seed_crop_bone").func_77637_a(tab).setRegistryName("seed_crop_bone");
		seed_crop_eye =  new ItemSeedsMod(BlockMod.block_crop_eye, Blocks.field_150458_ak).func_77655_b("seed_crop_eye").func_77637_a(tab).setRegistryName("seed_crop_eye");
		seed_crop_powder =  new ItemSeedsMod(BlockMod.block_crop_powder, Blocks.field_150458_ak).func_77655_b("seed_crop_powder").func_77637_a(tab).setRegistryName("seed_crop_powder");
		seed_crop_paper =  new ItemSeedsMod(BlockMod.block_crop_paper, Blocks.field_150458_ak).func_77655_b("seed_crop_paper").func_77637_a(tab).setRegistryName("seed_crop_paper");
		seed_crop_sugar =  new ItemSeedsMod(BlockMod.block_crop_sugar, Blocks.field_150458_ak).func_77655_b("seed_crop_sugar").func_77637_a(tab).setRegistryName("seed_crop_sugar");
		seed_crop_charcoal =  new ItemSeedsMod(BlockMod.block_crop_charcoal, Blocks.field_150458_ak).func_77655_b("seed_crop_charcoal").func_77637_a(tab).setRegistryName("seed_crop_charcoal");
		seed_crop_flint =  new ItemSeedsMod(BlockMod.block_crop_flint, Blocks.field_150458_ak).func_77655_b("seed_crop_flint").func_77637_a(tab).setRegistryName("seed_crop_flint");
		seed_crop_snowball =  new ItemSeedsMod(BlockMod.block_crop_snowball, Blocks.field_150458_ak).func_77655_b("seed_crop_snowball").func_77637_a(tab).setRegistryName("seed_crop_snowball");
		seed_crop_firework =  new ItemSeedsMod(BlockMod.block_crop_firework, Blocks.field_150458_ak).func_77655_b("seed_crop_firework").func_77637_a(tab).setRegistryName("seed_crop_firework");
		seed_crop_nether =  new ItemSeedsMod(BlockMod.block_crop_nether, Blocks.field_150458_ak).func_77655_b("seed_crop_nether").func_77637_a(tab).setRegistryName("seed_crop_nether");
		seed_crop_bottle =  new ItemSeedsMod(BlockMod.block_crop_bottle, Blocks.field_150458_ak).func_77655_b("seed_crop_bottle").func_77637_a(tab).setRegistryName("seed_crop_bottle");
		seed_crop_foot =  new ItemSeedsMod(BlockMod.block_crop_foot, Blocks.field_150458_ak).func_77655_b("seed_crop_foot").func_77637_a(tab).setRegistryName("seed_crop_foot");
		seed_crop_hide =  new ItemSeedsMod(BlockMod.block_crop_hide, Blocks.field_150458_ak).func_77655_b("seed_crop_hide").func_77637_a(tab).setRegistryName("seed_crop_hide");
		seed_crop_leather =  new ItemSeedsMod(BlockMod.block_crop_leather, Blocks.field_150458_ak).func_77655_b("seed_crop_leather").func_77637_a(tab).setRegistryName("seed_crop_leather");
		seed_crop_feather =  new ItemSeedsMod(BlockMod.block_crop_feather, Blocks.field_150458_ak).func_77655_b("seed_crop_feather").func_77637_a(tab).setRegistryName("seed_crop_feather");
		seed_crop_blaze =  new ItemSeedsMod(BlockMod.block_crop_blaze, Blocks.field_150458_ak).func_77655_b("seed_crop_blaze").func_77637_a(tab).setRegistryName("seed_crop_blaze");
		seed_crop_ghast =  new ItemSeedsMod(BlockMod.block_crop_ghast, Blocks.field_150458_ak).func_77655_b("seed_crop_ghast").func_77637_a(tab).setRegistryName("seed_crop_ghast");
		seed_crop_magma =  new ItemSeedsMod(BlockMod.block_crop_magma, Blocks.field_150458_ak).func_77655_b("seed_crop_magma").func_77637_a(tab).setRegistryName("seed_crop_magma");
		seed_crop_shell =  new ItemSeedsMod(BlockMod.block_crop_shell, Blocks.field_150458_ak).func_77655_b("seed_crop_shell").func_77637_a(tab).setRegistryName("seed_crop_shell");
		seed_crop_slime =  new ItemSeedsMod(BlockMod.block_crop_slime, Blocks.field_150458_ak).func_77655_b("seed_crop_slime").func_77637_a(tab).setRegistryName("seed_crop_slime");
		seed_crop_star =  new ItemSeedsMod(BlockMod.block_crop_star, Blocks.field_150458_ak).func_77655_b("seed_crop_star").func_77637_a(tab).setRegistryName("seed_crop_star");
		seed_crop_string =  new ItemSeedsMod(BlockMod.block_crop_string, Blocks.field_150458_ak).func_77655_b("seed_crop_string").func_77637_a(tab).setRegistryName("seed_crop_string");
		seed_crop_zombie =  new ItemSeedsMod(BlockMod.block_crop_zombie, Blocks.field_150458_ak).func_77655_b("seed_crop_zombie").func_77637_a(tab).setRegistryName("seed_crop_zombie");		
		seed_crop_orange = new ItemSeedsMod(BlockMod.block_crop_orange, Blocks.field_150458_ak).func_77655_b("seed_crop_orange").func_77637_a(tab).setRegistryName("seed_crop_orange");
	    seed_crop_magenta = new ItemSeedsMod(BlockMod.block_crop_magenta, Blocks.field_150458_ak).func_77655_b("seed_crop_magenta").func_77637_a(tab).setRegistryName("seed_crop_magenta");
	    seed_crop_lightblue = new ItemSeedsMod(BlockMod.block_crop_lightblue, Blocks.field_150458_ak).func_77655_b("seed_crop_lightblue").func_77637_a(tab).setRegistryName("seed_crop_lightblue");
	    seed_crop_yellow = new ItemSeedsMod(BlockMod.block_crop_yellow, Blocks.field_150458_ak).func_77655_b("seed_crop_yellow").func_77637_a(tab).setRegistryName("seed_crop_yellow");
	    seed_crop_lime = new ItemSeedsMod(BlockMod.block_crop_lime, Blocks.field_150458_ak).func_77655_b("seed_crop_lime").func_77637_a(tab).setRegistryName("seed_crop_lime");
	    seed_crop_pink = new ItemSeedsMod(BlockMod.block_crop_pink, Blocks.field_150458_ak).func_77655_b("seed_crop_pink").func_77637_a(tab).setRegistryName("seed_crop_pink");
	    seed_crop_gray = new ItemSeedsMod(BlockMod.block_crop_gray, Blocks.field_150458_ak).func_77655_b("seed_crop_gray").func_77637_a(tab).setRegistryName("seed_crop_gray");
	    seed_crop_silver = new ItemSeedsMod(BlockMod.block_crop_silver, Blocks.field_150458_ak).func_77655_b("seed_crop_silver").func_77637_a(tab).setRegistryName("seed_crop_silver");
	    seed_crop_cyan = new ItemSeedsMod(BlockMod.block_crop_cyan, Blocks.field_150458_ak).func_77655_b("seed_crop_cyan").func_77637_a(tab).setRegistryName("seed_crop_cyan");
	    seed_crop_purple = new ItemSeedsMod(BlockMod.block_crop_purple, Blocks.field_150458_ak).func_77655_b("seed_crop_purple").func_77637_a(tab).setRegistryName("seed_crop_purple");
	    seed_crop_brown = new ItemSeedsMod(BlockMod.block_crop_brown, Blocks.field_150458_ak).func_77655_b("seed_crop_brown").func_77637_a(tab).setRegistryName("seed_crop_brown");
	    seed_crop_green = new ItemSeedsMod(BlockMod.block_crop_green, Blocks.field_150458_ak).func_77655_b("seed_crop_green").func_77637_a(tab).setRegistryName("seed_crop_green");
	    seed_crop_red = new ItemSeedsMod(BlockMod.block_crop_red, Blocks.field_150458_ak).func_77655_b("seed_crop_red").func_77637_a(tab).setRegistryName("seed_crop_red");
	    seed_crop_black = new ItemSeedsMod(BlockMod.block_crop_black, Blocks.field_150458_ak).func_77655_b("seed_crop_black").func_77637_a(tab).setRegistryName("seed_crop_black");        	       
	    seed_crop_vine = new ItemSeedsMod(BlockMod.block_crop_vine, Blocks.field_150458_ak).func_77655_b("seed_crop_vine").func_77637_a(tab).setRegistryName("seed_crop_vine");
	    seed_crop_lilypad = new ItemSeedsMod(BlockMod.block_crop_lilypad, Blocks.field_150458_ak).func_77655_b("seed_crop_lilypad").func_77637_a(tab).setRegistryName("seed_crop_lilypad");
	    seed_crop_tallgrass = new ItemSeedsMod(BlockMod.block_crop_tallgrass, Blocks.field_150458_ak, "seed_crop_tallgrass");
	    seed_crop_largefern = new ItemSeedsMod(BlockMod.block_crop_largefern, Blocks.field_150458_ak, "seed_crop_largefern");
	    seed_crop_bush = new ItemSeedsMod(BlockMod.block_crop_bush, Blocks.field_150458_ak, "seed_crop_bush");
	    seed_crop_grass1 = new ItemSeedsMod(BlockMod.block_crop_grass1, Blocks.field_150458_ak, "seed_crop_grass1");
	    seed_crop_fern = new ItemSeedsMod(BlockMod.block_crop_fern, Blocks.field_150458_ak, "seed_crop_fern");
	    seed_crop_oak = new ItemSeedsMod(BlockMod.block_crop_oak, Blocks.field_150458_ak, "seed_crop_oak");
	    seed_crop_birch = new ItemSeedsMod(BlockMod.block_crop_birch, Blocks.field_150458_ak, "seed_crop_birch");
	    seed_crop_spruce = new ItemSeedsMod(BlockMod.block_crop_spruce, Blocks.field_150458_ak, "seed_crop_spruce");
	    seed_crop_jungle = new ItemSeedsMod(BlockMod.block_crop_jungle, Blocks.field_150458_ak, "seed_crop_jungle");
	    seed_crop_darkoak = new ItemSeedsMod(BlockMod.block_crop_darkoak, Blocks.field_150458_ak, "seed_crop_darkoak");
	    seed_crop_acacia = new ItemSeedsMod(BlockMod.block_crop_acacia, Blocks.field_150458_ak, "seed_crop_acacia");  
		seed_crop_apple = new ItemSeedsMod(BlockMod.block_crop_apple, Blocks.field_150458_ak, "seed_crop_apple");
		seed_crop_goldenapple = new ItemSeedsMod(BlockMod.block_crop_goldenapple, Blocks.field_150458_ak, "seed_crop_goldenapple");     
		seed_crop_bread = new ItemSeedsMod(BlockMod.block_crop_bread, Blocks.field_150458_ak, "seed_crop_bread");
		seed_crop_egg = new ItemSeedsMod(BlockMod.block_crop_egg, Blocks.field_150458_ak, "seed_crop_egg");
		seed_crop_clownfish = new ItemSeedsMod(BlockMod.block_crop_clownfish, Blocks.field_150458_ak, "seed_crop_clownfish");
		seed_crop_pufferfish = new ItemSeedsMod(BlockMod.block_crop_pufferfish, Blocks.field_150458_ak, "seed_crop_pufferfish");    
		seed_crop_cookie = new ItemSeedsMod(BlockMod.block_crop_cookie, Blocks.field_150458_ak, "seed_crop_cookie"); 
		seed_crop_chorus = new ItemSeedsMod(BlockMod.block_crop_chorus, Blocks.field_150458_ak, "seed_crop_chorus");
		seed_crop_rawporc = new ItemSeedsMod(BlockMod.block_crop_rawporc, Blocks.field_150458_ak, "seed_crop_rawporc");
		seed_crop_rawbeef = new ItemSeedsMod(BlockMod.block_crop_rawbeef, Blocks.field_150458_ak, "seed_crop_rawbeef");
		seed_crop_fish = new ItemSeedsMod(BlockMod.block_crop_fish, Blocks.field_150458_ak, "seed_crop_fish");
		seed_crop_salmon = new ItemSeedsMod(BlockMod.block_crop_salmon, Blocks.field_150458_ak, "seed_crop_salmon");     
		seed_crop_rawchicken = new ItemSeedsMod(BlockMod.block_crop_rawchicken, Blocks.field_150458_ak, "seed_crop_rawchicken");       
		seed_crop_rawrabbit = new ItemSeedsMod(BlockMod.block_crop_rawrabbit, Blocks.field_150458_ak, "seed_crop_rawrabbit");
		seed_crop_rawmutton = new ItemSeedsMod(BlockMod.block_crop_rawmutton, Blocks.field_150458_ak, "seed_crop_rawmutton");  
		seed_crop_death = new ItemSeedsMod(BlockMod.block_crop_death, Blocks.field_150458_ak, "seed_crop_death");  
		seed_crop_totem = new ItemSeedsMod(BlockMod.block_crop_totem, Blocks.field_150458_ak, "seed_crop_totem");  
		   
        fruit_coal = new Coal(0, 0, false).func_77848_i().func_77655_b("fruit_coal").func_77637_a(tab).setRegistryName("fruit_coal");
        fruit_iron = new Iron("fruit_iron", tab);
        fruit_gold = new Gold("fruit_gold", tab);
        fruit_redstone = new Redstone(0, 0, false).func_77848_i().func_77655_b("fruit_redstone").func_77637_a(tab).setRegistryName("fruit_redstone");
        fruit_lapis = new Lapis(0, 0, false).func_77848_i().func_77655_b("fruit_lapis").func_77637_a(tab).setRegistryName("fruit_lapis");
        fruit_diamond = new Diamond("fruit_diamond", tab);
        fruit_emerald = new Emerald(0, 0, false).func_77848_i().func_77655_b("fruit_emerald").func_77637_a(tab).setRegistryName("fruit_emerald");
        fruit_clay = new Clay(0, 0, false).func_77848_i().func_77655_b("fruit_clay").func_77637_a(tab).setRegistryName("fruit_clay");
        fruit_glowstone = new Glowstone(0, 0, false).func_77848_i().func_77655_b("fruit_glowstone").func_77637_a(tab).setRegistryName("fruit_glowstone");
        fruit_quartz = new Quartz("fruit_quartz", tab);
        fruit_shard = new Shard(0, 0, false).func_77848_i().func_77655_b("fruit_shard").func_77637_a(tab).setRegistryName("fruit_shard");
        fruit_cristal = new Cristal(0, 0, false).func_77848_i().func_77655_b("fruit_cristal").func_77637_a(tab).setRegistryName("fruit_cristal");
        fruit_ender = new Ender(0, 0, false).func_77848_i().func_77655_b("fruit_ender").func_77637_a(tab).setRegistryName("fruit_ender");
        fruit_start = new ItemModFood(1, 1, false).func_77848_i().func_77655_b("fruit_start").func_77637_a(tab).setRegistryName("fruit_start");
        fruit_start_monster = new Monster(0, 0, false).func_77848_i().func_77655_b("fruit_start_monster").func_77637_a(tab).setRegistryName("fruit_start_monster");
        fruit_bone = new Bone(0, 0, false).func_77848_i().func_77655_b("fruit_bone").func_77637_a(tab).setRegistryName("fruit_bone");
        fruit_eye = new Eye(0, 0, false).func_77848_i().func_77655_b("fruit_eye").func_77637_a(tab).setRegistryName("fruit_eye");
        fruit_powder = new Powder(0, 0, false).func_77848_i().func_77655_b("fruit_powder").func_77637_a(tab).setRegistryName("fruit_powder");
        fruit_paper = new Paper(0, 0, false).func_77848_i().func_77655_b("fruit_paper").func_77637_a(tab).setRegistryName("fruit_paper");
        fruit_sugar = new Sugar(0, 0, false).func_77848_i().func_77655_b("fruit_sugar").func_77637_a(tab).setRegistryName("fruit_sugar");
        fruit_charcoal = new Charcoal(0, 0, false).func_77848_i().func_77655_b("fruit_charcoal").func_77637_a(tab).setRegistryName("fruit_charcoal");
        fruit_flint = new Flint("fruit_flint", tab);
        fruit_snowball = new Snowball(0, 0, false).func_77848_i().func_77655_b("fruit_snowball").func_77637_a(tab).setRegistryName("fruit_snowball");
        fruit_firework = new Firework(0, 0, false).func_77848_i().func_77655_b("fruit_firework").func_77637_a(tab).setRegistryName("fruit_firework");
        fruit_nether = new Nether(0, 0, false).func_77848_i().func_77655_b("fruit_nether").func_77637_a(tab).setRegistryName("fruit_nether");
        fruit_bottle = new Bottle(0, 0, false).func_77848_i().func_77655_b("fruit_bottle").func_77637_a(tab).setRegistryName("fruit_bottle");
        fruit_start_mob = new ItemModFood(1, 1, false).func_77848_i().func_77655_b("fruit_start_mob").func_77637_a(tab).setRegistryName("fruit_start_mob");
        fruit_foot = new Foot(0, 0, false).func_77848_i().func_77655_b("fruit_foot").func_77637_a(tab).setRegistryName("fruit_foot");
        fruit_hide = new Hide(0, 0, false).func_77848_i().func_77655_b("fruit_hide").func_77637_a(tab).setRegistryName("fruit_hide");
        fruit_leather = new Leather(0, 0, false).func_77848_i().func_77655_b("fruit_leather").func_77637_a(tab).setRegistryName("fruit_leather");
        fruit_feather = new Feather(0, 0, false).func_77848_i().func_77655_b("fruit_feather").func_77637_a(tab).setRegistryName("fruit_feather");		
        fruit_blaze = new FruitFire(0, 0, false).func_77848_i().func_77655_b("fruit_blaze").func_77637_a(tab).setRegistryName("fruit_blaze");
        fruit_ghast = new FruitFire(0, 0, false).func_77848_i().func_77655_b("fruit_ghast").func_77637_a(tab).setRegistryName("fruit_ghast");
        fruit_magma = new FruitFire(0, 0, false).func_77848_i().func_77655_b("fruit_magma").func_77637_a(tab).setRegistryName("fruit_magma");
        fruit_shell = new FruitNoGravity(0, 0, false).func_77848_i().func_77655_b("fruit_shell").func_77637_a(tab).setRegistryName("fruit_shell");
        fruit_slime = new Slime(0, 0, false).func_77848_i().func_77655_b("fruit_slime").func_77637_a(tab).setRegistryName("fruit_slime");
        fruit_star = new Star(0, 0, false).func_77848_i().func_77655_b("fruit_star").func_77637_a(tab).setRegistryName("fruit_star");
        fruit_string = new Sring(0, 0, false).func_77848_i().func_77655_b("fruit_string").func_77637_a(tab).setRegistryName("fruit_string");
        fruit_zombie = new Monster(0, 0, false).func_77848_i().func_77655_b("fruit_zombie").func_77637_a(tab).setRegistryName("fruit_zombie");
        fruit_orange = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_orange").func_77637_a(tab).setRegistryName("fruit_orange");
        fruit_magenta = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_magenta").func_77637_a(tab).setRegistryName("fruit_magenta");
        fruit_lightblue = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_lightblue").func_77637_a(tab).setRegistryName("fruit_lightblue");
        fruit_yellow = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_yellow").func_77637_a(tab).setRegistryName("fruit_yellow");
        fruit_lime = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_lime").func_77637_a(tab).setRegistryName("fruit_lime");
        fruit_pink = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_pink").func_77637_a(tab).setRegistryName("fruit_pink");
        fruit_gray = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_gray").func_77637_a(tab).setRegistryName("fruit_gray");
        fruit_silver = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_silver").func_77637_a(tab).setRegistryName("fruit_silver");
        fruit_cyan = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_cyan").func_77637_a(tab).setRegistryName("fruit_cyan");
        fruit_purple = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_purple").func_77637_a(tab).setRegistryName("fruit_purple");
        fruit_brown = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_brown").func_77637_a(tab).setRegistryName("fruit_brown");
        fruit_green = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_green").func_77637_a(tab).setRegistryName("fruit_green");
        fruit_red = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_red").func_77637_a(tab).setRegistryName("fruit_red");
        fruit_black = new Colored(0, 0, false).func_77848_i().func_77655_b("fruit_black").func_77637_a(tab).setRegistryName("fruit_black");               
        fruit_start_natural = new ItemModFood(1, 1, false).func_77848_i().func_77655_b("fruit_start_natural").func_77637_a(tab).setRegistryName("fruit_start_natural");
        fruit_vine = new FruitNoGravity(0, 0, false).func_77848_i().func_77655_b("fruit_vine").func_77637_a(tab).setRegistryName("fruit_vine");
	    fruit_lilypad = new Lilypad(0, 0, false).func_77848_i().func_77655_b("fruit_lilypad").func_77637_a(tab).setRegistryName("fruit_lilypad");
	    fruit_tallgrass = new NaturalTall(0, 0, false).func_77848_i().func_77655_b("fruit_tallgrass").func_77637_a(tab).setRegistryName("fruit_tallgrass");
	    fruit_largefern = new NaturalTall(0, 0, false).func_77848_i().func_77655_b("fruit_largefern").func_77637_a(tab).setRegistryName("fruit_largefern");
	    fruit_bush = new Natural(0, 0, false).func_77848_i().func_77655_b("fruit_bush").func_77637_a(tab).setRegistryName("fruit_bush");
	    fruit_grass1 = new Natural(0, 0, false).func_77848_i().func_77655_b("fruit_grass1").func_77637_a(tab).setRegistryName("fruit_grass1");
	    fruit_fern = new Natural(0, 0, false).func_77848_i().func_77655_b("fruit_fern").func_77637_a(tab).setRegistryName("fruit_fern");
	    fruit_oak = new FruitTree(0, 0, false).func_77848_i().func_77655_b("fruit_oak").func_77637_a(tab).setRegistryName("fruit_oak");
	    fruit_birch = new FruitTree(0, 0, false).func_77848_i().func_77655_b("fruit_birch").func_77637_a(tab).setRegistryName("fruit_birch");
	    fruit_spruce = new FruitTree(0, 0, false).func_77848_i().func_77655_b("fruit_spruce").func_77637_a(tab).setRegistryName("fruit_spruce");
	    fruit_jungle = new FruitTree(0, 0, false).func_77848_i().func_77655_b("fruit_jungle").func_77637_a(tab).setRegistryName("fruit_jungle");
	    fruit_darkoak = new FruitTree(0, 0, false).func_77848_i().func_77655_b("fruit_darkoak").func_77637_a(tab).setRegistryName("fruit_darkoak");
	    fruit_acacia = new FruitTree(0, 0, false).func_77848_i().func_77655_b("fruit_acacia").func_77637_a(tab).setRegistryName("fruit_acacia");        
        fruit_apple = new FruitFood(1, 1, false).func_77848_i().func_77655_b("fruit_apple").func_77637_a(tab).setRegistryName("fruit_apple");
	    fruit_goldenapple = new Gapple(1, 1, false).func_77848_i().func_77655_b("fruit_gapple").func_77637_a(tab).setRegistryName("fruit_gapple");
	    fruit_bread = new FruitFood(1, 1, false).func_77848_i().func_77655_b("fruit_bread").func_77637_a(tab).setRegistryName("fruit_bread");
	    fruit_egg = new FruitFood(1, 1, false).func_77848_i().func_77655_b("fruit_egg").func_77637_a(tab).setRegistryName("fruit_egg");
	    fruit_clownfish = new FishFruit(1, 1, false).func_77848_i().func_77655_b("fruit_clownfish").func_77637_a(tab).setRegistryName("fruit_clownfish");
	    fruit_pufferfish = new FishFruit(1, 1, false).func_77848_i().func_77655_b("fruit_pufferfish").func_77637_a(tab).setRegistryName("fruit_pufferfish");
	    fruit_cookie = new FruitFood(1, 1, false).func_77848_i().func_77655_b("fruit_cookie").func_77637_a(tab).setRegistryName("fruit_cookie");
	    fruit_chorus = new FruitNoGravity(1, 1, false).func_77848_i().func_77655_b("fruit_chorus").func_77637_a(tab).setRegistryName("fruit_chorus");
	    fruit_rawporc = new RawFruit(1, 1, true).func_77848_i().func_77655_b("fruit_rawporc").func_77637_a(tab).setRegistryName("fruit_rawporc");
	    fruit_rawbeef = new RawFruit(1, 1, true).func_77848_i().func_77655_b("fruit_rawbeef").func_77637_a(tab).setRegistryName("fruit_rawbeef");
	    fruit_fish = new FishFruit(1, 1, false).func_77848_i().func_77655_b("fruit_fish").func_77637_a(tab).setRegistryName("fruit_fish");
	    fruit_salmon = new FishFruit(1, 1, false).func_77848_i().func_77655_b("fruit_salmon").func_77637_a(tab).setRegistryName("fruit_salmon");
	    fruit_rawchicken = new RawFruit(1, 1, true).func_77848_i().func_77655_b("fruit_rawchicken").func_77637_a(tab).setRegistryName("fruit_rawchicken");        
	    fruit_rawrabbit = new RawRabbit(1, 1, true).func_77848_i().func_77655_b("fruit_rawrabbit").func_77637_a(tab).setRegistryName("fruit_rawrabbit");
	    fruit_rawmutton = new RawFruit(1, 1, true).func_77848_i().func_77655_b("fruit_rawmutton").func_77637_a(tab).setRegistryName("fruit_rawmutton");        	   
	    fruit_death = new DeathFruit(1, 1, false).func_77848_i().func_77655_b("fruit_death").func_77637_a(tab).setRegistryName("fruit_death");        	   
	    fruit_totem = new ItemFood(1, 1, false).func_77848_i().func_77655_b("fruit_totem").func_77637_a(tab).setRegistryName("fruit_totem");        	   
		    
	    powder_cobble = new Item().func_77655_b("powder_cobble").setRegistryName("powder_cobble").func_77637_a(tab);
        powder_sand = new Item().func_77655_b("powder_sand").setRegistryName("powder_sand").func_77637_a(tab);
        powder_grass = new Item().func_77655_b("powder_grass").setRegistryName("powder_grass").func_77637_a(tab);
        powder_oak = new Item().func_77655_b("powder_oak").setRegistryName("powder_oak").func_77637_a(tab);
        powder_spruce = new Item().func_77655_b("powder_spruce").setRegistryName("powder_spruce").func_77637_a(tab);
        powder_birch = new Item().func_77655_b("powder_birch").setRegistryName("powder_birch").func_77637_a(tab);
        powder_jungle = new Item().func_77655_b("powder_jungle").setRegistryName("powder_jungle").func_77637_a(tab);
        powder_darkoak = new Item().func_77655_b("powder_darkoak").setRegistryName("powder_darkoak").func_77637_a(tab);
        powder_acacia = new Item().func_77655_b("powder_acacia").setRegistryName("powder_acacia").func_77637_a(tab);
	    
		seed_stem_coal =  new ItemSeedsMod(BlockMod.stem_coal, Blocks.field_150458_ak).func_77655_b("seed_stem_coal").func_77637_a(tab).setRegistryName("seed_stem_coal");
		seed_stem_iron =  new ItemSeedsMod(BlockMod.stem_iron, Blocks.field_150458_ak)
				.func_77655_b("seed_stem_iron").func_77637_a(tab).setRegistryName("seed_stem_iron");
		seed_stem_gold =  new ItemSeedsMod(BlockMod.stem_gold, Blocks.field_150458_ak)
				.func_77655_b("seed_stem_gold").func_77637_a(tab).setRegistryName("seed_stem_gold");
		seed_stem_redstone =  new ItemSeedsMod(BlockMod.stem_redstone, Blocks.field_150458_ak)
				.func_77655_b("seed_stem_redstone").func_77637_a(tab).setRegistryName("seed_stem_redstone");
		seed_stem_lapis =  new ItemSeedsMod(BlockMod.stem_lapis, Blocks.field_150458_ak)
				.func_77655_b("seed_stem_lapis").func_77637_a(tab).setRegistryName("seed_stem_lapis");
		seed_stem_diamond =  new ItemSeedsMod(BlockMod.stem_diamond, Blocks.field_150458_ak)
				.func_77655_b("seed_stem_diamond").func_77637_a(tab).setRegistryName("seed_stem_diamond");
		seed_stem_emerald =  new ItemSeedsMod(BlockMod.stem_emerald, Blocks.field_150458_ak)
				.func_77655_b("seed_stem_emerald").func_77637_a(tab).setRegistryName("seed_stem_emerald");
		seed_stem_clay =  new ItemSeedsMod(BlockMod.stem_clay, Blocks.field_150458_ak)
				.func_77655_b("seed_stem_clay").func_77637_a(tab).setRegistryName("seed_stem_clay");
		seed_stem_glowstone =  new ItemSeedsMod(BlockMod.stem_glowstone, Blocks.field_150458_ak)
				.func_77655_b("seed_stem_glowstone").func_77637_a(tab).setRegistryName("seed_stem_glowstone");
		seed_stem_quartz =  new ItemSeedsMod(BlockMod.stem_quartz, Blocks.field_150458_ak)
				.func_77655_b("seed_stem_quartz").func_77637_a(tab).setRegistryName("seed_stem_quartz");
		seed_stem_shard =  new ItemSeedsMod(BlockMod.stem_shard, Blocks.field_150458_ak)
				.func_77655_b("seed_stem_shard").func_77637_a(tab).setRegistryName("seed_stem_shard");
		seed_stem_cristal =  new ItemSeedsMod(BlockMod.stem_cristal, Blocks.field_150458_ak).func_77655_b("seed_stem_cristal").func_77637_a(tab).setRegistryName("seed_stem_cristal");
		
		seed_stem_obsidian = new ItemSeedsMod(BlockMod.stem_obsidian, Blocks.field_150458_ak, "seed_stem_obsidian");
        seed_stem_bone = new ItemSeedsMod(BlockMod.stem_bone, Blocks.field_150458_ak, "seed_stem_bone");
        seed_stem_snow = new ItemSeedsMod(BlockMod.stem_snow, Blocks.field_150458_ak, "seed_stem_snow");
        seed_stem_nether = new ItemSeedsMod(BlockMod.stem_nether, Blocks.field_150458_ak, "seed_stem_nether");
        seed_stem_glass = new ItemSeedsMod(BlockMod.stem_glass, Blocks.field_150458_ak, "seed_stem_glass");
        seed_stem_magma = new ItemSeedsMod(BlockMod.stem_magma, Blocks.field_150458_ak, "seed_stem_magma");
        seed_stem_shell = new ItemSeedsMod(BlockMod.stem_shell, Blocks.field_150458_ak, "seed_stem_shell");
		
		
		elemental_seed =  new ItemSeedsMod(BlockMod.elemental_crop, Blocks.field_150458_ak)
				.func_77655_b("elemental_seed").func_77637_a(tab).setRegistryName("elemental_seed");
		elemental_fragment =  new Item().func_77655_b("elemental_fragment").func_77637_a(tab)
				.setRegistryName("elemental_fragment");
		elemental_water =  new Item().func_77655_b("elemental_water").func_77637_a(tab)
				.setRegistryName("elemental_water");
		elemental_fire =  new Item().func_77655_b("elemental_fire").func_77637_a(tab)
				.setRegistryName("elemental_fire");
		elemental_air =  new Item().func_77655_b("elemental_air").func_77637_a(tab)
				.setRegistryName("elemental_air");
		elemental_earth =  new Item().func_77655_b("elemental_earth").func_77637_a(tab)
				.setRegistryName("elemental_earth");
		elemental_seed_stem =  new ItemSeedsMod(BlockMod.stem_elemental, Blocks.field_150458_ak)
				.func_77655_b("elemental_seed_stem").func_77637_a(tab).setRegistryName("elemental_seed_stem");
		
		element_eternity = new Item().func_77655_b("element_eternity").setRegistryName("element_eternity").func_77637_a(tab);
		eternal_fire = new ItemEternalFire("eternal_fire");
		eternal_water = new ItemEternalWater("eternal_water");
		eternal_earth = new ItemEternalEarth("eternal_earth");
		eternal_air = new ItemEternalAir("eternal_air");

		eternal_time = new ItemEternalTime("eternal_time");
		
    	seed_crop_aluminium = new ItemSeedsModCompat(BlockMod.block_crop_aluminium, Blocks.field_150458_ak, "seed_crop_aluminium");  
		seed_crop_brass = new ItemSeedsModCompat(BlockMod.block_crop_brass, Blocks.field_150458_ak, "seed_crop_brass");  
	    seed_crop_bronze = new ItemSeedsModCompat(BlockMod.block_crop_bronze, Blocks.field_150458_ak, "seed_crop_bronze");  
	    seed_crop_chrome = new ItemSeedsModCompat(BlockMod.block_crop_chrome, Blocks.field_150458_ak, "seed_crop_chrome");  
	    seed_crop_copper = new ItemSeedsModCompat(BlockMod.block_crop_copper, Blocks.field_150458_ak, "seed_crop_copper");  
	    seed_crop_electrum = new ItemSeedsModCompat(BlockMod.block_crop_electrum, Blocks.field_150458_ak, "seed_crop_electrum");  
    	seed_crop_invar = new ItemSeedsModCompat(BlockMod.block_crop_invar, Blocks.field_150458_ak, "seed_crop_invar");  
   	    seed_crop_iridium = new ItemSeedsModCompat(BlockMod.block_crop_iridium, Blocks.field_150458_ak, "seed_crop_iridium");  
		seed_crop_lead = new ItemSeedsModCompat(BlockMod.block_crop_lead, Blocks.field_150458_ak, "seed_crop_lead");  
	    seed_crop_nickel = new ItemSeedsModCompat(BlockMod.block_crop_nickel, Blocks.field_150458_ak, "seed_crop_nickel");  
		seed_crop_platinium = new ItemSeedsModCompat(BlockMod.block_crop_platinium, Blocks.field_150458_ak, "seed_crop_platinium");  
		seed_crop_silveringot = new ItemSeedsModCompat(BlockMod.block_crop_silveringot, Blocks.field_150458_ak, "seed_crop_silveringot");  
		seed_crop_steel = new ItemSeedsModCompat(BlockMod.block_crop_steel, Blocks.field_150458_ak, "seed_crop_steel");  
		seed_crop_tin = new ItemSeedsModCompat(BlockMod.block_crop_tin, Blocks.field_150458_ak, "seed_crop_tin");  
		seed_crop_titanium = new ItemSeedsModCompat(BlockMod.block_crop_titanium, Blocks.field_150458_ak, "seed_crop_titanium");  
		seed_crop_tungsten = new ItemSeedsModCompat(BlockMod.block_crop_tungsten, Blocks.field_150458_ak, "seed_crop_tungsten");  
		seed_crop_zinc = new ItemSeedsModCompat(BlockMod.block_crop_zinc, Blocks.field_150458_ak, "seed_crop_zinc");  
	    seed_crop_manasteel = new ItemSeedsModCompat(BlockMod.botania_crop_manasteel, Blocks.field_150458_ak, "seed_crop_manasteel");
	    seed_crop_terrasteel = new ItemSeedsModCompat(BlockMod.botania_crop_terrasteel, Blocks.field_150458_ak, "seed_crop_terrasteel");
	    seed_crop_manadiamond = new ItemSeedsModCompat(BlockMod.botania_crop_manadiamond, Blocks.field_150458_ak, "seed_crop_manadiamond");
	    seed_crop_manapearl = new ItemSeedsModCompat(BlockMod.botania_crop_manapearl, Blocks.field_150458_ak, "seed_crop_manapearl");
	    seed_crop_elementium = new ItemSeedsModCompat(BlockMod.botania_crop_elementium, Blocks.field_150458_ak, "seed_crop_elementium");
	    seed_crop_dragonstone = new ItemSeedsModCompat(BlockMod.botania_crop_dragonstone, Blocks.field_150458_ak, "seed_crop_dragonstone");
		seed_crop_gearwood = new ItemSeedsModCompat(BlockMod.block_crop_gearwood, Blocks.field_150458_ak, "seed_crop_gearwood");
	    seed_crop_gearstone = new ItemSeedsModCompat(BlockMod.block_crop_gearstone, Blocks.field_150458_ak, "seed_crop_gearstone");
        seed_crop_geariron = new ItemSeedsModCompat(BlockMod.block_crop_geariron, Blocks.field_150458_ak, "seed_crop_geariron");
        seed_crop_geargold = new ItemSeedsModCompat(BlockMod.block_crop_geargold, Blocks.field_150458_ak, "seed_crop_geargold");
        seed_crop_geardiamond = new ItemSeedsModCompat(BlockMod.block_crop_geardiamond, Blocks.field_150458_ak, "seed_crop_geardiamond");  
    	seed_crop_yellorium = new ItemSeedsModCompat(BlockMod.block_crop_yellorium, Blocks.field_150458_ak, "seed_crop_yellorium");
    	seed_crop_blutonium = new ItemSeedsModCompat(BlockMod.block_crop_blutonium, Blocks.field_150458_ak, "seed_crop_blutonium");
    	seed_crop_cyanite = new ItemSeedsModCompat(BlockMod.block_crop_cyanite, Blocks.field_150458_ak, "seed_crop_cyanite");
    	seed_crop_graphite = new ItemSeedsModCompat(BlockMod.block_crop_graphite, Blocks.field_150458_ak, "seed_crop_graphite");
    	seed_crop_ludicrite = new ItemSeedsModCompat(BlockMod.block_crop_ludicrite, Blocks.field_150458_ak, "seed_crop_ludicrite");   	
    	seed_crop_enderium = new ItemSeedsModCompat(BlockMod.block_crop_enderium, Blocks.field_150458_ak, "seed_crop_enderium");
    	seed_crop_lumium = new ItemSeedsModCompat(BlockMod.block_crop_lumium, Blocks.field_150458_ak, "seed_crop_lumium");
    	seed_crop_signalum = new ItemSeedsModCompat(BlockMod.block_crop_signalum, Blocks.field_150458_ak, "seed_crop_signalum");
    	seed_crop_constantan = new ItemSeedsModCompat(BlockMod.block_crop_constantan, Blocks.field_150458_ak, "seed_crop_constantan");
    	seed_crop_mithril = new ItemSeedsModCompat(BlockMod.block_crop_mithril, Blocks.field_150458_ak, "seed_crop_mithril");
    	seed_crop_uranium = new ItemSeedsModCompat(BlockMod.block_crop_uranium, Blocks.field_150458_ak, "seed_crop_uranium");
    	seed_crop_apatite = new ItemSeedsModCompat(BlockMod.block_crop_apatite, Blocks.field_150458_ak, "seed_crop_apatite");
    	seed_crop_silicon = new ItemSeedsModCompat(BlockMod.block_crop_silicon, Blocks.field_150458_ak, "seed_crop_silicon");
    	seed_crop_draconium = new ItemSeedsModCompat(BlockMod.block_crop_draconium, Blocks.field_150458_ak, "seed_crop_draconium");
    	seed_crop_draconium_awakened = new ItemSeedsModCompat(BlockMod.block_crop_draconium_awakened, Blocks.field_150458_ak, "seed_crop_draconium_awakened");

    	seed_crop_certus_quartz = new ItemSeedsModCompat(BlockMod.block_crop_certus_quartz, Blocks.field_150458_ak, "seed_crop_certus_quartz");
    	seed_crop_crystal_flux = new ItemSeedsModCompat(BlockMod.block_crop_crystal_flux, Blocks.field_150458_ak, "seed_crop_crystal_flux");
    	seed_crop_pure_fluix = new ItemSeedsModCompat(BlockMod.block_crop_pure_fluix, Blocks.field_150458_ak, "seed_crop_pure_fluix");
    	
        fruit_aluminium = new Iron("fruit_aluminium", CreativeTabsCompat.MOD_COMPAT);
	    fruit_brass = new Iron("fruit_brass", CreativeTabsCompat.MOD_COMPAT);
	    fruit_bronze = new Iron("fruit_bronze", CreativeTabsCompat.MOD_COMPAT);
	    fruit_chrome = new Iron("fruit_chrome", CreativeTabsCompat.MOD_COMPAT);
	    fruit_copper = new Iron("fruit_copper", CreativeTabsCompat.MOD_COMPAT);
	    fruit_electrum = new Iron("fruit_electrum", CreativeTabsCompat.MOD_COMPAT);
	    fruit_invar = new Iron("fruit_invar", CreativeTabsCompat.MOD_COMPAT);
	    fruit_iridium = new Iron("fruit_iridium", CreativeTabsCompat.MOD_COMPAT);
	    fruit_lead = new Iron("fruit_lead", CreativeTabsCompat.MOD_COMPAT);
	    fruit_nickel = new Iron("fruit_nickel", CreativeTabsCompat.MOD_COMPAT);
	    fruit_platinium = new Iron("fruit_platinium", CreativeTabsCompat.MOD_COMPAT);
	    fruit_silveringot = new Iron("fruit_silveringot", CreativeTabsCompat.MOD_COMPAT);
	    fruit_steel = new Iron("fruit_steel", CreativeTabsCompat.MOD_COMPAT);
	    fruit_tin = new Iron("fruit_tin", CreativeTabsCompat.MOD_COMPAT);
	    fruit_titanium = new Iron("fruit_titanium", CreativeTabsCompat.MOD_COMPAT);
	    fruit_tungsten = new Iron("fruit_tungsten", CreativeTabsCompat.MOD_COMPAT);
	    fruit_zinc = new Iron("fruit_zinc", CreativeTabsCompat.MOD_COMPAT);
	    fruit_manasteel = new IronMana("fruit_manasteel", CreativeTabsCompat.MOD_COMPAT);
	    fruit_terrasteel = new IronMana("fruit_terrasteel", CreativeTabsCompat.MOD_COMPAT);
	    fruit_manadiamond = new IronMana("fruit_manadiamond", CreativeTabsCompat.MOD_COMPAT);
	    fruit_manapearl = new IronMana("fruit_manapearl", CreativeTabsCompat.MOD_COMPAT);
	    fruit_elementium = new IronMana("fruit_elementium", CreativeTabsCompat.MOD_COMPAT);
	    fruit_dragonstone = new IronMana("fruit_dragonstone", CreativeTabsCompat.MOD_COMPAT);
	    fruit_gearwood = new Flint("fruit_gearwood", CreativeTabsCompat.MOD_COMPAT);
	    fruit_gearstone = new Flint("fruit_gearstone", CreativeTabsCompat.MOD_COMPAT);
	    fruit_geariron = new Iron("fruit_geariron", CreativeTabsCompat.MOD_COMPAT);
	    fruit_geargold = new Gold("fruit_geargold", CreativeTabsCompat.MOD_COMPAT);
	    fruit_geardiamond = new Diamond("fruit_geardiamond", CreativeTabsCompat.MOD_COMPAT);
		fruit_yellorium = new Iron("fruit_yellorium", CreativeTabsCompat.MOD_COMPAT);
		fruit_blutonium = new Iron("fruit_blutonium", CreativeTabsCompat.MOD_COMPAT);
		fruit_cyanite = new Iron("fruit_cyanite", CreativeTabsCompat.MOD_COMPAT);
		fruit_graphite = new Iron("fruit_graphite", CreativeTabsCompat.MOD_COMPAT);
		fruit_ludicrite = new Iron("fruit_ludicrite", CreativeTabsCompat.MOD_COMPAT);
		fruit_enderium = new Iron("fruit_enderium", CreativeTabsCompat.MOD_COMPAT);
		fruit_lumium = new Iron("fruit_lumium", CreativeTabsCompat.MOD_COMPAT);
		fruit_signalum = new Iron("fruit_signalum", CreativeTabsCompat.MOD_COMPAT);
		fruit_constantan = new Iron("fruit_constantan", CreativeTabsCompat.MOD_COMPAT);
		fruit_mithril = new Iron("fruit_mithril", CreativeTabsCompat.MOD_COMPAT);
		fruit_uranium = new Iron("fruit_uranium", CreativeTabsCompat.MOD_COMPAT);
		fruit_apatite = new Iron("fruit_apatite", CreativeTabsCompat.MOD_COMPAT);
		fruit_silicon = new Iron("fruit_silicon", CreativeTabsCompat.MOD_COMPAT);
		fruit_draconium = new Iron("fruit_draconium", CreativeTabsCompat.MOD_COMPAT);
		fruit_draconium_awakened = new Iron("fruit_draconium_awakened", CreativeTabsCompat.MOD_COMPAT);
		fruit_certus_quartz = new Quartz("fruit_certus_quartz", CreativeTabsCompat.MOD_COMPAT);
		fruit_crystal_flux = new Quartz("fruit_crystal_flux", CreativeTabsCompat.MOD_COMPAT);
		fruit_pure_fluix = new Quartz("fruit_pure_fluix", CreativeTabsCompat.MOD_COMPAT);
		
    	copper_ingot = new Item().setRegistryName("copper_ingot").func_77655_b("copper_ingot");
        aluminium_ingot = new Item().setRegistryName("aluminium_ingot").func_77655_b("aluminium_ingot");
        brass_ingot = new Item().setRegistryName("brass_ingot").func_77655_b("brass_ingot");
        bronze_ingot = new Item().setRegistryName("bronze_ingot").func_77655_b("bronze_ingot");
        chrome_ingot = new Item().setRegistryName("chrome_ingot").func_77655_b("chrome_ingot");
        electrum_ingot = new Item().setRegistryName("electrum_ingot").func_77655_b("electrum_ingot");
        invar_ingot = new Item().setRegistryName("invar_ingot").func_77655_b("invar_ingot");
        iridium_ingot = new Item().setRegistryName("iridium_ingot").func_77655_b("iridium_ingot");
    	lead_ingot = new Item().setRegistryName("lead_ingot").func_77655_b("lead_ingot");
    	nickel_ingot = new Item().setRegistryName("nickel_ingot").func_77655_b("nickel_ingot");
    	platinium_ingot = new Item().setRegistryName("platinium_ingot").func_77655_b("platinium_ingot");
    	silver_ingot = new Item().setRegistryName("silveringot_ingot").func_77655_b("silveringot_ingot");	
    	steel_ingot = new Item().setRegistryName("steel_ingot").func_77655_b("steel_ingot");
    	tin_ingot = new Item().setRegistryName("tin_ingot").func_77655_b("tin_ingot");
    	titanium_ingot = new Item().setRegistryName("titanium_ingot").func_77655_b("titanium_ingot");
    	tungsten_ingot = new Item().setRegistryName("tungsten_ingot").func_77655_b("tungsten_ingot");
    	zinc_ingot = new Item().setRegistryName("zinc_ingot").func_77655_b("zinc_ingot");	
    	ingot_elementium = new Item().setRegistryName("ingot_elementium").func_77655_b("ingot_elementium");
    	ingot_terrasteel = new Item().setRegistryName("ingot_terrasteel").func_77655_b("ingot_terrasteel");
    	mana_diamond = new Item().setRegistryName("mana_diamond").func_77655_b("mana_diamond");
    	mana_pearl = new Item().setRegistryName("mana_pearl").func_77655_b("mana_pearl");
    	ingot_manasteel = new Item().setRegistryName("ingot_manasteel").func_77655_b("ingot_manasteel");
    	dragonstone = new Item().setRegistryName("dragonstone").func_77655_b("dragonstone");	
    	gearwood = new Item().setRegistryName("gearwood").func_77655_b("gearwood");
    	gearstone = new Item().setRegistryName("gearstone").func_77655_b("gearstone");
    	geariron = new Item().setRegistryName("geariron").func_77655_b("geariron");
    	geargold = new Item().setRegistryName("geargold").func_77655_b("geargold");
    	geardiamond = new Item().setRegistryName("geardiamond").func_77655_b("geardiamond");	
    	ingot_yellorium = new Item().setRegistryName("ingot_yellorium").func_77655_b("ingot_yellorium");
    	ingot_blutonium = new Item().setRegistryName("ingot_blutonium").func_77655_b("ingot_blutonium");
    	ingot_cyanite = new Item().setRegistryName("ingot_cyanite").func_77655_b("ingot_cyanite");
    	ingot_graphite = new Item().setRegistryName("ingot_graphite").func_77655_b("ingot_graphite");
    	ingot_ludicrite = new Item().setRegistryName("ingot_ludicrite").func_77655_b("ingot_ludicrite");   	
    	ingot_enderium = new Item().setRegistryName("ingot_enderium").func_77655_b("ingot_enderium");
    	ingot_lumium = new Item().setRegistryName("ingot_lumium").func_77655_b("ingot_lumium");
    	ingot_signalum = new Item().setRegistryName("ingot_signalum").func_77655_b("ingot_signalum");
    	ingot_constantan = new Item().setRegistryName("ingot_constantan").func_77655_b("ingot_constantan");
    	ingot_mithril = new Item().setRegistryName("ingot_mithril").func_77655_b("ingot_mithril");
    	ingot_uranium = new Item().setRegistryName("ingot_uranium").func_77655_b("ingot_uranium");
    	gem_apatite = new Item().setRegistryName("gem_apatite").func_77655_b("gem_apatite");
    	silicon = new Item().setRegistryName("silicon").func_77655_b("silicon");
    	ingot_draconium = new Item().setRegistryName("ingot_draconium").func_77655_b("ingot_draconium");
    	ingot_draconium_awakened = new Item().setRegistryName("ingot_draconium_awakened").func_77655_b("ingot_draconium_awakened");
    	certus_quartz = new Item().setRegistryName("certus_quartz").func_77655_b("certus_quartz");
    	crystal_flux = new Item().setRegistryName("crystal_flux").func_77655_b("crystal_flux");
    	pure_fluix = new Item().setRegistryName("pure_fluix").func_77655_b("pure_fluix");
		
    }

    public static void register()
    {
    	add(cheese);
        add(raclette);
        add(cherry);
        add(lemon);
        add(apricot);
        add(kiwi);
        add(orange);
        add(pear);
        add(banana);

        
        
        add(cherry_pie);
        add(lemon_pie);
        add(apricot_pie);
        add(kiwi_pie);
        add(orange_pie);
        add(pear_pie);
        add(banana_pie);
        
        add(chicken_leg);       
        add(roast_beef);
        add(roast_porc);
        add(horse_meat);
        add(squid_meat);
        
        add(cooked_chicken_leg);       
        add(cooked_roast_beef);
        add(cooked_roast_porc);
        add(cooked_horse_meat);
        add(cooked_squid_meat);
        
        add(flour);


        add(obsidian_axe);
        add(obsidian_pickaxe);
        add(obsidian_shovel);
        add(obsidian_hoe);
        add(obsidian_sword);
        add(obsidian_multitool);
        
        add(renforced_axe);
        add(renforced_pickaxe);
        add(renforced_shovel);
        add(renforced_hoe);
        add(renforced_sword);
        add(renforced_multitool);
        
        add(fire_axe);
        add(fire_pickaxe);
        add(fire_shovel);
        add(fire_hoe);
        add(fire_sword);
        add(fire_multitool);

        add(water_axe);
        add(water_pickaxe);
        add(water_shovel);
        add(water_hoe);
        add(water_sword);
        add(water_multitool);

        add(air_axe);
        add(air_pickaxe);
        add(air_shovel);
        add(air_hoe);
        add(air_sword);
        add(air_multitool);

        add(earth_axe);
        add(earth_pickaxe);
        add(earth_shovel);
        add(earth_hoe);
        add(earth_sword);
        add(earth_multitool);
        
        add(wood_multitool);
        add(stone_multitool);
        add(iron_multitool);
        add(gold_multitool);
        add(diamond_multitool);
        
        add(wood_pestle);
        add(stone_pestle);
        add(iron_pestle);
        add(gold_pestle);
        add(diamond_pestle);
        add(obsidian_pestle);
        add(renforced_pestle);
        add(elemental_pestle);
        
        add(water_can);
        
        add(horn_plenty);
        add(midas_hand);
       // add(golden_egg);
        add(infinite_apple);
        add(scythe);

        add(obsidian_helmet);
        add(obsidian_chestplate);
        add(obsidian_leggings);
        add(obsidian_boots);

        add(renforced_helmet);
        add(renforced_chestplate);
        add(renforced_leggings);
        add(renforced_boots);

        add(elemental_water_helmet);
        add(elemental_water_chestplate);
        add(elemental_water_leggings);
        add(elemental_water_boots);

        add(elemental_air_helmet);
        add(elemental_air_chestplate);
        add(elemental_air_leggings);
        add(elemental_air_boots);

        add(elemental_earth_helmet);
        add(elemental_earth_chestplate);
        add(elemental_earth_leggings);
        add(elemental_earth_boots);

        add(elemental_fire_helmet);
        add(elemental_fire_chestplate);
        add(elemental_fire_leggings);
        add(elemental_fire_boots);
 
    	add(seed_crop_coal);
    	add(fruit_coal);
    	add(seed_crop_iron);
    	add(fruit_iron);
    	add(seed_crop_gold);
    	add(fruit_gold);
    	add(seed_crop_redstone);
    	add(fruit_redstone);
    	add(seed_crop_lapis);
    	add(fruit_lapis);	
    	add(seed_crop_diamond);
    	add(fruit_diamond);	
    	add(seed_crop_emerald);
    	add(fruit_emerald);
		
        if(ConfigInit.clay == true)
		{
        	add(seed_crop_clay);
        	add(fruit_clay);
		}
        if(ConfigInit.glowstone == true)
		{
        	add(seed_crop_glowstone);
        	add(fruit_glowstone);
		}
        if(ConfigInit.quartz == true)
		{
        	add(seed_crop_quartz);
        	add(fruit_quartz);
		}
        if(ConfigInit.shard == true)
		{
        	add(seed_crop_shard);
        	add(fruit_shard);
		}
        if(ConfigInit.cristal == true)
		{
        	add(seed_crop_cristal);
        	add(fruit_cristal);
		}
        if(ConfigInit.ender == true)
		{
        	add(seed_crop_ender);
        	add(fruit_ender);
		}
        if(ConfigInit.bone == true)
		{
        	add(seed_crop_bone);
        	add(fruit_bone);
		}
        if(ConfigInit.eye == true)
		{
        	add(seed_crop_eye);
        	add(fruit_eye);
		}
        if(ConfigInit.powder == true)
		{
        	add(seed_crop_powder);
        	add(fruit_powder);
		}
        if(ConfigInit.paper == true)
		{
        	add(seed_crop_paper);
        	add(fruit_paper);
		}
        if(ConfigInit.sugar == true)
		{
        	add(seed_crop_sugar);
        	add(fruit_sugar);
		}
        if(ConfigInit.charcoal == true)
		{
        	add(seed_crop_charcoal);
        	add(fruit_charcoal);
		}
        if(ConfigInit.flint == true)
		{
        	add(seed_crop_flint);
        	add(fruit_flint);
		}
        if(ConfigInit.snowball == true)
		{
        	add(seed_crop_snowball);
        	add(fruit_snowball);
		}
        if(ConfigInit.firework == true)
		{
        	add(seed_crop_firework);
        	add(fruit_firework);
		}
        if(ConfigInit.nether == true)
		{
        	add(seed_crop_nether);
        	add(fruit_nether);
		}
        if(ConfigInit.bottle == true)
		{
        	add(seed_crop_bottle);
        	add(fruit_bottle);
		}
        if(ConfigInit.foot == true)
		{
        	add(seed_crop_foot);
        	add(fruit_foot);
		}
        if(ConfigInit.hide == true)
		{
        	add(seed_crop_hide);
        	add(fruit_hide);
		}
        if(ConfigInit.leather == true)
		{
        	add(seed_crop_leather);
        	add(fruit_leather);
		}
        if(ConfigInit.feather == true)
		{
        	add(seed_crop_feather);
        	add(fruit_feather);
		}
        if(ConfigInit.blaze == true)
		{
        	add(seed_crop_blaze);
        	add(fruit_blaze);
		}
        if(ConfigInit.ghast == true)
		{
        	add(seed_crop_ghast);
        	add(fruit_ghast);
		}
        if(ConfigInit.magma == true)
		{
        	add(seed_crop_magma);
        	add(fruit_magma);
		}
        if(ConfigInit.shell == true)
		{
        	add(seed_crop_shell);
        	add(fruit_shell);
		}
        if(ConfigInit.slime == true)
		{
        	add(seed_crop_slime);
        	add(fruit_slime);
		}
        if(ConfigInit.star == true)
		{
        	add(seed_crop_star);
        	add(fruit_star);
		}
        if(ConfigInit.string == true)
		{
        	add(seed_crop_string);
        	add(fruit_string);
		}
        if(ConfigInit.zombie == true)
		{
        	add(seed_crop_zombie);  
        	add(fruit_zombie);      
		}
        if(ConfigInit.orange == true)
		{
        	add(seed_crop_orange);
        	add(fruit_orange);
		}
        if(ConfigInit.magenta == true)
		{
        	add(seed_crop_magenta);
        	add(fruit_magenta);
		}
        if(ConfigInit.lightblue == true)
		{
        	add(seed_crop_lightblue);
        	add(fruit_lightblue);
		}
        if(ConfigInit.yellow == true)
		{
        	add(seed_crop_yellow);
        	add(fruit_yellow);
		}
        if(ConfigInit.lime == true)
		{
        	add(seed_crop_lime);
        	add(fruit_lime);
		}
        if(ConfigInit.pink == true)
		{
        	add(seed_crop_pink);
        	add(fruit_pink);
		}
        if(ConfigInit.gray == true)
		{
        	add(seed_crop_gray);
        	add(fruit_gray);
		}
        if(ConfigInit.silver == true)
		{
        	add(seed_crop_silver);
        	add(fruit_silver);
		}
        if(ConfigInit.cyan == true)
		{
        	add(seed_crop_cyan);
        	add(fruit_cyan);
		}
        if(ConfigInit.purple == true)
		{
        	add(seed_crop_purple);
        	add(fruit_purple);
		}
        if(ConfigInit.brown == true)
		{
        	add(seed_crop_brown);
        	add(fruit_brown);
		}
        if(ConfigInit.green == true)
		{
        	add(seed_crop_green);
        	add(fruit_green);
		}
        if(ConfigInit.red == true)
		{
        	add(seed_crop_red);
        	add(fruit_red);
		}
        if(ConfigInit.black == true)
		{
        	add(seed_crop_black); 
        	add(fruit_black);       
		}
        if(ConfigInit.vine == true)
		{
        	add(seed_crop_vine);
        	add(fruit_vine);
		}
        if(ConfigInit.lilypad == true)
		{
        	add(seed_crop_lilypad);
        	add(fruit_lilypad);
		}
        if(ConfigInit.tallgrass == true)
		{
        	add(seed_crop_tallgrass);
        	add(fruit_tallgrass);
		}
        if(ConfigInit.largefern == true)
		{
        	add(seed_crop_largefern);
        	add(fruit_largefern);
		}
        if(ConfigInit.bush == true)
		{
        	add(seed_crop_bush);
        	add(fruit_bush);
		}
        if(ConfigInit.grass1 == true)
		{
        	add(seed_crop_grass1);
        	add(fruit_grass1);
		}
        if(ConfigInit.fern == true)
		{
        	add(seed_crop_fern);
        	add(fruit_fern);
		}
        if(ConfigInit.oak == true)
		{
        	add(seed_crop_oak);
        	add(fruit_oak);
		}
        if(ConfigInit.birch == true)
		{
        	add(seed_crop_birch);
        	add(fruit_birch);
		}
        if(ConfigInit.spruce == true)
		{
        	add(seed_crop_spruce);
        	add(fruit_spruce);
		}
        if(ConfigInit.jungle == true)
		{
        	add(seed_crop_jungle);
        	add(fruit_jungle);
		}
        if(ConfigInit.darkoak == true)
		{
        	add(seed_crop_darkoak);
        	add(fruit_darkoak);
		}
        if(ConfigInit.acacia == true)
		{
			add(seed_crop_acacia);	
			add(fruit_acacia);	
		}
		if(ConfigInit.apple == true)
		{
			add(seed_crop_apple);
			add(fruit_apple);
		}
		if(ConfigInit.goldenapple == true)
		{
			add(seed_crop_goldenapple);
			add(fruit_goldenapple);
		}
		if(ConfigInit.bread == true)
		{
			add(seed_crop_bread);
			add(fruit_bread);
		}
		if(ConfigInit.egg == true)
		{
			add(seed_crop_egg);
			add(fruit_egg);
		}
		if(ConfigInit.clownfish == true)
		{
			add(seed_crop_clownfish);
			add(fruit_clownfish);
		}
		if(ConfigInit.pufferfish == true)
		{
			add(seed_crop_pufferfish);
			add(fruit_pufferfish);
		}
		if(ConfigInit.cookie == true)
		{
			add(seed_crop_cookie);
			add(fruit_cookie);
		}
		if(ConfigInit.chorus == true)
		{
			add(seed_crop_chorus);
			add(fruit_chorus);
		}
		if(ConfigInit.rawporc == true)
		{
			add(seed_crop_rawporc);
			add(fruit_rawporc);
		}
		if(ConfigInit.rawbeef == true)
		{
			add(seed_crop_rawbeef);
			add(fruit_rawbeef);
		}
		if(ConfigInit.fish == true)
		{
			add(seed_crop_fish);
			add(fruit_fish);
		}
		if(ConfigInit.salmon == true)
		{
			add(seed_crop_salmon);
			add(fruit_salmon);
		}
		if(ConfigInit.rawchicken == true)
		{
			add(seed_crop_rawchicken);
			add(fruit_rawchicken);
		}
		if(ConfigInit.rawrabbit == true)
		{
			add(seed_crop_rawrabbit);
			add(fruit_rawrabbit);
		}
		if(ConfigInit.rawmutton == true)
		{
			add(seed_crop_rawmutton);
			add(fruit_rawmutton);
		}
		if(ConfigInit.death == true)
		{
			add(seed_crop_death);
			add(fruit_death);
		}
		if(ConfigInit.totem == true)
		{
			add(seed_crop_totem);
			add(fruit_totem);
		}	
        
		add(fruit_start);
		add(fruit_start_mob);
		add(fruit_start_natural);
		add(fruit_start_monster);
		
        add(seed_stem_coal);
        add(seed_stem_iron);
        add(seed_stem_gold);
        add(seed_stem_redstone);
        add(seed_stem_lapis);
        add(seed_stem_diamond);
        add(seed_stem_emerald);
        add(seed_stem_clay);
        add(seed_stem_glowstone);
        add(seed_stem_quartz);
        add(seed_stem_shard);
        add(seed_stem_cristal);
        

        add(seed_stem_obsidian);
        add(seed_stem_bone);
        add(seed_stem_snow);
        add(seed_stem_nether);
        add(seed_stem_glass);
        add(seed_stem_magma);
        add(seed_stem_shell);

 
        add(powder_cobble);
        add(powder_sand);
        add(powder_grass);
        add(powder_oak);
        add(powder_spruce);
        add(powder_birch);
        add(powder_jungle);
        add(powder_acacia);
        add(powder_darkoak);
        
        add(elemental_seed);
        add(elemental_fragment);
        add(elemental_water);
        add(elemental_fire);
        add(elemental_air);
        add(elemental_earth);
        add(elemental_seed_stem);
		add(element_eternity);
		add(eternal_fire);
		add(eternal_water);
		add(eternal_earth);
		add(eternal_air);

		add(eternal_time);

		if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true || ModLoader.getEmber())
    	{
    		add(seed_crop_aluminium);
    		add(fruit_aluminium);
    		addReg("ingotAluminum", aluminium_ingot);
    	}
    	if(ModLoader.getTechReborn() == true)
    	{
    		add(seed_crop_brass);
    		add(fruit_brass);
    		addReg("ingotBrass", brass_ingot); 		
    	}
		
		if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getForestry() == true || ModLoader.getIC2() == true || ModLoader.getEmber())
    	{
			add(seed_crop_bronze);
			add(fruit_bronze);
			addReg("ingotBronze", bronze_ingot);
    	}
		
		if(ModLoader.getTechReborn() == true)
    	{
			add(seed_crop_chrome);
			add(fruit_chrome);
			addReg("ingotChrome", chrome_ingot);
    	}
		
		if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true || ModLoader.getForestry() == true || ModLoader.getIC2() == true || ModLoader.getEmber())
    	{
			add(seed_crop_copper);
			add(fruit_copper);
			addReg("ingotCopper", copper_ingot);
    	}
		
		if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true || ModLoader.getEmber())
    	{
			add(seed_crop_electrum);
			add(fruit_electrum);
			addReg("ingotElectrum", electrum_ingot);
    	}
		
		if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true)
    	{
			add(seed_crop_invar);
			add(fruit_invar);
			addReg("ingotInvar", invar_ingot);
    	}
		
		if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true)
    	{
			add(seed_crop_iridium);
			add(fruit_iridium);
			addReg("ingotIridium", iridium_ingot);
    	}
		
		if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true || ModLoader.getIC2() == true  || ModLoader.getEmber())
    	{
			add(seed_crop_lead);
			add(fruit_lead);
			addReg("ingotLead", lead_ingot);
    	}
		
		if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true || ModLoader.getEmber())
    	{
			add(seed_crop_nickel);
			add(fruit_nickel);
			addReg("ingotNickel", nickel_ingot);
    	}
		
		if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true)
    	{
			add(seed_crop_platinium);
			add(fruit_platinium);
			addReg("ingotPlatinum", platinium_ingot);
    	}
		
		if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true || ModLoader.getIC2() == true || ModLoader.getEmber())
    	{
			add(seed_crop_silveringot);
			add(fruit_silveringot);
			addReg("ingotSilver", silver_ingot);
    	}
		
		if(ModLoader.getTechReborn() == true || ModLoader.getBigReactor() == true || ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true || ModLoader.getIC2() == true)
    	{
			add(seed_crop_steel);
			add(fruit_steel);
			addReg("ingotSteel", steel_ingot);
    	}		
		
		if(ModLoader.getTechReborn() == true || ModLoader.getThermalFoundation() == true || ModLoader.getForestry() == true || ModLoader.getIC2() == true || ModLoader.getEmber())
    	{
			add(seed_crop_tin);
			add(fruit_tin);
			addReg("ingotTin", tin_ingot);
    	}
		
		if(ModLoader.getTechReborn() == true)
    	{
			add(seed_crop_titanium);
			add(fruit_titanium);
			addReg("ingotTitanium", titanium_ingot);
    	}
		
		if(ModLoader.getTechReborn() == true)
    	{
			add(seed_crop_tungsten);
			add(fruit_tungsten);
			addReg("ingotTungsten", tungsten_ingot);
    	}
		
		if(ModLoader.getTechReborn() == true)
    	{
			add(seed_crop_zinc);
			add(fruit_zinc);
			addReg("ingotZinc", zinc_ingot);	
    	}
		
		if(ModLoader.getBotania() == true)
    	{
			add(seed_crop_manasteel);
			add(fruit_manasteel);
	    	addReg("ingotManasteel", ingot_manasteel);  
    	}
		
		if(ModLoader.getBotania() == true)
    	{
			add(seed_crop_terrasteel);
			add(fruit_terrasteel);
	    	addReg("ingotTerrasteel", ingot_terrasteel);
    	}
		
		if(ModLoader.getBotania() == true)
    	{
			add(seed_crop_elementium);
			add(fruit_elementium);
	    	addReg("ingotElvenElementium", ingot_elementium);
    	}
	    
	    if(ModLoader.getBotania() == true)
    	{
    		add(seed_crop_manadiamond);
    		add(fruit_manadiamond);
        	addReg("manaDiamond", mana_diamond);
    	}
	    
	    if(ModLoader.getBotania() == true)
    	{
	    	add(seed_crop_manapearl);	
	    	add(fruit_manapearl);	
	    	addReg("manaPearl", mana_pearl);
    	}
	    
	    if(ModLoader.getBotania() == true)
    	{
	    	add(seed_crop_dragonstone);
	    	add(fruit_dragonstone);
	    	addReg("elvenDragonstone", dragonstone);
    	}
	    
	    if(ModLoader.getBuildcraft() == true || ModLoader.getAe2() == true)
    	{
	    	add(seed_crop_gearwood);
	    	add(fruit_gearwood);
			addReg("gearWood", gearwood);		
    	}
		
		if(ModLoader.getBuildcraft() == true)
    	{
			add(seed_crop_gearstone);
			add(fruit_gearstone);
			addReg("gearStone", gearstone);		
    	}
		
		if(ModLoader.getBuildcraft() == true)
    	{
			add(seed_crop_geariron);
			add(fruit_geariron);
			addReg("gearIron", geariron);	
    	}
		
		if(ModLoader.getBuildcraft() == true)
    	{
			add(seed_crop_geargold);
			add(fruit_geargold);
			addReg("gearGold", geargold);	
    	}
		
		if(ModLoader.getBuildcraft() == true)
    	{
			add(seed_crop_geardiamond);	
			add(fruit_geardiamond);	
			addReg("gearDiamond", geardiamond);
    	}
		if(ModLoader.getBigReactor() == true)
		{
			add(seed_crop_yellorium);
			add(fruit_yellorium);
			addReg("ingotYellorium", ingot_yellorium);
		}
		
		if(ModLoader.getBigReactor() == true)
		{
			add(seed_crop_blutonium);
			add(fruit_blutonium);
			addReg("ingotBlutonium", ingot_blutonium);
		}
		if(ModLoader.getBigReactor() == true)
		{
			add(seed_crop_cyanite);
			add(fruit_cyanite);
			addReg("ingotCyanite", ingot_cyanite);
		}

		if(ModLoader.getBigReactor() == true)
		{
			add(seed_crop_graphite);
			add(fruit_graphite);
			addReg("ingotGraphite", ingot_graphite);
		}
		
		if(ModLoader.getBigReactor() == true)
		{
			add(seed_crop_ludicrite);
			add(fruit_ludicrite);
			addReg("ingoyLudicrite", ingot_ludicrite);
		}
		
		if(ModLoader.getThermalFoundation() == true)
		{
			add(seed_crop_enderium);
			add(fruit_enderium);
			addReg("ingotEnderium", ingot_enderium);
		}
		
		if(ModLoader.getThermalFoundation() == true)
		{
			add(seed_crop_lumium);
			add(fruit_lumium);
			addReg("ingotLumium", ingot_lumium);
		}
		
		if(ModLoader.getThermalFoundation() == true)
		{
			add(seed_crop_signalum);
			add(fruit_signalum);
			addReg("ingotSignalum", ingot_signalum);
		}
		
		if(ModLoader.getThermalFoundation() == true || ModLoader.getImmersive() == true)
		{
			add(seed_crop_constantan);
			add(fruit_constantan);
			addReg("ingotConstantan", ingot_constantan);
		}
		
		if(ModLoader.getThermalFoundation() == true || ModLoader.getEmber())
		{
			add(seed_crop_mithril);
			add(fruit_mithril);
			addReg("ingotMithril", ingot_mithril);
		}
		if(ModLoader.getImmersive() == true)
		{
			add(seed_crop_uranium);
			add(fruit_uranium);
			addReg("ingotUranium", ingot_uranium);
		} 

		if(ModLoader.getForestry() == true)
		{
			add(seed_crop_apatite);
			add(fruit_apatite);
			addReg("gemApatite", gem_apatite);
		}

		if(ModLoader.getRefinedStorage() == true || ModLoader.getAe2() == true)
		{
			add(seed_crop_silicon);
			add(fruit_silicon);
			addReg("itemSilicon", silicon);
		}
		
		if(ModLoader.getDraconic() == true)
		{
			add(seed_crop_draconium);
			add(fruit_draconium);
			addReg("ingotDraconium", ingot_draconium);
		}
		
		if(ModLoader.getDraconic() == true)
		{
			add(seed_crop_draconium_awakened);
			add(fruit_draconium_awakened);
			addReg("ingotDraconiumAwakened", ingot_draconium_awakened);
		}

		if(ModLoader.getAe2() == true)
		{
			add(seed_crop_certus_quartz);
			add(fruit_certus_quartz);
			addReg("crystalCertusQuartz", certus_quartz);
		}
		
		if(ModLoader.getAe2() == true)
		{
			add(seed_crop_crystal_flux);
			add(fruit_crystal_flux);
			addReg("crystalFluix", crystal_flux);
		}
		
		if(ModLoader.getAe2() == true)
		{
			add(seed_crop_pure_fluix);
			add(fruit_pure_fluix);
			addReg("crystalPureFluix", pure_fluix);
		}

    }

    public static void registerRenders()
    {
        
        registerRender(cheese);
        registerRender(raclette);
        registerRender(cherry);
        registerRender(lemon);
        registerRender(apricot);
        registerRender(kiwi);
        registerRender(orange);
        registerRender(pear);
        registerRender(banana);
        
        registerRender(cherry_pie);
        registerRender(lemon_pie);
        registerRender(apricot_pie);
        registerRender(kiwi_pie);
        registerRender(orange_pie);
        registerRender(pear_pie);
        registerRender(banana_pie);
        
        registerRender(chicken_leg);
        registerRender(roast_beef);
        registerRender(roast_porc);
        registerRender(horse_meat);
        registerRender(squid_meat);
        
        registerRender(cooked_chicken_leg);
        registerRender(cooked_roast_beef);
        registerRender(cooked_roast_porc);
        registerRender(cooked_horse_meat);
        registerRender(cooked_squid_meat);
        
        
        registerRender(flour);

        
  
        registerRender(obsidian_axe);
        registerRender(obsidian_pickaxe);
        registerRender(obsidian_shovel);
        registerRender(obsidian_hoe);
        registerRender(obsidian_sword);
        registerRender(obsidian_multitool);

        registerRender(renforced_axe);
        registerRender(renforced_pickaxe);
        registerRender(renforced_shovel);
        registerRender(renforced_hoe);
        registerRender(renforced_sword);
        registerRender(renforced_multitool);

        registerRender(fire_axe);
        registerRender(fire_pickaxe);
        registerRender(fire_shovel);
        registerRender(fire_hoe);
        registerRender(fire_sword);
        registerRender(fire_multitool);

        registerRender(water_axe);
        registerRender(water_pickaxe);
        registerRender(water_shovel);
        registerRender(water_hoe);
        registerRender(water_sword);
        registerRender(water_multitool);

        registerRender(air_axe);
        registerRender(air_pickaxe);
        registerRender(air_shovel);
        registerRender(air_hoe);
        registerRender(air_sword);
        registerRender(air_multitool);
        
        registerRender(earth_axe);
        registerRender(earth_pickaxe);
        registerRender(earth_shovel);
        registerRender(earth_hoe);
        registerRender(earth_sword);
        registerRender(earth_multitool);
        
        registerRender(wood_multitool);
        registerRender(stone_multitool);
        registerRender(iron_multitool);
        registerRender(gold_multitool);
        registerRender(diamond_multitool);
        
        registerRender(wood_pestle);
        registerRender(stone_pestle);
        registerRender(iron_pestle);
        registerRender(gold_pestle);
        registerRender(diamond_pestle);
        registerRender(obsidian_pestle);
        registerRender(renforced_pestle);
        registerRender(elemental_pestle);
        
        registerRender(water_can);

        registerRender(horn_plenty);
        registerRender(midas_hand);
       // registerRender(golden_egg);
        registerRender(infinite_apple);
        registerRender(scythe);
        
        registerRender(obsidian_helmet);
        registerRender(obsidian_chestplate);
        registerRender(obsidian_leggings);
        registerRender(obsidian_boots);

        registerRender(renforced_helmet);
        registerRender(renforced_chestplate);
        registerRender(renforced_leggings);
        registerRender(renforced_boots);

        registerRender(elemental_water_helmet);
        registerRender(elemental_water_chestplate);
        registerRender(elemental_water_leggings);
        registerRender(elemental_water_boots);

        registerRender(elemental_air_helmet);
        registerRender(elemental_air_chestplate);
        registerRender(elemental_air_leggings);
        registerRender(elemental_air_boots);

        registerRender(elemental_earth_helmet);
        registerRender(elemental_earth_chestplate);
        registerRender(elemental_earth_leggings);
        registerRender(elemental_earth_boots);

        registerRender(elemental_fire_helmet);
        registerRender(elemental_fire_chestplate);
        registerRender(elemental_fire_leggings);
        registerRender(elemental_fire_boots);

        

        registerRender(seed_crop_coal);
        registerRender(seed_crop_iron);
        registerRender(seed_crop_gold);
      	registerRender(seed_crop_redstone);
        registerRender(seed_crop_lapis);
        registerRender(seed_crop_diamond);
        registerRender(seed_crop_emerald);
        registerRender(seed_crop_clay);
        registerRender(seed_crop_glowstone);
        registerRender(seed_crop_quartz);
        registerRender(seed_crop_shard);
        registerRender(seed_crop_cristal);
        registerRender(seed_crop_ender);
        registerRender(seed_crop_bone);
        registerRender(seed_crop_eye);
        registerRender(seed_crop_powder);
        registerRender(seed_crop_paper);
        registerRender(seed_crop_sugar);
        registerRender(seed_crop_charcoal);
        registerRender(seed_crop_flint);
        registerRender(seed_crop_nether);
        registerRender(seed_crop_snowball);
        registerRender(seed_crop_firework);
        registerRender(seed_crop_leather);
        registerRender(seed_crop_bottle);
        registerRender(seed_crop_foot);
        registerRender(seed_crop_hide);
        registerRender(seed_crop_leather);
        registerRender(seed_crop_feather);
        registerRender(seed_crop_blaze);
        registerRender(seed_crop_ghast);
        registerRender(seed_crop_magma);
        registerRender(seed_crop_shell);
        registerRender(seed_crop_slime);
        registerRender(seed_crop_star);
        registerRender(seed_crop_string);
        registerRender(seed_crop_zombie);
        registerRender(seed_crop_orange);
        registerRender(seed_crop_magenta);
        registerRender(seed_crop_lightblue);
        registerRender(seed_crop_yellow);
        registerRender(seed_crop_lime);
        registerRender(seed_crop_pink);
        registerRender(seed_crop_gray);
        registerRender(seed_crop_silver);
        registerRender(seed_crop_cyan);
        registerRender(seed_crop_purple);
        registerRender(seed_crop_brown);
        registerRender(seed_crop_green);
        registerRender(seed_crop_red);
        registerRender(seed_crop_black);        
    	registerRender(seed_crop_vine);
		registerRender(seed_crop_lilypad);
		registerRender(seed_crop_tallgrass);
		registerRender(seed_crop_largefern);
		registerRender(seed_crop_bush);
		registerRender(seed_crop_grass1);
		registerRender(seed_crop_fern);
		registerRender(seed_crop_oak);
		registerRender(seed_crop_birch);
		registerRender(seed_crop_spruce);
		registerRender(seed_crop_jungle);
		registerRender(seed_crop_darkoak);
		registerRender(seed_crop_acacia);   
		registerRender(seed_crop_apple);
		registerRender(seed_crop_goldenapple);
		registerRender(seed_crop_bread);
		registerRender(seed_crop_egg);
		registerRender(seed_crop_clownfish);
		registerRender(seed_crop_pufferfish);
		registerRender(seed_crop_cookie);
		registerRender(seed_crop_chorus);
		registerRender(seed_crop_rawporc);
		registerRender(seed_crop_rawbeef);
		registerRender(seed_crop_fish);
		registerRender(seed_crop_salmon);
		registerRender(seed_crop_rawchicken);
		registerRender(seed_crop_rawrabbit);
		registerRender(seed_crop_rawmutton);
		registerRender(seed_crop_death);
		registerRender(seed_crop_totem);
		
        registerRender(fruit_coal);
        registerRender(fruit_iron);
        registerRender(fruit_gold);
        registerRender(fruit_redstone);
        registerRender(fruit_lapis);
        registerRender(fruit_diamond);
        registerRender(fruit_emerald);
        registerRender(fruit_clay);
        registerRender(fruit_glowstone);
        registerRender(fruit_quartz);
        registerRender(fruit_shard);
        registerRender(fruit_cristal);
        registerRender(fruit_ender);
        registerRender(fruit_start);
        registerRender(fruit_start_monster);
        registerRender(fruit_start_mob);
        registerRender(fruit_bone);
        registerRender(fruit_eye);
        registerRender(fruit_powder);
        registerRender(fruit_paper);
        registerRender(fruit_sugar);
        registerRender(fruit_charcoal);
        registerRender(fruit_flint);
        registerRender(fruit_snowball);
        registerRender(fruit_firework);
        registerRender(fruit_nether);
        registerRender(fruit_bottle);
        registerRender(fruit_foot);
        registerRender(fruit_hide);
        registerRender(fruit_leather);
        registerRender(fruit_feather);
        registerRender(fruit_blaze);
        registerRender(fruit_ghast);
        registerRender(fruit_magma);
        registerRender(fruit_shell);
        registerRender(fruit_slime);
        registerRender(fruit_star);
        registerRender(fruit_string);
        registerRender(fruit_zombie);
        registerRender(fruit_orange);
        registerRender(fruit_magenta);
        registerRender(fruit_lightblue);
        registerRender(fruit_yellow);
        registerRender(fruit_lime);
        registerRender(fruit_pink);
        registerRender(fruit_gray);
        registerRender(fruit_silver);
        registerRender(fruit_cyan);
        registerRender(fruit_purple);
        registerRender(fruit_brown);
        registerRender(fruit_green);
        registerRender(fruit_red);
        registerRender(fruit_black);
    	registerRender(fruit_start_natural);
    	registerRender(fruit_vine);
		registerRender(fruit_lilypad);
		registerRender(fruit_tallgrass);
		registerRender(fruit_largefern);
		registerRender(fruit_bush);
		registerRender(fruit_grass1);
		registerRender(fruit_fern);
		registerRender(fruit_oak);
		registerRender(fruit_birch);
		registerRender(fruit_spruce);
		registerRender(fruit_jungle);
		registerRender(fruit_darkoak);
		registerRender(fruit_acacia);	
		registerRender(fruit_apple);
		registerRender(fruit_goldenapple);
		registerRender(fruit_bread);
		registerRender(fruit_egg);
		registerRender(fruit_clownfish);
		registerRender(fruit_pufferfish);
		registerRender(fruit_cookie);
		registerRender(fruit_chorus);
		registerRender(fruit_rawporc);
		registerRender(fruit_rawbeef);
		registerRender(fruit_fish);
		registerRender(fruit_salmon);
		registerRender(fruit_rawchicken);
		registerRender(fruit_rawrabbit);
		registerRender(fruit_rawmutton);
		registerRender(fruit_death);
		registerRender(fruit_totem);

        registerRender(seed_stem_coal);
        registerRender(seed_stem_iron);
        registerRender(seed_stem_gold);
        registerRender(seed_stem_redstone);
        registerRender(seed_stem_lapis);
        registerRender(seed_stem_diamond);
        registerRender(seed_stem_emerald);
        registerRender(seed_stem_clay);
        registerRender(seed_stem_glowstone);
        registerRender(seed_stem_quartz);
        registerRender(seed_stem_shard);
        registerRender(seed_stem_cristal);

        registerRender(seed_stem_obsidian);
        registerRender(seed_stem_bone);
        registerRender(seed_stem_snow);
        registerRender(seed_stem_nether);
        registerRender(seed_stem_glass);
        registerRender(seed_stem_magma);
        registerRender(seed_stem_shell);
        
        registerRender(powder_cobble);
        registerRender(powder_sand);
        registerRender(powder_grass);
        registerRender(powder_oak);
        registerRender(powder_spruce);
        registerRender(powder_birch);
        registerRender(powder_jungle);
        registerRender(powder_acacia);
        registerRender(powder_darkoak);
        
        registerRender(elemental_seed);
        registerRender(elemental_fragment);
        registerRender(elemental_water);
        registerRender(elemental_fire);
        registerRender(elemental_air);
        registerRender(elemental_earth);
        registerRender(elemental_seed_stem);
		registerRender(element_eternity);
		registerRender(eternal_fire);
		registerRender(eternal_water);
		registerRender(eternal_earth);
		registerRender(eternal_air);

		registerRender(eternal_time);
			
		registerRender(seed_crop_aluminium);
		registerRender(seed_crop_brass);
		registerRender(seed_crop_bronze);
		registerRender(seed_crop_chrome);
		registerRender(seed_crop_copper);
		registerRender(seed_crop_electrum);
		registerRender(seed_crop_invar);
		registerRender(seed_crop_iridium);
		registerRender(seed_crop_lead);
		registerRender(seed_crop_nickel);
		registerRender(seed_crop_platinium);
		registerRender(seed_crop_silveringot);
		registerRender(seed_crop_steel);
		registerRender(seed_crop_tin);
		registerRender(seed_crop_titanium);
		registerRender(seed_crop_tungsten);
		registerRender(seed_crop_zinc);	
		registerRender(seed_crop_manasteel);
		registerRender(seed_crop_terrasteel);
		registerRender(seed_crop_elementium);
		registerRender(seed_crop_manadiamond);
		registerRender(seed_crop_manapearl);			
		registerRender(seed_crop_dragonstone);		
		registerRender(seed_crop_gearwood);
		registerRender(seed_crop_gearstone);
		registerRender(seed_crop_geariron);
		registerRender(seed_crop_geargold);
		registerRender(seed_crop_geardiamond);		
    	registerRender(seed_crop_yellorium);
    	registerRender(seed_crop_blutonium);
    	registerRender(seed_crop_cyanite);
    	registerRender(seed_crop_graphite);
    	registerRender(seed_crop_ludicrite); 	
    	registerRender(seed_crop_enderium);
    	registerRender(seed_crop_lumium);
    	registerRender(seed_crop_signalum);
    	registerRender(seed_crop_constantan);
    	registerRender(seed_crop_mithril);
    	registerRender(seed_crop_uranium);
    	registerRender(seed_crop_apatite);
    	registerRender(seed_crop_silicon);
    	registerRender(seed_crop_draconium);
    	registerRender(seed_crop_draconium_awakened);
    	registerRender(seed_crop_certus_quartz);
    	registerRender(seed_crop_crystal_flux);
    	registerRender(seed_crop_pure_fluix);
		
		registerRender(fruit_aluminium);
		registerRender(fruit_brass);
		registerRender(fruit_bronze);
		registerRender(fruit_chrome);
		registerRender(fruit_copper);
		registerRender(fruit_electrum);
		registerRender(fruit_invar);
		registerRender(fruit_iridium);
		registerRender(fruit_lead);
		registerRender(fruit_nickel);
		registerRender(fruit_platinium);
		registerRender(fruit_silveringot);
		registerRender(fruit_steel);
		registerRender(fruit_tin);
		registerRender(fruit_titanium);
		registerRender(fruit_tungsten);
		registerRender(fruit_zinc);
		registerRender(fruit_manasteel);
		registerRender(fruit_terrasteel);
		registerRender(fruit_elementium);
		registerRender(fruit_manadiamond);
		registerRender(fruit_manapearl);			
		registerRender(fruit_dragonstone);	
		registerRender(fruit_gearwood);
		registerRender(fruit_gearstone);
		registerRender(fruit_geariron);
		registerRender(fruit_geargold);
		registerRender(fruit_geardiamond);
    	registerRender(fruit_yellorium);
    	registerRender(fruit_blutonium);
    	registerRender(fruit_cyanite);
    	registerRender(fruit_graphite);
    	registerRender(fruit_ludicrite);	
    	registerRender(fruit_enderium);
    	registerRender(fruit_lumium);
    	registerRender(fruit_signalum);
    	registerRender(fruit_constantan);
    	registerRender(fruit_mithril);
    	registerRender(fruit_uranium);
    	registerRender(fruit_apatite);
    	registerRender(fruit_silicon);
    	registerRender(fruit_draconium);
    	registerRender(fruit_draconium_awakened);
    	registerRender(fruit_certus_quartz);
    	registerRender(fruit_crystal_flux);
    	registerRender(fruit_pure_fluix);
		
    	
    	registerRender(copper_ingot);
        registerRender(aluminium_ingot);
        registerRender(brass_ingot);
        registerRender(bronze_ingot);
        registerRender(chrome_ingot);
        registerRender(electrum_ingot);
        registerRender(invar_ingot);
        registerRender(iridium_ingot);
    	registerRender(lead_ingot);
    	registerRender(nickel_ingot);
    	registerRender(platinium_ingot);
    	registerRender(silver_ingot);	
    	registerRender(steel_ingot);
    	registerRender(tin_ingot);
    	registerRender(titanium_ingot);
    	registerRender(tungsten_ingot);
    	registerRender(zinc_ingot);
    	registerRender(ingot_elementium);
    	registerRender(ingot_terrasteel);
    	registerRender(mana_diamond);
    	registerRender(mana_pearl);
    	registerRender(ingot_manasteel);
    	registerRender(dragonstone);
    	registerRender(gearwood);
    	registerRender(gearstone);
    	registerRender(geariron);
    	registerRender(geargold);
    	registerRender(geardiamond);	
    	registerRender(ingot_yellorium);
    	registerRender(ingot_blutonium);
    	registerRender(ingot_cyanite);
    	registerRender(ingot_graphite);
    	registerRender(ingot_ludicrite);
    	registerRender(ingot_enderium);
    	registerRender(ingot_lumium);
    	registerRender(ingot_signalum);
    	registerRender(ingot_constantan);
    	registerRender(ingot_mithril);
    	registerRender(ingot_uranium);
    	registerRender(gem_apatite);
    	registerRender(silicon);
    	registerRender(ingot_draconium);
    	registerRender(ingot_draconium_awakened);
    	registerRender(certus_quartz);
    	registerRender(crystal_flux);
    	registerRender(pure_fluix);

    }
    	
    public static void add(Item item) 
	{						
    	ForgeRegistries.ITEMS.register(item);
	}
    
	public static void addReg(String what, Item item) 
	{
		add(item);
		OreDictionary.registerOre(what, item);			
	}

	
	public static void addOreDic(String what, Item item) 
	{
	
			if(OreDictionary.doesOreNameExist(what))			
			{
				ForgeRegistries.ITEMS.register(item);
			}
		
	}
	
    public static void registerRender(Item item)
    {
        Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.func_77658_a().substring(5), "inventory"));
    }
}
