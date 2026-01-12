package malicedev.challengeutils;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.core.util.helper.Side;
import org.useless.DragonFly;
import org.useless.dragonfly.models.block.BlockModelDFJava;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

public class ModModels implements ModelEntrypoint {

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
			ModelHelper.setBlockModel(ModBlocks.BlockGravelGranite, () ->
				new BlockModelStandard<>(ModBlocks.BlockGravelGranite)
					.setTex(0, "challengeutils:block/gravels/granite_gravel", Side.sides)
			);

		ModelHelper.setBlockModel(ModBlocks.BlockGravelBasalt, () ->
			new BlockModelStandard<>(ModBlocks.BlockGravelBasalt)
				.setTex(0, "challengeutils:block/gravels/basalt_gravel", Side.sides)
		);

		ModelHelper.setBlockModel(ModBlocks.BlockGravelLimestone, () ->
			new BlockModelStandard<>(ModBlocks.BlockGravelLimestone)
				.setTex(0, "challengeutils:block/gravels/limestone_gravel", Side.sides)
		);

		ModelHelper.setBlockModel(ModBlocks.BlockGravelPermafrost, () ->
			new BlockModelStandard<>(ModBlocks.BlockGravelPermafrost)
				.setTex(0, "challengeutils:block/gravels/permafrost_gravel", Side.sides)
		);
		ModelHelper.setBlockModel(ModBlocks.BlockStoneDust, () ->
			new BlockModelStandard<>(ModBlocks.BlockStoneDust)
				.setTex(0, "challengeutils:block/dusts/stone_dust", Side.sides)
		);
		ModelHelper.setBlockModel(ModBlocks.BlockBarrelOak, ()->
			new BlockModelDFJava<>(ModBlocks.BlockBarrelOak, DragonFly.loadBlockModel("challengeutils:block/barrel"))
		);
		ModelHelper.setBlockModel(ModBlocks.BlockBarrelStone, ()->
			new BlockModelDFJava<>(ModBlocks.BlockBarrelStone, DragonFly.loadBlockModel("challengeutils:block/barrel_stone"))
		);
		ModelHelper.setBlockModel(ModBlocks.BlockCrucibleUnfired, ()->
			new BlockModelDFJava<>(ModBlocks.BlockCrucibleUnfired, DragonFly.loadBlockModel("challengeutils:block/crucible_raw"))
		);
		ModelHelper.setBlockModel(ModBlocks.BlockCrucible, ()->
			new BlockModelDFJava<>(ModBlocks.BlockCrucible, DragonFly.loadBlockModel("challengeutils:block/crucible"))
		);
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
