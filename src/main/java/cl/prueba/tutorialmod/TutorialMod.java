package cl.prueba.tutorialmod;

import cl.prueba.tutorialmod.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import cl.prueba.tutorialmod.proxy.ProxyComun;
import cl.prueba.tutorialmod.tab.CreativeTabTutorial;

@Mod(modid = TutorialMod.MODID, name = TutorialMod.NAME, version = TutorialMod.VERSION)
public class TutorialMod {

    public static final String MODID = "tutorialmod";
    public static final String NAME = "Tutorial Mod";
    public static final String VERSION = "0.1";

    @SidedProxy(clientSide = "cl.prueba.tutorialmod.proxy.ProxyCliente", serverSide = "cl.prueba.tutorialmod.proxy.ProxyComun")
    public static ProxyComun proxy;

    @Mod.Instance
    public static TutorialMod instance;

    public static CreativeTabTutorial tabTutorial;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        tabTutorial = new CreativeTabTutorial(CreativeTabs.getNextID(), "tab_tutorial");

        ModItems.preInit();

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
