package com.jtrent238.avengers.util;

import com.jtrent238.avengers.items.ItemCaptainAmericaShield;
import com.jtrent238.avengers.items.ItemDraxKnive;
import com.jtrent238.avengers.items.ItemGamoraSword;
import com.jtrent238.avengers.items.ItemStormBreaker;

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
                new ItemDraxKnive()
        };
 
        event.getRegistry().registerAll(items);
    }
}