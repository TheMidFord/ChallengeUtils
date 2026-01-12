package malicedev.challengeutils;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;

import java.io.IOException;
import java.net.URISyntaxException;

public class ChallengeUtilsClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		try {
			TextureRegistry.initializeAllFiles(Main.MOD_ID, TextureRegistry.blockAtlas, true);
			TextureRegistry.initializeAllFiles(Main.MOD_ID, TextureRegistry.itemAtlas, true);
			TextureRegistry.initializeAllFiles(Main.MOD_ID, TextureRegistry.artAtlas, true);
			TextureRegistry.initializeAllFiles(Main.MOD_ID, TextureRegistry.particleAtlas, true);
		} catch (URISyntaxException | IOException e) {
			throw new RuntimeException(e);
		}

	}
}
