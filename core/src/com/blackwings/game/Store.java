package com.blackwings.game;

import com.blackwings.game.map.Map;
import com.blackwings.game.world.WorldObjects;

class Store {
    private static com.blackwings.game.state.GamePlayState state;
    private static com.blackwings.game.world.World world;
    private static com.blackwings.game.world.WorldObjects worldObjects;
    private static Map map;
    private static com.blackwings.game.camera.Camera camera;

    static com.blackwings.game.state.GamePlayState getState() {
        return state;
    }

    static com.blackwings.game.world.World getWorld() {
        return world;
    }

    static void setWorld(com.blackwings.game.world.World world) {
        Store.world = world;
    }

    static com.blackwings.game.world.WorldObjects getWorldObjects() {
        return worldObjects;
    }

    static void setWorldObjects(WorldObjects worldObjects) {
        Store.worldObjects = worldObjects;
    }

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
        Store.map = map;
    }

    public static com.blackwings.game.camera.Camera getCamera() {
        return camera;
    }

    public static void setCamera(com.blackwings.game.camera.Camera camera) {
        Store.camera = camera;
    }
}
