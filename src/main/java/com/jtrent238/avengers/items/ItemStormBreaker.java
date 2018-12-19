package com.jtrent238.avengers.items;

import com.jtrent238.avengers.Main;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemStormBreaker  extends Item {

	String RegistryName = "ItemStormBreaker";
	
	public ItemStormBreaker() {
        this.setRegistryName(RegistryName);
        this.setUnlocalizedName(RegistryName);
        this.setCreativeTab(Main.Tab_Avengers);
    }

}