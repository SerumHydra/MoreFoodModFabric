package com.serumhydra.morefood.registery;

import com.serumhydra.morefood.MoreFood;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class Moditems {
    //items
    public static final Item COOKED_BACON = new Item(new Item.Settings().group(MoreFood.FOOD_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(6f).meat().build()));
    public static final Item ICE_CREAM = new Item(new Item.Settings().group(MoreFood.FOOD_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(4f).build()));
    public static final Item NOODLES = new Item(new Item.Settings().group(MoreFood.FOOD_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(6f).build()));
    public static final Item RAW_BACON = new Item(new Item.Settings().group(MoreFood.FOOD_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(2f).build()));
    public static final Item MEATBALLS = new Item(new Item.Settings().group(MoreFood.FOOD_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(2f).build()));
    public static final Item MEATBALL_SANDWHICH = new Item(new Item.Settings().group(MoreFood.FOOD_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(8f).build()));
    public static final Item COFFEE = new Item(new Item.Settings().group(MoreFood.FOOD_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,20*5),1f).build()));
    public static final Item MONSTER_ORIGINAL = new Item(new Item.Settings().group(MoreFood.FOOD_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,20*10),1f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,20*12),1f).build()));
    public static final Item DINO_NUGGIES = new Item(new Item.Settings().group(MoreFood.FOOD_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(6f).build()));
    //Block Items
    public static final BlockItem MINCER = new BlockItem(ModBlocks.MINCER, new Item.Settings().group(MoreFood.FOOD_GROUP));
    //registry
    public static void registerItems() {
        //register items
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "cooked_bacon"), COOKED_BACON);
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "ice_cream"), ICE_CREAM);
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "noodles"), NOODLES);
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "raw_bacon"), RAW_BACON);
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "meatballs"), MEATBALLS);
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "meatball_sandwhich"), MEATBALL_SANDWHICH);
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "coffee"), COFFEE);
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "monster_energy_original"), MONSTER_ORIGINAL);
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "dino_nuggies"), DINO_NUGGIES);
        //register Block Items
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "mincer"), MINCER);
    }
}