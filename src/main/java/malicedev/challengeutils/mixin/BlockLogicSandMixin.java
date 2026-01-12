package malicedev.challengeutils.mixin;


import malicedev.challengeutils.ModBlocks;
import net.minecraft.core.block.*;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.IItemConvertible;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = BlockLogicSand.class, remap = false)
public abstract class BlockLogicSandMixin extends BlockLogic {

	public BlockLogicSandMixin(Block<?> block, Material material) {
		super(block, material);

	}


	public ItemStack @Nullable [] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
		BlockLogicSand blocklogicsandid = (BlockLogicSand) (Object) this;
		if (dropCause == EnumDropCause.PISTON_CRUSH && Blocks.SAND.id() == blocklogicsandid.id()) {
			return(new ItemStack[]{ModBlocks.BlockStoneDust.getDefaultStack()});
		} else
			return super.getBreakResult(world, dropCause, meta, tileEntity);


	}
}
