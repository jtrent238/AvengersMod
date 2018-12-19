package com.jtrent238.avengers;

import com.jtrent238.avengers.items.ItemStormBreaker;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

	//@GameRegistry.ObjectHolder(Main.MODID + ":ItemStormBreaker")
    public static ItemStormBreaker ItemStormBreaker;
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
    }
    
    public static void registerRenders() {
    	registerRender(ItemStormBreaker);
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
