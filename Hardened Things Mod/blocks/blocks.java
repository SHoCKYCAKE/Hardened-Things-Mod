package EasyCompressorMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import EasyCompressorMod.items.itemBLOCKS;
import EasyCompressorMod.items.items;
import EasyCompressorMod.tileentity.tileEntityHighPressureCompressor;
import EasyCompressorMod.tileentity.tileEntityLowPressureCompressor;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class blocks {

	public static Block blockLowPressureCompressor;
	public static Block blockHighPressureCompressor;
	public static Block blockCompressedAir;
	public static Block blockMyLeaf;
	public static Block blockMyWood;
	public static Block blockMySapling;
	public static Item itemLowPressureCore;
	public static Item itemHighPressureCore;
	
	
	//Register Tile Entities
	public static void registerTileEntities(){
		GameRegistry.registerTileEntity(tileEntityLowPressureCompressor.class, blockInfo.lowPressureCompressor_TE_KEY);
	    GameRegistry.registerTileEntity(tileEntityHighPressureCompressor.class, blockInfo.highPressureCompressor_TE_KEY);
	}
		
	//Initilize Blocks
	public static void init() {
		blockHighPressureCompressor = new blockHighPressureCompressor(blockInfo.highPressureCompressor_ID);
		GameRegistry.registerBlock(blockHighPressureCompressor, itemBLOCKS.class, blockInfo.highPressureCompressor_KEY);
		
		blockLowPressureCompressor = new blockLowPressureCompressor(blockInfo.lowPressureCompressor_ID);
		GameRegistry.registerBlock(blockLowPressureCompressor, itemBLOCKS.class, blockInfo.lowPressureCompressor_KEY);
		
		blockCompressedAir = new blockCompressedAir(blockInfo.compressedAirOre_ID);
		GameRegistry.registerBlock(blockCompressedAir, itemBLOCKS.class, blockInfo.compressedAirOre_KEY);
		MinecraftForge.setBlockHarvestLevel(blockCompressedAir, "pickaxe", 1);
		
		blockMyLeaf = new blockMyLeaf(blockInfo.myLeaf_ID, Material.leaves, true);
		GameRegistry.registerBlock(blockMyLeaf, itemBLOCKS.class, blockInfo.myLeaf_KEY);
		
		blockMyWood = new blockMyWood(blockInfo.myWood_ID);
		GameRegistry.registerBlock(blockMyWood, itemBLOCKS.class, blockInfo.myWood_KEY);
		
		blockMySapling = new blockMySapling(blockInfo.mySapling_ID, Material.leaves);
		GameRegistry.registerBlock(blockMySapling, itemBLOCKS.class, blockInfo.mySapling_KEY);
	
	}
	
	//Add all Names 
	public static void addNames() {
		LanguageRegistry.addName(blockHighPressureCompressor, blockInfo.highPressureCompressor_NAME);
		
		LanguageRegistry.addName(blockLowPressureCompressor, blockInfo.lowPressureCompressor_NAME);
		
		LanguageRegistry.addName(blockCompressedAir, blockInfo.compressedAirOre_NAME);

		LanguageRegistry.addName(blockMyLeaf, blockInfo.myLeaf_NAME);
		
		LanguageRegistry.addName(blockMyWood, blockInfo.myWood_NAME);
		
		LanguageRegistry.addName(blockMySapling, blockInfo.mySapling_NAME);


	}
	
	//Register all Recipies
	public static void registerBlockRecipes() {
		GameRegistry.addRecipe(new ItemStack(blockLowPressureCompressor),
			new Object[] { 	"IPI",
							"ICI",
							"BPB",
							
							'I', Item.ingotIron,
							'P', Block.pistonBase,
							'C', items.lowPressureCore,
							'B', Block.blockIron,
							
						 });	
		GameRegistry.addRecipe(new ItemStack(blockHighPressureCompressor),
				new Object[] { 	"OPO",
								"PCP",
								"OPO",
								
								'O', Block.obsidian,
								'P', Block.pistonBase,
								'C', items.highPressureCore,
							 });	
	}
	//Register all Smelting Recipies
	public static void registerBlockSmelting(){
		
		GameRegistry.addSmelting(blockInfo.myWood_ID, new ItemStack(items.compressedAir, 2), 0.1f);
		
	}
	
}
