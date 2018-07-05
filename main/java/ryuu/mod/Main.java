package ryuu.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ryuu.mod.proxy.CommonProxy;
import ryuu.mod.tabs.DVItemsTab;
import ryuu.mod.tabs.DVBlocksTab;
import ryuu.mod.tabs.DVDragonsTab;
import ryuu.mod.util.Reference;
import ryuu.mod.util.handlers.RegistryHandler;

@Mod(modid = Reference.MODID,name = Reference.NAME,version = Reference.VERSION)
public class Main {
	
	public static final CreativeTabs dvblockstab = new DVBlocksTab("dvblockstab");
	public static final CreativeTabs dvitemstab = new DVItemsTab("dvitemstab");
	public static final CreativeTabs dvdragonstab = new DVDragonsTab("dvdragonstab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {}
	

}
