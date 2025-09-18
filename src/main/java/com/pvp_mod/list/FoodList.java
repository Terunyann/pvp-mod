package com.pvp_mod.list;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class FoodList {
    public static final ConsumableComponent AMETHYST_APPLE_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 180 * 20, 3), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 15 * 20, 1), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 120 * 20, 1), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 180 * 20, 0), 1))
            .build();
    public static final FoodComponent AMETHYST_APPLE_COMPONENT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();

    public static final ConsumableComponent DIAMOND_APPLE_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 150 * 20, 3), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 15 * 20, 1), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100 * 20, 1), 1))
            .build();
    public static final FoodComponent DIAMOND_APPLE_COMPONENT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();

    public static final ConsumableComponent EMERALD_APPLE_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 180 * 20, 3), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 15 * 20, 1), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.OOZING, 1800 * 20, 4), 1))
            .build();
    public static final FoodComponent EMERALD_APPLE_COMPONENT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();

    public static final ConsumableComponent ENCHANTED_DIAMOND_APPLE_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200 * 20, 0), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200 * 20, 3), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200 * 20, 0), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 120 * 20, 0), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10 * 20, 4), 1))
            .build();
    public static final FoodComponent ENCHANTED_DIAMOND_APPLE_COMPONENT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();

    public static final ConsumableComponent ENCHANTED_NETHERITE_APPLE_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 250 * 20, 2), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 250 * 20, 3), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600 * 20, 0), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 250 * 20, 1), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 140 * 20, 0), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10 * 20, 5), 1))
            .build();
    public static final FoodComponent ENCHANTED_NETHERITE_APPLE_COMPONENT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();

    public static final ConsumableComponent HAMBURGER_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 180 * 20, 0), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 180 * 20, 0), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 180 * 20, 1), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10 * 20, 2), 1))
            .build();
    public static final FoodComponent HAMBURGER_COMPONENT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();

    public static final ConsumableComponent KIWI_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600 * 20, 4), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 10 * 20, 4), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600 * 20, 1), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 15 * 20, 0), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10 * 20, 5), 1))
            .build();
    public static final FoodComponent KIWI_COMPONENT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();

    public static final ConsumableComponent NETHERITE_APPLE_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 120 * 20, 1), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 180 * 20, 3), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200 * 20, 0), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 15 * 20, 2), 1))
            .build();
    public static final FoodComponent NETHERITE_APPLE_COMPONENT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();

    public static final ConsumableComponent SLICED_BREAD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10 * 20, 2), 1))
            .build();
    public static final FoodComponent SLICED_BREAD_COMPONENT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();

    public static final ConsumableComponent SOFTSERVE_ICECREAM_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 120 * 20, 0), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 120 * 20, 1), 1))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 15 * 20, 1), 1))
            .build();
    public static final FoodComponent SOFTSERVE_ICECREAM_COMPONENT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();

}
