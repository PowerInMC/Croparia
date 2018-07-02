package com.cropariaCompat.mod.OreDic;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;

public class ModLoader 
{
	/**ALL THE MODS
	 * Big Reactor(Extreme Reactor)
	 * Botania
	 * Buildcraft
	 * TechReborn
	 * Thermal Foundation
	 * Immersive Engineering
	 * Forestry
	 * Refined Storage
	 * Draconic Evolution
	 * Industrial Craft 2
	 * Applied Energistics 2
	 * Embers
	 * Mekanism
	 * Pixelmon
	 */
	
	public static final boolean getAe2 = Loader.isModLoaded("appliedenergistics2");
	public static final boolean getBigReactor = Loader.isModLoaded("bigreactors");
	public static final boolean getBotania = Loader.isModLoaded("botania");
	public static final boolean getBuildcraft = Loader.isModLoaded("buildcraftcore");
	public static final boolean getTechReborn = Loader.isModLoaded("techreborn");
	public static final boolean getThermalFoundation = Loader.isModLoaded("thermalfoundation");
	public static final boolean getImmersive = Loader.isModLoaded("immersiveengineering");
	public static final boolean getForestry = Loader.isModLoaded("forestry");
	public static final boolean getRefinedStorage = Loader.isModLoaded("refinedstorage");
	public static final boolean getDraconic = Loader.isModLoaded("draconicevolution");
	public static final boolean getIC2 = Loader.isModLoaded("ic2");
	public static final boolean getEmber = Loader.isModLoaded("embers");
	public static final boolean getMekanism = Loader.isModLoaded("mekanism");
	public static final boolean getPixelmon = Loader.isModLoaded("pixelmon");
}
