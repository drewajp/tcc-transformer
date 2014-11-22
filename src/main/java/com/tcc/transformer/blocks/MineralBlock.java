package com.tcc.transformer.blocks;

import com.tcc.transformer.base.Transformer;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MineralBlock extends Block 
{

        public MineralBlock (Material rock) 
        {
                super(rock);
                
                setCreativeTab(Transformer.transformerBlock);
                setBlockName("mineralBlock");
                setBlockTextureName("tcc:mineralblock");
                
        }
}