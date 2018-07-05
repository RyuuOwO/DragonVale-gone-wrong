package ryuu.mod.tabs;

import ryuu.mod.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DVItemsTab extends CreativeTabs{
	
	public DVItemsTab(String label) {super("dvitemstab");
	this.setBackgroundImageName("dvtab.png"); }
	public ItemStack getTabIconItem() {return new ItemStack(Item.getItemFromBlock(Blocks.BEACON));}

}
