package com.jtrent238.avengers.input;

import org.lwjgl.input.Keyboard;

import com.jtrent238.avengers.Main;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class KeyBindings {

    public static KeyBinding testKey;

    public static void init() {
    	testKey = new KeyBinding("key.test", Keyboard.KEY_T, "key.categories." + Main.MODID);
        ClientRegistry.registerKeyBinding(testKey);
    }
}