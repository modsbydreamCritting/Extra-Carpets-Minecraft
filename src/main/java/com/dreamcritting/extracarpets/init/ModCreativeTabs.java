package com.dreamcritting.extracarpets.init;

import com.dreamcritting.extracarpets.Extracarpets;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Extracarpets.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Extracarpets.MOD_ID);
	
    public static final RegistryObject<CreativeModeTab> EXTRA_CARPETS = TABS.register("extra_carpets",
			() -> CreativeModeTab.builder()
			        .title(Component.translatable("itemGroup.extra_carpets"))
			        .icon(ModItems.chequered_carpet_double_blue.get()::getDefaultInstance)
			        .displayItems((displayPerams, output) -> {
			        	
			        	// Misc
			        	
			        	output.accept(ModItems.patterned_carpet_hazard.get());
			        	output.accept(ModItems.patterned_carpet_sonic_boom.get());
			        	output.accept(ModItems.patterned_carpet_red_skulls.get());
			        	output.accept(ModItems.patterned_carpet_gray_skulls.get());
			        	output.accept(ModItems.patterned_carpet_purple_skulls.get());
			        	output.accept(ModItems.patterned_carpet_normal.get());
			        	output.accept(ModItems.patterned_carpet_chess.get());
			        	output.accept(ModItems.patterned_carpet_comedy.get());
			        	output.accept(ModItems.patterned_carpet_geometry_dash.get());
			        	output.accept(ModItems.patterned_carpet_waves.get());
			        	output.accept(ModItems.patterned_carpet_red_heart_on_black.get());
			        	output.accept(ModItems.patterned_carpet_pink_heart_on_black.get());
			        	output.accept(ModItems.patterned_carpet_pink_heart_on_red.get());
			        	output.accept(ModItems.patterned_carpet_red_pinwheel.get());
			        	output.accept(ModItems.patterned_carpet_green_pinwheel.get());
			        	output.accept(ModItems.patterned_carpet_light_blue_and_magenta_pinwheel.get());
			        	output.accept(ModItems.patterned_carpet_dotted_ring_blue_and_black.get());
			        	output.accept(ModItems.patterned_carpet_dotted_ring_red_and_black.get());
			        	output.accept(ModItems.patterned_carpet_dotted_ring_purple_and_black.get());
			        	
		        	// Dimension
			        	
			        	output.accept(ModItems.dimension_carpet_end.get());
			        	output.accept(ModItems.dimension_carpet_overworld.get());
			        	output.accept(ModItems.dimension_carpet_nether.get());
			        	output.accept(ModItems.dimension_carpet_eden.get());
			        	output.accept(ModItems.dimension_carpet_apalachia.get());
			        	output.accept(ModItems.dimension_carpet_wildwood.get());
			        	output.accept(ModItems.dimension_carpet_skythern.get());
			        	output.accept(ModItems.dimension_carpet_twilight_forest.get());
			        	output.accept(ModItems.dimension_carpet_shadowlands.get());
			        	output.accept(ModItems.dimension_carpet_glowshroom_forest.get());
			        	output.accept(ModItems.dimension_carpet_blood_forest.get());
			        	output.accept(ModItems.dimension_carpet_vellium.get());
			        	
			        	// Spiral
			        	
			            output.accept(ModItems.spiral_carpet_white_and_black.get());
			        	output.accept(ModItems.spiral_carpet_white_and_blue.get());
			        	output.accept(ModItems.spiral_carpet_white_and_brown.get());
			        	output.accept(ModItems.spiral_carpet_white_and_cyan.get());
			        	output.accept(ModItems.spiral_carpet_white_and_gray.get());
			        	output.accept(ModItems.spiral_carpet_white_and_green.get());
			        	output.accept(ModItems.spiral_carpet_white_and_light_blue.get());
			        	output.accept(ModItems.spiral_carpet_white_and_light_gray.get());
			        	output.accept(ModItems.spiral_carpet_white_and_lime.get());
			        	output.accept(ModItems.spiral_carpet_white_and_magenta.get());
			        	output.accept(ModItems.spiral_carpet_white_and_orange.get());
			        	output.accept(ModItems.spiral_carpet_white_and_pink.get());
			        	output.accept(ModItems.spiral_carpet_white_and_purple.get());
			        	output.accept(ModItems.spiral_carpet_white_and_red.get());
			        	output.accept(ModItems.spiral_carpet_white_and_yellow.get());
			        	output.accept(ModItems.spiral_carpet_red_and_black.get());
			        	output.accept(ModItems.spiral_carpet_double_green.get());
			        	output.accept(ModItems.spiral_carpet_double_gray.get());
			        	output.accept(ModItems.spiral_carpet_double_orange.get());
			        	output.accept(ModItems.spiral_carpet_double_yellow.get());
			        	output.accept(ModItems.spiral_carpet_double_pink.get());
			        	output.accept(ModItems.spiral_carpet_double_blue.get());
			        	output.accept(ModItems.spiral_carpet_magenta_and_black.get());
			        	output.accept(ModItems.spiral_carpet_purple_and_black.get());
			        	
			        	// Chequered
			        	
			            output.accept(ModItems.chequered_carpet_white_and_black.get());
			        	output.accept(ModItems.chequered_carpet_white_and_blue.get());
			        	output.accept(ModItems.chequered_carpet_white_and_brown.get());
			        	output.accept(ModItems.chequered_carpet_white_and_cyan.get());
			        	output.accept(ModItems.chequered_carpet_white_and_gray.get());
			        	output.accept(ModItems.chequered_carpet_white_and_green.get());
			        	output.accept(ModItems.chequered_carpet_white_and_light_blue.get());
			        	output.accept(ModItems.chequered_carpet_white_and_light_gray.get());
			        	output.accept(ModItems.chequered_carpet_white_and_lime.get());
			        	output.accept(ModItems.chequered_carpet_white_and_magenta.get());
			        	output.accept(ModItems.chequered_carpet_white_and_orange.get());
			        	output.accept(ModItems.chequered_carpet_white_and_pink.get());
			        	output.accept(ModItems.chequered_carpet_white_and_purple.get());
			        	output.accept(ModItems.chequered_carpet_white_and_red.get());
			        	output.accept(ModItems.chequered_carpet_white_and_yellow.get());
			        	output.accept(ModItems.chequered_carpet_red_and_black.get());
			        	output.accept(ModItems.chequered_carpet_double_green.get());
			        	output.accept(ModItems.chequered_carpet_double_gray.get());
			        	output.accept(ModItems.chequered_carpet_double_orange.get());
			        	output.accept(ModItems.chequered_carpet_double_yellow.get());
			        	output.accept(ModItems.chequered_carpet_double_pink.get());
			        	output.accept(ModItems.chequered_carpet_double_blue.get());
			        	output.accept(ModItems.chequered_carpet_magenta_and_black.get());
			        	output.accept(ModItems.chequered_carpet_purple_and_black.get());
			        				        	
			        	// Diamond
			        	
			            output.accept(ModItems.diamond_carpet_white_and_black.get());
			        	output.accept(ModItems.diamond_carpet_white_and_blue.get());
			        	output.accept(ModItems.diamond_carpet_white_and_brown.get());
			        	output.accept(ModItems.diamond_carpet_white_and_cyan.get());
			        	output.accept(ModItems.diamond_carpet_white_and_gray.get());
			        	output.accept(ModItems.diamond_carpet_white_and_green.get());
			        	output.accept(ModItems.diamond_carpet_white_and_light_blue.get());
			        	output.accept(ModItems.diamond_carpet_white_and_light_gray.get());
			        	output.accept(ModItems.diamond_carpet_white_and_lime.get());
			        	output.accept(ModItems.diamond_carpet_white_and_magenta.get());
			        	output.accept(ModItems.diamond_carpet_white_and_orange.get());
			        	output.accept(ModItems.diamond_carpet_white_and_pink.get());
			        	output.accept(ModItems.diamond_carpet_white_and_purple.get());
			        	output.accept(ModItems.diamond_carpet_white_and_red.get());
			        	output.accept(ModItems.diamond_carpet_white_and_yellow.get());
			        	output.accept(ModItems.diamond_carpet_red_and_black.get());
			        	output.accept(ModItems.diamond_carpet_double_green.get());
			        	output.accept(ModItems.diamond_carpet_double_gray.get());
			        	output.accept(ModItems.diamond_carpet_double_orange.get());
			        	output.accept(ModItems.diamond_carpet_double_yellow.get());
			        	output.accept(ModItems.diamond_carpet_double_pink.get());
			        	output.accept(ModItems.diamond_carpet_double_blue.get());
			        	output.accept(ModItems.diamond_carpet_magenta_and_black.get());
			        	output.accept(ModItems.diamond_carpet_purple_and_black.get());
			        	
			        	// Chequered
			        	
			        	output.accept(ModItems.large_chequered_carpet_white_and_black.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_blue.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_brown.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_cyan.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_gray.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_green.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_light_blue.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_light_gray.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_lime.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_magenta.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_orange.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_pink.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_purple.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_red.get());
			        	output.accept(ModItems.large_chequered_carpet_white_and_yellow.get());
			        	output.accept(ModItems.large_chequered_carpet_red_and_black.get());
			        	output.accept(ModItems.large_chequered_carpet_double_green.get());
			        	output.accept(ModItems.large_chequered_carpet_double_gray.get());
			        	output.accept(ModItems.large_chequered_carpet_double_orange.get());
			        	output.accept(ModItems.large_chequered_carpet_double_yellow.get());
			        	output.accept(ModItems.large_chequered_carpet_double_pink.get());
			        	output.accept(ModItems.large_chequered_carpet_double_blue.get());
			        	output.accept(ModItems.large_chequered_carpet_magenta_and_black.get());
			        	output.accept(ModItems.large_chequered_carpet_purple_and_black.get());
			        	
			        	// Arcade
			        	
			        	output.accept(ModItems.arcade_carpet_geometric.get());
			        	output.accept(ModItems.arcade_carpet_stars.get());
			        	output.accept(ModItems.arcade_carpet_patterned.get());
			        	output.accept(ModItems.arcade_carpet_patterned_2.get());
			        	output.accept(ModItems.arcade_carpet_patterned_3.get());
	 })
		 .build());
	@SubscribeEvent
	public static void buildContents(BuildCreativeModeTabContentsEvent event) {
		
	}
}