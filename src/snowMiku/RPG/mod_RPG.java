package snowMiku.RPG;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = "rpg", name = "RPG", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_RPG {
	public static CreativeTabs RPGCreativeTab = new RPGCreativeTab("RPG");
	public static Block BlockTest;
	@SidedProxy(
			clientSide = "snowMiku.RPG.RPGClientProxy",
			serverSide = "snowMiku.RPG.RPGCommonProxy"
	)
	public static RPGCommonProxy proxy;
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event) {
		BlockTest = new BlockTest(1000,Material.rock);
		BlockTest.setUnlocalizedName("BlockTest");
		BlockTest.setTextureName("rpg:BlockTest");
		BlockTest.setHardness(1.5f); //可省略
		BlockTest.setResistance(10.0f); //可省略
		BlockTest.setLightValue(0.0f); //可省略
		BlockTest.setStepSound(Block.soundStoneFootstep); //可省略
		BlockTest.setCreativeTab(RPGCreativeTab); //可省略
		GameRegistry.registerBlock(BlockTest, "BlockTest");
		LanguageRegistry.addName(BlockTest, "测试方块");
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
	}

	@EventHandler
	public void postLoad(FMLPostInitializationEvent event) {
	}
}