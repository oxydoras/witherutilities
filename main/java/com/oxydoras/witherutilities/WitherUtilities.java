package com.oxydoras.witherutilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.oxydoras.witherutilities.core.init.ItemInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("witherutilities")
public class WitherUtilities {

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "witherutilities";
	public WitherUtilities() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	};
}
