package com.cropariaCompat.mod.OreDic;



import com.croparia.mod.Reference;
import com.croparia.mod.Init.ItemMod;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeOreDictionaryRegistry 
{
	public static void register()
	{
		seedDic("ingotAluminium", ItemMod.seed_crop_aluminium, null, null);
		seedDic("ingotAluminum", ItemMod.seed_crop_aluminium, null, null);
		seedDic("ingotBrass", ItemMod.seed_crop_brass, null, null);
		seedDic("ingotBronze", ItemMod.seed_crop_bronze, null, null);
		seedDic("ingotChrome", ItemMod.seed_crop_chrome, null, null);
		seedDic("ingotCopper", ItemMod.seed_crop_copper, null, null);
		seedDic("ingotElectrum", ItemMod.seed_crop_electrum, null, null);
		seedDic("ingotInvar", ItemMod.seed_crop_invar, null, null);
		seedDic("ingotIridium", ItemMod.seed_crop_iridium, null, null);
		seedDic("ingotLead", ItemMod.seed_crop_lead, null, null);
		seedDic("ingotNickel", ItemMod.seed_crop_nickel, null, null);
		seedDic("ingotPlatinum", ItemMod.seed_crop_platinium, null, null);
		seedDic("ingotSilver", ItemMod.seed_crop_silveringot, null, null);
		seedDic("ingotSteel", ItemMod.seed_crop_steel, null, null);
		seedDic("ingotTin", ItemMod.seed_crop_tin, null, null);
		seedDic("ingotTitanium", ItemMod.seed_crop_titanium, null, null);
		seedDic("ingotTungsten", ItemMod.seed_crop_tungsten, null, null);
		seedDic("ingotZinc", ItemMod.seed_crop_zinc, null, null);		
		seedDic("ingotManasteel", ItemMod.seed_crop_manasteel, ItemMod.fruit_iron, ItemMod.seed_crop_iron);
		seedDic("ingotTerrasteel", ItemMod.seed_crop_terrasteel, ItemMod.fruit_manasteel, ItemMod.seed_crop_manasteel);
	    seedDic("ingotElvenElementium", ItemMod.seed_crop_elementium, ItemMod.fruit_terrasteel, ItemMod.seed_crop_terrasteel);
	    seedDic("manaDiamond", ItemMod.seed_crop_manadiamond, ItemMod.fruit_diamond, ItemMod.seed_crop_diamond);
	    seedDic("manaPearl", ItemMod.seed_crop_manapearl, ItemMod.fruit_ender, ItemMod.seed_crop_ender);	
	    seedDic("elvenDragonstone", ItemMod.seed_crop_dragonstone, ItemMod.fruit_manadiamond, ItemMod.seed_crop_manadiamond);
		seedDic("gearWood", ItemMod.seed_crop_gearwood, ItemMod.fruit_start, Items.field_151014_N);
		seedDic("gearWood", ItemMod.seed_crop_gearwood, ItemMod.fruit_start, Items.field_185163_cU);
		seedDic("gearWood", ItemMod.seed_crop_gearwood, ItemMod.fruit_start, Items.field_151081_bc);
		seedDic("gearWood", ItemMod.seed_crop_gearwood, ItemMod.fruit_start, Items.field_151080_bb);	
		seedDic("gearStone", ItemMod.seed_crop_gearstone, ItemMod.fruit_gearwood, ItemMod.seed_crop_gearwood);	
		seedDic("gearIron", ItemMod.seed_crop_geariron, ItemMod.fruit_gearstone, ItemMod.seed_crop_gearstone);	
		seedDic("gearGold", ItemMod.seed_crop_geargold, ItemMod.fruit_geariron, ItemMod.seed_crop_geariron);	
		seedDic("gearDiamond", ItemMod.seed_crop_geardiamond, ItemMod.fruit_geargold, ItemMod.seed_crop_geargold);	
		seedDic("ingotYellorium", ItemMod.seed_crop_yellorium, null, null);	
		seedDic("ingotCyanite", ItemMod.seed_crop_cyanite, null, null);	
		seedDic("ingotBlutonium", ItemMod.seed_crop_blutonium, null, null);	
		seedDic("ingotGraphite", ItemMod.seed_crop_graphite, null, null);
		seedDic("ingotLudicrite", ItemMod.seed_crop_ludicrite, null, null);	
		seedDic("ingotEnderium", ItemMod.seed_crop_enderium, null, null);	
		seedDic("ingotLumium", ItemMod.seed_crop_lumium, null, null);	
		seedDic("ingotSignalum", ItemMod.seed_crop_signalum, null, null);	
		seedDic("ingotConstantan", ItemMod.seed_crop_constantan, null, null);
		seedDic("ingotMithril", ItemMod.seed_crop_mithril, null, null);	
		seedDic("ingotUranium", ItemMod.seed_crop_uranium, null, null);
		seedDic("gemApatite", ItemMod.seed_crop_apatite, ItemMod.fruit_coal, ItemMod.seed_crop_coal);	
		seedDic("itemSilicon", ItemMod.seed_crop_silicon, ItemMod.fruit_quartz, ItemMod.seed_crop_quartz);
		seedDic("ingotDraconium", ItemMod.seed_crop_draconium, null, null);
		seedDic("ingotDraconiumAwakened", ItemMod.seed_crop_draconium_awakened, ItemMod.fruit_diamond, ItemMod.seed_crop_diamond);
		
		
		
		
		fruitDic("ingotCopper", ItemMod.copper_ingot, ItemMod.fruit_copper);
		fruitDic("ingotAluminum", ItemMod.aluminium_ingot, ItemMod.fruit_aluminium);
		fruitDic("ingotAluminium", ItemMod.aluminium_ingot, ItemMod.fruit_aluminium);
        fruitDic("ingotBrass", ItemMod.brass_ingot, ItemMod.fruit_brass);
        fruitDic("ingotBronze", ItemMod.bronze_ingot, ItemMod.fruit_bronze);
        fruitDic("ingotChrome", ItemMod.chrome_ingot, ItemMod.fruit_chrome);
        fruitDic("ingotElectrum", ItemMod.electrum_ingot, ItemMod.fruit_electrum);
        fruitDic("ingotInvar", ItemMod.invar_ingot, ItemMod.fruit_invar);
        fruitDic("ingotIridium", ItemMod.iridium_ingot, ItemMod.fruit_iridium);
    	fruitDic("ingotLead", ItemMod.lead_ingot, ItemMod.fruit_lead);
    	fruitDic("ingotNickel", ItemMod.nickel_ingot, ItemMod.fruit_nickel);
    	fruitDic("ingotPlatinum", ItemMod.platinium_ingot, ItemMod.fruit_platinium);
    	fruitDic("ingotSilver", ItemMod.silver_ingot, ItemMod.fruit_silveringot);	
    	fruitDic("ingotSteel", ItemMod.steel_ingot, ItemMod.fruit_steel);
    	fruitDic("ingotTin", ItemMod.tin_ingot, ItemMod.fruit_tin);
    	fruitDic("ingotTitanium", ItemMod.titanium_ingot, ItemMod.fruit_titanium);
    	fruitDic("ingotTungsten", ItemMod.tungsten_ingot, ItemMod.fruit_tungsten);
    	fruitDic("ingotZinc", ItemMod.zinc_ingot, ItemMod.fruit_zinc);
    	fruitDic("ingotManasteel", ItemMod.ingot_manasteel, ItemMod.fruit_manasteel);
    	fruitDic("ingotTerrasteel", ItemMod.ingot_terrasteel, ItemMod.fruit_terrasteel);
    	fruitDic("ingotElvenElementium", ItemMod.ingot_elementium, ItemMod.fruit_elementium);
    	fruitDic("manaDiamond", ItemMod.mana_diamond, ItemMod.fruit_manadiamond);
    	fruitDic("manaPearl", ItemMod.mana_pearl, ItemMod.fruit_manapearl);
    	fruitDic("elvenDragonstone", ItemMod.dragonstone, ItemMod.fruit_dragonstone); 	
    	fruitDic("gearWood", ItemMod.gearwood, ItemMod.fruit_gearwood);
    	fruitDic("gearStone", ItemMod.gearstone, ItemMod.fruit_gearstone);
    	fruitDic("gearIron", ItemMod.geariron, ItemMod.fruit_geariron);
    	fruitDic("gearGold", ItemMod.geargold, ItemMod.fruit_geargold);
    	fruitDic("gearDiamond", ItemMod.geardiamond, ItemMod.fruit_geardiamond);
    	fruitDic("ingotYellorium", ItemMod.ingot_yellorium, ItemMod.fruit_yellorium);	
    	fruitDic("ingotCyanite", ItemMod.ingot_cyanite, ItemMod.fruit_cyanite);	
		fruitDic("ingotBlutonium", ItemMod.ingot_blutonium, ItemMod.fruit_blutonium);	
		fruitDic("ingotGraphite", ItemMod.ingot_graphite, ItemMod.fruit_graphite);
		fruitDic("ingotLudicrite", ItemMod.ingot_ludicrite, ItemMod.fruit_ludicrite);
		fruitDic("ingotEnderium", ItemMod.ingot_enderium, ItemMod.fruit_enderium);	
		fruitDic("ingotLumium", ItemMod.ingot_lumium, ItemMod.fruit_lumium);	
		fruitDic("ingotSignalum", ItemMod.ingot_signalum, ItemMod.fruit_signalum);	
		fruitDic("ingotConstantan", ItemMod.ingot_constantan, ItemMod.fruit_constantan);
		fruitDic("ingotMithril", ItemMod.ingot_mithril, ItemMod.fruit_mithril);	
		fruitDic("ingotUranium", ItemMod.ingot_uranium, ItemMod.fruit_uranium);
		fruitDic("gemApatite", ItemMod.gem_apatite, ItemMod.fruit_apatite);
		fruitDic("itemSilicon", ItemMod.silicon, ItemMod.fruit_silicon);
		fruitDic("ingotDraconium", ItemMod.ingot_draconium, ItemMod.fruit_draconium);
		fruitDic("ingotDraconiumAwakened", ItemMod.ingot_draconium_awakened, ItemMod.fruit_draconium_awakened);
	}
	
	public static void seedDic(String ore, Item output, Item fruit, Item seed)
	{
		if(OreDictionary.doesOreNameExist(ore))
		{
			if(fruit == null)
			{
				fruit = ItemMod.fruit_iron;
			}
			if(seed == null)
			{
				seed = ItemMod.seed_crop_iron;
			}
			ShapedOreRecipe(new ItemStack(output), new Object[] { "iIi", "ISI", "iIi", 'i', ore, 'S', fruit, 'I', seed});
		}
	}	
	
	public static void fruitDic(String ore, Item output, Item input)
	{
		if(OreDictionary.doesOreNameExist(ore))
		{
			ShapelessOreRecipe(new ItemStack(output, 2), new ItemStack(input));
		}
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
