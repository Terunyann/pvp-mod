package com.pvp_mod;

import com.pvp_mod.list.enums.PvpModArmorMaterial;
import com.pvp_mod.registry.Enchantment;
import com.pvp_mod.registry.Items;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.pvp_mod.registry.Creative_tab.CUSTOM_ITEM_GROUP;
import static com.pvp_mod.registry.Creative_tab.CUSTOM_ITEM_GROUP_KEY;

public class PvpMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("pvp_mod");
    public static final String MOD_ID = "pvp_mod";

    @Override
    public void onInitialize() {
        Items.initialize();
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);
        LOGGER.info("Loading...");
        PvpModArmorMaterial.load();
        PvpModArmorMaterial.load();
        Enchantment.load();


// Register items to the custom item group.
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(Items.AMETHYST_APPLE);
            itemGroup.add(Items.DIAMOND_APPLE);
            itemGroup.add(Items.ENCHANTED_DIAMOND_APPLE);
            itemGroup.add(Items.EMERALD_APPLE);
            itemGroup.add(Items.NETHERITE_APPLE);
            itemGroup.add(Items.ENCHANTED_NETHERITE_APPLE);
            itemGroup.add(Items.HAMBURGER);
            itemGroup.add(Items.KIWI);
            itemGroup.add(Items.HAMBURGER);
            itemGroup.add(Items.SLICED_BREAD);
            itemGroup.add(Items.SOFTSERVE_ICECREAM);

            itemGroup.add(Items.BEDROCK_INGOT);
            itemGroup.add(Items.BEDROCK_UPGRADE_SMITHING_TEMPLATE);
            itemGroup.add(Items.BRUSH);

            itemGroup.add(Items.BEDROCK_AXE);
            itemGroup.add(Items.BEDROCK_BATTLEAXE);
            itemGroup.add(Items.BEDROCK_HOE);
            itemGroup.add(Items.BEDROCK_PICKAXE);
            itemGroup.add(Items.BEDROCK_SCYTHE);
            itemGroup.add(Items.BEDROCK_SHOVEL);
            itemGroup.add(Items.BEDROCK_SWORD);
            itemGroup.add(Items.ZAZAZAZAL_SWORD);

            itemGroup.add(Items.WOODEN_PAXEL);
            itemGroup.add(Items.STONE_PAXEL);
            itemGroup.add(Items.GOLDEN_PAXEL);
            itemGroup.add(Items.IRON_PAXEL);
            itemGroup.add(Items.DIAMOND_PAXEL);
            itemGroup.add(Items.NETHERITE_PAXEL);
            itemGroup.add(Items.BEDROCK_PAXEL);

            itemGroup.add(Items.BEDROCK_HELMET);
            itemGroup.add(Items.BEDROCK_CHESTPLATE);
            itemGroup.add(Items.BEDROCK_LEGGINGS);
            itemGroup.add(Items.BEDROCK_BOOTS);

        });
    }

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID,path);
    }

}