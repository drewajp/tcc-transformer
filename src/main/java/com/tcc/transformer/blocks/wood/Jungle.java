package com.tcc.transformer.blocks.wood;

import com.tcc.transformer.base.Transformer;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Jungle extends Block 
{

        public Jungle (Material wood) 
        {
                super(wood);
                
                setCreativeTab(Transformer.transformerBlock);
                setBlockName("jungleBlock");
                setBlockTextureName("tcc:jungleblock");
                
        }
}