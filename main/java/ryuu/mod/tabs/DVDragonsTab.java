package ryuu.mod.tabs;

import ryuu.mod.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DVDragonsTab extends CreativeTabs{
	
	public DVDragonsTab(String label) {super("dvdragonstab");
	this.setBackgroundImageName("dvtab.png"); }
	public ItemStack getTabIconItem() {return new ItemStack(Item.getItemFromBlock(Blocks.BEACON));}

}
