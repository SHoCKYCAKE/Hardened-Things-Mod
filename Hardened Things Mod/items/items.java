package EasyCompressorMod.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import EasyCompressorMod.armor.betterDiamondArmor.hardenedDiamondBoots;
import EasyCompressorMod.armor.betterDiamondArmor.hardenedDiamondChestplate;
import EasyCompressorMod.armor.betterDiamondArmor.hardenedDiamondHelmet;
import EasyCompressorMod.armor.betterDiamondArmor.hardenedDiamondLeggings;
import EasyCompressorMod.armor.betterGoldArmor.hardenedGoldBoots;
import EasyCompressorMod.armor.betterGoldArmor.hardenedGoldChestplate;
import EasyCompressorMod.armor.betterGoldArmor.hardenedGoldHelmet;
import EasyCompressorMod.armor.betterGoldArmor.hardenedGoldLeggings;
import EasyCompressorMod.armor.betterIronArmor.hardenedIronBoots;
import EasyCompressorMod.armor.betterIronArmor.hardenedIronChestplate;
import EasyCompressorMod.armor.betterIronArmor.hardenedIronHelmet;
import EasyCompressorMod.armor.betterIronArmor.hardenedIronLeggings;
import EasyCompressorMod.blocks.blocks;
import EasyCompressorMod.items.betterIngots.hardenedDiamond;
import EasyCompressorMod.items.betterIngots.hardenedGoldIngot;
import EasyCompressorMod.items.betterIngots.hardenedIronIngot;
import EasyCompressorMod.items.cores.itemDefectiveHighPressureCore;
import EasyCompressorMod.items.cores.itemDefectiveLowPressureCore;
import EasyCompressorMod.items.cores.itemHighPressureCore;
import EasyCompressorMod.items.cores.itemLowPressureCore;
import EasyCompressorMod.items.otherStuff.itemCompressedAir;
import EasyCompressorMod.items.pieces.itemDiamondPiece;
import EasyCompressorMod.items.pieces.itemGoldPiece;
import EasyCompressorMod.items.pieces.itemIronPiece;
import EasyCompressorMod.tools.hardenedDiamondTools.hardenedDiamondAxe;
import EasyCompressorMod.tools.hardenedDiamondTools.hardenedDiamondHoe;
import EasyCompressorMod.tools.hardenedDiamondTools.hardenedDiamondPickaxe;
import EasyCompressorMod.tools.hardenedDiamondTools.hardenedDiamondShovel;
import EasyCompressorMod.tools.hardenedDiamondTools.hardenedDiamondSword;
import EasyCompressorMod.tools.hardenedGoldTools.hardenedGoldAxe;
import EasyCompressorMod.tools.hardenedGoldTools.hardenedGoldHoe;
import EasyCompressorMod.tools.hardenedGoldTools.hardenedGoldPickaxe;
import EasyCompressorMod.tools.hardenedGoldTools.hardenedGoldShovel;
import EasyCompressorMod.tools.hardenedGoldTools.hardenedGoldSword;
import EasyCompressorMod.tools.hardenedIronTools.hardenedIronAxe;
import EasyCompressorMod.tools.hardenedIronTools.hardenedIronHoe;
import EasyCompressorMod.tools.hardenedIronTools.hardenedIronPickaxe;
import EasyCompressorMod.tools.hardenedIronTools.hardenedIronShovel;
import EasyCompressorMod.tools.hardenedIronTools.hardenedIronSword;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class items {
	
	
	//FOR DISABLE BLOCK RECIPIES
	public static boolean blockCrafting;
	
	//For my Tools
	//Better Iron
	public static EnumToolMaterial hardenedIronMaterial = EnumHelper.addToolMaterial("hardenedIron", 2, 546, 6.5F, 2.5F, 15);
	
	//Better Gold
	public static EnumToolMaterial hardenedGoldMaterial = EnumHelper.addToolMaterial("hardenedGold", 0, 80, 14.5F, 0.5F, 22);
	
	//Better Diamond
	public static EnumToolMaterial hardenedDiamondMaterial = EnumHelper.addToolMaterial("hardenedDiamond", 3, 3200, 9.7F, 3.4F, 13);

	
	//For Armor
	//Better Iron
	public static EnumArmorMaterial hardenedIronArmorMaterial = EnumHelper.addArmorMaterial("hardenedArmorIron", 30, new int[] {3, 7, 6, 3}, 16);
	
	//Better Gold
	public static EnumArmorMaterial hardenedGoldArmorMaterial = EnumHelper.addArmorMaterial("hardenedArmorGold", 14, new int[] {2, 6, 4, 1}, 30);

	//Better Diamond
	public static EnumArmorMaterial hardenedDiamondArmorMaterial = EnumHelper.addArmorMaterial("hardenedArmorDiamond", 67, new int[] {3, 9, 6, 3}, 15);

	
	
	
	//Create field for use
	
	//Cores
	public static Item defectiveHighPressureCore;
	public static Item defectiveLowPressureCore;
	public static Item lowPressureCore;
	public static Item highPressureCore;
	
	//Pieces
	public static Item ironPiece;
	public static Item goldPiece;
	public static Item diamondPiece;
	
	//Ore/Drop
	public static Item compressedAir;
	
	//Ingots
	public static Item hardenedDiamond;
	public static Item hardenedIronIngot;
	public static Item hardenedGoldIngot;
	
	//Tools
	
	//Iron
	public static Item hardenedIronSword;
	public static Item hardenedIronPickaxe;
	public static Item hardenedIronAxe;
	public static Item hardenedIronHoe;
	public static Item hardenedIronShovel;
	
	//Gold
	public static Item hardenedGoldSword;
	public static Item hardenedGoldPickaxe;
	public static Item hardenedGoldAxe;
	public static Item hardenedGoldHoe;
	public static Item hardenedGoldShovel;
	
	//Diamond
	public static Item hardenedDiamondSword;
	public static Item hardenedDiamondPickaxe;
	public static Item hardenedDiamondAxe;
	public static Item hardenedDiamondHoe;
	public static Item hardenedDiamondShovel;
	
	//Armor
	
	//Iron
	public static Item hardenedIronHelmet;
	public static Item hardenedIronChestplate;
	public static Item hardenedIronLeggings;
	public static Item hardenedIronBoots;
	
	//Gold
	public static Item hardenedGoldHelmet;
	public static Item hardenedGoldChestplate;
	public static Item hardenedGoldLeggings;
	public static Item hardenedGoldBoots;
	
	//Diamond
	public static Item hardenedDiamondHelmet;
	public static Item hardenedDiamondChestplate;
	public static Item hardenedDiamondLeggings;
	public static Item hardenedDiamondBoots;
	//Initilize Items
	public static void init() {
		
		//Cores
		defectiveHighPressureCore = new itemDefectiveHighPressureCore(itemInfo.defectiveHighPressureCore_ID);
		defectiveLowPressureCore = new itemDefectiveLowPressureCore(itemInfo.defectiveLowPressureCore_ID);
		highPressureCore = new itemHighPressureCore(itemInfo.highPressureCore_ID);
		lowPressureCore = new itemLowPressureCore(itemInfo.lowPressureCore_ID);
		
		//Pieces
		ironPiece = new itemIronPiece(itemInfo.ironPiece_ID);
		goldPiece = new itemGoldPiece(itemInfo.goldPiece_ID);
		diamondPiece = new itemDiamondPiece(itemInfo.diamondPiece_ID);
		
		//CompressedAir
		compressedAir = new itemCompressedAir(itemInfo.compressedAir_ID);
		
		//BetterIngots
		hardenedDiamond = new hardenedDiamond(itemInfo.hardenedDiamond_ID);
		hardenedIronIngot = new hardenedIronIngot(itemInfo.hardenedIronIngot_ID);
		hardenedGoldIngot = new hardenedGoldIngot(itemInfo.hardenedGoldIngot_ID);
		
		//Tools

		//Iron
		hardenedIronSword = new hardenedIronSword(itemInfo.hardenedIronSword_ID, hardenedIronMaterial);
		hardenedIronPickaxe = new hardenedIronPickaxe(itemInfo.hardenedIronPickaxe_ID, hardenedIronMaterial);
		hardenedIronAxe = new hardenedIronAxe(itemInfo.hardenedIronAxe_ID, hardenedIronMaterial);
		hardenedIronHoe = new hardenedIronHoe(itemInfo.hardenedIronHoe_ID, hardenedIronMaterial);
		hardenedIronShovel = new hardenedIronShovel(itemInfo.hardenedIronShovel_ID, hardenedIronMaterial);
		
		//Gold
		hardenedGoldSword = new hardenedGoldSword(itemInfo.hardenedGoldSword_ID, hardenedGoldMaterial);
		hardenedGoldPickaxe = new hardenedGoldPickaxe(itemInfo.hardenedGoldPickaxe_ID, hardenedGoldMaterial);
		hardenedGoldAxe = new hardenedGoldAxe(itemInfo.hardenedGoldAxe_ID, hardenedGoldMaterial);
		hardenedGoldHoe = new hardenedGoldHoe(itemInfo.hardenedGoldHoe_ID, hardenedGoldMaterial);
		hardenedGoldShovel = new hardenedGoldShovel(itemInfo.hardenedGoldShovel_ID, hardenedGoldMaterial);
		
		//Diamond
		hardenedDiamondSword = new hardenedDiamondSword(itemInfo.hardenedDiamondSword_ID, hardenedDiamondMaterial);
		hardenedDiamondPickaxe = new hardenedDiamondPickaxe(itemInfo.hardenedDiamondPickaxe_ID, hardenedDiamondMaterial);
		hardenedDiamondAxe = new hardenedDiamondAxe(itemInfo.hardenedDiamondAxe_ID, hardenedDiamondMaterial);
		hardenedDiamondHoe = new hardenedDiamondHoe(itemInfo.hardenedDiamondHoe_ID, hardenedDiamondMaterial);
		hardenedDiamondShovel = new hardenedDiamondShovel(itemInfo.hardenedDiamondShovel_ID, hardenedDiamondMaterial);

		
		//Armour
		
		//Iron
		hardenedIronHelmet = new hardenedIronHelmet(itemInfo.hardenedIronHelmet_ID, hardenedIronArmorMaterial, 3, 0);
		hardenedIronChestplate = new hardenedIronChestplate(itemInfo.hardenedIronChestplate_ID, hardenedIronArmorMaterial, 3 ,1);
		hardenedIronLeggings = new hardenedIronLeggings(itemInfo.hardenedIronLeggings_ID, hardenedIronArmorMaterial, 3 ,2);
		hardenedIronBoots = new hardenedIronBoots(itemInfo.hardenedIronBoots_ID, hardenedIronArmorMaterial, 3 , 3);
		
		//Gold
		hardenedGoldHelmet = new hardenedGoldHelmet(itemInfo.hardenedGoldHelmet_ID, hardenedGoldArmorMaterial, 3, 0);
		hardenedGoldChestplate = new hardenedGoldChestplate(itemInfo.hardenedGoldChestplate_ID, hardenedGoldArmorMaterial, 3 ,1);
		hardenedGoldLeggings = new hardenedGoldLeggings(itemInfo.hardenedGoldLeggings_ID, hardenedGoldArmorMaterial, 3 ,2);
		hardenedGoldBoots = new hardenedGoldBoots(itemInfo.hardenedGoldBoots_ID, hardenedGoldArmorMaterial, 3 , 3);
		
		//Diamond
		hardenedDiamondHelmet = new hardenedDiamondHelmet(itemInfo.hardenedDiamondHelmet_ID, hardenedDiamondArmorMaterial, 3, 0);
		hardenedDiamondChestplate = new hardenedDiamondChestplate(itemInfo.hardenedDiamondChestplate_ID, hardenedDiamondArmorMaterial, 3 ,1);
		hardenedDiamondLeggings = new hardenedDiamondLeggings(itemInfo.hardenedDiamondLeggings_ID, hardenedDiamondArmorMaterial, 3 ,2);
		hardenedDiamondBoots = new hardenedDiamondBoots(itemInfo.hardenedDiamondBoots_ID, hardenedDiamondArmorMaterial, 3 , 3);
	}
	
	
	//Add names
	public static void addNames() {
		
		//Cores
		LanguageRegistry.addName(defectiveHighPressureCore, itemInfo.defectiveHighPressureCore_NAME);	
		LanguageRegistry.addName(defectiveLowPressureCore, itemInfo.defectiveLowPressureCore_NAME);
		LanguageRegistry.addName(highPressureCore, itemInfo.highPressureCore_NAME);	
		LanguageRegistry.addName(lowPressureCore, itemInfo.lowPressureCore_NAME);
		
		//Pieces
		LanguageRegistry.addName(ironPiece, itemInfo.ironPiece_NAME);
		LanguageRegistry.addName(goldPiece, itemInfo.goldPiece_NAME);
		LanguageRegistry.addName(diamondPiece, itemInfo.diamondPiece_NAME);
		
		//CompressedAir
		LanguageRegistry.addName(compressedAir, itemInfo.compressedAir_NAME);
		
		//BetterIngots
		LanguageRegistry.addName(hardenedDiamond, itemInfo.hardenedDiamond_NAME);
		LanguageRegistry.addName(hardenedIronIngot, itemInfo.hardenedIronIngot_NAME);
		LanguageRegistry.addName(hardenedGoldIngot, itemInfo.hardenedGoldIngot_NAME);
		
		//Tools
		
		//Iron
		LanguageRegistry.addName(hardenedIronSword, itemInfo.hardenedIronSword_NAME);
		LanguageRegistry.addName(hardenedIronPickaxe, itemInfo.hardenedIronPickaxe_NAME);
		LanguageRegistry.addName(hardenedIronAxe, itemInfo.hardenedIronAxe_NAME);
		LanguageRegistry.addName(hardenedIronHoe, itemInfo.hardenedIronHoe_NAME);
		LanguageRegistry.addName(hardenedIronShovel, itemInfo.hardenedIronShovel_NAME);
		
		//Gold
		LanguageRegistry.addName(hardenedGoldSword, itemInfo.hardenedGoldSword_NAME);
		LanguageRegistry.addName(hardenedGoldPickaxe, itemInfo.hardenedGoldPickaxe_NAME);
		LanguageRegistry.addName(hardenedGoldAxe, itemInfo.hardenedGoldAxe_NAME);
		LanguageRegistry.addName(hardenedGoldHoe, itemInfo.hardenedGoldHoe_NAME);
		LanguageRegistry.addName(hardenedGoldShovel, itemInfo.hardenedGoldShovel_NAME);
		
		//Diamond
		LanguageRegistry.addName(hardenedDiamondSword, itemInfo.hardenedDiamondSword_NAME);
		LanguageRegistry.addName(hardenedDiamondPickaxe, itemInfo.hardenedDiamondPickaxe_NAME);
		LanguageRegistry.addName(hardenedDiamondAxe, itemInfo.hardenedDiamondAxe_NAME);
		LanguageRegistry.addName(hardenedDiamondHoe, itemInfo.hardenedDiamondHoe_NAME);
		LanguageRegistry.addName(hardenedDiamondShovel, itemInfo.hardenedDiamondShovel_NAME);
		
		//Armor
		
		//Iron
		LanguageRegistry.addName(hardenedIronHelmet, itemInfo.hardenedIronHelmet_NAME);
		LanguageRegistry.addName(hardenedIronChestplate, itemInfo.hardenedIronChestplate_NAME);
		LanguageRegistry.addName(hardenedIronLeggings, itemInfo.hardenedIronLeggings_NAME);
		LanguageRegistry.addName(hardenedIronBoots, itemInfo.hardenedIronBoots_NAME);
		
		//Gold
		LanguageRegistry.addName(hardenedGoldHelmet, itemInfo.hardenedGoldHelmet_NAME);
		LanguageRegistry.addName(hardenedGoldChestplate, itemInfo.hardenedGoldChestplate_NAME);
		LanguageRegistry.addName(hardenedGoldLeggings, itemInfo.hardenedGoldLeggings_NAME);
		LanguageRegistry.addName(hardenedGoldBoots, itemInfo.hardenedGoldBoots_NAME);
		
		//Diamond
		LanguageRegistry.addName(hardenedDiamondHelmet, itemInfo.hardenedDiamondHelmet_NAME);
		LanguageRegistry.addName(hardenedDiamondChestplate, itemInfo.hardenedDiamondChestplate_NAME);
		LanguageRegistry.addName(hardenedDiamondLeggings, itemInfo.hardenedDiamondLeggings_NAME);
		LanguageRegistry.addName(hardenedDiamondBoots, itemInfo.hardenedDiamondBoots_NAME);
	}
	
	//Register All Recipies
	public static void registerItemRecipes() {
		
		//defectiveLowPressureCore
		GameRegistry.addRecipe(new ItemStack(defectiveLowPressureCore),
			new Object[] { 	"SPS",
							"I I",
							"SIS",
							
							'S', Block.stone,
							'P', Block.pistonBase,
							'I', Item.ingotIron,
							
						 });	
		
		//defectiveHighPressureCore
		GameRegistry.addRecipe(new ItemStack(defectiveHighPressureCore),
				new Object[] { 	"GPG",
								"RDR",
								"GPG",
								
								'G', Item.ingotGold,
								'P', Block.pistonBase,
								'R', Item.redstoneRepeater,
								'D', Item.diamond,
							 });
		if(blockCrafting == false){
			
			//IronBlock <- IronPiece
			GameRegistry.addRecipe(new ItemStack(Block.blockIron),
					new Object[] { 	"III",
									"III",
									"III",
									
									'I', items.ironPiece,
								 });
			
			//GoldBlock <- GoldPiece
			GameRegistry.addRecipe(new ItemStack(Block.blockGold),
					new Object[] { 	"GGG",
									"GGG",
									"GGG",
									
									'G', items.goldPiece,
								 });
			
			//DiamondBlock <- DiamondPieces
			GameRegistry.addRecipe(new ItemStack(Block.blockDiamond),
					new Object[] { 	"DDD",
									"DDD",
									"DDD",
									
									'D', items.diamondPiece,
								 });
		}
		//hardenedDiamond <- DiamondPiece
		GameRegistry.addRecipe(new ItemStack(hardenedDiamond),
				new Object[] { 	"DDD",
								"DDD",
								"   ",
								
								'D', items.diamondPiece,
							 });
		//hardenedIronIngot <- IronPiece
		GameRegistry.addRecipe(new ItemStack(hardenedIronIngot),
				new Object[] { 	"III",
								"III",
								"   ",
								
								'I', items.ironPiece,
							 });
		//hardenedGoldIngot <- GoldPiece
		GameRegistry.addRecipe(new ItemStack(hardenedGoldIngot),
				new Object[] { 	"GGG",
								"GGG",
								"   ",
								
								'G', items.goldPiece,
							 });
//-----------------------------------------------------------------------------------------------------------------------------------------------------------
		//Tools
		
		//Iron
		
		//Sword
		GameRegistry.addRecipe(new ItemStack(hardenedIronSword),
				new Object[] { 	" I ",
								" I ",
								" S ",
								
								'I', items.hardenedIronIngot,
								'S', Item.stick,
							 });
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(hardenedIronPickaxe),
				new Object[] { 	"III",
								" S ",
								" S ",
								
								'I', items.hardenedIronIngot,
								'S', Item.stick,
							 });
		//Axe
		GameRegistry.addRecipe(new ItemStack(hardenedIronAxe),
				new Object[] { 	"II ",
								"IS ",
								" S ",
								
								'I', items.hardenedIronIngot,
								'S', Item.stick,
							 });
		//Hoe
		GameRegistry.addRecipe(new ItemStack(hardenedIronHoe),
				new Object[] { 	"II ",
								" S ",
								" S ",
								
								'I', items.hardenedIronIngot,
								'S', Item.stick,
							 });
		//Shovel
		GameRegistry.addRecipe(new ItemStack(hardenedIronShovel),
				new Object[] { 	" I ",
								" S ",
								" S ",
								
								'I', items.hardenedIronIngot,
								'S', Item.stick,
							 });
//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Gold
		
		//Sword
		GameRegistry.addRecipe(new ItemStack(hardenedGoldSword),
				new Object[] { 	" I ",
								" I ",
								" S ",
								
								'I', items.hardenedGoldIngot,
								'S', Item.stick,
							 });
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(hardenedGoldPickaxe),
				new Object[] { 	"III",
								" S ",
								" S ",
								
								'I', items.hardenedGoldIngot,
								'S', Item.stick,
							 });
		//Axe
		GameRegistry.addRecipe(new ItemStack(hardenedGoldAxe),
				new Object[] { 	"II ",
								"IS ",
								" S ",
								
								'I', items.hardenedGoldIngot,
								'S', Item.stick,
							 });
		//Hoe
		GameRegistry.addRecipe(new ItemStack(hardenedGoldHoe),
				new Object[] { 	"II ",
								" S ",
								" S ",
								
								'I', items.hardenedGoldIngot,
								'S', Item.stick,
							 });
		//Shovel
		GameRegistry.addRecipe(new ItemStack(hardenedGoldShovel),
				new Object[] { 	" I ",
								" S ",
								" S ",
								
								'I', items.hardenedGoldIngot,
								'S', Item.stick,
							 });

