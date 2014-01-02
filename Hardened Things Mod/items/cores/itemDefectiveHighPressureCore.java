package EasyCompressorMod.items.cores;

import EasyCompressorMod.items.itemInfo;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


	public class itemDefectiveHighPressureCore extends Item{

		public itemDefectiveHighPressureCore(int id) {
			super(id);
			setCreativeTab(CreativeTabs.tabMaterials);
			setMaxStackSize(64);
			setUnlocalizedName(itemInfo.defectiveHighPressureCore_UNLOCALIZED_NAME);
		}

		
		
		@Override
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister register) {
			itemIcon = register.registerIcon(itemInfo.TEXTURE_LOC + ":" + itemInfo.defectiveHighPressureCore_ICON);
		}	
}