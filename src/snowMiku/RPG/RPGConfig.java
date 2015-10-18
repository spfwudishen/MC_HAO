package snowMiku.RPG;

import net.minecraftforge.common.Configuration;
import java.io.File;
import java.io.IOException;

public class RPGConfig {
	private static RPGConfig instance;
	private Configuration config;

	public static void InitliazeConfig(File ConfigFile) {
		if (RPGConfig.instance != null) {
			return;
		}
		RPGConfig.instance = new RPGConfig(ConfigFile);
	}

	private RPGConfig(File configFile) {
		if (!configFile.exists()) {
			try {
				configFile.createNewFile();
			} catch (IOException e) {
				System.out.println(e);
				return;
			}
		}
		config = new Configuration(configFile);
		config.load();
	}

	// 储存配置文件的函数
	public static void SaveConfig() {
		RPGConfig.instance.config.save();
	}

	// 下面三个是获取方块ID、物品ID、和其他配置信息的函数

	public static String GetGeneralProperties(String PropertyName, String DefaultValue) throws Exception {
		if (RPGConfig.instance == null) {
			throw new Exception("没有初始化配置文件！");
		}
		return RPGConfig.instance.config.get("general", PropertyName, DefaultValue).getString();
	}

	public static int GetItemID(String ItemName, int DefaultValue) throws Exception {
		if (RPGConfig.instance == null) {
			throw new Exception("没有初始化配置文件！");
		}
		return RPGConfig.instance.config.getItem("item", "ID." + ItemName, DefaultValue).getInt();
	}

	public static int GetBlockID(String BlockName, int DefaultID) throws Exception {
		if (RPGConfig.instance == null) {
			throw new Exception("没有初始化配置文件！");
		}
		return RPGConfig.instance.config.getBlock("ID." + BlockName, DefaultID).getInt();
	}
}