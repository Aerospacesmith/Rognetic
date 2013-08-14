package rognetic.common.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import rognetic.common.core.ModInformation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWand extends Item {
	
	public ItemWand(int id) {
		super(id);
	}
	
	@Override
	public boolean func_111207_a(ItemStack itemstack, EntityPlayer player, EntityLivingBase target){
		if (!target.worldObj.isRemote) {
			target.motionY = 2;
		}
		
		return false;
	}
	
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(ModInformation.ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}
