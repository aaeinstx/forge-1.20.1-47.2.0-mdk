package net.ayo.ispmod.datagen;

import net.ayo.ispmod.IspMod;
import net.ayo.ispmod.block.ModBlocks;
import net.ayo.ispmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, IspMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.BAUXITE.get(), ModBlocks.DEEPSLATE_BAUXITE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BAUXITE.get(),ModBlocks.DEEPSLATE_BAUXITE.get(),ModBlocks.RAW_BAUXITE_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BAUXITE.get(),ModBlocks.DEEPSLATE_BAUXITE.get(),ModBlocks.RAW_BAUXITE_BLOCK.get(),ModBlocks.ALUMINUM_BLOCK.get(),ModBlocks.STEEL_BLOCK.get());
    }
}
