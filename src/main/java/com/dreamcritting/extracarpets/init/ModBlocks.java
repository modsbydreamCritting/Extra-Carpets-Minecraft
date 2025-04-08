package com.dreamcritting.extracarpets.init;

import com.dreamcritting.extracarpets.Extracarpets;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, Extracarpets.MOD_ID);
	
	public static final RegistryObject<Block> spiral_carpet_white_and_black = BLOCKS.register("spiral_carpet_white_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_blue = BLOCKS.register("spiral_carpet_white_and_blue", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_brown = BLOCKS.register("spiral_carpet_white_and_brown", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_cyan = BLOCKS.register("spiral_carpet_white_and_cyan", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_gray = BLOCKS.register("spiral_carpet_white_and_gray", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_green = BLOCKS.register("spiral_carpet_white_and_green", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_light_blue = BLOCKS.register("spiral_carpet_white_and_light_blue", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_light_gray = BLOCKS.register("spiral_carpet_white_and_light_gray", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_lime = BLOCKS.register("spiral_carpet_white_and_lime", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_magenta = BLOCKS.register("spiral_carpet_white_and_magenta", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_orange = BLOCKS.register("spiral_carpet_white_and_orange", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_pink = BLOCKS.register("spiral_carpet_white_and_pink", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_purple = BLOCKS.register("spiral_carpet_white_and_purple", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_red = BLOCKS.register("spiral_carpet_white_and_red", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_white_and_yellow = BLOCKS.register("spiral_carpet_white_and_yellow", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_double_green = BLOCKS.register("spiral_carpet_double_green", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_double_blue = BLOCKS.register("spiral_carpet_double_blue", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_double_orange = BLOCKS.register("spiral_carpet_double_orange", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_double_yellow = BLOCKS.register("spiral_carpet_double_yellow", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_double_pink = BLOCKS.register("spiral_carpet_double_pink", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_double_gray = BLOCKS.register("spiral_carpet_double_gray", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_red_and_black = BLOCKS.register("spiral_carpet_red_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_magenta_and_black = BLOCKS.register("spiral_carpet_magenta_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> spiral_carpet_purple_and_black = BLOCKS.register("spiral_carpet_purple_and_black", () -> new ModCarpet());

	// Chequered
	
	public static final RegistryObject<Block> chequered_carpet_white_and_black = BLOCKS.register("chequered_carpet_white_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_blue = BLOCKS.register("chequered_carpet_white_and_blue", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_brown = BLOCKS.register("chequered_carpet_white_and_brown", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_cyan = BLOCKS.register("chequered_carpet_white_and_cyan", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_gray = BLOCKS.register("chequered_carpet_white_and_gray", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_green = BLOCKS.register("chequered_carpet_white_and_green", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_light_blue = BLOCKS.register("chequered_carpet_white_and_light_blue", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_light_gray = BLOCKS.register("chequered_carpet_white_and_light_gray", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_lime = BLOCKS.register("chequered_carpet_white_and_lime", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_magenta = BLOCKS.register("chequered_carpet_white_and_magenta", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_orange = BLOCKS.register("chequered_carpet_white_and_orange", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_pink = BLOCKS.register("chequered_carpet_white_and_pink", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_purple = BLOCKS.register("chequered_carpet_white_and_purple", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_red = BLOCKS.register("chequered_carpet_white_and_red", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_white_and_yellow = BLOCKS.register("chequered_carpet_white_and_yellow", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_double_green = BLOCKS.register("chequered_carpet_double_green", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_double_blue = BLOCKS.register("chequered_carpet_double_blue", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_double_orange = BLOCKS.register("chequered_carpet_double_orange", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_double_yellow = BLOCKS.register("chequered_carpet_double_yellow", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_double_pink = BLOCKS.register("chequered_carpet_double_pink", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_double_gray = BLOCKS.register("chequered_carpet_double_gray", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_red_and_black = BLOCKS.register("chequered_carpet_red_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_magenta_and_black = BLOCKS.register("chequered_carpet_magenta_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> chequered_carpet_purple_and_black = BLOCKS.register("chequered_carpet_purple_and_black", () -> new ModCarpet());
	
	// Dimension
	
	public static final RegistryObject<Block> dimension_carpet_end = BLOCKS.register("dimension_carpet_end", () -> new ModCarpet());
	public static final RegistryObject<Block> dimension_carpet_overworld = BLOCKS.register("dimension_carpet_overworld", () -> new ModCarpet());
	public static final RegistryObject<Block> dimension_carpet_nether = BLOCKS.register("dimension_carpet_nether", () -> new ModCarpet());
	public static final RegistryObject<Block> dimension_carpet_eden = BLOCKS.register("dimension_carpet_eden", () -> new ModCarpet());
	public static final RegistryObject<Block> dimension_carpet_apalachia = BLOCKS.register("dimension_carpet_apalachia", () -> new ModCarpet());
	public static final RegistryObject<Block> dimension_carpet_wildwood = BLOCKS.register("dimension_carpet_wildwood", () -> new ModCarpet());
	public static final RegistryObject<Block> dimension_carpet_skythern = BLOCKS.register("dimension_carpet_skythern", () -> new ModCarpet());
	public static final RegistryObject<Block> dimension_carpet_twilight_forest = BLOCKS.register("dimension_carpet_twilight_forest", () -> new ModCarpet());
	public static final RegistryObject<Block> dimension_carpet_shadowlands = BLOCKS.register("dimension_carpet_shadowlands", () -> new ModCarpet());
	public static final RegistryObject<Block> dimension_carpet_glowshroom_forest = BLOCKS.register("dimension_carpet_glowshroom_forest", () -> new ModCarpet());
	public static final RegistryObject<Block> dimension_carpet_blood_forest = BLOCKS.register("dimension_carpet_blood_forest", () -> new ModCarpet());
	public static final RegistryObject<Block> dimension_carpet_vellium = BLOCKS.register("dimension_carpet_vellium", () -> new ModCarpet());
	
	// Diamond
	
	public static final RegistryObject<Block> diamond_carpet_white_and_black = BLOCKS.register("diamond_carpet_white_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_blue = BLOCKS.register("diamond_carpet_white_and_blue", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_brown = BLOCKS.register("diamond_carpet_white_and_brown", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_cyan = BLOCKS.register("diamond_carpet_white_and_cyan", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_gray = BLOCKS.register("diamond_carpet_white_and_gray", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_green = BLOCKS.register("diamond_carpet_white_and_green", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_light_blue = BLOCKS.register("diamond_carpet_white_and_light_blue", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_light_gray = BLOCKS.register("diamond_carpet_white_and_light_gray", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_lime = BLOCKS.register("diamond_carpet_white_and_lime", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_magenta = BLOCKS.register("diamond_carpet_white_and_magenta", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_orange = BLOCKS.register("diamond_carpet_white_and_orange", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_pink = BLOCKS.register("diamond_carpet_white_and_pink", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_purple = BLOCKS.register("diamond_carpet_white_and_purple", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_red = BLOCKS.register("diamond_carpet_white_and_red", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_white_and_yellow = BLOCKS.register("diamond_carpet_white_and_yellow", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_double_green = BLOCKS.register("diamond_carpet_double_green", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_double_blue = BLOCKS.register("diamond_carpet_double_blue", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_double_orange = BLOCKS.register("diamond_carpet_double_orange", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_double_yellow = BLOCKS.register("diamond_carpet_double_yellow", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_double_pink = BLOCKS.register("diamond_carpet_double_pink", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_double_gray = BLOCKS.register("diamond_carpet_double_gray", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_red_and_black = BLOCKS.register("diamond_carpet_red_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_magenta_and_black = BLOCKS.register("diamond_carpet_magenta_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> diamond_carpet_purple_and_black = BLOCKS.register("diamond_carpet_purple_and_black", () -> new ModCarpet());
	
	// Misc
	
	public static final RegistryObject<Block> patterned_carpet_hazard = BLOCKS.register("patterned_carpet_hazard", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_sonic_boom = BLOCKS.register("patterned_carpet_sonic_boom", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_red_skulls = BLOCKS.register("patterned_carpet_red_skulls", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_gray_skulls = BLOCKS.register("patterned_carpet_gray_skulls", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_purple_skulls = BLOCKS.register("patterned_carpet_purple_skulls", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_normal = BLOCKS.register("patterned_carpet_normal", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_comedy = BLOCKS.register("patterned_carpet_comedy", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_geometry_dash = BLOCKS.register("patterned_carpet_geometry_dash", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_waves = BLOCKS.register("patterned_carpet_waves", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_chess = BLOCKS.register("patterned_carpet_chess", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_red_heart_on_black = BLOCKS.register("patterned_carpet_red_heart_on_black", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_pink_heart_on_black = BLOCKS.register("patterned_carpet_pink_heart_on_black", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_pink_heart_on_red = BLOCKS.register("patterned_carpet_pink_heart_on_red", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_red_pinwheel = BLOCKS.register("patterned_carpet_red_pinwheel", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_green_pinwheel = BLOCKS.register("patterned_carpet_green_pinwheel", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_light_blue_and_magenta_pinwheel = BLOCKS.register("patterned_carpet_light_blue_and_magenta_pinwheel", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_dotted_ring_blue_and_black = BLOCKS.register("patterned_carpet_dotted_ring_blue_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_dotted_ring_red_and_black = BLOCKS.register("patterned_carpet_dotted_ring_red_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> patterned_carpet_dotted_ring_purple_and_black = BLOCKS.register("patterned_carpet_dotted_ring_purple_and_black", () -> new ModCarpet());
	
	// Large Chequered
	
	public static final RegistryObject<Block> large_chequered_carpet_white_and_black = BLOCKS.register("large_chequered_carpet_white_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_blue = BLOCKS.register("large_chequered_carpet_white_and_blue", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_brown = BLOCKS.register("large_chequered_carpet_white_and_brown", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_cyan = BLOCKS.register("large_chequered_carpet_white_and_cyan", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_gray = BLOCKS.register("large_chequered_carpet_white_and_gray", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_green = BLOCKS.register("large_chequered_carpet_white_and_green", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_light_blue = BLOCKS.register("large_chequered_carpet_white_and_light_blue", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_light_gray = BLOCKS.register("large_chequered_carpet_white_and_light_gray", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_lime = BLOCKS.register("large_chequered_carpet_white_and_lime", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_magenta = BLOCKS.register("large_chequered_carpet_white_and_magenta", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_orange = BLOCKS.register("large_chequered_carpet_white_and_orange", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_pink = BLOCKS.register("large_chequered_carpet_white_and_pink", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_purple = BLOCKS.register("large_chequered_carpet_white_and_purple", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_red = BLOCKS.register("large_chequered_carpet_white_and_red", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_white_and_yellow = BLOCKS.register("large_chequered_carpet_white_and_yellow", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_double_green = BLOCKS.register("large_chequered_carpet_double_green", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_double_blue = BLOCKS.register("large_chequered_carpet_double_blue", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_double_orange = BLOCKS.register("large_chequered_carpet_double_orange", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_double_yellow = BLOCKS.register("large_chequered_carpet_double_yellow", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_double_pink = BLOCKS.register("large_chequered_carpet_double_pink", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_double_gray = BLOCKS.register("large_chequered_carpet_double_gray", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_red_and_black = BLOCKS.register("large_chequered_carpet_red_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_magenta_and_black = BLOCKS.register("large_chequered_carpet_magenta_and_black", () -> new ModCarpet());
	public static final RegistryObject<Block> large_chequered_carpet_purple_and_black = BLOCKS.register("large_chequered_carpet_purple_and_black", () -> new ModCarpet());

	// Arcade
	
	public static final RegistryObject<Block> arcade_carpet_patterned = BLOCKS.register("arcade_carpet_patterned", () -> new ModCarpet());
	public static final RegistryObject<Block> arcade_carpet_patterned_2 = BLOCKS.register("arcade_carpet_patterned_2", () -> new ModCarpet());
	public static final RegistryObject<Block> arcade_carpet_patterned_3 = BLOCKS.register("arcade_carpet_patterned_3", () -> new ModCarpet());
	public static final RegistryObject<Block> arcade_carpet_stars = BLOCKS.register("arcade_carpet_stars", () -> new ModCarpet());
	public static final RegistryObject<Block> arcade_carpet_geometric = BLOCKS.register("arcade_carpet_geometric", () -> new ModCarpet());
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}


