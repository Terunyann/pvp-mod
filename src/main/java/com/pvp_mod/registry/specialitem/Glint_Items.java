package com.pvp_mod.registry.specialitem;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;

public class Glint_Items extends Item {
    public Glint_Items(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getDefaultStack() {
        ItemStack stack = new ItemStack(this);
        stack.addEnchantment((RegistryEntry<Enchantment>) Enchantments.UNBREAKING, 1); // 見た目だけ光らせる
        return stack;
    }
}
