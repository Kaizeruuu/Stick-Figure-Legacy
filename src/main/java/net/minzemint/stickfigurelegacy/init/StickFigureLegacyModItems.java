
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.minzemint.stickfigurelegacy.init;

import net.minzemint.stickfigurelegacy.item.OneSwordItem;
import net.minzemint.stickfigurelegacy.StickFigureLegacyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class StickFigureLegacyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StickFigureLegacyMod.MODID);
	public static final RegistryObject<Item> ONE_SWORD = REGISTRY.register("one_sword", () -> new OneSwordItem());
}
