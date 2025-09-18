package com.pvp_mod.list.enums;

import com.pvp_mod.PvpMod;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

public class PvpModArmorMaterial {

    public static final int BASE_DURABILITY = 15;

    public static final RegistryKey<EquipmentAsset> BEDROCK_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(PvpMod.MOD_ID, "bedrock"));
    public static final TagKey<Item> BEDROCK_INGOT = TagKey.of(Registries.ITEM.getKey(), Identifier.of(PvpMod.MOD_ID, "bedrock_ingot"));

    public static final ArmorMaterial BEDROCK = new ArmorMaterial(
            2100000000,
            Map.of(
                    EquipmentType.HELMET, 6,
                    EquipmentType.CHESTPLATE, 10,
                    EquipmentType.LEGGINGS, 8,
                    EquipmentType.BOOTS, 6
            ),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            0.0F,
            0.0F,
            BEDROCK_INGOT,
            BEDROCK_ARMOR_MATERIAL_KEY
    );

    public static void load() {
    }
}
