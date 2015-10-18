package snowMiku.RPG;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class RPGCreativeTab extends CreativeTabs{

	public RPGCreativeTab(String par2Str) {
		super(par2Str);
	}

	@Override
	public int getTabIconItemIndex() {
	return Block.stone.blockID;
	}
}
