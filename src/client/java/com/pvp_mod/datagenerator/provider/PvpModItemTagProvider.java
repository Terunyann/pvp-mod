package com.pvp_mod.datagenerator.provider;

import com.pvp_mod.registry.Items;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class PvpModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public PvpModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registries) {
        super(output, registries);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        
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
                        Items.BEDROCK_SHOVEL
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
                     Items.BEDROCK_PAXEL
                );
    }
}
