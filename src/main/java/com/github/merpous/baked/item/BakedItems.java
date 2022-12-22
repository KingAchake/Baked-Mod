package com.github.merpous.baked.item;


import com.github.merpous.baked.BakedFoodComponents;
import com.github.merpous.baked.BakedMod;
import com.github.merpous.baked.block.BakedBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import com.github.merpous.baked.block.custom.PieBlock;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class BakedItems {
    public static final Item HONEY_CANDY = registerItem("honey_candy",
            new Item(new FabricItemSettings().food(BakedFoodComponents.HONEY_CANDY).group(ItemGroup.FOOD)));

    //Apples
    public static final Item BAKED_APPLE = registerItem("baked_apple",
        new Item(new FabricItemSettings().food(BakedFoodComponents.BAKED_APPLE).group(ItemGroup.FOOD)));

    public static final Item APPLE_PIE = registerItem("apple_pie",
            new AliasedBlockItem(BakedBlocks.APPLE_PIE, new FabricItemSettings().group(ItemGroup.FOOD)));



//Berries
    public static final Item BLUEBERRY_PIE = registerItem("blueberry_pie",
            new AliasedBlockItem(BakedBlocks.BLUEBERRY_PIE, new FabricItemSettings().group(ItemGroup.FOOD)));


            public static final Item SWEET_BERRY_PIE = registerItem("sweet_berry_pie",
            new AliasedBlockItem(BakedBlocks.SWEET_BERRY_PIE, new FabricItemSettings().group(ItemGroup.FOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BakedMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + BakedMod.MOD_ID);
    }
    }

