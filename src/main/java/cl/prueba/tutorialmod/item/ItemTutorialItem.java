package cl.prueba.tutorialmod.item;

import cl.prueba.tutorialmod.TutorialMod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemTutorialItem extends ItemSword {

    public ItemTutorialItem(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(TutorialMod.tabTutorial);
        //setMaxStackSize(1);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        if (worldIn.isRemote) {
            //playerIn.addChatComponentMessage(new TextComponentString("Right clicked"));
            playerIn.sendMessage(new TextComponentString("Right clicked"));
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if (worldIn.getBlockState(pos).getBlock() == Blocks.GRASS) {
            worldIn.setBlockState(pos, Blocks.DIAMOND_BLOCK.getDefaultState());
            return EnumActionResult.SUCCESS;
        }

        return EnumActionResult.PASS;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {

        tooltip.add("Item tooltip");

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {

        return EnumRarity.EPIC;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
