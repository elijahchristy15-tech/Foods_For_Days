package net.eli.tutorialmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties SLICED_CAKE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1.00f)
            .alwaysEdible()
            .build();

    public static final FoodProperties SOUL = new FoodProperties.Builder()
            .nutrition(0)
            .saturationModifier(0.00f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 2000), 1.00f)
            .alwaysEdible()
            .build();


    public static final FoodProperties ENERGY_DRINK = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.00f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2000), 1.00f)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 2000), 1.00f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2000), 1.00f)
            .alwaysEdible()
            .build();

}
