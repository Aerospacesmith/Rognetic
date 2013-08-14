package mods.rognetic.common.items;

import mods.rognetic.common.core.ModInformation;
import mods.rognetic.common.core.Rognetic;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

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
        this.itemIcon = par1IconRegister.registerIcon(ModInformation.ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
