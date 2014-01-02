package EasyCompressorMod.items.betterIngots;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import EasyCompressorMod.items.itemInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


	public class hardenedDiamond extends Item{

		public hardenedDiamond(int id) {
			super(id);
			setCreativeTab(CreativeTabs.tabMaterials);
			setMaxStackSize(64);
			setUnlocalizedName(itemInfo.hardenedDiamond_UNLOCALIZED_NAME);
		}

		
		
		@Override
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister register) {
			itemIcon = register.registerIcon(itemInfo.TEXTURE_LOC + ":" + itemInfo.hardenedDiamond_ICON);
		}	
}