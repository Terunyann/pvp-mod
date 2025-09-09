package com.pvp_mod.datagenerator.provider;

import com.pvp_mod.registry.Items;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class PvpModRecipeProvider extends FabricRecipeProvider {
    public PvpModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);

                createShaped(RecipeCategory.FOOD, Items.DIAMOND_APPLE, 1)
                        .pattern("ddd")
                        .pattern("dad")
                        .pattern("ddd")
                        .input('d', net.minecraft.item.Items.DIAMOND)
                        .input('a', net.minecraft.item.Items.APPLE)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.DIAMOND), conditionsFromItem(net.minecraft.item.Items.DIAMOND))
                        .offerTo(exporter);

                createShaped(RecipeCategory.FOOD, Items.ENCHANTED_DIAMOND_APPLE, 1)
                        .pattern("ddd")
                        .pattern("dad")
                        .pattern("ddd")
                        .input('d', net.minecraft.item.Items.DIAMOND_BLOCK) // 'w' means "any wool"
                        .input('a', net.minecraft.item.Items.APPLE)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.DIAMOND_BLOCK), conditionsFromItem(net.minecraft.item.Items.DIAMOND_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, Items.ENCHANTED_NETHERITE_APPLE, 1) // You can also specify an int to produce more than one
                        .input(Items.ENCHANTED_DIAMOND_APPLE)
                        .input(net.minecraft.item.Items.NETHERITE_INGOT)
                        .criterion(hasItem(net.minecraft.item.Items.NETHERITE_INGOT), conditionsFromItem(net.minecraft.item.Items.NETHERITE_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.FOOD, Items.HAMBURGER, 1)
                        .pattern(" p ")
                        .pattern("jbm")
                        .pattern(" p ")
                        .input('p', net.minecraft.item.Items.BREAD)
                        .input('j', net.minecraft.item.Items.BAKED_POTATO)
                        .input('b', net.minecraft.item.Items.COOKED_BEEF)
                        .input('m', net.minecraft.item.Items.MILK_BUCKET)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.BREAD), conditionsFromItem(net.minecraft.item.Items.BREAD))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, Items.NETHERITE_APPLE, 1) // You can also specify an int to produce more than one
                        .input(net.minecraft.item.Items.NETHERITE_INGOT)
                        .input(Items.DIAMOND_APPLE)
                        .criterion(hasItem(net.minecraft.item.Items.NETHERITE_INGOT), conditionsFromItem(net.minecraft.item.Items.NETHERITE_INGOT))
                        .offerTo(exporter);

                offerSmelting(
                        List.of(net.minecraft.item.Items.BREAD), // Inputs
                        RecipeCategory.FOOD, // Category
                        Items.SLICED_BREAD, // Output
                        0.1f, // Experience
                        300, // Cooking time
                        "food" // group
                );

                createShaped(RecipeCategory.FOOD, Items.SOFTSERVE_ICECREAM, 1)
                        .pattern("msm")
                        .pattern(" b ")
                        .pattern(" w ")
                        .input('m', net.minecraft.item.Items.MILK_BUCKET)
                        .input('s', net.minecraft.item.Items.SUGAR)
                        .input('b', net.minecraft.item.Items.SNOWBALL)
                        .input('w', net.minecraft.item.Items.WHEAT)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.MILK_BUCKET), conditionsFromItem(net.minecraft.item.Items.MILK_BUCKET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, net.minecraft.item.Items.BEDROCK, 4)
                        .pattern("bbs")
                        .pattern("oto")
                        .pattern("ssn")
                        .input('b', net.minecraft.item.Items.BLACKSTONE)
                        .input('s', net.minecraft.item.Items.STONE)
                        .input('o', net.minecraft.item.Items.OBSIDIAN)
                        .input('t', net.minecraft.item.Items.NETHER_STAR)
                        .input('n', net.minecraft.item.Items.NETHERITE_INGOT)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.BLACKSTONE), conditionsFromItem(net.minecraft.item.Items.BLACKSTONE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.BEDROCK_AXE, 1)
                        .pattern("bb")
                        .pattern("bi")
                        .pattern(" i")
                        .input('b', net.minecraft.item.Items.BEDROCK)
                        .input('i', Items.BEDROCK_INGOT)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.BEDROCK), conditionsFromItem(net.minecraft.item.Items.BEDROCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.BEDROCK_BATTLEAXE, 1)
                        .pattern("bib")
                        .pattern("bab")
                        .pattern(" i ")
                        .input('b', net.minecraft.item.Items.BEDROCK)
                        .input('i', Items.BEDROCK_INGOT)
                        .input('a', Items.BEDROCK_AXE)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.BEDROCK), conditionsFromItem(net.minecraft.item.Items.BEDROCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.BEDROCK_HOE, 1)
                        .pattern("bb")
                        .pattern(" i")
                        .pattern(" i")
                        .input('b', net.minecraft.item.Items.BEDROCK)
                        .input('i', Items.BEDROCK_INGOT)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.BEDROCK), conditionsFromItem(net.minecraft.item.Items.BEDROCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.BEDROCK_INGOT, 1)
                        .pattern("ebb")
                        .pattern("bbn")
                        .input('e', net.minecraft.item.Items.EXPERIENCE_BOTTLE)
                        .input('b', net.minecraft.item.Items.BEDROCK)
                        .input('n', net.minecraft.item.Items.NETHER_STAR)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.BEDROCK), conditionsFromItem(net.minecraft.item.Items.BEDROCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.BEDROCK_PAXEL, 1)
                        .pattern("aip")
                        .pattern(" i ")
                        .pattern(" s ")
                        .input('a', Items.BEDROCK_AXE)
                        .input('i', Items.BEDROCK_INGOT)
                        .input('p', Items.BEDROCK_PICKAXE)
                        .input('s', Items.BEDROCK_SHOVEL)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.BEDROCK), conditionsFromItem(net.minecraft.item.Items.BEDROCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.BEDROCK_PICKAXE, 1)
                        .pattern("bbb")
                        .pattern(" i ")
                        .pattern(" i ")
                        .input('b', net.minecraft.item.Items.BEDROCK)
                        .input('i', Items.BEDROCK_INGOT)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.BEDROCK), conditionsFromItem(net.minecraft.item.Items.BEDROCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.BEDROCK_SCYTHE, 1)
                        .pattern("ibi")
                        .pattern("iai")
                        .pattern("ioi")
                        .input('i', Items.BEDROCK_INGOT)
                        .input('b', Items.BEDROCK_UPGRADE_SMITHING_TEMPLATE)
                        .input('a', Items.BEDROCK_HOE)
                        .input('o', net.minecraft.item.Items.OMINOUS_BOTTLE)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.BEDROCK), conditionsFromItem(net.minecraft.item.Items.BEDROCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.BEDROCK_SHOVEL, 1)
                        .pattern("b")
                        .pattern("i")
                        .pattern("i")
                        .input('b', net.minecraft.item.Items.BEDROCK)
                        .input('i', Items.BEDROCK_INGOT)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.BEDROCK), conditionsFromItem(net.minecraft.item.Items.BEDROCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.BEDROCK_SWORD, 1)
                        .pattern("b")
                        .pattern("b")
                        .pattern("i")
                        .input('b', net.minecraft.item.Items.BEDROCK)
                        .input('i', Items.BEDROCK_INGOT)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.BEDROCK), conditionsFromItem(net.minecraft.item.Items.BEDROCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.BEDROCK_UPGRADE_SMITHING_TEMPLATE, 1)
                        .pattern("ibi")
                        .pattern("iai")
                        .pattern("iii")
                        .input('i', Items.BEDROCK_INGOT)
                        .input('b', net.minecraft.item.Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .input('a', net.minecraft.item.Items.BEDROCK)
                        .group("multi_bench")
                        .criterion(hasItem(net.minecraft.item.Items.BEDROCK), conditionsFromItem(net.minecraft.item.Items.BEDROCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.BEDROCK_HELMET, 1)
                        .pattern("iii")
                        .pattern("i i")
                        .input('i', Items.BEDROCK_INGOT)
                        .group("multi_bench")
                        .criterion(hasItem(Items.BEDROCK_INGOT), conditionsFromItem(Items.BEDROCK_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.BEDROCK_CHESTPLATE, 1)
                        .pattern("i i")
                        .pattern("iii")
                        .pattern("iii")
                        .input('i', Items.BEDROCK_INGOT)
                        .group("multi_bench")
                        .criterion(hasItem(Items.BEDROCK_INGOT), conditionsFromItem(Items.BEDROCK_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.BEDROCK_LEGGINGS, 1)
                        .pattern("iii")
                        .pattern("i i")
                        .pattern("i i")
                        .input('i', Items.BEDROCK_INGOT)
                        .group("multi_bench")
                        .criterion(hasItem(Items.BEDROCK_INGOT), conditionsFromItem(Items.BEDROCK_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.BEDROCK_BOOTS, 1)
                        .pattern("i i")
                        .pattern("i i")
                        .input('i', Items.BEDROCK_INGOT)
                        .group("multi_bench")
                        .criterion(hasItem(Items.BEDROCK_INGOT), conditionsFromItem(Items.BEDROCK_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.WOODEN_PAXEL, 1)
                        .pattern("abp")
                        .pattern(" b ")
                        .pattern(" s ")
                        .input('a', net.minecraft.item.Items.WOODEN_AXE)
                        .input('b', net.minecraft.item.Items.STICK)
                        .input('p', net.minecraft.item.Items.WOODEN_PICKAXE)
                        .input('s', net.minecraft.item.Items.WOODEN_SHOVEL)
                        .criterion(hasItem(net.minecraft.item.Items.STICK), conditionsFromItem(net.minecraft.item.Items.STICK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.STONE_PAXEL, 1)
                        .pattern("abp")
                        .pattern(" b ")
                        .pattern(" s ")
                        .input('a', net.minecraft.item.Items.STONE_AXE)
                        .input('b', net.minecraft.item.Items.STICK)
                        .input('p', net.minecraft.item.Items.STONE_PICKAXE)
                        .input('s', net.minecraft.item.Items.STONE_SHOVEL)
                        .criterion(hasItem(net.minecraft.item.Items.STICK), conditionsFromItem(net.minecraft.item.Items.STICK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.GOLDEN_PAXEL, 1)
                        .pattern("abp")
                        .pattern(" b ")
                        .pattern(" s ")
                        .input('a', net.minecraft.item.Items.GOLDEN_AXE)
                        .input('b', net.minecraft.item.Items.STICK)
                        .input('p', net.minecraft.item.Items.GOLDEN_PICKAXE)
                        .input('s', net.minecraft.item.Items.GOLDEN_SHOVEL)
                        .criterion(hasItem(net.minecraft.item.Items.STICK), conditionsFromItem(net.minecraft.item.Items.STICK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.IRON_PAXEL, 1)
                        .pattern("abp")
                        .pattern(" b ")
                        .pattern(" s ")
                        .input('a', net.minecraft.item.Items.IRON_AXE)
                        .input('b', net.minecraft.item.Items.STICK)
                        .input('p', net.minecraft.item.Items.IRON_PICKAXE)
                        .input('s', net.minecraft.item.Items.IRON_SHOVEL)
                        .criterion(hasItem(net.minecraft.item.Items.STICK), conditionsFromItem(net.minecraft.item.Items.STICK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.DIAMOND_PAXEL, 1)
                        .pattern("abp")
                        .pattern(" b ")
                        .pattern(" s ")
                        .input('a', net.minecraft.item.Items.DIAMOND_AXE)
                        .input('b', net.minecraft.item.Items.STICK)
                        .input('p', net.minecraft.item.Items.DIAMOND_PICKAXE)
                        .input('s', net.minecraft.item.Items.DIAMOND_SHOVEL)
                        .criterion(hasItem(net.minecraft.item.Items.STICK), conditionsFromItem(net.minecraft.item.Items.STICK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, Items.NETHERITE_PAXEL, 1)
                        .pattern("abp")
                        .pattern(" b ")
                        .pattern(" s ")
                        .input('a', net.minecraft.item.Items.NETHERITE_AXE)
                        .input('b', net.minecraft.item.Items.STICK)
                        .input('p', net.minecraft.item.Items.NETHERITE_PICKAXE)
                        .input('s', net.minecraft.item.Items.NETHERITE_SHOVEL)
                        .criterion(hasItem(net.minecraft.item.Items.STICK), conditionsFromItem(net.minecraft.item.Items.STICK))
                        .offerTo(exporter);

            }
        };
    }

    @Override
    public String getName() {
        return "PvpModRecipeProvider";
    }
}