package cl.prueba.physicsblocks.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabTutorial extends CreativeTabs {

    public CreativeTabTutorial(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        Item objItem = Items.EMERALD;
        ItemStack objStackItem = new ItemStack(objItem);
        return objStackItem;
    }
}
