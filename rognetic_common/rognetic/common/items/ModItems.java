package rognetic.common.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import rognetic.common.lib.ItemIds;
import buildcraft.BuildCraftCore;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


/**
* Rognetic
*
* ModItems
*
* @author Aerospacesmith
* @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
*
*/

public class ModItems {

    public static Item gearbox;
    public static Item turbine;
	public static Item wand;
    
    public static void init() {
        gearbox = new ItemModules(ItemIds.GEARBOX_DEFAULT)
                .setMaxStackSize(64)
                .setCreativeTab(CreativeTabs.tabMisc)
                .setUnlocalizedName("gearbox");
        
        turbine = new ItemModules(ItemIds.TURBINE_DEFAULT)
                .setMaxStackSize(64)
                .setCreativeTab(CreativeTabs.tabMisc)
                .setUnlocalizedName("turbine");
        
        wand 	= new ItemWand(ItemIds.WAND_DEFAULT)
        		.setMaxStackSize(1)
        		.setCreativeTab(CreativeTabs.tabCombat)
        		.setUnlocalizedName("rocketWand");
        
        

        initItemRecipes();

        initLanguages();
    }

    
    private static void initItemRecipes() {
        
        GameRegistry.addRecipe(new ItemStack(gearbox), new Object[] {
        	"wgw",
        	"gig",
        	"wgw",
        	'w', Block.planks,
        	'i', Item.ingotIron,
        	'g', BuildCraftCore.ironGearItem
        });

        GameRegistry.addRecipe(new ItemStack(turbine), new Object[] {
        	"i",
        	"g",
        	"i",
        	'i', Item.ingotIron,
        	'g', BuildCraftCore.ironGearItem
        });

        
        
    }

    private static void initLanguages() {
        LanguageRegistry.addName(gearbox, "Gearbox");
        LanguageRegistry.addName(turbine, "Turbine");
        LanguageRegistry.addName(wand, "Wand of the Rocket");

    }
	
}
