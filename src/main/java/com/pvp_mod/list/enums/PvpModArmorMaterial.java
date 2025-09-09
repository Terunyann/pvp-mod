package com.pvp_mod.list.enums;

import com.pvp_mod.PvpMod;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

public class PvpModArmorMaterial {

    public static final int BASE_DURABILITY = 15;

    public static final RegistryKey<EquipmentAsset> BEDROCK_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(PvpMod.MOD_ID, "bedrock"));

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
            null,
            BEDROCK_ARMOR_MATERIAL_KEY
    );

public static void load() {}
}
