package com.jtrent238.avengers.util;

import com.jtrent238.avengers.items.ItemCaptainAmericaShield;
import com.jtrent238.avengers.items.ItemGamoraSword;
import com.jtrent238.avengers.items.ItemStormBreaker;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
 
    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new ItemStormBreaker(),
                new ItemCaptainAmericaShield(),
                new ItemGamoraSword()
        };
 
        event.getRegistry().registerAll(items);
    }
}