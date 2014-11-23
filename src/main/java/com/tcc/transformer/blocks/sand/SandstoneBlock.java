package com.tcc.transformer.blocks.sand;

import com.tcc.transformer.base.Transformer;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SandstoneBlock extends Block 
{

        public SandstoneBlock (Material rock) 
        {
                super(rock);
                
                setCreativeTab(Transformer.transformerBlock);
                setBlockName("sandstoneBlock");
                setBlockTextureName("tcc:sandstoneblock");
                
        }
}