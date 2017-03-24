package com.blackwings.store.state;

import com.blackwings.game.camera.Camera;
import com.blackwings.game.map.Map;
import com.blackwings.game.world.World;
import com.blackwings.game.world.WorldObjects;
import com.blackwings.store.type.GameStateTypes;

public class GlobalState implements State {

    //TODO (S.Panfilov) how about thread-safe singleton?
    //TODO (S.Panfilov) or wecan go further with static class?

    //TODO (S.Panfilov) POJO demo
    public GameStateTypes state;
    public World world;
    public WorldObjects worldObjects;
    public Map map;
    public Camera camera;
    public GameStateTypes gamePlayState;

    public GlobalState() {

    }

    @Override
    public GlobalState clone() {
        return new GlobalState();
    }
}
