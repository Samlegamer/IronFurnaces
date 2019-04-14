package ironfurnaces.mod.container.slot;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;

public class SlotIronFurnaceInput extends Slot {

	public SlotIronFurnaceInput(IInventory inventoryIn, int index, int xPosition, int yPosition) {
		super(inventoryIn, index, xPosition, yPosition);
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		return FurnaceRecipes.instance().getSmeltingResult(stack) != ItemStack.EMPTY;
	}
	
}