//--------------------------------------------------------------------------------------------------------------------------------------------------------
		//Diamond
		
		//Sword
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondSword),
				new Object[] { 	" I ",
								" I ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
							 });
		//Pickaxe
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondPickaxe),
				new Object[] { 	"III",
								" S ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
							 });
		//Axe
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondAxe),
				new Object[] { 	"II ",
								"IS ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
							 });
		//Hoe
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondHoe),
				new Object[] { 	"II ",
								" S ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
							 });
		//Shovel
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondShovel),
				new Object[] { 	" I ",
								" S ",
								" S ",
								
								'I', items.hardenedDiamond,
								'S', Item.stick,
							 });
//-------------------------------------------------------------------------------------------------------------------------------------------------------//
		//Armor
		
		//Iron
		
		//Helmet
		GameRegistry.addRecipe(new ItemStack(hardenedIronHelmet),
				new Object[] { 	"III",
								"I I",
								"   ",
								
								'I', items.hardenedIronIngot,
							 });
		//Chestplate
		GameRegistry.addRecipe(new ItemStack(hardenedIronChestplate),
				new Object[] { 	"I I",
								"III",
								"III",
								
								'I', items.hardenedIronIngot,
							 });
		//Leggings
		GameRegistry.addRecipe(new ItemStack(hardenedIronLeggings),
				new Object[] { 	"III",
								"I I",
								"I I",
								
								'I', items.hardenedIronIngot,
							 });
		//Boots
		GameRegistry.addRecipe(new ItemStack(hardenedIronBoots),
				new Object[] { 	"I I",
								"I I",
								"   ",
								
								'I', items.hardenedIronIngot,
							 });
