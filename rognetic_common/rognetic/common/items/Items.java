package mods.rognetic.common.items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	
	public static Item wand;
	
	public static void init(){
		wand = new ItemWand(ItemInfo.WAND_ID);
	}
	
	
	public static void addNames(){
		LanguageRegistry.addName(wand, ItemInfo.WAND_NAME);
	}

}
