package EasyCompressorMod.items;

import net.minecraft.item.ItemBlock;

public class itemBLOCKS extends ItemBlock {
	
	public itemBLOCKS(int id) {
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}

}
