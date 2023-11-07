package me.camii.uroboros.client.item;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Blocks {

    public static Block VOID_ORE = register("void_ore", new Block(FabricBlockSettings.create().strength(6.0F, 5.0F)));

    public static Block register(String key, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier("minecraft", key), block);
    }

    public static void register(){}
}
