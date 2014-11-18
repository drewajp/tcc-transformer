package com.tcc.transformer.blocks.wood;

import com.tcc.transformer.base.Transformer;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DarkoakBlock extends Block 
{

        public DarkoakBlock (Material wood) 
        {
                super(wood);
                
                setCreativeTab(Transformer.transformerBlock);
                setBlockName("darkoakBlock");
                setBlockTextureName("tcc:darkoakblock");
                
        }
}