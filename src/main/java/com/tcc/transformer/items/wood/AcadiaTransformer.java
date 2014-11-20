package com.tcc.transformer.items.wood;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.tcc.transformer.base.Transformer;;

public class AcadiaTransformer extends Item {

        public AcadiaTransformer() {
                maxStackSize = 1;
                setCreativeTab(Transformer.transformerItem);
                setUnlocalizedName("acadiaItem");
                setTextureName("tcc:acadiaitem");
                setMaxDamage(128);
   
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
                   cStack.setItemDamage(cStack.getItemDamage() + 1);
                   cStack.stackSize = 1;
                   return cStack;
                }
        
   
}