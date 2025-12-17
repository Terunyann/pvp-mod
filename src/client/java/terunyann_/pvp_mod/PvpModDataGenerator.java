package terunyann_.pvp_mod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import terunyann_.pvp_mod.datagenerator.provider.*;

public class PvpModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(PvpModBlockLootTableProvider::new);
        pack.addProvider(PvpModBlockTagProvider::new);
        pack.addProvider(PvpModItemTagProvider::new);
        pack.addProvider(PvpModLanguageEnglishProvider::new);
        pack.addProvider(PvpModLanguageJapaneseProvider::new);
        pack.addProvider(PvpModModelProvider::new);
        pack.addProvider(PvpModRecipeProvider::new);
    }
}
