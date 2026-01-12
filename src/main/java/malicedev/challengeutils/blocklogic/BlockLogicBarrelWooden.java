package malicedev.challengeutils.blocklogic;

import malicedev.challengeutils.tileentities.TileEntityWoodenBarrel;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.material.Material;

public class BlockLogicBarrelWooden extends BlockLogic {
	public BlockLogicBarrelWooden(Block<?> block, Material material) {
		super(block, material);
		block.withEntity(TileEntityWoodenBarrel::new);
	}
}
