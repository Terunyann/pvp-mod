package com.pvp_mod.registry.specialitem;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.Objects;

public class Brush extends Item {
    public Brush(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) {
            return ActionResult.PASS;
        }

        if (world instanceof ServerWorld serverWorld) {

            for (ServerPlayerEntity player : Objects.requireNonNull(world.getServer()).getPlayerManager().getPlayerList()) {

                world.getServer();
                player.addStatusEffect(new StatusEffectInstance(
                        StatusEffects.FIRE_RESISTANCE, -2100000000, 255
                ));

                serverWorld.spawnParticles(
                        ParticleTypes.RAID_OMEN,
                        player.getX(), player.getY() + 1, player.getZ(),
                        10,
                        0.5, 0.5, 0.5,
                        0.1
                );

                serverWorld.playSound(
                        null,
                        player.getX(), player.getY(), player.getZ(),
                        SoundEvents.ENTITY_GHAST_SHOOT,
                        SoundCategory.PLAYERS,
                        1.0f,
                        1.0f
                );
            }
        }
        return ActionResult.SUCCESS;
    }
}