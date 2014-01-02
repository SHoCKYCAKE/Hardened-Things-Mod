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

public class blockCompressedAir extends Block {

	public blockCompressedAir(int id) {
		super(id, Material.rock);
		
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(2.5f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(blockInfo.compressedAirOre_UNLOCALIZED_NAME);
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
		topIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.compressedAirOreTOP);
		botIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.compressedAirOreBOTTOM);
		
		sideIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.compressedAirOreSIDE);	
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
	
	//What is dropped
	public int idDropped(int metadate, Random random, int fortune){
		return itemInfo.compressedAir_ID;
	}
	
	//How much is dropped ( 1 = 1 at least ) + (a number between 1-2)
    public int quantityDropped(Random par1Random)
    {
        return 1 + par1Random.nextInt(3);
    }

}
