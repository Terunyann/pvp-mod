package com.pvp_mod.datagenerator.provider;

import com.pvp_mod.PvpMod;
import com.pvp_mod.registry.Items;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class PvpModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public PvpModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Item> ENCHANTED_FOOD = TagKey.of(RegistryKeys.ITEM, Identifier.of(PvpMod.MOD_ID, "enchanted_item"));
    public static final TagKey<Item> BEDROCK_TOOL_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of(PvpMod.MOD_ID, "bedrock_tool_materials"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(BEDROCK_TOOL_MATERIALS)
                .add(Items.BEDROCK_INGOT);

        valueLookupBuilder(ENCHANTED_FOOD)
                .add(Items.ENCHANTED_DIAMOND_APPLE,
                        Items.ENCHANTED_NETHERITE_APPLE
                );

        valueLookupBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(Items.BEDROCK_HELMET,
                        Items.BEDROCK_CHESTPLATE,
                        Items.BEDROCK_LEGGINGS,
                        Items.BEDROCK_BOOTS
                );

        valueLookupBuilder(ItemTags.SWORD_ENCHANTABLE)
                .add(Items.BEDROCK_SWORD,
                        Items.ZAZAZAZAL_SWORD
                )
        ;

        valueLookupBuilder(ItemTags.MINING_ENCHANTABLE)
                .add(Items.WOODEN_PAXEL,
                        Items.STONE_PAXEL,
                        Items.IRON_PAXEL,
                        Items.GOLDEN_PAXEL,
                        Items.DIAMOND_PAXEL,
                        Items.NETHERITE_PAXEL,
                        Items.BEDROCK_PAXEL,
                        Items.BEDROCK_AXE,
                        Items.BEDROCK_PICKAXE,
                        Items.BEDROCK_SHOVEL,
                        Items.BEDROCK_BATTLEAXE
                );

        valueLookupBuilder(ItemTags.PICKAXES)
                .add(Items.WOODEN_PAXEL,
                        Items.STONE_PAXEL,
                        Items.IRON_PAXEL,
                        Items.GOLDEN_PAXEL,
                        Items.DIAMOND_PAXEL,
                        Items.NETHERITE_PAXEL,
                        Items.BEDROCK_PAXEL
                );

        valueLookupBuilder(ItemTags.SHOVELS)
                .add(Items.WOODEN_PAXEL,
                        Items.STONE_PAXEL,
                        Items.IRON_PAXEL,
                        Items.GOLDEN_PAXEL,
                        Items.DIAMOND_PAXEL,
                        Items.NETHERITE_PAXEL,
                        Items.BEDROCK_PAXEL
                );

        valueLookupBuilder(ItemTags.AXES)
                .add(Items.WOODEN_PAXEL,
                        Items.STONE_PAXEL,
                        Items.IRON_PAXEL,
                        Items.GOLDEN_PAXEL,
                        Items.DIAMOND_PAXEL,
                        Items.NETHERITE_PAXEL,
                        Items.BEDROCK_PAXEL,
                        Items.BEDROCK_BATTLEAXE
                );

        valueLookupBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(Items.BEDROCK_HELMET,
                        Items.BEDROCK_CHESTPLATE,
                        Items.BEDROCK_LEGGINGS,
                        Items.BEDROCK_BOOTS,
                        Items.BEDROCK_SWORD,
                        Items.ZAZAZAZAL_SWORD,
                        Items.WOODEN_PAXEL,
                        Items.STONE_PAXEL,
                        Items.IRON_PAXEL,
                        Items.GOLDEN_PAXEL,
                        Items.DIAMOND_PAXEL,
                        Items.NETHERITE_PAXEL,
                        Items.BEDROCK_PAXEL,
                        Items.BEDROCK_BATTLEAXE,
                        Items.BEDROCK_SCYTHE
                );
    }
}
