package EasyCompressorMod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import EasyCompressorMod.items.itemInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class blockMyWood extends Block {

	public blockMyWood(int id) {
		super(id, Material.wood);
		
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(2.5f);
		setStepSound(Block.soundWoodFootstep);
		setUnlocalizedName(blockInfo.myWood_UNLOCALIZED_NAME);
	}
	

	@SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon botIcon;
	@SideOnly(Side.CLIENT)
	private Icon sideIcon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		topIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.myWoodTOP);
		botIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.myWoodBOTTOM);
		
		sideIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.myWoodSIDE);	
 	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		if (side == 0) {
			return botIcon;
		}else if(side == 1) {
			return topIcon;
		}else{
			return sideIcon;
		}	
	}

}