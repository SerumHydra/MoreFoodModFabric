package com.serumhydra.morefood.registery;

import com.serumhydra.morefood.MoreFood;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Moditems {
    //items
    public static final Item BACON = new Item(new Item.Settings().group(MoreFood.FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(6f).meat().build()));
    public static final Item ICE_CREAM = new Item(new Item.Settings().group(MoreFood.FOOD_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(4f).build()));
    public static final Item NOODLES = new Item(new Item.Settings().group(MoreFood.FOOD_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(6f).build()));
    //Block Items
    public static final BlockItem BACON_BLOCK = new BlockItem(ModBlocks.BACON_BLOCK, new Item.Settings().group(MoreFood.FOOD_GROUP));
    //registry
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "bacon"), BACON);
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "bacon_block"), BACON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "ice_cream"), ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "noodles"), NOODLES);
    }
}