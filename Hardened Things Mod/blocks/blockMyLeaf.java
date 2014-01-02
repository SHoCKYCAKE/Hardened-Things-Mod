package EasyCompressorMod.blocks;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class blockMyLeaf extends BlockLeavesBase implements IShearable{
	
    public boolean graphicsLevel;

    protected blockMyLeaf(int par1, Material par2Material, boolean par3){
        super(par1, par2Material, par3);
        this.graphicsLevel = par3;
		setCreativeTab(CreativeTabs.tabDecorations);
		setHardness(0.2F);
		setStepSound(Block.soundGrassFootstep);
		setLightOpacity(1);
		setUnlocalizedName(blockInfo.myLeaf_UNLOCALIZED_NAME);
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
		topIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.myLeafTOP);
		botIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.myLeafBOTTOM);
		
		sideIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.myLeafSIDE);	
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
		return blockInfo.mySapling_ID;
	}
	
	//How much is dropped ( 1 = 1 at least ) + (a number between 1-2)
    public int quantityDropped(Random par1Random)
    {
        return par1Random.nextInt(20) == 0 ? 1 : 0;
    }
    
    public boolean isShearable(ItemStack item, World world, int x, int y, int z)
    {
        return true;
    }

    public ArrayList<ItemStack> onSheared(ItemStack item, World world, int x, int y, int z, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z) & 3));
        return ret;
    }

    @Override
    public void beginLeavesDecay(World world, int x, int y, int z)
    {
        world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
    }

    @Override
    public boolean isLeaves(World world, int x, int y, int z)
    {
        return true;
    }
    private void removeLeaves(World par1World, int par2, int par3, int par4)
    {
        this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
        par1World.setBlockToAir(par2, par3, par4);
    }
    public boolean isOpaqueCube()
    {
        return !this.graphicsLevel;
    }

}