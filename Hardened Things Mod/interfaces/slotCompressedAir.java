package EasyCompressorMod.interfaces;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import EasyCompressorMod.items.items;

public class slotCompressedAir extends Slot {

	public slotCompressedAir(IInventory inventory, int id,  int x, int y) {
		super(inventory, id, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		return stack.itemID == items.compressedAir.itemID;
	}
}
