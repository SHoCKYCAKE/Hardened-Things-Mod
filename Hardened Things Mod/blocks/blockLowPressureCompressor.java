package EasyCompressorMod.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import EasyCompressorMod.Main;
import EasyCompressorMod.tileentity.tileEntityLowPressureCompressor;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class blockLowPressureCompressor extends BlockContainer {

	public blockLowPressureCompressor(int id) {
		super(id, Material.iron);
		
		setCreativeTab(CreativeTabs.tabRedstone);
		setHardness(2F);
		setStepSound(Block.soundMetalFootstep);
		setUnlocalizedName(blockInfo.lowPressureCompressor_UNLOCALIZED_NAME);
	}
	@SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon botIcon;
	@SideOnly(Side.CLIENT)
	private Icon sideIcons;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		topIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.lowPressureCompressorTOP);
		botIcon = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.lowPressureCompressorBOTTOM);
		
		sideIcons = register.registerIcon(blockInfo.TEXTURE_LOC + ":" + blockInfo.lowPressureCompressorSIDE);	
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		if (side == 0) {
			return botIcon;
		}else if(side == 1) {
			return topIcon;
		}else{
			return sideIcons;
		}	
	}
	

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new tileEntityLowPressureCompressor();
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
        if(!world.isRemote){
        	//                      Fuer jedes neues GUI + 1 v    + guiHandler neuen Case einbauen
        	FMLNetworkHandler.openGui(player, Main.instance, 1, world, x, y, z);
        }
		return true;	
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, int id, int meta) {
		
		TileEntity teLow = world.getBlockTileEntity(x, y, z);
		if(teLow != null && teLow instanceof IInventory){
			IInventory inventory = (IInventory)teLow;
			
			for(int i = 0; i < inventory.getSizeInventory(); i++){
				ItemStack stack = inventory.getStackInSlotOnClosing(i);
				
				if(stack != null){
					float spawnX = x + world.rand.nextFloat();
					float spawnY = y + world.rand.nextFloat();
					float spawnZ = z + world.rand.nextFloat();
					
					EntityItem droppedItem = new EntityItem(world, spawnX, spawnY, spawnZ, stack);
					
					float mult = 0.05F;
					
					droppedItem.motionX = (-0.5F + world.rand.nextFloat()) * mult;
					droppedItem.motionY = (2.5F + world.rand.nextFloat()) * mult;
					droppedItem.motionZ = (-0.5F + world.rand.nextFloat()) * mult;

					world.spawnEntityInWorld(droppedItem);
				}
			}
		}
		
		super.breakBlock(world, x, y, z, id, meta);
	}
}
