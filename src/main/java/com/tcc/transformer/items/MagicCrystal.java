package com.tcc.transformer.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.tcc.transformer.base.Transformer;;

	public class MagicCrystal extends Item {

	        public MagicCrystal() {
	                maxStackSize = 1;
	                setCreativeTab(Transformer.transformerItem);
	                setUnlocalizedName("magicCrystal");
	                setTextureName("tcc:crystal");
	   
	        }
	                
	                
	                @Override
	                public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack)
	                {
	                        return itemstack.getItemDamage()<127;
	                }
	               
	                @Override
	                public ItemStack getContainerItem(ItemStack itemStack)
	                {
	                   ItemStack cStack = itemStack.copy();
	                   cStack.setItemDamage(cStack.getItemDamage());
	                   cStack.stackSize = 1;
	                   return cStack;
	                }
	        
	   
	}

