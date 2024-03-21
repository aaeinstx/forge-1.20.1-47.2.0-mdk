package net.ayo.ispmod.item;

import net.ayo.ispmod.IspMod;
import net.ayo.ispmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IspMod.MODID);

    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALUMINUM = ITEMS.register("aluminum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BAUXITE = ITEMS.register("raw_bauxite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STAFF = ITEMS.register("staff",
            () -> new SwordItem(ModToolTiers.STEEL, -3, 0, new Item.Properties()));

    public static final RegistryObject<Item> STONE_STAFF = ITEMS.register("stone_staff",
            () -> new SwordItem(ModToolTiers.STEEL, -2, 1, new Item.Properties()));

    public static final RegistryObject<Item> IRON_STAFF = ITEMS.register("iron_staff",
            () -> new SwordItem(ModToolTiers.STEEL, -2, 0, new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_STAFF = ITEMS.register("diamond_staff",
            () -> new SwordItem(ModToolTiers.STEEL, -1, 1, new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_STAFF = ITEMS.register("netherite_staff",
            () -> new SwordItem(ModToolTiers.STEEL, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> COMPOUND_BOW = ITEMS.register("compound_bow",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_APPLE = ITEMS.register("wrought_apple",
            () -> new Item(new Item.Properties().food(ModFoods.WROUGHT_APPLE)));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL, 3/2, -2, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL, 7/2, -3, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL, 5/2, -3, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL, 1/2, -2, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, 7/2, -3, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
