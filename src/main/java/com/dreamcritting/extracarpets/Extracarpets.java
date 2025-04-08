package com.dreamcritting.extracarpets;

import com.dreamcritting.extracarpets.init.ModBlocks;
import com.dreamcritting.extracarpets.init.ModCreativeTabs;
import com.dreamcritting.extracarpets.init.ModItems;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Extracarpets.MOD_ID)
public class Extracarpets
{
    public static final String MOD_ID = "extracarpets";
  
    public Extracarpets()
    {
        MinecraftForge.EVENT_BUS.register(this);
    	IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	ModBlocks.BLOCKS.register(modEventBus);
     	ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus);

    }
}
