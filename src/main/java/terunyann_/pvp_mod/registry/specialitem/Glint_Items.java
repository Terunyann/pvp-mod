package terunyann_.pvp_mod.registry.specialitem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Glint_Items extends Item {
    public Glint_Items(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}