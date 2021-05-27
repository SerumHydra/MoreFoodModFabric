package com.serumhydra.morefood.registery;

import com.serumhydra.morefood.MoreFood;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block BACON_BLOCK = new Block(FabricBlockSettings.of(Material.PLANT).breakByTool(FabricToolTags.HOES).strength(5f, 15f).sounds(BlockSoundGroup.CROP));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MoreFood.MOD_ID, "bacon_block"), BACON_BLOCK);
    }
}