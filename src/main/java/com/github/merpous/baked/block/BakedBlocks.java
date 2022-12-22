package com.github.merpous.baked.block;


import com.github.merpous.baked.BakedMod;
import net.minecraft.block.*;
import com.github.merpous.baked.block.custom.PieBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.BlockItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;

public class BakedBlocks {


    public static final Block APPLE_PIE = registerBlockWithoutBlockItem("apple_pie",
            new PieBlock(FabricBlockSettings.copy(Blocks.CAKE)));

    public static final Block BLUEBERRY_PIE = registerBlockWithoutBlockItem("blueberry_pie",
            new PieBlock(FabricBlockSettings.copy(Blocks.CAKE)));

    public static final Block SWEET_BERRY_PIE = registerBlockWithoutBlockItem("sweet_berry_pie",
    new PieBlock(FabricBlockSettings.copy(Blocks.CAKE)));

            
    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(BakedMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
            return Registry.register(Registry.BLOCK, new Identifier(BakedMod.MOD_ID, name), block);
        }

        private static Item registerBlockItem(String name, Block block) {
            return Registry.register(Registry.ITEM, new Identifier(BakedMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.MISC)));
        }
    

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + BakedMod.MOD_ID);
    }
    
}