//------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Gold
		
		//Helmet
		GameRegistry.addRecipe(new ItemStack(hardenedGoldHelmet),
				new Object[] { 	"III",
								"I I",
								"   ",
								
								'I', items.hardenedGoldIngot,
							 });
		//Chestplate
		GameRegistry.addRecipe(new ItemStack(hardenedGoldChestplate),
				new Object[] { 	"I I",
								"III",
								"III",
								
								'I', items.hardenedGoldIngot,
							 });
		//Leggings
		GameRegistry.addRecipe(new ItemStack(hardenedGoldLeggings),
				new Object[] { 	"III",
								"I I",
								"I I",
								
								'I', items.hardenedGoldIngot,
							 });
		//Boots
		GameRegistry.addRecipe(new ItemStack(hardenedGoldBoots),
				new Object[] { 	"I I",
								"I I",
								"   ",
								
								'I', items.hardenedGoldIngot,
							 });
//------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Diamond
		
		//Helmet
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondHelmet),
				new Object[] { 	"III",
								"I I",
								"   ",
								
								'I', items.hardenedDiamond,
							 });
		//Chestplate
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondChestplate),
				new Object[] { 	"I I",
								"III",
								"III",
								
								'I', items.hardenedDiamond,
							 });
		//Leggings
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondLeggings),
				new Object[] { 	"III",
								"I I",
								"I I",
								
								'I', items.hardenedDiamond,
							 });
		//Boots
		GameRegistry.addRecipe(new ItemStack(hardenedDiamondBoots),
				new Object[] { 	"I I",
								"I I",
								"   ",
								
								'I', items.hardenedDiamond,
							 });

	
	}
	
	//Register all Smelting Recipies
	public static void registerItemSmelting(){
		
		GameRegistry.addSmelting(itemInfo.defectiveLowPressureCore_DEFAULT, new ItemStack(items.lowPressureCore), 0.1f);	
	}
	public static void registerShaplessCrafting(){
        GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 5), new ItemStack(blocks.blockMyWood, 1));
	}
}
