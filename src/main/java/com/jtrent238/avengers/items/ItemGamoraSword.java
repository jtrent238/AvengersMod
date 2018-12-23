package com.jtrent238.avengers.items;

import com.jtrent238.avengers.Main;

import net.minecraft.item.Item;

public class ItemGamoraSword extends Item {

	String RegistryName = "ItemGamoraSword";
	
	public ItemGamoraSword() {
        this.setRegistryName(RegistryName);
        this.setUnlocalizedName(RegistryName);
        this.setCreativeTab(Main.Tab_Avengers);
        this.maxStackSize = 1;
    }

}