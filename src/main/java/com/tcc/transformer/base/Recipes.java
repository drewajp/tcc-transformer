package com.tcc.transformer.base;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

    public void load (FMLInitializationEvent event) {

    	
    	ItemStack acadiaBlock = new ItemStack(Transformer.acadiaBlock);
    	ItemStack oakBlock = new ItemStack(Transformer.oakBlock);
    	ItemStack birchBlock = new ItemStack(Transformer.birchBlock);
    	ItemStack darkoakBlock = new ItemStack(Transformer.darkoakBlock);
    	ItemStack spruceBlock = new ItemStack(Transformer.spruceBlock);
    	ItemStack jungleBlock = new ItemStack(Transformer.jungleBlock);
    	
    }
}
