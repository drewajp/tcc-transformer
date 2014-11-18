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
import com.tcc.transformer.blocks.wood.*;


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
			
			public static Item oakChunk;
			public static Item spruceChunk;
			public static Item jungleChunk;
			public static Item birchChunk;
			public static Item darkoakChunk;
			public static Item acadiaChunk;
			
			
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
	        	
	        	oakBlock = new OakBlock(Material.wood);
	        	birchBlock = new BirchBlock(Material.wood);
	        	jungleBlock = new JungleBlock(Material.wood);
	        	spruceBlock = new SpruceBlock(Material.wood);
	        	acadiaBlock = new AcadiaBlock(Material.wood);
	        	darkoakBlock = new DarkoakBlock(Material.wood);
	        	
	        	acadiaTransformer =  new AcadiaTransformer();
	        	birchTransformer =  new BirchTransformer();
	        	jungleTransformer =  new JungleTransformer();
	        	spruceTransformer =  new SpruceTransformer();
	        	oakTransformer =  new OakTransformer();
	        	darkoakTransformer =  new DarkoakTransformer();
	        	
	        	oakSaplingChunk = new OakSaplingChunk();
	        	spruceSaplingChunk = new SpruceSaplingChunk();
	        	jungleSaplingChunk = new JungleSaplingChunk();
	        	acadiaSaplingChunk = new AcadiaSaplingChunk();
	        	darkoakSaplingChunk = new DarkoakSaplingChunk();
	        	birchSaplingChunk = new BirchSaplingChunk();
	        	
	        	oakChunk = new OakChunk();
	        	spruceChunk = new SpruceChunk();
	        	jungleChunk = new JungleChunk();
	        	acadiaChunk = new AcadiaChunk();
	        	darkoakChunk = new DarkoakChunk();
	        	birchChunk = new BirchChunk();
	        	
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
	        	
	        	GameRegistry.registerItem(oakChunk, "oakChunk");
	        	GameRegistry.registerItem(birchChunk, "birchChunk");
	        	GameRegistry.registerItem(spruceChunk, "spruceChunk");
	        	GameRegistry.registerItem(jungleChunk, "jungleChunk");
	        	GameRegistry.registerItem(darkoakChunk, "darkoakChunk");
	        	GameRegistry.registerItem(acadiaChunk, "acadiaChunk");
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

