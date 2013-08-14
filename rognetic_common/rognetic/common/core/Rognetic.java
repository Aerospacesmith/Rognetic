package rognetic.common.core;

import rognetic.common.items.Items;
import rognetic.common.items.ModItems;
import rognetic.common.util.network.PacketHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION,

/* %------------CERTIFICATE-SUM-----------% */
dependencies = 		"required-after:Forge@[6.5.0.0,);" +
					"required-after:BuildCraft|Core;" +
					"required-after:BuildCraft|Transport;" +
					"required-after:BuildCraft|Builders;" +
					"required-after:BuildCraft|Silicon;" +
					"after:IC2;" +
					"after:Forestry;" +
					"after:Thaumcraft;" +
					"after:CCTurtle;" +
					"after:ComputerCraft;" +
					"after:factorization;" +
					"after:GregTech_Addon;" +
					"after:AppliedEnergistics;" +
					"after:ThermalExpansion;" +
					"after:BetterStorage")


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
        	ModItems.init();
        	
        	proxy.registerSounds();
            proxy.registerRenderers();
        }
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
        	ModItems.init();
        	Items.addNames();        
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}