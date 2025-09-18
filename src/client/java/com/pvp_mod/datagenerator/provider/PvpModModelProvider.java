package com.pvp_mod.datagenerator.provider;

import com.pvp_mod.registry.Items;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class PvpModModelProvider extends FabricModelProvider {
    public PvpModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Items.AMETHYST_APPLE, Models.GENERATED);
        itemModelGenerator.register(Items.DIAMOND_APPLE, Models.GENERATED);
        itemModelGenerator.register(Items.EMERALD_APPLE, Models.GENERATED);
        itemModelGenerator.register(Items.HAMBURGER, Models.GENERATED);
        itemModelGenerator.register(Items.KIWI, Models.GENERATED);
        itemModelGenerator.register(Items.NETHERITE_APPLE, Models.GENERATED);
        itemModelGenerator.register(Items.SLICED_BREAD, Models.GENERATED);
        itemModelGenerator.register(Items.SOFTSERVE_ICECREAM, Models.GENERATED);
        itemModelGenerator.register(Items.BEDROCK_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(Items.BEDROCK_INGOT, Models.GENERATED);

        itemModelGenerator.register(Items.BEDROCK_AXE, Models.HANDHELD);
        itemModelGenerator.register(Items.BEDROCK_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(Items.BEDROCK_HOE, Models.HANDHELD);
        itemModelGenerator.register(Items.BEDROCK_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(Items.BEDROCK_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(Items.BEDROCK_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(Items.BEDROCK_SWORD, Models.HANDHELD);
        itemModelGenerator.register(Items.ZAZAZAZAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(Items.BRUSH, Models.HANDHELD);

        itemModelGenerator.register(Items.WOODEN_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(Items.STONE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(Items.GOLDEN_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(Items.IRON_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(Items.DIAMOND_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(Items.NETHERITE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(Items.BEDROCK_PAXEL, Models.HANDHELD);

        itemModelGenerator.register(Items.BEDROCK_HELMET, Models.GENERATED);
        itemModelGenerator.register(Items.BEDROCK_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(Items.BEDROCK_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(Items.BEDROCK_BOOTS, Models.GENERATED);
    }
}
