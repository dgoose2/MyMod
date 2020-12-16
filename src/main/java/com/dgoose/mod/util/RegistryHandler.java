package com.dgoose.mod.util;

import com.dgoose.mod.Tutorial;
import com.dgoose.mod.blocks.BlockItemBase;
import com.dgoose.mod.blocks.RubyBlock;
import com.dgoose.mod.blocks.SmileBlock;
import com.dgoose.mod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Tutorial.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Tutorial.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS2 = new DeferredRegister<>(ForgeRegistries.BLOCKS, Tutorial.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS2.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items ONLY
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> SMILE_BLOCK = BLOCKS2.register("smile_block", SmileBlock::new);

    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> SMILE_BLOCK_ITEM = ITEMS.register("smile_block", () -> new BlockItemBase(SMILE_BLOCK.get()));

}
