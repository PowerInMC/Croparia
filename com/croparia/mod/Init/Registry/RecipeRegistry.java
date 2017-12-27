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
	public static final ItemStack brown = new ItemStack(Items.field_151100_aR, 4, 3);
	public static final ItemStack lapis = new ItemStack(Items.field_151100_aR, 4, 4);
	public static final ItemStack purple = new ItemStack(Items.field_151100_aR, 4, 5);
	public static final ItemStack cyan = new ItemStack(Items.field_151100_aR, 4, 6);
	public static final ItemStack light_gray = new ItemStack(Items.field_151100_aR, 4, 7);
	public static final ItemStack gray = new ItemStack(Items.field_151100_aR, 4, 8);
	public static final ItemStack pink = new ItemStack(Items.field_151100_aR, 4, 9);
	public static final ItemStack lime = new ItemStack(Items.field_151100_aR, 4, 10);
	public static final ItemStack yellow = new ItemStack(Items.field_151100_aR, 4, 11);
	public static final ItemStack light_blue = new ItemStack(Items.field_151100_aR, 4, 12);
	public static final ItemStack magenta = new ItemStack(Items.field_151100_aR, 4, 13);
	public static final ItemStack orange = new ItemStack(Items.field_151100_aR, 4, 14);
	public static final ItemStack white = new ItemStack(Items.field_151100_aR, 4, 15);
	
	public static void init()
	{
		seed(ItemMod.seed_crop_coal, new ItemStack(Items.field_151044_h, 1, 0), ItemMod.fruit_start, Items.field_151014_N);
		seed(ItemMod.seed_crop_iron, Items.field_151042_j, ItemMod.fruit_coal, ItemMod.seed_crop_coal);
		seed(ItemMod.seed_crop_gold, Items.field_151043_k, ItemMod.fruit_iron, ItemMod.seed_crop_iron);
		seed(ItemMod.seed_crop_redstone, Items.field_151137_ax, ItemMod.fruit_gold, ItemMod.seed_crop_gold);
		ShapedOreRecipe(new ItemStack(ItemMod.seed_crop_lapis), new Object[] { "iIi", "ISI", "iIi", 'i', lapis, 'S', ItemMod.fruit_redstone, 'I', ItemMod.seed_crop_redstone});
		seed(ItemMod.seed_crop_diamond, Items.field_151045_i, ItemMod.fruit_lapis, ItemMod.seed_crop_lapis);
		seed(ItemMod.seed_crop_emerald, Items.field_151166_bC, ItemMod.fruit_diamond, ItemMod.seed_crop_diamond);
		
		fruit(new ItemStack(Items.field_151044_h, 2, 0), ItemMod.fruit_coal);
		fruit(Items.field_151042_j, 2, ItemMod.fruit_iron);
		fruit(Items.field_151043_k, 2, ItemMod.fruit_gold);
		fruit(Items.field_151137_ax, 2, ItemMod.fruit_redstone);
		ShapelessOreRecipe(lapis, new ItemStack(ItemMod.fruit_lapis));
		fruit(Items.field_151045_i, 2, ItemMod.fruit_diamond);
		fruit(Items.field_151166_bC, 2, ItemMod.fruit_emerald);
		
	    if(ConfigInit.clay == true){
			seed(ItemMod.seed_crop_clay, Items.field_151119_aD, ItemMod.fruit_start, Items.field_151014_N);
			fruit(Items.field_151119_aD, ConfigInit.clayRate, ItemMod.fruit_clay);
	    }
	    if(ConfigInit.glowstone == true){ 
	    	seed(ItemMod.seed_crop_glowstone, Items.field_151114_aO, ItemMod.fruit_start, Items.field_151075_bm);
			fruit(Items.field_151114_aO, ConfigInit.glowstoneRate, ItemMod.fruit_glowstone);
	    }
	    if(ConfigInit.quartz == true){ 
	    	seed(ItemMod.seed_crop_quartz, Items.field_151128_bU, ItemMod.fruit_start, Items.field_151075_bm);
			fruit(Items.field_151128_bU, ConfigInit.quartzRate, ItemMod.fruit_quartz);
	    }
	    if(ConfigInit.shard == true){ 
	    	seed(ItemMod.seed_crop_shard, Items.field_179562_cC, ItemMod.fruit_start, Items.field_151014_N);
			fruit(Items.field_179562_cC, ConfigInit.shardRate, ItemMod.fruit_shard);
	    }
	    if(ConfigInit.cristal == true){
	    	seed(ItemMod.seed_crop_cristal, Items.field_179563_cD, ItemMod.fruit_start, Items.field_151014_N);
			fruit(Items.field_179563_cD, ConfigInit.cristalRate, ItemMod.fruit_cristal);
	    }
	    if(ConfigInit.ender == true){
	    	seed(ItemMod.seed_crop_ender, Items.field_151079_bi, ItemMod.fruit_start_monster, Items.field_151014_N);
			fruit(Items.field_151079_bi, ConfigInit.enderRate, ItemMod.fruit_ender);
	    }
	    if(ConfigInit.bone == true){
	    	seed(ItemMod.seed_crop_bone, Items.field_151103_aS, ItemMod.fruit_start_monster, Items.field_151014_N);
			fruit(Items.field_151103_aS, ConfigInit.boneRate, ItemMod.fruit_bone);
	    }
	    if(ConfigInit.eye == true){
	    	seed(ItemMod.seed_crop_eye, Items.field_151070_bp, ItemMod.fruit_start_monster, Items.field_151014_N);
			fruit(Items.field_151070_bp, ConfigInit.eyeRate, ItemMod.fruit_eye);
	    }
	    if(ConfigInit.powder == true){
	    	seed(ItemMod.seed_crop_powder, Items.field_151016_H, ItemMod.fruit_start_monster, Items.field_151014_N);
			fruit(Items.field_151016_H, ConfigInit.powderRate, ItemMod.fruit_powder);
	    }
	    if(ConfigInit.paper == true){
	    	seed(ItemMod.seed_crop_paper, Items.field_151121_aF, ItemMod.fruit_start, Items.field_151014_N);
			fruit(Items.field_151121_aF, ConfigInit.paperRate, ItemMod.fruit_paper);
	    }
	    if(ConfigInit.sugar == true){
	    	seed(ItemMod.seed_crop_sugar, Items.field_151102_aT, ItemMod.fruit_start, Items.field_151014_N);
			fruit(Items.field_151102_aT, ConfigInit.sugarRate, ItemMod.fruit_sugar);
	    }
	    if(ConfigInit.charcoal == true){
	    	seed(ItemMod.seed_crop_charcoal, new ItemStack(Items.field_151044_h, 1, 1), ItemMod.fruit_start, Items.field_151014_N);
			fruit(new ItemStack(Items.field_151044_h, ConfigInit.charcoalRate, 1), ItemMod.fruit_charcoal);
	    }
	    if(ConfigInit.flint == true){
	    	seed(ItemMod.seed_crop_flint, Items.field_151145_ak, ItemMod.fruit_start, Items.field_151014_N);
			fruit(Items.field_151145_ak, ConfigInit.flintRate, ItemMod.fruit_flint);
	    }
	    if(ConfigInit.snowball == true){
	       	seed(ItemMod.seed_crop_snowball, Items.field_151126_ay, ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(Items.field_151126_ay, ConfigInit.snowballRate, ItemMod.fruit_snowball);
	    }
	    if(ConfigInit.firework == true){
	       	seed(ItemMod.seed_crop_firework, Items.field_151154_bQ, ItemMod.fruit_start, Items.field_151014_N);
			fruit(Items.field_151154_bQ, ConfigInit.fireworkRate, ItemMod.fruit_firework);
	    }
	    if(ConfigInit.nether == true){
	       	seed(ItemMod.seed_crop_nether, Items.field_151130_bT, ItemMod.fruit_start, Items.field_151075_bm);
	       	fruit(Items.field_151130_bT, ConfigInit.netherRate, ItemMod.fruit_nether);
	    }
	    if(ConfigInit.bottle == true){
	       	seed(ItemMod.seed_crop_bottle, Items.field_151069_bo, ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(Items.field_151069_bo, ConfigInit.bottleRate, ItemMod.fruit_bottle);
	    }
	    if(ConfigInit.foot == true){
	       	seed(ItemMod.seed_crop_foot, Items.field_179556_br, ItemMod.fruit_start_mob, Items.field_151014_N);
	       	fruit(Items.field_179556_br, ConfigInit.footRate, ItemMod.fruit_foot);
	    }
	    if(ConfigInit.hide == true){
	       	seed(ItemMod.seed_crop_hide, Items.field_179555_bs, ItemMod.fruit_start_mob, Items.field_151014_N);
	       	fruit(Items.field_179555_bs, ConfigInit.hideRate, ItemMod.fruit_hide);
	    }
	    if(ConfigInit.leather == true){
	       	seed(ItemMod.seed_crop_leather, Items.field_151116_aA, ItemMod.fruit_start_mob, Items.field_151014_N);
	       	fruit(Items.field_151116_aA, ConfigInit.leatherRate, ItemMod.fruit_leather);
	    }
	    if(ConfigInit.feather == true){   
	       	seed(ItemMod.seed_crop_feather, Items.field_151008_G, ItemMod.fruit_start_mob, Items.field_151014_N);
	       	fruit(Items.field_151008_G, ConfigInit.featherRate, ItemMod.fruit_feather);
	    }
	    if(ConfigInit.blaze == true){
	       	seed(ItemMod.seed_crop_blaze, Items.field_151072_bj, ItemMod.fruit_start_monster, Items.field_151075_bm);
	       	fruit(Items.field_151072_bj, ConfigInit.blazeRate, ItemMod.fruit_blaze);
	    }
	    if(ConfigInit.ghast == true){
	       	seed(ItemMod.seed_crop_ghast, Items.field_151073_bk, ItemMod.fruit_start_monster, Items.field_151075_bm);
	       	fruit(Items.field_151073_bk, ConfigInit.ghastRate, ItemMod.fruit_ghast);
	    }
	    if(ConfigInit.magma == true){
	       	seed(ItemMod.seed_crop_magma, Items.field_151064_bs, ItemMod.fruit_start_monster, Items.field_151075_bm);
	       	fruit(Items.field_151064_bs, ConfigInit.magmaRate, ItemMod.fruit_magma);
	    }
	    if(ConfigInit.shell == true){
	       	seed(ItemMod.seed_crop_shell, Items.field_190930_cZ, ItemMod.fruit_start_monster, Items.field_151014_N);
	       	fruit(Items.field_190930_cZ, ConfigInit.shellRate, ItemMod.fruit_shell);
	    }
	    if(ConfigInit.slime == true){
	       	seed(ItemMod.seed_crop_slime, Items.field_151123_aH, ItemMod.fruit_start_monster, Items.field_151014_N);
	       	fruit(Items.field_151123_aH, ConfigInit.slimeRate, ItemMod.fruit_slime);
	    }
	    if(ConfigInit.star == true){
	       	seed(ItemMod.seed_crop_star, Items.field_151156_bN, ItemMod.fruit_start_monster, Items.field_151075_bm);
	       	fruit(Items.field_151156_bN, ConfigInit.starRate, ItemMod.fruit_star);
	    }
	    if(ConfigInit.string == true){
	       	seed(ItemMod.seed_crop_string, Items.field_151007_F, ItemMod.fruit_start_monster, Items.field_151014_N);
	       	fruit(Items.field_151007_F, ConfigInit.stringRate, ItemMod.fruit_string);
	    }
	    if(ConfigInit.zombie == true){
	       	seed(ItemMod.seed_crop_zombie, Items.field_151078_bh, ItemMod.fruit_start_monster, Items.field_151014_N);
	       	fruit(Items.field_151078_bh, ConfigInit.zombieRate, ItemMod.fruit_zombie);
	    }
	    if(ConfigInit.orange == true){
	       	seed(ItemMod.seed_crop_orange, new ItemStack(Items.field_151100_aR, 1, 14), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.orangeRate, 14), ItemMod.fruit_orange);
	    }
	    if(ConfigInit.magenta == true){
	       	seed(ItemMod.seed_crop_magenta, new ItemStack(Items.field_151100_aR, 1, 13), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.magentaRate, 13), ItemMod.fruit_magenta);
	    }
	    if(ConfigInit.lightblue == true){
	       	seed(ItemMod.seed_crop_lightblue, new ItemStack(Items.field_151100_aR, 1, 12), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.lightblueRate, 12), ItemMod.fruit_lightblue);
	    }
	    if(ConfigInit.yellow == true){
	       	seed(ItemMod.seed_crop_yellow, new ItemStack(Items.field_151100_aR, 1, 11), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.yellowRate, 11), ItemMod.fruit_yellow);
	    }
	    if(ConfigInit.lime == true){
	       	seed(ItemMod.seed_crop_lime, new ItemStack(Items.field_151100_aR, 1, 10), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.limeRate, 10), ItemMod.fruit_lime);
	    }
	    if(ConfigInit.pink == true){
	       	seed(ItemMod.seed_crop_pink, new ItemStack(Items.field_151100_aR, 1, 9), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.pinkRate, 9), ItemMod.fruit_pink);
	    }
	    if(ConfigInit.gray == true){
	       	seed(ItemMod.seed_crop_gray, new ItemStack(Items.field_151100_aR, 1, 8), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.grayRate, 8), ItemMod.fruit_gray);
	    }
	    if(ConfigInit.silver == true){
	       	seed(ItemMod.seed_crop_silver, new ItemStack(Items.field_151100_aR, 1, 7), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.silverRate, 7), ItemMod.fruit_silver);
	    }
	    if(ConfigInit.cyan == true){
	       	seed(ItemMod.seed_crop_cyan, new ItemStack(Items.field_151100_aR, 1, 6), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.cyanRate, 6), ItemMod.fruit_cyan);
	    }
	    if(ConfigInit.purple == true){
	       	seed(ItemMod.seed_crop_purple, new ItemStack(Items.field_151100_aR, 1, 5), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.purpleRate, 5), ItemMod.fruit_purple);
	    }
	    if(ConfigInit.brown == true){
	       	seed(ItemMod.seed_crop_brown, new ItemStack(Items.field_151100_aR, 1, 3), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.brownRate, 3), ItemMod.fruit_brown);
	    }
	    if(ConfigInit.green == true){
	       	seed(ItemMod.seed_crop_green, new ItemStack(Items.field_151100_aR, 1, 2), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.greenRate, 2), ItemMod.fruit_green); 	
	    }
	    if(ConfigInit.red == true){
	       	seed(ItemMod.seed_crop_red, new ItemStack(Items.field_151100_aR, 1, 1), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.redRate, 1), ItemMod.fruit_red);
	    }
	    if(ConfigInit.black == true){  
	       	seed(ItemMod.seed_crop_black, new ItemStack(Items.field_151100_aR, 1, 0), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151100_aR, ConfigInit.blackRate, 0), ItemMod.fruit_black);
	    }
	    if(ConfigInit.vine == true){
	       	seed(ItemMod.seed_crop_vine, new ItemStack(Blocks.field_150395_bd), ItemMod.fruit_start_natural, Items.field_151014_N);
	       	fruit(new ItemStack(Blocks.field_150395_bd, ConfigInit.vineRate), ItemMod.fruit_vine);
	    }
	    if(ConfigInit.lilypad == true){
	       	seed(ItemMod.seed_crop_lilypad, new ItemStack(Blocks.field_150392_bi), ItemMod.fruit_start_natural, Items.field_151014_N);
	       	fruit(new ItemStack(Blocks.field_150392_bi, ConfigInit.lilypadRate), ItemMod.fruit_cristal);
	    }
	    if(ConfigInit.tallgrass == true){
	       	seed(ItemMod.seed_crop_tallgrass, new ItemStack(Blocks.field_150398_cm, 1, 2), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Blocks.field_150398_cm, ConfigInit.tallgrassRate, 2), ItemMod.fruit_tallgrass);
	    }
	    if(ConfigInit.largefern == true){
	     	seed(ItemMod.seed_crop_tallgrass, new ItemStack(Blocks.field_150398_cm, 1, 3), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Blocks.field_150398_cm, ConfigInit.largefernRate, 3), ItemMod.fruit_tallgrass);
	    }
	    if(ConfigInit.bush == true){
	       	seed(ItemMod.seed_crop_bush, new ItemStack(Blocks.field_150330_I), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Blocks.field_150330_I, ConfigInit.bushRate), ItemMod.fruit_bush);
	    }
	    if(ConfigInit.grass1 == true){
	       	seed(ItemMod.seed_crop_grass1, new ItemStack(Blocks.field_150329_H, 1, 1), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Blocks.field_150329_H, ConfigInit.grass1Rate, 1), ItemMod.fruit_grass1);
	    }
	    if(ConfigInit.fern == true){
	    	seed(ItemMod.seed_crop_grass1, new ItemStack(Blocks.field_150329_H, 1, 2), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Blocks.field_150329_H, ConfigInit.fernRate, 2), ItemMod.fruit_grass1);
	    }
	    if(ConfigInit.oak == true){
	       	seed(ItemMod.seed_crop_oak, new ItemStack(Blocks.field_150345_g, 1, 0), ItemMod.fruit_start_natural, Items.field_151014_N);
	       	fruit(new ItemStack(Blocks.field_150345_g, ConfigInit.oakRate, 0), ItemMod.fruit_oak);
	    }
	    if(ConfigInit.birch == true){
	    	seed(ItemMod.seed_crop_birch, new ItemStack(Blocks.field_150345_g, 1, 2), ItemMod.fruit_start_natural, Items.field_151014_N);
	       	fruit(new ItemStack(Blocks.field_150345_g, ConfigInit.birchRate, 2), ItemMod.fruit_birch);
	    }
	    if(ConfigInit.spruce == true){
	    	seed(ItemMod.seed_crop_spruce, new ItemStack(Blocks.field_150345_g, 1, 1), ItemMod.fruit_start_natural, Items.field_151014_N);
	       	fruit(new ItemStack(Blocks.field_150345_g, ConfigInit.spruceRate, 1), ItemMod.fruit_spruce);
	    }
	    if(ConfigInit.jungle == true){
	    	seed(ItemMod.seed_crop_jungle, new ItemStack(Blocks.field_150345_g, 1, 3), ItemMod.fruit_start_natural, Items.field_151014_N);
	       	fruit(new ItemStack(Blocks.field_150345_g, ConfigInit.jungleRate, 3), ItemMod.fruit_jungle);
	    }
	    if(ConfigInit.darkoak == true){
	    	seed(ItemMod.seed_crop_darkoak, new ItemStack(Blocks.field_150345_g, 1, 5), ItemMod.fruit_start_natural, Items.field_151014_N);
	       	fruit(new ItemStack(Blocks.field_150345_g, ConfigInit.darkoakRate, 5), ItemMod.fruit_darkoak);
	    }
	    if(ConfigInit.acacia == true){
	    	seed(ItemMod.seed_crop_acacia, new ItemStack(Blocks.field_150345_g, 1, 4), ItemMod.fruit_start_natural, Items.field_151014_N);
	       	fruit(new ItemStack(Blocks.field_150345_g, ConfigInit.acaciaRate, 4), ItemMod.fruit_acacia);
	    }
	    if(ConfigInit.apple == true){
	       	seed(ItemMod.seed_crop_apple, Items.field_151034_e, ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(Items.field_151034_e, ConfigInit.appleRate, ItemMod.fruit_apple);
	    }
	    if(ConfigInit.goldenapple == true){
	       	seed(ItemMod.seed_crop_goldenapple, Items.field_151153_ao, ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(Items.field_151153_ao, ConfigInit.goldenappleRate, ItemMod.fruit_goldenapple);
	    }
	    if(ConfigInit.bread == true){
	       	seed(ItemMod.seed_crop_bread, Items.field_151025_P, ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(Items.field_151025_P, ConfigInit.breadRate, ItemMod.fruit_bread);
	    }
	    if(ConfigInit.egg == true){
	       	seed(ItemMod.seed_crop_egg, Items.field_151110_aK, ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(Items.field_151110_aK, ConfigInit.eggRate, ItemMod.fruit_egg);
	    }
	   	if(ConfigInit.clownfish == true){
	       	seed(ItemMod.seed_crop_clownfish, new ItemStack(Items.field_151115_aP, 1, 2), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151115_aP, ConfigInit.clownfishRate, 2), ItemMod.fruit_clownfish);
	   	}
	   	if(ConfigInit.pufferfish == true){
	       	seed(ItemMod.seed_crop_pufferfish, new ItemStack(Items.field_151115_aP, 1, 3), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151115_aP, ConfigInit.pufferfishRate, 3), ItemMod.fruit_pufferfish);
	   	}
	   	if(ConfigInit.cookie == true){
	       	seed(ItemMod.seed_crop_cookie, Items.field_151106_aX, ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(Items.field_151106_aX, ConfigInit.cookieRate, ItemMod.fruit_cookie);
	   	}
	   	if(ConfigInit.chorus == true){
	       	seed(ItemMod.seed_crop_chorus, Items.field_185161_cS, ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(Items.field_185161_cS, ConfigInit.chorusRate, ItemMod.fruit_chorus);
	   	}
	   	if(ConfigInit.rawporc == true){
	       	seed(ItemMod.seed_crop_rawporc, Items.field_151147_al, ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(Items.field_151147_al, ConfigInit.rawporcRate, ItemMod.fruit_rawporc);
	   	}
	   	if(ConfigInit.rawbeef == true){
	       	seed(ItemMod.seed_crop_rawbeef, Items.field_151082_bd, ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(Items.field_151082_bd, ConfigInit.rawbeefRate, ItemMod.fruit_rawbeef);
	   	}
	   	if(ConfigInit.fish == true){
	   		seed(ItemMod.seed_crop_fish, new ItemStack(Items.field_151115_aP, 1, 0), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151115_aP, ConfigInit.fishRate, 0), ItemMod.fruit_pufferfish);
	   	}
	   	if(ConfigInit.salmon == true){
	   		seed(ItemMod.seed_crop_salmon, new ItemStack(Items.field_151115_aP, 1, 1), ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(new ItemStack(Items.field_151115_aP, ConfigInit.salmonRate, 1), ItemMod.fruit_salmon);
	   	}
	   	if(ConfigInit.rawchicken == true){
	       	seed(ItemMod.seed_crop_rawchicken, Items.field_151076_bf, ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(Items.field_151076_bf, ConfigInit.rawchickenRate, ItemMod.fruit_rawchicken);
	   	}
	   	if(ConfigInit.rawrabbit == true){
	       	seed(ItemMod.seed_crop_rawrabbit, Items.field_179558_bo, ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(Items.field_179558_bo, ConfigInit.rawrabbitRate, ItemMod.fruit_rawrabbit);
	   	}
	   	if(ConfigInit.rawmutton == true){
	       	seed(ItemMod.seed_crop_rawmutton, Items.field_179561_bm, ItemMod.fruit_start, Items.field_151014_N);
	       	fruit(Items.field_179561_bm, ConfigInit.rawmuttonRate, ItemMod.fruit_rawmutton);
	   	}
	   	if(ConfigInit.totem == true){
	       	seed(ItemMod.seed_crop_totem, Items.field_190929_cY, ItemMod.fruit_diamond, ItemMod.seed_crop_diamond);
	       	fruit(Items.field_190929_cY, ConfigInit.totemRate, ItemMod.fruit_totem);
	   	}
	   	
	   	ShapelessOreRecipe(new ItemStack(BlockMod.block_ritual_debug, 1), new ItemStack(Blocks.field_150346_d));	
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
        ResourceLocation resourceLocation = new ResourceLocation(modid, output.func_77973_b().getRegistryName().func_110623_a());
        ResourceLocation location = resourceLocation;
        int i = 0;

        while(CraftingManager.field_193380_a.func_148741_d(location)){
            i++;
            location = new ResourceLocation(modid, resourceLocation.func_110623_a() + "_" + i);
        }
        
        return location;
    }
}
