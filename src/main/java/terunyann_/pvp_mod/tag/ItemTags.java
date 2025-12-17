package terunyann_.pvp_mod.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ItemTags {
    public static final TagKey<Item> BEDROCK_TOOL_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of("pvp_mod", "bedrock_tool_materials"));
    public static final TagKey<Item> BEDROCK_TOOL = TagKey.of(RegistryKeys.ITEM, Identifier.of("pvp_mod", "bedrock_tool"));
}
