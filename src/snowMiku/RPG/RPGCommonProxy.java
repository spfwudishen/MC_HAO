package snowMiku.RPG;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class RPGCommonProxy {
	/**
	 * ִ�е�1�׶εļ�����Ϊ��
	 */
	public void preInit() {
	}

	/**
	 * ִ�е�2�׶εļ�����Ϊ��
	 */
	public void init() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.RPG", "RPG");
	}

	/**
	 * ִ�е�3�׶εļ�����Ϊ��
	 */
	public void postInit() {
	}
}
