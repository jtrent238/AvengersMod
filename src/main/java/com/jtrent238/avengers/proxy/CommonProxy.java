package com.jtrent238.avengers.proxy;

import java.io.File;

import com.jtrent238.avengers.Config;
import com.jtrent238.avengers.Main;
import com.jtrent238.avengers.ModItems;
import com.jtrent238.avengers.items.ItemStormBreaker;
import com.jtrent238.avengers.network.PacketHandler;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod.EventBusSubscriber
public class CommonProxy {
	
	// Config instance
    public static Configuration config;
    
    public void preInit(FMLPreInitializationEvent e) {
    	File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), Main.MODID + ".cfg"));
        Config.readConfig();
        
     // Initialize our packet handler. Make sure the name is
        // 20 characters or less!
        PacketHandler.registerMessages(Main.MODID);
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    	if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	Item ItemStormBreaker = new ItemStormBreaker();
		//event.getRegistry().register(new ItemStormBreaker());
    	event.getRegistry().register(ItemStormBreaker);
    }
}
