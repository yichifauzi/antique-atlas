package folk.sisby.antique_atlas.api.client;

import folk.sisby.antique_atlas.api.TileAPI;
import folk.sisby.antique_atlas.client.TileRenderIterator;
import folk.sisby.antique_atlas.util.Rect;
import net.minecraft.world.World;

public interface ClientTileAPI extends TileAPI {
    TileRenderIterator getTiles(World world, int atlasID, Rect scope, int step);
}
