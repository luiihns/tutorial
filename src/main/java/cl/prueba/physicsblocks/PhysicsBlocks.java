package cl.prueba.physicsblocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import cl.prueba.physicsblocks.proxy.ProxyComun;
import cl.prueba.physicsblocks.tab.CreativeTabTutorial;

@Mod(modid = PhysicsBlocks.MODID, name = PhysicsBlocks.NAME, version = PhysicsBlocks.VERSION)
public class PhysicsBlocks {

    public static final String MODID = "physicsblocks";
    public static final String NAME = "Physics Blocks";
    public static final String VERSION = "0.1";

    @SidedProxy(clientSide = "cl.prueba.physicsblocks.proxy.ProxyCliente", serverSide = "cl.prueba.physicsblocks.proxy.ProxyComun")
    public static ProxyComun proxy;

    @Mod.Instance
    public static PhysicsBlocks instance;

    public static CreativeTabTutorial tabTutorial;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        tabTutorial = new CreativeTabTutorial(CreativeTabs.getNextID(), "tab_tutorial");

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){

        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

        proxy.postInit(event);
    }
}
