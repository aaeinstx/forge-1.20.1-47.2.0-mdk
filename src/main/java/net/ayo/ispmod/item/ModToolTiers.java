package net.ayo.ispmod.item;

import net.ayo.ispmod.IspMod;
import net.ayo.ispmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;


public class ModToolTiers {
    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1600, 1f, 4f, 10,
                    ModTags.Blocks.NEEDS_STEEL_TOOL, ()-> Ingredient.of(ModItems.STEEL.get())),
            new ResourceLocation(IspMod.MODID, "steel"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND, Tiers.NETHERITE)
    );

    public static final Tier ALUMINUM = TierSortingRegistry.registerTier(
            new ForgeTier(3, 900, 1f, 2f, 10,
                    Tags.Blocks.NEEDS_NETHERITE_TOOL, ()-> Ingredient.of(ModItems.ALUMINUM.get())),
            new ResourceLocation(IspMod.MODID, "aluminum"), List.of(Tiers.IRON), List.of(ModToolTiers.STEEL, Tiers.DIAMOND, Tiers.NETHERITE)
    );
}
