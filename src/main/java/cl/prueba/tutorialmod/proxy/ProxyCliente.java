package cl.prueba.tutorialmod.proxy;

import cl.prueba.tutorialmod.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ProxyCliente extends ProxyComun {

    @Override
    public void preInit(FMLPreInitializationEvent event) {



    }

    @Override
    public void init(FMLInitializationEvent event) {

        ModItems.registerRenders();

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
