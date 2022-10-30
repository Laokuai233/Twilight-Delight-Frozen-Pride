
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tdfp.init;

import net.tdfp.item.TorchberryMilkshakeItem;
import net.tdfp.item.TorchberryIceCreamItem;
import net.tdfp.item.PhytochemicalMilkshakeItem;
import net.tdfp.item.PhytochemicalIceCreamItem;
import net.tdfp.item.GlacierMilkShakeItem;
import net.tdfp.item.GlacierIceCreamItem;
import net.tdfp.TdfpMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class TdfpModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TdfpMod.MODID);
	public static final RegistryObject<Item> TORCHBERRY_MILKSHAKE = REGISTRY.register("torchberry_milkshake", () -> new TorchberryMilkshakeItem());
	public static final RegistryObject<Item> TORCHBERRY_ICE_CREAM = REGISTRY.register("torchberry_ice_cream", () -> new TorchberryIceCreamItem());
	public static final RegistryObject<Item> PHYTOCHEMICAL_MILKSHAKE = REGISTRY.register("phytochemical_milkshake",
			() -> new PhytochemicalMilkshakeItem());
	public static final RegistryObject<Item> PHYTOCHEMICAL_ICE_CREAM = REGISTRY.register("phytochemical_ice_cream",
			() -> new PhytochemicalIceCreamItem());
	public static final RegistryObject<Item> GLACIER_MILKSHAKE = REGISTRY.register("glacier_milkshake", () -> new GlacierMilkShakeItem());
	public static final RegistryObject<Item> GLACIER_ICE_CREAM = REGISTRY.register("glacier_ice_cream", () -> new GlacierIceCreamItem());
}
