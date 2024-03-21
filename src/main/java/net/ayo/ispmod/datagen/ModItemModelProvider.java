package net.ayo.ispmod.datagen;

import net.ayo.ispmod.IspMod;
import net.ayo.ispmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, IspMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ALUMINUM);
        simpleItem(ModItems.STEEL);
        simpleItem(ModItems.RAW_BAUXITE);
        simpleItem(ModItems.WROUGHT_APPLE);
        simpleItem(ModItems.METAL_DETECTOR);



        handheldItem(ModItems.STEEL_SWORD);
        handheldItem(ModItems.STEEL_PICKAXE);
        handheldItem(ModItems.STEEL_AXE);
        handheldItem(ModItems.STEEL_SHOVEL);
        handheldItem(ModItems.STEEL_HOE);
        handheldItem(ModItems.COMPOUND_BOW);
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(IspMod.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(IspMod.MODID,"item/" + item.getId().getPath()));
    }
}
