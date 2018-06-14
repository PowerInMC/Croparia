package com.croparia.mod.Init.Registry;

import com.croparia.mod.Reference;
import com.croparia.mod.Config.ConfigInit;
import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeRegistry 
{
	public static final ItemStack brown = new ItemStack(Items.DYE, 4, 3);
	public static final ItemStack lapis = new ItemStack(Items.DYE, 4, 4);
	public static final ItemStack purple = new ItemStack(Items.DYE, 4, 5);
	public static final ItemStack cyan = new ItemStack(Items.DYE, 4, 6);
	public static final ItemStack light_gray = new ItemStack(Items.DYE, 4, 7);
	public static final ItemStack gray = new ItemStack(Items.DYE, 4, 8);
	public static final ItemStack pink = new ItemStack(Items.DYE, 4, 9);
	public static final ItemStack lime = new ItemStack(Items.DYE, 4, 10);
	public static final ItemStack yellow = new ItemStack(Items.DYE, 4, 11);
	public static final ItemStack light_blue = new ItemStack(Items.DYE, 4, 12);
	public static final ItemStack magenta = new ItemStack(Items.DYE, 4, 13);
	public static final ItemStack orange = new ItemStack(Items.DYE, 4, 14);
	public static final ItemStack white = new ItemStack(Items.DYE, 4, 15);
	
	public static void init()
	{
		seed(ItemMod.seed_crop_coal, new ItemStack(Items.COAL, 1, 0), ItemMod.fruit_start, Items.WHEAT_SEEDS);
		seed(ItemMod.seed_crop_iron, Items.IRON_INGOT, ItemMod.fruit_coal, ItemMod.seed_crop_coal);
		seed(ItemMod.seed_crop_gold, Items.GOLD_INGOT, ItemMod.fruit_iron, ItemMod.seed_crop_iron);
		seed(ItemMod.seed_crop_redstone, Items.REDSTONE, ItemMod.fruit_gold, ItemMod.seed_crop_gold);
		ShapedOreRecipe(new ItemStack(ItemMod.seed_crop_lapis), new Object[] { "iIi", "ISI", "iIi", 'i', lapis, 'S', ItemMod.fruit_redstone, 'I', ItemMod.seed_crop_redstone});
		seed(ItemMod.seed_crop_diamond, Items.DIAMOND, ItemMod.fruit_lapis, ItemMod.seed_crop_lapis);
		seed(ItemMod.seed_crop_emerald, Items.EMERALD, ItemMod.fruit_diamond, ItemMod.seed_crop_diamond);
		
		fruit(new ItemStack(Items.COAL, 2, 0), ItemMod.fruit_coal);
		fruit(Items.IRON_INGOT, 2, ItemMod.fruit_iron);
		fruit(Items.GOLD_INGOT, 2, ItemMod.fruit_gold);
		fruit(Items.REDSTONE, 2, ItemMod.fruit_redstone);
		ShapelessOreRecipe(lapis, new ItemStack(ItemMod.fruit_lapis));
		fruit(Items.DIAMOND, 2, ItemMod.fruit_diamond);
		fruit(Items.EMERALD, 2, ItemMod.fruit_emerald);
		
	    if(ConfigInit.clay == true){
			seed(ItemMod.seed_crop_clay, Items.CLAY_BALL, ItemMod.fruit_start, Items.WHEAT_SEEDS);
			fruit(Items.CLAY_BALL, ConfigInit.clayRate, ItemMod.fruit_clay);
	    }
	    if(ConfigInit.glowstone == true){ 
	    	seed(ItemMod.seed_crop_glowstone, Items.GLOWSTONE_DUST, ItemMod.fruit_start, Items.NETHER_WART);
			fruit(Items.GLOWSTONE_DUST, ConfigInit.glowstoneRate, ItemMod.fruit_glowstone);
	    }
	    if(ConfigInit.quartz == true){ 
	    	seed(ItemMod.seed_crop_quartz, Items.QUARTZ, ItemMod.fruit_start, Items.NETHER_WART);
			fruit(Items.QUARTZ, ConfigInit.quartzRate, ItemMod.fruit_quartz);
	    }
	    if(ConfigInit.shard == true){ 
	    	seed(ItemMod.seed_crop_shard, Items.PRISMARINE_SHARD, ItemMod.fruit_start, Items.WHEAT_SEEDS);
			fruit(Items.PRISMARINE_SHARD, ConfigInit.shardRate, ItemMod.fruit_shard);
	    }
	    if(ConfigInit.cristal == true){
	    	seed(ItemMod.seed_crop_cristal, Items.PRISMARINE_CRYSTALS, ItemMod.fruit_start, Items.WHEAT_SEEDS);
			fruit(Items.PRISMARINE_CRYSTALS, ConfigInit.cristalRate, ItemMod.fruit_cristal);
	    }
	    if(ConfigInit.ender == true){
	    	seed(ItemMod.seed_crop_ender, Items.ENDER_PEARL, ItemMod.fruit_start_monster, Items.WHEAT_SEEDS);
			fruit(Items.ENDER_PEARL, ConfigInit.enderRate, ItemMod.fruit_ender);
	    }
	    if(ConfigInit.bone == true){
	    	seed(ItemMod.seed_crop_bone, Items.BONE, ItemMod.fruit_start_monster, Items.WHEAT_SEEDS);
			fruit(Items.BONE, ConfigInit.boneRate, ItemMod.fruit_bone);
	    }
	    if(ConfigInit.eye == true){
	    	seed(ItemMod.seed_crop_eye, Items.SPIDER_EYE, ItemMod.fruit_start_monster, Items.WHEAT_SEEDS);
			fruit(Items.SPIDER_EYE, ConfigInit.eyeRate, ItemMod.fruit_eye);
	    }
	    if(ConfigInit.powder == true){
	    	seed(ItemMod.seed_crop_powder, Items.GUNPOWDER, ItemMod.fruit_start_monster, Items.WHEAT_SEEDS);
			fruit(Items.GUNPOWDER, ConfigInit.powderRate, ItemMod.fruit_powder);
	    }
	    if(ConfigInit.paper == true){
	    	seed(ItemMod.seed_crop_paper, Items.PAPER, ItemMod.fruit_start, Items.WHEAT_SEEDS);
			fruit(Items.PAPER, ConfigInit.paperRate, ItemMod.fruit_paper);
	    }
	    if(ConfigInit.sugar == true){
	    	seed(ItemMod.seed_crop_sugar, Items.SUGAR, ItemMod.fruit_start, Items.WHEAT_SEEDS);
			fruit(Items.SUGAR, ConfigInit.sugarRate, ItemMod.fruit_sugar);
	    }
	    if(ConfigInit.charcoal == true){
	    	seed(ItemMod.seed_crop_charcoal, new ItemStack(Items.COAL, 1, 1), ItemMod.fruit_start, Items.WHEAT_SEEDS);
			fruit(new ItemStack(Items.COAL, ConfigInit.charcoalRate, 1), ItemMod.fruit_charcoal);
	    }
	    if(ConfigInit.flint == true){
	    	seed(ItemMod.seed_crop_flint, Items.FLINT, ItemMod.fruit_start, Items.WHEAT_SEEDS);
			fruit(Items.FLINT, ConfigInit.flintRate, ItemMod.fruit_flint);
	    }
	    if(ConfigInit.snowball == true){
	       	seed(ItemMod.seed_crop_snowball, Items.SNOWBALL, ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(Items.SNOWBALL, ConfigInit.snowballRate, ItemMod.fruit_snowball);
	    }
	    if(ConfigInit.firework == true){
	       	seed(ItemMod.seed_crop_firework, Items.FIREWORK_CHARGE, ItemMod.fruit_start, Items.WHEAT_SEEDS);
			fruit(Items.FIREWORK_CHARGE, ConfigInit.fireworkRate, ItemMod.fruit_firework);
	    }
	    if(ConfigInit.nether == true){
	       	seed(ItemMod.seed_crop_nether, Items.NETHERBRICK, ItemMod.fruit_start, Items.NETHER_WART);
	       	fruit(Items.NETHERBRICK, ConfigInit.netherRate, ItemMod.fruit_nether);
	    }
	    if(ConfigInit.bottle == true){
	       	seed(ItemMod.seed_crop_bottle, Items.GLASS_BOTTLE, ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(Items.GLASS_BOTTLE, ConfigInit.bottleRate, ItemMod.fruit_bottle);
	    }
	    if(ConfigInit.foot == true){
	       	seed(ItemMod.seed_crop_foot, Items.RABBIT_FOOT, ItemMod.fruit_start_mob, Items.WHEAT_SEEDS);
	       	fruit(Items.RABBIT_FOOT, ConfigInit.footRate, ItemMod.fruit_foot);
	    }
	    if(ConfigInit.hide == true){
	       	seed(ItemMod.seed_crop_hide, Items.RABBIT_HIDE, ItemMod.fruit_start_mob, Items.WHEAT_SEEDS);
	       	fruit(Items.RABBIT_HIDE, ConfigInit.hideRate, ItemMod.fruit_hide);
	    }
	    if(ConfigInit.leather == true){
	       	seed(ItemMod.seed_crop_leather, Items.LEATHER, ItemMod.fruit_start_mob, Items.WHEAT_SEEDS);
	       	fruit(Items.LEATHER, ConfigInit.leatherRate, ItemMod.fruit_leather);
	    }
	    if(ConfigInit.feather == true){   
	       	seed(ItemMod.seed_crop_feather, Items.FEATHER, ItemMod.fruit_start_mob, Items.WHEAT_SEEDS);
	       	fruit(Items.FEATHER, ConfigInit.featherRate, ItemMod.fruit_feather);
	    }
	    if(ConfigInit.blaze == true){
	       	seed(ItemMod.seed_crop_blaze, Items.BLAZE_ROD, ItemMod.fruit_start_monster, Items.NETHER_WART);
	       	fruit(Items.BLAZE_ROD, ConfigInit.blazeRate, ItemMod.fruit_blaze);
	    }
	    if(ConfigInit.ghast == true){
	       	seed(ItemMod.seed_crop_ghast, Items.GHAST_TEAR, ItemMod.fruit_start_monster, Items.NETHER_WART);
	       	fruit(Items.GHAST_TEAR, ConfigInit.ghastRate, ItemMod.fruit_ghast);
	    }
	    if(ConfigInit.magma == true){
	       	seed(ItemMod.seed_crop_magma, Items.MAGMA_CREAM, ItemMod.fruit_start_monster, Items.NETHER_WART);
	       	fruit(Items.MAGMA_CREAM, ConfigInit.magmaRate, ItemMod.fruit_magma);
	    }
	    if(ConfigInit.shell == true){
	       	seed(ItemMod.seed_crop_shell, Items.SHULKER_SHELL, ItemMod.fruit_start_monster, Items.WHEAT_SEEDS);
	       	fruit(Items.SHULKER_SHELL, ConfigInit.shellRate, ItemMod.fruit_shell);
	    }
	    if(ConfigInit.slime == true){
	       	seed(ItemMod.seed_crop_slime, Items.SLIME_BALL, ItemMod.fruit_start_monster, Items.WHEAT_SEEDS);
	       	fruit(Items.SLIME_BALL, ConfigInit.slimeRate, ItemMod.fruit_slime);
	    }
	    if(ConfigInit.star == true){
	       	seed(ItemMod.seed_crop_star, Items.NETHER_STAR, ItemMod.fruit_start_monster, Items.NETHER_WART);
	       	fruit(Items.NETHER_STAR, ConfigInit.starRate, ItemMod.fruit_star);
	    }
	    if(ConfigInit.string == true){
	       	seed(ItemMod.seed_crop_string, Items.STRING, ItemMod.fruit_start_monster, Items.WHEAT_SEEDS);
	       	fruit(Items.STRING, ConfigInit.stringRate, ItemMod.fruit_string);
	    }
	    if(ConfigInit.zombie == true){
	       	seed(ItemMod.seed_crop_zombie, Items.ROTTEN_FLESH, ItemMod.fruit_start_monster, Items.WHEAT_SEEDS);
	       	fruit(Items.ROTTEN_FLESH, ConfigInit.zombieRate, ItemMod.fruit_zombie);
	    }
	    if(ConfigInit.orange == true){
	       	seed(ItemMod.seed_crop_orange, new ItemStack(Items.DYE, 1, 14), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.orangeRate, 14), ItemMod.fruit_orange);
	    }
	    if(ConfigInit.magenta == true){
	       	seed(ItemMod.seed_crop_magenta, new ItemStack(Items.DYE, 1, 13), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.magentaRate, 13), ItemMod.fruit_magenta);
	    }
	    if(ConfigInit.lightblue == true){
	       	seed(ItemMod.seed_crop_lightblue, new ItemStack(Items.DYE, 1, 12), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.lightblueRate, 12), ItemMod.fruit_lightblue);
	    }
	    if(ConfigInit.yellow == true){
	       	seed(ItemMod.seed_crop_yellow, new ItemStack(Items.DYE, 1, 11), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.yellowRate, 11), ItemMod.fruit_yellow);
	    }
	    if(ConfigInit.lime == true){
	       	seed(ItemMod.seed_crop_lime, new ItemStack(Items.DYE, 1, 10), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.limeRate, 10), ItemMod.fruit_lime);
	    }
	    if(ConfigInit.pink == true){
	       	seed(ItemMod.seed_crop_pink, new ItemStack(Items.DYE, 1, 9), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.pinkRate, 9), ItemMod.fruit_pink);
	    }
	    if(ConfigInit.gray == true){
	       	seed(ItemMod.seed_crop_gray, new ItemStack(Items.DYE, 1, 8), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.grayRate, 8), ItemMod.fruit_gray);
	    }
	    if(ConfigInit.silver == true){
	       	seed(ItemMod.seed_crop_silver, new ItemStack(Items.DYE, 1, 7), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.silverRate, 7), ItemMod.fruit_silver);
	    }
	    if(ConfigInit.cyan == true){
	       	seed(ItemMod.seed_crop_cyan, new ItemStack(Items.DYE, 1, 6), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.cyanRate, 6), ItemMod.fruit_cyan);
	    }
	    if(ConfigInit.purple == true){
	       	seed(ItemMod.seed_crop_purple, new ItemStack(Items.DYE, 1, 5), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.purpleRate, 5), ItemMod.fruit_purple);
	    }
	    if(ConfigInit.brown == true){
	       	seed(ItemMod.seed_crop_brown, new ItemStack(Items.DYE, 1, 3), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.brownRate, 3), ItemMod.fruit_brown);
	    }
	    if(ConfigInit.green == true){
	       	seed(ItemMod.seed_crop_green, new ItemStack(Items.DYE, 1, 2), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.greenRate, 2), ItemMod.fruit_green); 	
	    }
	    if(ConfigInit.red == true){
	       	seed(ItemMod.seed_crop_red, new ItemStack(Items.DYE, 1, 1), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.redRate, 1), ItemMod.fruit_red);
	    }
	    if(ConfigInit.black == true){  
	       	seed(ItemMod.seed_crop_black, new ItemStack(Items.DYE, 1, 0), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.blackRate, 0), ItemMod.fruit_black);
	    }
	    if(ConfigInit.vine == true){
	       	seed(ItemMod.seed_crop_vine, new ItemStack(Blocks.VINE), ItemMod.fruit_start_natural, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.VINE, ConfigInit.vineRate), ItemMod.fruit_vine);
	    }
	    if(ConfigInit.lilypad == true){
	       	seed(ItemMod.seed_crop_lilypad, new ItemStack(Blocks.WATERLILY), ItemMod.fruit_start_natural, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.WATERLILY, ConfigInit.lilypadRate), ItemMod.fruit_cristal);
	    }
	    if(ConfigInit.tallgrass == true){
	       	seed(ItemMod.seed_crop_tallgrass, new ItemStack(Blocks.DOUBLE_PLANT, 1, 2), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.DOUBLE_PLANT, ConfigInit.tallgrassRate, 2), ItemMod.fruit_tallgrass);
	    }
	    if(ConfigInit.largefern == true){
	     	seed(ItemMod.seed_crop_tallgrass, new ItemStack(Blocks.DOUBLE_PLANT, 1, 3), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.DOUBLE_PLANT, ConfigInit.largefernRate, 3), ItemMod.fruit_tallgrass);
	    }
	    if(ConfigInit.bush == true){
	       	seed(ItemMod.seed_crop_bush, new ItemStack(Blocks.DEADBUSH), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.DEADBUSH, ConfigInit.bushRate), ItemMod.fruit_bush);
	    }
	    if(ConfigInit.grass1 == true){
	       	seed(ItemMod.seed_crop_grass1, new ItemStack(Blocks.TALLGRASS, 1, 1), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.TALLGRASS, ConfigInit.grass1Rate, 1), ItemMod.fruit_grass1);
	    }
	    if(ConfigInit.fern == true){
	    	seed(ItemMod.seed_crop_grass1, new ItemStack(Blocks.TALLGRASS, 1, 2), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.TALLGRASS, ConfigInit.fernRate, 2), ItemMod.fruit_grass1);
	    }
	    if(ConfigInit.oak == true){
	       	seed(ItemMod.seed_crop_oak, new ItemStack(Blocks.SAPLING, 1, 0), ItemMod.fruit_start_natural, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.SAPLING, ConfigInit.oakRate, 0), ItemMod.fruit_oak);
	    }
	    if(ConfigInit.birch == true){
	    	seed(ItemMod.seed_crop_birch, new ItemStack(Blocks.SAPLING, 1, 2), ItemMod.fruit_start_natural, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.SAPLING, ConfigInit.birchRate, 2), ItemMod.fruit_birch);
	    }
	    if(ConfigInit.spruce == true){
	    	seed(ItemMod.seed_crop_spruce, new ItemStack(Blocks.SAPLING, 1, 1), ItemMod.fruit_start_natural, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.SAPLING, ConfigInit.spruceRate, 1), ItemMod.fruit_spruce);
	    }
	    if(ConfigInit.jungle == true){
	    	seed(ItemMod.seed_crop_jungle, new ItemStack(Blocks.SAPLING, 1, 3), ItemMod.fruit_start_natural, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.SAPLING, ConfigInit.jungleRate, 3), ItemMod.fruit_jungle);
	    }
	    if(ConfigInit.darkoak == true){
	    	seed(ItemMod.seed_crop_darkoak, new ItemStack(Blocks.SAPLING, 1, 5), ItemMod.fruit_start_natural, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.SAPLING, ConfigInit.darkoakRate, 5), ItemMod.fruit_darkoak);
	    }
	    if(ConfigInit.acacia == true){
	    	seed(ItemMod.seed_crop_acacia, new ItemStack(Blocks.SAPLING, 1, 4), ItemMod.fruit_start_natural, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.SAPLING, ConfigInit.acaciaRate, 4), ItemMod.fruit_acacia);
	    }
	    if(ConfigInit.apple == true){
	       	seed(ItemMod.seed_crop_apple, Items.APPLE, ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(Items.APPLE, ConfigInit.appleRate, ItemMod.fruit_apple);
	    }
	    if(ConfigInit.goldenapple == true){
	       	seed(ItemMod.seed_crop_goldenapple, Items.GOLDEN_APPLE, ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(Items.GOLDEN_APPLE, ConfigInit.goldenappleRate, ItemMod.fruit_goldenapple);
	    }
	    if(ConfigInit.bread == true){
	       	seed(ItemMod.seed_crop_bread, Items.BREAD, ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(Items.BREAD, ConfigInit.breadRate, ItemMod.fruit_bread);
	    }
	    if(ConfigInit.egg == true){
	       	seed(ItemMod.seed_crop_egg, Items.EGG, ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(Items.EGG, ConfigInit.eggRate, ItemMod.fruit_egg);
	    }
	   	if(ConfigInit.clownfish == true){
	       	seed(ItemMod.seed_crop_clownfish, new ItemStack(Items.FISH, 1, 2), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.FISH, ConfigInit.clownfishRate, 2), ItemMod.fruit_clownfish);
	   	}
	   	if(ConfigInit.pufferfish == true){
	       	seed(ItemMod.seed_crop_pufferfish, new ItemStack(Items.FISH, 1, 3), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.FISH, ConfigInit.pufferfishRate, 3), ItemMod.fruit_pufferfish);
	   	}
	   	if(ConfigInit.cookie == true){
	       	seed(ItemMod.seed_crop_cookie, Items.COOKIE, ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(Items.COOKIE, ConfigInit.cookieRate, ItemMod.fruit_cookie);
	   	}
	   	if(ConfigInit.chorus == true){
	       	seed(ItemMod.seed_crop_chorus, Items.CHORUS_FRUIT, ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(Items.CHORUS_FRUIT, ConfigInit.chorusRate, ItemMod.fruit_chorus);
	   	}
	   	if(ConfigInit.rawporc == true){
	       	seed(ItemMod.seed_crop_rawporc, Items.PORKCHOP, ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(Items.PORKCHOP, ConfigInit.rawporcRate, ItemMod.fruit_rawporc);
	   	}
	   	if(ConfigInit.rawbeef == true){
	       	seed(ItemMod.seed_crop_rawbeef, Items.BEEF, ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(Items.BEEF, ConfigInit.rawbeefRate, ItemMod.fruit_rawbeef);
	   	}
	   	if(ConfigInit.fish == true){
	   		seed(ItemMod.seed_crop_fish, new ItemStack(Items.FISH, 1, 0), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.FISH, ConfigInit.fishRate, 0), ItemMod.fruit_pufferfish);
	   	}
	   	if(ConfigInit.salmon == true){
	   		seed(ItemMod.seed_crop_salmon, new ItemStack(Items.FISH, 1, 1), ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.FISH, ConfigInit.salmonRate, 1), ItemMod.fruit_salmon);
	   	}
	   	if(ConfigInit.rawchicken == true){
	       	seed(ItemMod.seed_crop_rawchicken, Items.CHICKEN, ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(Items.CHICKEN, ConfigInit.rawchickenRate, ItemMod.fruit_rawchicken);
	   	}
	   	if(ConfigInit.rawrabbit == true){
	       	seed(ItemMod.seed_crop_rawrabbit, Items.RABBIT, ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(Items.RABBIT, ConfigInit.rawrabbitRate, ItemMod.fruit_rawrabbit);
	   	}
	   	if(ConfigInit.rawmutton == true){
	       	seed(ItemMod.seed_crop_rawmutton, Items.MUTTON, ItemMod.fruit_start, Items.WHEAT_SEEDS);
	       	fruit(Items.MUTTON, ConfigInit.rawmuttonRate, ItemMod.fruit_rawmutton);
	   	}
	   	if(ConfigInit.totem == true){
	       	seed(ItemMod.seed_crop_totem, Items.TOTEM_OF_UNDYING, ItemMod.fruit_diamond, ItemMod.seed_crop_diamond);
	       	fruit(Items.TOTEM_OF_UNDYING, ConfigInit.totemRate, ItemMod.fruit_totem);
	   	}
	   	if(ConfigInit.nametag == true){
	       	seed(ItemMod.seed_crop_nametag, Items.NAME_TAG, ItemMod.fruit_iron, ItemMod.seed_crop_iron);
	       	fruit(Items.NAME_TAG, ConfigInit.nametagRate, ItemMod.fruit_nametag);
	   	}
	   	if(ConfigInit.lead2 == true){
	       	seed(ItemMod.seed_crop_lead2, Items.LEAD, ItemMod.fruit_iron, ItemMod.seed_crop_iron);
	       	fruit(Items.LEAD, ConfigInit.lead2Rate, ItemMod.fruit_lead2);
	   	}
	   	
	   	ShapelessOreRecipe(new ItemStack(BlockMod.block_ritual_debug, 1), new ItemStack(Blocks.DIRT));	
	}
	
	public static void seed(Item output, Item ore, Item fruit, Item seed)
	{
		ShapedOreRecipe(new ItemStack(output), new Object[] { "iIi", "ISI", "iIi", 'i', ore, 'S', fruit, 'I', seed});
	}
	public static void seed(ItemStack output, Item ore, Item fruit, Item seed)
	{
		ShapedOreRecipe(output, new Object[] { "iIi", "ISI", "iIi", 'i', ore, 'S', fruit, 'I', seed});
	}
	
	public static void seed(Item output, ItemStack ore, Item fruit, Item seed)
	{
		ShapedOreRecipe(new ItemStack(output), new Object[] { "iIi", "ISI", "iIi", 'i', ore, 'S', fruit, 'I', seed});
	}	
	
	public static void fruit(Item output, int i, Item input)
	{
		ShapelessOreRecipe(new ItemStack(output, i), new ItemStack(input));	
	}
	
	public static void fruit(ItemStack output, Item input)
	{
		ShapelessOreRecipe(output, new ItemStack(input));	
	}
	public static void ShapedOreRecipe(ItemStack output, Object... input){
		ForgeRegistries.RECIPES.register(new ShapedOreRecipe(new ResourceLocation(""), output, input).setRegistryName(getLocation(output)));
	}
	public static void ShapelessOreRecipe(ItemStack output, Object... input){
		ForgeRegistries.RECIPES.register(new ShapelessOreRecipe(new ResourceLocation(""), output, input).setRegistryName(getLocation(output)));
	}
	
	public static ResourceLocation getLocation(ItemStack output){
    	String modid = Reference.MOD_ID;
        ResourceLocation resourceLocation = new ResourceLocation(modid, output.getItem().getRegistryName().getResourcePath());
        ResourceLocation location = resourceLocation;
        int i = 0;

        while(CraftingManager.REGISTRY.containsKey(location)){
            i++;
            location = new ResourceLocation(modid, resourceLocation.getResourcePath() + "_" + i);
        }
        
        return location;
    }
}
