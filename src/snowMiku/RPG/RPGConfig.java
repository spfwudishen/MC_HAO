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

	// ���������ļ��ĺ���
	public static void SaveConfig() {
		RPGConfig.instance.config.save();
	}

	// ���������ǻ�ȡ����ID����ƷID��������������Ϣ�ĺ���

	public static String GetGeneralProperties(String PropertyName, String DefaultValue) throws Exception {
		if (RPGConfig.instance == null) {
			throw new Exception("û�г�ʼ�������ļ���");
		}
		return RPGConfig.instance.config.get("general", PropertyName, DefaultValue).getString();
	}

	public static int GetItemID(String ItemName, int DefaultValue) throws Exception {
		if (RPGConfig.instance == null) {
			throw new Exception("û�г�ʼ�������ļ���");
		}
		return RPGConfig.instance.config.getItem("item", "ID." + ItemName, DefaultValue).getInt();
	}

	public static int GetBlockID(String BlockName, int DefaultID) throws Exception {
		if (RPGConfig.instance == null) {
			throw new Exception("û�г�ʼ�������ļ���");
		}
		return RPGConfig.instance.config.getBlock("ID." + BlockName, DefaultID).getInt();
	}
}