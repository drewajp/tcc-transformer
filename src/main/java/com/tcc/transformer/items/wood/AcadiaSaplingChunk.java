package com.tcc.transformer.items.wood;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.tcc.transformer.base.Transformer;;

public class AcadiaSaplingChunk extends Item {

        public AcadiaSaplingChunk() {
                maxStackSize = 16;
                setCreativeTab(Transformer.transformerItem);
                setUnlocalizedName("acadiaSaplingChunk");
                setTextureName("tcc:acadiasaplingchunk");
   
        }
}
     