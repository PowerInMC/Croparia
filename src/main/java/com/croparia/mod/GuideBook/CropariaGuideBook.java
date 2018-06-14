package com.croparia.mod.GuideBook;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.BlockMod;
import com.croparia.mod.Init.ItemMod;
import com.croparia.mod.Init.Registry.CreativeTabsRegistry;
import com.croparia.mod.World.Dim.AirDim;
import com.croparia.mod.World.Dim.EarthDim;
import com.croparia.mod.World.Dim.FireDim;
import com.croparia.mod.World.Dim.WaterDim;
import com.cropariaCompat.mod.OreDic.RecipeOreDictionaryRegistry;

import amerifrance.guideapi.api.GuideAPI;
import amerifrance.guideapi.api.GuideBook;
import amerifrance.guideapi.api.IGuideBook;
import amerifrance.guideapi.api.IPage;
import amerifrance.guideapi.api.impl.Book;
import amerifrance.guideapi.api.impl.abstraction.CategoryAbstract;
import amerifrance.guideapi.api.impl.abstraction.EntryAbstract;
import amerifrance.guideapi.category.CategoryItemStack;
import amerifrance.guideapi.entry.EntryItemStack;
import amerifrance.guideapi.page.PageFurnaceRecipe;
import amerifrance.guideapi.page.PageIRecipe;
import amerifrance.guideapi.page.PageImage;
import amerifrance.guideapi.page.PageText;
import amerifrance.guideapi.page.PageTextImage;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

@GuideBook
public class CropariaGuideBook implements IGuideBook {

    public static Book myGuide;

