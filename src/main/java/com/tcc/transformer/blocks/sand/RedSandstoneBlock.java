package com.tcc.transformer.blocks.sand;

import com.tcc.transformer.base.Transformer;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RedSandstoneBlock extends Block 
{

        public RedSandstoneBlock (Material rock) 
        {
                super(rock);
                
                setCreativeTab(Transformer.transformerBlock);
                setBlockName("redSandstoneBlock");
                setBlockTextureName("tcc:redsandstoneblock");
                
        }
}