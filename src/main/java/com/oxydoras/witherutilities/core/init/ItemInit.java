package com.oxydoras.witherutilities.core.init;

import com.oxydoras.witherutilities.WitherUtilities;


import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			WitherUtilities.MOD_ID);

	public static final RegistryObject<Item> WITHER_BONE = ITEMS.register("wither_bone",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> WITHERIUM_DUST = ITEMS.register("witherium_dust",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}
