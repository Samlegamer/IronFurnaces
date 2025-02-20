package ironfurnaces.items;

import ironfurnaces.IronFurnaces;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ItemXmas extends Item {


    public ItemXmas(Properties properties) {
        super(properties);
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("tooltip." + IronFurnaces.MOD_ID + ".xmas_right_click").setStyle(Style.EMPTY.applyFormat((TextFormatting.GRAY))));
        tooltip.add(new TranslationTextComponent("tooltip." + IronFurnaces.MOD_ID + ".xmas1").setStyle(Style.EMPTY.applyFormat((TextFormatting.GRAY))));
        tooltip.add(new TranslationTextComponent("tooltip." + IronFurnaces.MOD_ID + ".xmas2").setStyle(Style.EMPTY.applyFormat((TextFormatting.GRAY))));
    }

}
