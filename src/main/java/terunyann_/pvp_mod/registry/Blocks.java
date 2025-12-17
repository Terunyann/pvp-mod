package terunyann_.pvp_mod.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import terunyann_.pvp_mod.PvpMod;
import terunyann_.pvp_mod.registry.specialblocks.BedrockBlock;

import java.util.function.Function;

import static net.minecraft.block.Blocks.BEDROCK;

public class Blocks {

    public static final Block NAZO_BLOCK = register("nazo_block", Block::new,
            AbstractBlock.Settings
                    .copy(net.minecraft.block.Blocks.SLIME_BLOCK)
                    .mapColor(MapColor.PURPLE)
                    .sounds(BlockSoundGroup.STONE)
    );

    public static final Block BEDROCK_BLOCK = register("bedrock_block", BedrockBlock::new,
            AbstractBlock.Settings
                    .copy(BEDROCK)
                    .requiresTool()
    );

    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings) {

        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(PvpMod.MOD_ID, name));

        Block block = blockFactory.apply(settings.registryKey(blockKey));

        Registry.register(Registries.BLOCK, blockKey, block);

        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PvpMod.MOD_ID, name));

        Registry.register(Registries.ITEM, itemKey, new BlockItem(block, new Item.Settings().registryKey(itemKey)));

        return block;
    }

    public static void load() {
    }
}
