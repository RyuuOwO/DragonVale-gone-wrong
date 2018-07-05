package ryuu.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import ryuu.mod.objects.blocks.BlockBase;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final  Block BLOCK_GEM = new BlockBase("block_gem", Material.IRON,3.0F,45.0F,
			"pickaxe",2,0.0F,SoundType.METAL);
	public static final  Block BLOCK_GEMORE = new BlockBase("block_gemore", Material.ROCK,2.5F,45.0F,
			"pickaxe",2,0.0F,SoundType.STONE);
	public static final  Block BLOCK_VOLCANICROCK = new BlockBase("block_volcanicrock", Material.IRON,3.0F,45.0F,
			"pickaxe",2,0.0F,SoundType.STONE);
	public static final  Block BLOCK_ROCK = new BlockBase("block_rock", Material.IRON,3.0F,45.0F,
			"pickaxe",2,0.0F,SoundType.STONE);
	public static final  Block BLOCK_CACTUS = new BlockBase("block_cactus", Material.IRON,3.0F,45.0F,
			"pickaxe",2,0.0F,SoundType.PLANT);
	public static final  Block BLOCK_MARKET = new BlockBase("block_market", Material.IRON,3.0F,45.0F,
			"pickaxe",2,0.0F,SoundType.METAL);
	public static final  Block BLOCK_PLANTATION = new BlockBase("block_plantation", Material.IRON,3.0F,45.0F,
			"pickaxe",2,0.0F,SoundType.METAL);
	public static final  Block BLOCK_NURSERY = new BlockBase("block_nursery", Material.IRON,3.0F,45.0F,
			"pickaxe",2,0.0F,SoundType.METAL);
	public static final  Block BLOCK_EI = new BlockBase("block_ei", Material.IRON,3.0F,45.0F,
			"pickaxe",2,0.0F,SoundType.METAL);
}