package EasyCompressorMod.tools.hardenedIronTools;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import EasyCompressorMod.items.itemInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class hardenedIronShovel extends ItemSpade{

	public hardenedIronShovel(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		setCreativeTab(CreativeTabs.tabTools);
		setMaxStackSize(1);
		setUnlocalizedName(itemInfo.hardenedIronShovel_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(itemInfo.TEXTURE_LOC + ":" + itemInfo.hardenedIronShovel_ICON);
	}

}
