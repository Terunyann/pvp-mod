package com.pvp_mod.datagenerator;

import com.pvp_mod.datagenerator.provider.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PvpModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(PvpModBlockTagProvider::new);
        pack.addProvider(PvpModItemTagProvider::new);
        pack.addProvider(PvpModLanguageEnglishProvider::new);
        pack.addProvider(PvpModLanguageJapaneseProvider::new);
        pack.addProvider(PvpModModelProvider::new);
        pack.addProvider(PvpModRecipeProvider::new);
    }

}