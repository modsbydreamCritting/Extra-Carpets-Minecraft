
package com.dreamcritting.extracarpets.init;

import com.dreamcritting.extracarpets.Extracarpets;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	

	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, Extracarpets.MOD_ID);
	
	//Spiral
	
	public static final RegistryObject<Item> spiral_carpet_white_and_black = ITEMS.register("spiral_carpet_white_and_black", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_blue = ITEMS.register("spiral_carpet_white_and_blue", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_blue.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_brown = ITEMS.register("spiral_carpet_white_and_brown", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_brown.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_cyan = ITEMS.register("spiral_carpet_white_and_cyan", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_cyan.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_gray = ITEMS.register("spiral_carpet_white_and_gray", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_gray.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_green = ITEMS.register("spiral_carpet_white_and_green", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_green.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_lime = ITEMS.register("spiral_carpet_white_and_lime", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_lime.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_light_blue = ITEMS.register("spiral_carpet_white_and_light_blue", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_light_blue.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_light_gray = ITEMS.register("spiral_carpet_white_and_light_gray", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_light_gray.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_magenta = ITEMS.register("spiral_carpet_white_and_magenta", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_magenta.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_orange = ITEMS.register("spiral_carpet_white_and_orange", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_orange.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_pink = ITEMS.register("spiral_carpet_white_and_pink", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_pink.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_purple = ITEMS.register("spiral_carpet_white_and_purple", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_purple.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_red = ITEMS.register("spiral_carpet_white_and_red", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_red.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_white_and_yellow = ITEMS.register("spiral_carpet_white_and_yellow", 
			() -> new BlockItem(ModBlocks.spiral_carpet_white_and_yellow.get(), new Item.Properties()));
	
	// double spiral
	
	public static final RegistryObject<Item> spiral_carpet_double_blue = ITEMS.register("spiral_carpet_double_blue", 
			() -> new BlockItem(ModBlocks.spiral_carpet_double_blue.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_double_gray = ITEMS.register("spiral_carpet_double_gray", 
			() -> new BlockItem(ModBlocks.spiral_carpet_double_gray.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_double_orange = ITEMS.register("spiral_carpet_double_orange", 
			() -> new BlockItem(ModBlocks.spiral_carpet_double_orange.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_double_yellow = ITEMS.register("spiral_carpet_double_yellow", 
			() -> new BlockItem(ModBlocks.spiral_carpet_double_yellow.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_double_pink = ITEMS.register("spiral_carpet_double_pink", 
			() -> new BlockItem(ModBlocks.spiral_carpet_double_pink.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_double_green = ITEMS.register("spiral_carpet_double_green", 
			() -> new BlockItem(ModBlocks.spiral_carpet_double_green.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_red_and_black = ITEMS.register("spiral_carpet_red_and_black", 
			() -> new BlockItem(ModBlocks.spiral_carpet_red_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_magenta_and_black = ITEMS.register("spiral_carpet_magenta_and_black", 
			() -> new BlockItem(ModBlocks.spiral_carpet_magenta_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> spiral_carpet_purple_and_black = ITEMS.register("spiral_carpet_purple_and_black", 
			() -> new BlockItem(ModBlocks.spiral_carpet_purple_and_black.get(), new Item.Properties()));
	
	//chequered
	
	public static final RegistryObject<Item> chequered_carpet_white_and_black = ITEMS.register("chequered_carpet_white_and_black", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_blue = ITEMS.register("chequered_carpet_white_and_blue", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_blue.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_brown = ITEMS.register("chequered_carpet_white_and_brown", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_brown.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_cyan = ITEMS.register("chequered_carpet_white_and_cyan", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_cyan.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_gray = ITEMS.register("chequered_carpet_white_and_gray", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_gray.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_green = ITEMS.register("chequered_carpet_white_and_green", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_green.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_lime = ITEMS.register("chequered_carpet_white_and_lime", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_lime.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_light_blue = ITEMS.register("chequered_carpet_white_and_light_blue", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_light_blue.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_light_gray = ITEMS.register("chequered_carpet_white_and_light_gray", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_light_gray.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_magenta = ITEMS.register("chequered_carpet_white_and_magenta", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_magenta.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_orange = ITEMS.register("chequered_carpet_white_and_orange", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_orange.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_pink = ITEMS.register("chequered_carpet_white_and_pink", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_pink.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_purple = ITEMS.register("chequered_carpet_white_and_purple", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_purple.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_red = ITEMS.register("chequered_carpet_white_and_red", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_red.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_white_and_yellow = ITEMS.register("chequered_carpet_white_and_yellow", 
			() -> new BlockItem(ModBlocks.chequered_carpet_white_and_yellow.get(), new Item.Properties()));
	
	// Double chequered
	
	public static final RegistryObject<Item> chequered_carpet_double_blue = ITEMS.register("chequered_carpet_double_blue", 
			() -> new BlockItem(ModBlocks.chequered_carpet_double_blue.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_double_gray = ITEMS.register("chequered_carpet_double_gray", 
			() -> new BlockItem(ModBlocks.chequered_carpet_double_gray.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_double_orange = ITEMS.register("chequered_carpet_double_orange", 
			() -> new BlockItem(ModBlocks.chequered_carpet_double_orange.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_double_yellow = ITEMS.register("chequered_carpet_double_yellow", 
			() -> new BlockItem(ModBlocks.chequered_carpet_double_yellow.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_double_pink = ITEMS.register("chequered_carpet_double_pink", 
			() -> new BlockItem(ModBlocks.chequered_carpet_double_pink.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_double_green = ITEMS.register("chequered_carpet_double_green", 
			() -> new BlockItem(ModBlocks.chequered_carpet_double_green.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_red_and_black = ITEMS.register("chequered_carpet_red_and_black", 
			() -> new BlockItem(ModBlocks.chequered_carpet_red_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_magenta_and_black = ITEMS.register("chequered_carpet_magenta_and_black", 
			() -> new BlockItem(ModBlocks.chequered_carpet_magenta_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> chequered_carpet_purple_and_black = ITEMS.register("chequered_carpet_purple_and_black", 
			() -> new BlockItem(ModBlocks.chequered_carpet_purple_and_black.get(), new Item.Properties()));
	
	// Dimension
	
	public static final RegistryObject<Item> dimension_carpet_end = ITEMS.register("dimension_carpet_end", 
			() -> new BlockItem(ModBlocks.dimension_carpet_end.get(), new Item.Properties()));
	public static final RegistryObject<Item> dimension_carpet_overworld = ITEMS.register("dimension_carpet_overworld", 
			() -> new BlockItem(ModBlocks.dimension_carpet_overworld.get(), new Item.Properties()));
	public static final RegistryObject<Item> dimension_carpet_nether = ITEMS.register("dimension_carpet_nether", 
			() -> new BlockItem(ModBlocks.dimension_carpet_nether.get(), new Item.Properties()));
	public static final RegistryObject<Item> dimension_carpet_wildwood = ITEMS.register("dimension_carpet_wildwood", 
			() -> new BlockItem(ModBlocks.dimension_carpet_wildwood.get(), new Item.Properties()));
	public static final RegistryObject<Item> dimension_carpet_apalachia = ITEMS.register("dimension_carpet_apalachia", 
			() -> new BlockItem(ModBlocks.dimension_carpet_apalachia.get(), new Item.Properties()));
	public static final RegistryObject<Item> dimension_carpet_skythern = ITEMS.register("dimension_carpet_skythern", 
			() -> new BlockItem(ModBlocks.dimension_carpet_skythern.get(), new Item.Properties()));
	public static final RegistryObject<Item> dimension_carpet_eden = ITEMS.register("dimension_carpet_eden", 
			() -> new BlockItem(ModBlocks.dimension_carpet_eden.get(), new Item.Properties()));
	public static final RegistryObject<Item> dimension_carpet_twilight_forest = ITEMS.register("dimension_carpet_twilight_forest", 
			() -> new BlockItem(ModBlocks.dimension_carpet_twilight_forest.get(), new Item.Properties()));
	public static final RegistryObject<Item> dimension_carpet_shadowlands = ITEMS.register("dimension_carpet_shadowlands", 
			() -> new BlockItem(ModBlocks.dimension_carpet_shadowlands.get(), new Item.Properties()));
	public static final RegistryObject<Item> dimension_carpet_glowshroom_forest = ITEMS.register("dimension_carpet_glowshroom_forest", 
			() -> new BlockItem(ModBlocks.dimension_carpet_glowshroom_forest.get(), new Item.Properties()));
	public static final RegistryObject<Item> dimension_carpet_vellium = ITEMS.register("dimension_carpet_vellium", 
			() -> new BlockItem(ModBlocks.dimension_carpet_vellium.get(), new Item.Properties()));
	public static final RegistryObject<Item> dimension_carpet_blood_forest = ITEMS.register("dimension_carpet_blood_forest", 
			() -> new BlockItem(ModBlocks.dimension_carpet_blood_forest.get(), new Item.Properties()));
	
	// Diamond
	
	public static final RegistryObject<Item> diamond_carpet_white_and_black = ITEMS.register("diamond_carpet_white_and_black", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_blue = ITEMS.register("diamond_carpet_white_and_blue", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_blue.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_brown = ITEMS.register("diamond_carpet_white_and_brown", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_brown.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_cyan = ITEMS.register("diamond_carpet_white_and_cyan", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_cyan.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_gray = ITEMS.register("diamond_carpet_white_and_gray", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_gray.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_green = ITEMS.register("diamond_carpet_white_and_green", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_green.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_lime = ITEMS.register("diamond_carpet_white_and_lime", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_lime.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_light_blue = ITEMS.register("diamond_carpet_white_and_light_blue", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_light_blue.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_light_gray = ITEMS.register("diamond_carpet_white_and_light_gray", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_light_gray.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_magenta = ITEMS.register("diamond_carpet_white_and_magenta", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_magenta.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_orange = ITEMS.register("diamond_carpet_white_and_orange", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_orange.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_pink = ITEMS.register("diamond_carpet_white_and_pink", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_pink.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_purple = ITEMS.register("diamond_carpet_white_and_purple", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_purple.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_red = ITEMS.register("diamond_carpet_white_and_red", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_red.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_white_and_yellow = ITEMS.register("diamond_carpet_white_and_yellow", 
			() -> new BlockItem(ModBlocks.diamond_carpet_white_and_yellow.get(), new Item.Properties()));
	
	// Double diamond
	
	public static final RegistryObject<Item> diamond_carpet_double_blue = ITEMS.register("diamond_carpet_double_blue", 
			() -> new BlockItem(ModBlocks.diamond_carpet_double_blue.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_double_gray = ITEMS.register("diamond_carpet_double_gray", 
			() -> new BlockItem(ModBlocks.diamond_carpet_double_gray.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_double_orange = ITEMS.register("diamond_carpet_double_orange", 
			() -> new BlockItem(ModBlocks.diamond_carpet_double_orange.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_double_yellow = ITEMS.register("diamond_carpet_double_yellow", 
			() -> new BlockItem(ModBlocks.diamond_carpet_double_yellow.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_double_pink = ITEMS.register("diamond_carpet_double_pink", 
			() -> new BlockItem(ModBlocks.diamond_carpet_double_pink.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_double_green = ITEMS.register("diamond_carpet_double_green", 
			() -> new BlockItem(ModBlocks.diamond_carpet_double_green.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_red_and_black = ITEMS.register("diamond_carpet_red_and_black", 
			() -> new BlockItem(ModBlocks.diamond_carpet_red_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_magenta_and_black = ITEMS.register("diamond_carpet_magenta_and_black", 
			() -> new BlockItem(ModBlocks.diamond_carpet_magenta_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> diamond_carpet_purple_and_black = ITEMS.register("diamond_carpet_purple_and_black", 
			() -> new BlockItem(ModBlocks.diamond_carpet_purple_and_black.get(), new Item.Properties()));
	
	// Misc
	
	public static final RegistryObject<Item> patterned_carpet_hazard = ITEMS.register("patterned_carpet_hazard", 
			() -> new BlockItem(ModBlocks.patterned_carpet_hazard.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_sonic_boom = ITEMS.register("patterned_carpet_sonic_boom", 
			() -> new BlockItem(ModBlocks.patterned_carpet_sonic_boom.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_red_skulls = ITEMS.register("patterned_carpet_red_skulls", 
			() -> new BlockItem(ModBlocks.patterned_carpet_red_skulls.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_gray_skulls = ITEMS.register("patterned_carpet_gray_skulls", 
			() -> new BlockItem(ModBlocks.patterned_carpet_gray_skulls.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_purple_skulls = ITEMS.register("patterned_carpet_purple_skulls", 
			() -> new BlockItem(ModBlocks.patterned_carpet_purple_skulls.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_normal = ITEMS.register("patterned_carpet_normal", 
			() -> new BlockItem(ModBlocks.patterned_carpet_normal.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_comedy = ITEMS.register("patterned_carpet_comedy", 
			() -> new BlockItem(ModBlocks.patterned_carpet_comedy.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_geometry_dash = ITEMS.register("patterned_carpet_geometry_dash", 
			() -> new BlockItem(ModBlocks.patterned_carpet_geometry_dash.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_waves = ITEMS.register("patterned_carpet_waves", 
			() -> new BlockItem(ModBlocks.patterned_carpet_waves.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_chess = ITEMS.register("patterned_carpet_chess", 
			() -> new BlockItem(ModBlocks.patterned_carpet_chess.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_red_heart_on_black = ITEMS.register("patterned_carpet_red_heart_on_black", 
			() -> new BlockItem(ModBlocks.patterned_carpet_red_heart_on_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_pink_heart_on_black = ITEMS.register("patterned_carpet_pink_heart_on_black", 
			() -> new BlockItem(ModBlocks.patterned_carpet_pink_heart_on_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_pink_heart_on_red = ITEMS.register("patterned_carpet_pink_heart_on_red", 
			() -> new BlockItem(ModBlocks.patterned_carpet_pink_heart_on_red.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_red_pinwheel = ITEMS.register("patterned_carpet_red_pinwheel", 
			() -> new BlockItem(ModBlocks.patterned_carpet_red_pinwheel.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_green_pinwheel = ITEMS.register("patterned_carpet_green_pinwheel", 
			() -> new BlockItem(ModBlocks.patterned_carpet_green_pinwheel.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_light_blue_and_magenta_pinwheel = ITEMS.register("patterned_carpet_light_blue_and_magenta_pinwheel", 
			() -> new BlockItem(ModBlocks.patterned_carpet_light_blue_and_magenta_pinwheel.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_dotted_ring_blue_and_black = ITEMS.register("patterned_carpet_dotted_ring_blue_and_black", 
			() -> new BlockItem(ModBlocks.patterned_carpet_dotted_ring_blue_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_dotted_ring_red_and_black = ITEMS.register("patterned_carpet_dotted_ring_red_and_black", 
			() -> new BlockItem(ModBlocks.patterned_carpet_dotted_ring_red_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> patterned_carpet_dotted_ring_purple_and_black = ITEMS.register("patterned_carpet_dotted_ring_purple_and_black", 
			() -> new BlockItem(ModBlocks.patterned_carpet_dotted_ring_purple_and_black.get(), new Item.Properties()));
	
	// Large chequered
	
	public static final RegistryObject<Item> large_chequered_carpet_white_and_black = ITEMS.register("large_chequered_carpet_white_and_black", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_blue = ITEMS.register("large_chequered_carpet_white_and_blue", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_blue.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_brown = ITEMS.register("large_chequered_carpet_white_and_brown", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_brown.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_cyan = ITEMS.register("large_chequered_carpet_white_and_cyan", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_cyan.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_gray = ITEMS.register("large_chequered_carpet_white_and_gray", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_gray.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_green = ITEMS.register("large_chequered_carpet_white_and_green", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_green.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_lime = ITEMS.register("large_chequered_carpet_white_and_lime", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_lime.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_light_blue = ITEMS.register("large_chequered_carpet_white_and_light_blue", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_light_blue.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_light_gray = ITEMS.register("large_chequered_carpet_white_and_light_gray", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_light_gray.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_magenta = ITEMS.register("large_chequered_carpet_white_and_magenta", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_magenta.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_orange = ITEMS.register("large_chequered_carpet_white_and_orange", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_orange.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_pink = ITEMS.register("large_chequered_carpet_white_and_pink", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_pink.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_purple = ITEMS.register("large_chequered_carpet_white_and_purple", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_purple.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_red = ITEMS.register("large_chequered_carpet_white_and_red", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_red.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_white_and_yellow = ITEMS.register("large_chequered_carpet_white_and_yellow", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_white_and_yellow.get(), new Item.Properties()));
	
	// Large double chequered
	
	public static final RegistryObject<Item> large_chequered_carpet_double_blue = ITEMS.register("large_chequered_carpet_double_blue", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_double_blue.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_double_gray = ITEMS.register("large_chequered_carpet_double_gray", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_double_gray.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_double_orange = ITEMS.register("large_chequered_carpet_double_orange", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_double_orange.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_double_yellow = ITEMS.register("large_chequered_carpet_double_yellow", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_double_yellow.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_double_pink = ITEMS.register("large_chequered_carpet_double_pink", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_double_pink.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_double_green = ITEMS.register("large_chequered_carpet_double_green", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_double_green.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_red_and_black = ITEMS.register("large_chequered_carpet_red_and_black", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_red_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_magenta_and_black = ITEMS.register("large_chequered_carpet_magenta_and_black", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_magenta_and_black.get(), new Item.Properties()));
	public static final RegistryObject<Item> large_chequered_carpet_purple_and_black = ITEMS.register("large_chequered_carpet_purple_and_black", 
			() -> new BlockItem(ModBlocks.large_chequered_carpet_purple_and_black.get(), new Item.Properties()));
	
	// Arcade
	
	public static final RegistryObject<Item> arcade_carpet_geometric = ITEMS.register("arcade_carpet_geometric", 
			() -> new BlockItem(ModBlocks.arcade_carpet_geometric.get(), new Item.Properties()));
	public static final RegistryObject<Item> arcade_carpet_patterned = ITEMS.register("arcade_carpet_patterned", 
			() -> new BlockItem(ModBlocks.arcade_carpet_patterned.get(), new Item.Properties()));
	public static final RegistryObject<Item> arcade_carpet_patterned_2 = ITEMS.register("arcade_carpet_patterned_2", 
			() -> new BlockItem(ModBlocks.arcade_carpet_patterned_2.get(), new Item.Properties()));
	public static final RegistryObject<Item> arcade_carpet_patterned_3 = ITEMS.register("arcade_carpet_patterned_3", 
			() -> new BlockItem(ModBlocks.arcade_carpet_patterned_3.get(), new Item.Properties()));
	public static final RegistryObject<Item> arcade_carpet_stars = ITEMS.register("arcade_carpet_stars", 
			() -> new BlockItem(ModBlocks.arcade_carpet_stars.get(), new Item.Properties()));
	
}
