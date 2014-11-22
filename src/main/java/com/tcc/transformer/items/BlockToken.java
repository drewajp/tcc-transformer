package com.tcc.transformer.items;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.tcc.transformer.base.Transformer;

	public class BlockToken extends Item {

	        public BlockToken() {
	                maxStackSize = 64;
	                setCreativeTab(Transformer.transformerItem);
	                setUnlocalizedName("blockToken");
	                setTextureName("tcc:token");
	   
	        }
	    	}
	

