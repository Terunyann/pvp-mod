package com.pvp_mod.registry;

import com.pvp_mod.PvpMod;
import com.pvp_mod.list.enums.PvpModArmorMaterial;
import com.pvp_mod.list.enums.PvpModToolMaterial;
import com.pvp_mod.registry.specialitem.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;

import static com.pvp_mod.list.FoodList.*;

public abstract class Items {

//Foods


    public static final Item AMETHYST_APPLE = register("amethyst_apple", Item::new,
            new Item.Settings().food(AMETHYST_APPLE_COMPONENT, AMETHYST_APPLE_CONSUMABLE_COMPONENT)
                    .rarity(Rarity.EPIC)
    );

    public static final Item DIAMOND_APPLE = register("diamond_apple", Item::new,
            new Item.Settings().food(DIAMOND_APPLE_COMPONENT, DIAMOND_APPLE_CONSUMABLE_COMPONENT)
                    .rarity(Rarity.EPIC)
    );

    public static final Item ENCHANTED_DIAMOND_APPLE = register("enchanted_diamond_apple", Glint_Items::new,
            new Item.Settings().food(ENCHANTED_DIAMOND_APPLE_COMPONENT, ENCHANTED_DIAMOND_APPLE_CONSUMABLE_COMPONENT)
                    .rarity(Rarity.EPIC)
    );

    public static final Item EMERALD_APPLE = register("emerald_apple", Item::new,
            new Item.Settings().food(EMERALD_APPLE_COMPONENT, EMERALD_APPLE_CONSUMABLE_COMPONENT)
                    .rarity(Rarity.EPIC)
    );

    public static final Item NETHERITE_APPLE = register("netherite_apple", Item::new,
            new Item.Settings().food(NETHERITE_APPLE_COMPONENT, NETHERITE_APPLE_CONSUMABLE_COMPONENT)
                    .rarity(Rarity.EPIC)
    );

    public static final Item ENCHANTED_NETHERITE_APPLE = register("enchanted_netherite_apple", Glint_Items::new,
            new Item.Settings().food(ENCHANTED_NETHERITE_APPLE_COMPONENT, ENCHANTED_NETHERITE_APPLE_CONSUMABLE_COMPONENT)
                    .rarity(Rarity.EPIC)
    );

    public static final Item HAMBURGER = register("hamburger", Item::new,
            new Item.Settings().food(HAMBURGER_COMPONENT, HAMBURGER_CONSUMABLE_COMPONENT)
                    .rarity(Rarity.EPIC)
    );

    public static final Item KIWI = register("kiwi", Item::new,
            new Item.Settings().food(KIWI_COMPONENT, KIWI_CONSUMABLE_COMPONENT)
                    .rarity(Rarity.EPIC)
    );

    public static final Item SLICED_BREAD = register("sliced_bread", Item::new,
            new Item.Settings().food(SLICED_BREAD_COMPONENT, SLICED_BREAD_CONSUMABLE_COMPONENT)
                    .rarity(Rarity.EPIC)
    );

    public static final Item SOFTSERVE_ICECREAM = register("softserve_icecream", Item::new,
            new Item.Settings().food(SOFTSERVE_ICECREAM_COMPONENT, SOFTSERVE_ICECREAM_CONSUMABLE_COMPONENT)
                    .rarity(Rarity.EPIC)
    );


//Items

    public static final Item BEDROCK_INGOT = register("bedrock_ingot", Item::new, new Item.Settings()
            .rarity(Rarity.EPIC)
    );

    public static final Item BEDROCK_UPGRADE_SMITHING_TEMPLATE = register("bedrock_upgrade_smithing_template", Item::new, new Item.Settings()
    );

    public static final Item BRUSH = register("brush", Brush::new, new Item.Settings()
            .useCooldown(600)
    );


//Tools

    public static final Item BEDROCK_AXE = register("bedrock_axe", Item::new,
            new Item.Settings().axe(PvpModToolMaterial.BEDROCK, 16, -3.4f)
                    .rarity(Rarity.EPIC)
    );

    public static final Item BEDROCK_BATTLEAXE = register("bedrock_battleaxe", Bedrock_Battleaxe::new,
            new Item.Settings().axe(PvpModToolMaterial.BEDROCK, 18, -3.4f)
                    .useCooldown(12).rarity(Rarity.EPIC)
    );

    public static final Item BEDROCK_HOE = register("bedrock_hoe", Item::new,
            new Item.Settings().hoe(PvpModToolMaterial.BEDROCK, 8, -2.4f)
                    .rarity(Rarity.EPIC)
    );

    public static final Item BEDROCK_PICKAXE = register("bedrock_pickaxe", Item::new,
            new Item.Settings().pickaxe(PvpModToolMaterial.BEDROCK, 10, -2.4f)
                    .rarity(Rarity.EPIC)
    );

