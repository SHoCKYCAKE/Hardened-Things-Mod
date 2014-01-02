package EasyCompressorMod.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import EasyCompressorMod.blocks.blockInfo;
import EasyCompressorMod.items.itemInfo;
import EasyCompressorMod.items.items;


public class configHandler {
	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		
		config.load();
		
		//Items
		
		//Cores
		itemInfo.defectiveLowPressureCore_ID = config.getItem(itemInfo.defectiveLowPressureCore_KEY, itemInfo.defectiveLowPressureCore_DEFAULT).getInt() - 256;
		itemInfo.defectiveHighPressureCore_ID = config.getItem(itemInfo.defectiveHighPressureCore_KEY, itemInfo.defectiveHighPressureCore_DEFAULT).getInt() - 256;
		itemInfo.lowPressureCore_ID = config.getItem(itemInfo.lowPressureCore_KEY, itemInfo.lowPressureCore_DEFAULT).getInt() - 256;
		itemInfo.highPressureCore_ID = config.getItem(itemInfo.highPressureCore_KEY, itemInfo.highPressureCore_DEFAULT).getInt() - 256;
		
		//Pieces
		itemInfo.ironPiece_ID = config.getItem(itemInfo.ironPiece_KEY, itemInfo.ironPiece_DEFAULT).getInt() - 256;
		itemInfo.goldPiece_ID = config.getItem(itemInfo.goldPiece_KEY, itemInfo.goldPiece_DEFAULT).getInt() - 256;
		itemInfo.diamondPiece_ID = config.getItem(itemInfo.diamondPiece_KEY, itemInfo.diamondPiece_DEFAULT).getInt() - 256;
		
		//Ore/Drop
		itemInfo.compressedAir_ID = config.getItem(itemInfo.compressedAir_KEY, itemInfo.compressedAir_DEFAULT).getInt() - 256;
		
