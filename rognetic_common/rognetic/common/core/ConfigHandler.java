package rognetic.common.core;

import java.io.File;

import net.minecraftforge.common.Configuration;
import rognetic.common.lib.ItemIds;

public class ConfigHandler {
	

	
	
	
	public static void init(File file){
		Configuration config = new Configuration(file);
		
		config.load();
		
		ItemIds.WAND = config.getItem("Wand_ID", ItemIds.WAND_DEFAULT).getInt() - 256;
		ItemIds.GEARBOX = config.getItem("Gearbox_ID", ItemIds.GEARBOX_DEFAULT).getInt() - 256;
		ItemIds.TURBINE = config.getItem("Turbine_ID", ItemIds.TURBINE_DEFAULT).getInt() - 256;
		
		
		config.save();

	}
	
}
