package terunyann_.pvp_mod.registry.specialitem;


import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class New_Beach_Sports extends Item {
    public New_Beach_Sports(Settings settings) {
        super(settings);
    }

    public void inventoryTick(ItemStack stack, World world, PlayerEntity user) {
        if (world.isClient()) return;

        if (user.getEquippedStack(EquipmentSlot.FEET) == stack) {
            user.addStatusEffect(
                    new StatusEffectInstance(
                            StatusEffects.SPEED,
                            10 * 20,
                            254,
                            false,
                            false,
                            true
                    )
            );
        }
    }
}