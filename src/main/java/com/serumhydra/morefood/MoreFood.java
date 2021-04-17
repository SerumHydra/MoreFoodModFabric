package com.serumhydra.morefood;

import com.serumhydra.morefood.registery.ModBlocks;
import com.serumhydra.morefood.registery.Moditems;
import net.fabricmc.api.ModInitializer;

public class MoreFood implements ModInitializer {

    public static final String MOD_ID="morefood";

    @Override
    public void onInitialize() {
        Moditems.registerItems();
        ModBlocks.registerBlocks();


    }
}
