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
    
    public static void init() {
        gearbox = new ItemModules(ItemIds.GEARBOX)
                .setMaxStackSize(64)
                .setCreativeTab(CreativeTabs.tabMisc)
                .setUnlocalizedName("gearbox");
        
        turbine = new ItemModules(ItemIds.TURBINE)
                .setMaxStackSize(64)
                .setCreativeTab(CreativeTabs.tabMisc)
                .setUnlocalizedName("turbine");
        

        initItemRecipes();

        initLanguages();
    }

    
    private static void initItemRecipes() {
        
        GameRegistry.addRecipe(new ItemStack(gearbox), new Object[] {
        	"wgw",
        	"gig",
        	"wgw",
        	Character.valueOf('w'), Block.planks,
        	Character.valueOf('i'), Item.ingotIron,
        	Character.valueOf('g'), BuildCraftCore.ironGearItem
        });

        GameRegistry.addRecipe(new ItemStack(turbine), new Object[] {
        	"i",
        	"g",
        	"i",
        	Character.valueOf('i'), Item.ingotIron,
        	Character.valueOf('g'), BuildCraftCore.ironGearItem
        });

        
        
    }

    private static void initLanguages() {
        LanguageRegistry.addName(gearbox, "Gearbox");
        LanguageRegistry.addName(turbine, "Turbine");

    }
	
}
