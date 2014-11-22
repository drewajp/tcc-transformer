package com.tcc.transformer.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
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
import com.tcc.transformer.blocks.*;
import com.tcc.transformer.blocks.wood.*;
import com.tcc.transformer.items.*;
import com.tcc.transformer.items.sand.*;
import com.tcc.transformer.blocks.sand.*;


@Mod(modid="TCCTransformer", name="The TCC Transformer Mod", version="1.0")
public class Transformer {

	//@NetworkMod(clientSideRequired=true) // not used in 1.7

			public static Block oakBlock;
			public static Block birchBlock;
			public static Block jungleBlock;
			public static Block spruceBlock;
			public static Block acadiaBlock;
			public static Block darkoakBlock;
			public static Block mineralBlock;
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
			public static Item redSandTransformer;
			public static Item sandTransformer;
			public static Item sandChunk;
			public static Item redSandChunk;
			public static Item sandPiece;
			public static Item redSandPiece;
			public static Block sandBlock;
			public static Block redSandBlock;
			
	        // The instance of your mod that Forge uses.
	        @Instance(value = "TCCTransformer")
	        public static Transformer instance;
	        
	        // Says where the client and server 'proxy' code is loaded.
	        @SidedProxy(clientSide="com.tcc.transformer.base.ClientProxy", serverSide="com.tcc.transformer.base.CommonProxy")
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
	        	mineralBlock = new MineralBlock(Material.rock);
	        	oakPiece = new OakPiece();
	        	acadiaPiece = new AcadiaPiece();
	        	birchPiece = new BirchPiece();
	        	sprucePiece = new SprucePiece();
	        	darkoakPiece = new DarkoakPiece();
	        	junglePiece = new JunglePiece();
	        	
	        	redSandTransformer = new RedSandTransformer();
	        	sandTransformer = new SandTransformer();
	        	sandChunk = new SandChunk();
	        	redSandChunk = new RedSandChunk();
	        	sandPiece = new SandPiece();
	        	redSandPiece = new RedSandPiece();
	        	sandBlock = new SandBlock(Material.sand);
	        	redSandBlock = new RedSandBlock(Material.sand);
	        	
	        	
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
	        	GameRegistry.registerItem(oakPiece, "oakPiece");
	        	GameRegistry.registerItem(birchPiece, "birchPiece");
	        	GameRegistry.registerItem(junglePiece, "junglePiece");
	        	GameRegistry.registerItem(sprucePiece, "sprucePiece");
	        	GameRegistry.registerItem(darkoakPiece, "darkoakPiece");
	        	GameRegistry.registerItem(acadiaPiece, "acadiaPiece");
	        	
	        	GameRegistry.registerBlock(mineralBlock, "mineralBlock");
	        	GameRegistry.registerItem(magicCrystal, "magicCrystal");
	        	
