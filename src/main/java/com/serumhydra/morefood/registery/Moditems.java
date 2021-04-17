package com.serumhydra.morefood.registery;

import com.serumhydra.morefood.MoreFood;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Moditems {
    //items
    public static final Item BACON = new Item(new Item.Settings().group(ItemGroup.FOOD));
    //Block Items
    public static final BlockItem BACON_BLOCK = new BlockItem(ModBlocks.BACON_BLOCK, new Item.Settings().group(ItemGroup.FOOD));
    //registry
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "bacon"), BACON);
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "bacon_block"), BACON_BLOCK);
    }
}
