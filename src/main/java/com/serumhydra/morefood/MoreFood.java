package com.serumhydra.morefood;

import com.serumhydra.morefood.registery.Moditems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MoreFood implements ModInitializer {

    public static final String MOD_ID="morefood";

    public static final ItemGroup FOOD_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "food"), () -> new ItemStack(Moditems.COOKED_BACON));

    @Override
    public void onInitialize() {
        Moditems.registerItems();



    }
}
