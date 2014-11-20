package com.tcc.transformer.items;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.tcc.transformer.base.Transformer;

	public class MagicCrystal extends Item {

	        public MagicCrystal() {
	                maxStackSize = 1;
	                setCreativeTab(Transformer.transformerItem);
	                setUnlocalizedName("magicCrystal");
	                setTextureName("tcc:crystal");
	                setMaxDamage(1000);
	   
	        }
	    	}
	

