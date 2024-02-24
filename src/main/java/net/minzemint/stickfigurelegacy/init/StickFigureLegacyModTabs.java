
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.minzemint.stickfigurelegacy.init;

import net.minzemint.stickfigurelegacy.StickFigureLegacyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class StickFigureLegacyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StickFigureLegacyMod.MODID);
	public static final RegistryObject<CreativeModeTab> STICK_FIGURE_LEGACY_TAB = REGISTRY.register("stick_figure_legacy_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.stick_figure_legacy.stick_figure_legacy_tab")).icon(() -> new ItemStack(StickFigureLegacyModItems.ONE_SWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StickFigureLegacyModItems.ONE_SWORD.get());
			})

					.build());
}
