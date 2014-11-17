package com.tcc.transformer.blocks.wood;

import com.tcc.transformer.base.Transformer;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Oak extends Block 
{

        public Oak (Material wood) 
        {
                super(wood);
                
                setCreativeTab(Transformer.transformerBlock);
                setBlockName("oakBlock");
                setBlockTextureName("tcc:oakblock");
                
        }
}