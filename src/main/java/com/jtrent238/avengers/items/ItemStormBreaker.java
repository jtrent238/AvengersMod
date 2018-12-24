package com.jtrent238.avengers.items;

import com.jtrent238.avengers.Config;
import com.jtrent238.avengers.Main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemStormBreaker extends ItemSword {

	String RegistryName = "ItemStormBreaker";
    
    private final float attackDamage;
    private final Item.ToolMaterial material;
    private final int mySpecialDamageModifier = 65535;
    
    public ItemStormBreaker(Item.ToolMaterial material)
    {
    	super(material);
        this.setRegistryName(RegistryName);
        this.setUnlocalizedName(RegistryName);
        this.setCreativeTab(Main.Tab_Avengers);
        this.maxStackSize = 1;
        this.material = material;
        this.setMaxDamage(material.getMaxUses());
        this.attackDamage = mySpecialDamageModifier;//3.0F + material.getAttackDamage();
    }

/*    @Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase hitEntity, EntityLivingBase attackingEntity)
	{
	hitEntity.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 100, 10));
	return true;
	}*/
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		
		if(!worldIn.isRemote){
			RayTraceResult pos = playerIn.rayTrace(100, 20);
			
			double x = pos.getBlockPos().getX();
			double y = pos.getBlockPos().getY();
			double z = pos.getBlockPos().getZ();

			worldIn.addWeatherEffect(new EntityLightningBolt(worldIn, x, y, z, true));
			
			return new ActionResult(EnumActionResult.SUCCESS, new ItemStack(this));
		}
		
		else{
		    return new ActionResult(EnumActionResult.FAIL, new ItemStack(this));
		}
	}
    
    
    /**
     * Returns the amount of damage this item will deal. One heart of damage is equal to 2 damage points.
     */
    public float getAttackDamage()
    {
        return this.material.getAttackDamage();
    }
    
    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    
    /**
     * Return the name for this tool's material.
     */
    public String getToolMaterialName()
    {
        return this.material.toString();
    }

}