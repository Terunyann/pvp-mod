package com.pvp_mod.registry;

import com.mojang.serialization.MapCodec;
import com.pvp_mod.PvpMod;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class Enchantment {
    public static final RegistryKey<net.minecraft.enchantment.Enchantment> INDESTRUCTIBLE = of("indestructible");
    public static final RegistryKey<net.minecraft.enchantment.Enchantment> ASSASSINATION = of("assassination");

    private static RegistryKey<net.minecraft.enchantment.Enchantment> of(String path) {
        Identifier id = Identifier.of(PvpMod.MOD_ID, path);
        return RegistryKey.of(RegistryKeys.ENCHANTMENT, id);
    }

    private static <T extends EnchantmentEntityEffect> MapCodec<T> register(String id, MapCodec<T> codec) {
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(PvpMod.MOD_ID, id), codec);
    }

    public static void registerModEnchantmentEffects() {
        PvpMod.LOGGER.info("Registering EnchantmentEffects for" + PvpMod.MOD_ID);
    }

    public static void load() {
    }

}