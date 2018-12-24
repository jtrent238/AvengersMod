package com.jtrent238.avengers.util;

import com.jtrent238.avengers.blocks.BlockModWeb;
import com.jtrent238.avengers.items.ItemCaptainAmericaShield;
import com.jtrent238.avengers.items.ItemDraxKnive;
import com.jtrent238.avengers.items.ItemGamoraSword;
import com.jtrent238.avengers.items.ItemStormBreaker;
import com.jtrent238.avengers.items.ItemWebShooter;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
 
    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new ItemStormBreaker(ToolMaterial.DIAMOND),
                new ItemCaptainAmericaShield(),
                new ItemGamoraSword(),
                new ItemDraxKnive(),
                new ItemWebShooter()
        };
 
        event.getRegistry().registerAll(items);
    }
    
    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                new BlockModWeb()
        };
 
        event.getRegistry().registerAll(blocks);
    }
}