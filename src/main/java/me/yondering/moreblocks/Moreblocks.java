package me.yondering.moreblocks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Moreblocks implements ModInitializer {
    public static final Block URANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("moreblocks", "uranium_block"), URANIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("moreblockks", "uranium_block"), new BlockItem(URANIUM_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
    }
}
