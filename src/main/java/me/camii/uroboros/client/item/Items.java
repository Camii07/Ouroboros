package me.camii.uroboros.client.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class Items {

    public static Item GRAPPLING_HOOK =  registerItem("grappling_hook", new GrapplingHookItem(new FabricItemSettings().rarity(Rarity.EPIC).maxDamage(450)));
    public static Item VOID_STONE = registerBlock("void_ore", Blocks.VOID_ORE);


    private static Item registerBlock(String key, Block block) {
        return Registry.register(Registries.ITEM, new Identifier("minecraft", key), new BlockItem(block, new FabricItemSettings()));
    }

    private static Item registerItem(String key, Item item) {
        return Registry.register(Registries.ITEM, new Identifier("minecraft", key), item);
    }


    public static void register(){}

}
