package com.jtrent238.avengers.input;

import com.jtrent238.avengers.network.PacketHandler;
import com.jtrent238.avengers.network.PacketSendKey;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class InputHandler {

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (KeyBindings.testKey.isPressed()) {
            // Someone pressed our testKey. We send a message
            PacketHandler.INSTANCE.sendToServer(new PacketSendKey());
        }
    }
}