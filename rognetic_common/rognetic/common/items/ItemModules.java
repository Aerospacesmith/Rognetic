package rognetic.common.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import rognetic.common.core.ModInformation;

/**
* Rognetic
*
* ItemModules
*
* @author Aerospacesmith
* @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
*
*/

public class ItemModules extends Item {
    public ItemModules(int id) {
        super(id);
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon(ModInformation.ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
