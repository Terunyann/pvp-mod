package terunyann_.pvp_mod.datagenerator.provider;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import terunyann_.pvp_mod.registry.Blocks;

import java.util.concurrent.CompletableFuture;

public class PvpModBlockLootTableProvider extends FabricBlockLootTableProvider {

    public PvpModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(Blocks.NAZO_BLOCK, Blocks.NAZO_BLOCK);
    }

}