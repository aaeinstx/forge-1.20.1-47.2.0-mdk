package net.ayo.ispmod.datagen;

import net.ayo.ispmod.IspMod;
import net.ayo.ispmod.block.ModBlocks;
import net.ayo.ispmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> ALUMINUM_SMELTABLES = List.of(ModItems.RAW_BAUXITE.get(),
            ModBlocks.BAUXITE.get(), ModBlocks.DEEPSLATE_BAUXITE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, ALUMINUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINUM.get(), 0.25f, 100, "aluminum");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALUMINUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S',ModItems.ALUMINUM.get())
                .unlockedBy(getHasName(ModItems.ALUMINUM.get()),has(ModItems.ALUMINUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S',ModItems.STEEL.get())
                .unlockedBy(getHasName(ModItems.STEEL.get()),has(ModItems.STEEL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_BAUXITE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S',ModItems.RAW_BAUXITE.get())
                .unlockedBy(getHasName(ModItems.RAW_BAUXITE.get()),has(ModItems.RAW_BAUXITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" T ")
                .define('S',ModItems.STEEL.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.STEEL.get()),has(ModItems.STEEL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S',ModItems.STEEL.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.STEEL.get()),has(ModItems.STEEL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_AXE.get())
                .pattern(" SS")
                .pattern(" TS")
                .pattern(" T ")
                .define('S',ModItems.STEEL.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.STEEL.get()),has(ModItems.STEEL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_SHOVEL.get())
                .pattern(" S ")
                .pattern(" T ")
                .pattern(" T ")
                .define('S',ModItems.STEEL.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.STEEL.get()),has(ModItems.STEEL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_HOE.get())
                .pattern("SS ")
                .pattern(" T ")
                .pattern(" T ")
                .define('S',ModItems.STEEL.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.STEEL.get()),has(ModItems.STEEL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STAFF.get())
                .pattern(" T ")
                .pattern(" T ")
                .pattern(" T ")
                .define('T', Items.STICK)
                .unlockedBy(getHasName(Items.STICK),has(Items.STICK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_STAFF.get())
                .pattern(" S ")
                .pattern(" T ")
                .pattern(" S ")
                .define('S',Items.IRON_INGOT)
                .define('T', Items.STICK)
                .unlockedBy(getHasName(Items.STICK),has(Items.STICK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STONE_STAFF.get())
                .pattern(" S ")
                .pattern(" T ")
                .pattern(" S ")
                .define('S',ModItems.STEEL.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(Items.STICK),has(Items.STICK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_STAFF.get())
                .pattern(" S ")
                .pattern(" T ")
                .pattern(" S ")
                .define('S',Items.DIAMOND)
                .define('T', Items.STICK)
                .unlockedBy(getHasName(Items.STICK),has(Items.STICK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHERITE_STAFF.get())
                .pattern(" S ")
                .pattern(" T ")
                .pattern(" S ")
                .define('S',Items.NETHERITE_INGOT)
                .define('T', Items.STICK)
                .unlockedBy(getHasName(Items.STICK),has(Items.STICK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" T ")
                .define('S',ModItems.ALUMINUM.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.ALUMINUM.get()),has(ModItems.ALUMINUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S',ModItems.ALUMINUM.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.ALUMINUM.get()),has(ModItems.ALUMINUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_AXE.get())
                .pattern(" SS")
                .pattern(" TS")
                .pattern(" T ")
                .define('S',ModItems.ALUMINUM.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.ALUMINUM.get()),has(ModItems.ALUMINUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_SHOVEL.get())
                .pattern(" S ")
                .pattern(" T ")
                .pattern(" T ")
                .define('S',ModItems.ALUMINUM.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.ALUMINUM.get()),has(ModItems.ALUMINUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_HOE.get())
                .pattern("SS ")
                .pattern(" T ")
                .pattern(" T ")
                .define('S',ModItems.ALUMINUM.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.ALUMINUM.get()),has(ModItems.ALUMINUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S',ModItems.ALUMINUM.get())
                .unlockedBy(getHasName(ModItems.ALUMINUM.get()),has(ModItems.ALUMINUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S',ModItems.ALUMINUM.get())
                .unlockedBy(getHasName(ModItems.ALUMINUM.get()),has(ModItems.ALUMINUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S',ModItems.ALUMINUM.get())
                .unlockedBy(getHasName(ModItems.ALUMINUM.get()),has(ModItems.ALUMINUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_BOOTS.get())
                .pattern("   ")
                .pattern("S S")
                .pattern("S S")
                .define('S',ModItems.ALUMINUM.get())
                .unlockedBy(getHasName(ModItems.ALUMINUM.get()),has(ModItems.ALUMINUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S',ModItems.STEEL.get())
                .unlockedBy(getHasName(ModItems.STEEL.get()),has(ModItems.STEEL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S',ModItems.STEEL.get())
                .unlockedBy(getHasName(ModItems.STEEL.get()),has(ModItems.STEEL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S',ModItems.STEEL.get())
                .unlockedBy(getHasName(ModItems.STEEL.get()),has(ModItems.STEEL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_BOOTS.get())
                .pattern("   ")
                .pattern("S S")
                .pattern("S S")
                .define('S',ModItems.STEEL.get())
                .unlockedBy(getHasName(ModItems.STEEL.get()),has(ModItems.STEEL.get()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINUM.get(), 9)
                .requires(ModBlocks.ALUMINUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ALUMINUM_BLOCK.get()),has(ModBlocks.ALUMINUM_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.STEEL_BLOCK.get()),has(ModBlocks.STEEL_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_BAUXITE.get(), 9)
                .requires(ModBlocks.RAW_BAUXITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_BAUXITE_BLOCK.get()),has(ModBlocks.RAW_BAUXITE_BLOCK.get()))
                .save(pWriter);
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, IspMod.MODID + ":"+ pResult + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
