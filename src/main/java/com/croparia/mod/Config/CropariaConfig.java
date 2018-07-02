package com.croparia.mod.Config;

import java.io.File;

import com.croparia.mod.Reference;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CropariaConfig 
{	
	public static boolean enableBonemeal;

	public static void config()
	{
		Configuration config = new Configuration(new File("config/Croparia/Croparia.cfg"));
		config.load();
		
		//Crops
        ConfigInit.clay = config.get("Crops", "Implement Clay Crop ?", true).getBoolean();
        ConfigInit.glowstone = config.get("Crops", "Implement Glowstone Crop ?", true).getBoolean(); 
        ConfigInit.quartz = config.get("Crops", "Implement Quartz Crop ?", true).getBoolean(); 
        ConfigInit.shard = config.get("Crops", "Implement Shard Crop ?", true).getBoolean(); 
        ConfigInit.cristal = config.get("Crops", "Implement Cristal Crop ?", true).getBoolean();
        ConfigInit.ender = config.get("Crops", "Implement Ender Crop ?", true).getBoolean();
        ConfigInit.bone = config.get("Crops", "Implement Bone Crop ?", true).getBoolean();
        ConfigInit.eye = config.get("Crops", "Implement Spider Eye Crop ?", true).getBoolean();
        ConfigInit.powder = config.get("Crops", "Implement Powder Crop ?", true).getBoolean();
        ConfigInit.paper = config.get("Crops", "Implement Paper Crop ?", true).getBoolean();
        ConfigInit.sugar = config.get("Crops", "Implement Sugar Crop ?", true).getBoolean();
        ConfigInit.charcoal = config.get("Crops", "Implement Charcoal Crop ?", true).getBoolean();
        ConfigInit.flint = config.get("Crops", "Implement Flint Crop ?", true).getBoolean();
        ConfigInit.snowball = config.get("Crops", "Implement Snowball Crop ?", true).getBoolean();
        ConfigInit.firework = config.get("Crops", "Implement Firework Star Crop ?", true).getBoolean();
        ConfigInit.nether = config.get("Crops", "Implement Netherbrick Crop ?", true).getBoolean();
        ConfigInit.bottle = config.get("Crops", "Implement Bottle Crop ?", true).getBoolean();
        ConfigInit.foot = config.get("Crops", "Implement Rabbit's Foot Crop ?", true).getBoolean();
        ConfigInit.hide = config.get("Crops", "Implement Rabbit's Hide Crop ?", true).getBoolean();
        ConfigInit.leather = config.get("Crops", "Implement Leather Crop ?", true).getBoolean();
        ConfigInit.feather = config.get("Crops", "Implement Feather Crop ?", true).getBoolean();                       
        ConfigInit.blaze = config.get("Crops", "Implement Blaze Rod Crop ?", true).getBoolean();
        ConfigInit.ghast = config.get("Crops", "Implement Ghast Tear Crop ?", true).getBoolean();
        ConfigInit.magma = config.get("Crops", "Implement Magma Cream Crop ?", true).getBoolean();
        ConfigInit.shell = config.get("Crops", "Implement Shulker Shell Crop ?", true).getBoolean();
        ConfigInit.slime = config.get("Crops", "Implement Slime Ball Crop ?", true).getBoolean();
        ConfigInit.star = config.get("Crops", "Implement Netehr Star Crop ?", true).getBoolean();
        ConfigInit.string = config.get("Crops", "Implement String Crop ?", true).getBoolean();
        ConfigInit.zombie = config.get("Crops", "Implement Rottenflesh Crop ?", true).getBoolean();
        ConfigInit.orange = config.get("Crops", "Implement Orange Crop ?", true).getBoolean();
        ConfigInit.magenta = config.get("Crops", "Implement Magenta Crop ?", true).getBoolean();
        ConfigInit.lightblue = config.get("Crops", "Implement Light Blue Crop ?", true).getBoolean();
        ConfigInit.yellow = config.get("Crops", "Implement Yellow Crop ?", true).getBoolean();
        ConfigInit.lime = config.get("Crops", "Implement Lime Crop ?", true).getBoolean();
        ConfigInit.pink = config.get("Crops", "Implement Pink Crop ?", true).getBoolean();
        ConfigInit.gray = config.get("Crops", "Implement Gray Crop ?", true).getBoolean();
        ConfigInit.silver = config.get("Crops", "Implement Light Gray Crop ?", true).getBoolean();
        ConfigInit.cyan = config.get("Crops", "Implement Cyan Crop ?", true).getBoolean();
        ConfigInit.purple = config.get("Crops", "Implement Purple Crop ?", true).getBoolean();
        ConfigInit.brown = config.get("Crops", "Implement Brown Crop ?", true).getBoolean();
        ConfigInit.green = config.get("Crops", "Implement Green Crop ?", true).getBoolean();
        ConfigInit.red = config.get("Crops", "Implement Red Crop ?", true).getBoolean();
        ConfigInit.black = config.get("Crops", "Implement Black Crop ?", true).getBoolean();                       
        ConfigInit.vine = config.get("Crops", "Implement Vine Crop ?", true).getBoolean();
        ConfigInit.lilypad = config.get("Crops", "Implement Lilypad Crop ?", true).getBoolean();
        ConfigInit.tallgrass = config.get("Crops", "Implement Double Tallgrass Crop ?", true).getBoolean();
        ConfigInit.largefern = config.get("Crops", "Implement Largefern Crop ?", true).getBoolean();
        ConfigInit.bush = config.get("Crops", "Implement Dead Bush Crop ?", true).getBoolean();
        ConfigInit.grass1 = config.get("Crops", "Implement Grass Crop ?", true).getBoolean();
        ConfigInit.fern = config.get("Crops", "Implement Fern Crop ?", true).getBoolean();
        ConfigInit.oak = config.get("Crops", "Implement Oak Sapling Crop ?", true).getBoolean();
        ConfigInit.birch = config.get("Crops", "Implement Birch Sapling Crop ?", true).getBoolean();
        ConfigInit.spruce = config.get("Crops", "Implement Spruce Sapling Crop ?", true).getBoolean();
        ConfigInit.jungle = config.get("Crops", "Implement Jungle Sapling Crop ?", true).getBoolean();
        ConfigInit.darkoak = config.get("Crops", "Implement Darkoak Sapling Crop ?", true).getBoolean();
        ConfigInit.acacia = config.get("Crops", "Implement Acacia Sapling Crop ?", true).getBoolean();
        ConfigInit.apple = config.get("Crops", "Implement Apple Crop ?", true).getBoolean();
        ConfigInit.goldenapple = config.get("Crops", "Implement Golden Apple Crop ?", true).getBoolean();
        ConfigInit.bread = config.get("Crops", "Implement Bread Crop ?", true).getBoolean();
        ConfigInit.egg = config.get("Crops", "Implement Egg Crop ?", true).getBoolean();
        ConfigInit.clownfish = config.get("Crops", "Implement Clown Fish Crop ?", true).getBoolean();
        ConfigInit.pufferfish = config.get("Crops", "Implement Puffer Fish Crop ?", true).getBoolean();
        ConfigInit.cookie = config.get("Crops", "Implement Cookie Crop ?", true).getBoolean();
        ConfigInit.chorus = config.get("Crops", "Implement Chorus Fruit Crop ?", true).getBoolean();
        ConfigInit.rawporc = config.get("Crops", "Implement Raw Porc Crop ?", true).getBoolean();
        ConfigInit.rawbeef = config.get("Crops", "Implement Raw Beef Crop ?", true).getBoolean();
        ConfigInit.fish = config.get("Crops", "Implement Fish Crop ?", true).getBoolean();
        ConfigInit.salmon = config.get("Crops", "Implement Salmon Crop ?", true).getBoolean();
        ConfigInit.rawchicken = config.get("Crops", "Implement Raw Chicken Crop ?", true).getBoolean();
        ConfigInit.rawrabbit = config.get("Crops", "Implement Raw Rabbit Crop ?", true).getBoolean();
        ConfigInit.rawmutton = config.get("Crops", "Implement Raw Mutton Crop ?", true).getBoolean();
        ConfigInit.death = config.get("Crops", "Implement Death Crop ?", true).getBoolean();
        ConfigInit.totem = config.get("Crops", "Implement Totem Crop ?", true).getBoolean();
        ConfigInit.lead2 = config.get("Crops", "Implement Lead Crop ?", true).getBoolean();
        ConfigInit.nametag = config.get("Crops", "Implement Name Tag Crop ?", true).getBoolean();
	   	
	   	//Fruit drop rate
        ConfigInit.clayRate = config.get("Fruit Drop Rate", "Clay Drop Rate", 2).getInt();
        ConfigInit.glowstoneRate = config.get("Fruit Drop Rate", "Glowstone Drop Rate", 4).getInt(); 
        ConfigInit.quartzRate = config.get("Fruit Drop Rate", "Quartz Drop Rate", 2).getInt(); 
        ConfigInit.shardRate = config.get("Fruit Drop Rate", "Shard Drop Rate", 2).getInt(); 
        ConfigInit.cristalRate = config.get("Fruit Drop Rate", "Crystal Drop Rate", 2).getInt();
        ConfigInit.enderRate = config.get("Fruit Drop Rate", "Ender Drop Rate", 2).getInt();
        ConfigInit.boneRate = config.get("Fruit Drop Rate", "Bone Drop Rate", 2).getInt();
        ConfigInit.eyeRate = config.get("Fruit Drop Rate", "Eye Drop Rate", 2).getInt();
        ConfigInit.powderRate = config.get("Fruit Drop Rate", "Gunpowder Drop Rate", 2).getInt();
        ConfigInit.paperRate = config.get("Fruit Drop Rate", "Paper Drop Rate", 4).getInt();
        ConfigInit.sugarRate = config.get("Fruit Drop Rate", "Sugar Drop Rate", 4).getInt();
        ConfigInit.charcoalRate = config.get("Fruit Drop Rate", "Charcoal Drop Rate", 2).getInt();
        ConfigInit.flintRate = config.get("Fruit Drop Rate", "Flint Drop Rate", 2).getInt();
        ConfigInit.snowballRate = config.get("Fruit Drop Rate", "Snowball Drop Rate", 8).getInt();
        ConfigInit.fireworkRate = config.get("Fruit Drop Rate", "Firework Drop Rate", 4).getInt();
        ConfigInit.netherRate = config.get("Fruit Drop Rate", "Nether Drop Rate", 4).getInt();
        ConfigInit.bottleRate = config.get("Fruit Drop Rate", "Bottle Drop Rate", 4).getInt();
        ConfigInit.footRate = config.get("Fruit Drop Rate", "Rabbit's Foot Drop Rate", 2).getInt();
        ConfigInit.hideRate = config.get("Fruit Drop Rate", "Rabbit's Hide Drop Rate", 2).getInt();
        ConfigInit.leatherRate = config.get("Fruit Drop Rate", "Leather Drop Rate", 2).getInt();
        ConfigInit.featherRate = config.get("Fruit Drop Rate", "Feather Drop Rate", 3).getInt();                       
        ConfigInit.blazeRate = config.get("Fruit Drop Rate", "Blaze Drop Rate", 2).getInt();
        ConfigInit.ghastRate = config.get("Fruit Drop Rate", "Ghast Drop Rate", 2).getInt();
        ConfigInit.magmaRate = config.get("Fruit Drop Rate", "Magma Drop Rate", 3).getInt();
        ConfigInit.shellRate = config.get("Fruit Drop Rate", "Shell Drop Rate", 2).getInt();
        ConfigInit.slimeRate = config.get("Fruit Drop Rate", "Slime Drop Rate", 3).getInt();
        ConfigInit.starRate = config.get("Fruit Drop Rate", "Nether Star Drop Rate", 2).getInt();
        ConfigInit.stringRate = config.get("Fruit Drop Rate", "String Drop Rate", 2).getInt();
        ConfigInit.zombieRate = config.get("Fruit Drop Rate", "Zombie Drop Rate", 2).getInt();
        ConfigInit.orangeRate = config.get("Fruit Drop Rate", "Orange Drop Rate", 4).getInt();
        ConfigInit.magentaRate = config.get("Fruit Drop Rate", "Magenta Drop Rate", 4).getInt();
        ConfigInit.lightblueRate = config.get("Fruit Drop Rate", "Light Blue Drop Rate", 4).getInt();
        ConfigInit.yellowRate = config.get("Fruit Drop Rate", "Yellow Drop Rate", 4).getInt();
        ConfigInit.limeRate = config.get("Fruit Drop Rate", "Lime Drop Rate", 4).getInt();
        ConfigInit.pinkRate = config.get("Fruit Drop Rate", "Pink Drop Rate", 4).getInt();
        ConfigInit.grayRate = config.get("Fruit Drop Rate", "Gray Drop Rate", 4).getInt();
        ConfigInit.silverRate = config.get("Fruit Drop Rate", "Silver Drop Rate", 4).getInt();
        ConfigInit.cyanRate = config.get("Fruit Drop Rate", "Cyan Drop Rate", 4).getInt();
        ConfigInit.purpleRate = config.get("Fruit Drop Rate", "Purple Drop Rate", 4).getInt();
        ConfigInit.brownRate = config.get("Fruit Drop Rate", "Brown Drop Rate", 4).getInt();
        ConfigInit.greenRate = config.get("Fruit Drop Rate", "Green Drop Rate", 4).getInt();
        ConfigInit.redRate = config.get("Fruit Drop Rate", "Red Drop Rate", 4).getInt();
        ConfigInit.blackRate = config.get("Fruit Drop Rate", "Black Drop Rate", 4).getInt();                       
        ConfigInit.vineRate = config.get("Fruit Drop Rate", "Vine Drop Rate", 2).getInt();
        ConfigInit.lilypadRate = config.get("Fruit Drop Rate", "Lilypad Drop Rate", 2).getInt();
        ConfigInit.tallgrassRate = config.get("Fruit Drop Rate", "Double Tall Grass Drop Rate", 2).getInt();
        ConfigInit.largefernRate = config.get("Fruit Drop Rate", "Large Fern Drop Rate", 2).getInt();
        ConfigInit.bushRate = config.get("Fruit Drop Rate", "Dead Bush Drop Rate", 2).getInt();
        ConfigInit.grass1Rate = config.get("Fruit Drop Rate", "Tall Grass Drop Rate", 2).getInt();
        ConfigInit.fernRate = config.get("Fruit Drop Rate", "Fern Drop Rate", 2).getInt();
        ConfigInit.oakRate = config.get("Fruit Drop Rate", "Oak Drop Rate", 2).getInt();
        ConfigInit.birchRate = config.get("Fruit Drop Rate", "Birch Drop Rate", 2).getInt();
        ConfigInit.spruceRate = config.get("Fruit Drop Rate", "Spruce Drop Rate", 2).getInt();
        ConfigInit.jungleRate = config.get("Fruit Drop Rate", "Jungle Drop Rate", 2).getInt();
        ConfigInit.darkoakRate = config.get("Fruit Drop Rate", "Dark Oak Drop Rate", 2).getInt();
        ConfigInit.acaciaRate = config.get("Fruit Drop Rate", "Acacia Drop Rate", 2).getInt();
        ConfigInit.appleRate = config.get("Fruit Drop Rate", "Apple Drop Rate", 2).getInt();
        ConfigInit.goldenappleRate = config.get("Fruit Drop Rate", "Golden Apple Drop Rate", 2).getInt();
        ConfigInit.breadRate = config.get("Fruit Drop Rate", "Bread Drop Rate", 2).getInt();
        ConfigInit.eggRate = config.get("Fruit Drop Rate", "Egg Drop Rate", 2).getInt();
       	ConfigInit.clownfishRate = config.get("Fruit Drop Rate", "Clown Drop Rate", 2).getInt();
       	ConfigInit.pufferfishRate = config.get("Fruit Drop Rate", "Puffer Fish Drop Rate", 2).getInt();
       	ConfigInit.cookieRate = config.get("Fruit Drop Rate", "Cookie Drop Rate", 2).getInt();
       	ConfigInit.chorusRate = config.get("Fruit Drop Rate", "Chorus Drop Rate", 2).getInt();
       	ConfigInit.rawporcRate = config.get("Fruit Drop Rate", "Raw Porc Drop Rate", 2).getInt();
       	ConfigInit.rawbeefRate = config.get("Fruit Drop Rate", "Raw Beef Drop Rate", 2).getInt();
       	ConfigInit.fishRate = config.get("Fruit Drop Rate", "Fish Drop Rate", 2).getInt();
       	ConfigInit.salmonRate = config.get("Fruit Drop Rate", "Salmon Drop Rate", 2).getInt();
       	ConfigInit.rawchickenRate = config.get("Fruit Drop Rate", "Raw Chicken Drop Rate", 2).getInt();
       	ConfigInit.rawrabbitRate = config.get("Fruit Drop Rate", "Raw Rabbit Drop Rate", 2).getInt();
       	ConfigInit.rawmuttonRate = config.get("Fruit Drop Rate", "Raw Mutton Drop Rate", 2).getInt();
       	ConfigInit.deathRate = config.get("Fruit Drop Rate", "Death Drop Rate", 2).getInt();
       	ConfigInit.totemRate = config.get("Fruit Drop Rate", "Totem Drop Rate", 2).getInt();
       	ConfigInit.lead2Rate = config.get("Fruit Drop Rate", "Lead Drop Rate", 2).getInt();
       	ConfigInit.nametagRate = config.get("Fruit Drop Rate", "Name Tag Drop Rate", 2).getInt();
	   	//Cane
	   	
	   	//Furnace
	   	
	   	//Stem
       	
       	//Other
        ConfigInit.enableBonemeal = config.get("Tools", "Allow the utilisation of bonemeal on crops ?", true).getBoolean();
		
		config.save();
	}
	
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	private static class EventHandler {

		/**
		 * Inject the new values and save to the config file when the config has been changed from the GUI.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(Reference.MOD_ID)) {
				ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
			}
		}
	}
}
