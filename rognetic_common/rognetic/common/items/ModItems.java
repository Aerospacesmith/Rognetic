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
        ItemStack plankStack = new ItemStack(Block.planks);
        ItemStack ingotIronStack = new ItemStack(Item.ingotIron);
        ItemStack gearIronStack = new ItemStack(BuildCraftCore.ironGearItem);
        

        GameRegistry.addRecipe(new ItemStack(gearbox), "wgw", "gig", "wgw",
                'w', plankStack, 'i', ingotIronStack, 'g', gearIronStack);
        GameRegistry.addRecipe(new ItemStack(turbine), "i", "g", "i",
                'i', ingotIronStack, 'g', gearIronStack);

    }

    private static void initLanguages() {
        LanguageRegistry.addName(gearbox, "Gearbox");
        LanguageRegistry.addName(turbine, "Turbine");

    }
	
}
