package com.tcc.transformer.items.sand;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.tcc.transformer.base.Transformer;;

public class SandChunk extends Item {

        public SandChunk() {
                maxStackSize = 16;
                setCreativeTab(Transformer.transformerItem);
                setUnlocalizedName("sandChunk");
                setTextureName("tcc:sandchunk");
   
        }
}
     