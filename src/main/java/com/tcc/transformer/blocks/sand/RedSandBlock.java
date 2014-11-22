package com.tcc.transformer.blocks.sand;

import com.tcc.transformer.base.Transformer;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RedSandBlock extends Block 
{

        public RedSandBlock (Material sand) 
        {
                super(sand);
                
                setCreativeTab(Transformer.transformerBlock);
                setBlockName("redSandBlock");
                setBlockTextureName("tcc:redsandblock");
                
        }
}