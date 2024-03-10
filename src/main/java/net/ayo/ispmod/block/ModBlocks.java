package net.ayo.ispmod.block;

import net.ayo.ispmod.IspMod;
import net.ayo.ispmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, IspMod.MODID);

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () ->  new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(6.0F, 7.0F)));

    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () ->  new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5.0F, 7.0F)));

    public static final RegistryObject<Block> BAUXITE = registerBlock("bauxite",
            () ->  new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static  <T extends  Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
    return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus ) {
        BLOCKS.register(eventBus);
    }
}
