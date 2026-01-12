package malicedev.challengeutils.mixin;

import malicedev.challengeutils.ModBlocks;
import net.minecraft.core.block.BlockLogicCobble;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.IItemConvertible;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.Supplier;

@Mixin(value = BlockLogicCobble.class, remap = false)
public class BlockLogicCobbleMixin {
	@Shadow
	@Final
	private @Nullable Supplier<? extends IItemConvertible> crushDrop;

	@Inject(method = "getBreakResult", at = @At(value = "HEAD"), cancellable = true)
		private void CustomGravel(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity, CallbackInfoReturnable<ItemStack[]> cir) {
		BlockLogicCobble blocklogiccobbleid = (BlockLogicCobble) (Object) this;
		if (dropCause == EnumDropCause.PISTON_CRUSH && Blocks.COBBLE_BASALT.id() == blocklogiccobbleid.id()) {
			cir.setReturnValue(new ItemStack[]{ModBlocks.BlockGravelBasalt.getDefaultStack()});
		}
		if (dropCause == EnumDropCause.PISTON_CRUSH && Blocks.COBBLE_GRANITE.id() == blocklogiccobbleid.id()) {
			cir.setReturnValue(new ItemStack[]{ModBlocks.BlockGravelGranite.getDefaultStack()});
		}
		if (dropCause == EnumDropCause.PISTON_CRUSH && Blocks.COBBLE_LIMESTONE.id() == blocklogiccobbleid.id()) {
			cir.setReturnValue(new ItemStack[]{ModBlocks.BlockGravelLimestone.getDefaultStack()});
		}
		if (dropCause == EnumDropCause.PISTON_CRUSH && Blocks.COBBLE_PERMAFROST.id() == blocklogiccobbleid.id()) {
			cir.setReturnValue(new ItemStack[]{ModBlocks.BlockGravelPermafrost.getDefaultStack()});
		}
	}
}



