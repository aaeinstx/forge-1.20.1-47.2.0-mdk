package net.ayo.ispmod.item;

import net.ayo.ispmod.IspMod;
import net.ayo.ispmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IspMod.MODID);

    public static final RegistryObject<CreativeModeTab> ISP_TAB = CREATIVE_MODE_TABS.register("isp_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEEL.get()))
                    .title(Component.translatable("creativetab.isp_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ALUMINUM.get());
                        pOutput.accept(ModItems.STEEL.get());
                        pOutput.accept(ModItems.RAW_BAUXITE.get());
                        pOutput.accept(ModItems.WROUGHT_APPLE.get());

                        pOutput.accept(ModBlocks.STEEL_BLOCK.get());
                        pOutput.accept(ModBlocks.ALUMINUM_BLOCK.get());
                        pOutput.accept(ModBlocks.BAUXITE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_BAUXITE.get());
                        pOutput.accept(ModBlocks.RAW_BAUXITE_BLOCK.get());
                    })
                    .build());


    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
