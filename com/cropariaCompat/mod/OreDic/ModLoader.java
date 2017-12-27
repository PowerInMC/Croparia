package com.cropariaCompat.mod.OreDic;

import net.minecraftforge.fml.common.Loader;

public class ModLoader 
{
	/**ALL THE MOD
	 * 
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
	 */
	
	public static boolean getAe2()
	{
		if(Loader.isModLoaded("appliedenergistics2"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean getBigReactor()
	{
		if(Loader.isModLoaded("bigreactors"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean getBotania()
	{
		if(Loader.isModLoaded("botania"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean getBuildcraft()
	{
		if(Loader.isModLoaded("buildcraftcore"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean getTechReborn()
	{
		if(Loader.isModLoaded("techreborn"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean getThermalFoundation()
	{
		if(Loader.isModLoaded("thermalfoundation"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean getImmersive()
	{
		if(Loader.isModLoaded("immersiveengineering"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean getForestry()
	{
		if(Loader.isModLoaded("forestry"))
		{
			return true;
		}
		return false;
	}

	public static boolean getRefinedStorage()
	{
		if(Loader.isModLoaded("refinedstorage"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean getDraconic()
	{
		if(Loader.isModLoaded("draconicevolution"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean getIC2()
	{
		if(Loader.isModLoaded("ic2"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean getEmber()
	{
		if(Loader.isModLoaded("embers"))
		{
			return true;
		}
		return false;
	}
}
