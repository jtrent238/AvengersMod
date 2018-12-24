package com.jtrent238.avengers.items;

import com.jtrent238.avengers.Main;
import com.jtrent238.avengers.entity.EntityWeb;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWeb extends Item
{
    public ItemWeb()
    {
        this.setCreativeTab(Main.Tab_Avengers);
    }

    public EntityWeb createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter)
    {
        EntityWeb EntityWeb = new EntityWeb(worldIn, shooter);
        return EntityWeb;
    }

    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.EntityPlayer player)
    {
        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.INFINITY, bow);
        return enchant <= 0 ? false : this.getClass() == ItemWeb.class;
    }
}