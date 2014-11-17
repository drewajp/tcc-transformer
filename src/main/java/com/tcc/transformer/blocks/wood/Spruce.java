package com.tcc.transformer.blocks.wood;

import com.tcc.transformer.base.Transformer;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Spruce extends Block 
{

        public Spruce (Material wood) 
        {
                super(wood);
                
                setCreativeTab(Transformer.transformerBlock);
                setBlockName("spruceBlock");
                setBlockTextureName("tcc:spruceblock");
                
        }
}