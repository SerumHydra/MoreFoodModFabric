package com.SerumHydra.morefood.registery;

import com.SerumHydra.morefood.MoreFood;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Moditems {
    //items
    public static final Item BACON = new Item(new Item.Settings().group(ItemGroup.FOOD));
    }

    //Block Items
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MoreFood.MOD_ID, "bacon"), BACON);
    }
}