    public static final Item BEDROCK_SCYTHE = register("bedrock_scythe", Bedrock_Scythe::new,
            new Item.Settings().sword(PvpModToolMaterial.BEDROCK, 14, -2.4f)
                    .useCooldown(14).rarity(Rarity.EPIC)
    );

    public static final Item BEDROCK_SHOVEL = register("bedrock_shovel", Item::new,
            new Item.Settings().shovel(PvpModToolMaterial.BEDROCK, 9, -2.4f)
                    .rarity(Rarity.EPIC)
    );

    public static final Item BEDROCK_SWORD = register("bedrock_sword", Item::new,
            new Item.Settings().sword(PvpModToolMaterial.BEDROCK, 17, -2.4f)
                    .rarity(Rarity.EPIC)
    );

    public static final Item ZAZAZAZAL_SWORD = register("zazazazal_sword", Zazazazal_Sword::new,
            new Item.Settings().sword(PvpModToolMaterial.BEDROCK, 7, -2.4f)
                    .maxDamage(1111).rarity(Rarity.EPIC)
    );

//Paxels

    public static final Item WOODEN_PAXEL = register("wooden_paxel", Item::new,
            new Item.Settings().tool(ToolMaterial.WOOD, com.pvp_mod.tag.BlockTags.PAXEL_MINEABLE, 5, -2.4f, 2)
                    .maxDamage(118).rarity(Rarity.COMMON)
    );

    public static final Item STONE_PAXEL = register("stone_paxel", Item::new,
            new Item.Settings().tool(ToolMaterial.STONE, com.pvp_mod.tag.BlockTags.PAXEL_MINEABLE, 5, -2.4f, 4)
                    .maxDamage(262).rarity(Rarity.COMMON)
    );

    public static final Item GOLDEN_PAXEL = register("golden_paxel", Item::new,
            new Item.Settings().tool(ToolMaterial.GOLD, com.pvp_mod.tag.BlockTags.PAXEL_MINEABLE, 5, -2.4f, 14)
                    .maxDamage(64).rarity(Rarity.COMMON)
    );

    public static final Item IRON_PAXEL = register("iron_paxel", Item::new,
            new Item.Settings().tool(ToolMaterial.IRON, com.pvp_mod.tag.BlockTags.PAXEL_MINEABLE, 7, -2.4f, 6)
                    .maxDamage(500).rarity(Rarity.COMMON)
    );

    public static final Item DIAMOND_PAXEL = register("diamond_paxel", Item::new,
            new Item.Settings().tool(ToolMaterial.DIAMOND, com.pvp_mod.tag.BlockTags.PAXEL_MINEABLE, 8, -2.4f, 12)
                    .maxDamage(3122).rarity(Rarity.COMMON)
    );

    public static final Item NETHERITE_PAXEL = register("netherite_paxel", Item::new,
            new Item.Settings().tool(ToolMaterial.NETHERITE, com.pvp_mod.tag.BlockTags.PAXEL_MINEABLE, 9, -2.4f, 13)
                    .maxDamage(4062).rarity(Rarity.COMMON)
    );

    public static final Item BEDROCK_PAXEL = register("bedrock_paxel", Item::new,
            new Item.Settings().tool(PvpModToolMaterial.BEDROCK, com.pvp_mod.tag.BlockTags.PAXEL_MINEABLE, 17, -2.4f, 30)
                    .rarity(Rarity.EPIC)
    );


//Armors

    public static final Item BEDROCK_HELMET = register("bedrock_helmet", Item::new,
            new Item.Settings().armor(PvpModArmorMaterial.BEDROCK, EquipmentType.HELMET)
                    .rarity(Rarity.EPIC)
    );

    public static final Item BEDROCK_CHESTPLATE = register("bedrock_chestplate", Item::new,
            new Item.Settings().armor(PvpModArmorMaterial.BEDROCK, EquipmentType.CHESTPLATE)
                    .rarity(Rarity.EPIC).equippable(EquipmentSlot.CHEST).maxDamage(2100000000)
    );

    public static final Item BEDROCK_LEGGINGS = register("bedrock_leggings", Item::new,
            new Item.Settings().armor(PvpModArmorMaterial.BEDROCK, EquipmentType.LEGGINGS)
                    .rarity(Rarity.EPIC)
    );

    public static final Item BEDROCK_BOOTS = register("bedrock_boots", Item::new,
            new Item.Settings().armor(PvpModArmorMaterial.BEDROCK, EquipmentType.BOOTS)
                    .rarity(Rarity.EPIC)
    );

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PvpMod.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static void initialize() {
    }

}