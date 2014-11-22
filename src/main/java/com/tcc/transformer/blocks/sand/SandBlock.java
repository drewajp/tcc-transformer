package com.tcc.transformer.blocks.sand;

import com.tcc.transformer.base.Transformer;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SandBlock extends Block 
{

        public SandBlock (Material sand) 
        {
                super(sand);
                
                setCreativeTab(Transformer.transformerBlock);
                setBlockName("sandBlock");
                setBlockTextureName("tcc:sandblock");
                
        }
}