    @Nonnull
    @Override
    public Book buildBook() {
        // Create the map of entries. A LinkedHashMap is used to retain the order of entries.
        Map<ResourceLocation, EntryAbstract> entries1 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries2 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries3 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries4 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries5 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries6 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries7 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries8 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries9 = new LinkedHashMap<ResourceLocation, EntryAbstract>();

        /**1st Entrie */
        // Creation of our 1st page.
        List<IPage> pages1 = new ArrayList<IPage>();
        pages1.add(new PageText("ADVERTISING : This guide was written by a french, so if they are mistakes, please report then on Curse. All the craft are not listed here, to see them, use JEI"));
        pages1.add(new PageText("To start in Croparia, you need some seeds and diamonds: with 5 Diamonds and 4 Seeds you need to make the Defacto's fruit. Without it, you can't do anything"));
        pages1.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("seedStart"), ItemMod.fruit_start, new Object[] { "iIi", "IiI", "iIi", 'i', Items.DIAMOND, 'I', Items.WHEAT_SEEDS})));   
        pages1.add(new PageText("But there is 3 other fruit to start other type of crops : the Natural Fruit, the Mob Fruit and the Monster Fruit..."));  
        pages1.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("seedNatural"), ItemMod.fruit_start_natural, new Object[] { "OIS", "IPI", "BIJ", 'P', ItemMod.fruit_start, 'I', Items.WHEAT_SEEDS, 'O', new ItemStack(Blocks.SAPLING, 1, 0), 'S', new ItemStack(Blocks.SAPLING, 1, 1), 'B', new ItemStack(Blocks.SAPLING, 1, 2), 'J', new ItemStack(Blocks.SAPLING, 1, 3)})));   
        pages1.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("seedMob"), ItemMod.fruit_start_mob, new Object[] { "FIL", "IPI", "HIF", 'P', ItemMod.fruit_start, 'I', Items.WHEAT_SEEDS, 'F', Items.FEATHER, 'L', Items.LEATHER, 'H', Items.RABBIT_HIDE})));   
        pages1.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("seedMonster"), ItemMod.fruit_start_monster, new Object[] { "RIE", "IiI", "GIB", 'i', Items.DIAMOND, 'I', Items.WHEAT_SEEDS, 'R', Items.ROTTEN_FLESH, 'E', Items.SPIDER_EYE, 'G', Items.GUNPOWDER, 'B', Items.BONE})));     
        entries1.put(new ResourceLocation(Reference.MOD_ID, "entry1"), new EntryItemStack(pages1, "First Fruit", new ItemStack(ItemMod.fruit_start)));

        // Creation of our 2nd page.
        List<IPage> pages2 = new ArrayList<IPage>();
        pages2.add(new PageText("To make the diamond crop (because I know you want the diamond crop) you must have the coal crop (=coara crop). You can find it in the world or make it"));
        pages2.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("seedCoal"), ItemMod.seed_crop_coal, new Object[] {  "ISI","SPS",  "ISI",  'P', ItemMod.fruit_start, 'S', Items.WHEAT_SEEDS, 'I', new ItemStack(Items.COAL, 1, 0)})));     
        pages2.add(new PageText("Now you can see your fabulous plant grow and give you some Coara Fruit ! Wait... Coara Fruit... what is that ...?"));
        entries1.put(new ResourceLocation(Reference.MOD_ID, "entry2"), new EntryItemStack(pages2, "Resource Crop", new ItemStack(ItemMod.seed_crop_coal)));

        // Creation of our 3rd page.
        List<IPage> pages3 = new ArrayList<IPage>();
        pages3.add(new PageText("All the crop will give you two fings : Some plant's seed, and some plant's fruit. Fruits give you the resource and allow  you to upgrade your crops"));
        pages3.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("fruitCoal"), new ItemStack(Items.COAL, 1, 0), new Object[] {  "   "," F ",  "   ",  'F', ItemMod.fruit_coal})));     
        pages3.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("seedIron"), ItemMod.seed_crop_iron, new Object[] {  "ISI","SPS",  "ISI",  'P', ItemMod.fruit_coal, 'S', ItemMod.seed_crop_coal, 'I', Items.IRON_INGOT})));     
        entries1.put(new ResourceLocation(Reference.MOD_ID, "entry3"), new EntryItemStack(pages3, "Fruits", new ItemStack(ItemMod.fruit_coal)));
        
        // Creation of our 4th page.
        List<IPage> pages4 = new ArrayList<IPage>();
        pages4.add(new PageTextImage("Some fruit are dropped by grass like banana, cherry, pear... With them, you can craft some pies.", loc("banana"), true));
        pages4.add(new PageText("An other thing, if you place a milk bucket in a furnace, it will give you a cheese. With it you can craft a -raclette- (a french dish that we eat during winter)"));
        pages4.add(new PageFurnaceRecipe(Items.MILK_BUCKET));
        pages4.add(new PageIRecipe(new ShapelessOreRecipe(new ResourceLocation("raclette"), ItemMod.raclette, new Object[] {ItemMod.cheese, Items.BAKED_POTATO, Items.PORKCHOP, Items.BOWL})));     
        entries1.put(new ResourceLocation(Reference.MOD_ID, "entry4"), new EntryItemStack(pages4, "Foods", new ItemStack(ItemMod.raclette)));

        /**2nd Entrie */
        // Creation of our 5th page.
        List<IPage> pages5 = new ArrayList<IPage>();
        pages5.add(new PageText("In Croparia you can play with Elements (Air, Water, Fire, Earth). But first of all, you need to make the Elematilius Seed !"));
        pages5.add(new PageIRecipe(new ShapelessOreRecipe(new ResourceLocation("seedElemental"), ItemMod.elemental_seed, new Object[] {ItemMod.seed_crop_coal, ItemMod.seed_crop_iron, ItemMod.seed_crop_gold, ItemMod.seed_crop_redstone, ItemMod.seed_crop_lapis, ItemMod.seed_crop_diamond, ItemMod.seed_crop_diamond, ItemMod.seed_crop_emerald, ItemMod.seed_crop_emerald})));     
        pages5.add(new PageText("And then, craft some elements to make armor, tools, elemental stone and elemental block. Yes, craft some of them..."));
        pages5.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("water"), ItemMod.elemental_water, new Object[] {"X#X", "###", "X#X", 'X', Items.WATER_BUCKET, '#', ItemMod.elemental_fragment})));     
        pages5.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("earth"), ItemMod.elemental_earth, new Object[] {"X#X", "###", "X#X", 'X', new ItemStack(Blocks.LEAVES, 1, 0), '#', ItemMod.elemental_fragment}))); 
        pages5.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("fire"), ItemMod.elemental_fire, new Object[] {"X#X", "###", "X#X", 'X', Items.FLINT_AND_STEEL, '#', ItemMod.elemental_fragment}))); 
        pages5.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("air"), ItemMod.elemental_air, new Object[] {"X#X", "###", "X#X", 'X', Items.GLASS_BOTTLE, '#', ItemMod.elemental_fragment}))); 
        
        entries2.put(new ResourceLocation(Reference.MOD_ID, "entry5"), new EntryItemStack(pages5, "Elemental Items", new ItemStack(ItemMod.elemental_seed)));

        // Creation of our 6th page.
        List<IPage> pages6 = new ArrayList<IPage>();
        pages6.add(new PageText("To make the first ritual, you need : 8 andesites, 8 diorites, 4 water buckets, 4 iron seeds, 4 gold seeds and 1 elemental cobblestones"));
        pages6.add(new PageImage(loc("ritual_1")));
        pages6.add(new PageText("Now to get special items, you must place something in the wholes around the elemental cobblestone : Gold Block to have Midas Hand, Nether Wart Block to have Horn of Plenty, Gold Block and hold"));
        pages6.add(new PageText("an apple in your off hand to have Infinite Apple, Bone Block and hold Water Bucket to have Boning Cane and Diamond Crop to have Death Seeds."));
        pages6.add(new PageTextImage("MIDAS HAND : With it, you can change all block of the game on 2 gold ingots and all entity on 1 gold block", loc("midas_hand"), false));
        pages6.add(new PageTextImage("HORN OF PLENTY : Right-Click on block make some food appear", loc("horn_plenty"), false));
        pages6.add(new PageTextImage("INFINITE APPLE : Eat it if you want, when you want and where you want.", loc("infinite_apple"), false));
        pages6.add(new PageTextImage("BONING CAN : A Watering Can filled with bonemeal: Use it, right click on Bone Block, and use it again", loc("water_can"), false));
        pages6.add(new PageTextImage("DEATH SEEDS : It makes Death Crop, Death Fruit and more Death seeds !", loc("seed_crop_death"), false));
        pages6.add(new PageText("When you are ready, place an Elemental Stone on the Elemental Cobblestonne..."));
        entries2.put(new ResourceLocation(Reference.MOD_ID, "entry6"), new EntryItemStack(pages6, "First ritual", new ItemStack(BlockMod.elemental_stone)));
        
        
        
        // Creation of our 7th page.
        List<IPage> pages7 = new ArrayList<IPage>();
        pages7.add(new PageText("To make the second ritual, you need : 40 andesites, 8 polished andesites, 8 water buckets, 8 elemental stones, 1 elemental cobblestones, 4 redstone seeds, 4 elemental seeds, and 1 of each element block"));
        pages7.add(new PageImage(loc("ritual_2")));
        pages7.add(new PageText("Now to summon special Mobs you need to replace the Diamond Blocks by the Elemental Block you want : Water to summon Seafarer, Earth to summon Centaur, Fire to summon Minotaur and Air to summon Flying Beast"
        		+ "When you are ready, place an Elemental Stone on the Elemental Cobblestone..."));
        pages7.add(new PageText("Order of Difficulty : Seafarer, Centaur, Minotaur, Flying Beast"));     
        pages7.add(new PageText("SEAFARER : A monster of Water, he is not really strong and not really powerful, but an Obsidian Stuff is recommanded"));
        pages7.add(new PageText("CENTAUR : A monster of Earth, he is a little bit strong and run really fast. You can't leave the fight, it's why a Renforced Stuff is recommanded or a Water Stuff"));
        pages7.add(new PageText("MINOTAUR : A monster of Fire, probably the stronger and the more powerful of Croparia's Mobs. An Elemental Stuff is recommanded"));
        pages7.add(new PageText("FLYING BEAST : A monster of Air, can fly an shoot fireball. An Elemental Stuff is recommanded"));
        entries2.put(new ResourceLocation(Reference.MOD_ID, "entry7"), new EntryItemStack(pages7, "Second ritual", new ItemStack(BlockMod.fire_block)));

        // Creation of our 8th page.
        List<IPage> pages8 = new ArrayList<IPage>();
        pages8.add(new PageText("To make the third ritual, you need : 60 nether brick, 36 nether brick slab, 12 magma block, 9 elemental cobblestones, 8 lava bucket, 12 death seeds, 8 soulsand, and 4 cobblestone slab"));
        pages8.add(new PageImage(loc("ritual_3")));
        pages8.add(new PageText("Now to summon The Reaper you need to place an Elemental Cobblestone on the Elemental Cobblestone..."));  
        pages8.add(new PageText("THE REAPER : A monster of Death, if he touch you, you will die. But if you kill The Reaper, it will give you his weapon"));
        pages8.add(new PageTextImage("SCYTHE : Hurt someone, and he will die. Absolutly everybody will die...", loc("scythe"), false));
        entries2.put(new ResourceLocation(Reference.MOD_ID, "entry8"), new EntryItemStack(pages8, "Third ritual", new ItemStack(BlockMod.reaper_spawn)));

        // Creation of our 9th page.
        List<IPage> pages9 = new ArrayList<IPage>();
        pages9.add(new PageText("MULTITOOL : The multitool can break all Vanilla and Croparia's Block. It exist in Wood, Stone, Iron, Gold, Diamond, Obsidian, Renforced, Fire, Water, Earth and Air"));
        pages9.add(new PageText("PESTLE : It allow you to make flour from wheat and bread from flour. How many flour ive the pestle ? It depend of the -tier- of your pestle (Wood Pestle give one Flour for 2 Wheat and Elemental Pestle: 12 Flour for 1 Wheat"));
        pages9.add(new PageText("All set of Elemental Stuff have an complete Armor, Sword, Pickaxe, Axe, Shovel, Hoe and Multitool but the Chestplate and the Sword are not craftable. You need to beat the monster of the element to get them (ex : Minotaur drop Fire Sword and Fire Chestplate, ..."));
        pages9.add(new PageText("ELEMENTAL HOE : It allow you to build a field by shift + richt click on grass or dirt.(9*9)"));
        pages9.add(new PageText("FIRE MULTITOOL : Like a Multitool but when you Shift + Right Click you place Lava and lose some life"));
        pages9.add(new PageText("WATER MULTITOOL : Like a Multitool but when you Shift + Right Click you place Water and lose some life"));
        pages9.add(new PageText("EARTH MULTITOOL : Like a Multitool but when you Shift + Right Click you clone the block lose loose some life"));
        pages9.add(new PageText("AIR MULTITOOL : Like a Multitool but when you Shift + Right Click you remove the block lose loose some life"));
        entries2.put(new ResourceLocation(Reference.MOD_ID, "entry9"), new EntryItemStack(pages9, "Tools", new ItemStack(ItemMod.fire_sword)));
        
        // Creation of our 10th page.
        List<IPage> pages10 = new ArrayList<IPage>();
        pages10.add(new PageText("WATER ARMOR : Single Piece -> Night Vision III. Full Set -> Night Vision III + Water Breathing III"));
        pages10.add(new PageText("EARTH ARMOR : Single Piece -> Resistance III. Full Set -> Resistance III + Regeneration I if player have less than 4 hearth"));
        pages10.add(new PageText("FIRE ARMOR : Single Piece -> Strength III. Full Set -> Fire Resistance III"));
        pages10.add(new PageText("AIR ARMOR : Single Piece -> Jump Boost II + Speed II. Full Set -> Jump Boost II + Speed II + Have Creative Fly"));
        entries2.put(new ResourceLocation(Reference.MOD_ID, "entry10"), new EntryItemStack(pages10, "Armors", new ItemStack(ItemMod.elemental_fire_chestplate)));
   
        // Creation of our 11th page.
        List<IPage> pages11 = new ArrayList<IPage>(); 
        pages11.add(new PageText("You want more resources ? Go make some Stem ! They are like melon or pumpkin, you make seeds, you see them grow, and they will give you the block of your resource ! It's a good investment"));  
        pages11.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("stem_coal"), ItemMod.seed_stem_coal, new Object[] {"XXX", "XXX", "XXX", 'X', ItemMod.seed_crop_coal}))); 
        pages11.add(new PageIRecipe(new ShapelessOreRecipe(new ResourceLocation("stem_coal2"), ItemMod.seed_stem_coal, new Object[] {Items.MELON_SEEDS, Blocks.COAL_BLOCK})));     
        entries3.put(new ResourceLocation(Reference.MOD_ID, "entry11"), new EntryItemStack(pages11, "Stem", new ItemStack(ItemMod.seed_stem_diamond)));
     
        // Creation of our 12th page.
        List<IPage> pages12 = new ArrayList<IPage>();
        pages12.add(new PageText("Some resources are not available in crop or stem, like cobble, sand, ... But Canes exist so make them to have other resource LIKE cobble, logs and more")); 
        pages12.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("cane_cobble"), BlockMod.block_cane_cobble, new Object[] {"CcC", "cFc", "CcC", 'C', Blocks.COBBLESTONE, 'c', Blocks.REEDS, 'F', ItemMod.fruit_start})));     
        entries3.put(new ResourceLocation(Reference.MOD_ID, "entry12"), new EntryItemStack(pages12, "Cane", new ItemStack(BlockMod.block_cane_cobble)));
     
        // Creation of our 13th page.
        List<IPage> pages13 = new ArrayList<IPage>();
        pages13.add(new PageText("In Minecraft, furnaces are not really fast. So it's why you can updgrade them thank's to fruits and make Coal Furnace, Iron Furnace... and the Fire Furnace..."));  
        pages13.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("coal_furnace"), BlockMod.coal_furnace, new Object[] {"CFC", "CfC", "CFC", 'C', new ItemStack(Items.COAL, 1, 0), 'F', ItemMod.fruit_coal, 'f', Blocks.FURNACE})));    
        entries3.put(new ResourceLocation(Reference.MOD_ID, "entry13"), new EntryItemStack(pages13, "Furnace", new ItemStack(BlockMod.fire_furnace)));

        // Creation of our 14th page.
        List<IPage> pages14 = new ArrayList<IPage>();
        pages14.add(new PageText("The Fourth Mob of the Second Ritual (Seafarer, Centaur, Minotaur and Flying Beast) are the Champions of their World, of their Dimension. Once you kill one of them, they will drop you a Dimension Opener"));  
        pages14.add(new PageText("Just create a portal (like the nether portal) with Elemental Water, Fire, Earth or Air Block to go on these news dimensions (more in the dedicated pages)"));  
        entries3.put(new ResourceLocation(Reference.MOD_ID, "entry14"), new EntryItemStack(pages14, "Dimension Opener", new ItemStack(WaterDim.block)));

        // Creation of our 15th page.
        List<IPage> pages15 = new ArrayList<IPage>();
        pages15.add(new PageText("Just craft it with on dirt, then, right click to select your ritual and walk on it !"));  
        entries3.put(new ResourceLocation(Reference.MOD_ID, "entry15"), new EntryItemStack(pages15, "Ritual Helper", new ItemStack(BlockMod.block_ritual_debug)));
        
        // Creation of our 16th page.
        List<IPage> pages16 = new ArrayList<IPage>();
        pages16.add(new PageText("Right-Click each days to have your reward !"));  
        entries3.put(new ResourceLocation(Reference.MOD_ID, "entry16"), new EntryItemStack(pages16, "Reward", new ItemStack(BlockMod.reward)));
        
        // Creation of our 17th page.
        List<IPage> pages17 = new ArrayList<IPage>();
        pages17.add(new PageText("Place a gem in it, it will be useful with the stone ritual..."));  
        entries3.put(new ResourceLocation(Reference.MOD_ID, "entry17"), new EntryItemStack(pages17, "Jar", new ItemStack(BlockMod.empty_urne)));

        // Creation of our 100th page.
        List<IPage> pages100= new ArrayList<IPage>();
        pages100.add(new PageText("First of All, check Dimension Opener in Other Stuff"));  
        pages100.add(new PageText("Once you have create the portal with Elemental Water Block, Right-Click with the Water Dimension Opener and pass through")); 
        entries5.put(new ResourceLocation(Reference.MOD_ID, "entry100"), new EntryItemStack(pages100, "How to go in", new ItemStack(WaterDim.block)));
        // Creation of our 101st page.
        List<IPage> pages101= new ArrayList<IPage>(); 
        pages101.add(new PageText("There are Elemental Ice Water Ore here, break them, you can probably have Elemental Water"));  
        entries5.put(new ResourceLocation(Reference.MOD_ID, "entry101"), new EntryItemStack(pages101, "Dimension Ores", new ItemStack(BlockMod.ice_water_ore)));
        // Creation of our 102nd page.
        List<IPage> pages102= new ArrayList<IPage>(); 
        pages102.add(new PageText("There are a lot of 'normal' Seafarer, and some 'tall' and 'small' Seafarer too... they will drop you elemental water, and maybe water chestplate and water sword"));  
        pages102.add(new PageText("There are cute penguins too !! But... wait a minute... they are not cutes at all !!!!"));  
        entries5.put(new ResourceLocation(Reference.MOD_ID, "entry102"), new EntryItemStack(pages102, "Dimension Mobs", new ItemStack(BlockMod.seafarer_spawn)));
        // Creation of our 103rd page.
        List<IPage> pages103= new ArrayList<IPage>(); 
        pages103.add(new PageText("Don't walk on these sorts of icy plants, or wear Water Boots. Some of them give you a poison effect... but it's not a big deal..."));  
        entries5.put(new ResourceLocation(Reference.MOD_ID, "entry103"), new EntryItemStack(pages103, "Dimension Decoration", new ItemStack(BlockMod.icy_plant)));
        // Creation of our 104th page.
        List<IPage> pages104= new ArrayList<IPage>(); 
        pages104.add(new PageText("There are 3 new structures here. A Penguin hut, a Seafarer house and an other one. All of them have a chest. In it, you can find diamond or iron for exemple and Elemental Water Gem Frag... maybe you can create a gem... and after, check the STONE RITUAL in the RITUAL HELPER..."));  
        entries5.put(new ResourceLocation(Reference.MOD_ID, "entry104"), new EntryItemStack(pages104, "Dimension Structures", new ItemStack(Blocks.PACKED_ICE)));


        // Creation of our 200th page.
        List<IPage> pages200= new ArrayList<IPage>();
        pages200.add(new PageText("First of All, check Dimension Opener in Other Stuff"));  
        pages200.add(new PageText("Once you have create the portal with Elemental Earth Block, Right-Click with the Earth Dimension Opener and pass through")); 
        entries6.put(new ResourceLocation(Reference.MOD_ID, "entry200"), new EntryItemStack(pages200, "How to go in", new ItemStack(EarthDim.block)));
        // Creation of our 201st page.
        List<IPage> pages201= new ArrayList<IPage>(); 
        pages201.add(new PageText("There are Elemental Ice Earth Ore here, break them, you can probably have Elemental Earth"));  
        entries6.put(new ResourceLocation(Reference.MOD_ID, "entry201"), new EntryItemStack(pages201, "Dimension Ores", new ItemStack(BlockMod.dirt_earth_ore)));
        // Creation of our 202nd page.
        List<IPage> pages202= new ArrayList<IPage>(); 
        pages202.add(new PageText("There are a lot of Centaur here...that's all"));  
        entries6.put(new ResourceLocation(Reference.MOD_ID, "entry202"), new EntryItemStack(pages202, "Dimension Mobs", new ItemStack(BlockMod.centaur_spawn)));
        
        // Creation of our 300th page.
        List<IPage> pages300= new ArrayList<IPage>();
        pages300.add(new PageText("First of All, check Dimension Opener in Other Stuff"));  
        pages300.add(new PageText("Once you have create the portal with Elemental Fire Block, Right-Click with the Fire Dimension Opener and pass through")); 
        entries7.put(new ResourceLocation(Reference.MOD_ID, "entry300"), new EntryItemStack(pages300, "How to go in", new ItemStack(FireDim.block)));
        // Creation of our 301st page.
        List<IPage> pages301= new ArrayList<IPage>(); 
        pages301.add(new PageText("There are Elemental Magma Ore Ore here, break them, you can probably have Elemental Fire"));  
        entries7.put(new ResourceLocation(Reference.MOD_ID, "entry301"), new EntryItemStack(pages301, "Dimension Ores", new ItemStack(BlockMod.magma_fire_ore)));
        // Creation of our 302nd page.
        List<IPage> pages302= new ArrayList<IPage>(); 
        pages302.add(new PageText("There are a lot of 'normal' Minotaur, and some 'tall' and 'small' Minotaur too... they will drop you elemental fire, and maybe fire chestplate and fire sword"));  
        pages302.add(new PageText("There are some Akurojin-no-hi, translated from japanese into the fire of the god of the bad road... I don't want to know why..."));  
        entries7.put(new ResourceLocation(Reference.MOD_ID, "entry302"), new EntryItemStack(pages302, "Dimension Mobs", new ItemStack(BlockMod.minotaur_spawn)));
        // Creation of our 303rd page.
        List<IPage> pages303= new ArrayList<IPage>(); 
        pages303.add(new PageText("Don't walk on these sorts of obsidian path, or wear Fire Boots. Some of them puts you in fire... but it's not a big deal..."));  
        entries7.put(new ResourceLocation(Reference.MOD_ID, "entry303"), new EntryItemStack(pages303, "Dimension Plants", new ItemStack(BlockMod.obsidian_ground)));
        // Creation of our 304th page.
        List<IPage> pages304= new ArrayList<IPage>(); 
        pages304.add(new PageText("There are new structures here, especially magma and bedrock spike. Some of them have a chest. In it, you can find diamond or iron for exemple and Elemental Fire Gem Frag... maybe you can create a gem... and after, check the STONE RITUAL in the RITUAL HELPER..."));  
        entries7.put(new ResourceLocation(Reference.MOD_ID, "entry304"), new EntryItemStack(pages304, "Dimension Structures", new ItemStack(Blocks.MAGMA)));


        // Creation of our 400th page.
        List<IPage> pages400= new ArrayList<IPage>();
        pages400.add(new PageText("First of All, check Dimension Opener in Other Stuff"));  
        pages400.add(new PageText("Once you have create the portal with Elemental Air Block, Right-Click with the Air Dimension Opener and pass through")); 
        entries8.put(new ResourceLocation(Reference.MOD_ID, "entry400"), new EntryItemStack(pages400, "How to go in", new ItemStack(AirDim.block)));
        // Creation of our 401st page.
        List<IPage> pages401= new ArrayList<IPage>(); 
        pages401.add(new PageText("There are Elemental Ice Air Ore here, break them, you can probably have Elemental Air"));  
        entries8.put(new ResourceLocation(Reference.MOD_ID, "entry401"), new EntryItemStack(pages401, "Dimension Ores", new ItemStack(BlockMod.cloud_air_ore)));
        // Creation of our 402nd page.
        List<IPage> pages402= new ArrayList<IPage>(); 
        pages402.add(new PageText("There are a lot of Flying Beast here...that's all"));  
        entries8.put(new ResourceLocation(Reference.MOD_ID, "entry402"), new EntryItemStack(pages402, "Dimension Mobs", new ItemStack(BlockMod.flyingbeast_spawn)));

        // Creation of our 500th page.
        List<IPage> pages500= new ArrayList<IPage>();
        pages500.add(new PageText("With Gems, Jars and some Polished Andesite, you can build the STONE RITUAL, check your RITUAL HELPER"));  
        pages500.add(new PageText("To summon an elemental golem, you need to place gem in jar, to check in which dimension you are, and after to place an elemental stone in the other one. Each golem will drop you its skull"));  
        pages500.add(new PageTextImage("Place WATER GEM in the OVERWORLD to summon the WATER GOLEM", loc("waterboss"), false)); 
        pages500.add(new PageTextImage("Place WATER GEM in the WATER DIMENSION to summon the ICY GOLEM", loc("icyboss"), false)); 
        pages500.add(new PageTextImage("Place WATER GEM in the FIRE DIMENSION to summon the STEAM GOLEM", loc("steamboss"), false)); 
        entries9.put(new ResourceLocation(Reference.MOD_ID, "entry500"), new EntryItemStack(pages500, "Golem", new ItemStack(ItemMod.seafarer_crane)));
        
        // Setup the list of categories and add our entries to it.
        List<CategoryAbstract> categories = new ArrayList<CategoryAbstract>();
        categories.add(new CategoryItemStack(entries1, "First Step", new ItemStack(Items.WHEAT_SEEDS)));
        categories.add(new CategoryItemStack(entries2, "Elemental Way", new ItemStack(ItemMod.elemental_fragment)));
        categories.add(new CategoryItemStack(entries3, "Other Stuff", new ItemStack(BlockMod.fire_furnace)));
        categories.add(new CategoryItemStack(entries5, "Water Dimension", new ItemStack(BlockMod.water_block)));
        categories.add(new CategoryItemStack(entries6, "Earth Dimension [WIP]", new ItemStack(BlockMod.earth_block)));
        categories.add(new CategoryItemStack(entries7, "Fire Dimension ", new ItemStack(BlockMod.fire_block)));
        categories.add(new CategoryItemStack(entries8, "Air Dimension [WIP]", new ItemStack(BlockMod.air_block)));
        categories.add(new CategoryItemStack(entries9, "Elemental Golem [WIP]", new ItemStack(BlockMod.waterboss_spawn)));
//      categories.add(new CategoryItemStack(entries4, "Compatibility [WIP]", new ItemStack(Blocks.ANVIL)));

        // Setup the book's base information
        myGuide = new Book();
        myGuide.setTitle("Croparia's Guide");
        myGuide.setDisplayName("Croparia's Guide");
        myGuide.setAuthor("DeFacto34");
        myGuide.setColor(Color.GREEN);
        myGuide.setCategoryList(categories);
        myGuide.setCreativeTab(CreativeTabsRegistry.WIP);
        myGuide.setRegistryName(new ResourceLocation(Reference.MOD_ID, "guide"));
        return myGuide;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void handleModel(ItemStack bookStack) {
        // Use the default GuideAPI model 
        GuideAPI.setModel(myGuide);
    }

    @Override
    public void handlePost(ItemStack bookStack) {
        // Register a recipe so player's can obtain the book
        RecipeOreDictionaryRegistry.ShapedOreRecipe(bookStack, new Object[] { " f ", "fbf", " f ", 'f', Items.WHEAT_SEEDS, 'b', Items.BOOK});
    }
     
    public ResourceLocation loc(String loc)
    {
    	return new ResourceLocation("textures/guidebook/" + loc + ".png");
    }

  
}