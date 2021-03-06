package EasyCompressorMod.tools.hardenedGoldTools;

import EasyCompressorMod.items.itemInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class hardenedGoldSword extends ItemSword{

	public hardenedGoldSword(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(1);
		setUnlocalizedName(itemInfo.hardenedGoldSword_UNLOCALIZED_NAME);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(itemInfo.TEXTURE_LOC + ":" + itemInfo.hardenedGoldSword_ICON);
	}

}
