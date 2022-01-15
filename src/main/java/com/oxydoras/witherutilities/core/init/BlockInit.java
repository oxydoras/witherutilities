package com.oxydoras.witherutilities.core.init;

import com.oxydoras.witherutilities.WitherUtilities;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			WitherUtilities.MOD_ID);

	public static final RegistryObject<Block> WITHERIUM_ORE = BLOCKS.register("witherium_ore",
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(5f, 4f)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));
}
