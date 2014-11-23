package com.tcc.transformer.items.sand;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.tcc.transformer.base.Transformer;;

public class RedSandstonePiece extends Item {

        public RedSandstonePiece() {
                maxStackSize = 16;
                setCreativeTab(Transformer.transformerItem);
                setUnlocalizedName("redSandstonePiece");
                setTextureName("tcc:redsandstonePiece");
   
        }
}
     