		//Ingots
		itemInfo.hardenedDiamond_ID = config.getItem(itemInfo.hardenedDiamond_KEY, itemInfo.hardenedDiamond_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronIngot_ID = config.getItem(itemInfo.hardenedIronIngot_KEY, itemInfo.hardenedIronIngot_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldIngot_ID = config.getItem(itemInfo.hardenedGoldIngot_KEY, itemInfo.hardenedGoldIngot_DEFAULT).getInt() - 256;
		
		//Tools

		//Iron
		itemInfo.hardenedIronSword_ID = config.getItem(itemInfo.hardenedIronSword_KEY, itemInfo.hardenedIronSword_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronPickaxe_ID = config.getItem(itemInfo.hardenedIronPickaxe_KEY, itemInfo.hardenedIronPickaxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronAxe_ID = config.getItem(itemInfo.hardenedIronAxe_KEY, itemInfo.hardenedIronAxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronHoe_ID = config.getItem(itemInfo.hardenedIronHoe_KEY, itemInfo.hardenedIronHoe_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronShovel_ID = config.getItem(itemInfo.hardenedIronShovel_KEY, itemInfo.hardenedIronShovel_DEFAULT).getInt() - 256;
		
		//Gold
		itemInfo.hardenedGoldSword_ID = config.getItem(itemInfo.hardenedGoldSword_KEY, itemInfo.hardenedGoldSword_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldPickaxe_ID = config.getItem(itemInfo.hardenedGoldPickaxe_KEY, itemInfo.hardenedGoldPickaxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldAxe_ID = config.getItem(itemInfo.hardenedGoldAxe_KEY, itemInfo.hardenedGoldAxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldHoe_ID = config.getItem(itemInfo.hardenedGoldHoe_KEY, itemInfo.hardenedGoldHoe_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldShovel_ID = config.getItem(itemInfo.hardenedGoldShovel_KEY, itemInfo.hardenedGoldShovel_DEFAULT).getInt() - 256;
		
		//Diamond
		itemInfo.hardenedDiamondSword_ID = config.getItem(itemInfo.hardenedDiamondSword_KEY, itemInfo.hardenedDiamondSword_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondPickaxe_ID = config.getItem(itemInfo.hardenedDiamondPickaxe_KEY, itemInfo.hardenedDiamondPickaxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondAxe_ID = config.getItem(itemInfo.hardenedDiamondAxe_KEY, itemInfo.hardenedDiamondAxe_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondHoe_ID = config.getItem(itemInfo.hardenedDiamondHoe_KEY, itemInfo.hardenedDiamondHoe_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondShovel_ID = config.getItem(itemInfo.hardenedDiamondShovel_KEY, itemInfo.hardenedDiamondShovel_DEFAULT).getInt() - 256;
		
		//Armor
		
		//Iron
		itemInfo.hardenedIronHelmet_ID = config.getItem(itemInfo.hardenedIronHelmet_KEY, itemInfo.hardenedIronHelmet_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronChestplate_ID = config.getItem(itemInfo.hardenedIronChestplate_KEY, itemInfo.hardenedIronChestplate_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronLeggings_ID = config.getItem(itemInfo.hardenedIronLeggings_KEY, itemInfo.hardenedIronLeggings_DEFAULT).getInt() - 256;
		itemInfo.hardenedIronBoots_ID = config.getItem(itemInfo.hardenedIronBoots_KEY, itemInfo.hardenedIronBoots_DEFAULT).getInt() - 256; 
		
		//Gold
		itemInfo.hardenedGoldHelmet_ID = config.getItem(itemInfo.hardenedGoldHelmet_KEY, itemInfo.hardenedGoldHelmet_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldChestplate_ID = config.getItem(itemInfo.hardenedGoldChestplate_KEY, itemInfo.hardenedGoldChestplate_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldLeggings_ID = config.getItem(itemInfo.hardenedGoldLeggings_KEY, itemInfo.hardenedGoldLeggings_DEFAULT).getInt() - 256;
		itemInfo.hardenedGoldBoots_ID = config.getItem(itemInfo.hardenedGoldBoots_KEY, itemInfo.hardenedGoldBoots_DEFAULT).getInt() - 256; 
		
		//Diamond
		itemInfo.hardenedDiamondHelmet_ID = config.getItem(itemInfo.hardenedDiamondHelmet_KEY, itemInfo.hardenedDiamondHelmet_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondChestplate_ID = config.getItem(itemInfo.hardenedDiamondChestplate_KEY, itemInfo.hardenedDiamondChestplate_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondLeggings_ID = config.getItem(itemInfo.hardenedDiamondLeggings_KEY, itemInfo.hardenedDiamondLeggings_DEFAULT).getInt() - 256;
		itemInfo.hardenedDiamondBoots_ID = config.getItem(itemInfo.hardenedDiamondBoots_KEY, itemInfo.hardenedDiamondBoots_DEFAULT).getInt() - 256; 
		
		
       	//Blocks
		blockInfo.highPressureCompressor_ID = config.getBlock(blockInfo.highPressureCompressor_KEY, blockInfo.highPressureCompressor_DEFAULT).getInt();
		blockInfo.lowPressureCompressor_ID = config.getBlock(blockInfo.lowPressureCompressor_KEY, blockInfo.lowPressureCompressor_DEFAULT).getInt();
		blockInfo.compressedAirOre_ID = config.getBlock(blockInfo.compressedAirOre_KEY, blockInfo.compressedAirOre_DEFAULT).getInt();
		blockInfo.myLeaf_ID = config.getBlock(blockInfo.myLeaf_KEY, blockInfo.myLeaf_DEFAULT).getInt();
		blockInfo.myWood_ID = config.getBlock(blockInfo.myWood_KEY, blockInfo.myWood_DEFAULT).getInt();
		blockInfo.mySapling_ID = config.getBlock(blockInfo.mySapling_KEY, blockInfo.mySapling_DEFAULT).getInt();
		
		
		
		
		final String BOOLEANS = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "booleans";
		//ALLOW TO DISABLE BLOCK CRAFTING
		items.blockCrafting = config.get(BOOLEANS, "Disable Block Crafting (default = false)", false).getBoolean(false);
		
		
		config.save();
		
	}
	
}
