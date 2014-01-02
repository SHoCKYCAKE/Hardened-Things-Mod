package EasyCompressorMod.items.cores;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import EasyCompressorMod.items.itemInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

	public class itemLowPressureCore extends Item{

		public itemLowPressureCore(int id) {
			super(id);
			setCreativeTab(CreativeTabs.tabMaterials);
			setMaxStackSize(64);
			setUnlocalizedName(itemInfo.lowPressureCore_UNLOCALIZED_NAME);
		}

		
		
		@Override
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister register) {
			itemIcon = register.registerIcon(itemInfo.TEXTURE_LOC + ":" + itemInfo.lowPressureCore_ICON);
		}	
		
		//Makes a shiny effect
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack par1ItemStack){
			return true;
		}
		
		//Make blue name
		@Override
		@SideOnly(Side.CLIENT)
		public EnumRarity getRarity(ItemStack par1ItemStack){
			return EnumRarity.rare;
		}
}