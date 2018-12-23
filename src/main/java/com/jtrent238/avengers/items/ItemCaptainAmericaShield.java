package com.jtrent238.avengers.items;

import com.jtrent238.avengers.Main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemShield;

public class ItemCaptainAmericaShield extends ItemShield {

	String RegistryName = "ItemCaptainAmericaShield";
	
	public ItemCaptainAmericaShield() {
        this.setRegistryName(RegistryName);
        this.setUnlocalizedName(RegistryName);
        this.setCreativeTab(Main.Tab_Avengers);
        this.maxStackSize = 1;
    }

}
