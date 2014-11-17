package com.tcc.transformer.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.tcc.transformer.items.wood.*;


@Mod(modid="TCCTransformer", name="The TCC Transformer Mod", version="0.1")
public class Transformer {

	//@NetworkMod(clientSideRequired=true) // not used in 1.7

	
			public static Block oakBlock;
			public static Block birchBlock;
			public static Block jungleBlock;
			public static Block spruceBlock;
			public static Block acadiaBlock;
			public static Block darkoakBlock;
			
			public static Item oakTransformer;
			public static Item birchTransformer;
			public static Item jungleTransformer;
			public static Item spruceTransformer;
			public static Item acadiaTransformer;
			public static Item darkoakTransformer;
			
			public static Item oakSaplingChunk;
			public static Item spruceSaplingChunk;
			public static Item jungleSaplingChunk;
			public static Item acadiaSaplingChunk;
			public static Item darkoakSaplingChunk;
			public static Item birchSaplingChunk;
			
			
	        // The instance of your mod that Forge uses.
	        @Instance(value = "TCCTransformer")
	        public static Transformer instance;
	        
	        // Says where the client and server 'proxy' code is loaded.
	        @SidedProxy(clientSide="com.tcc.transformer.client.ClientProxy", serverSide="com.tcc.transformer.base.CommonProxy")
	        public static CommonProxy proxy;
	        
	        @EventHandler // used in 1.6.2
	        //@PreInit    // used in 1.5.2
	        public void preInit(FMLPreInitializationEvent event) {
	                // Stub Method
	        	
	        	oakBlock = new com.tcc.transformer.blocks.wood.Oak(Material.wood);
	        	birchBlock = new com.tcc.transformer.blocks.wood.Birch(Material.wood);
	        	jungleBlock = new com.tcc.transformer.blocks.wood.Jungle(Material.wood);
	        	spruceBlock = new com.tcc.transformer.blocks.wood.Spruce(Material.wood);
	        	acadiaBlock = new com.tcc.transformer.blocks.wood.Acadia(Material.wood);
	        	darkoakBlock = new com.tcc.transformer.blocks.wood.Darkoak(Material.wood);
	        	
	        	acadiaTransformer =  new com.tcc.transformer.items.wood.AcadiaTransformer();
	        	birchTransformer =  new com.tcc.transformer.items.wood.BirchTransformer();
	        	jungleTransformer =  new com.tcc.transformer.items.wood.JungleTransformer();
	        	spruceTransformer =  new com.tcc.transformer.items.wood.SpruceTransformer();
	        	oakTransformer =  new com.tcc.transformer.items.wood.OakTransformer();
	        	darkoakTransformer =  new com.tcc.transformer.items.wood.DarkoakTransformer();
	        	
	        	oakSaplingChunk = new com.tcc.transformer.items.wood.OakSaplingChunk();
	        	spruceSaplingChunk = new com.tcc.transformer.items.wood.SpruceSaplingChunk();
	        	jungleSaplingChunk = new com.tcc.transformer.items.wood.JungleSaplingChunk();
	        	acadiaSaplingChunk = new com.tcc.transformer.items.wood.AcadiaSaplingChunk();
	        	darkoakSaplingChunk = new com.tcc.transformer.items.wood.DarkoakSaplingChunk();
	        	birchSaplingChunk = new com.tcc.transformer.items.wood.BirchSaplingChunk();
	        	
	        	GameRegistry.registerBlock(oakBlock, "oakBlock");
	        	GameRegistry.registerBlock(birchBlock, "birchBlock");
	        	GameRegistry.registerBlock(spruceBlock, "spruceBlock");
	        	GameRegistry.registerBlock(jungleBlock, "jungleBlock");
	        	GameRegistry.registerBlock(acadiaBlock, "acadiaBlock");
	        	GameRegistry.registerBlock(darkoakBlock, "darkoakBlock");
	        	
	        	GameRegistry.registerItem(acadiaTransformer, "acadiaTransformer");
	        	GameRegistry.registerItem(birchTransformer, "birchTransformer");
	        	GameRegistry.registerItem(oakTransformer, "oakTransformer");
	        	GameRegistry.registerItem(spruceTransformer, "spruceTransformer");
	        	GameRegistry.registerItem(jungleTransformer, "jungleTransformer");
	        	GameRegistry.registerItem(darkoakTransformer, "darkoakTransformer");
	        	
	        	GameRegistry.registerItem(oakSaplingChunk, "oakSaplingChunk");
	        	GameRegistry.registerItem(spruceSaplingChunk, "spruceSaplingChunk");
	        	GameRegistry.registerItem(jungleSaplingChunk, "jungleSaplingChunk");
	        	GameRegistry.registerItem(acadiaSaplingChunk, "acadiaSaplingChunk");
	        	GameRegistry.registerItem(darkoakSaplingChunk, "darkoakSaplingChunk");
	        	GameRegistry.registerItem(birchSaplingChunk, "birchSaplingChunk");
	        }
	       
	        
	        public static CreativeTabs transformerBlock = new CreativeTabs("transformerBlock") {
	            @Override
	            @SideOnly(Side.CLIENT)
	            public Item getTabIconItem() {
	                return Items.nether_star;
	            }
	        };
	        
	        public static CreativeTabs transformerItem = new CreativeTabs("transformerItem") {
	            @Override
	            @SideOnly(Side.CLIENT)
	            public Item getTabIconItem() {
	                return Items.nether_star;
	            }
	        };
	       	        
	        @EventHandler // used in 1.6.2
	        //@Init       // used in 1.5.2
	        public void load(FMLInitializationEvent event) {
	                proxy.registerRenderers();
	        }
	        
	        @EventHandler // used in 1.6.2
	        //@PostInit   // used in 1.5.2
	        public void postInit(FMLPostInitializationEvent event) {
	                // Stub Method
	        }
	}

