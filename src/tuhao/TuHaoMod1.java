package tuhao;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = TuHaoMod1.modid, name = "tuHao", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class TuHaoMod1 {
	public static final String modid = "tuHaoMod";

	@EventHandler
	public void load(FMLInitializationEvent event) {

	}
}