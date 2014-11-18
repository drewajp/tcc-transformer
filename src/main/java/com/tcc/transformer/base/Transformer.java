package com.tcc.transformer.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
import com.tcc.transformer.items.*;


@Mod(modid="TCCTransformer", name="The TCC Transformer Mod", version="0.0.1")
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
			
			public static Item magicCrystal;
			
			public static Item oakPiece;
			public static Item acadiaPiece;
			public static Item junglePiece;
			public static Item birchPiece;
			public static Item darkoakPiece;
			public static Item sprucePiece;
			
			
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
	        	
	        	magicCrystal = new MagicCrystal();
	        	
	        	oakPiece = new OakPiece();
	        	acadiaPiece = new AcadiaPiece();
	        	birchPiece = new BirchPiece();
	        	sprucePiece = new SprucePiece();
	        	darkoakPiece = new DarkoakPiece();
	        	junglePiece = new JunglePiece();
	        	
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
	        	
	        	GameRegistry.registerItem(magicCrystal, "magicCrystal");
	        	
	        	GameRegistry.registerItem(oakPiece, "oakPiece");
	        	GameRegistry.registerItem(birchPiece, "birchPiece");
	        	GameRegistry.registerItem(junglePiece, "junglePiece");
	        	GameRegistry.registerItem(sprucePiece, "sprucePiece");
	        	GameRegistry.registerItem(darkoakPiece, "darkoakPiece");
	        	GameRegistry.registerItem(acadiaPiece, "acadiaPiece");
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
	                
	            	ItemStack acadiaBlock = new ItemStack(Transformer.acadiaBlock);
	            	ItemStack oakBlock = new ItemStack(Transformer.oakBlock);
	            	ItemStack birchBlock = new ItemStack(Transformer.birchBlock);
	            	ItemStack darkoakBlock = new ItemStack(Transformer.darkoakBlock);
	            	ItemStack spruceBlock = new ItemStack(Transformer.spruceBlock);
	            	ItemStack jungleBlock = new ItemStack(Transformer.jungleBlock);
	            	
	            	ItemStack acadiaSaplingChunk = new ItemStack(Transformer.acadiaSaplingChunk);
	            	ItemStack birchSaplingChunk = new ItemStack(Transformer.birchSaplingChunk);
	            	ItemStack spruceSaplingChunk = new ItemStack(Transformer.spruceSaplingChunk);
	            	ItemStack jungleSaplingChunk = new ItemStack(Transformer.jungleSaplingChunk);
	            	ItemStack darkoakSaplingChunk = new ItemStack(Transformer.darkoakSaplingChunk);
	            	ItemStack oakSaplingChunk = new ItemStack(Transformer.oakSaplingChunk);
	            	
	            	ItemStack acadiaChunk = new ItemStack(Transformer.acadiaChunk);
	            	ItemStack birchChunk = new ItemStack(Transformer.birchChunk);
	            	ItemStack jungleChunk = new ItemStack(Transformer.jungleChunk);
	            	ItemStack darkoakChunk = new ItemStack(Transformer.darkoakChunk);
	            	ItemStack spruceChunk = new ItemStack(Transformer.spruceChunk);
	            	ItemStack oakChunk = new ItemStack(Transformer.oakChunk);
	            	
	            	ItemStack oakTransformer = new ItemStack(Transformer.oakTransformer);
	            	ItemStack spruceTransformer = new ItemStack(Transformer.spruceTransformer);
	            	ItemStack birchTransformer = new ItemStack(Transformer.birchTransformer);
	            	ItemStack darkoakTransformer = new ItemStack(Transformer.darkoakTransformer);
	            	ItemStack acadiaTransformer = new ItemStack(Transformer.acadiaTransformer);
	            	ItemStack jungleTransformer = new ItemStack(Transformer.jungleTransformer);
	            	
	            	ItemStack oakSapling = new ItemStack(Blocks.sapling, 1, 0);
	            	ItemStack acadiaSapling = new ItemStack(Blocks.sapling, 1, 4);
	            	ItemStack spruceSapling = new ItemStack(Blocks.sapling, 1, 1);
	            	ItemStack birchSapling = new ItemStack(Blocks.sapling, 1, 2);
	            	ItemStack jungleSapling = new ItemStack(Blocks.sapling, 1, 3);
	            	ItemStack darkoakSapling = new ItemStack(Blocks.sapling, 1, 5);
	            	
	            	ItemStack oakPiece = new ItemStack(Transformer.oakPiece);
	            	ItemStack acadiaPiece = new ItemStack(Transformer.acadiaPiece);
	            	ItemStack darkoakPiece = new ItemStack(Transformer.darkoakPiece);
	            	ItemStack sprucePiece = new ItemStack(Transformer.sprucePiece);
	            	ItemStack birchPiece = new ItemStack(Transformer.birchPiece);
	            	ItemStack junglePiece = new ItemStack(Transformer.junglePiece);
	            	
	            	GameRegistry.addRecipe(oakTransformer, "xyx", "yzy", "xyx", 'x', oakChunk, 'y', oakSaplingChunk, 'z', magicCrystal);
	            	GameRegistry.addRecipe(spruceTransformer, "xyx", "yzy", "xyx", 'x', spruceChunk, 'y', spruceSaplingChunk, 'z', magicCrystal);
	            	GameRegistry.addRecipe(birchTransformer, "xyx", "yzy", "xyx", 'x', birchChunk, 'y', birchSaplingChunk, 'z', magicCrystal);
	            	GameRegistry.addRecipe(darkoakTransformer, "xyx", "yzy", "xyx", 'x', darkoakChunk, 'y', darkoakSaplingChunk, 'z', magicCrystal);
	            	GameRegistry.addRecipe(acadiaTransformer, "xyx", "yzy", "xyx", 'x', acadiaChunk, 'y', acadiaSaplingChunk, 'z', magicCrystal);
	            	GameRegistry.addRecipe(jungleTransformer, "xyx", "yzy", "xyx", 'x', jungleChunk, 'y', jungleSaplingChunk, 'z', magicCrystal);
	            	
	            	GameRegistry.addRecipe(oakSaplingChunk, "xxx", "xyx", "xxx", 'x', oakSapling, 'y', magicCrystal);
	            	GameRegistry.addRecipe(spruceSaplingChunk, "xxx", "xyx", "xxx", 'x', spruceSapling, 'y', magicCrystal);
	            	GameRegistry.addRecipe(darkoakSaplingChunk, "xxx", "xyx", "xxx", 'x', darkoakSapling, 'y',  magicCrystal);
	            	GameRegistry.addRecipe(birchSaplingChunk, "xxx", "xyx", "xxx", 'x', birchSapling, 'y', magicCrystal);
	            	GameRegistry.addRecipe(jungleSaplingChunk, "xxx", "xyx", "xxx", 'x', jungleSapling, 'y', magicCrystal);
	            	GameRegistry.addRecipe(acadiaSaplingChunk, "xxx", "xyx", "xxx", 'x', acadiaSapling, 'y', magicCrystal);
	            	
	            	GameRegistry.addRecipe(acadiaChunk, "xxx", "xyx", "xxx", 'x', acadiaPiece, 'y', magicCrystal);
	            	GameRegistry.addRecipe(oakChunk, "xxx", "xyx", "xxx", 'x', oakPiece, 'y', magicCrystal);
	            	GameRegistry.addRecipe(jungleChunk, "xxx", "xyx", "xxx", 'x', junglePiece, 'y', magicCrystal);
	            	GameRegistry.addRecipe(darkoakChunk, "xxx", "xyx", "xxx", 'x', darkoakPiece, 'y', magicCrystal);
	            	GameRegistry.addRecipe(birchChunk, "xxx", "xyx", "xxx", 'x', birchPiece, 'y', magicCrystal);
	            	GameRegistry.addRecipe(spruceChunk, "xxx", "xyx", "xxx", 'x', sprucePiece, 'y', magicCrystal);
	        }
	        
	        @EventHandler // used in 1.6.2
	        //@PostInit   // used in 1.5.2
	        public void postInit(FMLPostInitializationEvent event) {
	                // Stub Method
	        }
	}

