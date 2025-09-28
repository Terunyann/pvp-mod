package com.pvp_mod.datagenerator.provider;

import com.pvp_mod.registry.Enchantment;
import com.pvp_mod.registry.Items;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class PvpModLanguageJapaneseProvider extends FabricLanguageProvider {
    public PvpModLanguageJapaneseProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "ja_jp", registryLookup);
    }


    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(Items.AMETHYST_APPLE, "アメジストのリンゴ");
        translationBuilder.add(Items.DIAMOND_APPLE, "ダイヤモンドのリンゴ");
        translationBuilder.add(Items.EMERALD_APPLE, "エメラルドのリンゴ");
        translationBuilder.add(Items.ENCHANTED_DIAMOND_APPLE, "エンチャントされたダイヤモンドのリンゴ");
        translationBuilder.add(Items.ENCHANTED_NETHERITE_APPLE, "エンチャントされたネザライトのリンゴ");
        translationBuilder.add(Items.HAMBURGER, "ハンバーガー");
        translationBuilder.add(Items.KIWI, "キウイ");
        translationBuilder.add(Items.NETHERITE_APPLE, "ネザライトのリンゴ");
        translationBuilder.add(Items.SLICED_BREAD, "食パン");
        translationBuilder.add(Items.SOFTSERVE_ICECREAM, "ソフトクリーム(バニラ味)");
        translationBuilder.add(Items.BEDROCK_UPGRADE_SMITHING_TEMPLATE, "岩盤の強化鍛冶型");
        translationBuilder.add(Items.BEDROCK_INGOT, "岩盤のインゴット");
        translationBuilder.add(Items.BRUSH, "トイレブラシ");

        translationBuilder.add(Items.BEDROCK_AXE, "岩盤の斧");
        translationBuilder.add(Items.BEDROCK_BATTLEAXE, "岩盤のバトルアックス");
        translationBuilder.add(Items.BEDROCK_HOE, "岩盤のクワ");
        translationBuilder.add(Items.BEDROCK_PICKAXE, "岩盤のツルハシ");
        translationBuilder.add(Items.BEDROCK_SCYTHE, "岩盤の大鎌");
        translationBuilder.add(Items.BEDROCK_SHOVEL, "岩盤のシャベル");
        translationBuilder.add(Items.BEDROCK_SWORD, "岩盤の剣");
        translationBuilder.add(Items.ZAZAZAZAL_SWORD, "レッドソード");

        translationBuilder.add(Items.WOODEN_PAXEL, "木のパクセル");
        translationBuilder.add(Items.STONE_PAXEL, "石のパクセル");
        translationBuilder.add(Items.GOLDEN_PAXEL, "金のパクセル");
        translationBuilder.add(Items.IRON_PAXEL, "鉄のパクセル");
        translationBuilder.add(Items.DIAMOND_PAXEL, "ダイヤモンドのパクセル");
        translationBuilder.add(Items.NETHERITE_PAXEL, "ネザライトのパクセル");
        translationBuilder.add(Items.BEDROCK_PAXEL, "岩盤のパクセル");

        translationBuilder.add(Items.BEDROCK_HELMET, "岩盤のヘルメット");
        translationBuilder.add(Items.BEDROCK_CHESTPLATE, "岩盤のチェストプレート");
        translationBuilder.add(Items.BEDROCK_LEGGINGS, "岩盤のレギンス");
        translationBuilder.add(Items.BEDROCK_BOOTS, "岩盤のブーツ");

        translationBuilder.addEnchantment(Enchantment.INDESTRUCTIBLE, "不可壊");
        translationBuilder.addEnchantment(Enchantment.ASSASSINATION, "暗殺剣");
    }
}
