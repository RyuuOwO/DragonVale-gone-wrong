package ryuu.mod.init;


import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import ryuu.mod.objects.armour.ArmourBase;
import ryuu.mod.objects.items.ItemBase;
import ryuu.mod.objects.tools.ToolAxe;
import ryuu.mod.objects.tools.ToolHoe;
import ryuu.mod.objects.tools.ToolPickaxe;
import ryuu.mod.objects.tools.ToolShovel;
import ryuu.mod.objects.tools.ToolSword;
import ryuu.mod.util.Reference;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
//Items
	public static final Item GEM = new ItemBase("gem");
	public static final Item COIN = new ItemBase("coin");
	public static final Item SACK = new ItemBase("sack");
	public static final Item SACKOFCOINS = new ItemBase("sackofcoins");


	public static final ToolMaterial TOOL_GEM = EnumHelper.addToolMaterial("tool_gem", 4, 4683, 24.0F,18.0F, 30);
	public static final ArmorMaterial ARMOUR_GEM = EnumHelper.addArmorMaterial("armour_gem", Reference.MODID + ":gem", 99, new int[]{6, 12, 16, 6}, 30,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);

//Tools
	public static final Item SWORD_GEM = new ToolSword("sword_gem", TOOL_GEM);
	public static final Item AXE_GEM = new ToolAxe("axe_gem", TOOL_GEM);
	public static final Item SHOVEL_GEM = new ToolShovel("shovel_gem", TOOL_GEM);
	public static final Item PICKAXE_GEM = new ToolPickaxe("pickaxe_gem", TOOL_GEM);
	public static final Item HOE_GEM = new ToolHoe("hoe_gem", TOOL_GEM);
	
//Armor
	public static final Item HELMET_GEM = new ArmourBase("helmet_gem", ARMOUR_GEM, 1,EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_GEM = new ArmourBase("chestplate_gem", ARMOUR_GEM, 1,EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_GEM = new ArmourBase("leggings_gem", ARMOUR_GEM, 2,EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_GEM = new ArmourBase("boots_gem", ARMOUR_GEM, 1, EntityEquipmentSlot.FEET);

}
