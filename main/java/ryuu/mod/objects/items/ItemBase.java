package ryuu.mod.objects.items;

import ryuu.mod.Main;
import ryuu.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ryuu.mod.util.IHasModel;

public class ItemBase extends Item implements IHasModel{

public ItemBase(String name) {
	
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(Main.dvitemstab);
	
	ItemInit.ITEMS.add(this);
}

@Override
public void registerModels() {

	Main.proxy.registerItemRenderer(this, 0, "inventory");
}

}
