package com.jtrent238.avengers.util;

import com.jtrent238.avengers.Config;
import com.jtrent238.avengers.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {
 
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.ItemStormBreaker);
        registerModel(ModItems.ItemCaptainAmericaShield);
        registerModel(ModItems.ItemGamoraSword);
        registerModel(ModItems.ItemDraxKnive);
    }
 
    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        
	    if(Config.debugMode == true) {
        	System.out.println("Registered Model for: " + item.getRegistryName());
    	}
    }
 
}