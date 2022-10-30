
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tdfp.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TdfpModTabs {
	public static CreativeModeTab TAB_TDFP;

	public static void load() {
		TAB_TDFP = new CreativeModeTab("tabtdfp") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TdfpModItems.TORCHBERRY_MILKSHAKE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
