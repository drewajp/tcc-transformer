package com.tcc.transformer.blocks.wood;

import com.tcc.transformer.base.Transformer;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Birch extends Block 
{

        public Birch (Material wood) 
        {
                super(wood);
                
                setCreativeTab(Transformer.transformerBlock);
                setBlockName("birchBlock");
                setBlockTextureName("tcc:birchblock");
                
        }
}