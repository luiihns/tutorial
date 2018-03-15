package cl.prueba.tutorialmod.item;

import cl.prueba.tutorialmod.TutorialMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModItems {

    public static Item tutorialItem;

    public static void preInit() {

        tutorialItem = new ItemTutorialItem(EnumHelper.addToolMaterial("TUTORIAL", 3, 100, 8.0F, 10.0F,30),"tutorial_item");

        registerItems();
    }

    public static void registerItems() {

        //GameRegistry.register(tutorialItem, new ResourceLocation(TutorialMod.MODID, "tutorial_item"));
        tutorialItem.setRegistryName(new ResourceLocation(TutorialMod.MODID, "tutorial_item"));
        ForgeRegistries.ITEMS.register(tutorialItem);

    }

    public static void registerRenders() {

        registerRender(tutorialItem);

    }

    public static void registerRender(Item objItem) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(objItem,0, new ModelResourceLocation(TutorialMod.MODID + ":" + objItem.getUnlocalizedName().substring(5), "inventory"));

    }

}
