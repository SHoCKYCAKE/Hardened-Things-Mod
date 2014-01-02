package EasyCompressorMod.interfaces;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import EasyCompressorMod.tileentity.tileEntityHighPressureCompressor;


public class containerHighPressureCompressor extends Container{
	
	private tileEntityHighPressureCompressor hpc;

	public containerHighPressureCompressor(InventoryPlayer invPlayer, tileEntityHighPressureCompressor hpc){
		this.hpc = hpc;
		
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
			addSlotToContainer(new Slot(hpc, 0, 8, 17));
		//SLOT OUT
			addSlotToContainer(new Slot(hpc, 1, 98, 17));
		//SLOT REQUIERED
			addSlotToContainer(new slotCompressedAir(hpc, 2, 8, 51));
	}
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return hpc.isUseableByPlayer(entityplayer);
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		return null;
	}
}
