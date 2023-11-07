package me.camii.uroboros;

import me.camii.uroboros.client.effects.PotionEffects;
import me.camii.uroboros.client.item.Blocks;
import me.camii.uroboros.client.item.Items;
import net.fabricmc.api.ModInitializer;

public class Uroboros implements ModInitializer {

    @Override
    public void onInitialize() {
        Blocks.register();
        Items.register();
        PotionEffects.register();

    }
}
