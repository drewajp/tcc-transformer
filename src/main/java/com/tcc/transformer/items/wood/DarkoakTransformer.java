package com.tcc.transformer.items.wood;

import com.tcc.transformer.base.Transformer;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DarkoakTransformer extends Item {

    public DarkoakTransformer() {
        maxStackSize = 1;
        setCreativeTab(Transformer.transformerItem);
        setUnlocalizedName("darkoakItem");
        setTextureName("tcc:darkoak");
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