	        	GameRegistry.registerItem(redSandTransformer,  "redSandTransformer");
	        	GameRegistry.registerItem(sandTransformer,  "sandTransformer");
	        	GameRegistry.registerItem(sandChunk, "sandChunk");
	        	GameRegistry.registerItem(redSandChunk,  "redSandChunk");
	        	GameRegistry.registerItem(redSandPiece,  "redSandPiece");
	        	GameRegistry.registerItem(sandPiece, "sandPiece");
	        	GameRegistry.registerBlock(sandBlock, "sandBlock");
	        	GameRegistry.registerBlock(redSandBlock, "redSandBlock");
	        	
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
	            	ItemStack oakTransformerR = new ItemStack(Transformer.oakTransformer);
	            	ItemStack spruceTransformerR = new ItemStack(Transformer.spruceTransformer);
	            	ItemStack birchTransformerR = new ItemStack(Transformer.birchTransformer);
	            	ItemStack darkoakTransformerR = new ItemStack(Transformer.darkoakTransformer);
	            	ItemStack acadiaTransformerR = new ItemStack(Transformer.acadiaTransformer);
	            	ItemStack jungleTransformerR = new ItemStack(Transformer.jungleTransformer);
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
	            	ItemStack oakWood = new ItemStack(Blocks.log, 1, 0);
	            	ItemStack spruceWood = new ItemStack(Blocks.log, 1, 1);
	            	ItemStack birchWood = new ItemStack(Blocks.log, 1, 2);
	            	ItemStack jungleWood = new ItemStack(Blocks.log, 1, 3);
	            	ItemStack acadiaWood = new ItemStack(Blocks.log2, 1, 0);
	            	ItemStack darkoakWood = new ItemStack(Blocks.log2, 1, 1);
	            	ItemStack oakWood8 = new ItemStack(Blocks.log, 8, 0);
	            	ItemStack spruceWood8 = new ItemStack(Blocks.log, 8, 1);
	            	ItemStack birchWood8 = new ItemStack(Blocks.log, 8, 2);
	            	ItemStack jungleWood8 = new ItemStack(Blocks.log, 8, 3);
	            	ItemStack acadiaWood8 = new ItemStack(Blocks.log2, 8, 0);
	            	ItemStack darkoakWood8 = new ItemStack(Blocks.log2, 8, 1);
	            	ItemStack oakWood64 = new ItemStack(Blocks.log, 64, 0);
	            	ItemStack spruceWood64 = new ItemStack(Blocks.log, 64, 1);
	            	ItemStack birchWood64 = new ItemStack(Blocks.log, 64, 2);
	            	ItemStack jungleWood64 = new ItemStack(Blocks.log, 64, 3);
	            	ItemStack acadiaWood64 = new ItemStack(Blocks.log2, 64, 0);
	            	ItemStack darkoakWood64 = new ItemStack(Blocks.log2, 64, 1);
	            	
	            	ItemStack diamond = new ItemStack(Items.diamond);
	            	ItemStack coal = new ItemStack(Items.coal);
	            	ItemStack iron = new ItemStack(Items.iron_ingot);
	            	ItemStack gold = new ItemStack(Items.gold_ingot);
	            	ItemStack lapis = new ItemStack(Items.dye, 1, 4);
	            	ItemStack redstone = new ItemStack(Blocks.redstone_block);
	            	ItemStack mineralBlock = new ItemStack(Transformer.mineralBlock);
	            	ItemStack crystal = new ItemStack(Transformer.magicCrystal);

