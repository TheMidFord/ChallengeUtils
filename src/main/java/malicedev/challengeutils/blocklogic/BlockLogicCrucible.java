package malicedev.challengeutils.blocklogic;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.WorldSource;

public class BlockLogicCrucible extends BlockLogic {


	public BlockLogicCrucible(Block<?> block, Material material) {
		super(block, material);

    }

    @Override
	public boolean renderAsNormalBlockOnCondition(WorldSource world, int x, int y, int z) {
		return false;
	}

	@Override
	public boolean isSolidRender() {
		return false;
    }
}
