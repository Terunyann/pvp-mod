package com.pvp_mod.registry.specialitem;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

public class Bedrock_Battleaxe extends Item {
    public Bedrock_Battleaxe(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) return ActionResult.PASS;
        ServerWorld serverWorld = (ServerWorld) world;

        // 1. 発動位置（プレイヤーの視線方向 前方1, 上3）
        Vec3d look = user.getRotationVec(1.0F).normalize();
        Vec3d pos = user.getPos().add(look.x * 1, 3, look.z * 1);

        // 2. 半径2.9の範囲にいるエンティティ取得
        List<Entity> targets = serverWorld.getEntitiesByClass(
                Entity.class,
                new Box(pos.add(-2.9, -2.9, -2.9), pos.add(2.9, 2.9, 2.9)),
                e -> e != user
        );

        for (Entity target : targets) {
            if (target instanceof LivingEntity living) {
                // 鈍足付与
                living.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 60, 5, true, true));
                // 20ダメージ（攻撃扱い）
                living.damage(serverWorld, serverWorld.getDamageSources().playerAttack(user), 20f);

                // クリティカルパーティクル
                serverWorld.spawnParticles(
                        ParticleTypes.CRIT,
                        living.getX(), living.getY() + 2, living.getZ(),
                        10, 0.2, 0.2, 0.2, 0.1
                );
            }
        }

        // 3. サウンド（全員に聞こえる）
        serverWorld.playSound(null, user.getBlockPos(),
                SoundEvents.ITEM_TRIDENT_THROW.value(), SoundCategory.PLAYERS, 1.0f, 0.5f);

        if (!targets.isEmpty()) {
            serverWorld.playSound(null, user.getBlockPos(),
                    SoundEvents.BLOCK_ANVIL_LAND, SoundCategory.PLAYERS, 1.0f, 0.6f);
        }

        // 4. 爆発パーティクル 3か所
        serverWorld.spawnParticles(ParticleTypes.EXPLOSION, pos.x, pos.y + 2, pos.z, 1, 0, 0, 0, 0);
        serverWorld.spawnParticles(ParticleTypes.EXPLOSION, pos.x + 1, pos.y + 1, pos.z + 2, 1, 0, 0, 0, 0);
        serverWorld.spawnParticles(ParticleTypes.EXPLOSION, pos.x - 1, pos.y + 1, pos.z + 2, 1, 0, 0, 0, 0);

        // 5. 発動者にデバフ
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20, 4, true, true));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20, 255, true, true));

        return ActionResult.SUCCESS;
    }



    public static void load () {}
}