	            	ItemStack sandTransformerR = new ItemStack(Transformer.sandTransformer);
	            	ItemStack redSandTransformerR = new ItemStack(Transformer.redSandTransformer);
	            	ItemStack sandChunk = new ItemStack(Transformer.sandChunk);
	            	ItemStack redSandChunk = new ItemStack(Transformer.redSandChunk);
	            	ItemStack sandPiece = new ItemStack(Transformer.sandPiece);
	            	ItemStack redSandPiece = new ItemStack(Transformer.redSandPiece);
	            	ItemStack sand = new ItemStack(Blocks.sand);
	            	ItemStack redSand = new ItemStack(Blocks.sand, 1, 1);
	            	ItemStack sand8 = new ItemStack(Blocks.sand, 8, 0);
	            	ItemStack redSand8 = new ItemStack(Blocks.sand, 8, 1);
	            	ItemStack sand64 = new ItemStack(Blocks.sand, 64, 0);
	            	ItemStack redSand64 = new ItemStack(Blocks.sand, 64, 1);
	            	ItemStack redSandBlock = new ItemStack(Transformer.redSandBlock);
	            	ItemStack sandBlock = new ItemStack(Transformer.sandBlock);
	            	
	            	
	            	GameRegistry.addRecipe(oakTransformerR, "xyx", "yzy", "xyx", 'x', oakChunk, 'y', oakSaplingChunk, 'z', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(spruceTransformerR, "xyx", "yzy", "xyx", 'x', spruceChunk, 'y', spruceSaplingChunk, 'z', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(birchTransformerR, "xyx", "yzy", "xyx", 'x', birchChunk, 'y', birchSaplingChunk, 'z', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(darkoakTransformerR, "xyx", "yzy", "xyx", 'x', darkoakChunk, 'y', darkoakSaplingChunk, 'z', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(acadiaTransformerR, "xyx", "yzy", "xyx", 'x', acadiaChunk, 'y', acadiaSaplingChunk, 'z', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(jungleTransformerR, "xyx", "yzy", "xyx", 'x', jungleChunk, 'y', jungleSaplingChunk, 'z', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(oakSaplingChunk, "xxx", "xyx", "xxx", 'x', oakSapling, 'y',magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(spruceSaplingChunk, "xxx", "xyx", "xxx", 'x', spruceSapling, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(darkoakSaplingChunk, "xxx", "xyx", "xxx", 'x', darkoakSapling, 'y',  magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(birchSaplingChunk, "xxx", "xyx", "xxx", 'x', birchSapling, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(jungleSaplingChunk, "xxx", "xyx", "xxx", 'x', jungleSapling, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(acadiaSaplingChunk, "xxx", "xyx", "xxx", 'x', acadiaSapling, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(acadiaChunk, "xxx", "xyx", "xxx", 'x', acadiaPiece, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(oakChunk, "xxx", "xyx", "xxx", 'x', oakPiece, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(jungleChunk, "xxx", "xyx", "xxx", 'x', junglePiece, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(darkoakChunk, "xxx", "xyx", "xxx", 'x', darkoakPiece, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(birchChunk, "xxx", "xyx", "xxx", 'x', birchPiece, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(spruceChunk, "xxx", "xyx", "xxx", 'x', sprucePiece, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(oakPiece, " x ", "xyx", " x ", 'x', oakWood, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(sprucePiece, " x ", "xyx", " x ", 'x', spruceWood, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(birchPiece, " x ", "xyx", " x ", 'x', birchWood, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(sprucePiece, " x ", "xyx", " x ", 'x', spruceWood, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(junglePiece, " x ", "xyx", " x ", 'x', jungleWood, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(darkoakPiece, " x ", "xyx", " x ", 'x', darkoakWood, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(oakWood8, "xxx", "xyx", "xxx", 'x', spruceWood, 'y', oakTransformer.setContainerItem(oakTransformer));
	            	GameRegistry.addRecipe(oakWood8, "xxx", "xyx", "xxx", 'x', acadiaWood, 'y', oakTransformer.setContainerItem(oakTransformer));
	            	GameRegistry.addRecipe(oakWood8, "xxx", "xyx", "xxx", 'x', birchWood, 'y', oakTransformer.setContainerItem(oakTransformer));
	            	GameRegistry.addRecipe(oakWood8, "xxx", "xyx", "xxx", 'x', darkoakWood, 'y', oakTransformer.setContainerItem(oakTransformer));
	            	GameRegistry.addRecipe(oakWood8, "xxx", "xyx", "xxx", 'x', jungleWood, 'y', oakTransformer.setContainerItem(oakTransformer));
	            	GameRegistry.addRecipe(spruceWood8, "xxx", "xyx", "xxx", 'x', oakWood, 'y', spruceTransformer.setContainerItem(spruceTransformer));
	            	GameRegistry.addRecipe(spruceWood8, "xxx", "xyx", "xxx", 'x', acadiaWood, 'y', spruceTransformer.setContainerItem(spruceTransformer));
	            	GameRegistry.addRecipe(spruceWood8, "xxx", "xyx", "xxx", 'x', birchWood, 'y', spruceTransformer.setContainerItem(spruceTransformer));
	            	GameRegistry.addRecipe(spruceWood8, "xxx", "xyx", "xxx", 'x', darkoakWood, 'y', spruceTransformer.setContainerItem(spruceTransformer));
	            	GameRegistry.addRecipe(spruceWood8, "xxx", "xyx", "xxx", 'x', jungleWood, 'y', spruceTransformer.setContainerItem(spruceTransformer));
	            	GameRegistry.addRecipe(birchWood8, "xxx", "xyx", "xxx", 'x', jungleWood, 'y', birchTransformer.setContainerItem(birchTransformer));
	            	GameRegistry.addRecipe(birchWood8, "xxx", "xyx", "xxx", 'x', spruceWood, 'y', birchTransformer.setContainerItem(birchTransformer));
	            	GameRegistry.addRecipe(birchWood8, "xxx", "xyx", "xxx", 'x', darkoakWood, 'y', birchTransformer.setContainerItem(birchTransformer));
	            	GameRegistry.addRecipe(birchWood8, "xxx", "xyx", "xxx", 'x', oakWood, 'y', birchTransformer.setContainerItem(birchTransformer));
	            	GameRegistry.addRecipe(birchWood8, "xxx", "xyx", "xxx", 'x', acadiaWood, 'y', birchTransformer.setContainerItem(birchTransformer));
	            	GameRegistry.addRecipe(jungleWood8, "xxx", "xyx", "xxx", 'x', acadiaWood, 'y', jungleTransformer.setContainerItem(jungleTransformer));
	            	GameRegistry.addRecipe(jungleWood8, "xxx", "xyx", "xxx", 'x', spruceWood, 'y', jungleTransformer.setContainerItem(jungleTransformer));
	            	GameRegistry.addRecipe(jungleWood8, "xxx", "xyx", "xxx", 'x', oakWood, 'y', jungleTransformer.setContainerItem(jungleTransformer));
	            	GameRegistry.addRecipe(jungleWood8, "xxx", "xyx", "xxx", 'x', darkoakWood, 'y', jungleTransformer.setContainerItem(jungleTransformer));
	            	GameRegistry.addRecipe(jungleWood8, "xxx", "xyx", "xxx", 'x', birchWood, 'y', jungleTransformer.setContainerItem(jungleTransformer));
	            	GameRegistry.addRecipe(darkoakWood8, "xxx", "xyx", "xxx", 'x', birchWood, 'y', darkoakTransformer.setContainerItem(darkoakTransformer));
	            	GameRegistry.addRecipe(darkoakWood8, "xxx", "xyx", "xxx", 'x', oakWood, 'y', darkoakTransformer.setContainerItem(darkoakTransformer));
	            	GameRegistry.addRecipe(darkoakWood8, "xxx", "xyx", "xxx", 'x', spruceWood, 'y', darkoakTransformer.setContainerItem(darkoakTransformer));
	            	GameRegistry.addRecipe(darkoakWood8, "xxx", "xyx", "xxx", 'x', jungleWood, 'y', darkoakTransformer.setContainerItem(darkoakTransformer));
	            	GameRegistry.addRecipe(darkoakWood8, "xxx", "xyx", "xxx", 'x', acadiaWood, 'y', darkoakTransformer.setContainerItem(darkoakTransformer));
	            	GameRegistry.addRecipe(acadiaWood8, "xxx", "xyx", "xxx", 'x', birchWood, 'y', acadiaTransformer.setContainerItem(acadiaTransformer));
	            	GameRegistry.addRecipe(acadiaWood8, "xxx", "xyx", "xxx", 'x', darkoakWood, 'y', acadiaTransformer.setContainerItem(acadiaTransformer));
	            	GameRegistry.addRecipe(acadiaWood8, "xxx", "xyx", "xxx", 'x', oakWood, 'y', acadiaTransformer.setContainerItem(acadiaTransformer));
	            	GameRegistry.addRecipe(acadiaWood8, "xxx", "xyx", "xxx", 'x', spruceWood, 'y', acadiaTransformer.setContainerItem(acadiaTransformer));
	            	GameRegistry.addRecipe(acadiaWood8, "xxx", "xyx", "xxx", 'x', jungleWood, 'y', acadiaTransformer.setContainerItem(acadiaTransformer));
	            	GameRegistry.addRecipe(oakBlock, "xxx", "xyx", "xxx", 'x', oakWood, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(spruceBlock, "xxx", "xyx", "xxx", 'x', spruceWood, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(birchBlock, "xxx", "xyx", "xxx", 'x', birchWood, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(darkoakBlock, "xxx", "xyx", "xxx", 'x', darkoakWood, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(acadiaBlock, "xxx", "xyx", "xxx", 'x', acadiaWood, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(jungleBlock, "xxx", "xyx", "xxx", 'x', jungleWood, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(oakWood64, "xxx", "xyx", "xxx", 'x', spruceBlock, 'y', oakTransformer.setContainerItem(oakTransformer));
	            	GameRegistry.addRecipe(oakWood64, "xxx", "xyx", "xxx", 'x', acadiaBlock, 'y', oakTransformer.setContainerItem(oakTransformer));
	            	GameRegistry.addRecipe(oakWood64, "xxx", "xyx", "xxx", 'x', birchBlock, 'y', oakTransformer.setContainerItem(oakTransformer));
	            	GameRegistry.addRecipe(oakWood64, "xxx", "xyx", "xxx", 'x', darkoakBlock, 'y', oakTransformer.setContainerItem(oakTransformer));
	            	GameRegistry.addRecipe(oakWood64, "xxx", "xyx", "xxx", 'x', jungleBlock, 'y', oakTransformer.setContainerItem(oakTransformer));
	            	GameRegistry.addRecipe(spruceWood64, "xxx", "xyx", "xxx", 'x', oakBlock, 'y', spruceTransformer.setContainerItem(spruceTransformer));
	            	GameRegistry.addRecipe(spruceWood64, "xxx", "xyx", "xxx", 'x', acadiaBlock, 'y', spruceTransformer.setContainerItem(spruceTransformer));
	            	GameRegistry.addRecipe(spruceWood64, "xxx", "xyx", "xxx", 'x', birchBlock, 'y', spruceTransformer.setContainerItem(spruceTransformer));
	            	GameRegistry.addRecipe(spruceWood64, "xxx", "xyx", "xxx", 'x', darkoakBlock, 'y', spruceTransformer.setContainerItem(spruceTransformer));
	            	GameRegistry.addRecipe(spruceWood64, "xxx", "xyx", "xxx", 'x', jungleBlock, 'y', spruceTransformer.setContainerItem(spruceTransformer));
	            	GameRegistry.addRecipe(birchWood64, "xxx", "xyx", "xxx", 'x', jungleBlock, 'y', birchTransformer.setContainerItem(birchTransformer));
	            	GameRegistry.addRecipe(birchWood64, "xxx", "xyx", "xxx", 'x', spruceBlock, 'y', birchTransformer.setContainerItem(birchTransformer));
	            	GameRegistry.addRecipe(birchWood64, "xxx", "xyx", "xxx", 'x', darkoakBlock, 'y', birchTransformer.setContainerItem(birchTransformer));
	            	GameRegistry.addRecipe(birchWood64, "xxx", "xyx", "xxx", 'x', oakBlock, 'y', birchTransformer.setContainerItem(birchTransformer));
	            	GameRegistry.addRecipe(birchWood64, "xxx", "xyx", "xxx", 'x', acadiaBlock, 'y', birchTransformer.setContainerItem(birchTransformer));
	            	GameRegistry.addRecipe(jungleWood64, "xxx", "xyx", "xxx", 'x', acadiaBlock, 'y', jungleTransformer.setContainerItem(jungleTransformer));
	            	GameRegistry.addRecipe(jungleWood64, "xxx", "xyx", "xxx", 'x', spruceBlock, 'y', jungleTransformer.setContainerItem(jungleTransformer));
	            	GameRegistry.addRecipe(jungleWood64, "xxx", "xyx", "xxx", 'x', oakBlock, 'y', jungleTransformer.setContainerItem(jungleTransformer));
	            	GameRegistry.addRecipe(jungleWood64, "xxx", "xyx", "xxx", 'x', darkoakBlock, 'y', jungleTransformer.setContainerItem(jungleTransformer));
	            	GameRegistry.addRecipe(jungleWood64, "xxx", "xyx", "xxx", 'x', birchBlock, 'y', jungleTransformer.setContainerItem(jungleTransformer));
	            	GameRegistry.addRecipe(darkoakWood64, "xxx", "xyx", "xxx", 'x', birchBlock, 'y', darkoakTransformer.setContainerItem(darkoakTransformer));
	            	GameRegistry.addRecipe(darkoakWood64, "xxx", "xyx", "xxx", 'x', oakBlock, 'y', darkoakTransformer.setContainerItem(darkoakTransformer));
	            	GameRegistry.addRecipe(darkoakWood64, "xxx", "xyx", "xxx", 'x', spruceBlock, 'y', darkoakTransformer.setContainerItem(darkoakTransformer));
	            	GameRegistry.addRecipe(darkoakWood64, "xxx", "xyx", "xxx", 'x', jungleBlock, 'y', darkoakTransformer.setContainerItem(darkoakTransformer));
	            	GameRegistry.addRecipe(darkoakWood64, "xxx", "xyx", "xxx", 'x', acadiaBlock, 'y', darkoakTransformer.setContainerItem(darkoakTransformer));
	            	GameRegistry.addRecipe(acadiaWood64, "xxx", "xyx", "xxx", 'x', birchBlock, 'y', acadiaTransformer.setContainerItem(acadiaTransformer));
	            	GameRegistry.addRecipe(acadiaWood64, "xxx", "xyx", "xxx", 'x', darkoakBlock, 'y', acadiaTransformer.setContainerItem(acadiaTransformer));
	            	GameRegistry.addRecipe(acadiaWood64, "xxx", "xyx", "xxx", 'x', oakBlock, 'y', acadiaTransformer.setContainerItem(acadiaTransformer));
	            	GameRegistry.addRecipe(acadiaWood64, "xxx", "xyx", "xxx", 'x', spruceBlock, 'y', acadiaTransformer.setContainerItem(acadiaTransformer));
	            	GameRegistry.addRecipe(acadiaWood64, "xxx", "xyx", "xxx", 'x', jungleBlock, 'y', acadiaTransformer.setContainerItem(acadiaTransformer));
	            	
	            	GameRegistry.addRecipe(mineralBlock, "cgc", "ldl", "igi", 'c', coal, 'g', gold, 'l', lapis, 'd', diamond, 'i', iron);
	            	GameRegistry.addRecipe(crystal, "bbb", "brb", "bbb", 'b', mineralBlock, 'r', redstone);
	            	
	            	GameRegistry.addRecipe(sandTransformerR, "xxx", "xyx", "xxx", 'x', sandChunk, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(redSandTransformerR, "xxx", "xyx", "xxx", 'x', redSandChunk, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(sandChunk, " x ", "xyx", " x ", 'x', sandPiece, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(redSandChunk, " x ", "xyx", " x ", 'x', redSandPiece, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(sandPiece, "xxx", "xyx", "xxx", 'x', sand, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(redSandPiece, "xxx", "xyx", "xxx", 'x', redSand, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(sand8, "xxx", "xyx", "xxx", 'x', redSand, 'y', sandTransformer.setContainerItem(sandTransformer));
	            	GameRegistry.addRecipe(redSand8, "xxx", "xyx", "xxx", 'x', sand, 'y', redSandTransformer.setContainerItem(sandTransformer));
	            	GameRegistry.addRecipe(redSand64, "xxx", "xyx", "xxx", 'x', sandBlock, 'y', redSandTransformer.setContainerItem(redSandTransformer));
	            	GameRegistry.addRecipe(sand64, "xxx", "xyx", "xxx", 'x', redSandBlock, 'y', sandTransformer.setContainerItem(sandTransformer));
	            	GameRegistry.addRecipe(sandBlock, "xxx", "xyx", "xxx", 'x', sand, 'y', magicCrystal.setContainerItem(magicCrystal));
	            	GameRegistry.addRecipe(redSandBlock, "xxx", "xyx", "xxx", 'x', redSand, 'y', magicCrystal.setContainerItem(magicCrystal));
	        }
	        

			@EventHandler // used in 1.6.2
	        //@PostInit   // used in 1.5.2
	        public void postInit(FMLPostInitializationEvent event) {
	                // Stub Method
	        }
	}

