package terunyann_.pvp_mod.list.enums;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import terunyann_.pvp_mod.tag.ItemTags;

public class PvpModToolMaterial {

    public static final ToolMaterial BEDROCK = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2100000000,
            10.0F,
            5.0F,
            30,
            ItemTags.BEDROCK_TOOL_MATERIALS
    );

    public static void load() {
    }
}