package EasyCompressorMod.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import EasyCompressorMod.blocks.blockInfo;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class generationHandler implements IWorldGenerator{

	private WorldGenerator blockCompressedAir;
	
	public generationHandler(){
		GameRegistry.registerWorldGenerator(this);
		blockCompressedAir = new WorldGenMinable(blockInfo.compressedAirOre_ID, 6);
	}
	
	private void generateStandardOre(Random rand, int chunkX, int chunkZ, World world, int iterations, WorldGenerator gen, int lowestY, int highestY){
		for(int i = 0; i < iterations; i++){
			int x = chunkX * rand.nextInt(16);
			int y = rand.nextInt(highestY - lowestY) + lowestY;
			int z = chunkZ * rand.nextInt(16);
			
			gen.generate(world, rand, x, y, z);
		}	
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
			generateStandardOre(random, chunkX, chunkZ, world, 8, blockCompressedAir, 8, 64);
	}
}
