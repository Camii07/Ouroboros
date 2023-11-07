package me.camii.uroboros.client.item;

import net.minecraft.entity.MovementType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Vanishable;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class GrapplingHookItem extends Item implements Vanishable {

    public GrapplingHookItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        var cooldownManager = user.getItemCooldownManager();
        var itemStack = user.getStackInHand(hand);
        var vec = user.getRotationVector().add(user.getVelocity());

        if (user.isOnGround()) user.move(MovementType.SELF, new Vec3d(0.0, 2.5D, 0.0));

        user.setVelocity(vec.getX() * 1.75f, vec.getY() * 1.25f, vec.getZ() * 1.75f);
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_FISHING_BOBBER_RETRIEVE, SoundCategory.NEUTRAL, 1.0F, 0.05f);
        itemStack.damage(1, user, (p) -> p.sendToolBreakStatus(hand));
        cooldownManager.set(this, 40);

        return TypedActionResult.success(itemStack, world.isClient());
    }



}
