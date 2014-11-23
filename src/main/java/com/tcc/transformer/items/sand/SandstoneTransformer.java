package com.tcc.transformer.items.sand;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.tcc.transformer.base.Transformer;;

public class SandstoneTransformer extends Item {

        public SandstoneTransformer() {
                maxStackSize = 1;
                setCreativeTab(Transformer.transformerItem);
                setUnlocalizedName("sandstoneItem");
                setTextureName("tcc:sandstoneitem");
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