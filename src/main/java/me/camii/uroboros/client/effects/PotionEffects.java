package me.camii.uroboros.client.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PotionEffects {

    public static StatusEffect EXPERIENCE = register("experience", new PotionEffect(StatusEffectCategory.BENEFICIAL, 2445943));

    public static StatusEffect register(String key, StatusEffect effect) {
       return Registry.register(Registries.STATUS_EFFECT, new Identifier("minecraft", key), effect);

    }

    public static void register(){}

}

