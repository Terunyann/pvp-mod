package com.pvp_mod.registry.specialitem;

import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
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
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

public class Bedrock_Scythe extends Item {
    public Bedrock_Scythe(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) return ActionResult.PASS;
        ServerWorld serverWorld = (ServerWorld) world;

        Vec3d look = user.getRotationVec(1.0F).normalize();
        Vec3d center = user.getPos().add(look.x, 5.3, look.z);

        List<LivingEntity> targets = serverWorld.getEntitiesByClass(
                LivingEntity.class,
                new Box(center.add(-5, -5, -5), center.add(5, 5, 5)),
                e -> e != user
        );

        for (LivingEntity living : targets) {
            living.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 5));
            living.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100, 3));
            living.addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 100, 0));
            living.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 1));

            living.damage(serverWorld, serverWorld.getDamageSources().playerAttack(user), 25.0f);

            serverWorld.spawnParticles(
                    ParticleTypes.CRIT,
                    living.getX(), living.getY() + 1, living.getZ(),
                    10, 0.3, 0.3, 0.3, 0.1
            );

            serverWorld.spawnParticles(ParticleTypes.RAID_OMEN, living.getX(), living.getY(), living.getZ(), 5, 0.2, 0.2, 0.2, 0);
            serverWorld.spawnParticles(ParticleTypes.TRIAL_OMEN, living.getX(), living.getY(), living.getZ(), 5, 0.2, 0.2, 0.2, 0);
        }

        serverWorld.playSound(null, user.getBlockPos(),
                SoundEvents.ITEM_TRIDENT_THROW.value(), SoundCategory.PLAYERS, 1.0f, 0.2f);

        if (!targets.isEmpty()) {
            serverWorld.playSound(null, user.getBlockPos(),
                    SoundEvents.BLOCK_ANVIL_LAND, SoundCategory.PLAYERS, 1.0f, 0.4f);
        }

        serverWorld.spawnParticles(ParticleTypes.EXPLOSION, center.x + 1, center.y + 1, center.z + 3, 1, 0, 0, 0, 0);
        serverWorld.spawnParticles(ParticleTypes.EXPLOSION, center.x - 1, center.y + 1, center.z + 3, 1, 0, 0, 0, 0);
        serverWorld.spawnParticles(ParticleTypes.EXPLOSION, center.x + 2, center.y + 2, center.z + 4, 1, 0, 0, 0, 0);
        serverWorld.spawnParticles(ParticleTypes.EXPLOSION, center.x - 2, center.y + 2, center.z + 4, 1, 0, 0, 0, 0);
        serverWorld.spawnParticles(ParticleTypes.EXPLOSION, center.x, center.y + 3, center.z + 5, 1, 0, 0, 0, 0);


        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20, 4));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20, 255));

        return ActionResult.SUCCESS;
    }

}
