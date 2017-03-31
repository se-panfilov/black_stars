package com.blackwings.store.store;

import com.blackwings.game.camera.Camera;
import com.blackwings.game.map.Map;
import com.blackwings.game.world.World;
import com.blackwings.game.world.WorldObjects;
import com.blackwings.store.action.Actions;

public class GlobalStore implements Store {

    //TODO (S.Panfilov) how about thread-safe singleton?
    //TODO (S.Panfilov) or we can go further with static class?

    //TODO (S.Panfilov) POJO demo
    public Actions state;
    public World world;
    public WorldObjects worldObjects;
    public Map map;
    public Camera camera;
    public Actions gamePlayState;

    public GlobalStore() {

    }

    @Override
    public GlobalStore clone() {
        return new GlobalStore();
    }
}
