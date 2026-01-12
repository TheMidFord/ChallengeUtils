package malicedev.challengeutils;
import malicedev.challengeutils.blocklogic.BlockLogicBarrelWooden;
import malicedev.challengeutils.blocklogic.BlockLogicCrucible;
import malicedev.challengeutils.blocklogic.BlockLogicCrucibleUnfired;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;

import static malicedev.challengeutils.Main.blockId;
import static malicedev.challengeutils.Main.MOD_ID;

public class ModBlocks {
	private ModBlocks() {}
	public static Block BlockGravelGranite;
	public static Block BlockGravelBasalt;
	public static Block BlockGravelLimestone;
	public static Block BlockGravelPermafrost;
	public static Block BlockBarrelOak;
	public static Block BlockBarrelStone;
	public static Block BlockStoneDust;
	public static Block BlockCrucibleUnfired;
	public static Block BlockCrucible;

	public static void init() {
		BlockGravelGranite = new BlockBuilder(MOD_ID)
			.setBlockSound(BlockSounds.GRAVEL)
			.setHardness(0.6F)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.build("granite_gravel","granite_gravel",blockId++,(block) -> new BlockLogicGravel(block));

		BlockGravelBasalt = new BlockBuilder(MOD_ID)
			.setBlockSound(BlockSounds.GRAVEL)
			.setHardness(0.6F)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.build("basalt_gravel","basalt_gravel",blockId++,(block) -> new BlockLogicGravel(block));

		BlockGravelLimestone = new BlockBuilder(MOD_ID)
			.setBlockSound(BlockSounds.GRAVEL)
			.setHardness(0.6F)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.build("limestone_gravel","limestone_gravel",blockId++,(block) -> new BlockLogicGravel(block));

		BlockGravelPermafrost = new BlockBuilder(MOD_ID)
			.setBlockSound(BlockSounds.GRAVEL)
			.setHardness(0.6F)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.build("permafrost_gravel","permafrost_gravel",blockId++,(block) -> new BlockLogicGravel(block));


		BlockBarrelOak = new BlockBuilder(MOD_ID)
			.setBlockSound(BlockSounds.WOOD)
			.setHardness(1F)
			.build("barrel_oak","barrel_oak",blockId++,(block) -> new BlockLogicBarrelWooden(block, Material.wood));


		BlockBarrelStone = new BlockBuilder(MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1F)
			.build("barrel_stone","barrel_stone",blockId++,(block) -> new BlockLogic(block, Material.stone));

		BlockStoneDust = new BlockBuilder(MOD_ID)
			.setBlockSound(BlockSounds.SAND)
			.setHardness(0.6F)
			.build("stone_dust","stone_dust",blockId++, (block) -> new BlockLogicSand(block));
		BlockCrucibleUnfired= new BlockBuilder(MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setHardness(1F)
			.build("crucible_unfired","crucible_unfired",blockId++, (block) -> new BlockLogicCrucibleUnfired(block, Material.clay));
		BlockCrucible= new BlockBuilder(MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setHardness(1F)
			.build("crucible_fired","crucible_fired",blockId++, (block) -> new BlockLogicCrucible(block, Material.stone));

	}
}
