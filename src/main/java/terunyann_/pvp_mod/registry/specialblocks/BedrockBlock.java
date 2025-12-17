package terunyann_.pvp_mod.registry.specialblocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import terunyann_.pvp_mod.tag.ItemTags;

public class BedrockBlock extends Block {
    public BedrockBlock(Settings settings) {
        super(settings);
    }

    @Override
    public float calcBlockBreakingDelta(BlockState state, PlayerEntity player, BlockView world, BlockPos pos) {
        if (player.getMainHandStack().isIn(ItemTags.BEDROCK_TOOL)) {
            return 1.0F;
        }
        return -1.0F;
    }
}