package rognetic.common.core;

import rognetic.common.items.Items;
import rognetic.common.util.network.PacketHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)
@NetworkMod(channels = ModInformation.CHANNEL, clientSideRequired=true, serverSideRequired=false, packetHandler = PacketHandler.class)
public class Rognetic {

        // The instance of your mod that Forge uses.
        @Instance(ModInformation.ID)
        public static Rognetic instance;
       
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="rognetic.client.ClientProxy", serverSide="rognetic.common.core.CommonProxy")
        public static CommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	ConfigHandler.init(event.getSuggestedConfigurationFile());
        	Items.init();
        	
        	proxy.registerSounds();
            proxy.registerRenderers();
        }
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
        	Items.addNames();        
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}