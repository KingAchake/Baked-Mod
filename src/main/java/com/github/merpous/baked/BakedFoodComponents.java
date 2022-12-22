package com.github.merpous.baked;


import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class BakedFoodComponents {

    public static final FoodComponent BAKED_APPLE = (new FoodComponent.Builder()).hunger(5).saturationModifier(0.3F).build();

    public static final FoodComponent HONEY_CANDY = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.1F).build();

}
