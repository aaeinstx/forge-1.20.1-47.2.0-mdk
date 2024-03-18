package net.ayo.ispmod.item;

import net.ayo.ispmod.IspMod;
import net.ayo.ispmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
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

    public static final RegistryObject<Item> WROUGHT_APPLE = ITEMS.register("wrought_apple",
            () -> new Item(new Item.Properties().food(ModFoods.WROUGHT_APPLE)));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
