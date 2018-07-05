package ryuu.mod.objects.blocks;

import ryuu.mod.Main;
import ryuu.mod.init.BlockInit;
import ryuu.mod.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import ryuu.mod.util.IHasModel;

public class BlockBase extends Block implements IHasModel{

public BlockBase(String name,Material material,float hardness,float resistance,
		         String toolClass,int level,float value,SoundType sound) {
	
	super(material);
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(Main.dvblockstab);
	setHardness(hardness);
	setResistance(resistance);
	setHarvestLevel(toolClass, level);
	setLightLevel(value);
	setSoundType(sound);
	
	BlockInit.BLOCKS.add(this);
	ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

@Override
public void registerModels() {

	Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
}


}
