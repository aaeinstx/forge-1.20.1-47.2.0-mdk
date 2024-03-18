package net.ayo.ispmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties WROUGHT_APPLE = new FoodProperties.Builder().alwaysEat().nutrition(5).saturationMod(1).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600),1).build();
}
