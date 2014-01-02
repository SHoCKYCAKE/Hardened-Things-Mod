package EasyCompressorMod.interfaces;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import EasyCompressorMod.tileentity.tileEntityHighPressureCompressor;
import EasyCompressorMod.tileentity.tileEntityLowPressureCompressor;


public class containerLowPressureCompressor extends Container{
	
	private tileEntityLowPressureCompressor lpc;

	public containerLowPressureCompressor(InventoryPlayer invPlayer, tileEntityLowPressureCompressor lpc){
		this.lpc = lpc;
		
		//HOTBAR
		for (int x = 0; x < 9; x++) {
			addSlotToContainer(new Slot(invPlayer, x, 8 + 18 * x, 130));
		}
		
		//INVENTORY
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 9; x++) {
				addSlotToContainer(new Slot(invPlayer, x + y * 9 + 9, 8 + 18 * x, 72 + y * 18));
			}
		}
		//SLOT IN
			addSlotToContainer(new Slot(lpc, 0, 8, 17));
		//SLOT OUT
			addSlotToContainer(new Slot(lpc, 1, 98, 17));
		//SLOT REQUIERED
			addSlotToContainer(new slotCompressedAir(lpc, 2, 8, 51));
	}
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return lpc.isUseableByPlayer(entityplayer);
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		return null;
	}
}