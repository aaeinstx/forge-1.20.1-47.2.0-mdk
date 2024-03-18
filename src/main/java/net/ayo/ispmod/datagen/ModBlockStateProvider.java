package net.ayo.ispmod.datagen;

import net.ayo.ispmod.IspMod;
import net.ayo.ispmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, IspMod.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ALUMINUM_BLOCK);
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.RAW_BAUXITE_BLOCK);

        blockWithItem(ModBlocks.BAUXITE);
        blockWithItem(ModBlocks.DEEPSLATE_BAUXITE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
