package snowMiku.RPG;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class RPGCommonProxy {
	/**
	 * 执行第1阶段的加载行为。
	 */
	public void preInit() {
	}

	/**
	 * 执行第2阶段的加载行为。
	 */
	public void init() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.RPG", "RPG");
	}

	/**
	 * 执行第3阶段的加载行为。
	 */
	public void postInit() {
	}
}
