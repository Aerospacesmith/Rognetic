package rognetic.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemWand extends Item {
	
	public ItemWand(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.WAND_UNLOCALIZED_NAME).func_111206_d(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.WAND_ICON);
		
	}
	
	@Override
	public boolean func_111207_a(ItemStack itemstack, EntityPlayer player, EntityLivingBase target){
		if (!target.worldObj.isRemote) {
			target.motionY = 2;
		}
		
		return false;
	}
	

	/*@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		//itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.WAND_ICON);
	}*/
}
